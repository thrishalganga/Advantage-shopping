package Com.Automation.Test;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.Basepage;
import Com.Automation.Pages.Loginpage;

public class LoginTest extends Basepage {
	
	@Test(dataProvider = "loginTestdata")
	public void verifylogin(String username, String password) throws InterruptedException
	{
		DriverUtils.getDriver().get("http://advantageonlineshopping.com/#/");
		Loginpage lp=new Loginpage();
		lp.Userclick();
		lp.Username(username);
		lp.Password(password);
		lp.rememberme();
		lp.Signine();
		Thread.sleep(15000);
	}
	@DataProvider(name="loginTestdata")
	public Object[][] logindata() {
		Object[][]data = new Object[2][2];
		data[0][0] = "Advantage.Demo";
		data[0][1] ="12345Asdf";
		
		data[1][0] = "Thrishal";
		data[1][1] ="Thrishal@2000";
		
		return data;
	}

}
	
