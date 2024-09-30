package Import_DATA_Of_DBP;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LOGIN {
	
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
//...............................................................................................			

			Thread.sleep(2000);
			
			WebElement MSIL = driver.findElement(By.cssSelector("[placeholder=\"MSPIN\"]"));
			MSIL.sendKeys("395237");
			driver.findElement(By.cssSelector("[class=\"btn\"]")).click();// click on the send Otp
	        
	//..........................................................................................
			WebElement OTP = driver.findElement(By.cssSelector("[placeholder=\"OTP\"]")); // send  the OTP
			OTP.sendKeys("5555"); 
			
			 Thread.sleep(3000);
	//................clcik on login Button..................................................................................
			 
			   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement Login= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"button\"])[2]")));// click on the login Button
			   Login.click();	
	//.................click on the dealer Selcection Options...............................................................................    
		
			  
			   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement s2= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class=\"dealer-business px-0 py-4\"]")));
			   s2.click();
	           Thread.sleep(3000);
	        
	        // click on the filter options
//	    	
//	      WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-filter/div/div[2]/div[5]/select"));
//	       dropdownElement.click();
//	       
//	        Thread.sleep(3000);
//	   	    Select dropdown = new Select(dropdownElement);
//	   	    Thread.sleep(2000);
//	   	    dropdown.selectByVisibleText("Arena");

	           Thread.sleep(3000);
	           wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement Submit= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"button\"])[3]")));
			   Submit.click();
	           Thread.sleep(3000);
		
	      //click on Send Back
		    WebElement sendBack = driver.findElement(By.cssSelector("[class=\"bnt ok-btn\"]"));// click on the Send Back
		    sendBack.click();   
	  
	   }	   
	   
}