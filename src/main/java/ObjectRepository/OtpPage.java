package ObjectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtpPage{
	//USER PANNEL OTP PAGE
	
	//RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "(//input[@autocomplete='one-time-code'])[1]") private WebElement OtpEdt;
	
	//Rule-2:Create a constructor to initilise these elements
	
	public OtpPage (WebDriver driver)
	{
	   PageFactory.initElements (driver, this);
	}
	
	//Rule-3:Provide getters to access these variables
	
	public WebElement getOtpEdt() {
		return OtpEdt;
	}
		
    //Rule-4:Create Business Libraries
	
	public void OtpPage () {
		OtpEdt.sendKeys("123456");
		
	}
}
