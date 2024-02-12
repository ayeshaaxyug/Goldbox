package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchemesPageViewDetails {
	
	// SCHEMES PAGE VIEW DETAILS
	
	 //RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "(//td[.='GOLD PLUS PLAN'])[1]/..//td/span//button[.='View Details']") private WebElement ViewDetailsBtn;
	@FindBy(xpath = "//button[.='Receipt']") private WebElement ReceiptBtn;
	@FindBy(xpath = "//button[.='Pay now']") private WebElement PayNowBtn;
	
	 //Rule-2:Create a constructor to initilise these elements
	
	  public SchemesPageViewDetails (WebDriver driver)
	   {
	   PageFactory.initElements (driver, this);
	   }

	  //Rule-3:Provide getters to access these variables
	  
	  public WebElement getViewDetailsBtn() {
			return ViewDetailsBtn;
		}

		public WebElement getReceiptBtn() {
			return ReceiptBtn;
		}

		public WebElement getPayNowBtn() {
			return PayNowBtn;
		}
	
		 //Rule-4:Create Business Libraries
	
		  public void DashBoardPage () {
	
			  ViewDetailsBtn.click();
			  ViewDetailsBtn.click();
			  PayNowBtn.click();
	
		  }

}
