package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.HotelDetailPage;
import pages.HotelPages;

public class HotelPageSteps {
    private static HotelPages hotelPages = HotelPages.getInstance();
    private static HotelDetailPage hotelDetailPage = HotelDetailPage.getInstance();

    @Step("Enter 750 in the max per day filter")
    public void clickcheckInday() {
        hotelPages.enterMaxPrice("750");
    }

    @Step("Click first hotel on the list")
    public void clickHotelCard() {
        hotelPages.clickHotelCard();
    }

}
