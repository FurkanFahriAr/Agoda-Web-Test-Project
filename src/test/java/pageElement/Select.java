package pageElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Select extends PageElementModel {
    private static final Log log = LogFactory.getLog(Select.class);

    public Select(selectorNames selectorName, String selectorValue) {
        super(selectorName, selectorValue);
    }

    public void selectByText(String text) {
        log.info("ABOUT TO SELECT: " + getLoggingName());
        WebElement we = null;
        try {
            we = getWebElement();
        } catch (NoSuchElementException e) {
            String error = "ELEMENT NOT FOUND: " + getLoggingName();
            log.error(error);
            throw new WebDriverException(error);
        }
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(we);
        try {
            select.selectByVisibleText(text);
        } catch (Exception e) {
            String error = "COULD NOT SELECT WITH TEXT: " + text + " FROM: " + getLoggingName();
            log.error(error);
            throw new WebDriverException(error);
        }
    }

    public void selectByValue(String value) {
        log.info("ABOUT TO SELECT: " + getLoggingName());
        WebElement we = null;
        try {
            we = getWebElement();
        } catch (NoSuchElementException e) {
            String error = "ELEMENT NOT FOUND: " + getLoggingName();
            log.error(error);
            throw new WebDriverException(error);
        }
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(we);
        try {
            select.selectByValue(value);
        } catch (Exception e) {
            String error = "COULD NOT SELECT WITH VALUE: " + value + " FROM: " + getLoggingName();
            log.error(error);
            throw new WebDriverException(error);
        }
    }

    public void waitUntilAndSelectByText(String text) {
        log.info("WAITING FOR SELECT: " + getLoggingName());
        waitUntilVisible();
        selectByText(text);
    }

    public void waitUntilAndSelectByValue(String value) {
        log.info("WAITING FOR SELECT: " + getLoggingName());
        waitUntilVisible();
        selectByValue(value);
    }
}
