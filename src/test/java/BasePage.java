import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BasePage {
    WebDriver driver=new ChromeDriver();

    @BeforeClass
    public void dirverinitialization()

    {


        driver.get("");


    }

}
