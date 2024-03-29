package Mobile.Tests;

import Mobile.Data.DataProviderClass;
import Mobile.ExtendFromCore.AllTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class MobileTests extends AllTest
{
    /**This test performs sort operation on Mobile based on the available Sort By options
     *
     * @param searchtype
     */

    @Test(dataProvider="SearchDataProvider", dataProviderClass = DataProviderClass.class )
    public void Test1(String searchtype) throws IOException {
        initAllPages();
        hp.GoToMobilePage();
        mp.Selectsort(searchtype);
        mp.VerifySort(mp.productlist, searchtype);
    }
    @Test
    public void VerifyQuantityAndCart() throws IOException {
        initAllPages();
        hp.GoToMobilePage();
        mp.SelectAddToCart("Xperia");
        sc.EnterQuantity("1000");
        sc.UpdateCart();
        sc.VerifyQtyError();
        sc.EmptyCart();
        sc.VerifyCartIsEmpty();

    }
   @Test
    public void VerifyCompareProducts() throws IOException {
        initAllPages();
        hp.GoToMobilePage();
        mp.SelectProductToCompare("Xperia");
        mp.SelectProductToCompare("IPhone");
        mp.ClickCompare();
        mp.SwitchToPopUpWindow();
        mp.VerifyComparePopUP();

    }

}
