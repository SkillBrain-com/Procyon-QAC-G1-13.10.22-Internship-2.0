package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.InspirationsPage;
import org.example.pages.header.NavigateToHomePage;
import org.picocontainer.annotations.Inject;

public class InspirationsSteps {
    @Inject
    NavigateToHomePage navigateToHomePage;

    @Inject
    InspirationsPage inspirationsPage;

    @Given("I am on the https://pl-galeria-warminska-uat.azurewebsites.net website")
    public void i_am_on_the_website(){
        navigateToHomePage.navigateToHomePage();
    }

    @When("I notice the Inspirations section on the navigation menu, from the top of the page")
    public void i_notice_the_Inspirations_section_on_the_navigation_menu_from_the_top_of_the_page(){
        inspirationsPage.noticeTheTopOfThePage();
    }

    @Then("The Inspirations section should be displayed on the navigation menu, on header")
    public void inspirations_section_should_be_displayed_on_the_navigation_menu_on_header(){
        inspirationsPage.inspirationsSectionIsDisplayedOnNavigationMenu();
    }
}