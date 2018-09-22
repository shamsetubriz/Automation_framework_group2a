package signInPageObjectTest;

import base.CommonAPI;
import homePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import singInPageObject.SignInPage;

public class SignInPageTest extends CommonAPI {
    HomePage objectHomePage;
    SignInPage objectSignInPage;

    @BeforeMethod
    public void initializePageObject() {
        objectHomePage = PageFactory.initElements(driver, HomePage.class);
        objectSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    //following 5 test will test the login to the site.
    @Test(priority = 21, enabled = true)
    public void testWithoutAnUserNameAndPassword(){
        objectHomePage.gotoSignUpPage();
        String actual = objectSignInPage.withoutAnUserNameAndPassword();
        String expected = "There were one or more errors in your submission. " +
                "Please correct the marked fields below.";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testEWithoutAnUserNameAndPassword test has passed");
    }
    @Test(priority = 22, enabled = true)
    public void testInvalidUserNameAndNoPassword(){
        String actual = objectSignInPage.signInWithInvalidInfo();
        String expected = "There were one or more errors in your submission. " +
                "Please correct the marked fields below.e";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testInvalidUserNameAndNoPassword test has passed");
    }
    @Test(priority = 23, enabled = true)
    public void testNoUsernameAndInvalidPassword(){
        String actual = objectSignInPage.noUsernameAndInvalidPassword();
        String expected = "Everything stays the same, page does not change";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testNoUsernameAndInvalidPassword test has passed");
    }
    @Test(priority = 24, enabled = true)
    public void testInvalidUsernameAndInvalidPassword(){
        String actual = objectSignInPage.invalidUsernameAndInvalidPassword();
        String expected = "There were one or more errors in your submission. " +
                "Please correct the marked fields below.";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testInvalidUsernameAndInvalidPassword test has passed");
    }
    @Test(priority = 25, enabled = true)
    public void testsignInByValidUsernameAndPassword(){
        objectSignInPage.signInByValidUsernameAndPassword();


    }

}
