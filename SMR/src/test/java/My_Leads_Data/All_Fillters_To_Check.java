package My_Leads_Data;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Fillters_To_Check {
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
    public void All_Fillters_check() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement priority = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-0")));
        priority.click();
        Thread.sleep(2000);
        
        WebElement Select_PMS = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"PMS 20\"]")));
        Select_PMS.click();
        Thread.sleep(2000);
        
        WebElement channel = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-3")));
        channel.click();
        Thread.sleep(2000);
        
        WebElement Select_Arena = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Arena\"]")));
        Select_Arena.click();
        Thread.sleep(2000);
        
        WebElement Campaign_Name = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-7")));
        Campaign_Name.click();
        Thread.sleep(2000);
        
        WebElement Adhooc_Bot_campaign = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Adhoc Bot Campaign\"]")));
        Adhooc_Bot_campaign.click();
        Thread.sleep(2000);
        
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 2) {
            System.out.println(" Selecting ( Priority ,Channel, Campaign Name ) contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( Priority ,Channel, Campaign Name ) does not contain any data.");
           
        }}
        
  //................Additional fillter check data .......................................................................   
    @Test(priority = 7)
    public void CCP_Fillters_check() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement Additional = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"filter_list\"]")));
        Additional.click();
        Thread.sleep(2000);
        
        
        WebElement CCP = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"CCP\"])[2]")));
        CCP.click();
        Thread.sleep(2000);
        
        WebElement CCP_Tie_Fillter = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-expansion-panel-header-11")));
        CCP_Tie_Fillter.click();
        Thread.sleep(2000);
        
   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    
     // Store the XPaths in an array
        String[] xpaths = {
            "//*[text()=\"CCP Gold - Hydro \"]",
            "//*[text()=\"CCP Gold - Plus \"]",
            "//*[text()=\"CCP Platinum Hydro 2 year \"]",
            "//*[text()=\"CCP Platinum - Plus \"]",
            "//*[text()=\"CCP Royal Platinum - Plus \"]",
            "//*[text()=\"CCP Platinum - Fuel \"]"
        };

        // Loop through the array to click on each checkbox
        for (String xpath : xpaths) {
            WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            checkbox.click();
            Thread.sleep(1000);  // You may want to replace this with a proper wait
        }

 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                     
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println(" Selecting ( CCP Tie  fillter ) contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( CCP Tie  fillter ) does not contain any data.");
           
        }}
    
    //......................................................................................................
    //.................................................................................................................     
    @Test(priority =8)
    public void Remove_check() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                     
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement CCP_Tie_Fillter = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-expansion-panel-header-11")));
        CCP_Tie_Fillter.click();
        Thread.sleep(2000);
    } 
    
    //................Additional fillter check data .......................................................................   
    @Test(priority = 9)
    public void CCP_New_Sale_Eligible_Fillters() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                                   
        Thread.sleep(2000);
        
        WebElement new_sale_eligable = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"CCP New Sale Eligible\"]")));
        new_sale_eligable.click();
        Thread.sleep(2000);
        
   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    
     // Store the XPaths in an array
        String[] xpaths = {
            "(//*[text()=\"No \"])[1]",
            "(//*[text()=\"Yes \"])[1]",
           
        };

        // Loop through the array to click on each checkbox
        for (String xpath : xpaths) {
            WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            checkbox.click();
            Thread.sleep(1000);  // You may want to replace this with a proper wait
        }

 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                      
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println(" Selecting ( CCP New Sale Eligible  ) additional fillter contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( CCP New Sale Eligible )  additional fillter  does not contain any data.");
           
        }}
    
  //.................................................................................................................     
    @Test(priority =11)
    public void Remove_check2() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement new_sale_eligable = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"CCP New Sale Eligible\"]")));
        new_sale_eligable.click();
        Thread.sleep(2000);
    } 
    //................Additional fillter check data .......................................................................   
    @Test(priority = 12)
    public void CCP_Renewal_Fillters() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                       
        WebElement Ccp_renewal = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"CCP Renewal Eligible\"]")));
        Ccp_renewal.click();
        Thread.sleep(2000);
        
   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    
     // Store the XPaths in an array
        String[] xpaths = {
            "(//*[text()=\"No \"])[2]",
           // "(//*[text()=\"Yes \"])[2]",
           
        };

        // Loop through the array to click on each checkbox
        for (String xpath : xpaths) {
            WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            checkbox.click();
            Thread.sleep(1000);  // You may want to replace this with a proper wait
        }

 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
           
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println(" Selecting ( CCP Renewal  Eligible  ) additional fillter contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( CCP Renewal Eligible )  additional fillter  does not contain any data.");
           
        }}
    
    //.................................................................................................................     
    @Test(priority =13)
    public void Remove_check3() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                      
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement Ccp = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"CCP\"])[2]")));
        Ccp.click();
        Thread.sleep(2000);
    } 
    
    //....................................................................................................
    @Test(priority = 14)
    public void EW_Fillters() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
               
        WebElement EW = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"EW\"]")));
        EW.click();
        Thread.sleep(2000);
        
        WebElement Ew_New_Sale_Eligable = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"EW New Sale Eligible\"]")));
        Ew_New_Sale_Eligable.click();
        Thread.sleep(2000);
        
   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    
     // Store the XPaths in an array
        String[] xpaths = {
        		
            "(//*[text()=\"No \"])[3]",
            "(//*[text()=\"Yes \"])[2]"
           
        };

        // Loop through the array to click on each checkbox
        for (String xpath : xpaths) {
            WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            checkbox.click();
            Thread.sleep(2000);  // You may want to replace this with a proper wait
        }

 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                       
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println(" Selecting ( Ew_Sale_Eligable  ) additional fillter contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( Ew_Sale_Eligable )  additional fillter  does not contain any data.");
           
        }}
    
  //.................................................................................................................     
    @Test(priority =15)
    public void Remove_check4() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));              
        
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement Ew_New_Sale_Eligable = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"EW New Sale Eligible\"]")));
        Ew_New_Sale_Eligable.click();
        Thread.sleep(2000);
    } 
    
    //.............................................................................................
    @Test(priority = 16)
    public void Ew_Fillter() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));                     
      
        WebElement Ew_Upgrade_Eligable = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"EW Upgrade Eligible\"]")));
        Ew_Upgrade_Eligable.click();
        Thread.sleep(2000);
        
   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    
     // Store the XPaths in an array
        String[] xpaths = {
        		
            "(//*[text()=\"No \"])[4]",
          //  "(//*[text()=\"Yes \"])[2]"
           
        };

        // Loop through the array to click on each checkbox
        for (String xpath : xpaths) {
            WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            checkbox.click();
            Thread.sleep(2000);  // You may want to replace this with a proper wait
        }

 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
             
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println(" Selecting ( Ew_Upgrade_Eligable  ) additional fillter contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( Ew_Upgrade_Eligable )  additional fillter  does not contain any data.");
           
        }}
    //.................................................................................................................     
    @Test(priority =17)
    public void Remove_check5() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));              
        
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement EW2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"EW\"]")));
        EW2.click();
        Thread.sleep(2000);
        
    } 
  //................Additional fillter check data .......................................................................   
    @Test(priority = 18)
    public void Loyality_Fillters() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                               
        WebElement Loyality = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"Loyalty\"])[2]")));
        Loyality.click();
        Thread.sleep(2000);
        
        WebElement Loyality_Tier = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Loyalty Tier\"]")));
        Loyality_Tier.click();
        Thread.sleep(2000);
        
   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    
     // Store the XPaths in an array
        String[] xpaths = {
        		
            "//*[text()=\" Platinum \"]",
            "//*[text()=\" Silver \"]",
            "//*[text()=\" Gold \"]",
            "//*[text()=\" Member \"]"
        };

        // Loop through the array to click on each checkbox
        for (String xpath : xpaths) {
            WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            checkbox.click();
            Thread.sleep(2000);  // You may want to replace this with a proper wait
        }

 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
             
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println(" Selecting ( Loyality_Tier  ) additional fillter contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( Loyality_Tier )  additional fillter  does not contain any data.");
           
        }}
    //.................................................................................................................     
    @Test(priority =19)
    public void Remove_check6() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));              
        
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement Loyality = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"Loyalty\"])[2]")));
        Loyality.click();
        Thread.sleep(2000);        
    }
    
    //................Additional fillter check data .......................................................................   
    @Test(priority = 20)
    public void Customer_tag_Fillters() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));      
                               
        WebElement Customer_tag = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Customer Tag\"]")));
        Customer_tag.click();
        Thread.sleep(3000);
        
        WebElement Warm = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Warm \"]")));
        Warm.click();
        Thread.sleep(3000);
                         
 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
             
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println(" Selecting ( Customer Tag  ) additional fillter contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( Customer Tag )  additional fillter  does not contain any data.");
           
        }}
    //.................................................................................................................     
    @Test(priority =21)
    public void Remove_check7() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));              
        
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement Customer_tag = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Customer Tag\"]")));
        Customer_tag.click();
        Thread.sleep(2000);
        
    }
    //................Additional fillter check data .......................................................................   
    @Test(priority = 22)
    public void lastService_Workshop_Fillters() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
     // Scroll down to bring the "Service Due Workshop" element into view
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Last_service_Workshop = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Last Service Workshop\"]")));
        js.executeScript("arguments[0].scrollIntoView(true);", Last_service_Workshop);
        Thread.sleep(1000); // Allow time for the scroll to complete
        Last_service_Workshop.click();
        Thread.sleep(2000);
                     
   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    
     // Store the XPaths in an array
        String[] xpaths = {
        		
            "//*[text()=\" Not Available \"]",
            "//*[text()=\" OWN \"]",
            "//*[text()=\" OTHER \"]"
            
        };

        // Loop through the array to click on each checkbox
        for (String xpath : xpaths) {
            WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            checkbox.click();
            Thread.sleep(2000);  // You may want to replace this with a proper wait
        }

 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
             
        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println(" Selecting ( Last_service_Workshop  ) additional fillter contains data."); // Data is available
        } else {
          
            Assert.fail( "Selecting  ( Customer Last_service_Workshop )  additional fillter  does not contain any data.");
           
        }}
    //.................................................................................................................     
    @Test(priority =23)
    public void Remove_check8() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));              
        
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement Last_service_Workshop = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Last Service Workshop\"]")));
        Last_service_Workshop.click();
        Thread.sleep(2000);
                            
    }
  //................Additional filter check data ....................................................
    @Test(priority = 24)
    public void Service_due_Workshop_Filters() throws InterruptedException {
        Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Scroll down to bring the "Service Due Workshop" element into view
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll until the element is visible
        WebElement Service_due_Workshop = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Service Due Workshop']")));
        js.executeScript("arguments[0].scrollIntoView(true);", Service_due_Workshop);
        Thread.sleep(1000); // Allow time for the scroll to complete
        Service_due_Workshop.click();
        Thread.sleep(2000);

     
        // Store the XPaths in an array (add any other checkboxes if needed)
        String[] xpaths = {
            "[id=\"mat-checkbox-25\"]",
            // Add other elements here
        };

        // Loop through the array to click on each checkbox
        for (String xpath : xpaths) {
            WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(xpath)));
            checkbox.click();
            Thread.sleep(2000);  // You may want to replace this with a proper wait
        }

        // Find rows in the report table
        List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@summary='table']//tr)"));

        // Check if data is available
        if (reportRows.size() > 1) {
            System.out.println("Selecting (Service_due_Workshop) additional filter contains data."); // Data is available
        } else {
            Assert.fail("Selecting (Service_due_Workshop) additional filter does not contain any data.");
        }
    }
  //.................................................................................................................     
    @Test(priority =25)
    public void Remove_check9() throws InterruptedException {
    	Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));              
        
        WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"close\"]")));
        close.click();
        Thread.sleep(2000);
        
        WebElement Service_due_Workshop2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Service Due Workshop']")));
        Service_due_Workshop2.click();
        Thread.sleep(2000);
                            
    }
}

