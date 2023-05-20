package org.example.steps.header;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.header.CookiesPage;
import org.example.pages.header.VisibleHeaderOnWebsitePage;
import org.example.properties.Environment;
import org.picocontainer.annotations.Inject;

public class HeaderSteps {
    @Inject
    CookiesPage cookiesPage;

    @Inject
    VisibleHeaderOnWebsitePage visibleHeaderOnWebsitePage;

    @When("I notice the top of the page")
    public void i_notice_the_top_of_the_page(){
        visibleHeaderOnWebsitePage.noticeTheTopOfThePage();
    }
    @Then("The header should be displayed at the top on the page")
    public void header_should_be_displayed_at_the_top_on_the_page(){
        visibleHeaderOnWebsitePage.headerIsDisplayedOnWebsite();
    }

    @When("I am scrolling down on the page")
    public void I_am_scrolling_down_on_the_page(){
        visibleHeaderOnWebsitePage.scrollDownOnPage(500);
    }

    @Then("I should see that the header is keeping sticked at the top of the page while I am scrolling down on the page")
    public void I_should_see_that_the_header_is_keeping_sticked_at_the_top_of_the_page_while_I_am_scrolling_down_on_the_page(){
        visibleHeaderOnWebsitePage.headerKeepsStickedOnPage();
    }
}