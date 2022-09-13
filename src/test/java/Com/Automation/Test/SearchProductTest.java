package Com.Automation.Test;



import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.Loginpage;
import Com.Automation.Pages.SearchProductPage;

public class SearchProductTest extends BaseTest {
	
	@Test
	public void verifySearch() throws InterruptedException
	{
		DriverUtils.getDriver().get("http://advantageonlineshopping.com/#/");
		Loginpage lp=new Loginpage();
		lp.Userclick();
		lp.Username("Advantage.Demo");
		lp.Password("12345Asdf");
		lp.rememberme();
		Thread.sleep(4000);
		lp.Signine();
		SearchProductPage search = new SearchProductPage();
		//search.inputSearch("mobile");
		Thread.sleep(3000);
		search.clickSearch();
		search.inputProductName("Mobile");
		Thread.sleep(4000);
		search.clickPrdCat();
//		search.clickPrdColor();
//		search.clickQuantity();
//		search.clickAddtoCart();
//		Thread.sleep(1000);
//		search.clickCheckout();
	}
}
