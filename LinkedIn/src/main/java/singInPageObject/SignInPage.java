package singInPageObject;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\'login-email\']")
    public static WebElement email;
    @FindBy(xpath = "//*[@id=\'login-password\']")
    public static WebElement passWord;
    @FindBy(xpath = "//*[@id=\'login-submit\']]")
    public static WebElement loginButton;
    @FindBy(xpath = "//*[@id=\'control_gen_1\']/p/strong")
    public static WebElement getErrorMessage;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[1]/div/h1/img")
    public static WebElement logo;
    @FindBy(xpath = "//*[@id=\'uno-reg-join\']/div/div/div/div[2]/div[1]/div[1]/div[2]/p/a")
    public static WebElement AlreadyUsersignInButton;
    @FindBy(xpath = "//*[@id=\'yui-gen0\']")
    public static WebElement forgotPasswordTab;
    @FindBy(xpath = "//*[@id=\'layout-footer\']/div/ul/li[6]/a")
    public static WebElement unsubscribeLink;
    @FindBy(xpath = "//*[@id=\'mini-profile--js\']/li[3]/span/a")
    public static WebElement joinNowTab;




    //Following method will verify the login without entering an username and password.
    public String withoutAnUserNameAndPassword() {
        loginButton.click();
        String strn = getErrorMessage.getText();
        return strn;
    }

    //Following method will verify the login with an invalid username and no password.
    public String signInWithInvalidInfo() {
        email.sendKeys("wrongUserName");
        passWord.sendKeys("password");
        loginButton.click();
        String errorMess = getErrorMessage.getText();
        System.out.println("Sigh In Error Message " +getErrorMessage);
        return errorMess;
    }

    //forgot username and password link status
    public boolean forgotPasswordTabStatus(){
        boolean bl = forgotPasswordTab.isEnabled();
        return bl;
    }
    //join now button status
    public boolean joinNowTabStatus(){
        boolean bol = joinNowTab.isEnabled();
        return bol;
    }

    //Following method will verify the login with no username and an invalid password.
    public String noUsernameAndInvalidPassword() {
        passWord.sendKeys("wrongPassword");
        loginButton.click();
        String strn = getErrorMessage.getText();
        return strn;
    }

    //Following method will verify the login with an invalid username and an invalid password.
    public String invalidUsernameAndInvalidPassword() {
        email.sendKeys("wrongUserName");
        passWord.sendKeys("wrongPassword");
        loginButton.click();
        String strn = getErrorMessage.getText();
        return strn;
    }
    //valid user name and valid password
    public void validUserNameAndValidPassword(){
        email.sendKeys("shamspaa@gmail.com");
        passWord.sendKeys("veryeasy1212");
        loginButton.click();
    }

    public String signInByValidUsernameAndPassword() {
        email.sendKeys("shamspaa@gmail.com" + Keys.ENTER);
        passWord.sendKeys("veryeasy1212" + Keys.ENTER);
        loginButton.click();
        return null;
    }
}
