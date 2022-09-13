package Com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProductPage extends Basepage {
	@FindBy(id="menuSearch")
	private WebElement searchProduct;

	
	@FindBy(xpath="//input[@id='autoComplete']")
	private WebElement productName;
	
	@FindBy(xpath="//p[@class='roboto-regular ng-binding']")
	private WebElement productCat;
	
	@FindBy(xpath="//span[@title='PURPLE']")
	private WebElement color;
	
	@FindBy(xpath="//div[@class='plus']")
	private WebElement quantity;
	
	@FindBy(xpath="//button[@name='save_to_cart']")
	private WebElement addtocartbtn;
	
	@FindBy(xpath = "//button[@id='checkOutPopUp']")
	private WebElement checkoutbtn;
	
	@FindBy(id="menuCart")
	private WebElement Cart;
	
	public void clickSearch()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.id("menuSearch")));
		search.click();
	}

	public void inputProductName(String str)
	{
		productName.sendKeys(str);
		
	}
	public void clickPrdCat()
	{
		productCat.click();
	}
	public void clickPrdColor()
	{
		color.click();
	}
	public void clickQuantity()
	{
		quantity.click();
	}
	public void clickAddtoCart()
	{
		addtocartbtn.click();
	}
	public void clickCheckout()
	{
		checkoutbtn.click();
	}
	public void cart()
	{
		Cart.click();
	}


}
