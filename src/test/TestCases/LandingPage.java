package TestCases;

import org.testng.annotations.Test;
import src.test.PageObjects.LandingPagePO;

import java.awt.*;

public class LandingPage extends BaseClass {

    @Test
    public void verifyBusTickets()
    {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.clickBusTickets();
    }
    @Test
    public void verifyOtpisEnabled() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.clickAccount();
        lPO.clickLogin();
        lPO.switchToFrame();
        lPO.enterPhoneNum("9087874047");

    }
    @Test
    public void verifyFromInput() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.setFromStart("chennai","Koyambedu");

    }

    @Test
    public void verifyToInput() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.setTodest("hyderabad","Ameerpet");
    }
    @Test
    public void verifyDateCalender() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.clickOnDate();
        Thread.sleep(5000);
        // lPO.setDate("Jan","2024","6");
        lPO.getMonthandYear();
    }
    @Test
    public void verify() throws InterruptedException {
        LandingPagePO lpo=new LandingPagePO(driver);
        getUrl();
        lpo.clickOnDate();
        Thread.sleep(5000);
        lpo.getMonthandYear();
        lpo.dummytest();
        Thread.sleep(5000);
        lpo.clickOnSearchBuses();
    }
    @Test
    public void verifyBookCab() throws AWTException {
        LandingPagePO lpo=new LandingPagePO(driver);
        getUrl();
        // cp.scrollPagedownWithRobot();
        lpo.clickOnBookCab();

    }
}
