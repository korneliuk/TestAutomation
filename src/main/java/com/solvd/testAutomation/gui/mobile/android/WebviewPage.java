package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.WebviewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebviewPageBase.class)
public class WebviewPage extends WebviewPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Next-gen browser and mobile automation test framework for Node.js\"]")
    private ExtendedWebElement title;

    public WebviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ExtendedWebElement getTitleMessage() {
        return title;
    }

    @Override
    public void clickWebviewTab() {
        lowerBar.clickWebview();
    }
}
