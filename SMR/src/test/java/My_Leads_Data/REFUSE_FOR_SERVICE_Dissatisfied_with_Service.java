package My_Leads_Data;

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

public class REFUSE_FOR_SERVICE_Dissatisfied_with_Service {
	
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
        Thread.sleep(20000);


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
        // Click on 'DisSatisfied service'
        WebElement DisSatisfied = driver.findElement(By.xpath("//*[text()=\"Dissatisfied with service\"]"));
        DisSatisfied.click();
        
        Thread.sleep(2000);
        actions2.sendKeys(Keys.PAGE_UP).perform();
        
        Thread.sleep(3000);
        WebElement Reason_For_DisSatisfaction = driver.findElement(By.id("mat-select-value-77"));
        Reason_For_DisSatisfaction.click();
        
        Thread.sleep(3000);
        WebElement select_High_Charges = driver.findElement(By.xpath("//*[text()=\"HIgh Charges \"]"));
        select_High_Charges.click();
        
        Thread.sleep(3000);
        WebElement Service_wORKSHOP = driver.findElement(By.id("mat-select-value-79"));
        Service_wORKSHOP.click();
        
        Thread.sleep(3000);
        WebElement select_NARIANA_INDUSTRIES = driver.findElement(By.xpath("//*[text()=\"NARAINA INDUSTRIAL AREA-SRV \"]"));
        select_NARIANA_INDUSTRIES.click();
        Thread.sleep(3000);
        
        WebElement Service_Advisor_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"serviceAdvisorName\"]")));
        Service_Advisor_Name.sendKeys("Mohan singh");
        Thread.sleep(3000);

        WebElement CustomerVOC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"customerVOC\"]")));
        CustomerVOC.sendKeys("Dissatisfied with service");
        Thread.sleep(3000);

        WebElement CRE_Remark = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"creRemark\"]")));
        CRE_Remark.sendKeys("Dissatisfied with service");
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
        Thread.sleep(15000);
        
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
               
                System.out.println("Dissatisfied with service is completed");
                Thread.sleep(3000);
                WebElement close = driver.findElement(By.xpath("//*[text()=\"close\"]"));
                close.click();           
                Thread.sleep(3000);
                customerFound = true;
                break;
            }
        }

        if (!customerFound) {
            Assert.fail("Customer with name " + firstCustomerName + " not found after clicking 'Lost calls'.");
        }
    }
    }



