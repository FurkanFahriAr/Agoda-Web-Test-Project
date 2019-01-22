package pages;

import pageElement.Button;
import pageElement.PageElementModel;
import utils.driver.Driver;

public class HotelDetailPage extends Driver {
    private static HotelDetailPage instance;
    private static Button reserveNow = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"ChildRoomsList-bookButtonInput\"]");

    public static synchronized HotelDetailPage getInstance() {
        if (instance == null) {
            instance = new HotelDetailPage();
        }
        return instance;
    }
    public void clickReserveNow() {
        reserveNow.waitUntilVisibleAndClick();
    }
}
