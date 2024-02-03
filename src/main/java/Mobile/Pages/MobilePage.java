package Mobile.Pages;

import Mobile.ExtendFromCore.AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class MobilePage extends AllPages
{
    private final By mobileHeadingXpath = By.xpath("//h1[normalize-space()='Mobile']");
    private final By mobileHeadingCSS = By.cssSelector("div[class='page-title category-title'] h1");

    private final By selectDropDown = By.xpath("//div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]");
    private final By sortArrowXpth  = By.xpath("//div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/a");
    public final By productlist =  By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li");


    public MobilePage(WebDriver driver) {

        super(driver);
    }

    public void Selectsort(String text)
    {

        //Click(selectDropDown);
        SelectByText(selectDropDown,text);
        Click(sortArrowXpth );
    }

    public void VerifySort(By locator, String text)
    {
         List<WebElement> prodlist = FindElements(locator);
         String[] beforeSort = new String[prodlist.size()];
         for(int i =0; i<prodlist.size();i++)
         {
             beforeSort[i]=prodlist.get(i).getText().trim();
            // System.out.println(beforeSort[i]);
         }
        //Click Sort by Name
        Selectsort(text);
         //now sorting the before sort array
        Arrays.sort(beforeSort);


        prodlist = FindElements(locator);
        String[] aftreSort = new String[prodlist.size()];
        System.out.println("Verifying by:"+text);
        for(int i =0; i<prodlist.size();i++)
        {
            aftreSort[i]=prodlist.get(i).getText().trim();
            System.out.println(aftreSort [i]);
        }

        //Assert.assertEquals(beforeSort,aftreSort);
        coreAssert.SoftAssertAreEqual(beforeSort,aftreSort,"It is  sorting as expected.");
        System.out.println("-------------------------------------------------------------------------");
    }


}
