package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apkYukleme {

    AndroidDriver<AndroidElement> driver; // Anadroid cihazlardaki islemleri yapabilmemizi saglayan driver objesi


    //  AndroidDriver<MobileElement> driver2; // Anadroid cihazlardaki islemleri yapabilmemizi saglayan driver objesi
    //  IOSDriver<IOSElement> iosDriver; // Ios cihazlardaki islemleri yapabilmemizi saglayan driver objesi
    //  AppiumDriver<MobileElement> appiumDriver; // her iki platformda da islemleri yapabilmemezi saglayan driver objesi


    @Test
    public void apkYukleme() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
        // capabilities.setCapability("deviceName","Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\zelihaselcuk\\IdeaProjects\\Appium_T127-main\\Appium_T127-main\\Apps\\all-currency-converter-3-9-0 (1).apk");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }



}
