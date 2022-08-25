package Com.Automation.StepDef;

import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.Loginpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	Loginpage lp=new Loginpage();
	@When("Enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
		 lp.Username(PropertyReader.get(string));
		   lp.Password(PropertyReader.get(string2));
		   lp.rememberme();
		  
		   
	}
	@Then("execute login successfully")
	public void execute_login_successfully() {
	   lp.Signine();;
	}

}
