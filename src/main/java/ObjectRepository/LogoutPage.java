package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	//LOGOUT PAGE
	
	//Rule-1: Finding Element by using @ FindBy Annotations

	@FindBy(xpath = "//i[@class='fi fi-rr-power']") private WebElement PowerOffBtn;
	@FindBy(xpath = "//button[.='Ok']") private WebElement OKBtn;
	
	public LogoutPage (WebDriver driver)
	{
	   PageFactory.initElements (driver, this);
	}

	//Rule-3:Provide getters to access these variables
    
	public WebElement getPowerOffBtn() {
		return PowerOffBtn;
	}

	public WebElement getOKBtn() {
		return OKBtn;
	}
	
	//Rule-4:Create Business Libraries
		public void LogoutPage (WebDriver driver)
		{	
	
			PowerOffBtn.click();
			OKBtn.click();
	
		}
	
	
}
