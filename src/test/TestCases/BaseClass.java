import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
    WebDriver driver;
    public void getUrl()
    {
        driver.get("URL");
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