import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Gmailreg extends Util {

    // Create a webelement

    WebDriver driver;

    // Create a Method
    @Test(priority = 1)
    void openbrowser() throws InterruptedException {
        //Setup a path
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Driver\\Updated Drivers\\chromedriver.exe");
        // Create an instance
        driver = new ChromeDriver();
        // Navigate to webpage
        driver.get("https://accounts.google.com/AddSession/signinchooser?hl=en&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&authuser=0&flowName=GlifWebSignIn&flowEntry=AddSession");
        // Manage the window
        driver.manage().window().maximize();
    }
     @Test(priority = 2)
    void createAccount() throws InterruptedException {
        driver.findElement(By.xpath("//span[ text ( ) = 'Create account']")).click();
        driver.findElement(By.tagName("li")).click();
        // implicitly wait
        //  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        // Explicitly wait
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("firstName"))).sendKeys("Mnd");
        //    driver.findElement(By.id("firstName")).sendKeys("Mnd");
        driver.findElement(By.id("lastName")).sendKeys("DVDV");
        Thread.sleep(4000);
        driver.findElement(By.id("username")).sendKeys("abnhkklk123");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Ndnd2250");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Ndnd2250");
        driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
        // Generic method for dropdown
        // WebElement Month = driver.findElement(By.xpath("/select[@aria-labelledby = 'month-label']"));
        // SelectValueFromDropdown(Month,"June");
    }

    @Test(priority = 3)
    void close() {

        driver.close();

    }






   }



