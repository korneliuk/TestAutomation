package com.solvd.testAutomation.gui.desctop;

import com.solvd.testAutomation.gui.common.GFGHomePageBase;
import com.solvd.testAutomation.gui.common.PythonTutorialPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GFGPageTest implements IAbstractTest {

    @Test
    public void openPageTest() {
        GFGHomePage page = new GFGHomePage(getDriver());
        page.open();
        Assert.assertTrue(page.getLogo().isVisible());
        Assert.assertTrue(getDriver().getTitle().contains("GeeksforGeeks"));
        Assert.assertTrue(page.isPageOpened());
    }

    @Test
    public void searchBySearchBar() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.searchBySearchBar("C++");
        pause(6);

        SearchResultsPage resultsPage = new SearchResultsPage(getDriver());
        Assert.assertNotNull(resultsPage.getFirstResult(), "First result isn't found");
        String firstResultText = resultsPage.getFirstResult().getText();
        Assert.assertTrue(firstResultText.toLowerCase().contains("c++"));
    }

    @Test
    public void goToDataStructureTopicTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();

        String originalWindow = getDriver().getWindowHandle();

        page.goToDataStructureTopic();

        for(String windowHandle : getDriver().getWindowHandles()) {
            if(!windowHandle.equals(originalWindow)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertTrue(getDriver().getCurrentUrl().contains("data-structures"));
    }

    @Test
    public void goToAdvertiseWithUsTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();

        String originalPage = getDriver().getWindowHandle();

        page.goToAdvertiseWithUsPage();

        for(String windowHandle : getDriver().getWindowHandles()) {
            if(!windowHandle.equals(originalPage)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertTrue(getDriver().getCurrentUrl().contains("advertise-with-us"));
    }

    @Test
    public void clickSignInTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();
        page.clickSignIn();

        Assert.assertTrue(page.getLogInHeading().isVisible());
    }

    @Test
    public void goToTrendingNowPageTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();

        String originalPage = getDriver().getWindowHandle();

        page.goToTrendingNowPage();

        for(String windowHandle : getDriver().getWindowHandles()) {
            if(!windowHandle.equals(originalPage)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertTrue(getDriver().getCurrentUrl().contains("trending"));
    }

    @Test
    public void goToFacebookPageTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();

        String originalPage = getDriver().getWindowHandle();

        page.goToFacebookPage();

        for(String windowHandle : getDriver().getWindowHandles()) {
            if(!windowHandle.equals(originalPage)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertTrue(getDriver().getCurrentUrl().contains("facebook.com/geeksforgeeks.org"));
    }

    @Test
    public void goToPythonTutorialsPageTest() {
        GFGHomePageBase page = new GFGHomePage(getDriver());
        page.open();

        page.goToPythonTutorialsPage();

        PythonTutorialPageBase pythonTutorialPageBase = new PythonTutorialPage(getDriver());
        Assert.assertTrue(pythonTutorialPageBase.isPageOpened());
    }
}