package com.solvd.testAutomation.gui.mobile.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends BasePage {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void fillInEmailTextField(String text);
    public abstract void fillInPasswordTextField(String text);
    public abstract void clickLoginButton();
    public abstract void clickLoginTab();
    public abstract ExtendedWebElement getHintMessage();
    public abstract void clickSignupTab();
    public abstract void fillInConfirmPasswordField(String text);
    public abstract void clickSignupButton();
}
