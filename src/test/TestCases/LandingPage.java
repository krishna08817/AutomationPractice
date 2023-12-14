import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LandingPage extends LandingPagePo{

    @Test(description="Verify user is able to navigate to landing page")
    public void Landinpagevalidation()
    {
        VerifyUserisabletolandinlandinpage();
    }

    @Test
    public void Searchbutton() {
        driver.findElement((By.xpath("//input[@id='src']"))).click();
        driver.findElement((By.xpath("//input[@id='src']"))).sendKeys("Hyderabad");
    }

    @Test
    public void promocode()
    {
        //place holder for promocode validations
    }
}
