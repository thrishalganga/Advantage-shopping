package Com.Automation.StepDef;

import Com.Automation.Pages.SearchProductPage;
import Com.Automation.Pages.Shippingpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingSteps {
	SearchProductPage sp=new SearchProductPage();
	Shippingpage sh=new Shippingpage();
	@Given("open cart")
	public void open_cart() throws InterruptedException {
		Thread.sleep(3000);
	    sp.cart();
	    sp.clickCheckout();
	}

	@When("Enter Valid Shipping address")
	public void enter_valid_shipping_address() throws InterruptedException {
	   sh.enterShippingDetails();
	}

	@Then("save shipping details successfully")
	public void save_shipping_details_successfully() {
	   sh.save();
	}


}
