package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldTradingBuyGoldPage {
	
	
	//GOLD SUVIDHA PAGE
	
		//RULE_1: Finding Elements By Using @ FindBy Annotations
		
	     @FindBy(xpath = "(//input[@placeholder='Enter Amount'])[1]") private WebElement EnterAmount1Edt;
	     @FindBy(xpath = "//input[@formcontrolname='grams']") private WebElement EnterGramsEdt;
	     @FindBy(xpath = "//input[@type='checkbox']") private WebElement UseBookingAccountChkBx;
	     @FindBy(xpath = "(//input[@placeholder='Enter Amount'])[2]") private WebElement EnterAmount2Edt;
	     @FindBy(xpath = "//button[.='Continue']") private WebElement ContinueBtn;
	     
	   //Rule-2:Create a constructor to initilise these elements
	     
	     public GoldTradingBuyGoldPage (WebDriver driver)
	 	{
	 	   PageFactory.initElements (driver, this);
	 	}
	     
	   //Rule-3:Provide getters to access these variables
	     
	     public WebElement getEnterAmount1Edt() {
	 		return EnterAmount1Edt;
	 	}

	 	public WebElement getEnterGramsEdt() {
	 		return EnterGramsEdt;
	 	}

	 	public WebElement getUseBookingAccountChkBx() {
	 		return UseBookingAccountChkBx;
	 	}

	 	public WebElement getEnterAmount2Edt() {
	 		return EnterAmount2Edt;
	 	}

	 	public WebElement getContinueBtn() {
	 		return ContinueBtn;
	 	}
	 	
	 	//Rule-4:Create Business Libraries
		
	 		public void GoldTradingBuyGoldPage (WebDriver driver) {
	 	
	 			EnterAmount1Edt.click();
	 			EnterGramsEdt.click();
	 			UseBookingAccountChkBx.click();
	 			EnterAmount2Edt.click();
	 			ContinueBtn.click();
	 			
	 			driver.findElement(By.xpath("//div[@class='svelte-30hv15']")).click();
	 			driver.findElement(By.xpath("//button[.='Pay Now']")).click();
	 			driver.findElement(By.xpath("//button[.='Success']")).click();
	 			
	    } 


}
