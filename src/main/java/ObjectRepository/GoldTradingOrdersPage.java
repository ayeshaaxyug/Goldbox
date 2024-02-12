package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldTradingOrdersPage {
	
	   //  Gold Trading Orders Page
	
	   //RULE_1: Finding Elements By Using @ FindBy Annotations
	  
	    @FindBy(xpath = "//span[.='Orders']") private WebElement OrdersBtn;
	    @FindBy(xpath = "//button[@class='cancel-bid']") private WebElement CancleBidBtn;
	    @FindBy(xpath = "//button[.='Buy Gold']") private WebElement BuyGoldBtn;
	    @FindBy(xpath = "//button[.='Add Money']") private WebElement AddMoneyBtn;
	    @FindBy(xpath = "//button[@class='show-chart']") private WebElement ShowChartBtn;
	    
	  //Rule-2:Create a constructor to initilise these elements
		
		public GoldTradingOrdersPage (WebDriver driver)
		{
		   PageFactory.initElements (driver, this);
		}

	    //Rule-3:Provide getters to access these variables
	    
		public WebElement getOrdersBtn() {
			return OrdersBtn;
		}

		public WebElement getCancleBidBtn() {
			return CancleBidBtn;
		}

		public WebElement getBuyGoldBtn() {
			return BuyGoldBtn;
		}

		public WebElement getAddMoneyBtn() {
			return AddMoneyBtn;
		}

		public WebElement getShowChartBtn() {
			return ShowChartBtn;
		}
	
		//Rule-4:Create Business Libraries
		
	      public void GoldTradingOrdersPage(WebDriver driver) {
	    	  
	    	  OrdersBtn.click();
	    	  CancleBidBtn.click();
	    	  BuyGoldBtn.click();
	    	  AddMoneyBtn.click();
	    	  ShowChartBtn.click();
	    	    
	      }	  
	    
  }