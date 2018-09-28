package homePageObjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    //links for new user sign up window.
    @FindBy(xpath = "//input[@id='reg-firstname']")
    public static WebElement firstNameField;
    @FindBy(xpath = "//input[@id='reg-lastname']")
    public static WebElement lastNameField;
    @FindBy(xpath = "//input[@id='reg-email']")
    public static WebElement eMailField;
    @FindBy(xpath = "//input[@id='reg-password']")
    public static WebElement passwordField;
    @FindBy(xpath = "//input[@id='registration-submit']")
    public static WebElement joinNowField;

    @FindBy(xpath = "//*[@id='application-body']/div/div[4]/div/div/div/div")
    public static WebElement headLineText;
    //footer links from general section
    @FindBy(xpath = "/html/body/div/main/div/div[3]/div[2]/div[1]/ul/li[1]/a")
    public static WebElement signUpLink;
    @FindBy(xpath = "/html/body/div/main/div/div[3]/div[2]/div[1]/ul/li[2]/a")
    public static WebElement helpcenterLink;
    @FindBy(xpath = "/html/body/div/main/div/div[3]/div[2]/div[1]/ul/li[6]/a")
    public static WebElement careerLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[1]/ul/li[4]/a")
    public static WebElement pressLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[1]/ul/li[7]/a")
    public static WebElement developerLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[3]/ul/li[1]/a")
    public static WebElement learningLink;

    //footer links from business solution section
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[2]/ul/li[1]/a")
    public static WebElement talentLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[2]/ul/li[2]/a")
    public static WebElement marketingLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[2]/ul/li[3]/a")
    public static WebElement salesLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[2]/ul/li[4]/a")
    public static WebElement learningLinkFromSolutionSec;

    //Footer link from Browse LinkedIn section
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[3]/ul/li[2]/a")
    public static WebElement jobLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[3]/ul/li[3]/a")
    public static WebElement salaryLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[3]/ul/li[4]/a")
    public static WebElement mobileLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[3]/ul/li[5]/a")
    public static WebElement proFinderLink;

    //Footer link from Directories section
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[4]/ul/li[1]/a")
    public static WebElement membersLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[4]/ul/li[3]/a")
    public static WebElement pulseLink;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[4]/ul/li[4]/a")
    public static WebElement companiesLink;
    @FindBy(xpath = "/html/body/div/main/div/div[3]/div[2]/div[4]/ul/li[6]/a")
    public static WebElement university;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[4]/ul/li[7]/a")
    public static WebElement topJobsLink;

    //footer links from the very bottom of the page
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[3]/ul/li[1]/a")
    public static WebElement userAgreement;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[3]/ul/li[2]/a")
    public static WebElement privacyPolicy;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[3]/ul/li[3]/a")
    public static WebElement communityGuideline;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[3]/ul/li[4]/a")
    public static WebElement cookiePolicy;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[3]/ul/li[5]/a")
    public static WebElement copyritePolicy;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[3]/div[2]/div[1]/ul/li[1]/a")
    public static WebElement signUpPage;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public static boolean verifySignUpLink(){
        Boolean bool = signUpLink.isDisplayed();
        return bool;
    }
    public static boolean verifyHelpCenterLink(){
        Boolean bool = helpcenterLink.isDisplayed();
        return bool;
    }
    public boolean goToCareerPage(){
        careerLink.click();
        return true;
    }
    public void gotoSignUpPage(){
        signUpPage.click();
    }
    //go to University page
    public void clickUniversityLink(){
        university.click();
    }
    //go to Jobs page
    public void gotoJobsPage(){
        jobLink.click();
    }
    public void clickSalaryLink(){
        salaryLink.click();
    }
    //go to help center page and collect the headline text
    public static String goToHelpCentrePageAndCollectTheHeadlineText(){
        helpcenterLink.click();
        String str = headLineText.getText();
        System.out.println("Head Line Text: "+ str);
        return str;
    }

    public void newUserSingUp(String firstName, String lastName, String eMail, String password) throws InterruptedException{
        firstNameField.sendKeys(firstName);
        Thread.sleep(1000);
        lastNameField.sendKeys(lastName);
        Thread.sleep(1000);
        eMailField.sendKeys(eMail);
        Thread.sleep(1000);
        passwordField.sendKeys(password);
        Thread.sleep(1000);
        joinNowField.click();

    }
    public static void pressLinkFromGeneralSecOfFooterLink(){
        boolean press = pressLink.isEnabled();
        System.out.println("Press Link status: "+press);
    }
    public static void developerLinkFromGeneralSecOfFotterLink(){
        boolean dev = developerLink.isEnabled();
        System.out.println("Developer Link status: "+dev);
    }
    public static void learningLinkFromGeneralSecOfFooterLink(){
        boolean learn = learningLink.isEnabled();
        System.out.println("Learning Link of General Section Status: "+learn);
    }
    public static void talentLinkFromBusSolSecOfFooterLink(){
        boolean talent = talentLink.isEnabled();
        System.out.println("Talent link of Business Solution Status: "+talent);
    }
    public static void marketingLinkfromBusSolSecOfFotterLink(){
        boolean market = marketingLink.isDisplayed();
        System.out.println("Marketing Link Status: "+market);
    }
    public static void learningLinkFromSolutionSec(){
        boolean learning = learningLinkFromSolutionSec.isDisplayed();
        System.out.println("learningLinkFromSolutionSec Link status: "+learning);
    }
    public static void salesLinkFromBusSolSecOfFooterLink(){
        boolean sales = salesLink.isDisplayed();
        System.out.println("Sale Link from business solution Status: "+sales);
    }
    public static void mobileLinkFromBrowseLinkedInSec(){
        boolean lrnbs = mobileLink.isDisplayed();
        System.out.println("Mobile Link Status: "+lrnbs);
    }
    public static void proFinderLinkFromBrowLinInSec(){
        boolean lrnbs = proFinderLink.isDisplayed();
        System.out.println("Learning Link of Business Sol Status: "+lrnbs);
    }
    public static void membersLinkFromDirectorySec(){
        boolean lrnbs = membersLink.isDisplayed();
        System.out.println("Learning Link of Business Sol Status: "+lrnbs);
    }
    public static void pulseLinkFromDirectorySec(){
        boolean lrnbs = pulseLink.isDisplayed();
        System.out.println("Learning Link of Business Sol Status: "+lrnbs);
    }
    public static void topjobLinkFromDirectorySec(){
        boolean lrnbs = topJobsLink.isDisplayed();
        System.out.println("Learning Link of Business Sol Status: "+lrnbs);
    }
}

