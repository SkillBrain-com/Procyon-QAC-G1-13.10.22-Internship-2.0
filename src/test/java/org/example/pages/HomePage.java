package org.example.pages;

import org.example.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "[data-test='nav-sign-in']")
    private WebElement signInLink;

    public HomePage(TestContext context) {
        super(context.driver);
    }

    public void navigateToSignIn() {
        signInLink.click();
    }
}
