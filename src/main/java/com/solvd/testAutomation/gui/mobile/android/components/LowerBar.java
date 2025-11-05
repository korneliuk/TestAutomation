package com.solvd.testAutomation.gui.mobile.android.components;

import com.solvd.testAutomation.gui.mobile.common.components.LowerBarBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LowerBar extends LowerBarBase {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Home\"]")
    private ExtendedWebElement home;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Webview\"]")
    private ExtendedWebElement webview;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Login\"]")
    private ExtendedWebElement login;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Forms\"]")
    private ExtendedWebElement forms;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Swipe\"]")
    private ExtendedWebElement swipe;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Drag\"]")
    private ExtendedWebElement drag;

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
