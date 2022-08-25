package Com.Automation.StepDef;

import java.util.concurrent.TimeUnit;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.ExcelData;
import Com.Automation.Pages.Registrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Regsteps {
	Registrationpage rp= new Registrationpage();
	
	@Given("Open the browser")
	public void open_the_browser() {
		DriverUtils.getDriver().get("http://advantageonlineshopping.com/#/");
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Open Createnewaccount")
	public void open_createnewaccount() throws InterruptedException {
		 rp.icon();
	}

	@When("Enter valid username and Mail")
	public void enter_valid_username_and_mail() {
		 String name1=ExcelData.getdata("C:\\Users\\thrishal.g\\eclipse-workspace\\AdvantageShoppingcucumber\\src\\test\\resources\\Data\\data_advcucumber.xlsx", "Sheet1", 1, 0);
		 String mail=ExcelData.getdata("C:\\Users\\thrishal.g\\eclipse-workspace\\AdvantageShoppingcucumber\\src\\test\\resources\\Data\\data_advcucumber.xlsx", "Sheet1", 1, 1);
	   
		rp.NewAccount();
		rp.UserName(name1);
		rp.Email(mail);
	}

	    
	

	@When("Enter Valid fname and lname and mobilenumber")
	public void enter_valid_fname_and_lname_and_mobilenumber() {
		 rp.FirstName();
		   rp.LastName();
		   rp.PhoneNumber();
	}

	@When("Enter Valid Country and Valid city and Valid Address and Valid state and ValidpostalCode")
	public void enter_valid_country_and_valid_city_and_valid_address_and_valid_state_and_validpostal_code() throws InterruptedException {
		rp.Country();
		  rp.City();
		  rp.Address();
		  rp.State();
		  rp.Postalcode();
		  rp.Select();
	}

	@Then("execute successfully")
	public void execute_successfully() {
		 rp.Register();
		   System.out.println(DriverUtils.getDriver().getTitle());
	}


}
