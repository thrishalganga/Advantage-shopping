package Com.Automation.Test;




import java.io.IOException;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.Loginpage;
import Com.Automation.Pages.OrderPayment;
import Com.Automation.Pages.SearchProductPage;
import Com.Automation.Pages.Shippingpage;


public class OrderPaymentsPageTest extends BaseTest {

	
	
	@Test
	public void verifyPayNow() throws InterruptedException, IOException {
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
		
		
		search.clickQuantity();
		search.clickAddtoCart();
		
		search.cart();
		search.clickCheckout();
		
		
		
		Shippingpage sp= new Shippingpage();
		
          sp.enterShippingDetails();
          sp.save();
          

      
      OrderPayment op= new OrderPayment();
      op.selectPaymentMode();
      op.clickEditCard();
      
      op.enterCardNumber("1111222233334444");
      op.enterCvvNumber("123");
      op.enterCardHolderName();
      op.payBtn();
	}
	
	
	
}
