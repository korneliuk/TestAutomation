package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-email\"]")
    private ExtendedWebElement emailInputField;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-password\"]")
    private ExtendedWebElement passwordInputField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']")
    private ExtendedWebElement successWarningTitle;

    @FindBy(xpath = "//android.widget.TextView[@text=\"\uDB80\uDF42\"]")
    private ExtendedWebElement loginPage;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Please enter a valid email address\"]")
    private ExtendedWebElement hintMessage;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Sign up\"]")
    private ExtendedWebElement signupTab;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-repeat-password\"]")
    private ExtendedWebElement confirmPasswordField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup")
    private ExtendedWebElement signupButton;

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
