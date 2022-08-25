package Com.Automation.StepDef;

import java.sql.DriverAction;
import java.util.concurrent.TimeUnit;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.Loginpage;
import Com.Automation.Pages.SearchProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {
	SearchProductPage sp=new SearchProductPage();
	Loginpage lp=new Loginpage();
	

	@When("Enter valid Username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
	   lp.Username(string);
	   lp.Password(string2);
	   lp.rememberme();
	}

	@Then("execute the login successfully")
	public void execute_the_login_successfully() throws InterruptedException {
	   lp.Signine();
	   DriverUtils.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Open search box")
	public void open_search_box() throws InterruptedException {
		sp.clickSearch();
		
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

	@When("Enter valid productname {string}")
	public void enter_valid_productname(String string) throws InterruptedException {
		 sp.inputProductName(PropertyReader.get(string));
		   Thread.sleep(4000);
	}

	@Then("search product")
	public void search_product() throws InterruptedException {
		sp.clickPrdCat();
		   sp.clickPrdColor();
		   sp.clickQuantity();
		   sp.clickAddtoCart();
		   Thread.sleep(1000);
		   sp.clickCheckout();
	}


}
