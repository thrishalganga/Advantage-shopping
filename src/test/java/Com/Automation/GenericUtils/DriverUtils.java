package Com.Automation.GenericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	static WebDriver driver;
	public static void createDriver()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\thrishal.g\\eclipse-workspace\\AdvantageShoppingcucumber\\src\\test\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://advantageonlineshopping.com/#/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static WebDriver getDriver()
	{
		if(driver==null) {
			createDriver();
		}
		return driver;
			
	}

}


