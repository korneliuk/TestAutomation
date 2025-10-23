package com.solvd.testAutomation.gui.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMain extends HeaderMainBase {

    @FindBy(xpath = "//img[contains(@class, 'gfgLogoImg normal')]")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//li[contains(@class, 'headerMainListItemDark' and text(), 'Tutorials')]")
    private ExtendedWebElement tutorialsDropDownMenu;

    @FindBy(xpath = "//li[contains(@class, 'headerMainListItemDark' and text(), 'Courses')]")
    private ExtendedWebElement coursesDropDownMenu;

    @FindBy(xpath = "//li[contains(@class, 'headerMainListItemDark' and text(), 'Tracks')]")
    private ExtendedWebElement tracksDropDownMenu;

    @FindBy(xpath = "//button[contains(@data-gfg-action, 'toggleGFGTheme')]")
    private ExtendedWebElement toggleGFGTheme;

    @FindBy(xpath = "//button[contains(@class, 'signinButton gfg_loginModalBtn login-modal-btn')]")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//h1[contains(@class, 'modalTitleValue')]")
    private ExtendedWebElement LogInHeading;

    @FindBy(xpath = "//a[contains(@href, '/python-programming-language/')]")
    private ExtendedWebElement pythonTutorialsLink;

    @FindBy(xpath = "//a[contains(@href, 'https://www.geeksforgeeks.org/courses')]")
    private ExtendedWebElement allCoursesLink;

    @FindBy(xpath = "//input[contains(@type, 'text') and contains(@class, 'gs-input')]")
    private ExtendedWebElement searchBar;

    @FindBy(xpath = "//span[contains(@class, 'inner_child') and contains(text(), 'Tools')]")
    private ExtendedWebElement toolsLayout;

    @FindBy(xpath = "//a[contains(@class, 'inner_child')]")
    private ExtendedWebElement aiToolsPageLink;

    public HeaderMain(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public ExtendedWebElement getLogo() {
        return logo;
    }

    @Override
    public void openTutorialsDropDownMenu() {
        tutorialsDropDownMenu.scrollTo();
    }

    @Override
    public void openCoursesDropDownMenu() {
        coursesDropDownMenu.scrollTo();
    }

    @Override
    public void openTracksDropDownMenu() {
        tracksDropDownMenu.scrollTo();
    }

    @Override
    public void goToPythonTutorialsPage() {
        openTutorialsDropDownMenu();
        pythonTutorialsLink.click();
    }

    @Override
    public void clickSignIn() {
        signInButton.click();
    }

    @Override
    public ExtendedWebElement getLogInHeading() {
        return LogInHeading;
    }

    @Override
    public void goToAllCoursesPage() {
        openCoursesDropDownMenu();
        allCoursesLink.click();
    }

    @Override
    public void switchGFGTheme() {
        toggleGFGTheme.click();
    }

    @Override
    public void searchBySearchBar(String text) {
        searchBar.click();
        searchBar.type(text + '\n');
    }

    @Override
    public void openToolsLayout() {
        openTracksDropDownMenu();
        toolsLayout.scrollTo();
    }

    @Override
    public ExtendedWebElement getAiToolsPageLink() {
        return aiToolsPageLink;
    }
}