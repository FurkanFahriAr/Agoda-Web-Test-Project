package pages;

import org.openqa.selenium.WebElement;
import utils.driver.BaseClass;

public class SignInPage extends BaseClass {
    private static SignInPage instance;
    private static WebElement mobileTextBox = driver.findElementByCssSelector("[data-selenium=\"signin-mobile-input\"]");
    private static WebElement passwordTextBox = driver.findElementByCssSelector("[data-selenium=\"signin-password-input\"]");
    private static WebElement mobileTab = driver.findElementByCssSelector("[data-selenium=\"switcher-tab-mobile\"]");
    private static WebElement loginButton = driver.findElementByCssSelector("[data-selenium=\"signin-mobile-button\"]");

    public static synchronized SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    public void entermobileTextBox(String keyword) {
        mobileTextBox.sendKeys(keyword);
    }

    public void enterpasswordTextBox(String keyword) {
        passwordTextBox.sendKeys(keyword);
    }

    public void clickmobileTab() {
        mobileTab.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
