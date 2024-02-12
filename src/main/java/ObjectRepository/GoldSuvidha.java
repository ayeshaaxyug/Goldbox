package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldSuvidha
{
	//GOLD SUVIDHA PAGE
	
	//RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "//span[.='Gold Suvidha']") private WebElement GoldSuvidhaBtn;
	@FindBy(xpath = "//span[.='Buy Gold']") private WebElement BuyGoldBtn;
	@FindBy(xpath = "//span[.='Sell Gold']") private WebElement SellGoldBtn;
	@FindBy(xpath = "//span[.='Transfer Gold']") private WebElement TransferGoldBtn;
	@FindBy(xpath = "//span[.='Reedem Gold']") private WebElement RedeemGoldBtn;
	
	//Rule-2:Create a constructor to initilise these elements
	
	public GoldSuvidha (WebDriver driver)
	{
	   PageFactory.initElements (driver, this);
	}

	//Rule-3:Provide getters to access these variables
	
	public WebElement getGoldSuvidhaBtn() {
		return GoldSuvidhaBtn;
	}

	public WebElement getBuyGoldBtn() {
		return BuyGoldBtn;
	}

	public WebElement getSellGoldBtn() {
		return SellGoldBtn;
	}

	public WebElement getTransferGoldBtn() {
		return TransferGoldBtn;
	}

	public WebElement getRedeemGoldBtn() {
		return RedeemGoldBtn;
	}
	
	//Rule-4:Create Business Libraries
	
	public void GoldSuvidha () {
		GoldSuvidhaBtn.click();
		BuyGoldBtn.click();
		SellGoldBtn.click();
		TransferGoldBtn.click();
		RedeemGoldBtn.click();
		
	}
	
	
}


