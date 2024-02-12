package goldbox;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

      // NO ERRORS

     // WITH OUT USING BOOKING ACCOUNT

	public class Schemesup {
		
		@Test
		
		public void Schemesup () throws Exception 
		{
			
			WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        Thread.sleep(3000);
	        driver.get("http://stg.goldbox.gold/login");
	        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698" , Keys.ENTER);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[.='Subscribe']")).click();
			
			Thread.sleep(3000);
			
			WebElement dropdownElement1 = driver.findElement(By.xpath("//select[@formcontrolname='amount']"));

	        // Create a Select object from the dropdown element
	        Select dropdown1 = new Select(dropdownElement1);

	        // Select an option by visible text
	        dropdown1.selectByVisibleText("1000");
	        
	        Thread.sleep(3000);
	        
	        WebElement dropdownElement11 = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));

	        // Create a Select object from the dropdown element
	        Select dropdown11 = new Select(dropdownElement11);

	        // Select an option by visible text
	        dropdown11.selectByVisibleText("12 Months");
	        
	        Thread.sleep(3000);
	        
            driver.findElement(By.xpath("//button[.=' View Coupons ']")).click();
			
			Thread.sleep(3000);
			
            driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Coupon Code']")).sendKeys("ews234");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[.='Apply']")).click();
			
			Thread.sleep(3000);
			
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000);");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
			
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-sub']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//label[text()='Phone Number'])[2]")).sendKeys("6309631698",Keys.ENTER);
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='svelte-1milfy7']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='svelte-30hv15']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[.='Pay Now']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[.='Success']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[.='Continue']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//button[.='View Details'])[1]")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[.='Receipt']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//span[.='Schemes']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//i[@class='fi fi-rr-power']")).click();
			
			Thread.sleep(5000);
			
		    driver.findElement(By.xpath("//button[.='Ok']")).click();
		
		    Thread.sleep(5000);
			
			driver.quit();
			
		}
	}
	