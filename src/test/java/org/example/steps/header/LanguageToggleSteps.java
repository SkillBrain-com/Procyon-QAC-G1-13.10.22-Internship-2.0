package org.example.steps.header;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.header.LanguagesTogglePage;
import org.picocontainer.annotations.Inject;

public class LanguageToggleSteps {

    @Inject
    LanguagesTogglePage languagesTogglePage;

    @When("I notice the top left of the page")
    public void I_notice_the_top_left_of_the_page(){
        languagesTogglePage.noticeTheTopLeftOfTheHeader();
    }

    @Then("The languages toggle icon should be displayed on the header")
    public void the_languages_toggle_icon_should_be_displayed_on_the_header(){
        languagesTogglePage.languagesToggleIconDisplayedOnHeader();
    }

    @When("Click on languages toggle")
    public void click_on_languages_toggle(){
        languagesTogglePage.clickOnLanguagesToggle();
    }

    @When("Choose Polish language")
    public void choose_Polish_language(){
        languagesTogglePage.setPolishLanguageOnPage();
    }

    @Then("The content of page should be displayed in Polish language")
    public void the_content_of_page_should_be_displayed_in_Polish_language(){
        languagesTogglePage.contentDisplayedInPolish();
    }

    @When("Choose English language")
    public void choose_English_language(){
        languagesTogglePage.setEnglishLanguageOnPage();
    }

    @Then("The content of page should be displayed in English language")
    public void the_content_of_page_should_be_displayed_in_English_language(){
        languagesTogglePage.contentDisplayedInEnglish();
    }
}