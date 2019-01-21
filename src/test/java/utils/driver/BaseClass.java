package utils.driver;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public static RemoteWebDriver driver;
    public static WebDriverWait wait;
    static String username = "yigithan.kadioglu%40duuple.com";
    static String authkey = "ue6cbbd3005412ae";

    @BeforeScenario
    public void setRemoteWebDriver() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("name", "Agoda");
        caps.setCapability("build", "1.0");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("version", "71X64");
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("screenResolution", "1920x1080");
        caps.setCapability("record_video", "true");
        caps.setCapability("record_network", "true");

        driver = new RemoteWebDriver(new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
        System.out.println(driver.getSessionId());

        System.out.println("Loading Url");
        driver.get("https://www.agoda.com/");

        System.out.println("Maximizing window");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        System.out.println("Waiting...");
    }

    @AfterScenario
    public void endSession() throws UnirestException {
        System.out.println("Test complete");
        driver.quit();
    }
}