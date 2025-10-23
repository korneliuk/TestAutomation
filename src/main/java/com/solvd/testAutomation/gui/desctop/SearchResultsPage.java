package com.solvd.testAutomation.gui.desctop;

import com.solvd.testAutomation.gui.common.SearchResultsPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends SearchResultsPageBase {

    @FindBy(xpath = "//h2[contains(@class, 'ResultArticle_articleContainer__headerLink___pap7')]")
    private ExtendedWebElement firstResult;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getFirstResult() {
        return firstResult;
    }
}
