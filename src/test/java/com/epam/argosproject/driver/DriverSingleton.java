package com.epam.argosproject.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Hleb_Matsiash on 4/10/2017.
 */
public class DriverSingleton {

    private static WebDriver driver;

    private final static String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROMEDRIVER_EXE_PATH = "./src/test/resources/chromedriver.exe";

    private DriverSingleton() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty(WEBDRIVER_CHROME_DRIVER, CHROMEDRIVER_EXE_PATH);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }
}
