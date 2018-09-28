package signInPageObjectTest;

import homePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import singInPageObject.ByInputFromXls;
import singInPageObject.SignInPage;

import java.io.IOException;

public class ByInputFromXlsTest extends ByInputFromXls {
    HomePage objectHomePage;
    SignInPage objectSignInPage;
    ByInputFromXls objectByInput;
    @BeforeMethod
    public void initialization(){
        objectHomePage = PageFactory.initElements(driver, HomePage.class);
        objectByInput = PageFactory.initElements(driver, ByInputFromXls.class);
        objectSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }
    @Test
    public void signInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        /*sleepFor(3);
        objectHomePage.clikSignIn();
        sleepFor(3);
        objectSignInPage.switchToSignInForm();
        sleepFor(3);
        String[] expectedItems = objectByInput.getAssertData("DataFile.xls");
        String[] actualItems = objectByInput.getVerificationValue("DataFile.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": T098654    d");
        }
        System.out.println("signInWithInvalidIdAndPassword");
        //implicitWait(driver, 20);*/
    }
}


