package Merge_My_Leads;

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

public class REFUSE_FOR_SERVICE_Service_Already_Done {
	
	 public static WebDriver driver;
	    public WebDriverWait wait;

	    //.............................................................................................
	    @SuppressWarnings("static-access")
	    @BeforeClass
	    public void down() throws InterruptedException {
	    	Thread.sleep(5000);
	        this.driver = REFUSE_FOR_SERVICE_Transfer_To_New_Location.driver;
	        Thread.sleep(5000);
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

	        // Click on 'Refuse_For_Service'
	        WebElement Refuse_For_Service = driver.findElement(By.xpath("//*[text()=\"Refuse for service\"]"));
	        Refuse_For_Service.click();
	        
	        Thread.sleep(2000);
	        // Click on 'Transfer_To_New_Location'
	        WebElement Service_already_Done = driver.findElement(By.xpath("//*[text()=\"Service already done\"]"));
	        Service_already_Done.click();
	        
	        Thread.sleep(2000);
	        actions2.sendKeys(Keys.PAGE_UP).perform();
		       
	        Thread.sleep(2000);	        
	        WebElement service_Workshop = driver.findElement(By.id("mat-select-value-77"));
	        service_Workshop.click();
	        
            Thread.sleep(2000);	   
            WebElement select_Workshop = driver.findElement(By.xpath("//*[text()=\"Local \"]"));
            select_Workshop.click();
	        
            Thread.sleep(2000);	  
            
            //.........select Current date .....................................................
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
	        WebElement odometer = driver.findElement(By.cssSelector("[formcontrolname=\"odometerReading\"]"));
	        odometer.sendKeys("30000");
	        Thread.sleep(2000);
	        
	        WebElement Bill_amount = driver.findElement(By.cssSelector("[formcontrolname=\"billAmount\"]"));
	        Bill_amount.sendKeys("650000");
	        Thread.sleep(3000);

	        WebElement CustomerVOC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"customerVOC\"]")));
	        CustomerVOC.sendKeys("Service_Already_Done");
	        Thread.sleep(3000);

	        WebElement CRE_Remark = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"creRemark\"]")));
	        CRE_Remark.sendKeys("Service_Already_Done");
	        Thread.sleep(3000);

	        WebElement Submit = driver.findElement(By.xpath("//*[text()=\"Submit\"]"));
	        Submit.click();
	        Thread.sleep(5000);

	        // Refresh the page
            driver.navigate().refresh();
         
            Thread.sleep(17000);    
            WebElement Forward_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"mat-tab-header-pagination-chevron\"])[2]")));
	        Forward_Button.click();
	        Thread.sleep(4000);
	        
	        WebElement Lost_calls = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"Lost Calls\")]")));
	        Lost_calls.click();
	        Thread.sleep(7000);
	        
	        WebElement Search_Button = driver.findElement(By.id("mat-input-0"));
            Search_Button.sendKeys(firstCustomerName);           
            Thread.sleep(3000);

	        
	        List<WebElement> customers = driver.findElements(By.xpath("//*[@class=\"mat-tooltip-trigger text-truncate\"]"));

	        // Search for the customer that matches firstCustomerName
	        boolean customerFound = false;
	        for (WebElement customer : customers) {
	            String customerText = customer.getText();
	            String customerName = customerText.split(" - ")[0];
	            System.out.println("customerName "+customerName);
	            
	            if (customerName.equals(firstCustomerName)) {
	                // If a match is found, click the customer
	                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", customer);
	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", customer);
	                customerFound = true;
	                
	                System.out.println("service Already Done is completed");
	                Thread.sleep(3000);
	                WebElement close = driver.findElement(By.xpath("//*[text()=\"close\"]"));
	                close.click();           
	                Thread.sleep(3000);
	                break;
	            }
	        }

	        if (!customerFound) {
	            Assert.fail("Customer with name " + firstCustomerName + " not found after clicking 'Lost calls'.");
	        }
	    }

	    
	        
}

