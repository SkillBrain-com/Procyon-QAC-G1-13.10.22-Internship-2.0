package org.example.steps.header;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.header.GiftCardPage;
import org.example.pages.header.LanguagesTogglePage;
import org.example.utils.FileUtils;
import org.picocontainer.annotations.Inject;

public class GiftCardSteps {

    @Inject
    GiftCardPage giftCardPage;

    @Then("Gift card icon should be displayed on header")
    public void gift_card_icon_should_be_displayed_on_header(){
        giftCardPage.giftCardDisplayedOnHeader();
    }

    @When("I click on Gift card icon")
    public void clickOnGiftCard(){
        giftCardPage.clickOnGiftCard();
    }

    @Then("A new specific page to gift card landing page should be open")
    public void a_new_specific_page_to_gift_card_landing_page_should_be_open(){
        giftCardPage.giftCardLandingPageDisplayed();
    }
}