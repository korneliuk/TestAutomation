package com.solvd.testAutomation.gui.mobile.android.components;

import com.solvd.testAutomation.gui.mobile.common.components.LowerBarBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LowerBar extends LowerBarBase {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Home\"]")
    ExtendedWebElement home;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Webview\"]")
    ExtendedWebElement webview;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Login\"]")
    ExtendedWebElement login;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Forms\"]")
    ExtendedWebElement forms;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Swipe\"]")
    ExtendedWebElement swipe;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Drag\"]")
    ExtendedWebElement drag;

    public LowerBar(WebDriver driver, SearchContext context) {
        super(driver, context);
    }

    @Override
    public void clickHome() {
        home.click();
    }

    @Override
    public void clickWebview() {
        webview.click();
    }

    @Override
    public void clickLogin() {
        login.click();
    }

    @Override
    public void clickForms() {
        forms.click();
    }

    @Override
    public void clickSwipe() {
        swipe.click();
    }

    @Override
    public void clickDrag() {
        drag.click();
    }
}
