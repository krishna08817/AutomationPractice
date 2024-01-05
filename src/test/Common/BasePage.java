package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BasePage {

      public  WebDriver driver;
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




    public void closeWindowWithRobotClass() throws AWTException {
            Robot rb=new Robot();
            rb.keyPress(KeyEvent.VK_ESCAPE);

        }
        public void scrollPagedownWithRobot() throws AWTException {
            Robot rb=new Robot();
            rb.keyPress(KeyEvent.VK_PAGE_DOWN);
        }
        public void scrollPagEuPWithRobot() throws AWTException {
            Robot rb=new Robot();
            rb.keyPress(KeyEvent.VK_PAGE_UP);
        }
        public void clickOnElement(WebElement element)
        {
            element.click();
        }
    }




