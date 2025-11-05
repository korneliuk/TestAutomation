package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.IBaseTest;
import com.solvd.testAutomation.gui.mobile.common.SwipePageBase;
import com.zebrunner.carina.utils.android.AndroidService;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipePageTest implements IBaseTest {

    @Test
    public void titleIsVisibleTest() {
        SwipePageBase page = initPage(SwipePageBase.class);
        page.clickSwipeTab();
        Assert.assertTrue(page.getTitleMessage().isVisible());
    }

    @Test
    public void secretMessageIsFoundTest() {
        SwipePageBase page = initPage(SwipePageBase.class);
        page.clickSwipeTab();
        waitForElement(By.xpath("//android.widget.TextView[@text=\"Swipe horizontal\"]"));
        page.getSecretMessage().hover();
//        swipe(page.getSecretMessageContainer(), page.getSecretMessageContainer(), Direction.UP);
        Assert.assertTrue(page.getSecretMessage().isVisible(), "Secret message should be visible");
        getDriver().quit();
    }
}
