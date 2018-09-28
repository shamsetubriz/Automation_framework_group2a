package feedPageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\'feed-tab-icon\']")
    public static WebElement homeIcon;
    @FindBy(xpath = "//*[@id=\'mynetwork-tab-icon\']")
    public static WebElement myNetwork;
    @FindBy(xpath = "//*[@id=\'jobs-tab-icon\']")
    public static WebElement jobIcon;
    @FindBy(css = "#jobs-tab-icon")
    public static WebElement jobText;
    @FindBy(css = "button.launchpad-card__primary-action")
    public static WebElement findConnectionBox;
    @FindBy(xpath = "//span[@id='messaging-tab-icon']")
    public static WebElement MessageIcon;
    @FindBy(css = "#messaging-tab-icon")
    public static WebElement MyProfileIcon;
    @FindBy(xpath = "//button[contains(@class,'Sans-17px-black-70%')]")
    public static WebElement statusBox;
    @FindBy(xpath = "//button[@id='ember1715']")
    public static WebElement postStatusButton;
    @FindBy(xpath = "//artdeco-typeahead-deprecated-input[@id='ember934']//input[contains(@placeholder,'Search')]")
    public static WebElement searchBox;
    @FindBy(xpath = "//div[@id='nav-typeahead-wormhole']")
    public static WebElement searchButton;

    public void navigateToMyProfile(){
        MyProfileIcon.click();
    }
    public void navigateToFindConnection(){
        findConnectionBox.click();
    }
    public void navigateToMessage(){
        MessageIcon.click();
    }
    public void navigateToHome(){
        homeIcon.click();
    }
    public void mouseHoverOnStatusBox(){
        statusBox.click();
    }
    public void postNewStatus(){
        waitUntilClickAble(statusBox);
        statusBox.sendKeys("In a few weeks New York will have beautiful foliage");
        postStatusButton.click();
    }
    public void searchPeople(){
        searchBox.click();
        searchBox.sendKeys("Barack Obama");
        searchButton.click();
    }





}
