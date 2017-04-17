package com.epam.argosproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Hleb_Matsiash on 4/10/2017.
 */
public class MainPageArgos extends AbstractPage {

    private final static String BASE_URL = "http://www.argos.co.uk/";

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/header[1]/nav/div[2]/div/nav/ul/li[1]/ul/ul[1]/li/ul/li[4]/a")
    private WebElement k4TVMenuPoint;

    //@FindBy(xpath = ".//*[@target='_self' AND @data-reactid='62']")
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/header[1]/nav/div[2]/div/nav/ul/li[1]/a")
    private WebElement technologyMenuPoint;



    public MainPageArgos(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void openPage() {
        driver.navigate().to(BASE_URL);

    }

    public String checkMenuinMainPages() throws InterruptedException {
        Actions builder = new Actions(driver);
        builder.moveToElement(technologyMenuPoint).perform();
        Thread.sleep(2000);
        k4TVMenuPoint.click();
        return driver.getTitle();

    }




}
