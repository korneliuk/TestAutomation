package com.solvd.testAutomation.gui.mobile.common;

import com.solvd.testAutomation.gui.mobile.android.components.LowerBar;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage extends AbstractPage {

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]")
    protected LowerBar lowerBar;

    public BasePage(WebDriver driver) {
        super(driver);
    }
}
