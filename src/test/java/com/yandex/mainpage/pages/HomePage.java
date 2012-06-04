package com.yandex.mainpage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * User: leonsabr
 * Date: 21.05.12
 */
@DefaultUrl("http://www.yandex.com")
public class HomePage extends PageObject {
    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@role='button']")
    private WebElement lookupButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterRequest(String request) {
        searchInput.sendKeys(request);
    }

    public void lookup() {
        lookupButton.click();
    }
}
