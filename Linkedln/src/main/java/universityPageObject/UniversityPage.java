package universityPageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UniversityPage extends CommonAPI {

    @FindBy(xpath = "//a[@title='New York University']")
    public static WebElement newYorkUniversity;

    public void goToNewYorkUniversityPage(){
        newYorkUniversity.click();
    }

}
