package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.FormsPageBase;
import com.solvd.testAutomation.gui.mobile.common.IBaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormsPageTest implements IBaseTest {

    @Test
    public void inputTextInFieldTest() {
        FormsPageBase page = initPage(FormsPageBase.class);
        page.clickFormsTab();
        page.inputTextInField("Hello, World!");

        String inputTextResult = getElementText(By.xpath("//android.widget.TextView[@content-desc=\"input-text-result\"]"));

        Assert.assertTrue(inputTextResult.contains("Hello, World!"));
    }

    @Test
    public void clickToggleTest() {
        FormsPageBase page = initPage(FormsPageBase.class);
        page.clickFormsTab();
        page.clickToggle();

        String toggleStateMessage = getElementText(By.xpath("//android.widget.TextView[@content-desc=\"switch-text\"]"));

        Assert.assertTrue(toggleStateMessage.contains("OFF"));
    }

    @Test
    public void choseOptionTest() {
        FormsPageBase page = initPage(FormsPageBase.class);
        page.clickFormsTab();
        page.clickDropdownField();
        page.clickOption();

        String chosenOption = getElementText(By.xpath("//android.widget.EditText[@resource-id=\"text_input\"]"));

        Assert.assertTrue(chosenOption.contains("Appium is awesome"));
    }

    @Test
    public void clickOnActiveButtonTest() {
        FormsPageBase page = initPage(FormsPageBase.class);
        page.clickFormsTab();
        page.clickActiveButton();

        String alertMessage = getElementText(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));

        Assert.assertTrue(alertMessage.contains("This button is active"));
    }
}
