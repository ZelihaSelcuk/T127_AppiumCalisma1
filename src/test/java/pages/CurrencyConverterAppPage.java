package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CurrencyConverterAppPage {


    public CurrencyConverterAppPage() {

        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(), this);
    }

    @FindBy(xpath = "//*[@text='CURRENCY CONVERTER']")
    public WebElement CurrencyConverterBaslik;
    @FindBy(xpath = "//*[@text='1']")
    public WebElement Button1;
    @FindBy(xpath = "//*[@text='CLR']")
    public WebElement ButtonCLR;
    @FindBy(xpath = "//*[@text='1.00000']")
    public WebElement ekranAlt;
    @FindBy(xpath = "//*[@text='8.04306']")
    public WebElement ekranUst;

















}
