import org.openqa.selenium.By;
import org.testng.Assert;

public class LandingPagePo extends BasePage {

    private final String rdbuslogo = "(//div[@id='rdc-header']//img)[1]";

    public void VerifyUserisabletolandinlandinpage() {
        driver.findElement(By.xpath((rdbuslogo)));
        Assert.assertEquals("test", "test");
    }


}
