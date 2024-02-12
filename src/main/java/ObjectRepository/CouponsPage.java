package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponsPage {
	
	  //COUPONS PAGE 
	
	 //RULE_1: Finding Elements By Using @ FindBy Annotations

	 @FindBy(xpath = "//span[.='Coupons']") private WebElement CouponsBtn;
	 
	  //Rule-2:Create a constructor to initilise these elements
		
		public CouponsPage (WebDriver driver)
		{
		   PageFactory.initElements (driver, this);
		}

     //Rule-3:Provide getters to access these variables
		
		public WebElement getCouponsBtn() {
			return CouponsBtn;
		}
		
		//Rule-4:Create Business Libraries
		
	    public void CouponsPage(WebDriver driver) {
		
	    	CouponsBtn.click();
	    	
	    }
	    	
      }
