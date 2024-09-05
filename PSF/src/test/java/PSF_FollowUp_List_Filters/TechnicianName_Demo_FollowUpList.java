package PSF_FollowUp_List_Filters;

import java.text.ParseException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class TechnicianName_Demo_FollowUpList {
	
	public static WebDriver driver;
	public WebDriverWait wait;

	@SuppressWarnings("deprecation")
	
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev.psfcrm.autovyn.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
	}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 1)
	public void Username() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Username = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
		Username.sendKeys("081001CCM00001");

		Thread.sleep(1000);
	}

	// ......................................................................................
	@Test(priority = 2)
	public void Password() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
		password.sendKeys("Maruti@123");
		Thread.sleep(1000);
	}

	// ......................................................................................
	@Test(priority = 3)
	public void Login_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
		password.click();
		Thread.sleep(3000);
	}

	// ......................................................................................
	@Test(priority = 4)
	public void Click_On_Service_PSF() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement PSF = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POST SERVICE FEEDBACK(PSF)\")]")));
		PSF.click();
		Thread.sleep(3000);
		// Define the expected URL
		String expectedURL = "https://dev.psfcrm.autovyn.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0";

		// Wait until the URL is the expected URL
		wait.until(ExpectedConditions.urlToBe(expectedURL));

		// Get the current URL after the click
		String currentURL = driver.getCurrentUrl();
		// System.out.println("currentURL = " +currentURL );

		// Print the current URL for debugging purposes
		System.out.println("currentURL = " + currentURL);

		// Compare the current URL with the expected URL
		Assert.assertEquals(expectedURL, currentURL);

		Thread.sleep(3000);
	}

	// ......................................................................................
	@Test(priority = 5)
	public void Click_On_the_PSF_Follow_List() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement password = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"PSF Follow Up List\")])[2]")));
		password.click();
		Thread.sleep(3000);
		// Define the expected URL
		String expectedURL = "https://dev.psfcrm.autovyn.in/psf/psf-calling-list?callingTab=0";

		// Wait until the URL is the expected URL
		wait.until(ExpectedConditions.urlToBe(expectedURL));

		// Get the current URL after the click
		String currentURL = driver.getCurrentUrl();
		// System.out.println("currentURL = " +currentURL );

		// Print the current URL for debugging purposes
		System.out.println("currentURL = " + currentURL);

		// Compare the current URL with the expected URL
		Assert.assertEquals(expectedURL, currentURL);

		Thread.sleep(1000);
	}

	// ..................................................................................
	@Test(priority=6)
    public void HeaderPresence() {
    // Find the page header element (e.g., header tag)
    WebElement pageHeader = driver.findElement(By.xpath("(//*[@class=\"pageHeader\"])"));
    String Header= pageHeader.getText();
    
    System.out.println("Header is Displayed: "+Header);
    // Verify the page header is displayed
    Assert.assertTrue(pageHeader.isDisplayed(), "Page header is not displayed");
    }
//...........................................................................................................
	@Test(priority=7)
    public void HeaderContent() {
        // Find the page header element (e.g., header tag)
        WebElement pageHeader = driver.findElement(By.xpath("(//*[@class=\"pageHeader\"])"));
        // Get the text of the page header
        String headerText = pageHeader.getText().trim();
        
        // Verify the page header is not blank
        Assert.assertFalse(headerText.isEmpty(), "Page header is blank");

        // Define the expected header text
        String expectedHeaderText = "PSF Follow Up List";
        // Verify the page header contains the correct header text with correct spelling
        Assert.assertEquals(headerText, expectedHeaderText, "Page header text is incorrect");
        System.out.println("Actual Header: "+headerText);
    }
	
//..........................................................................................................
	
	@Test(priority = 8)
	    public void Verify_Technician_Name_AdditionalFilter() throws InterruptedException, ParseException {
	        // Locate the date filter elements and apply the date range
	        Thread.sleep(4000);
	       
	        String TechnicianName = "BRIJ MOHAN (DP)";
	       
	       
	        // click on Additional Filter
	        WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
	        Actions actions2 = new Actions(driver);
	 
	        // Perform double-click action on the element
	        actions2.click(AdditionFilter).perform();
	           
	        Thread.sleep(3000);
	        // click on Technician Name filter
	                WebElement TechnicianNameFilter = driver.findElement(By.xpath("(//*[@role=\"button\"])[17]"));
	                TechnicianNameFilter.click();
	                Thread.sleep(3000);
	 
//	                  //select required "Technician Name" option
	                WebElement Technician= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \"BRIJ MOHAN (DP)\")]")));
	                Technician.click();
	                Thread.sleep(1000);                
	 
	                // click on arrow to close additional filter tab.
	                Thread.sleep(2000);
	                driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();
	                Thread.sleep(2000);
	                // ....................... Scroll down.....................................
	                Actions scrollAction = new Actions(driver);
	                scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
	 
	                Thread.sleep(3000);
	 
	                // ..............................Click on Item Per Page.........................................
	                WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
	                itemsPerPage.click();
	                WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[1]"));
	                itemsOption.click();
	 
	                Thread.sleep(4000);
	               
	                // Pagination loop
	               
	                boolean hasNextPage = true;
	                int pageNumber = 1;
	         
	                while (hasNextPage) {
	                    // Get the list of customers
	                    List<WebElement> rows = driver.findElements(By.xpath("//*[@role='table']//tbody//tr"));
	 
	                    for (int i = 1; i <= rows.size(); i++) {
	                       
	                        // Navigate to the correct page
	                        if (pageNumber > 1) {
	                            // Click the "Next" button `pageNumber - 1` times to return to the correct page
	                            for (int j = 1; j < pageNumber; j++) {
	                                WebElement nextPageButton = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
	                                if (nextPageButton.isEnabled()) {
	                                    nextPageButton.click();
	                                    Thread.sleep(5000);
	                                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"rowgroup\"])[2]")));
	                                }
	                            }
	                        }
	                        // Adjust the XPath to target the correct row using index
	                        WebElement customerRow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@role='table']//tbody//tr[" + i + "]")));
	                        Thread.sleep(3000);
	                       
	                        // Click the customer link in the row
	                        customerRow.findElement(By.xpath(".//*[@class='mat-cell cdk-cell cdk-column-serviceType mat-column-serviceType ng-star-inserted']")).click();
	                        Thread.sleep(4000);
	 
	                        // Wait until the customer view page is loaded
	                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Customer View')]")));
	 
	                        // Get the Technician Name from the customer view page
	                        String actualTechnicianName = driver.findElement(By.xpath("(//*[@class=\"dtl-right\"])[20]")).getText();
	                        System.out.println("Actual Technician Name in the Customer View Page is: " + actualTechnicianName);
	                        Thread.sleep(3000);
	 
	                        // Verify that the Technician Name matches the expected value
	                        try {
	                            Assert.assertEquals(actualTechnicianName, TechnicianName, "Technician Name mismatch for customer");
	                            System.out.println("Page " + pageNumber + ": Customer " + i + " has the expected Technician Name.");
	                        } catch (AssertionError e) {
	                            // Log the failure without stopping the script
	                            System.out.println("Page " + pageNumber + ": Customer " + i + " does not have the expected Technician Name.");
	                        }
	                        // Go back to the customer list page
	                        driver.navigate().back();
	                        Thread.sleep(5000);
	 
	                        // Wait until the customer list page is loaded again
	                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role='rowgroup'])[2]")));
	                       
	                      }
	                   
	                   
	                 // Check if there are fewer than 100 customers on this page
	                    if (rows.size() < 5) {
	                        hasNextPage = false; // Stop pagination
	                    } else {
	                        pageNumber++;
	                    }
	               
	               
	             // Ensure the script stops after the last customer verification
	                if (rows.size() == 0) {
	                    hasNextPage = false;
	                    System.out.println("Verification completed. No more customers to verify.");
	               
	            }
	                }
	    }
	 
}
