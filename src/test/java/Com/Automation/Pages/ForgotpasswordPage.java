package Com.Automation.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ForgotpasswordPage extends Basepage {
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement Clickfyp;
	
	
	/*public void clickable() throws IOException
	{
		WebDriverWait wait=new WebDriverWait(driver, 5);
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Forgot your password?']")));
			System.out.println("element is clickable");
			
			
		}
		catch(Exception e)
		{
			System.out.println("element is not clickable");
			
		}
	}*/
	
	public void clickforgot()
	{
		Clickfyp.click();
	}
	
	public void validateForgotpassword()
	{
		WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		boolean result=forgot.isEnabled();
		Assert.assertTrue(result);
	}
	
	public void screenshot() throws IOException
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\thrishal.g\\Pictures\\Saved Pictures\\selenium\\b5.jpg");
		FileUtils.copyFile(src, des);
		System.out.println("screenshot saved successfully");
	}
	

}
