package com.solvd.testAutomation.gui.mobile.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class WebviewPageBase extends BasePage {

    public WebviewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ExtendedWebElement getTitleMessage();
    public abstract void clickWebviewTab();
}
