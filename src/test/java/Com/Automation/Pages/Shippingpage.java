package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Shippingpage extends Basepage{

	 @FindBy(xpath="//a[text()='Edit shipping details']")
		private WebElement editShippingBtn;
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(name="phone_number")
	private WebElement phonenumber;
	
	 @FindBy(xpath="//select[@name='countryListbox']")
	private WebElement countryList;
	 
	 @FindBy(xpath="//select[@name='countryListbox']")
	private WebElement countryListBox;
	 
	 @FindBy(name="city")
	private WebElement city;
	 
	 @FindBy(name="address")
		private WebElement address;
	 
	 @FindBy(name="postal_code")
		private WebElement postalCode;
	 
	//button[text()='NEXT']
	 @FindBy(name="state_/_province_/_region")
		private WebElement state;
	 
     @FindBy(xpath="//button[@id='next_btnundefined']")
		private WebElement nextBtn;
     
     @FindBy(xpath="//a[text()='BACK']")
		private WebElement backBtn;
     
     
	 
	 
	 
	 
	 

	 @FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	public void enterShippingDetails() throws InterruptedException {
	
		firstName.clear();
		firstName.sendKeys("raman");
		lastname.clear();
		lastname.sendKeys("raj1");
		phonenumber.clear();
		phonenumber.sendKeys("8896646601");
		countryList.click();
		Select sel = new Select (countryListBox);
		sel.selectByVisibleText("Iceland");
		city.clear();
		city.sendKeys("lucknow");
		address.clear();
		address.sendKeys("uttar pradesh");
		postalCode.clear();
		postalCode.sendKeys("274001");
		state.clear();
		state.sendKeys("up");
//		Thread.sleep(5000);
		
//		backBtn.click();
	}
	public void save()
	{
		nextBtn.click();
	}
	

}



