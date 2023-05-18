package org.example.pages.header;

import org.example.TestContext;
import org.example.pages.BasePage;

public class NavigateToHomePage extends BasePage {

    public NavigateToHomePage(TestContext context){
        super(context.driver);
    }

    String URL = "https://pl-galeria-warminska-uat.azurewebsites.net";

    public void navigateToHomePage(){
        driver.get(URL);
    }
}