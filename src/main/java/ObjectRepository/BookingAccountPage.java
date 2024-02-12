package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingAccountPage {
	
	//BOOKING ACCOUNT PAGE 
	
	//RULE_1: Finding Elements By Using @ FindBy Annotations

	@FindBy(xpath = "//span[.='Booking Account']") private WebElement BookingAccountBtn;
	@FindBy(xpath = "//input[@placeholder='Enter Amount']") private WebElement EnterAmountEdt;
	@FindBy(xpath = "//button[.='Submit']") private WebElement SubmitBtn;
	
	//Rule-2:Create a constructor to initilise these elements
	
		public BookingAccountPage (WebDriver driver)
		{
		   PageFactory.initElements (driver, this);
		}
		
		//Rule-3:Provide getters to access these variables
	
		public WebElement getBookingAccountBtn() {
			return BookingAccountBtn;
		}

		public WebElement getEnterAmountEdt() {
			return EnterAmountEdt;
		}

		public WebElement getSubmitBtn() {
			return SubmitBtn;
		}
		
		//Rule-4:Create Business Libraries
		
		public void BookingAccountPage() {
			
			BookingAccountBtn.click();
			EnterAmountEdt.click();
			SubmitBtn.click();
			
}
		
			
		public void paymentPage(WebDriver driver) {
			
			driver.findElement(By.xpath("Netbanking - ICICI Bank")).click();
			driver.findElement(By.xpath("//button[.='Pay Now']")).click();
			driver.findElement(By.xpath("//div[@class='svelte-30hv15']")).click();
			driver.findElement(By.xpath("//button[.='Pay Now']")).click();
			driver.findElement(By.xpath("//button[.='Success']")).click();
			driver.findElement(By.xpath("//button[.='Continue']")).click();
		
		}
		
}
