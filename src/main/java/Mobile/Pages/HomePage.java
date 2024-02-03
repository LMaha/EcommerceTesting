package Mobile.Pages;

import Mobile.ExtendFromCore.AllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AllPages
{

    private final By pageheadXpath = By.xpath("//img[@class='large']");
    private final By pageHeadCss = By.cssSelector(".large");

    private final By mobilelinkXpath = By.xpath("//a[normalize-space()='Mobile']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void GoToMobilePage()
    {
        Click(mobilelinkXpath);
    }


}
