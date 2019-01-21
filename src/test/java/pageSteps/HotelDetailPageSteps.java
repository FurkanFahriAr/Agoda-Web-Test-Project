package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.HotelDetailPage;


public class HotelDetailPageSteps {
    private static HotelDetailPage hotelDetailPage = HotelDetailPage.getInstance();

    @Step("Click first reserve now button in the list")
    public void clickHotelCard() {
        hotelDetailPage.clickReserveNow();
    }
}
