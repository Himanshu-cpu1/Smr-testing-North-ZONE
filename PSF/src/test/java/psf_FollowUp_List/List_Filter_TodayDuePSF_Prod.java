package psf_FollowUp_List;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

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

public class List_Filter_TodayDuePSF_Prod {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	@SuppressWarnings("unused")
	private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	// Other parts of your class remain the same...

	@SuppressWarnings("deprecation")

	// ...............................................................................................................
	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://psfcrm.dealercrm.co.in/psf/psf-calling-list?callingTab=0&page=100&pageIndex=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// ...........................................................................................
	@Test(priority = 1)
	public void Username() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Username = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
		Username.sendKeys("08F101CCM00001");

		Thread.sleep(1000);
	}

	// ......................................................................................
	@Test(priority = 2)
	public void Password() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
		password.sendKeys("Ddccm@1111");
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
		String expectedURL = "https://psfcrm.dealercrm.co.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0";

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
		String expectedURL = "https://psfcrm.dealercrm.co.in/psf/psf-calling-list?callingTab=0";

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

//.......................................................................................	
	 @SuppressWarnings("unused")
	@Test(priority=8)
	    public void verifyCurrentDate() throws InterruptedException {
	        // Retrieve the current date
	        LocalDate currentDate = LocalDate.now();
	     // Define the date format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

	        // Format the current date to match the expected format
	        String formattedCurrentDate = currentDate.format(formatter);

	        System.out.println("Today's Date: " +formattedCurrentDate);
	        
	        //Click on Today's Due
	        
	        WebElement TodayDue= driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	        TodayDue.click();
	        Thread.sleep(2000);
	      //....................... Scroll down.....................................
		    Actions scrollAction = new Actions(driver);
		    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		    Thread.sleep(2000);

		 // ..............................Click on Item Per Page.........................................
		    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-form-field-wrapper ng-tns-c61-28\"])"));
		    itemsPerPage.click();
		    WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		    itemsOption.click();

		    Thread.sleep(4000);
//......................................................................................................................................
		 // Prepare to collect results and status for "PSF Due Date" on each page
		    List<String> results = new ArrayList<>();

		    // Initialize the variable to track if the next page button is click-able
		    boolean isNextPageClickable = true;
		    
		    int pageNumber = 0; // Track the current page number
		    
		    boolean testFailed = false;
	//...................................................................................................	    
		    while (isNextPageClickable) {
		        // Collect all elements representing the filtered data
		        List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-saleDate mat-column-saleDate ng-star-inserted']"));
                
		     // Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
		        Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");
		        
		        // Log the size of "PSF Due Date" on each page
		        System.out.println("Page " + (pageNumber+1) + " - Size of PSF Due Date: " + dateCells.size());

		        boolean pageContainsPSFDueDate = !dateCells.isEmpty();
	//..............................................................................................
		        // Add "PSF Due Date" data to the results list
		        if (pageContainsPSFDueDate) {
		        	// Process each <td> element to extract and validate dates
		            for (WebElement cell : dateCells) {
		                String cellHtml = cell.getAttribute("innerHTML").trim();
		                String[] dates = pattern.split(cellHtml);
		                
		                // Process each psf due date in the cell
		                for (int i = 1; i < dates.length; i += 2) { 
		                
		                    String dateText = dates[i].trim();
		                    
		                 // Extract only the date part from the retrieved text
		                    String extractedDateText = dateText.split(" ")[0];
		                    System.out.println("Actual PSF Due Date in tab: " +extractedDateText );
		                    if (!extractedDateText.isEmpty()) {
		                        results.add(dateText); // Add to results list
		                        
		         
		                     // Compare the date text with the formatted current date
		                        if (!extractedDateText.equals(formattedCurrentDate)) {
		                            System.out.println("PSF Due date " + extractedDateText + " on PAGE " + (pageNumber + 1) + " is not equal to the current date " + formattedCurrentDate);
		                            testFailed = true;
		                        }

		                        Assert.assertTrue(extractedDateText.equals(formattedCurrentDate),
		                            "PSF Due Date " + extractedDateText + " is not equal to the current date " + formattedCurrentDate);
		                    }
		                
		                }
		            }
		            if (testFailed) {
	                    break; // Stop pagination and fail the test if any date is out of range
	                }
		               
		        
	//......................................................................................................
		            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
	                nextPage.click();

	                if (dateCells.size() < 100) {
	                    assert true : "Data elements size is less than 100. Stopping pagination.";
	                    break;
	                }
	                pageNumber++;
	            }
	        }

	        if (testFailed) {
	            Assert.fail("One or more PSF Due dates were found outside the specified date range.");
	        }
	    }

	        
}
	 
//.....................................................................................................................	 



