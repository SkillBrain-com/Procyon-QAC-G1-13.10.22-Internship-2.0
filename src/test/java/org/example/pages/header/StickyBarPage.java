package org.example.pages.header;

import org.example.TestContext;
import org.example.pages.BasePage;
import org.example.utils.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StickyBarPage extends BasePage {

    public StickyBarPage(TestContext context){
        super(context.driver);
    }

    @FindBy(css = ".flex.gap-8.justify-center.p-1")
    WebElement stickyBar;

    public void noticeHeader(){
        FileUtils.takeAScreenshot(driver, "\\src\\test\\java\\org\\example\\screenshotHeaderIsVisible");
    }

    public void checkIsStickyBarIsVisibleOnWebsite(){
        Assertions.assertTrue(stickyBar.isDisplayed(), "There is not any sticky bar located below the header!");
        System.out.println("Present of sticky bar on header was successfully checked!");
    }

    public void clickOnStickyBar(){
        stickyBar.click();
    }

    public void checkIfNewTabIsOpenWhenStikyBarIsClicked(){
        Assertions.assertEquals(driver.getCurrentUrl(), "https://galeria-warminska.pl/",
                "A new tab was not successfully open!");
        System.out.println("A new tab can successfully open!");
    }
}