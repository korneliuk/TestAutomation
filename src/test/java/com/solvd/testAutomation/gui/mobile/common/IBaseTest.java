package com.solvd.testAutomation.gui.mobile.common;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public interface IBaseTest extends IAbstractTest, IMobileUtils {

    default String getElementText(By locator) {
        return waitForElement(locator).getText();
    }

    default WebElement waitForElement(By locator) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
