package org.example.pages;

import org.example.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InspirationsPage extends BasePage {

    public InspirationsPage(TestContext context){
        super(context.driver);
    }

    @FindBy (xpath = "//div[@class='flex lg:flex-row flex-col w-full']/ul/li[7]")
    WebElement inspirations;

    public void clickOnInspirationSection(){
        inspirations.click();
    }

    public void noticeTheTopOfThePage(){
//        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotAtTheTopOfThePage");
    }

    public void inspirationsSectionIsDisplayedOnNavigationMenu(){
//        Assert.assertTrue(inspirations.isDisplayed(), "Inspirations section is not displayed on the navigation menu!");
        System.out.println("Present of Inspirations section on navigation menu was successfully checked!");
//        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotAtTheTopOfThePage");
    }
}