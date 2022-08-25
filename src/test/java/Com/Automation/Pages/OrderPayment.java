package Com.Automation.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPayment extends Basepage{
	@FindBy(xpath="//input[@name='masterCredit']")
	private WebElement  selectMasterCard;
	
	@FindBy(xpath="//label[text()='Edit']")
	private WebElement  editBtn;
	
	//input[@id='creditCard']
	@FindBy(xpath="//input[@id='creditCard']")
	private WebElement  cardNumbr;
	
	@FindBy(xpath="//input[@name='cvv_number']")
	private WebElement  cvvNumbr;
	
	@FindBy(xpath="//button[@id='pay_now_btn_ManualPayment']")
	private WebElement  payNowBtn;
	
	@FindBy(xpath="//input[@name='cardholder_name']")
	private WebElement  cardHolderName;
	
	
	
	public void selectPaymentMode() {
		selectMasterCard.click();
	}
	
	public void clickEditCard() {
		editBtn.click();
	}
	
	public void enterCardNumber(String str) {
		cardNumbr.sendKeys(str);
	}
	
	public void enterCvvNumber(String str) {
		cvvNumbr.sendKeys(str);
	}
	
	public void enterCardHolderName() {
		cardHolderName.clear();
		cardHolderName.sendKeys("admindemo");
	}
	
	public void payBtn() throws IOException, InterruptedException {
		payNowBtn.click();
	     

	}

}
