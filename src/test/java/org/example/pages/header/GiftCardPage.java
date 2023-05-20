package org.example.pages.header;

import org.example.TestContext;
import org.example.pages.BasePage;
import org.example.utils.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.picocontainer.annotations.Inject;

public class GiftCardPage extends BasePage {

    @Inject
    LanguagesTogglePage languagesTogglePage;

    @Inject
    GiftCardPage giftCardPage;

    public GiftCardPage(TestContext context){
        super(context.driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/header/div[2]/div[1]/a/span")
    WebElement giftCardIcon;

    public void giftCardDisplayedOnHeader(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotGiftCardDisplayedOnHeader");
    }

    public void clickOnGiftCard(){
        giftCardIcon.click();
    }

    public void giftCardLandingPageDisplayed(){
        Assertions.assertEquals(driver.getCurrentUrl(), "https://pl-galeria-warminska-uat.azurewebsites.net/en/gift-card",
                "The user is not on GiftCard landing page!");
    }
}