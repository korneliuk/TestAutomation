package com.solvd.testAutomation.gui.common;

import com.solvd.testAutomation.gui.components.HeaderMainBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GFGHomePageBase extends AbstractPage {
    public GFGHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void searchBySearchBar(String text);
    public abstract void goToDataStructureTopic();
    public abstract void goToAdvertiseWithUsPage();
    public abstract void goToTrendingNowPage();
    public abstract void goToFacebookPage();
    public abstract HeaderMainBase getHeader();
    public abstract ExtendedWebElement getBody();
}
