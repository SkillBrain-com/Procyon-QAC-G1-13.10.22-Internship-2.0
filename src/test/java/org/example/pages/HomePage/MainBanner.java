package org.example.pages.HomePage;

import org.example.TestContext;
import org.example.pages.BasePage;
import org.openqa.selenium.WebElement;

public class MainBanner extends BasePage {

    WebElement mainBanner;


    public MainBanner(TestContext context){
        super(context.driver);
    }
}