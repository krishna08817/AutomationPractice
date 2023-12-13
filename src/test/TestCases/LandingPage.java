import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LandingPage extends LandingPagePo{

    @Test
    public void Landinpagevalidation()
    {
        VerifyUserisabletolandinlandinpage();
    }

    @Test
    public void Searchbutton() {
        driver.findElement((By.xpath("//input[@id='src']"))).click();
        driver.findElement((By.xpath("//input[@id='src']"))).sendKeys("Hyderabad");
    }
}
