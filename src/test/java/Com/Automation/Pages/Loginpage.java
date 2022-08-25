package Com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends Basepage{
	@FindBy(id="menuUser")
	private WebElement Clickuser;
	@FindBy(name="username")
	private WebElement InputUsername;
	@FindBy(name="password")
	private WebElement InputPassword;
	@FindBy(name="remember_me")
	private WebElement Clickrememberme;

	
	public void Signine()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='SIGN IN']")));
		 Category_Body.click();
	}
	
	public void Userclick()
	{
		Clickuser.click();
	}
	public void Username(String str)
	{
		InputUsername.sendKeys(str);
	}
	public void Password(String str)
	{
		InputPassword.sendKeys(str);
	}
	public void rememberme()
	{
		Clickrememberme.click();
	}
	

}



