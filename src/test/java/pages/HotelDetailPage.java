package pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebElement;
import utils.driver.BaseClass;

public class HotelDetailPage extends BaseClass {
    private static HotelDetailPage instance;
    private static WebElement reseverNow = driver.findElementByCssSelector("[data-selenium=\"ChildRoomsList-bookButtonInput\"]");
    private static WebElement searchText = driver.findElementByCssSelector("[data-selenium=\"textInput\"]");
    private static WebElement chechInText = driver.findElementByCssSelector("[data-selenium=\"checkInText\"]");
    private static WebElement checkOutText = driver.findElementByCssSelector("[data-selenium=\"checkOutText\"]");

    public static synchronized HotelDetailPage getInstance() {
        if (instance == null) {
            instance = new HotelDetailPage();
        }
        return instance;
    }

    @Step("Click first deal in the list")
    public void clickReserveNow() {
        reseverNow.click();
    }

    public String getTextSearchText() {
        return searchText.getText();
    }

    public String getTextcheckInText() {
        return chechInText.getText();
    }

    public String getTextcheckOutText() {
        return checkOutText.getText();
    }
}
