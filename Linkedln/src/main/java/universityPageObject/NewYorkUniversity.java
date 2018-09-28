package universityPageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewYorkUniversity extends CommonAPI {
    @FindBy(xpath = "//span[@class='button-primary-medium']")
    public static WebElement seeAlumni;

    public void viewSeeAlumni(){
        seeAlumni.click();
    }
}
