package TestCases;

import Common.BasePage;
import org.testng.annotations.Test;
import PageObjects.LandingPagePO;

import java.awt.*;

public class LandingPage extends BasePage{

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
        lPO.enterPhoneNum("personal");

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
    public void verifyBookCab() throws AWTException {
        LandingPagePO lpo=new LandingPagePO(driver);
        getUrl();
        // cp.scrollPagedownWithRobot();
        lpo.clickOnBookCab();
        ;

    }
}
