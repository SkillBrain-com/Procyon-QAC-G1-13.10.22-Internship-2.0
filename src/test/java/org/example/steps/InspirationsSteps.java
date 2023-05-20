package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.InspirationsPage;
import org.example.pages.header.CookiesPage;
import org.example.properties.Environment;
import org.example.utils.FileUtils;
import org.picocontainer.annotations.Inject;

public class InspirationsSteps {

    @Inject
    InspirationsPage inspirationsPage;

    @Inject
    CookiesPage cookiesPage;

    @When("I notice the Inspirations section on the navigation menu, from the top of the page")
    public void i_notice_the_Inspirations_section_on_the_navigation_menu_from_the_top_of_the_page(){
        inspirationsPage.noticeTheTopOfThePage();
    }

    @Then("The Inspirations section should be displayed on the navigation menu, on header")
    public void inspirations_section_should_be_displayed_on_the_navigation_menu_on_header(){
        inspirationsPage.inspirationsSectionIsDisplayedOnNavigationMenu();
    }

    @When("I hover over the Inspirations section from navigation menu")
    public void i_hover_over_the_Inspirations_section_from_navigation_menu(){
        inspirationsPage.hoverOverInspirationFromNavigationMenu();
    }

    @Then("I should see the dropdown list with the subcategories of inspirational articles displayed")
    public void I_should_see_the_dropdown_list_with_the_subcategories_of_inspirational_articles_displayed(){
        inspirationsPage.seeDropdownListInspiration();
    }

    @When("I click on the Inspiration from the navigation menu")
    public void i_click_on_the_Inspiration_from_the_navigation_menu(){
        inspirationsPage.clickOnInspirationFromNavigationMenu();
    }

    @Then("Inspiration/Blog page is displayed with the inspiration subcategories fields and the inspirational articles published on website")
    public void inspirationPage_should_be_displayed_with_the_inspiration_subcategories_fields_and_the_inspirational_articles_published_on_website_in_a_new_tab(){
        inspirationsPage.accessToInspirationPage();
    }

    @Given("I am on the Inspiration Page")
    public void i_am_on_the_Inspiration_Page(){
        inspirationsPage.navigateToInspirationPage();
    }

//    @And("I am scrolling down on the page")
//    public void i_am_scrolling_down_on_the_page(){
//        inspirationsPage.scrolldownOnPage(500);
//    }

    @When("I see the inspiration articles section marked as promoted on the homepage and which are published as a carousel on the Inspiration page")
    public void i_see_the_inspiration_articles_section_marked_as_promoted_on_the_homepage_and_which_are_published_as_a_carousel_on_the_Inspiration_page(){
        inspirationsPage.seeInspirationArticlesAsACarousel();
    }

    @And("I click on one of the Inspiration articles")
    public void i_click_on_one_of_the_Inspiration_articles(){
        inspirationsPage.clickOnInspirationArticle();
    }

    @Then("The showcased page for the selected inspiration/blog article should be displayed in a new tab")
    public void the_showcased_page_for_the_selected_inspiration_article_should_be_displayed_in_a_new_tab(){
        inspirationsPage.accessInspirationArticlePage();
    }
}