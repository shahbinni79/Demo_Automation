import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 15/11/2016.
 */
public class Utility {
    protected static WebDriver driver = new FirefoxDriver();


    public static void enterText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static void ClickOnElement (By by){
        driver.findElement(by).click();
    }
    public static void selectElementByValue (By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);

    }
    public static void selectElementByVisibletext (By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }
    public static void selectElementByIndex (By by, int integer){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(integer);
    }
    public  static void webDriverWaitImplicitly (int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    public static void webDriverWaitExplicitly (By by, int time){
        WebDriverWait explicitlyWait = new WebDriverWait(driver, time);
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static String getText (By by){
       return driver.findElement(by).getText();

    }
    public static String randomDate (){
        DateFormat Randomdate = new SimpleDateFormat("ddMMYYHHMMsss");
        return Randomdate.format(new Date());
    }
    public static boolean isTextPresent(String text)
    {
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }
    public static boolean isElementpresent(By by)
    {
        return driver.findElement(by).isDisplayed();
    }



}
