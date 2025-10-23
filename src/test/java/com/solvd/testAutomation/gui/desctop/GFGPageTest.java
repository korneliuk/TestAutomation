package com.solvd.testAutomation.gui.desctop;

import com.solvd.testAutomation.gui.common.GFGHomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class GFGPageTest implements IAbstractTest {

    @Test
    public void openPageTest() {
        GFGHomePageBase page = initPage(getDriver(), GFGHomePageBase.class);
        page.open();
        Assert.assertTrue(page.getHeader().getLogo().isVisible());
        Assert.assertTrue(getDriver().getTitle().contains("GeeksforGeeks"));
        Assert.assertTrue(page.isPageOpened());
    }

    @Test
    public void searchBySearchBarTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.searchBySearchBar("C++");

        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.titleContains("C++"));
        Assert.assertTrue(getDriver().getTitle().contains("C++"), "User should be on \"C++ search\" page");
    }

    @Test
    public void goToDataStructureTopicTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.goToDataStructureTopic();

        String originalPage = getDriver().getWindowHandle();
        switchContextFrom(originalPage);

        Assert.assertTrue(getDriver().getCurrentUrl().contains("data-structures"));
    }

    private void switchContextFrom(String originalPage) {
        for(String windowHandle : getDriver().getWindowHandles()) {
            if(!windowHandle.equals(originalPage)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }

    @Test
    public void goToAdvertiseWithUsTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.goToAdvertiseWithUsPage();

        String originalPage = getDriver().getWindowHandle();
        switchContextFrom(originalPage);

        Assert.assertTrue(getDriver().getCurrentUrl().contains("advertise-with-us"));
    }

    @Test
    public void clickSignInTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.getHeader().clickSignIn();

        Assert.assertTrue(page.getHeader().getLogInHeading().isVisible());
    }

    @Test
    public void goToTrendingNowPageTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.goToTrendingNowPage();

        String originalPage = getDriver().getWindowHandle();
        switchContextFrom(originalPage);

        Assert.assertTrue(getDriver().getCurrentUrl().contains("trending"));
    }

    @Test
    public void goToFacebookPageTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.goToFacebookPage();

        String originalPage = getDriver().getWindowHandle();
        switchContextFrom(originalPage);

        Assert.assertTrue(getDriver().getCurrentUrl().contains("facebook.com/geeksforgeeks.org"));
    }

    @Test
    public void goToPythonTutorialsPageTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.getHeader().goToPythonTutorialsPage();

        for(String tab : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(tab);
        }

        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.titleContains("Python"));
        Assert.assertTrue(getDriver().getTitle().contains("Python"),
                "User should be on \"Python tutorials\" page");
    }

    @Test
    public void goToAllCoursesPageTest() {
        GFGHomePageBase page = initPage(getDriver(), GFGHomePageBase.class);
        page.open();
        page.getHeader().goToAllCoursesPage();

        for(String tab : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(tab);
        }

        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("courses"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("courses"),
                "User should be on \"All course\" page");
    }

    @Test
    public void switchGFGThemeTest() {
        GFGHomePageBase page = initPage(getDriver(), GFGHomePageBase.class);
        page.open();

        String beforeTheme = page.getHeader().getAttribute("data-dark-mode");

        page.getHeader().switchGFGTheme();

        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(
                ExpectedConditions.not(
                        ExpectedConditions.attributeToBe(
                                page.getHeader().getElement(),
                                "class",
                                beforeTheme
                        )
                )
        );

        String afterTheme = page.getHeader().getAttribute("class");

        Assert.assertNotEquals(beforeTheme, afterTheme, "Theme should change after toggling");
    }

    @Test
    public void searchByHeaderSearchBarTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.getHeader().searchBySearchBar("Java");

        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.titleContains("Java"));
        Assert.assertTrue(getDriver().getTitle().contains("Java"), "User should be on \"Java search\" page");
    }

    @Test
    public void aiToolsPageLinkVisibleTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.getHeader().openToolsLayout();

        new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(page.getHeader().getAiToolsPageLink().getElement()));

        Assert.assertTrue(page.getHeader().getAiToolsPageLink().isPresent(),
                "AI Tools Page link should be visible after opening Tools layout.");
    }

}