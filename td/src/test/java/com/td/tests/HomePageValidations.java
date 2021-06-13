package com.td.tests;

import com.core.TestBase;
import org.testng.annotations.Test;

public class HomePageValidations  extends TestBase {

    @Test
    public void validateAppIsLaunching(){
        System.out.println(driver.getPageSource());
    }
}
