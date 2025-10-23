package com.solvd.testAutomation.gui.desctop;

import com.solvd.testAutomation.gui.common.GFGHomePageBase;
import com.solvd.testAutomation.gui.components.HeaderMain;
import com.solvd.testAutomation.gui.components.HeaderMainBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = GFGHomePageBase.class)
public class GFGHomePage extends GFGHomePageBase {

    @FindBy(xpath = "//div[contains(@class, 'root gfg_header__root')]")
    private HeaderMain header;

    @FindBy(xpath = "//input[contains(@class, 'HomePageSearchContainer_homePageSearchContainer_container_input__1LS0r')]")
    private ExtendedWebElement searchBar;

    @FindBy(xpath = "//span[contains(@class, 'HomePageSearchContainer_homePageSearchContainer_container--icon__6FDkO')]")
    private ExtendedWebElement findButton;

    @FindBy(xpath = "//button[contains(@class, 'HomePageArticleCard_homePageArticleCard--cta__CUjXy')]")
    private ExtendedWebElement dataStructureTopicLink;

    @FindBy(xpath = "//a[contains(@class, 'footer_advertise_btn')]")
    private ExtendedWebElement advertiseWithUsLink;

    @FindBy(xpath = "//a[contains(@class, 'HomePageTopicCard_homePageTopicCard__eePhS row1 ')]")
    private ExtendedWebElement trendingNowLink;

    @FindBy(xpath = "//div[contains(@class, 'socialIcon facebook')]")
    private ExtendedWebElement facebookLink;

    @FindBy(xpath = "//body")
    private ExtendedWebElement body;

    public GFGHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void searchBySearchBar(String text) {
        searchBar.click();
        searchBar.type(text + '\n');
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
    public void goToTrendingNowPage() {
        trendingNowLink.click();
    }

    @Override
    public void goToFacebookPage() {
        facebookLink.click();
    }

    @Override
    public HeaderMainBase getHeader() {
        return header;
    }

    @Override
    public ExtendedWebElement getBody() {
        return body;
    }
}
