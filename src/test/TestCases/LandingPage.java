package TestCases;

import TestCases.BaseClass;
import org.testng.annotations.Test;
import PageObjects.LandingPagePO;

import java.awt.*;

public class LandingPage extends BaseClass {

    @Test(description = "Verify the Bustickets logo on landing page ")
    public void verifyBusTickets()
    {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.clickBusTickets();
    }
    @Test(description = "verify the Otp Option in create account/login account is enabled by passing the valid data ")
    public void verifyOtpisEnabled() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.clickAccount();
        lPO.clickLogin();
        lPO.switchToFrame();
        lPO.enterPhoneNum("9087874047");

    }
    @Test(description = "Entering the  Input to from Text feild on landing page ")
    public void verifyFromInput() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.setFromStart("chennai","Koyambedu");

    }

    @Test(description = "Entering the Input to TO text feild on Landing Page ")
    public void verifyToInput() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.setTodest("hyderabad","Ameerpet");
    }
    @Test(description = "Clicking on BookCab which is in bottom of landing page")
    public void verifyBookCab() throws AWTException {
        LandingPagePO lpo=new LandingPagePO(driver);
        getUrl();
        // cp.scrollPagedownWithRobot();
        lpo.clickOnBookCab();

    }
}

