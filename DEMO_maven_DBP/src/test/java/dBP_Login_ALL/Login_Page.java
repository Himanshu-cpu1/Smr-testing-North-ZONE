package dBP_Login_ALL;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Login_Page {
	   public static WebDriver driver;
	   public static WebDriverWait wait;
	   
	   @SuppressWarnings("deprecation")
	   @BeforeClass
	  
	   public static void Setup () throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://dev-dbp.msilfintrac.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	

	//............................Fill MSIL Id..................................................................			

			Thread.sleep(2000);
			
			WebElement MSIL = driver.findElement(By.cssSelector("[placeholder=\"MSPIN\"]"));
			MSIL.sendKeys("395237");
			driver.findElement(By.cssSelector("[class=\"btn\"]")).click();// click on the send Otp
	        
	//................................click on the OTP..........................................................
			WebElement OTP = driver.findElement(By.cssSelector("[placeholder=\"OTP\"]")); // send  the OTP
			OTP.sendKeys("5555"); 
			
			 Thread.sleep(3000);
	//................click on login Button..................................................................................
			 
			   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement Login= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"button\"])[2]")));// click on the login Button
			   Login.click();	
	//.................click on the dealer Selection Options...............................................................................    
		
			  
			   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement s2= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class=\"dealer-business px-0 py-4\"]")));
			   s2.click();
	           Thread.sleep(3000);
//........................................click on the filter options................................................	        
	      
	           
	           try {
	               if (driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-filter/div/div[2]/div[5]/select")).isDisplayed()) {
	                  
	            	   // Click on the filter otion
	            	   WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-filter/div/div[2]/div[5]/select"));
	            	   dropdownElement.click();
	                   
	                   //  wait  to select Arena options
	                   
	                   Thread.sleep(3000);
       	   	         Select dropdown = new Select(dropdownElement);
	       	   	    Thread.sleep(2000);
	       	   	    dropdown.selectByVisibleText("Arena");

	               }
	           } catch (NoSuchElementException e) {
	               // dropdown is not present, proceed with the test
	        	   Thread.sleep(2000);
	           }	           	           
//..................................Click on the Submit Button...........................................................
	           
	           Thread.sleep(3000);
	           wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement Submit= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"button\"])[3]")));
			   Submit.click();
	           Thread.sleep(3000);
	           
	           
	   //...........................Send BACK Options.....................................................
	           try {
	               if (driver.findElement(By.cssSelector("[class=\"bnt ok-btn\"]")).isDisplayed()) {
	                   // Click on the popup close button
	                   driver.findElement(By.cssSelector("[class=\"bnt ok-btn\"]")).click();
	                   // Optionally wait for popup to close
	                   Thread.sleep(1000);
	               }
	           } catch (NoSuchElementException e) {
	               // Popup is not present, proceed with the test
	           }
		
	  
	   }	   
	   
}