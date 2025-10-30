package com.solvd.testAutomation.gui.mobile.common.components;


import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class LowerBarBase extends AbstractUIObject {

    public LowerBarBase(WebDriver driver, SearchContext context) {
        super(driver, context);
    }

    public abstract void clickHome();
    public abstract void clickWebview();
    public abstract void clickLogin();
    public abstract void clickForms();
    public abstract void clickSwipe();
    public abstract void clickDrag();
}
