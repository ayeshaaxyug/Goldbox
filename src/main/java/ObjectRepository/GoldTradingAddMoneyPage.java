package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldTradingAddMoneyPage {
	
	 //GOLD TRADING ADD MONEY PAGE
	
	  //RULE_1: Finding Elements By Using @ FindBy Annotations

            @FindBy(xpath = "//button[.='Add Money']") private WebElement AddMoneyBtn;
            @FindBy(xpath = "//input[@placeholder='Enter Your Amount']") private WebElement EnterYourAmountEdt;
            @FindBy(xpath = "//button[.='Continue']") private WebElement ContinueBtn;
            
          //Rule-2:Create a constructor to initilise these elements
        	
    		public GoldTradingAddMoneyPage (WebDriver driver)
    		{
    		   PageFactory.initElements (driver, this);
    		}

    	 //Rule-3:Provide getters to access these variables       
	
    		public WebElement getAddMoneyBtn() {
				return AddMoneyBtn;
			}

			public WebElement getEnterYourAmountEdt() {
				return EnterYourAmountEdt;
			}

			public WebElement getContinueBtn() {
				return ContinueBtn;
			}
	
			//Rule-4:Create Business Libraries
			
		      public void GoldTradingAddMoneyPage(WebDriver driver) {
		    	  
		    	  AddMoneyBtn.click();	  
		    	  EnterYourAmountEdt.click();
		    	  ContinueBtn.click();
		    	  

		      }
		      
		      
      }

	
	
