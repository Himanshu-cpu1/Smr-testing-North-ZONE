package My_Leads_Data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Call_Me_Later {
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
	    @Test(priority = 7)
	    public void click_On_first_Customer() throws InterruptedException {
	        // Find and get the first customer name
	        WebElement firstCustomer = driver.findElement(By.xpath("(//*[@class=\"mat-tooltip-trigger text-truncate\"])[1]"));
	        String firstCustomerText = firstCustomer.getText();
	        String firstCustomerName = firstCustomerText.split(" - ")[0];
	        System.out.println("First customer name  :: " + firstCustomerName);

	        // Click on the first customer
	        if (firstCustomer.isDisplayed()) {
	            firstCustomer.click();
	        } else {
	            System.out.println("First customer element is not visible.");
	            Assert.fail("First customer element not found or not clickable.");
	        }

	        // Sleep to simulate a wait, replace with explicit waits if possible
	        Thread.sleep(5000);

	        // Scroll down to the Vehicle Information section
	        Actions actions = new Actions(driver);
	        actions.sendKeys(Keys.PAGE_DOWN).perform();

	        Thread.sleep(3000);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Call_Dispostion = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Call Disposition\"]")));
	        Call_Dispostion.click();

	        Thread.sleep(3000);

	        // Scroll down to the Vehicle Information section
	        Actions actions2 = new Actions(driver);
	        actions2.sendKeys(Keys.PAGE_DOWN).perform();

	        // Click on the 'Did you talk to the customer' - YES
	        Thread.sleep(3000);

	        WebElement YES = driver.findElement(By.cssSelector("[value=\"yes\"]"));
	        YES.click();

	        // Click on 'Book an Appointment'
	        WebElement call_Me_Later = driver.findElement(By.cssSelector("[value=\"Call me later\"]"));
	        call_Me_Later.click();

	        Thread.sleep(2000);
	        actions2.sendKeys(Keys.PAGE_UP).perform();
	        actions2.sendKeys(Keys.PAGE_UP).perform();
	        Thread.sleep(2000);

	        // Open the calendar
	        WebElement date_Picker = driver.findElement(By.cssSelector("[aria-label='Open calendar']"));
	        date_Picker.click();

	        Thread.sleep(2000);

	        // Get today's date
	        LocalDate today = LocalDate.now();
	        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("d");
	        String currentDay = today.format(dayFormatter);

	        // Locate today's date and click it
	        List<WebElement> allDays = driver.findElements(By.xpath("//*[contains(@class, 'mat-calendar-body-cell-content')]"));
	        for (WebElement day : allDays) {
	            if (day.getText().trim().equals(currentDay)) {
	                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", day);
	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", day);
	                break;
	            }
	        }

	        Thread.sleep(3000);

	        // Fill in the time picker
	        WebElement hour = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder=\"HH\"]")));
	        hour.sendKeys("20");
	        Thread.sleep(3000);

	        WebElement minute = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder=\"MM\"]")));
	        minute.sendKeys("30");
	        Thread.sleep(3000);

	        WebElement CustomerVOC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"customerVOC\"]")));
	        CustomerVOC.sendKeys("CALL ME LATER2");
	        Thread.sleep(3000);

	        WebElement CRE_Remark = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"creRemark\"]")));
	        CRE_Remark.sendKeys("CALL ME LATER2");
	        Thread.sleep(3000);

	        WebElement Submit = driver.findElement(By.xpath("//*[text()=\"Submit\"]"));
	        Submit.click();
	        Thread.sleep(3000);

	        // Refresh the page
            driver.navigate().refresh();
            
            Thread.sleep(15000);

            // Click "Try Again"
	        WebElement Try_Again = driver.findElement(By.xpath("//*[contains(text(), 'Try Again')]"));
	        Try_Again.click();
	       
            Thread.sleep(3000);
            
            WebElement Search_Button = driver.findElement(By.id("mat-input-0"));
            Search_Button.sendKeys(firstCustomerName);
            
            Thread.sleep(3000);

	        // After clicking "Try Again," get the updated customer list
	        List<WebElement> customers = driver.findElements(By.xpath("//*[@class=\"mat-tooltip-trigger text-truncate\"]"));

	        // Search for the customer that matches firstCustomerName
	        boolean customerFound = false;
	        for (WebElement customer : customers) {
	            String customerText = customer.getText();
	            String customerName = customerText.split(" - ")[0];
	            
	            if (customerName.equals(firstCustomerName)) {
	                // If a match is found, click the customer
	                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", customer);
	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", customer);
	                customerFound = true;
	                break;
	            }
	        }

	        if (!customerFound) {
	            Assert.fail("Customer with name " + firstCustomerName + " not found after clicking 'Try Again'.");
	        }
	    }
	
}