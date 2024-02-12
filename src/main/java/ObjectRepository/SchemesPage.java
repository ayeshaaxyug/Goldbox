
package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchemesPage 
{
     //USER PANNEL SCHEMES PAGE AFTER CLICKING ON SCHEMES
	
	 //RULE_1: Finding Elements By Using @ FindBy Annotations
	
	  @FindBy(xpath = "//a[.='Schemes']") private WebElement SchemesBtn;
	  @FindBy(xpath = "(//h5[.='Schemes']/../following-sibling::div//button[.='Subscribe'])[1]") private WebElement SubscribeBtn;
	  @FindBy(xpath = "(//td[.='GOLD PLUS PLAN'])[1]/..//td/span//button[.='View Details']") private WebElement ViewDetailsBtn;
	  @FindBy(xpath = "(//td[.='GOLD PLUS PLAN'])[1]/..//td/span//button[.='Update Nick Name']") private WebElement UpdateNickNameBtn;
	  
	 //Rule-2:Create a constructor to initilise these elements
	
			public SchemesPage (WebDriver driver)
			{
			   PageFactory.initElements (driver, this);
			}
		
     //Rule-3:Provide getters to access these variables
	

			public WebElement getSchemesBtn() {
				return SchemesBtn;
			}



			public WebElement getSubscribeBtn() {
				return SubscribeBtn;
			}



			public WebElement getViewDetailsBtn() {
				return ViewDetailsBtn;
			}



			public WebElement getUpdateNickNameBtn() {
				return UpdateNickNameBtn;
			}
			
			
	 //Rule-4:Create Business Libraries
	
	    public void DashBoardPage () {
				
				SchemesBtn.click();
				SubscribeBtn.click();
				ViewDetailsBtn.click();
				UpdateNickNameBtn.click();
				
			}
			
	
}