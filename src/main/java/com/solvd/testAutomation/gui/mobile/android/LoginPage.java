package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-email\"]")
    ExtendedWebElement emailInputField;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-password\"]")
    ExtendedWebElement passwordInputField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup")
    ExtendedWebElement loginButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']")
    ExtendedWebElement successWarningTitle;

    @FindBy(xpath = "//android.widget.TextView[@text=\"\uDB80\uDF42\"]")
    ExtendedWebElement loginPage;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Please enter a valid email address\"]")
    ExtendedWebElement hintMessage;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Sign up\"]")
    ExtendedWebElement signupTab;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-repeat-password\"]")
    ExtendedWebElement confirmPasswordField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup")
    ExtendedWebElement signupButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void fillInEmailTextField(String text) {
        emailInputField.type(text);
    }

    @Override
    public void fillInPasswordTextField(String text) {
        passwordInputField.type(text);
    }

    @Override
    public void clickLoginButton() {
        loginButton.click();
    }

    @Override
    public void clickLoginTab() {
        lowerBar.clickLogin();
    }

    @Override
    public ExtendedWebElement getHintMessage() {
        return hintMessage;
    }

    @Override
    public void clickSignupTab() {
        signupTab.click();
    }

    @Override
    public void fillInConfirmPasswordField(String text) {
        confirmPasswordField.type(text);
    }

    @Override
    public void clickSignupButton() {
        signupButton.click();
    }
}
