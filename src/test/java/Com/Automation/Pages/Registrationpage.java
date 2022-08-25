package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registrationpage extends Basepage{
	@FindBy(id="hrefUserIcon")
	private WebElement signinicon;

	@FindBy(linkText = "CREATE NEW ACCOUNT")
	private WebElement createaccount;

	@FindBy(xpath = "//input[@name='usernameRegisterPage']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='emailRegisterPage']")
	private WebElement email;

	@FindBy(xpath ="//input[@name='passwordRegisterPage']")
	private WebElement password;

	@FindBy(xpath="//input[@name='confirm_passwordRegisterPage']")
	private WebElement confirmpassword;

	@FindBy(xpath="//input[@name='first_nameRegisterPage']")
	private WebElement firstname;

	@FindBy(xpath="//input[@name='last_nameRegisterPage']")
	private WebElement lastname;

	@FindBy(xpath="//input[@name='phone_numberRegisterPage']")
	private WebElement phonenumber;

	@FindBy(xpath="//select[@name='countryListboxRegisterPage']")
	private WebElement selectcountry;

	@FindBy(xpath="//input[@name='cityRegisterPage']")
	private WebElement city;

	@FindBy(xpath="//input[@name='addressRegisterPage']")
	private WebElement address;

	@FindBy(xpath="//input[@name='state_/_province_/_regionRegisterPage']")
	private WebElement state;

	@FindBy(xpath="//input[@name='postal_codeRegisterPage']")
	private WebElement postalcode;

	@FindBy(xpath="//input[@name='allowOffersPromotion']")
	private WebElement unselect;

	@FindBy(xpath="//input[@name='i_agree']")
	private WebElement select;

	@FindBy(xpath="//button[@id='register_btnundefined']")
	private WebElement register;

	public void icon() throws InterruptedException {
		Thread.sleep(1000);
		signinicon.click();
	}

	public void NewAccount() {
		createaccount.click();
	}

	public void UserName(String str) {
		username.sendKeys(str);
	}

	public void Email(String str) {
		email.sendKeys(str);
	}

	public void Password(String str) {
		password.sendKeys(str);
	}

	public void ConfirmPassword(String str) {
		confirmpassword.sendKeys(str);
	}

	public void FirstName() {
		firstname.sendKeys("advantage");
	}

	public void LastName() {
		lastname.sendKeys("demo");
	}

	public void PhoneNumber() {
		phonenumber.sendKeys("0305272800");
	}

	public void Country() throws InterruptedException {
		org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(selectcountry);
		Thread.sleep(1000);
		sel.selectByVisibleText("India");
	}

	public void City() {
		city.sendKeys("agra");
	}

	public void Address() {
		address.sendKeys("87A sitaranagar");
	}

	public void State() {
		state.sendKeys("UP");
	}

	public void Postalcode() {
		postalcode.sendKeys("223452");
	}

	public void UnSelect() {
		unselect.click();
	}

	public void Select() {
		select.click();
	}

	public void Register() {
		register.click();
	}

	}



