package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SchemesPageGoldPlusPlanPage {
	
	 //GOLD PLUS PLAN PAGE
	
	  //RULE_1: Finding Elements By Using @ FindBy Annotations
	
	  @FindBy(xpath = "//option[.='Select Amount']") private WebElement SelectAmountDrpDwn;
	  @FindBy(xpath = "//select[@formcontrolname='total_installments']") private WebElement TotalMonthsDrpDwn;
	  @FindBy(xpath = "//button[.=' View Coupons ']") private WebElement ViewCouponsBtn;
	  @FindBy(xpath = "//button[@class='btn-close']") private WebElement ButtonCloseBtn;
	  @FindBy(xpath = "(//input[@type='checkbox'])[1]") private WebElement UseBookingAccountChkBx;
	  @FindBy(xpath = "//input[@placeholder='Enter amount']") private WebElement EnterAmountEdt;
	  @FindBy(xpath = "(//input[@type='checkbox'])[2]") private WebElement TermsAndConditionsChkBx;
	  @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-sub']") private WebElement StartsubscriptionBtn;
	  
	  //Rule-2:Create a constructor to initilise these elements
		
		public SchemesPageGoldPlusPlanPage (WebDriver driver)
		{
		   PageFactory.initElements (driver, this);
		}

	 //Rule-3:Provide getters to access these variables
		
		public WebElement getSelectAmountDrpDwn() {
			return SelectAmountDrpDwn;
		}

		public WebElement getTotalMonthsDrpDwn() {
			return TotalMonthsDrpDwn;
		}

		public WebElement getViewCouponsBtn() {
			return ViewCouponsBtn;
		}

		public WebElement getButtonCloseBtn() {
			return ButtonCloseBtn;
		}

		public WebElement getUseBookingAccountChkBx() {
			return UseBookingAccountChkBx;
		}

		public WebElement getEnterAmountEdt() {
			return EnterAmountEdt;
		}

		public WebElement getTermsAndConditionsChkBx() {
			return TermsAndConditionsChkBx;
		}

		public WebElement getStartsubscriptionBtn() {
			return StartsubscriptionBtn;
		}

		//Rule-4:Create Business Libraries
		
		public void schemeSubscriptionBankingAccount () {
			
			SelectAmountDrpDwn.click();
			Select s = new Select(SelectAmountDrpDwn);
			s.selectByVisibleText("1000");
			
		    TotalMonthsDrpDwn.click();
		    Select a = new Select(TotalMonthsDrpDwn);
		    a.deselectByVisibleText("12 Months");
		
		    ViewCouponsBtn.click();
		    ButtonCloseBtn.click();
		    UseBookingAccountChkBx.click();
		    EnterAmountEdt.click();
		    TermsAndConditionsChkBx.click();
		    StartsubscriptionBtn.click();
		       
		}
		
		public void schemeSubscriptionBankingAccount(WebDriver driver) throws Exception
		{
			SelectAmountDrpDwn.click();
			Select s = new Select(SelectAmountDrpDwn);
			s.selectByVisibleText("1000");
			
		    TotalMonthsDrpDwn.click();
		    Select a = new Select(TotalMonthsDrpDwn);
		    a.deselectByVisibleText("12 Months");
		
		    TermsAndConditionsChkBx.click();
		    StartsubscriptionBtn.click();
		    
		  driver.findElement(By.xpath("//div[@class='svelte-30hv15']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[.='Pay Now']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[.='Success']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[.='Continue']")).click();
		   

   }
}
