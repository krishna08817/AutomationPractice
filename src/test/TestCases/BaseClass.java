package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class BaseClass {
        WebDriver driver;
       // String url="https://www.redbus.in/";
        public void getUrl()
        {
            driver.get("https://www.redbus.in/");
        }

@BeforeClass
        public void setup()
        {
            driver=new ChromeDriver();
            driver.manage().window().maximize();
        }

@AfterClass
        public void tearDown()
        {
            driver.quit();
        }





    }


