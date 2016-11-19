

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class hjhj {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://accounts.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testGmail() throws Exception {
        driver.get(baseUrl + "/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
        driver.findElement(By.id("firstname-placeholder")).click();
        assertTrue(isElementPresent(By.id("FirstName")));
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("binni");
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("venepalli");
        driver.findElement(By.id("GmailAddress")).clear();
        driver.findElement(By.id("GmailAddress")).sendKeys("binnivenepalli");
        driver.findElement(By.id("Passwd")).click();
        driver.findElement(By.id("Passwd")).click();
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("shah2010");
        driver.findElement(By.id("PasswdAgain")).clear();
        driver.findElement(By.id("PasswdAgain")).sendKeys("shah0`0");
        driver.findElement(By.id(":6")).click();
        driver.findElement(By.id("PasswdAgain")).clear();
        driver.findElement(By.id("PasswdAgain")).sendKeys("shah2010");
        driver.findElement(By.id(":7")).click();
        driver.findElement(By.id("BirthDay")).clear();
        driver.findElement(By.id("BirthDay")).sendKeys("5");
        driver.findElement(By.id("birthyear-placeholder")).click();
        driver.findElement(By.id("BirthYear")).clear();
        driver.findElement(By.id("BirthYear")).sendKeys("1987");
        driver.findElement(By.id(":e")).click();
        driver.findElement(By.id("RecoveryPhoneNumber")).click();
        driver.findElement(By.id("RecoveryPhoneNumber")).clear();
        driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("+447912213879");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
