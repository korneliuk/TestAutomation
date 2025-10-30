package com.solvd.testAutomation.gui.mobile.android;

import com.solvd.testAutomation.gui.mobile.common.DragPageBase;
import com.solvd.testAutomation.gui.mobile.common.IBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragPageTest implements IBaseTest {

    @Test
    public void titleIsVisibleTest() {
        DragPageBase page = initPage(DragPageBase.class);
        page.clickDragTab();
        Assert.assertTrue(page.getTitleMessage().isVisible());
    }
}
