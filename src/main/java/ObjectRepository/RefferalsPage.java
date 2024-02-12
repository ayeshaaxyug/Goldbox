package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RefferalsPage {
	
	    // REFFERALS PAGE
	
		 //RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "//span[.='Referrals']") private WebElement RefferalsBtn;
	
	//Rule-2:Create a constructor to initilise these elements
	
	public RefferalsPage (WebDriver driver)
	{
	   PageFactory.initElements (driver, this);
	}
	
	//Rule-3:Provide getters to access these variables

	public WebElement getRefferalsBtn() {
		return RefferalsBtn;
	}

	//Rule-4:Create Business Libraries
	 
    public void RefferalsPage(WebDriver driver) {
    	RefferalsBtn.click();
    	
    }
}
	
	

