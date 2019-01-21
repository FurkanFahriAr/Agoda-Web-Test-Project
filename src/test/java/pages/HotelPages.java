package pages;

import pageElement.Button;
import pageElement.PageElementModel;
import pageElement.TextBox;

public class HotelPages {
    private static HotelPages instance;
    private static TextBox maxPrice = new TextBox(PageElementModel.selectorNames.XPATH, "//*[@id=\"price_box_1\"]");
    private static Button hotelCard = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"hotel-info\"]");
    private static Button searchText = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"textInput\"]");

    public static synchronized HotelPages getInstance() {
        if (instance == null) {
            instance = new HotelPages();
        }
        return instance;
    }

    public void enterMaxPrice(String keyword) {
        maxPrice.clearText();
        maxPrice.waitUntilVisibleAndType(keyword);
        maxPrice.sendEnter();
    }

    public void clickHotelCard() {
        hotelCard.clickAndSwitchFocusTab();
    }
}
