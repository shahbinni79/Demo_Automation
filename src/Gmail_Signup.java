import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

/**
 * Created by welcome on 18/11/2016.
 */
public class Gmail_Signup extends Utility {
    public static void main(String[] args) {

        Utility.webDriverWaitImplicitly(10);
//        driver.get("https://www.google.com/gmail/about/");
//        Assert.assertEquals(Utility.getText(By.xpath("//div")),"Gmail");
//        Utility.ClickOnElement(By.xpath("//a[contains(text(),'Create an account')]"));
        driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
        System.out.println(Utility.getText(By.cssSelector("h1")));
        Assert.assertEquals("Create your Google Account",Utility.getText(By.cssSelector("h1")));
        Utility.ClickOnElement(By.id("firstname-placeholder"));
        assertTrue(Utility.isElementpresent(By.id("FirstName")));
        Utility.enterText(By.id("FirstName"),"Binni");
        Utility.enterText(By.id("LastName"),"Venepalli");
        Utility.enterText(By.id("GmailAddress"),"venepallibinni");
        Utility.enterText(By.id("Passwd"),"kake2026");
        Utility.enterText(By.id("PasswdAgain"),"kake2026");
        System.out.println("Enter birthmonth");
       // Utility.ClickOnElement(By.id("BirthMonth"));
        driver.findElement(By.xpath("//div[@role='listbox']")).sendKeys("July");
        System.out.println("Month of Birth is July");
        Utility.enterText(By.id("BirthDay"),"6");
        Utility.enterText(By.id("BirthYear"),"1985");
        System.out.println("DOB entered");
        driver.findElement(By.xpath("//div[@id='Gender']/div[@role='listbox']")).sendKeys("Female");
        Utility.ClickOnElement(By.id("submitbutton"));
        driver.quit();


    }
}
