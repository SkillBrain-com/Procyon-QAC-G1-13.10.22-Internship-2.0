package org.example.pages.header;

import org.example.TestContext;
import org.example.pages.BasePage;
import org.example.utils.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisibleHeaderOnWebsitePage extends BasePage {

    JavascriptExecutor js;

    public VisibleHeaderOnWebsitePage(TestContext context){
        super(context.driver);
    }

    @FindBy(css = ".relative.w-full.sticky.top-0.z-50.bg-white")
    WebElement header;

    public void noticeTheTopOfThePage(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotAtTheTopOfThePage");
    }

    public void headerIsDisplayedOnWebsite(){
        Assertions.assertTrue(header.isDisplayed(), "Header is not displayed on the website!");
        System.out.println("Present of header on website was successfully checked!");
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotHeaderIsDisplayedOnWebsite");
    }

    public void scrollDownOnPage(int pixels){
        js.executeScript("window.scrollBy(0, "+pixels+");");
    }

    public void headerKeepsStickedOnPage(){
        headerIsDisplayedOnWebsite();
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotHeaderKeepsStickedOnPage");
    }
}