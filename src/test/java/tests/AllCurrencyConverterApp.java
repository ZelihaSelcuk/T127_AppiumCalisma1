package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CurrencyConverterAppPage;
import utils.Driver;
import utils.ReusableMethods;

public class AllCurrencyConverterApp {



    CurrencyConverterAppPage ccap = new CurrencyConverterAppPage();

    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();



    @Test
    public void allCurrencyTest() throws InterruptedException {

        // all currency uygulamasinin yuklendigi dogulanir
        Assert.assertTrue(driver.isAppInstalled("com.smartwho.SmartAllCurrencyConverter"));

        // uygulamanin acildigi dogrulanir
        Assert.assertTrue(ccap.CurrencyConverterBaslik.isDisplayed());

        //Assert.assertTrue(driver.findElementByXPath("//*[@text='CURRENCY CONVERTER']").isDisplayed());
        Thread.sleep(2000);

        // cevirmek istedigimiz para birimi zloty olarak secilir
        ReusableMethods.koordinatTiklamaMethodu(46, 332, 1000);
        driver.getKeyboard().pressKey("Zloty");
        Thread.sleep(1000);
        ReusableMethods.koordinatTiklamaMethodu(218, 634, 1000);


        // cevirelecek olan para birimi Tl olarak secilir
        ReusableMethods.koordinatTiklamaMethodu(53, 481, 1000);
        driver.getKeyboard().pressKey("TRY");
        Thread.sleep(1000);
        ReusableMethods.koordinatTiklamaMethodu(218, 634, 1000);


        // cevrilen tutar screenShot olarak kaydedilir

        // Ardindan zloty nin tl karsiligi olan tl degeri kaydedilir
        ccap.ButtonCLR.click();
        ccap.Button1.click();
        Thread.sleep(1000);
        ReusableMethods.koordinatTiklamaMethodu(1038, 485, 1000);

        Thread.sleep(3000);
        String trydegeri = ccap.ekranUst.toString();

        // kullaniciya sms olarak bildirilir

        driver.sendSMS("5555555555", "TRY değeri = "+trydegeri);



    }
    }



