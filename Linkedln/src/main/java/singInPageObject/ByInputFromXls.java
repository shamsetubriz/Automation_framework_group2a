package singInPageObject;

import base.CommonAPI;
import utility.DataReader;

public class ByInputFromXls extends CommonAPI {

    DataReader dtr = new DataReader();

    /*public String[] getDataCol2(String fileName) throws IOException {
        String path = "../AliBaba/data/" + fileName;
        String[] output = dtr.colReader(path, 2); //col 2 = email
        return output;
    }

    public String[] getDataCol3(String fileName) throws IOException {
        String path = "../AliBaba/data/" + fileName;
        String[] output = dtr.colReader(path, 3); //col 3 = password
        return output;
    }

    public String[] getAssertData(String fileName) throws IOException {
        String path = "../AliBaba/data/" + fileName;
        String[] output = dtr.colReader(path, 4);
        return output;
    }

    LogIn by  using excel sheet data
    public String[] getVerificationValue(String fileName) throws IOException, InterruptedException {
        String[] col2Value = getDataCol2(fileName);
        String[] col3Value = getDataCol3(fileName);
        String[] actual = new String[col2Value.length];
        for (int i = 0; i < col2Value.length; i++) {
            inputValueInTextBoxByWebElement(account, col2Value[i]);
            sleepFor(5);
            inputValueInTextBoxByWebElement(password, col3Value[i]);
            sleepFor(5);
            // actual[i] = getCurrentPageTitle();
            actual[i] = getTextByWebElement(signInErrorMesage);
            sleepFor(5);
            System.out.println(actual[i]);
            clearInputBox(account);
            clearInputBox(password);
        }
        return actual;
    }
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../AliBaba/data/" + fileName;
        String[] output = dtr.colReader(path, 2); //col 2 = email
        return output;
    }*/
}


