package Com.Automation.StepDef;

import java.io.IOException;

import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.OrderPayment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Paymentsteps {
	OrderPayment op= new OrderPayment();
	@Given("open payment")
	public void open_payment() {
		 op.selectPaymentMode();
	      op.clickEditCard();
	      
	      
	   
	   
	}

	@When("Enter valid Cardnumber {string} and cvv {string}")
	public void enter_valid_cardnumber_and_cvv(String string, String string2) {
	    op.enterCardNumber(PropertyReader.get(string));
	    op.enterCvvNumber(PropertyReader.get(string2));
	}

	@Then("payment successful")
	public void payment_successful() throws IOException, InterruptedException {
		   op.payBtn();
	}

}
