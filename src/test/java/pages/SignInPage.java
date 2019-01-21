package pages;


import pageElement.Button;
import pageElement.PageElementModel;
import pageElement.TextBox;

public class SignInPage {
    private static SignInPage instance;
    private static TextBox mobileTextBox = new TextBox(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"signin-mobile-input\"]");
    private static TextBox passwordTextBox = new TextBox(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"signin-mobile-password-input\"]");
    private static Button mobileTab = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"switcher-tab-mobile\"]");
    private static Button loginButton = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"signin-mobile-button\"]");

    public static synchronized SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    public void entermobileTextBox(String keyword) {
        mobileTextBox.waitUntilVisibleAndType(keyword);
    }

    public void enterpasswordTextBox(String keyword) {
        passwordTextBox.waitUntilVisibleAndType(keyword);
    }

    public void clickmobileTab() {
        mobileTab.waitUntilVisibleAndClick();
    }

    public void clickLoginButton() throws InterruptedException {
        loginButton.clickAndWait();
    }
}
