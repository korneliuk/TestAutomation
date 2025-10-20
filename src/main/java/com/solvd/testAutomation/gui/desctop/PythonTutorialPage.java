package com.solvd.testAutomation.gui.desctop;

import com.solvd.testAutomation.gui.common.PythonTutorialPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PythonTutorialPage extends PythonTutorialPageBase {

    @FindBy(xpath = "//h1[contains(text(),'Python')]")
    private ExtendedWebElement pageHeader;

    public PythonTutorialPage(WebDriver driver) {
        super(driver);
    }

//    @Override
//    public boolean isPageOpened() {
//        return pageHeader.isElementPresent();
//    }
}
