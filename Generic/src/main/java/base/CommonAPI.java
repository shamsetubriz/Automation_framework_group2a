package base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.linkedin.com/")String url){
        System.setProperty("webdriver.chrome.driver","/Users/shams/IdeaProjects/Automation_Framework_Group2a/Generic/browser-drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get(url);
        //driver.manage().window().maximize();
        //driver.findElement(By.name("search_query")).sendKeys("", Keys.ENTER);
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    //return status of link if it is enabled
    public static boolean inEnableStatus(WebDriver driver, WebElement webelem){
        boolean enab = webelem.isEnabled();
        return enab;
    }

    //wait time for nes=xt action
    public static void wait(WebDriver driver, int sec) throws InterruptedException{
        Thread.sleep(sec * 1000);
    }
    //implicit wait
    public static void implicitWait(WebDriver driver, int sec){
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }
    public String  getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }
    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }
    //Synchronization
    public void waitUntilClickAble(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, 35);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
    public void waitUntilVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitUntilSelectable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
    public void goBackToHomeWindow(){
        driver.switchTo().defaultContent();
    }
    public void navigateForword(){
        driver.navigate().forward();
    }
    public void navigateBackword(){
        driver.navigate().back();
    }

    public void clearInput(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public void keysInput(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }
    public void switchWindow(WebDriver driver){
        for (String handle: driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public void inputValueIntoTestBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }




}
