package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.driver.BaseClass;

public class HomePage extends BaseClass {
    private static HomePage instance;
    private static WebElement searchBox = driver.findElementByCssSelector("[data-selenium=\"textInput\"]");
    private static WebElement signInButton = driver.findElementByCssSelector("[data-selenium=\"sign-in\"]");
    private static WebElement checkInBox = driver.findElementByCssSelector("[data-selenium=\"checkInBox\"]");
    private static WebElement autosuggestItem = driver.findElementsByCssSelector("[data-selenium=\"autosuggest-item\"]").get(0);
    private static WebElement checkInText = driver.findElementByCssSelector("[data-selenium=\"checkInText\"]");
    private static WebElement checkOutText = driver.findElementByCssSelector("[data-selenium=\"checkOutText\"]");
    private static WebElement occupancyBox = driver.findElementByCssSelector("[data-selenium=\"occupancyBox\"]");
    private static WebElement travelerFamilies = driver.findElementByCssSelector("[data-selenium=\"traveler-families\"]");
    private static WebElement plusChildren = driver.findElementByCssSelector("[data-element-name=\"occupancy-selector-panel-children\"]");
    private static WebElement searchButton = driver.findElementByCssSelector("[data-selenium=\"searchButton\"]");
    private static WebElement checkInday = driver.findElementsByCssSelector("[role=\"gridcell\"]").get(31);
    private static WebElement checkOutday = driver.findElementsByCssSelector("[role=\"gridcell\"]").get(33);
    private static Select dropDownChildAge = new Select(driver.findElementByCssSelector("[data-selenium=\"traveler-families\"]"));

    public static synchronized HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    public void enterSearchBox(String keyword) {
        searchBox.sendKeys(keyword);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void clickcheckInBox() {
        checkInBox.click();
    }

    public void clickoccupancyBox() {
        occupancyBox.click();
    }

    public void clicktravelerFamilies() {
        travelerFamilies.click();
    }

    public void clickplusChildren() {
        plusChildren.click();
    }

    public void clicksearchButton() {
        searchButton.click();
    }

    public void clickcheckInday() {
        checkInday.click();
    }

    public void clickautosuggestItem() {
        autosuggestItem.click();
    }

    public void clickcheckOutday() {
        checkOutday.click();
    }

    public void selectdropDownChildAge() {
        dropDownChildAge.selectByIndex(5);
    }

    public void getTextcheckInText() {
        checkInText.click();
    }

    public void getTextcheckOutText() {
        checkOutText.click();
    }


}


