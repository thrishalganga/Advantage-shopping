package Com.Automation.Test;


import java.io.IOException;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.ForgotpasswordPage;
import Com.Automation.Pages.Loginpage;

public class ForgotPasswordTest extends BaseTest{
	@Test
	
	public void verifyfp() throws InterruptedException, IOException
	{
		DriverUtils.getDriver().get("http://advantageonlineshopping.com/#/");
		Loginpage lp=new Loginpage();
		lp.Userclick();
		lp.Username("Advantage.Demo");
		Thread.sleep(5000);
		
		ForgotpasswordPage fp=new ForgotpasswordPage();
		fp.validateForgotpassword();
		//fp.clickable();
		fp.clickforgot();
		fp.screenshot();
		
		
		
		
	}

}





