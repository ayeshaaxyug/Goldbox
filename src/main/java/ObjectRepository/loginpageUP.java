package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageUP {
	
	//Rule-1: Finding Elements by using @ FindBy annotations
	
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']") private WebElement MobileNumberEdt;
	@FindBy(xpath="//button[.='Continue']") private WebElement Continueclick;
	
	//Rule-2:Create a constructor to initilise these elements
	
	public loginpageUP (WebDriver driver)
	{
	   PageFactory.initElements (driver, this);
	}

	//Rule-3:Provide getters to access these variables
	
	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}

	public WebElement getContinueclick() {
		return Continueclick;
	}
	
	//Rule-4:Create Business Libraries
	
	
}

