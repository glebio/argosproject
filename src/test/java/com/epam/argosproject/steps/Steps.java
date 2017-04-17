package com.epam.argosproject.steps;

import com.epam.argosproject.driver.DriverSingleton;
import com.epam.argosproject.pages.MainPageArgos;
import org.openqa.selenium.WebDriver;

/**
 * Created by Hleb_Matsiash on 4/10/2017.
 */
public class Steps {

    private WebDriver driver;

    public void initBrowser() {
        driver = DriverSingleton.getDriver();
    }

    public void closeDriver() {
        DriverSingleton.closeDriver();
    }

    public String checkMenuInMainPagesStep() throws InterruptedException {
        MainPageArgos mainPageArgos = new MainPageArgos(driver);
        mainPageArgos.openPage();
        return mainPageArgos.checkMenuinMainPages();
    }

}
