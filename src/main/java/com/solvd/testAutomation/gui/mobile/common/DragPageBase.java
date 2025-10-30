package com.solvd.testAutomation.gui.mobile.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class DragPageBase extends BasePage {

    public DragPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ExtendedWebElement getTitleMessage();
    public abstract void clickDragTab();
}
