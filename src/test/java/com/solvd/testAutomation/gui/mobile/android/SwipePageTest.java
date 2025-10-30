package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.IBaseTest;
import com.solvd.testAutomation.gui.mobile.common.SwipePageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipePageTest implements IBaseTest {

    @Test
    public void titleIsVisibleTest() {
        SwipePageBase page = initPage(SwipePageBase.class);
        page.clickSwipeTab();
        Assert.assertTrue(page.getTitleMessage().isVisible());
    }
}
