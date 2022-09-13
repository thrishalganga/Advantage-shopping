package Com.Automation.Test;



import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.Registrationpage;

public class RegistrationTest extends BaseTest {
	@Test

	public void verifysuccessfulregeistration() throws InterruptedException
	{
		DriverUtils.getDriver().get("http://advantageonlineshopping.com/");
		Registrationpage rp = new Registrationpage();
		Thread.sleep(2000);
		rp.icon();
		Thread.sleep(1000);
		rp.NewAccount();
		rp.UserName("Advantage.Demo");
		rp.Email("advantage@gmail.com");
		rp.Password("12345Asdf");
		rp.ConfirmPassword("12345Asdf");
		rp.FirstName();
		rp.LastName();
		rp.PhoneNumber();
		rp.Country();
		rp.City();
		rp.Address();
		rp.State();
		rp.Postalcode();
		rp.UnSelect();
		rp.Select();
		rp.Register();
		
	}

}
