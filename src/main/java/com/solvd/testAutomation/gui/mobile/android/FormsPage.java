package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.FormsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = FormsPageBase.class)
public class FormsPage extends FormsPageBase {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"text-input\"]")
    ExtendedWebElement inputField;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"input-text-result\"]")
    ExtendedWebElement inputTextResult;

    @FindBy(xpath = "//android.widget.Switch[@content-desc=\"switch\"]")
    ExtendedWebElement toggle;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"text_input\"]")
    ExtendedWebElement dropdownField;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Appium is awesome\"]")
    ExtendedWebElement option;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup")
    ExtendedWebElement activeButton;

    public FormsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void inputTextInField(String text) {
        inputField.type(text);
    }

    @Override
    public void clickFormsTab() {
        lowerBar.clickForms();
    }

    @Override
    public void clickToggle() {
        toggle.click();
    }

    @Override
    public void clickDropdownField() {
        dropdownField.click();
    }

    @Override
    public void clickOption() {
        option.click();
    }

    @Override
    public void clickActiveButton() {
        activeButton.click();
    }


}
