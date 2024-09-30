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

public class All_Tab_Data_Check {
	
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
	    	   
	  //.....................................................................................................

	    @Test(priority = 6)
	    public void Click_On_Fresh_Calls() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Leads = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Fresh calls\")]")));
	        Leads.click();
	        Thread.sleep(15000);
	        
	        // Find rows in the report table
	        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

	        // Check if data is available
	        if (reportRows.size() > 2) {
	            System.out.println("'Fresh call' contains data."); // Data is available
	        } else {
	          //  System.out.println("'Tab' does not contain any data."); // No data available
	            Assert.fail("fresh call' does not contain any data.");
	           
	        }}
	        //.....................................................................................................

		    @Test(priority = 7)
		    public void Click_On_Pending_Calls() throws InterruptedException {
		    	 Thread.sleep(3000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement Leads = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Pending calls\")]")));
		        Leads.click();
		        Thread.sleep(15000);
		        
		        // Find rows in the report table
		        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

		        // Check if data is available
		        if (reportRows.size() > 2) {
		            System.out.println("'Pending call' contains data."); // Data is available
		        } else {
		          //  System.out.println("'Tab' does not contain any data."); // No data available
		            Assert.fail("Pending call' does not contain any data.");
		           
		        }}
	//........................................................................................	       
		    @Test(priority = 8)
		    public void Click_On_Follup() throws InterruptedException {
		    	 Thread.sleep(3000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement Leads = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Follow up\")]")));
		        Leads.click();
		        Thread.sleep(15000);
		        
		        // Find rows in the report table
		        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

		        // Check if data is available
		        if (reportRows.size() > 2) {
		            System.out.println("'FollowUp' contains data."); // Data is available
		        } else {
		          //  System.out.println("'Tab' does not contain any data."); // No data available
		            Assert.fail("FollowUp' does not contain any data.");
		           
		        }}
		  //........................................................................................	       
		    @Test(priority = 9)
		    public void Click_On_Today_Booking() throws InterruptedException {
		    	 Thread.sleep(3000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement Leads = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Today Booking\")]")));
		        Leads.click();
		        Thread.sleep(15000);
		        
		        // Find rows in the report table
		        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

		        // Check if data is available
		        if (reportRows.size() > 2) {
		            System.out.println("'Today Booking' contains data."); // Data is available
		        } else {
		          //  System.out.println("'Tab' does not contain any data."); // No data available
		            Assert.fail("Today Booking' does not contain any data.");
		           
		        }}
		    //........................................................................................	       
		    @Test(priority = 10)
		    public void Click_On_future_Booking() throws InterruptedException {
		    	 Thread.sleep(3000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement Leads = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Future Booking\")]")));
		        Leads.click();
		        Thread.sleep(15000);
		        
		        // Find rows in the report table
		        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

		        // Check if data is available
		        if (reportRows.size() > 2) {
		            System.out.println("'future  Booking' contains data."); // Data is available
		        } else {
		          //  System.out.println("'Tab' does not contain any data."); // No data available
		            Assert.fail("future  Booking' does not contain any data.");
		           
		        }}
		  //........................................................................................	       
		    @Test(priority = 11)
		    public void Click_On_Pending_Booking() throws InterruptedException {
		    	 Thread.sleep(3000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement Leads = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Pending Booking\")]")));
		        Leads.click();
		        Thread.sleep(15000);
		        
		        // Find rows in the report table
		        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

		        // Check if data is available
		        if (reportRows.size() > 2) {
		            System.out.println("'Pending  Booking' contains data."); // Data is available
		        } else {
		          //  System.out.println("'Tab' does not contain any data."); // No data available
		            Assert.fail("Pending  Booking' does not contain any data.");
		           
		        }}
}
	      
	    
	    
	    
	    
	    
	    
		   

