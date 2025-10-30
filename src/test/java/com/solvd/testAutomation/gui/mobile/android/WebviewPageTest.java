package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.IBaseTest;
import com.solvd.testAutomation.gui.mobile.common.WebviewPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebviewPageTest implements IBaseTest {

    @Test
    public void titleIsVisibleTest() {
        WebviewPageBase page = initPage(WebviewPageBase.class);
        page.clickWebviewTab();
        Assert.assertTrue(page.getTitleMessage().isVisible());
    }
}
