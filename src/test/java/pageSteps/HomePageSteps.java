package pageSteps;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps {
    private static HomePage homePage = HomePage.getInstance();

    @Step("Enter Paris in the destination")
    public void clickSignInButton() {
        homePage.enterSearchBox("Paris");
    }

    @Step("Click first item on the suggestion list")
    public void clickautosuggestItem() {
        homePage.clickautosuggestItem();
    }

    @Step("Click check-in date")
    public void clickcheckInday() {
        homePage.clickcheckInday();
    }

    @Step("Click check-out date")
    public void clickcheckOutday() {
        homePage.clickcheckOutday();
    }

    @Step("Click family on the list")
    public void clicktravelerFamilies() {
        homePage.clicktravelerFamilies();
    }

    @Step("Click plus button in the child")
    public void clickplusChildren() {
        homePage.clickplusChildren();
    }

    @Step("Select 5 on the age list")
    public void selectdropDownChildAge() {
        homePage.selectdropDownChildAge();
    }

    @Step("Click search button")
    public void clicksearchButton() {
        homePage.clicksearchButton();
    }
}
