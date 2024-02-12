package goldbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buygold {
	
	@Test
	
	
	public void buyGold() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg-fms-goldbox.goldsikka.com/dashboard");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumyaa@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Schemes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Buy Gold']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Add Content']")).click();
		Thread.sleep(3000);
		WebElement dropdownElement11 = driver.findElement(By.xpath("//h1[.='Add Content']/../following-sibling::div//label[.='Content Type']/following-sibling::select"));

        // Create a Select object from the dropdown element
        Select dropdown11 = new Select(dropdownElement11);

        // Select an option by visible text
        dropdown11.selectByVisibleText("Sub Content");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@placeholder='Enter Content']")).sendKeys("Gold is future");
        Thread.sleep(3000);
        driver.findElement(By.xpath(" //textarea[@placeholder='Enter Explanation']")).sendKeys("gold");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(3000);
        
        //Buy Gold view buttons
        //Content Button
        
        driver.findElement(By.xpath("//button[@class='btn-sm btn-view']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Understood'][1]")).click();
		Thread.sleep(5000);
		// Explanation Button
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/button[1]")).click();
		//(//td[.='Sub Content']/..//following-sibling::td//button[.=' View '])[1]
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[.='Understood'])[2]")));
		element.click();
	
		Thread.sleep(5000);
		//Edit button
		driver.findElement(By.xpath("//button[@class='btn-sm btn-edit mr-2'][1]")).click();
		Thread.sleep(5000);
		
		WebElement dropdownElement111 = driver.findElement(By.xpath("//h1[.='Edit Content']/../following-sibling::div//select[@class='form-select mt-2 ng-untouched ng-pristine ng-valid']"));

        // Create a Select object from the dropdown element
        Select dropdown111 = new Select(dropdownElement111);

        // Select an option by visible text
        dropdown111.selectByVisibleText("Main Content");
        
        Thread.sleep(5000);
        WebElement ContentEdt = driver.findElement(By.xpath("//h1[.='Edit Content']/../following-sibling::div//textarea[@placeholder='Enter Content'] "));
		ContentEdt.clear();
		ContentEdt.sendKeys("real is rare");
		
		Thread.sleep(5000);
		
		 WebElement ExplantionEdt = driver.findElement(By.xpath("//h1[.='Edit Content']/../following-sibling::div//textarea[@placeholder='Enter Explanation']"));
		 ExplantionEdt.clear();
		 ExplantionEdt.sendKeys("Real");
		 
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[.='Update']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("(//div[@class='mdc-switch__icons'])[1]")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
	
}

