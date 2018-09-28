package singInPageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage2 extends CommonAPI {
    @FindBy(xpath = "//strong[contains(text(),'There were one or more errors')]")
    public static WebElement getErrorMessage;
}
