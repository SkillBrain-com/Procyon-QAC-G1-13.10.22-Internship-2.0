package org.example.steps.header;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.header.CookiesPage;
import org.example.pages.header.NavigateToHomePage;
import org.example.properties.Environment;
import org.picocontainer.annotations.Inject;

public class CookiesSteps {
    @Inject
    CookiesPage cookiesPage;

    @Inject
    NavigateToHomePage navigateToHomePage;

    @Given("I am on the https://pl-galeria-warminska-uat.azurewebsites.net website")
    public void i_am_on_the_website(){
//        navigateToHomePage.navigateToHomePage(Environment.getProperties().url());
        navigateToHomePage.navigateToHomePage();
    }

    @When("The cookies are displaying and I accept them")
    public void cookies_are_displaying_and_I_accept_them(){
        cookiesPage.acceptCookies();
    }

    @Then("Next, the page should be available for searching")
    public void page_should_be_available_for_searching(){
        cookiesPage.pageAvailableForSearching();
    }
}