package com.td.tests;

import com.core.TestBase;
import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(HomePageValidations.class);


    @Test
    public void validateAppIsLaunching() {
        ExtentTestManager.log("app launched", LOGGER);
        System.out.println(driver.getPageSource());
    }
}
