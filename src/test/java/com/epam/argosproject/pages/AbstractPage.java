package com.epam.argosproject.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Hleb_Matsiash on 4/10/2017.
 */
public abstract class AbstractPage {

    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void openPage();
}
