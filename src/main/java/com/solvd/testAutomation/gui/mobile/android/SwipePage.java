package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.SwipePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SwipePageBase.class)
public class SwipePage extends SwipePageBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Swipe horizontal\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Swipe-screen\"]/android.view.ViewGroup")
    private ExtendedWebElement secretMessageContainer;

    @FindBy(xpath = "//android.widget.TextView[@text=\"You found me!!!\"]")
    private ExtendedWebElement secretMessage;

    public SwipePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickSwipeTab() {
        lowerBar.clickSwipe();
    }

    @Override
    public ExtendedWebElement getTitleMessage() {
        return title;
    }

    @Override
    public ExtendedWebElement getSecretMessageContainer() {
        return secretMessageContainer;
    }

    @Override
    public ExtendedWebElement getSecretMessage() {
        return secretMessage;
    }
}
