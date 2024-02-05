package goldbox;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.google.j2objc.annotations.Weak;

import io.github.bonigarcia.wdm.WebDriverManager;

public class schemes {

	@Test
	public void Sample() throws InterruptedException 
	{
		Random r = new Random();
	    int Rnum = r.nextInt(100);
	    
	    
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg-fms-goldbox.goldsikka.com/dashboard");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumyaa@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root/app-core-component[@class='ng-star-inserted']/div/div[@class='main-wrapper']/div/app-sidebar-one[@class='ng-star-inserted']/div[@id='sidebar']/div[@class='sidebar-inner slimscroll']/ng-scrollbar[@class='ng-scrollbar']/div[@class='ng-scrollbar-wrapper']/div[@class='ng-scroll-viewport-wrapper']/div[contains(@class,'ng-native-scrollbar-hider ng-scroll-viewport')]/div[@class='ng-scroll-content']/div[@id='sidebar-menu']/ul/li[@class='submenu-open ng-star-inserted']/div[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/users/users-list']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/users/userkyc']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Schemes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Scheme List']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//h6[normalize-space()='Add Scheme']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='addscheme']//input[@placeholder='Enter Scheme Name']")).sendKeys("acv"+Rnum);
		Thread.sleep(4000);
        WebElement dropdownElement = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
        Thread.sleep(4000);
        // Create a Select object from the dropdown element      
        Select dropdown = new Select(dropdownElement);
        // Select an option by visible text
        dropdown.selectByIndex(1);
		Thread.sleep(3000);
		WebElement dropdownElement1 = driver.findElement(By.xpath("//div[@role='dialog']//div//form//div//div//div//div//div//select[@formcontrolname='country']"));

        // Create a Select object from the dropdown element
        Select dropdown1 = new Select(dropdownElement1);

        // Select an option by visible text
        dropdown1.selectByVisibleText("Cuba");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='addscheme']//input[@placeholder='Enter Description']")).sendKeys("Svr"+Rnum);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mt-2 mb-2']//button[@type='submit'][normalize-space()='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Scheme Users']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Scheme List']")).click();
		Thread.sleep(3000);
		
		//Scheme list
		//Description
		
		driver.findElement(By.xpath("(//button[@class='btn-sm btn-view'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[.='Understood'])[1]")).click();
		Thread.sleep(5000);
				
		//Tenure list
		
		driver.findElement(By.xpath("(//button[.=' Info '])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("6");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("8");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//i[@class='fas fa-trash-alt']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Manage Tenures']/..//button[@aria-label='Close']")).click();
		Thread.sleep(5000);
		
		//Amount List
		
		driver.findElement(By.xpath("(//td[.='acv83']/following-sibling::td/following-sibling::td/following-sibling::td/button[.=' Info '])[2]")).sendKeys("1200",Keys.ENTER);
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']")).click();
	
		//Action
		driver.findElement(By.xpath("(//td[.='acv83']/following-sibling::td/following-sibling::td/following-sibling::td/button[.=' Info '])[3]")).click();
		Thread.sleep(5000);
		
		//secheme content
		driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys("Gold");
		Thread.sleep(5000);
		
		//Edit
	    WebElement SchemeContentEdt = driver.findElement(By.xpath("//textarea[@formcontrolname='content']"));
		SchemeContentEdt.clear();
		SchemeContentEdt.sendKeys("Silver");
		Thread.sleep(5000);
				
		//scheme terms and conditions
		driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Accepct");
		Thread.sleep(5000);

        //Edit
		WebElement SchemeTermsandConditionsEdt = driver.findElement(By.xpath("//textarea[@formcontrolname='tc']"));
		SchemeTermsandConditionsEdt.clear();
		SchemeTermsandConditionsEdt.sendKeys("follow");
		Thread.sleep(5000);   
				
		//Schemes features
		driver.findElement(By.xpath("//h6[.='Add Feature']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Feature'])[1]")).sendKeys("goold");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Feature Explanation'])[1]")).sendKeys("rare");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Add Feature']/..//button[@aria-label='Close']")).click();
		Thread.sleep(5000);
				
		//AddFAQ
		driver.findElement(By.xpath("//h6[.='Add FAQ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter FAQ Question'])[1]")).sendKeys("months to be paid");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter FAQ Answer '])[1]")).sendKeys("12");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[.='Add FAQ']/../button[@class='btn-close']")).click();
		Thread.sleep(5000);
				
		//Edit Scheme
		driver.findElement(By.xpath("(//button[.=' Edit '])[1]")).click();
		Thread.sleep(5000);
				
		//Scheme name
		WebElement SchemeEdt = driver.findElement(By.xpath("//h1[.='Edit Scheme']/../following-sibling::div//input[@placeholder='Enter Scheme Name']"));
		SchemeEdt.clear();
		SchemeEdt.sendKeys("qwe");
		Thread.sleep(5000);
			
		//multiplication Type
		WebElement dropdownElement111 = driver.findElement(By.xpath("//div[@id='editscheme']//div[@class='modal-body']//div[2]//select[1]/../following-sibling::div/label[.=' Calculation Type']"));

	   // Create a Select object from the dropdown element
	    Select dropdown111 = new Select(dropdownElement111);

       // Select an option by visible text
	   dropdown111.selectByVisibleText("MY GOLD");
				        
	   Thread.sleep(5000);
				        
		//Countrty
		WebElement dropdownElement11 = driver.findElement(By.xpath("//div[@id='editscheme']//div[@class='modal-body']//div[2]//select[1]"));

		 // Create a Select object from the dropdown element
        Select dropdown11 = new Select(dropdownElement11);

        // Select an option by visible text
		 dropdown11.selectByVisibleText("Canada");
				
		Thread.sleep(5000);
			    
		  //Description
          WebElement DescriptionEdt = driver.findElement(By.xpath("//div[@id='editscheme']//div[@class='modal-body']//div[2]//select[1]/../following-sibling::div/label[.=' Calculation Type']/../following-sibling::div//input[@placeholder='Enter Description']"));
          DescriptionEdt.clear();
          DescriptionEdt.sendKeys("qwooe");
		  Thread.sleep(5000);
		                                                               
		  driver.findElement(By.xpath("//div[@id='editscheme']//div[@class='modal-body']//div[2]//select[1]/../following-sibling::div/label[.=' Calculation Type']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div//button[.='Update']")).click();
		  Thread.sleep(5000);
				
		  driver.quit();
		  
	}
	
}


