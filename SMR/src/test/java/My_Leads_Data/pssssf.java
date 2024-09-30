package My_Leads_Data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
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

public class pssssf {
	
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
    public void click_Future_Booking() throws InterruptedException {
        // Find and get the first customer name
    	Thread.sleep(2000);
    	 WebElement Future_Booking = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Future Booking\"]")));
    	 Future_Booking.click();
         Thread.sleep(12000);
    	
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

    }
    //...................................................................................................
  //................Click_On_need_For_Reshudle_in_NO ....................................................
    @Test(priority = 9)
    public void Click_On_need_For_Reshudle_in_NO() throws InterruptedException {
        // Find and get the first customer name
    	 // Scroll down to the Vehicle Information section
        Actions actions2 = new Actions(driver);
        actions2.sendKeys(Keys.PAGE_DOWN).perform();
        
        Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Call_Dispostion = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Call Disposition\"]")));
        Call_Dispostion.click();

        Thread.sleep(3000);

        // Scroll down to the Vehicle Information section
        Actions actions3 = new Actions(driver);
        actions3.sendKeys(Keys.PAGE_DOWN).perform();

        // Click on the 'Did you talk to the customer' - YES
        Thread.sleep(3000);

        WebElement YES = driver.findElement(By.cssSelector("[value=\"yes\"]"));
        YES.click();
        Thread.sleep(2000);
        WebElement No = driver.findElement(By.xpath("//*[text()=\"No\"]"));
        No.click();
        
        Thread.sleep(2000);
        WebElement Need_For_Reschedule = driver.findElement(By.xpath("//*[text()=\"Need for reschedule\"]"));
        Need_For_Reschedule.click();
        
        actions3.sendKeys(Keys.PAGE_UP).perform();
        
        
        Thread.sleep(2000);
        // Open the calendar
           WebElement date_Picker = driver.findElement(By.cssSelector("[aria-label=\"Open calendar\"]"));
           date_Picker.click();

           // Pause to allow the calendar to render
           Thread.sleep(2000);

           // Get today's date (assuming today is September 30th)
           LocalDate today = LocalDate.now();

           // Get the date for 1st October
           LocalDate nextMonthFirstDay = today.withDayOfMonth(1).plusMonths(1);

           // Format the date to match the format used in the calendar
           DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("d");
           String firstDayNextMonth = nextMonthFirstDay.format(dayFormatter);

           // Navigate to the next month in the calendar (assuming you need to navigate)
           WebElement nextMonthButton = driver.findElement(By.cssSelector("[aria-label=\"Next month\"]"));
           nextMonthButton.click();

           // Locate the element representing October 1st
           List<WebElement> allDays = driver.findElements(By.xpath("//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"]"));

           for (WebElement day : allDays) {
               if (day.getText().equals(firstDayNextMonth)) {
                   day.click();
                   break;
               }
           }

   	        
   	        Thread.sleep(3000);
   	        WebElement Book_Slot = driver.findElement(By.xpath("//*[text()=\" Book Slot \"]"));
   	        Book_Slot.click();
   	        
   	        Thread.sleep(3000);
   	        WebElement Time_Slot = driver.findElement(By.id("mat-select-value-89"));
   	        Time_Slot.click();
   	        
   	        Thread.sleep(3000);
   	        WebElement select_Time = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[6]"));
   	        select_Time.click();
        	        
   	   
   	        // List of checkbox IDs (add as many as needed)
   	        List<String> checkboxIds = Arrays.asList("mat-checkbox-186", "mat-checkbox-187", "mat-checkbox-188", "mat-checkbox-1"); // Add more as needed

   	        // Iterate over all checkboxes
   	        for (String checkboxId : checkboxIds) {
   	            WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(checkboxId)));
   	            
   	            // Check if the checkbox is already selected
   	            WebElement checkboxInput = checkbox.findElement(By.tagName("input")); // Locate the checkbox input element
   	            if (!checkboxInput.isSelected()) {
   	                // If not selected, click the checkbox
   	                checkbox.click();
   	                System.out.println("Checkbox with ID: " + checkboxId + " is now selected.");
   	            } else {
   	                System.out.println("Checkbox with ID: " + checkboxId + " was already selected.");
   	            }
   	        }
   	        
   	        Thread.sleep(3000);
   	        WebElement Click_on_Submit = driver.findElement(By.cssSelector("[value=\"Submit\"]"));
   	        Click_on_Submit.click();
	        Thread.sleep(3000);		        
	        actions3.sendKeys(Keys.PAGE_DOWN).perform();
	        actions3.sendKeys(Keys.PAGE_DOWN).perform();
	        
	        Thread.sleep(3000);
        WebElement Customer_VOC = driver.findElement(By.cssSelector("[formcontrolname=\"customerVOC\"]"));
        Customer_VOC.sendKeys("Reschedule2");
        
        Thread.sleep(3000);
        WebElement CRE_Remark = driver.findElement(By.cssSelector("[formcontrolname=\"creRemark\"]"));
        CRE_Remark.sendKeys("Reschedule2");
        
        Thread.sleep(3000);
        WebElement Submit = driver.findElement(By.xpath("//*[text()=\"Submit\"]"));
        Submit.click();
        
        
}

}