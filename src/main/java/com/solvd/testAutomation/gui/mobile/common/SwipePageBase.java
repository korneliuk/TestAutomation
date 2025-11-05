package com.solvd.testAutomation.gui.mobile.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class SwipePageBase extends BasePage {

    public SwipePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickSwipeTab();
    public abstract ExtendedWebElement getTitleMessage();
    public abstract ExtendedWebElement getSecretMessageContainer();
    public abstract ExtendedWebElement getSecretMessage();
}
