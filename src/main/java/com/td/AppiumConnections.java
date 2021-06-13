package com.td;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumConnections {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "R5CNA00LEQX");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.tdbank");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.td.dcts.android.us.app.SplashScreenActivity");

        AppiumDriver driver = new AndroidDriver(new URL("http://localhost:4724/wd/hub"), cap);

        System.out.println(driver.getPageSource());

        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@text='ACCOUNTS']")).click();
        Thread.sleep(2000);
    }

}
