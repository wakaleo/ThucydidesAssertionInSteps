package com.yandex.mainpage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.yandex.com")
public class MainPage extends PageObject {
    @FindBy(xpath = "//img[@class='b-logo']")
    private WebElement logo;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return logo;
    }
}
