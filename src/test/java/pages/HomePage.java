package pages;

import pageElement.*;

public class HomePage {
    private static HomePage instance;
    private static Button signInButton = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"sign-in\"]");
    private static Button checkInBox = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"checkInBox\"]");
    private static Button autosuggestItem = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"autosuggest-item\"]");
    private static Label checkInText = new Label(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"checkInText\"]");
    private static Label checkOutText = new Label(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"checkOutText\"]");
    private static Button occupancyBox = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"occupancyBox\"]");
    private static Button travelerFamilies = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"traveler-families\"]");
    private static Button plusChildren = new Button(PageElementModel.selectorNames.XPATH, "//*[@id=\"SearchBoxContainer\"]/div/div/div[5]/div/div/div/div[2]/div/div[3]/span[4]");
    private static Button checkInDay = new Button(PageElementModel.selectorNames.XPATH, "//*[@aria-label=\"Fri Feb 01 2019\"]");
    private static Button checkOutDay = new Button(PageElementModel.selectorNames.XPATH, "//*[@aria-label=\"Sun Feb 03 2019\"]");
    private static Button searchButton = new Button(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"searchButton\"]");
    private static Select dropDownChildAge = new Select(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"dropdownInput\"]");
    private static TextBox searchBox = new TextBox(PageElementModel.selectorNames.XPATH, "//*[@data-selenium=\"textInput\"]");


    public static synchronized HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    public void enterSearchBox(String keyword) {
        searchBox.waitUntilVisibleAndType(keyword);
    }

    public void clickSignIn() {
        signInButton.waitUntilVisibleAndClick();
    }

    public void clickcheckInDay() {
        checkInDay.waitUntilVisibleAndClick();
    }

    public void clickcheckOutDay() {
        checkOutDay.waitUntilVisibleAndClick();
    }

    public void clicktravelerFamilies() {
        travelerFamilies.waitUntilVisibleAndClick();
    }

    public void clickplusChildren() {
        plusChildren.waitUntilVisibleAndClick();
    }

    public void clicksearchButton() {
        searchButton.clickAndWait(10);
    }

    public void clickautosuggestItem() {
        autosuggestItem.waitUntilVisibleAndClick();
    }

    public void selectdropDownChildAge() {
        dropDownChildAge.selectByValue("5");
    }

    public String getTextcheckInText() {
        return checkInText.getLabelText();
    }

    public String getTextcheckOutText() {
        return checkOutText.getLabelText();
    }


}


