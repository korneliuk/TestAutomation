package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.DragPageBase;
import com.solvd.testAutomation.gui.mobile.common.FormsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DragPageBase.class)
public class DragPage extends DragPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Drag and Drop\"]")
    private ExtendedWebElement title;

    public DragPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ExtendedWebElement getTitleMessage() {
        return title;
    }

    @Override
    public void clickDragTab() {
        lowerBar.clickDrag();
    }
}
