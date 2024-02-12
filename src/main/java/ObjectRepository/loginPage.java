package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	//USER PANNEL SIGN IN 
	
	//Rule-1: Finding Element by using @ FindBy Annotations
	
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']") private WebElement MobileNumberEdt;
	@FindBy(xpath="//button[.='Continue']") private WebElement ContinueBtn;
	
	//Rule-2:Create a constructor to initilise these elements
	
	public loginPage (WebDriver driver)
	{
	   PageFactory.initElements (driver, this);
	}

	//Rule-3:Provide getters to access these variables
	
	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
	
	//Rule-4:Create Business Libraries
	public void loginToApplication () {
		
		MobileNumberEdt.sendKeys();
		ContinueBtn.click();
	}

}