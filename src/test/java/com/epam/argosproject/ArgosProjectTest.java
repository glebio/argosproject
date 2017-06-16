package com.epam.argosproject;

import com.epam.argosproject.steps.Steps;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Hleb_Matsiash on 4/10/2017.
 */
public class ArgosProjectTest {

    private Steps steps;

    @BeforeClass(description = "Init browser")
    public void setUp() {
        steps = new Steps();
        steps.initBrowser();
    }

    @Test
    public void testCheckMenu() throws InterruptedException {
        Assert.assertEquals(steps.checkMenuInMainPagesStep(), "4K TV | Go Argos");
    }


    @AfterClass(description = "Stop Browser")
    public void stopBrowser() {
        steps.closeDriver();
    }

}
