package org.example.steps.header;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.header.StickyBarPage;
import org.picocontainer.annotations.Inject;

public class StickyBarSteps {

    @Inject
    StickyBarPage stickyBarPage;

    @When("I notice the header displayed on the web page")
    public void notice_the_header_displayed_on_the_web_page(){
        stickyBarPage.noticeHeader();
    }

    @When("The sticky bar should be located below the rest of the header components on the web page")
    public void the_sticky_bar_should_be_located_below_the_rest_of_the_header_components_on_the_web_page(){
        stickyBarPage.checkIsStickyBarIsVisibleOnWebsite();
    }

    @When("I click on the sticky bar")
    public void i_click_on_the_sticky_bar(){
        stickyBarPage.clickOnStickyBar();
    }

    @Then("A new page should be open on the same tab")
    public void a_new_page_should_be_open_on_the_same_tab(){
        stickyBarPage.checkIfNewTabIsOpenWhenStikyBarIsClicked();
    }
}