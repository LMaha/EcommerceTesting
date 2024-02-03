package Mobile.ExtendFromCore;

import Mobile.Pages.HomePage;
import Mobile.Pages.MobilePage;


import com.Comp.coreUI.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class AllTest extends BaseTest
{
    public HomePage hp;
    public MobilePage mp;

    public void initAllPages()
    {
        hp= new HomePage(driver);
        mp = new MobilePage(driver);

    }
    @BeforeTest
    @Parameters({"browser", "env"})
    @Override
    public void Setup(@Optional("")String browser, @Optional("")String env)
    {
        super.Setup(browser, env);

    }


}
