package My_Leads_Data;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_check_Of_Today_Booking {
String firstCustomerName;
	
	public static WebDriver driver;
    public WebDriverWait wait;


	 @SuppressWarnings("deprecation")
	    @BeforeClass
	    public void setup() {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://dealercrm.co.in/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);

	    }

	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	    @Test(priority = 1)
	    public void Username() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Username = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
	        Username.sendKeys("081001cce00001");

	        Thread.sleep(2000);
	    }

	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	    @Test(priority = 2)
	    public void Password() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
	        password.sendKeys("Maruti@123");
	               
	          Thread.sleep(3000);
		    	    
	        WebElement login_Button = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
	        login_Button.click();
	      
	    }

	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	    @Test(priority = 3)
	    public void Captcha() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        
	      //.................Enter The Captcha ..................................................................
	        WebElement Image = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
			
			String S1 = Image.getAttribute("value");
			System.out.println("captcha ::"+S1);
						
		    Thread.sleep(3000);
		
	        WebElement captcha_field = driver.findElement(By.cssSelector("[placeholder=\"Enter the captcha..\"]"));
		    captcha_field.sendKeys(S1);
	      //......................................................................	   	    
	    }

	    // wait for 15 Second  and put the captcha code

	//.....................................................................................................

	    @Test(priority = 4)
	    public void SUBMIT_Button() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Submit\"]")));
	        Submit.click();
	        Thread.sleep(15000);


	    }
	  //.....................................................................................................

	    @Test(priority = 5)
	    public void Click_On_MY_Leads() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Leads = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"My Leads \"]")));
	        Leads.click();
	        Thread.sleep(15000);
	        
	        
	    }
	    
	  //................click_Future_Booking ....................................................
	    @Test(priority = 7)
	    public void click_Today_Booking() throws InterruptedException {
	        // Find and get the first customer name
	    	Thread.sleep(2000);
	    	 WebElement Today_Booking = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Today Booking\"]")));
	    	 Today_Booking.click();
	         Thread.sleep(12000);
	    	
	         // Find rows in the report table
	         List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

	         // Check if data is available
	         if (reportRows.size() > 1) {
	             System.out.println(" Today Booking contains data."); // Data is available
	         } else {
	           
	             Assert.fail( "Today Booking  does not contain any data.");
	            
	         }}
	    }
	    
