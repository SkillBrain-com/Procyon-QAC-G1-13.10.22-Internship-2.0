package org.example.pages;

import org.example.TestContext;
import org.example.utils.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class InspirationsPage extends BasePage {

    JavascriptExecutor js;

    public InspirationsPage(TestContext context){
        super(context.driver);
    }

    @FindBy (xpath = "//div[@class='flex lg:flex-row flex-col w-full']/ul/li[7]")
    WebElement inspirationsSection;

    @FindBy(css = "a[href='/en/inspiration/house-insp']")
    WebElement inspirationArticle;

    public void noticeTheTopOfThePage(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotAtTheTopOfThePage");
    }

    public void inspirationsSectionIsDisplayedOnNavigationMenu(){
        Assertions.assertTrue(inspirationsSection.isDisplayed(), "Inspirations section is not displayed on the navigation menu!");
        System.out.println("Present of Inspirations section on navigation menu was successfully checked!");
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotAtTheTopOfThePage");
    }

    public void hoverOverInspirationFromNavigationMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(inspirationsSection).perform();
    }

    public void seeDropdownListInspiration(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotDropdownListInspirationsSubcategories");
    }

    public void clickOnInspirationFromNavigationMenu(){
        inspirationsSection.click();
    }

    public void accessToInspirationPage(){
        Assertions.assertEquals(driver.getCurrentUrl(), "https://pl-galeria-warminska-uat.azurewebsites.net/en/inspiration",
                "The user is not on Inspiration Page!");
        System.out.println("The redirection to the Inspiration page was successfully checked!");
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotInspirationPage");
    }

    public void navigateToInspirationPage(){
        String urlInspirationPage = "https://pl-galeria-warminska-uat.azurewebsites.net/en/inspiration";
        driver.get(urlInspirationPage);
    }

    public void scrolldownOnPage(int pixels){
        js.executeScript("window.scrollBy(0, "+pixels+");");
    }

    public void clickOnInspirationArticle(){
        inspirationArticle.click();
    }

    public void seeInspirationArticlesAsACarousel(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotInspirationArticlesCarousel");
    }

    public void accessInspirationArticlePage(){
        Assertions.assertEquals(driver.getCurrentUrl(), "https://pl-galeria-warminska-uat.azurewebsites.net/en/inspiration/house-insp",
                "The user is not on the Inspiration article page!");
        System.out.println("The redirection to the Inspiration article page was successfully checked!");
    }
}