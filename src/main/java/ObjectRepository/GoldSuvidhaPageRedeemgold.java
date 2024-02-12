package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldSuvidhaPageRedeemgold {
	
	 //GOLD SUVIDHA PAGE REDEEM GOLD 
	
	  //RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "//input[@placeholder='Enter Grams']") private WebElement EnterGramsEdt;
	@FindBy(xpath = "//input[@type='checkbox']") private WebElement CheckBocChkBx;
	@FindBy(xpath = "//input[@placeholder='Enter Amount']") private WebElement EnterAmountEdt;
	@FindBy(xpath = "//button[.='Continue']") private WebElement ContinueBtn;
	
	//Rule-2:Create a constructor to initilise these elements
	
    public GoldSuvidhaPageRedeemgold (WebDriver driver)
 	{
 	   PageFactory.initElements (driver, this);
 	}
	
    //Rule-3:Provide getters to access these variables
  
    public WebElement getEnterGramsEdt() {
		return EnterGramsEdt;
	}

	public WebElement getCheckBocChkBx() {
		return CheckBocChkBx;
	}

	public WebElement getEnterAmountEdt() {
		return EnterAmountEdt;
	}

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
	
	//Rule-4:Create Business Libraries
	
	public void GoldSuvidhaPageRedeemgold(WebDriver driver) {
	
		EnterGramsEdt.click();
		CheckBocChkBx.click();
		EnterAmountEdt.click();
		ContinueBtn.click();
		
	
			}
}
