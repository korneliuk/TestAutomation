package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.IBaseTest;
import com.solvd.testAutomation.gui.mobile.common.LoginPageBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest implements IBaseTest {

    @Test
    public void successfulLoginTest() {
        LoginPageBase page = initPage(LoginPageBase.class);
        page.clickLoginTab();
        page.fillInEmailTextField("testUser@gmail.com");
        page.fillInPasswordTextField("12345678");
        page.clickLoginButton();

        String successMessage = getElementText(By.xpath("//android.widget.TextView[contains(@text, 'Success')]"));

        Assert.assertTrue(successMessage.contains("Success"));
    }

    @Test
    public void unsuccessfulLoginTest() {
        LoginPageBase page = initPage(LoginPageBase.class);
        page.clickLoginTab();
        page.fillInEmailTextField("testuser");
        page.fillInPasswordTextField("wrong");
        page.clickLoginButton();

        String hintMessageText = getElementText(By.xpath("//android.widget.TextView[@text=\"Please enter a valid email address\"]"));

        Assert.assertTrue(hintMessageText.contains("Please enter a valid email address"));
    }

    @Test
    public void successfulSignupTest() {
        LoginPageBase page = initPage(LoginPageBase.class);
        page.clickLoginTab();
        page.clickSignupTab();
        page.fillInEmailTextField("testUser@gmail.com");
        page.fillInPasswordTextField("12345678");
        page.fillInConfirmPasswordField("12345678");
        page.clickSignupButton();

        String successMessage = getElementText(By.xpath("//android.widget.TextView[@resource-id=\"android:id/alertTitle\"]"));

        Assert.assertTrue(successMessage.contains("Signed Up!"));
    }

}
