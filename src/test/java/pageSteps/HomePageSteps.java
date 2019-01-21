package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.HomePage;

public class HomePageSteps {
    private static HomePage homePage = HomePage.getInstance();

    @Step("Enter Paris in the destination")
    public void enterDestination() {
        homePage.enterSearchBox("Paris");
    }

    @Step("Click first item on the suggestion list")
    public void clickautosuggestItem() {
        homePage.clickautosuggestItem();
    }

    @Step("Click checkin and out day")
    public void clickcheckInOutDay() {
        homePage.clickcheckInDay();
        homePage.clickcheckOutDay();
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
