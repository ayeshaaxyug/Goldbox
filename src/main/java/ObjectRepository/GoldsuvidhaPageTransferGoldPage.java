package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldsuvidhaPageTransferGoldPage {
	
	  //GOLD SUVIDHA PAGE TRANSFER GOLD 
	
	  //RULE_1: Finding Elements By Using @ FindBy Annotations

	  @FindBy(xpath = "//input[@placeholder='Enter Mobile Number']") private WebElement MobileNumberEdt;
	  @FindBy(xpath = "//input[@placeholder='Enter Grams']") private WebElement EnterGramsEdt;
	  @FindBy(xpath = "//button[.='Continue']") private WebElement ContinueBtn;
	  
	  //Rule-2:Create a constructor to initilise these elements
		
	    public GoldsuvidhaPageTransferGoldPage (WebDriver driver)
	 	{
	 	   PageFactory.initElements (driver, this);
	 	}
		
	    //Rule-3:Provide getters to access these variables
	  
	    public WebElement getMobileNumberEdt() {
			return MobileNumberEdt;
		}

		public WebElement getEnterGramsEdt() {
			return EnterGramsEdt;
		}

		public WebElement getContinueBtn() {
			return ContinueBtn;
		}
	  
		//Rule-4:Create Business Libraries
		
		public void GoldsuvidhaPageTransferGoldPage(WebDriver driver) {
	  
			MobileNumberEdt.click();
			EnterGramsEdt.click();
			ContinueBtn.click();
	  
   }

}