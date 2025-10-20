package com.solvd.testAutomation.gui.desctop;

import com.solvd.testAutomation.gui.common.GFGHomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = GFGHomePageBase.class)
public class GFGHomePage extends GFGHomePageBase {

    @FindBy(xpath = "//*[@id=\"topMainHeader\"]/div/div[1]/a/div/img")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//*[@id=\"comp\"]/div[2]/div[1]/div[2]/input")
    private ExtendedWebElement searchBar;

    @FindBy(xpath = "//*[@id=\"comp\"]/div[2]/div[1]/div[2]/span")
    private ExtendedWebElement findButton;

    @FindBy(xpath = "//*[@id=\"comp\"]/div[2]/div[2]/div/div[2]/a[1]")
    private ExtendedWebElement dataStructureTopicLink;

    @FindBy(xpath = "//*[@id=\"comp\"]/div[3]/footer/div[1]/div[1]/div[5]/a")
    private ExtendedWebElement advertiseWithUsLink;

    @FindBy(xpath = "//*[@id=\"topMainHeader\"]/div/div[2]/div[2]/button")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//*[@id=\"login\"]/div/div[2]/div/div[1]/h1")
    private ExtendedWebElement LogInHeading;

    @FindBy(xpath = "//*[@id=\"comp\"]/div[2]/div[5]/div[2]/a[1]")
    private ExtendedWebElement trendingNowLink;

    @FindBy(xpath = "//*[@id=\"comp\"]/div[3]/footer/div[1]/div[1]/div[3]/a[1]/div")
    private ExtendedWebElement facebookLink;

    @FindBy(xpath = "//*[@id=\"topMainHeader\"]/div/ul/li[1]/span/div")
    private ExtendedWebElement tutorialsDropDownMenu;

    @FindBy(xpath = "//a[contains(@href, '/python-programming-language/')]")
    private ExtendedWebElement pythonTutorialsLink;

    public GFGHomePage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getLogo() {
        return logo;
    }

    @Override
    public void searchBySearchBar(String text) {
        searchBar.click();
        searchBar.type(text + "\n");
    }

    @Override
    public void goToDataStructureTopic() {
        dataStructureTopicLink.click();
    }

    @Override
    public void goToAdvertiseWithUsPage() {
        advertiseWithUsLink.click();
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
    public void goToTrendingNowPage() {
        trendingNowLink.click();
    }

    @Override
    public void goToFacebookPage() {
        facebookLink.click();
    }

    @Override
    public void goToPythonTutorialsPage() {
        tutorialsDropDownMenu.scrollTo();
        pause(3);
        pythonTutorialsLink.click();
    }
}
