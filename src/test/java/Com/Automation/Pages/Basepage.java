package Com.Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Com.Automation.GenericUtils.DriverUtils;

public class Basepage {
	WebDriver driver;
	public Basepage()
	{
		driver=DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

}
