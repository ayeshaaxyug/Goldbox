package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldTradingPage {
	
	   // GOLD TRADING PAGE  
	
	   //RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "//span[.='Gold Trading']") private WebElement GoldTradingBtn;
	@FindBy(xpath = "//span[.='Trading']") private WebElement TradingBtn;
	@FindBy(xpath = "//span[.='Orders']") private WebElement OrdersBtn;
	
	 //Rule-2:Create a constructor to initilise these elements
	
	public GoldTradingPage (WebDriver driver)
	{
	   PageFactory.initElements (driver, this);
	}

      //Rule-3:Provide getters to access these variables

	public WebElement getGoldTradingPage() {
		return GoldTradingBtn;
	}

	public WebElement getTradingBtn() {
		return TradingBtn;
	}

	public WebElement getOrdersBtn() {
		return OrdersBtn;
	}
	
	//Rule-4:Create Business Libraries
	
      public void GoldTradingPage(WebDriver driver){	
	
    	  GoldTradingBtn.click();
    	  TradingBtn.click();
    	  OrdersBtn.click();  
    	  
      }
    	  
}  	  
    	  
    	  
