package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class PassBookPage {
	
	// PASS BOOK PAGE
	
	 //RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "//span[.='Passbook']") private WebElement PassbookBtn;
	@FindBy(xpath = "//i[@class='fa-solid fa-magnifying-glass my-search-icon']") private WebElement SearchIconEdt;
	@FindBy(xpath = "//select[@class='font-control my-select']") private WebElement SelectTransactionTypeDrpDwn;
	@FindBy(xpath = "//td[.='5969622199']/..//td[.='Online (Razor Pay)']/..//td/span[.='0.255 Grams']/../..//td/button[@class='download-btn']") private WebElement DownloadBtn;
	
	//Rule-2:Create a constructor to initilise these elements
	
	public PassBookPage (WebDriver driver)
	{
	   PageFactory.initElements (driver, this);
	}

    //Rule-3:Provide getters to access these variables
	
	public WebElement getPassbookBtn() {
		return PassbookBtn;
	}

	public WebElement getSearchIconEdt() {
		return SearchIconEdt;
	}

	public WebElement getSelectDrpDwn() {
		return SelectTransactionTypeDrpDwn;
	}

	public WebElement getDownloadBtn() {
		return DownloadBtn;
	}
	
	 //Rule-4:Create Business Libraries
	
    public void PassBookPage (WebDriver driver) {
	
    	PassbookBtn.click();
    	SearchIconEdt.click();
    	
    	SelectTransactionTypeDrpDwn.click();
    	Select t = new Select(SelectTransactionTypeDrpDwn);
    	t.deselectByVisibleText("Buy");
    	
    	DownloadBtn.click();
	
    }	
	
}
