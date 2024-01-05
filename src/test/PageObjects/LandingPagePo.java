package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LandingPagePO {

    WebDriver driver;
    @FindBy(xpath="//li[@id='bus_tickets_vertical']")
    WebElement BusTickets;
    @FindBy(xpath="//li[@id='cab_rental_vertical']")
    WebElement CabRental;
    @FindBy(xpath = "//li[@id='rail_tickets_vertical']")
    WebElement TrainTicket;
    @FindBy(xpath="//span[text()='Account']")
    WebElement Account;
    @FindBy(xpath="//span[text()='Login/ Sign Up']")
    WebElement Login;
    @FindBy(xpath = "//iframe[@class='modalIframe']")
    WebElement SigninFrame;
    @FindBy(xpath="//input[@id='mobileNoInp']")
    WebElement PhoneNum;
    @FindBy(xpath="//div[@id='otp-container']")
    WebElement Otp;
    @FindBy(xpath="//input[@id='src']")
    WebElement From;
    @FindBy(xpath="//input[@id='dest']")
    WebElement To;
    @FindBy(xpath = "//span[text()='Date']")
    WebElement Date;
    @FindBy(xpath = "//button[@id='search_button']")
    WebElement SearchBuses;
    @FindBy(xpath = "(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")
    WebElement NextMonandYearNavigator;
    @FindBy(xpath="(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")
    WebElement MonthandYear;
    @FindBy(xpath = "(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[1]")
    WebElement PreviousMonthandYearNavigator;

    @FindBy(xpath="(//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA'])[1]")
    WebElement Dummy;
    @FindBy(xpath="//a[text()='Book Cab / Bus Rental']")
    WebElement BookCab;

    public LandingPagePO(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void clickBusTickets()
    {
        BusTickets.click();
    }
    public void clickCabRental()
    {
        CabRental.click();
    }
    public void clickTrainTickets()
    {
        TrainTicket.click();
    }
    public void clickAccount()
    {
        Account.click();
    }
    public void clickLogin()
    {
        Login.click();
    }
    public void switchToFrame()
    {
        driver.switchTo().frame(SigninFrame);
    }
    public void clickOnDate() {
        Date.click();
    }
    public void clickOnSearchBuses()
    {
        SearchBuses.click();
    }



    public void setFromStart(String from,String area) throws InterruptedException {
        From.sendKeys(from);
        Thread.sleep(5000);
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//descendant::text[@class='placeHolderMainText']"));
        for(int i=0;i<list.size();i++)
        {
            String Actual =list.get(i).getText();
            if(Actual.contains(area))
            {
                list.get(i).click();
                Thread.sleep(5000);
                System.out.println("selected area");
                break;
            }
        }
    }
    public void enterPhoneNum(String s) throws InterruptedException {
        PhoneNum.sendKeys(s);
        Thread.sleep(5000);
        Boolean a=Otp.isEnabled();
        System.out.println(a);
        String Text=driver.findElement(By.xpath("(//span[@class='f-w-b'])")).getText();
        System.out.println(Text);
        driver.switchTo().defaultContent();


    }
    public void setTodest(String to, String area) throws InterruptedException {
        To.sendKeys(to);
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//descendant::text[@class='placeHolderMainText']"));
        for(int i=0;i<list.size();i++)
        {
            String Actual =list.get(i).getText();
            if(Actual.contains(area))
            {
                list.get(i).click();
                Thread.sleep(5000);
                System.out.println("selected area");
                break;
            }
        }

    }
    public void handleDate(String bMonth, String bYear,String bDate ) {
        java.util.Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = dateFormat.format(currentDate);
        System.out.println(currentDateTime);
        String[] monthDateYear = currentDateTime.split(" ");
        System.out.println(monthDateYear[0]);
        String year = monthDateYear[0].split("-")[0].trim();
        String month = monthDateYear[0].split("-")[1].trim();
        String date = monthDateYear[0].split("-")[2].trim();
        System.out.println(month + " " + year + " " + date);

        while (!month.equals(bMonth) && year.equals(bYear)) {

        }
    }
    public void setDate(String a,String b,String c){
        String MonthAndYear=MonthandYear.getText();
        String Month=MonthAndYear.split(" ")[0].trim();
        String Year=MonthAndYear.split(" ")[1].trim();

        while(!(Month.equals(a)&&Year.equals(b))) {
            NextMonandYearNavigator.click();
            MonthAndYear=MonthandYear.getText();
            Month=MonthAndYear.split(" ")[0].trim();
            Year=MonthAndYear.split(" ")[1].trim();
        }
        if (Month.equals(a)&&Year.equals(b)) {
            List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj\"]//child::span"));
            for(int i=0;i<list.size();i++)
            {
                String date=list.get(i).getText();
                if(date.equals(c))
                {
                    list.get(i).click();
                    System.out.println("entered date");
                    break;
                }
            }
        }

    }
    public void getMonthandYear()
    {
        WebElement e=driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"));
       /* WebElement f= driver.findElement(By.xpath("//div[@class='sc-jzJRlG dPBSOp']"));
        //driver.switchTo().frame(f);
       /* WebElement e=driver.findElement(By.xpath("(//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH'])[3]"));
        a.click(e).build().perform();*/
       /*String s= MonthandYear.getTagName();
       System.out.println(s);*/

        String s=e.getText();
        System.out.println(s);

    }
    public void dummytest()
    {
        Dummy.click();
    }


    public void clickOnBookCab() {
        BookCab.click();
    }
}
