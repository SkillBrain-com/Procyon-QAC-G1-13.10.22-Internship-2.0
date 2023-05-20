package org.example.pages.header;

import org.example.TestContext;
import org.example.pages.BasePage;
import org.example.utils.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CookiesPage extends BasePage {

    @FindBy(xpath = "//button[text()='Allow All Cookies']")
    WebElement cookies;

    public CookiesPage(TestContext context){
        super(context.driver);
    }

    public void navigateToURL(String url){
        driver.get(url);
    }

    public void acceptCookies(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement acceptCookies = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(cookies));
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotCookiesAreDisplayedOnWebsite");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptCookies);
        System.out.println("Accept cookies on the page!");
    }

    public void pageAvailableForSearching(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotPageAvailable");
    }
}