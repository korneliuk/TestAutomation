package com.solvd.testAutomation.gui.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderMainBase extends AbstractUIObject {

    public HeaderMainBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract ExtendedWebElement getLogo();
    public abstract void openTutorialsDropDownMenu();
    public abstract void openCoursesDropDownMenu();
    public abstract void openTracksDropDownMenu();
    public abstract void goToPythonTutorialsPage();
    public abstract void clickSignIn();
    public abstract ExtendedWebElement getLogInHeading();
    public abstract void goToAllCoursesPage();
    public abstract void switchGFGTheme();
    public abstract void searchBySearchBar(String text);
    public abstract void openToolsLayout();
    public abstract ExtendedWebElement getAiToolsPageLink();
}
