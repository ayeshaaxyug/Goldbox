package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class DashBoardPage
{
    //USER PANNEL Dashboard Page 
	
	//RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "//button[.='Deposit']") private WebElement DepositBtn;
	@FindBy(xpath = "//p[.='Buy']") private WebElement BuyBtn;
	@FindBy(xpath = "//p[.='Transfer']") private WebElement TransferBtn;
	@FindBy(xpath = "//p[.='Sell']") private WebElement SellBtn;
	@FindBy(xpath = "//p[.='Redeem']") private WebElement RedeemBtn;
	@FindBy(xpath = "//p[.=' My Schemes']") private WebElement MySchemesBtn;
	@FindBy(xpath = "//button[@class='download-btn']") private WebElement DownloadBtn;
	
//
	
	@FindBy(xpath = "//span[.='Schemes']") private WebElement SchemesBtn;
	@FindBy(xpath = "//span[.='Gold Suvidha']") private WebElement GoldsuvidhaBtn;
	@FindBy(xpath = "//span[.='Booking Account']") private WebElement BookingAccountBtn;
	@FindBy(xpath = "//span[.='Passbook']") private WebElement PassbookBtn;
	@FindBy(xpath = "//span[.='Gold Trading']") private WebElement GoldTradingBtn;
	@FindBy(xpath = "//span[.='Referrals']") private WebElement RefferalsBtn;
	@FindBy(xpath = "//span[.='Coupons']") private WebElement CouponsBtn;
	
	//Rule-2:Create a constructor to initilise these elements
	
		public DashBoardPage (WebDriver driver)
		{
		   PageFactory.initElements (driver, this);
		}
		
   //Rule-3:Provide getters to access these variables
		
		public WebElement getDepositBtn() {
			return DepositBtn;
		}



		public WebElement getBuyBtn() {
			return BuyBtn;
		}



		public WebElement getTransferBtn() {
			return TransferBtn;
		}



		public WebElement getSellBtn() {
			return SellBtn;
		}



		public WebElement getRedeemBtn() {
			return RedeemBtn;
		}



		public WebElement getMySchemesBtn() {
			return MySchemesBtn;
		}



		public WebElement getDownloadBtn() {
			return DownloadBtn;
		}



		public WebElement getSchemesBtn() {
			return SchemesBtn;
		}



		public WebElement getGoldsuvidhaBtn() {
			return GoldsuvidhaBtn;
		}



		public WebElement getBookingAccountBtn() {
			return BookingAccountBtn;
		}
		
		
		
		public WebElement getPassbookBtn() {
			return PassbookBtn;
		}



		public WebElement getGoldTradingBtn() {
			return GoldTradingBtn;
		}



		public WebElement getRefferalsBtn() {
			return RefferalsBtn;
		}



		public WebElement getCouponsBtn() {
			return CouponsBtn;
		}
	
		//Rule-4:Create Business Libraries
		
		public void DashBoardPage () {
		
		DepositBtn.click();
		BuyBtn.click();
		TransferBtn.click();
		SellBtn.click();
		RedeemBtn.click();
		MySchemesBtn.click();
		DownloadBtn.click();
		SchemesBtn.click();
		GoldsuvidhaBtn.click();
		BookingAccountBtn.click();
		PassbookBtn.click();
		GoldTradingBtn.click();
		RefferalsBtn.click();
		CouponsBtn.click();
		
		}
}
		
