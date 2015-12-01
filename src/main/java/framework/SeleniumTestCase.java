package framework;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Lena on 07.07.2014.
 */
public class SeleniumTestCase extends WebDriverCommands {

    public static String fileName = "";

    @BeforeMethod
    public void setUp(){


        FirefoxProfile profile = new ProfilesIni().getProfile("WebDriver");
        driver = new FirefoxDriver(profile);

        driver.manage().timeouts().pageLoadTimeout(SELENIUM_PAGE_LOAD_TIMEOUT_SECONDS, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get(BASE_URL);

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
