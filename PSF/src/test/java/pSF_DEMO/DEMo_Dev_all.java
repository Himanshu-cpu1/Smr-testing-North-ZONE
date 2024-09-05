package pSF_DEMO;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMo_Dev_all {

	public static WebDriver driver;
	public WebDriverWait wait;

	@SuppressWarnings("deprecation")

	// ...............................................................................................................
	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev.psfcrm.autovyn.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// ...........................................................................................
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
	public void Click_On_PSF() throws InterruptedException {
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
	@Test(priority = 6)
	public void Total_PSF_Due_Numbers_Match() throws InterruptedException {

		WebElement Total = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[1]"));

		// Get the text from the element
		String text1 = Total.getText();
		// System.out.println("Full Text: " + text1);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(text1);
		String extractedNumber = null;
		if (matcher.find()) {
			extractedNumber = matcher.group(1);
			System.out.println("Extracted Number: " + extractedNumber);
		}
		// ........................Item per page..numbers...........

		WebElement totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String text2 = totalCountElement.getText();
		// System.out.println("Full Text 2: " + text2);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(text2);
		String extractedNumber2 = null;
		if (matcher1.find()) {
			extractedNumber2 = matcher.group(1);
			System.out.println("Extracted Number 2 = : " + extractedNumber2);

		}
		Assert.assertEquals(extractedNumber, extractedNumber2, "Numbers does not matches in Total PSF Due ");

		Thread.sleep(2000);
	}

//..............................................................................................

	
	@Test(priority = 7)
		public void Select_RR_Filter_Verify_Data() throws InterruptedException {
		    // Filter selection steps
		    WebElement A5 = driver.findElement(By.xpath("//*[@id='mat-select-0']")); // Filter
		    Thread.sleep(3000);
		    A5.click();
		    Thread.sleep(2000);
		    WebElement A6 = driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='RR']")); //  select Filter
		    A6.click();
		    Thread.sleep(1000);
		    WebElement A7 = driver.findElement(By.xpath("//*[text()=\"PSF Follow Up List\"]"));
		    Actions actions = new Actions(driver);   //for Double click
		    actions.doubleClick(A7).perform();  
		    Thread.sleep(3000);
		    WebElement A8 = driver.findElement(By.xpath("//*[@class=\"mat-form-field-infix ng-tns-c67-28\"]")); //  select Filter
		    A8.click();
		    WebElement A9 = driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' 100 ']")); // Filter
		    A9.click();
	 
		    // Data verification steps
		    // Locate the Next button initially
		    WebElement nextButton = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]")); // Adjust the locator as needed
	 
		    // Counter to keep track of page number
		    int pageNumber = 1;
	 
		    try {
		        // Loop to keep clicking the Next button and verifying data until no more data is found
		        while (nextButton.isEnabled()) {
		            System.out.println("Verifying data on page: " + pageNumber);
	 
		            // Verify the data on the current page
		            if (!verifyData(100)) {
		                System.out.println("No more data found on page " + pageNumber);
		                break; // Exit the loop if no data is found
		            }
	 
		            // Click on the Next button
		            nextButton.click();
	 
		            // Wait for the new data to load (you may need to adjust the wait time or use an explicit wait)
		            Thread.sleep(2000);
	 
		            // Increment the page number
		            pageNumber++;
	 
		            // Re-locate the Next button in case the DOM has changed after the click
		            nextButton = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
		        }
	 
		        // Perform final data verification if needed
		        if (verifyData(100)) {
		            System.out.println("Final data verification after all pages.");
		        } else {
		            System.out.println("No data found for final verification.");
		        }
		    } catch (InterruptedException e) {
		        System.out.println("InterruptedException occurred: " + e.getMessage());
		        Thread.currentThread().interrupt();
		    } catch (Exception e) {
		        System.out.println("Exception occurred: " + e.getMessage());
		    }
		}
	 
		private boolean verifyData(int itemsPerPage)
		{
		    List<WebElement> dataItems = driver.findElements(By.xpath("//*[contains(text(),\" RR \")]"));
	 
		    String r11 = "PRV\n\nRR";
		    String r22 = "COM\n\nRR";
		    int verifiedCount = 0;
	 
		    for (WebElement element : dataItems)
		    {
		        String text = element.getText();
		        // Perform verification for expected values
		        if (text.equals(r11) || text.equals(r22))
		        {
		            verifiedCount++;
		            if (verifiedCount >= itemsPerPage)
		            {
		                return true; // Stop verification if required number of items per page is verified
		            }
		        }
		        else
		        {
		            System.out.println("Unexpected text found and skipped: " + text);
		        }
		    }
		    return false; // Return false if required number of items per page is not verified
		}
		
	//.............................................................................................................	
	//.............................................................................................................
		
		@Test(priority = 10)
		public void verifyCurrentDate() throws InterruptedException {
		    // Refresh the page
		    WebElement Refresh = wait
		            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		    Refresh.click();

		    Thread.sleep(10000);
		    // Retrieve the current date
		    LocalDate currentDate = LocalDate.now();
		    // Define the date format
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		    // Format the current date to match the expected format
		    String formattedCurrentDate = currentDate.format(formatter);

		    System.out.println("Today's Date: " + formattedCurrentDate);

		    // Click on Today's Due
		    WebElement TodayDue = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		    TodayDue.click();
		    Thread.sleep(2000);
	    
		    // Prepare to collect results and status for "PSF Due Date" on each page
		    List<String> results = new ArrayList<>();

		    // Initialize the variable to track if the next page button is clickable
		    boolean isNextPageClickable = true;
		    boolean testFailed = false;
		    boolean dataFound = false;
		    int pageNumber = 0; // Track the current page number

		    // Check if there is data after clicking TodayDue
		    List<WebElement> initialDateCells = driver.findElements(By.xpath(
		            "//td[@class='mat-cell cdk-cell cdk-column-saleDate mat-column-saleDate ng-star-inserted']"));

		    if (initialDateCells.isEmpty()) {
		        System.out.println("No data available for the current date: " + formattedCurrentDate);
		        Assert.fail("No data available for the current date: " + formattedCurrentDate);		        
		    }
		    
		 // Scroll down
		    Actions scrollAction = new Actions(driver);
		    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
		    Thread.sleep(2000);

		    // Click on Item Per Page
		    WebElement itemsPerPage = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
		    itemsPerPage.click();
		    WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		    itemsOption.click();
		    Thread.sleep(4000);
		    
		    
		    // Loop through pages to collect and validate data
		    while (isNextPageClickable) {
		        // Collect all elements representing the filtered data
		        List<WebElement> dateCells = driver.findElements(By.xpath(
		                "//td[@class='mat-cell cdk-cell cdk-column-saleDate mat-column-saleDate ng-star-inserted']"));

		        // Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
		        Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

		        // Log the size of "PSF Due Date" on each page
		        System.out.println("Page " + (pageNumber + 1) + " - Size of PSF Due Date: " + dateCells.size());

		        boolean pageContainsPSFDueDate = !dateCells.isEmpty();

		        // Add "PSF Due Date" data to the results list
		        if (pageContainsPSFDueDate) {
		            // Process each <td> element to extract and validate dates
		            for (WebElement cell : dateCells) {
		                String cellHtml = cell.getAttribute("innerHTML").trim();
		                String[] dates = pattern.split(cellHtml);

		                // Process each PSF due date in the cell
		                for (int i = 1; i < dates.length; i += 2) {
		                    String dateText = dates[i].trim();
		                    String extractedDateText = dateText.split(" ")[0];
		                    System.out.println("Actual PSF Due Date in tab: " + extractedDateText);

		                    if (!extractedDateText.isEmpty()) {
		                        results.add("Page " + (pageNumber + 1) + ": " + dateText); // Add to results list with page
		                                                                                    // info

		                        if (extractedDateText.equals(formattedCurrentDate)) {
		                            dataFound = true;
		                        } else {
		                            System.out.println("PSF Due date " + extractedDateText + " on PAGE " + (pageNumber + 1)
		                                    + " is not equal to the current date " + formattedCurrentDate);
		                            testFailed = true;
		                        }

		                        Assert.assertTrue(extractedDateText.equals(formattedCurrentDate), "PSF Due Date "
		                                + extractedDateText + " is not equal to the current date " + formattedCurrentDate);
		                    }
		                }
		            }

		            if (testFailed) {
		                break; // Stop pagination and fail the test if any date is out of range
		            }

		            // Navigate to the next page
		            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
		            nextPage.click();

		            if (dateCells.size() < 100) {
		                break; // Stop pagination if data elements size is less than 100
		            }
		            pageNumber++;
		        } else {
		            isNextPageClickable = false; // Stop pagination if no PSF Due Dates are found
		        }
		    }

		    if (!dataFound) {
		        System.out.println("No data available for the current date: " + formattedCurrentDate);
		        Assert.fail("No data available for the current date: " + formattedCurrentDate);
		    }

		    if (testFailed) {
		        System.out.println("One or more PSF Due dates were found outside the specified date range.");
		        Assert.fail("One or more PSF Due dates were found outside the specified date range.");
		    }

		    // Print results
		    for (String result : results) {
		        System.out.println(result);
		    }

		    Thread.sleep(2000);
		}
//...........................................................................................................
		@Test(priority = 12)
		public void Total_PSFDue_TodayPSFDue_Button_Matching_With_Tab() throws InterruptedException {
			WebElement TodayPSFDue_Button  = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));

			// Get the text from the element
			String Button1 = TodayPSFDue_Button.getText();
			System.out.println("Full Text of Total PSF Due > Today PSF Due button: " + Button1);

			// Extract the numeric value using regular expressions
			Pattern pattern = Pattern.compile("(\\d+)$");
			Matcher matcher = pattern.matcher(Button1);
			String extractedNumber_Button = null;
			if (matcher.find()) {
				extractedNumber_Button = matcher.group(1);
				System.out.println("Extracted Number from Today PSF Due button text: " + extractedNumber_Button);
			}
			else {
			    System.out.println("No number found in Today PSF Due Button button text.");
			}
			// .............................Item per page numbers...........................................................

			WebElement Pagination_totalCountElement = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-range-label\"])"));
			// Get the text from the element
			String Pagination_text = Pagination_totalCountElement.getText();
		    System.out.println("Full Text of Pagination for Today PSF Due Button: " + Pagination_text);

			// Extract the total count using regular expressions
			Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
			Matcher matcher1 = pattern1.matcher(Pagination_text);
			String extractedNumber_Pagination = null;
			if (matcher1.find()) {
				extractedNumber_Pagination = matcher.group(1);
				System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

			}
			else {
			    System.out.println("No number found in Today Due PSF pagination text.");
			}
			
			Assert.assertEquals(extractedNumber_Button, extractedNumber_Pagination, "Number does not matches in Total PSF Due and Pagination ");
		

	//...........................................................................................
		    //click on Today PSF Due tab
			wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement Tab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-tab-label-content\"])[2]")));
			Tab.click();
			Thread.sleep(3000);
				
	//....................................................................................................................		
	        //click on Today PSF Due tab
			
			// Get the text from the element
			String PendingPSF_text = Tab.getText();
			System.out.println("Full Text of Today Due PSF tab: " + PendingPSF_text);
			
			// Check if the tab text indicates no data
		    if (PendingPSF_text.isEmpty() || PendingPSF_text.equals("Today's Due PSF")) {
		        System.out.println("No data available in Today Due PSF tab.");
		        Assert.fail("No data found in Today Due PSF tab.");
		    } else {
			
			// Extract the numeric value using regular expressions
			Pattern pattern2 = Pattern.compile("\\((\\d+)\\)");
			Matcher matcher2 = pattern2.matcher(PendingPSF_text);
			String extractedNumber_Pending_PSF = null;
			if (matcher2.find()) {
				extractedNumber_Pending_PSF = matcher.group(1);
				System.out.println("Extracted Number from Today Due PSF tab text: " + extractedNumber_Pending_PSF);
				Assert.assertEquals(extractedNumber_Pending_PSF, extractedNumber_Button, "Number does not match in Total PSF Due and Today Due PSF tab");
			}
			else {
				System.out.println("No number found in Today Due PSF tab text.");
				Assert.fail("No data found in Today Due PSF tab.");
			}
			
		}
		}
	//......................................................................................................................	

	 
}