package com.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static  AppiumDriver driver;

    @Parameters({"platform","deviceName","platformVersion"})
    @BeforeMethod
    public static void getAppiumDriver(String platform,String deviceName, String platformVersion) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        if(platform.equalsIgnoreCase("android")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.tdbank");
            cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.td.dcts.android.us.app.SplashScreenActivity");
            driver = new AndroidDriver(new URL("http://localhost:4724/wd/hub"), cap);
        }else {
            //code for ios
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
