package signInPageObjectTest;

import dataProviderUtilityWithXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import singInPageObject.SignInPage;
import singInPageObject.SignInPage2;
import java.util.ArrayList;
import java.util.Iterator;

public class SingInPageTest2 extends SignInPage2 {

    SignInPage objectSignInPage;
    SignInPage2 objcetSignInPage2;

    @BeforeMethod
    public void initializePageObject() {

        objectSignInPage = PageFactory.initElements(driver, SignInPage.class);
        objcetSignInPage2 = PageFactory.initElements(driver, SignInPage2.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }

    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void loginTestWithDataProvider(String email, String passCode, String message) throws InterruptedException {

        objectSignInPage.signInByDataProvider(email,passCode);
        String actual = objcetSignInPage2.getErrorMessage.getText();
        //TestLogger.log("In Sign In Page");
        Assert.assertEquals(actual,message);
    }
}
