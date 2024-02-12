package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldTradingPageTarding {
	
	  // GOld TRADING PAGE TRADING
	
	  //RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "//span[.='Buy Gold']") private  WebElement BuyGoldBtn;
	@FindBy(xpath = "//button[.='Add Money']") private WebElement AddMoneyBtn;
	@FindBy(xpath = "//button[.='View']") private WebElement ViewBtn;
	@FindBy(xpath = "//input[@placeholder='Enter Bid Price']") private WebElement EnterBidPriceEdt;
	@FindBy(xpath = "//input[@placeholder='Enter Grams']") private WebElement EnterGramsEdt;
	@FindBy(xpath = "//button[.='Place Order']") private WebElement PlaceOrderBtn;
	//@FindBy(xpath = "//button[.='View Order History']") private WebElement VieworderHistoryBtn;
	@FindBy(xpath = "(//button[@class='btn-close'])[1]") private WebElement CloseBtn;
	
	//Rule-2:Create a constructor to initilise these elements
	
		public GoldTradingPageTarding (WebDriver driver)
		{
		   PageFactory.initElements (driver, this);
		}

	 //Rule-3:Provide getters to access these variables
	
		public WebElement getBuyGoldBtn() {
			return BuyGoldBtn;
		}

		public WebElement getAddMoneyBtn() {
			return AddMoneyBtn;
		}

		public WebElement getViewBtn() {
			return ViewBtn;
		}

		public WebElement getEnterBidPriceEdt() {
			return EnterBidPriceEdt;
		}

		public WebElement getEnterGramsEdt() {
			return EnterGramsEdt;
		}

		public WebElement getPlaceOrderBtn() {
			return PlaceOrderBtn;
		}

		public WebElement getCloseBtn() {
			return CloseBtn;
		}
	
		//Rule-4:Create Business Libraries
		
	      public void GoldTradingPageTarding(WebDriver driver) {
	
	    	  BuyGoldBtn.click();
	    	  AddMoneyBtn.click();
	    	  ViewBtn.click();
	    	  
	    driver.findElement(By.xpath("//input[@placeholder='Enter Bid Price']")).sendKeys("1000",Keys.ENTER);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Grams']")).sendKeys("0.12",Keys.ENTER);
	    
	          PlaceOrderBtn.click();
	          CloseBtn.click();
	
	
	
	      }

   }
