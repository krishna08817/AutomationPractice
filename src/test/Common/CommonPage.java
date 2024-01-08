package Common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class CommonPage {

WebDriver driver;
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


    }




