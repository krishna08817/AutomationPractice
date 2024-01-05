package TestCases;

import Common.BasePage;
import org.testng.annotations.Test;
import PageObjects.LandingPagePO;
import PageObjects.TrainTicketBookingPagePO;

public class TrainTicketBookingPage extends BasePage {

@Test
    public void verifyPNRRadioButton() throws InterruptedException {
        LandingPagePO lpo=new LandingPagePO(driver);
        TrainTicketBookingPagePO tpo=new TrainTicketBookingPagePO(driver);
        getUrl();
        lpo.clickTrainTickets();
        Thread.sleep(5000);
        //tpo.verifyGetdateText();
        tpo.clickOnCheckPNRRadio();
    }
   @Test
    public void verifyGetDateText() throws InterruptedException {
        LandingPagePO lpo=new LandingPagePO(driver);
        getUrl();
        lpo.clickTrainTickets();
        TrainTicketBookingPagePO tpo=new TrainTicketBookingPagePO(driver);
        tpo.getdateText();
    }



}
