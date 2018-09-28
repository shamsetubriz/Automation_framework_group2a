package keyWordDriven;

import base.CommonAPI;

public class Features extends CommonAPI {
   /* HomePage objectHomePage = PageFactory.initElements(driver, HomePage.class);
    FeedPage objectFeedPage = PageFactory.initElements(driver, FeedPage.class);
    SignInPage objectSigninPage = PageFactory.initElements(driver, SignInPage.class);
    UniversityPage objectUniversityPage = PageFactory.initElements(driver, UniversityPage.class);
    NewYorkUniversity objectNewYorkUniversity = PageFactory.initElements(driver, NewYorkUniversity.class);
    ByInputFromXls objectByInputFromXls = PageFactory.initElements(driver, ByInputFromXls.class);
    //KeyWord ClickUniversityLink
    public void clickUniversityLink(){
        objectHomePage.clickUniversityLink();
    }
    //KeyWord SignInToLinkedInAccount
    public void signInToLinkedInAccount(){
        objectSigninPage.signInToLinkedInAccount();
    }
    //KeyWord Click University Link
    public void goToNewYorkUniversityPage(){
        objectUniversityPage.goToNewYorkUniversityPage();
    }
    //Keyword View See Alumni
    public void viewSeeAlumni(){
        objectNewYorkUniversity.viewSeeAlumni();
    }

    public void selectAction(String featureName) throws InterruptedException {
        switch (featureName) {
            case "clickUniversityLink":
                clickUniversityLink();
                break;
            case "signInToLinkedInAccount":
                signInToLinkedInAccount();
                break;
            case "goToNewYorkUniversityPage":
                goToNewYorkUniversityPage();
                break;
            case "viewSeeAlumni":
                viewSeeAlumni();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    public void selectFeature() throws IOException, InterruptedException {
        String[] keyword = objectByInputFromXls.getDataFromSignInKeyword("Key.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }*/
}
