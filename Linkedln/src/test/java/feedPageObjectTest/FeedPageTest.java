package feedPageObjectTest;

import feedPageObject.FeedPage;
import homePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import singInPageObject.SignInPage;

public class FeedPageTest extends FeedPage {
    HomePage objectHomePage;
    SignInPage objectSignInPage;
    FeedPage objectFeedPage;

    @BeforeMethod
    public void initializePageObject() {
        objectHomePage = PageFactory.initElements(driver, HomePage.class);
        objectFeedPage = PageFactory.initElements(driver, FeedPage.class);
        objectSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }
    @Test(priority = 24, enabled = true)
    public void testSearchPeople(){
        objectSignInPage.signInByValidUsernameAndPassword();
        objectFeedPage.searchPeople();
    }






}
