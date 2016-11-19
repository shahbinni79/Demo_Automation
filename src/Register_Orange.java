import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by welcome on 15/11/2016.
 */
public class Register_Orange extends Utility {
    public static void main(String[] args) throws InterruptedException {
        String username = "username"+ Utility.randomDate();
        Utility.webDriverWaitImplicitly(10);
        driver.get("http://opensource.demo.orangehrmlive.com/");
        Assert.assertEquals(Utility.getText(By.id("logInPanelHeading")),"LOGIN Panel");
        Utility.enterText(By.name("txtUsername"),"Admin");
        Utility.enterText(By.id("txtPassword"),"admin");
        Utility.ClickOnElement(By.id("btnLogin"));
        Assert.assertEquals(Utility.getText(By.id("welcome")),"Welcome Admin");
        System.out.println("Welcome Admin");
        Utility.ClickOnElement(By.cssSelector("b"));
        Utility.ClickOnElement(By.className("arrow"));
        Assert.assertTrue(Utility.isElementpresent(By.xpath("//input[@id='btnAdd']")));
        Utility.ClickOnElement(By.id("btnAdd"));
        Utility.webDriverWaitExplicitly(By.xpath("//h1[@id='UserHeading']"),5);
       // Assert.assertEquals(Utility.getText(By.xpath("//h1[@id='UserHeading ']")), "Add User");
        Utility.selectElementByVisibletext(By.className("formSelect"),"ESS");
        Utility.enterText(By.id("systemUser_employeeName_empName"),"Fiona Grace");
        Utility.enterText(By.id("systemUser_userName"),username);
        Utility.selectElementByValue(By.id("systemUser_status"),"1");
        Utility.enterText(By.name("systemUser[password]"),"stev1234");
        Utility.enterText(By.name("systemUser[confirmPassword]"),"stev1234");
        Utility.ClickOnElement(By.id("btnSave"));
        Thread.sleep(5000);
        Utility.webDriverWaitImplicitly(5);
       // Assert.assertEquals(Utility.isTextPresent(username),username);
       // System.out.println(Utility.isTextPresent(username));
    }
}
