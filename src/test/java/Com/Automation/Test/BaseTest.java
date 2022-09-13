package Com.Automation.Test;

import org.testng.annotations.BeforeMethod;

import Com.Automation.GenericUtils.DriverUtils;

public class BaseTest {
	@BeforeMethod
	public void precondition()
	{
		DriverUtils.createDriver();
	}


}
