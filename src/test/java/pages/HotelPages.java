package pages;

import org.openqa.selenium.WebElement;
import utils.driver.BaseClass;

public class HotelPages extends BaseClass {
    private static HotelPages instance;
    private static WebElement maxPrice = driver.findElementByCssSelector("[id=\"price_box_1\"]");
    private static WebElement hotelCard = driver.findElementsByCssSelector("[class=\"hotel-item-box\"]").get(0);
    private static WebElement searchText = driver.findElementByCssSelector("[data-selenium=\"textInput\"]");
    private static WebElement checkInText = driver.findElementByCssSelector("[data-selenium=\"checkInText\"]");
    private static WebElement checkOutText = driver.findElementByCssSelector("[data-selenium=\"checkOutText\"]");

    public static synchronized HotelPages getInstance() {
        if (instance == null) {
            instance = new HotelPages();
        }
        return instance;
    }

    public void enterMaxPrice(String keyword) {
        maxPrice.sendKeys(keyword);
    }

    public void clickHotelCard() {
        hotelCard.click();
    }

    public String getTextSearchText() {
        return searchText.getText();
    }

    public String getTextcheckInText() {
        return checkInText.getText();
    }

    public String getTextcheckOutText() {
        return checkOutText.getText();
    }

}