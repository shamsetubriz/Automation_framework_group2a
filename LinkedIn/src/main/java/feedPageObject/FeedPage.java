package feedPageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedPage extends CommonAPI {
    @FindBy(xpath = "/html/body/nav/div/div/div[1]/a/span[1]/li-icon/svg/g/g[4]/g[2]/path")
    public static WebElement linkedInLogo;
    @FindBy(xpath = "//*[@id=\'feed-tab-icon\']")
    public static WebElement homeIcon;
    @FindBy(xpath = "/html/body/nav/div/ul[1]/li[1]/a/span[2]")
    public static WebElement homeText;
    @FindBy(xpath = "//*[@id=\'mynetwork-tab-icon\']")
    public static WebElement myNetworkIcon;
    @FindBy(xpath = "/html/body/nav/div/ul[1]/li[2]/a/span[2]")
    public static WebElement myNetworkText;
    @FindBy(xpath = "//*[@id=\'jobs-tab-icon\']")
    public static WebElement jobIcon;
    @FindBy(css = "#jobs-nav-item > a:nth-child(1) > span:nth-child(2)")
    public static WebElement jobText;
    @FindBy(css = "button.launchpad-card__primary-action")
    public static WebElement findConnectionBox;
    @FindBy(xpath = "//*[@id=\'layout-main\']/div/div[1]/div/form/a")
    public static WebElement forgotPasswordBox;
    @FindBy(xpath = "//*[@id='layout-main']/div/div[3]/div[2]/div[1]/ul/li[7]/a")
    public static WebElement careerLink;

}
