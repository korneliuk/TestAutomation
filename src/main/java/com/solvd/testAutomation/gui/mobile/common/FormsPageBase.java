package com.solvd.testAutomation.gui.mobile.common;

import org.openqa.selenium.WebDriver;

public abstract class FormsPageBase extends BasePage {

    public FormsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void inputTextInField(String text);
    public abstract void clickFormsTab();
    public abstract void clickToggle();
    public abstract void clickDropdownField();
    public abstract void clickOption();
    public abstract void clickActiveButton();
}
