package Merge_My_Leads;

import java.time.Duration;
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

public class REFUSE_FOR_SERVICE_Transfer_To_New_Location {
	 public static WebDriver driver;
	    public WebDriverWait wait;

	  //.............................................................................................
	    @SuppressWarnings("static-access")
	    @BeforeClass
	    public void down() throws InterruptedException {
	    	Thread.sleep(5000);
	        this.driver = Vehicle_Sold_To_New_Owner.driver;
	        Thread.sleep(5000);
	    }
	  //.....................................................................................................

	    @Test(priority = 5)
	    public void Click_On_MY_Leads() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Leads = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"My Leads \"]")));
	        Leads.click();
	        Thread.sleep(23000);
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
	        WebElement Transfer_To_New_Location = driver.findElement(By.xpath("//*[text()=\"Transfer to a new location\"]"));
	        Transfer_To_New_Location.click();
	        
	        Thread.sleep(2000);
	        actions2.sendKeys(Keys.PAGE_UP).perform();
		       
	        Thread.sleep(2000);	        
	        WebElement Transfer_State = driver.findElement(By.cssSelector("[formcontrolname=\"transferState\"]"));
	        Transfer_State.click();
	        
            Thread.sleep(2000);	        
	        WebElement select_state = driver.findElement(By.xpath("//*[text()=\"Gujarat\"]"));
	        select_state.click();
	        
	        Thread.sleep(2000);	        
	        WebElement Transfer_Pincode = driver.findElement(By.cssSelector("[formcontrolname=\"transferPincode\"]"));
	        Transfer_Pincode.sendKeys("450045");
	        
	        Thread.sleep(2000);	        
	        WebElement Transfer_city = driver.findElement(By.cssSelector("[formcontrolname=\"transferCity\"]"));
	        Transfer_city.sendKeys("Jaipur");
	        
	        Thread.sleep(2000);	        
	        WebElement Prefered_Workshop = driver.findElement(By.cssSelector("[formcontrolname=\"preferredWorkshop\"]"));
	        Prefered_Workshop.sendKeys("Jaipur location");

	        
	        Thread.sleep(2000);	        
	        WebElement Address = driver.findElement(By.cssSelector("[formcontrolname=\"address\"]"));
	        Address.sendKeys("JAIPUR");
	        
	        Thread.sleep(3000);

	        WebElement CustomerVOC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"customerVOC\"]")));
	        CustomerVOC.sendKeys("Transfer To new location");
	        Thread.sleep(3000);

	        WebElement CRE_Remark = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"creRemark\"]")));
	        CRE_Remark.sendKeys("Transfer To new location");
	        Thread.sleep(3000);

	        WebElement Submit = driver.findElement(By.xpath("//*[text()=\"Submit\"]"));
	        Submit.click();
	        Thread.sleep(5000);

	        // Refresh the page
            driver.navigate().refresh();
         
            Thread.sleep(17000);                     

	        WebElement Forward_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"mat-tab-header-pagination-chevron\"])[2]")));
	        Forward_Button.click();
	        Thread.sleep(2000);
	        
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
	                
	                System.out.println("Tranfer to new location has been passed");
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
