package org.example.pages.header;

import org.example.TestContext;
import org.example.pages.BasePage;
import org.example.utils.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class LanguagesTogglePage extends BasePage {

    public LanguagesTogglePage(TestContext context){
        super(context.driver);
    }

    @FindBy(css = "button[name =\"language-toggle\"] ")
    WebElement languagesToggle;

    @FindBy(id = "headlessui-menu-item-:r1:")
    WebElement polishLanguage;

    @FindBy(css = ".py-1 .text-gray-700.block.px-4.py-2.text-sm.cursor-pointer:nth-child(2)")
    WebElement englishLanguage;

    public void noticeTheTopLeftOfTheHeader(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotTopLeftOfThePage");
    }

    public void languagesToggleIconDisplayedOnHeader(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotLanguagesToggleDisplayedOnHeader");
    }

    public void clickOnLanguagesToggle(){
        languagesToggle.click();
    }

    public void setPolishLanguageOnPage(){
        polishLanguage.click();
    }

    public void contentDisplayedInPolish(){
        Assertions.assertEquals(driver.getCurrentUrl(), "https://pl-galeria-warminska-uat.azurewebsites.net/",
                "Polish language was unsuccessfully set!");
        System.out.println("Polish language has been successfully set!");
    }

    public void setEnglishLanguageOnPage(){
        englishLanguage.click();
    }

    public void contentDisplayedInEnglish(){
        Assertions.assertEquals(driver.getCurrentUrl(), "https://pl-galeria-warminska-uat.azurewebsites.net/en",
                "English language was unsuccessfully set!");
        System.out.println("English language has been successfully set!");
    }
}