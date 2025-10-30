package com.solvd.testAutomation.gui.mobile.common;

import com.zebrunner.carina.core.IAbstractTest;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public interface IBaseTest extends IAbstractTest {

    default String getElementText(By locator) {
        return waitForElement(locator).getText();
    }

    default WebElement waitForElement(By locator) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    default void scrollToText(String text) {
        getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"
        ));
    }
}
