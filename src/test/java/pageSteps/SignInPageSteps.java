package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.HomePage;
import pages.SignInPage;

public class SignInPageSteps {
    private static SignInPage signInPage = SignInPage.getInstance();
    private static HomePage homePage = HomePage.getInstance();

    @Step("Click signin button")
    public void clickSignInButton() {
        homePage.clickSignIn();
    }

    @Step("Click mobile tab")
    public void clickMobileTab() {
        signInPage.clickmobileTab();
    }

    @Step("Enter number 5302426873 field")
    public void enterMobileNumber() {
        signInPage.entermobileTextBox("5302426873");
    }

    @Step("Enter password Aa123456 field")
    public void enterPassword() {
        signInPage.enterpasswordTextBox("Aa123456");
    }

    @Step("Click login button")
    public void clickLoginButton() throws InterruptedException {
        signInPage.clickLoginButton();
    }
}
