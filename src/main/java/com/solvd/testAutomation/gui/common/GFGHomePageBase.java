package com.solvd.testAutomation.gui.common;

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
    public abstract void clickSignIn();
    public abstract ExtendedWebElement getLogInHeading();
    public abstract void goToTrendingNowPage();
    public abstract void goToFacebookPage();
    public abstract void goToPythonTutorialsPage();
}
