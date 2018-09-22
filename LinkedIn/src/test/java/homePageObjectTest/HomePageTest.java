package homePageObjectTest;

import base.CommonAPI;
import homePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePage objectHomePage;


    @BeforeMethod
    public void initializePageObject() {
        objectHomePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority = 1, enabled = true)
    public void testSignupLink(){
        boolean actual = objectHomePage.verifySignUpLink();
        Assert.assertTrue(actual);
        System.out.println("testSignupLink test has passed");
    }
    @Test(priority = 2, enabled = true)
    public void testTheHeadLineText(){
        String actual = objectHomePage.goToHelpCentrePageAndCollectTheHeadlineText();
        String expected = "Hi, how can we help you?";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testTheHeadLineText tes has passed");
    }
    @Test(priority = 3, enabled = true)
    public void testHelpCenterLink(){
        boolean actual = objectHomePage.verifyHelpCenterLink();
        Assert.assertTrue(actual);
        System.out.println("testHelpCenterLink test has passed");
    }
    @Test(priority = 4, enabled = true)
    public void testCarrerLink(){
        boolean actual = objectHomePage.goToCareerPage();
        Assert.assertTrue(actual);
    }
    @Test(priority = 5, enabled = true)
    public void testUniversityLink(){
        objectHomePage.clickUniversityLink();
    }
    @Test(priority = 6, enabled = true)
    public void testSalaryLink(){
        objectHomePage.clickSalaryLink();
    }
    @Test(priority = 7, enabled = true)
    public void testJobLink(){
        objectHomePage.gotoJobsPage();
    }
    @Test(priority = 8, enabled = true)
    public void testPressLink(){
        objectHomePage.pressLinkFromGeneralSecOfFooterLink();
    }
    @Test(priority = 9, enabled = true)
    public void testDeveloperLink(){
        objectHomePage.developerLinkFromGeneralSecOfFotterLink();
    }
    @Test(priority = 10, enabled = true)
    public void testLearningLink(){
        objectHomePage.learningLinkFromGeneralSecOfFooterLink();
    }
    @Test(priority = 11, enabled = true)
    public void testTalentLink(){
        objectHomePage.talentLinkFromBusSolSecOfFooterLink();
    }
    @Test(priority = 12, enabled = true)
    public void testMarketingLink(){
        objectHomePage.marketingLinkfromBusSolSecOfFotterLink();
    }
    @Test(priority = 13, enabled = true)
    public void testSalesLinkOfBusSol(){
        objectHomePage.salesLinkFromBusSolSecOfFooterLink();
    }
    @Test(priority = 14, enabled = true)
    public void testLearningLinkofSolutionSec(){
        objectHomePage.learningLinkFromSolutionSec();
    }
    @Test(priority = 15, enabled = true)
    public void testTalentLinkFromBusSolSecOfFooterLink(){
        objectHomePage.talentLinkFromBusSolSecOfFooterLink();
    }
    @Test(priority = 16, enabled = true)
    public void testMobileLinkFromBrowseLinkedInSec(){
        objectHomePage.mobileLinkFromBrowseLinkedInSec();
    }
    @Test(priority = 17, enabled = true)
    public void testProFinderLinkFromBrowLinInSec(){
        objectHomePage.proFinderLinkFromBrowLinInSec();
    }
    @Test(priority = 18, enabled = true)
    public void testMembersLinkFromDirectorySec(){
        objectHomePage.membersLinkFromDirectorySec();
    }
    @Test(priority = 19, enabled = true)
    public void testPulseLinkFromDirectorySec(){
        objectHomePage.pulseLinkFromDirectorySec();
    }
    @Test(priority = 20, enabled = true)
    public void testTopjobLinkFromDirectorySec(){
        objectHomePage.topjobLinkFromDirectorySec();
    }
}

