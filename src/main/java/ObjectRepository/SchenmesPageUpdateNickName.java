package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchenmesPageUpdateNickName {
	
	//SCHEMES PAGE UPDATE NICK NAME
	
	//RULE_1: Finding Elements By Using @ FindBy Annotations
	
	@FindBy(xpath = "(//td[.='GOLD PLUS PLAN'])[1]/..//td/span//button[.='Update Nick Name']") private WebElement UpdateNickNameBtn;
	
	 //Rule-2:Create a constructor to initilise these elements
	
	  public SchenmesPageUpdateNickName (WebDriver driver)
	   {
	   PageFactory.initElements (driver, this);
	   }

	  //Rule-3:Provide getters to access these variables
	
	  public WebElement getUpdateNickNameBtn() {
			return UpdateNickNameBtn;
		}

	  //Rule-4:Create Business Libraries
		
	  public void DashBoardPage (WebDriver driver) {
	    
		  UpdateNickNameBtn.click();
		  
		 driver.findElement(By.xpath("(//input[@placeholder='Enter Nick Name'])[1]")).sendKeys("hi");
	     driver.findElement(By.xpath("(//button[.='Submit'])[1]")).click();
	
      }
	  
	  
}
