package psf_Complaint_Management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComplaintManagementPage_Filters_And_Tabs {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	@SuppressWarnings("unused")
	private SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
	// Other parts of your class remain the same...

	@SuppressWarnings("unused")
	private boolean isValidDate(String dateString) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			dateFormat.setLenient(false);
			dateFormat.parse(dateString);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

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
		WebElement Username = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
		Username.sendKeys("081001CCM00001");

		Thread.sleep(2000);
	}

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 2)
	public void Password() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
		password.sendKeys("Maruti@123");
		Thread.sleep(3000);
	}

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 3)
	public void Login_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
		password.click();
		Thread.sleep(4000);
	}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 4)
	public void Click_On_Service_PSF() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement PSF = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POST SERVICE FEEDBACK(PSF)\")]")));
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

		Thread.sleep(5000);
	}

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 5)
	public void Click_On_Complaint_Management_option() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement Module = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-list-item mat-focus-indicator\"])[5]")));
		Module.click();
		Thread.sleep(3000);
		// Define the expected URL
		String expectedURL = "https://dev.psfcrm.autovyn.in/psf/complaint-management";

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

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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
    public void HeaderContent() throws InterruptedException {
        // Find the page header element (e.g., header tag)
        WebElement pageHeader = driver.findElement(By.xpath("(//*[@class=\"pageHeader\"])"));
        // Get the text of the page header
        String headerText = pageHeader.getText().trim();
        
        // Verify the page header is not blank
        Assert.assertFalse(headerText.isEmpty(), "Page header is blank");

        // Define the expected header text
        String expectedHeaderText = "Complaint Management";
        // Verify the page header contains the correct header text with correct spelling
        Assert.assertEquals(headerText, expectedHeaderText, "Page header text is incorrect");
        System.out.println("Actual Header: "+headerText);
        Thread.sleep(6000);
        
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
//..........................................................................................................
	@Test(priority = 8)
	public void Service_Type() throws InterruptedException { // Select all the Filter Option

	String[] filters = { "PAID SEREVICE", "BANDP", "Others", "FR3", "FR2", "FR1"};
		for (String filter : filters) {
			applyFilter(filter);
			Thread.sleep(4000);		
			refreshPage(); // Refresh the page after each filter is tested
		}
	}
	// This method is to Select the Filter

	private void applyFilter(String filterText) throws InterruptedException {
		WebElement filterDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"combobox\"])[1]")));
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		actions.click(filterDropdown).perform();
         Thread.sleep(6000);
		// Retry mechanism to handle cases where options may not be immediately
		// available
		boolean filterSelected = false;
		for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
			try {
				List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				for (WebElement option : options) {
					if (option.getText().equals(filterText)) {
						Actions actions1 = new Actions(driver);
						actions1.click(option).perform();
						filterSelected = true;
						break;
					}
				}
				if (!filterSelected) {
					throw new Exception("Filter option not found on attempt " + (attempt + 1));
				}
			} catch (Exception e) {
				System.out.println("Attempt " + (attempt + 1) + " to select filter failed: " + e.getMessage());
				Thread.sleep(2000); // Wait before retrying
			}
		}

		if (!filterSelected) {
			Assert.fail("Failed to select filter: " + filterText);
		}

		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);	

		WebElement page = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		Actions actions2 = new Actions(driver);
		actions2.doubleClick(page).perform();

		Thread.sleep(3000);
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsPerPage.click();

		Thread.sleep(3000);

		List<String> results = new ArrayList<>();
		List<String> errors = new ArrayList<>();
		boolean isNextPageClickable = true;
		int pageNumber = 0;
		boolean dataFound = false; // Flag to check if any data was found
		

		while (isNextPageClickable) {
			try {
				List<WebElement> dataElements = driver
						.findElements(By.xpath("//*[contains(text(),\"" + filterText + " \")]"));

				System.out.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());

				boolean pageContainsFilterText = !dataElements.isEmpty();
				if (pageContainsFilterText) {
					dataFound = true; // Set flag to true if any data is found
					for (WebElement element : dataElements) {
						String elementText = element.getText();
						results.add(elementText);

						if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
							errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText
									+ "' does not match any in dataElements");
						}
					}
				} else {
					errors.add("Page " + (pageNumber + 1) + " - No '" + filterText + "' elements found.");
				}

				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				if (nextPage.isEnabled()) {
	                nextPage.click();
	            } else {
	                isNextPageClickable = false;
	            }

				if (dataElements.size() < 100) {
					break;
				}
			} catch (Exception e) {
				errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
				isNextPageClickable = false;
			}
			pageNumber++;
		}
		
		// Check if no data was found for the filter
	    if (!dataFound) {
	        errors.add("No data found for filter: " + filterText);
	    }

		removeFilter(filterText);

		if (!errors.isEmpty()) {
			Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
		}

		Thread.sleep(3000);
	}

	// This method is to remove the Filter

	private void removeFilter(String filterText) throws InterruptedException {
		Thread.sleep(3000);
		WebElement filterDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"combobox\"])[1]")));
		filterDropdown.click();

		// Retry mechanism for removing the filter
		boolean filterRemoved = false;
		for (int attempt = 0; attempt < 3 && !filterRemoved; attempt++) {
			try {
				List<WebElement> options = wait.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				for (WebElement option : options) {
					if (option.getText().equals(filterText)) {
						Actions actions = new Actions(driver);
						actions.click(option).perform();
						filterRemoved = true;
						break;
					}
				}
				if (!filterRemoved) {
					throw new Exception("Filter option not found for removal on attempt " + (attempt + 1));
				}
			} catch (Exception e) {
				System.out.println("Attempt " + (attempt + 1) + " to remove filter failed: " + e.getMessage());
				Thread.sleep(1000); // Wait before retrying
			}
		}

		if (!filterRemoved) {
			Assert.fail("Failed to remove filter: " + filterText);
		}

		// Click on the Blank Fields to remove fillter button

		WebElement blankFields = driver.findElement(By.xpath("(//*[@alt=\"img\"])[2]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(blankFields).perform();

		Thread.sleep(3000);
	}
	
	// This method is to refresh the page
	private void refreshPage() throws InterruptedException {
	    WebElement refreshButton = driver.findElement(By.xpath("(//*[@role=\"img\"])[6]")); // Replace with the actual selector for your refresh button
	    refreshButton.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"combobox\"])[1]"))); // Wait until the filter dropdown is visible again
	    Thread.sleep(10000); // Wait for the page to refresh
	}
		
//...................................................................................................................................................	
	@Test(priority = 9)
	public void ClickOn_InProgressComplaintsTab() throws ParseException, InterruptedException {
		Thread.sleep(3000);
		WebElement Inprogress= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@role=\"tab\"])[3]")));
		Inprogress.click();
		Thread.sleep(2000);
	}	
	
//..........................................................................................................
	
	
	@SuppressWarnings("unused")
	@Test(priority = 10)
	public void Verify_AppointmentDate_AdditionalFilter() throws ParseException, InterruptedException {
		// Locate the date filter elements and apply the date range
		Thread.sleep(4000);

		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

        Thread.sleep(10000);

		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		Actions actions = new Actions(driver);
		actions.click(AdditionFilter).perform();
		
		Thread.sleep(4000);

	    //click on Date Filter
		WebElement DateFilter = driver.findElement(By.xpath("(//*[@role=\"button\"])[11]"));
		DateFilter.click();
		Thread.sleep(3000);

		// click on Appointment Date Filter
		WebElement AppDate = driver.findElement(By.xpath("(//*[@role=\"button\"])[14]"));
		AppDate.click();

		// from date button
		Thread.sleep(4000);
		WebElement FromDate = driver.findElement(By.xpath("(//*[text()=\"From Date\"])[3]"));
		Thread.sleep(2000);

		// Interact with the element, for example, click it
		Thread.sleep(3000);

		Actions actions1 = new Actions(driver);

		// Perform single click action on the element
		actions1.click(FromDate).perform();

		Thread.sleep(2000);
		// select date from start date calendar
		// Select the year- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[8]")).click();
		Thread.sleep(3000);

		// Select the month- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[7]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

		// Select Date from end date calendar
		// click on From Date button
		Thread.sleep(4000);
		WebElement ToDate = driver.findElement(By.xpath("(//*[text()=\"To Date\"])[3]"));

		// Interact with the element, for example, click it
		Thread.sleep(3000);

		Actions actions2 = new Actions(driver);

		// Perform click action on the element
		actions2.click(ToDate).perform();

		Thread.sleep(3000);

		// select year-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-container ng-star-inserted\"])[1]")).click();
		Thread.sleep(3000);

		// select month-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[7]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[31]")).click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();

		String startdate = "01-Jul-2023";
		String enddate = "31-Jul-2023";

		// ....................... Scroll down.....................................

		Thread.sleep(3000);
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
//......................................................................................................................................
		// Prepare to collect results and status for "Appointment Date" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number

		boolean testFailed = false;
		
		boolean dataFound = false; // Track if any data is found

//...................................................................................................	    
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-appoinmentdateTime mat-column-appoinmentdateTime ng-star-inserted']/span"));
			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "Appointment Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Appointment Date: " + dateCells.size());

			boolean pageContainsAppDate = !dateCells.isEmpty();
//..............................................................................................
			if (pageContainsAppDate) {
				// Process each <td> element to extract and validate dates
				dataFound = true; // Data is found
				
				for (WebElement cell : dateCells) {
					String cellHtml = cell.getAttribute("innerHTML").trim();
					String[] dates = pattern.split(cellHtml);

					// Process each appointment date in the cell
					for (int i = 1; i < dates.length; i += 2) {

						String dateText = dates[i].trim();

						// Extract only the date part from the retrieved text
						String extractedDateText = dateText.split(" ")[0];
						// System.out.println("Actual Appointment Date in tab: " +extractedDateText );
						if (!extractedDateText.isEmpty()) {
							results.add(dateText); // Add to results list

							Date ApptDate = dateFormat.parse(extractedDateText);
							Date start = dateFormat.parse(startdate);
							Date end = dateFormat.parse(enddate);
							if (!(ApptDate.compareTo(start) >= 0 && ApptDate.compareTo(end) <= 0)) {
								System.out.println("Appointment Date: " + extractedDateText + " on PAGE " + (pageNumber + 1)
										+ " is not within the range " + startdate + " to " + enddate);
								testFailed = true;
							}
							Assert.assertTrue(ApptDate.compareTo(start) >= 0 && ApptDate.compareTo(end) <= 0,
									"Appointment Date " + extractedDateText + " is not within the range " + startdate
											+ " to " + enddate + " on PAGE " + (pageNumber + 1));

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
			}else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Appointment Date' data is available on PAGE " + (pageNumber + 1));
                break;
	        }
        }
		

		if (!dataFound) {
            Assert.fail("No 'Appointment Date' data is found in the customer list.");
        }else if (testFailed) {
        	Assert.fail("One or more 'Appointment Dates' were found outside the specified date range.");
        }
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
 
    }
//............................................................................................................
	@SuppressWarnings("unused")
	@Test(priority = 11)
	public void ClickOn_TotalComplaintsTab() throws ParseException, InterruptedException {
		Thread.sleep(3000);
		WebElement Total= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@role=\"tab\"])[1]")));
		Total.click();
		Thread.sleep(2000);
	}	
	
//..........................................................................................................
	@SuppressWarnings("unused")
	@Test(priority = 12)
	public void Service_Advisor_Name_AdditionalFilter() throws InterruptedException, ParseException {
		// Locate the date filter elements and apply the date range
		Thread.sleep(3000);
		
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

        Thread.sleep(10000);
	
		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);
		// click on SA Name filter
				WebElement SAName = driver.findElement(By.xpath("(//*[@role=\"button\"])[9]"));
				SAName.click();
				Thread.sleep(3000);

//				    //select first "SA NAme" option
				WebElement SAName1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" BHOLE SHANKER \")]")));
				SAName1.click();
				Thread.sleep(1000);

//				    //select second "SA NAme" option
				WebElement SAName2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" SHASHI KANT \")]")));
				SAName2.click();
				Thread.sleep(1000);

				// select third "SA NAme" option
				WebElement SAName3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" MATBAR SINGH \")]")));
				SAName3.click();
				Thread.sleep(1000);

				// select forth "SA NAme" option
				WebElement SAName4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" SANJAY KUMAR \")]")));
				SAName4.click();
				Thread.sleep(1000);

				// select fifth "SA NAme" option
				WebElement SAName5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" DEEPAK RANA \")]")));
				SAName5.click();
				Thread.sleep(1000);
				
				// select fifth "SA NAme" option
				WebElement SAName6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" AMIT YADAV \")]")));
				SAName6.click();
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
				WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
				itemsOption.click();

				Thread.sleep(4000);
				// ......................................................................................................................................
				// Prepare to collect results and status for "Specified SA Name" on each page
				List<String> expectedTexts = Arrays.asList("BHOLE SHANKER", "SHASHI KANT", "MATBAR SINGH", "SANJAY KUMAR", "DEEPAK RANA", "AMIT YADAV");

				List<String> results = new ArrayList<>();

				// Initialize the variable to track if the next page button is click-able
				boolean isNextPageClickable = true;

				int pageNumber = 0; // Track the current page number
				
				boolean pageContainsSpecifiedTexts = false;
				
				boolean dataFound = false;
				// ...................................................................................................
				while (isNextPageClickable) {
					// Collect all elements representing the filtered data

					List<WebElement> dataElements = driver.findElements(By.xpath("(//td[@class=\"mat-cell cdk-cell cdk-column-saName mat-column-saName ng-star-inserted\"])"));

					// Log the size of "Specified SA Name" on each page
					System.out.println("Page " + (pageNumber + 1) + " - Size of Specified SA Name: " + dataElements.size());
                    
				
					boolean pageContainsSAName = !dataElements.isEmpty();
					// Add "SA Name" data to the results list
					if (pageContainsSAName) {
						dataFound = true; // Data is found
						for (WebElement element : dataElements) {
							String elementText = element.getText();

							// Check if any of the expected texts are present in the element text
							boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

							//System.out.println("Element Text: "+elementText);

							if (matchesExpectedText) {
								results.add(elementText);
								pageContainsSpecifiedTexts = true;

							}

							else {
								// Throw an assertion error immediately if none of the expected texts are found
								Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
										+ "' does not contain any expected value: " + expectedTexts);
							}
						}

						// Throw an assertion error if none of the specified texts are found on the page
						if (!pageContainsSpecifiedTexts) {
							Assert.fail("On PAGE " + (pageNumber + 1) + ": No elements with specified texts found.");
						}

						// ......................................................................................................
						// Click on the NextPage button if it's clickable
						WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
						nextPage.click();

						// If the size of dataElements is less than 100, stop the pagination
						if (dataElements.size() < 100) {
							assert true : "Data elements size is less than 100. Stopping pagination.";
							break;
						}
						pageNumber++; // Increment the page number
					}
					else {
			        	// Output message if no data found on the current page
		                System.out.println("No 'SA Name' data is available on PAGE " + (pageNumber + 1));
		                break;
			        }
		        }
					
			if (!dataFound) {
		        Assert.fail("No 'SA Name' data is found in the customer list.");
		    }else if (results.isEmpty()) {
		    	Assert.fail("One or more SA Names were found other than specified SA Names .");
		    }
			
			System.out.println("---------------------------------------------------------------------------------------------------------");
	}
//..............................................................................................................................	
	
	
	@SuppressWarnings("unused")
		@Test(priority = 13)
		public void JCBillDateFilter() throws ParseException, InterruptedException {
			Thread.sleep(4000);

			// refresh the page
			WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
			Refresh.click();

			Thread.sleep(10000);

			WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
			Actions actions = new Actions(driver);

			// Perform click action on the element
			actions.click(AdditionFilter).perform();

			Thread.sleep(3000);

//		    //click on Date Filter
			WebElement DateFilter = driver.findElement(By.xpath("(//*[@role=\"button\"])[11]"));
			DateFilter.click();
			Thread.sleep(3000);

			// click on JC Bill Date Filter
			WebElement JCBillD = driver.findElement(By.xpath("(//*[@role=\"button\"])[16]"));
			JCBillD.click();

			// from date button
			Thread.sleep(3000);
			WebElement FromDate = driver.findElement(By.xpath("(//*[text()=\"From Date\"])[5]"));
			
			// Interact with the element, for example, click it
			Thread.sleep(3000);

			Actions actions1 = new Actions(driver);

			// Perform click action on the element
			actions1.click(FromDate).perform();

			Thread.sleep(3000);
			// select date from start date calendar
			// Select the year- start date
			driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[8]")).click();
			Thread.sleep(3000);

			// Select the month- start date
			driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[5]")).click();

			// Select the day- start date
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

			// Select Date from end date calendar
			// click on From Date button
			Thread.sleep(4000);
			WebElement ToDate = driver.findElement(By.xpath("(//*[text()=\"To Date\"])[5]"));

			// Interact with the element, for example, click it
			Thread.sleep(3000);

			Actions actions2 = new Actions(driver);

			// Perform click action on the element
			actions2.click(ToDate).perform();

			Thread.sleep(2000);

			// select year-end date
			driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();
			Thread.sleep(3000);

			// select month-end date
			driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[5]")).click();

			// Select the day- start date
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[31]")).click();

			// click on arrow to close additional filter tab.
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();

			String startdate = "01-May-2023";
			String enddate = "31-May-2023";

			// ....................... Scroll down.....................................

			Thread.sleep(3000);
			Actions scrollAction = new Actions(driver);
			scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

			Thread.sleep(2000);

			// ..............................Click on Item Per
			// Page.........................................
			WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
			itemsPerPage.click();
			WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
			itemsOption.click();

			Thread.sleep(4000);
	//......................................................................................................................................
			// Prepare to collect results and status for "JC Bill dates" on each page
			List<String> results = new ArrayList<>();

			// Initialize the variable to track if the next page button is click-able
			boolean isNextPageClickable = true;

			int pageNumber = 0; // Track the current page number

			boolean testFailed = false;
			
			boolean dataFound = false; // Track if any data is found
	//...................................................................................................	    
			while (isNextPageClickable) {
				// Collect all elements representing the filtered data
				List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-jobBillDate mat-column-jobBillDate ng-star-inserted']/span"));
				// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
				
				Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

				// Log the size of "JC Bill Date" on each page
				System.out.println("Page " + (pageNumber + 1) + " - Size of JC Bill Date: " + dateCells.size());

				boolean pageContainsSaleDate = !dateCells.isEmpty();
	//..............................................................................................
				// Add "JC Bill Date" data to the results list
				
				
				if (pageContainsSaleDate) {
					// Process each <td> element to extract and validate dates
					dataFound = true; // Data is found
					for (int i = 1; i < dateCells.size(); i += 2) {
						WebElement dateCell = dateCells.get(i);
						String cellText = dateCell.getText().trim().replaceAll("\\s+", " "); // Clean up text
						if (!cellText.isEmpty()) {
							String[] dateStrings = cellText.split(" ");

							for (String dateString : dateStrings) {
								dateString = dateString.trim();
								if (!dateString.isEmpty() && isValidDate(dateString)) {
									results.add(dateString); // Add to results list
									Date JCBillDate = dateFormat.parse(dateString);
									Date start = dateFormat.parse(startdate);
									Date end = dateFormat.parse(enddate);
									if (!(JCBillDate.compareTo(start) >= 0 && JCBillDate.compareTo(end) <= 0)) {
										System.out.println("JC Bill Date " + dateString + " on PAGE " + (pageNumber + 1)
												+ " is not within the range " + startdate + " to " + enddate);
										testFailed = true;
									}
									Assert.assertTrue(JCBillDate.compareTo(start) >= 0 && JCBillDate.compareTo(end) <= 0,
											"JC Bill Date " + dateString + " is not within the range " + startdate + " to "
													+ enddate + " on PAGE " + (pageNumber + 1));
								}
								}
							}
					}
					
					if (testFailed) {
						break; // Stop pagination and fail the test if any date is out of range
					}
					
	//......................................................................................................
					WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
					nextPage.click();
					Thread.sleep(3000);

					if (dateCells.size() < 100) {
						assert true : "Data elements size is less than 100. Stopping pagination.";
						break;
					}
					pageNumber++;
				}
				
				
				else {
		        	// Output message if no data found on the current page
	                System.out.println("No 'JC Bill date' data is available on PAGE " + (pageNumber + 1));
	                break;
		        }
	        }
			
			
			if (!dataFound) {
	            Assert.fail("No 'JC Bill date' data is found in the customer list.");
	        }else if (testFailed) {
	        	Assert.fail("One or more JC Bill Date were found outside the specified date range.");
	        }
			
			System.out.println("--------------------------------------------------------------------------------------------");
	 
	    }

		
////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings({ "unused" })
	@Test(priority = 14)
	public void LastCallDateFilter() throws ParseException, InterruptedException {
	//Refresh the page
		
     WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
	 Refresh.click();

		Thread.sleep(10000);
		
		//Navigate to Open Complaint Tab

		WebElement OpenComplaintTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[2]")));
		OpenComplaintTab.click();

		Thread.sleep(2000);

		WebElement AdditionFilter = driver.findElement(By.xpath("(//*[@role=\"img\"])[8]"));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Date Filter
		WebElement DateFilter = driver.findElement(By.xpath("(//*[@role=\"button\"])[11]"));
		DateFilter.click();
		Thread.sleep(3000);

		// click on Last Call date Filter
		WebElement LastCallDate = driver.findElement(By.xpath("(//*[@role=\"button\"])[17]"));
		Thread.sleep(3000);

		Actions actions = new Actions(driver);

		// Perform click action on the element
		actions.click(LastCallDate).perform();

		// from date
		Thread.sleep(3000);
		WebElement FromDate = driver.findElement(By.xpath("(//*[text()=\"From Date\"])[7]"));

		Thread.sleep(3000);

		Actions actions1 = new Actions(driver);

		// Perform click action on the element
		actions1.click(FromDate).perform();

		Thread.sleep(2000);

		// select date from start date calendar
		// Select the year- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[8]")).click();
		Thread.sleep(3000);

		// Select the month- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[10]"))
				.click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

		// Select Date from end date calendar
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("(//*[text()=\"To Date\"])[7]"));
		Thread.sleep(3000);

		Actions actions2 = new Actions(driver);

		// Perform double-click action on the element
		actions2.click(element2).perform();

		Thread.sleep(2000);

		// select year-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();
		Thread.sleep(3000);

// select month-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[10]")).click();

// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[31]")).click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();

		// select date range
		String startdate = "01-Oct-2023";
		String enddate = "31-Oct-2023";

// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(3000);

// ..............................Click on Item Per Page.........................................................................

		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));

		Thread.sleep(2000);
		Actions actions3 = new Actions(driver);

		// Perform click action on the element
		actions3.click(itemsPerPage).perform();

		Thread.sleep(2000);

		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(3000);
//......................................................................................................................................
// Prepare to collect results and status for "Last Call date" on each page
		List<String> results = new ArrayList<>();

// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number

		boolean testFailed = false;
		
		boolean dataFound = false; // Track if any data is found
		
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-complaintRegDateTime mat-column-complaintRegDateTime ng-star-inserted']/span"));

			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "Last Call Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Last Call Date: " + dateCells.size());

			boolean pageContainsLastCallDate = !dateCells.isEmpty();
// ..............................................................................................
// Add "Last Call Date" data to the results list
			if (pageContainsLastCallDate) {
				// Process each <td> element to extract and validate dates
				dataFound = true; // Data is found
				for (WebElement cell : dateCells) {
					String cellHtml = cell.getAttribute("innerHTML").trim();
					String[] dates = pattern.split(cellHtml);

					// Process each Last Call Date in the cell
					for (int i = 1; i < dates.length; i += 2) {

						String dateText = dates[i].trim();
						if (!dateText.isEmpty()) {
							results.add(dateText); // Add to results list
							Date LastDate = dateFormat.parse(dateText);
							Date start = dateFormat.parse(startdate);
							Date end = dateFormat.parse(enddate);
							if (!(LastDate.compareTo(start) >= 0 && LastDate.compareTo(end) <= 0)) {
								System.out.println("Last Call Date " + dateText + " on PAGE " + (pageNumber + 1)
										+ " is not within the range " + startdate + " to " + enddate);
								testFailed = true;
							}
							Assert.assertTrue(LastDate.compareTo(start) >= 0 && LastDate.compareTo(end) <= 0,
									"Last Call Date " + dateText + " is not within the range " + startdate + " to "
											+ enddate);

						}
					}
				}
				if (testFailed) {
					break; // Stop pagination and fail the test if any date is out of range
				}

				// ......................................................................................................
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				if (dateCells.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++;
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Last Call Date' data is available on PAGE " + (pageNumber + 1));
                break;
	        }
        }
		

		 if (!dataFound) {
	            Assert.fail("No 'Last Call Date' data is found in the customer list.");
	        }else if (testFailed) {
	        	Assert.fail("One or more Last Call Date were found outside the specified date range.");
	        }
	 
		 System.out.println("---------------------------------------------------------------------------------------------------------------------");
	    }
//..............................................................................................................
	  
	@SuppressWarnings({ "unused" })
	@Test(priority = 15)
	public void ResolutionDateFilter() throws ParseException, InterruptedException {
	//Refresh the page
		
     WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
	 Refresh.click();

		Thread.sleep(10000);
		
		//Navigate to Resolved Complaint Tab

		WebElement ResolvedComplaintTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[4]")));
		ResolvedComplaintTab.click();

		Thread.sleep(2000);

		WebElement AdditionFilter = driver.findElement(By.xpath("(//*[@role=\"img\"])[8]"));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Date Filter
		WebElement DateFilter = driver.findElement(By.xpath("(//*[@role=\"button\"])[11]"));
		DateFilter.click();
		Thread.sleep(3000);

		// click on Resolution Date Filter
		WebElement Resolution_Date = driver.findElement(By.xpath("(//*[@role=\"button\"])[19]"));
		Thread.sleep(3000);

		Actions actions = new Actions(driver);

		// Perform click action on the element
		actions.click(Resolution_Date).perform();

		// from date
		Thread.sleep(3000);
		WebElement FromDate = driver.findElement(By.xpath("(//*[text()=\"From Date\"])[8]"));

		Thread.sleep(3000);

		Actions actions1 = new Actions(driver);

		// Perform click action on the element
		actions1.click(FromDate).perform();

		Thread.sleep(2000);

		// select date from start date calendar
		// Select the year- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[8]")).click();
		Thread.sleep(3000);

		// Select the month- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[6]"))
				.click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

		// Select Date from end date calendar
		Thread.sleep(2000);
		WebElement ToDate = driver.findElement(By.xpath("(//*[text()=\"To Date\"])[8]"));
		Thread.sleep(3000);

		Actions actions2 = new Actions(driver);

		// Perform click action on the element
		actions2.click(ToDate).perform();

		Thread.sleep(2000);

		// select year-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();
		Thread.sleep(3000);

		// select month-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[6]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[30]")).click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();

		// select date range
		String startdate = "01-Jun-2023";
		String enddate = "30-Jun-2023";

		// ....................... Scroll down..............................................................................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(3000);

		// ..............................Click on Item Per Page.........................................................................

		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));

		Thread.sleep(2000);
		Actions actions3 = new Actions(driver);

		// Perform click action on the element
		actions3.click(itemsPerPage).perform();

		Thread.sleep(2000);

		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(3000);
//......................................................................................................................................
		// Prepare to collect results and status for "Resolution Date" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number

		boolean testFailed = false;
		
		boolean dataFound = false; // Track if any data is found
		
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-resolutionDateTime mat-column-resolutionDateTime ng-star-inserted']"));

			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "Resolution Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Resolution Date: " + dateCells.size());

			boolean pageContainsResolutionDate = !dateCells.isEmpty();
			// ..............................................................................................
			// Add "Resolution Date" data to the results list
			if (pageContainsResolutionDate) {
				// Process each <td> element to extract and validate dates
				dataFound = true; // Data is found
				for (WebElement cell : dateCells) {
					String cellHtml = cell.getAttribute("innerHTML").trim();
					String[] dates = pattern.split(cellHtml);

					// Process each Resolution Date in the cell
					for (int i = 0; i < dates.length; i += 2) {

						String dateText = dates[i].trim();
						if (!dateText.isEmpty()) {
							results.add(dateText); // Add to results list
							Date ResolutionDate = dateFormat.parse(dateText);
							Date start = dateFormat.parse(startdate);
							Date end = dateFormat.parse(enddate);
							if (!(ResolutionDate.compareTo(start) >= 0 && ResolutionDate.compareTo(end) <= 0)) {
								System.out.println("Resolution Date: " + dateText + " on PAGE " + (pageNumber + 1)
										+ " is not within the range " + startdate + " to " + enddate);
								testFailed = true;
							}
							Assert.assertTrue(ResolutionDate.compareTo(start) >= 0 && ResolutionDate.compareTo(end) <= 0,
									"ResolutionDate: " + dateText + " is not within the range " + startdate + " to "
											+ enddate);

						}
					}
				}
				if (testFailed) {
					break; // Stop pagination and fail the test if any date is out of range
				}

				// ......................................................................................................
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				if (dateCells.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++;
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Resolution Date' data is available on PAGE " + (pageNumber + 1));
                break;
	        }
        }
		

		 if (!dataFound) {
	            Assert.fail("No 'Resolution Date' data is found in the customer list.");
	        }else if (testFailed) {
	        	Assert.fail("One or more 'Resolution Date' were found outside the specified date range.");
	        }
	 
		 System.out.println("---------------------------------------------------------------------------------------------------------------------");
	    }
//..............................................................................................................
	@SuppressWarnings({ "unused" })
	@Test(priority = 16)
	public void ComplaintRegDateFilter() throws ParseException, InterruptedException {
	//Refresh the page
		
     WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
	 Refresh.click();

		Thread.sleep(10000);
		
		//Navigate to Resolved Complaint Tab

		WebElement TotalComplaintTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[1]")));
		TotalComplaintTab.click();

		Thread.sleep(4000);

		
		WebElement AdditionFilter = driver.findElement(By.xpath("(//*[@role=\"img\"])[8]"));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Date Filter
		WebElement DateFilter = driver.findElement(By.xpath("(//*[@role=\"button\"])[11]"));
		DateFilter.click();
		Thread.sleep(3000);

		// click on Complaint Reg Date Filter
		WebElement ComplaintReg_Date = driver.findElement(By.xpath("(//*[@role=\"button\"])[21]"));
		Thread.sleep(3000);

		Actions actions = new Actions(driver);

		// Perform click action on the element
		actions.click(ComplaintReg_Date).perform();

		// from date
		Thread.sleep(3000);
		WebElement FromDate = driver.findElement(By.xpath("(//*[text()=\"From Date\"])[10]"));

		Thread.sleep(3000);

		Actions actions1 = new Actions(driver);

		// Perform click action on the element
		actions1.click(FromDate).perform();

		Thread.sleep(2000);

		// select date from start date calendar
		// Select the year- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[8]")).click();
		Thread.sleep(3000);

		// Select the month- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[10]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

		// Select Date from end date calendar
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("(//*[text()=\"To Date\"])[10]"));
		Thread.sleep(3000);

		Actions actions2 = new Actions(driver);

		// Perform click action on the element
		actions2.click(element2).perform();

		Thread.sleep(2000);

		// select year-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();
		Thread.sleep(3000);

		// select month-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[10]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[31]")).click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();

		// select date range
		String startdate = "01-Oct-2023";
		String enddate = "31-Oct-2023";

		// ....................... Scroll down..............................................................................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(3000);

		// ..............................Click on Item Per Page.........................................................................

		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));

		Thread.sleep(2000);
		Actions actions3 = new Actions(driver);

		// Perform click action on the element
		actions3.click(itemsPerPage).perform();

		Thread.sleep(2000);

		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(3000);
//......................................................................................................................................
		// Prepare to collect results and status for "Complaint Reg date" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number

		boolean testFailed = false;
		
		boolean dataFound = false; // Track if any data is found
		
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-complaintRegDateTime mat-column-complaintRegDateTime ng-star-inserted']/span"));

			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "Complaint Reg Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Complaint Reg. Date: " + dateCells.size());

			boolean pageContainsRegDate = !dateCells.isEmpty();
			// ..............................................................................................
			// Add "Complaint Reg. Date" data to the results list
			if (pageContainsRegDate) {
				// Process each <td> element to extract and validate dates
				dataFound = true; // Data is found
				for (WebElement cell : dateCells) {
					String cellHtml = cell.getAttribute("innerHTML").trim();
					String[] dates = pattern.split(cellHtml);

					// Process each Complaint Reg Date in the cell
					for (int i = 0; i < dates.length; i += 2) {

						String dateText = dates[i].trim();
						if (!dateText.isEmpty()) {
							results.add(dateText); // Add to results list
							Date RegDate = dateFormat.parse(dateText);
							Date start = dateFormat.parse(startdate);
							Date end = dateFormat.parse(enddate);
							if (!(RegDate.compareTo(start) >= 0 && RegDate.compareTo(end) <= 0)) {
								System.out.println("Complaint Registration Date: " + dateText + " on PAGE " + (pageNumber + 1)
										+ " is not within the range " + startdate + " to " + enddate);
								testFailed = true;
							}
							Assert.assertTrue(RegDate.compareTo(start) >= 0 && RegDate.compareTo(end) <= 0,
									"Complaint Registration Date: " + dateText + " is not within the range " + startdate + " to "
											+ enddate);

						}
					}
				}
				if (testFailed) {
					break; // Stop pagination and fail the test if any date is out of range
				}

				// ......................................................................................................
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				if (dateCells.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++;
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Complaint Registration Date' data is available on PAGE " + (pageNumber + 1));
                break;
	        }
        }
		

		 if (!dataFound) {
	            Assert.fail("No 'Complaint Registration Date' data is found in the customer list.");
	        }else if (testFailed) {
	        	Assert.fail("One or more 'Complaint Registration Date' were found outside the specified date range.");
	        }
	 
		 System.out.println("---------------------------------------------------------------------------------------------------------------------");
	    }
//..............................................................................................................
	@SuppressWarnings("unused")
	@Test(priority = 17)
	public void Resolution_Mechanism_Filter_For_Explanation() throws ParseException, InterruptedException {
		Thread.sleep(4000);

		// Refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);
		
		//navigate to Resolved Complaints tab.
		WebElement ResolvedComp= driver.findElement(By.xpath("(//*[@role=\"tab\"])[4]"));
		ResolvedComp.click();
		Thread.sleep(3000);

		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Resolution Mechanism filter
		WebElement ResolutionMech = driver.findElement(By.xpath("(//*[@role=\"button\"])[24]"));
		ResolutionMech.click();
		Thread.sleep(2000);
		
		//select Resolution mechanism option- Home Visit
		WebElement Explanation = driver.findElement(By.xpath("//*[contains(text(), \" Explanation \")]"));
		Explanation.click();
		Thread.sleep(3000);
		
		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified Resolution Mechanism" on each page
		List<String> expectedTexts = Arrays.asList("Explanation");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-resolutionTime mat-column-resolutionTime ng-star-inserted']"));

			// Log the size of "Specified Resolution Mechanism" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified Resolution Mechanism- 'Explanation': " + dataElements.size());

			
			
			boolean pageContainsResolutionMech = !dataElements.isEmpty();
			// Add "Resolution Mechanism- Explanation" data to the results list
			if (pageContainsResolutionMech) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Resolution Mechanism' data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'Resolution Mechanism' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more Leads were found with Resolution Mechanism other than specified 'Explanation' Resolution Mechanism.");
        }
             System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 18)
	public void Resolution_Mechanism_Filter_For_WorkshopVisit() throws ParseException, InterruptedException {
		Thread.sleep(4000);

		// Refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);
		
		//navigate to Resolved Complaints tab.
		WebElement ResolvedComp= driver.findElement(By.xpath("(//*[@role=\"tab\"])[4]"));
		ResolvedComp.click();
		Thread.sleep(3000);

		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Resolution Mechanism filter
		WebElement ResolutionMech = driver.findElement(By.xpath("(//*[@role=\"button\"])[24]"));
		ResolutionMech.click();
		Thread.sleep(2000);
		
		//select Resolution mechanism option- Home Visit
		WebElement Workshop = driver.findElement(By.xpath("//*[contains(text(), \" Workshop Visit \")]"));
		Workshop.click();
		Thread.sleep(3000);
	
		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified Resolution Mechanism" on each page
		List<String> expectedTexts = Arrays.asList("Workshop Visit");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-resolutionTime mat-column-resolutionTime ng-star-inserted']"));

			// Log the size of "Specified Resolution Mechanism" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified Resolution Mechanism- 'Workshop Visit': " + dataElements.size());

			
			
			boolean pageContainsResolutionMech = !dataElements.isEmpty();
			// Add "Resolution Mechanism" data to the results list
			if (pageContainsResolutionMech) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Resolution Mechanism' data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'Resolution Mechanism' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more Leads were found with Resolution Mechanism other than specified 'Workshop Visit' Resolution Mechanism.");
        }
 
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 19)
	public void Resolution_Mechanism_Filter_For_HomeVisit() throws ParseException, InterruptedException {
		Thread.sleep(4000);

		// Refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);
		
		//navigate to Resolved Complaints tab.
		WebElement ResolvedComp= driver.findElement(By.xpath("(//*[@role=\"tab\"])[4]"));
		ResolvedComp.click();
		Thread.sleep(3000);

		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Resolution Mechanism filter
		WebElement ResolutionMech = driver.findElement(By.xpath("(//*[@role=\"button\"])[24]"));
		ResolutionMech.click();
		Thread.sleep(2000);
		
		//select Resolution mechanism option- Home Visit
		WebElement Home = driver.findElement(By.xpath("//*[contains(text(), \" Home Visit \")]"));
		Home.click();
		Thread.sleep(3000);
		
		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified Resolution Mechanism" on each page
		List<String> expectedTexts = Arrays.asList("Home Visit");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-resolutionTime mat-column-resolutionTime ng-star-inserted']"));

			// Log the size of "Specified Resolution Mechanism" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified Resolution Mechanism- 'Home Visit': " + dataElements.size());

			
			
			boolean pageContainsResolutionMech = !dataElements.isEmpty();
			// Add "Model Name" data to the results list
			if (pageContainsResolutionMech) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Resolution Mechanism' data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'Resolution Mechanism' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more Leads were found with Resolution Mechanism other than specified 'Home Visit' Resolution Mechanism.");
        }
 
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test (priority=20)
    public void TestFilterComplaintAge() throws InterruptedException {
		Thread.sleep(4000);
		
		//navigate to Resolved Complaints tab.
		WebElement TotalComp= driver.findElement(By.xpath("(//*[@role=\"tab\"])[1]"));
		TotalComp.click();
		Thread.sleep(4000);
	
	    //Refresh the page
		
        WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
        Refresh.click();

   		Thread.sleep(10000);

   		WebElement AdditionFilter = driver.findElement(By.xpath("(//*[@role=\"img\"])[8]"));
   		AdditionFilter.click();
   		Thread.sleep(3000);

        // Locate the filter drop down and select the filterDays option
        WebElement ComplaintAge = driver.findElement(By.xpath("(//*[@role=\"button\"])[25]")); // Replace with the actual ID
        ComplaintAge.click();
        
        Thread.sleep(3000);
        // click filter option
		WebElement AgeOption = driver.findElement(By.xpath("(//*[text()=\" 300 \"])"));
	    Actions actions1 = new Actions(driver);

        // Perform click action on the element
        	actions1.click(AgeOption).perform();
        		

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
				WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
				itemsOption.click();

				Thread.sleep(4000);
				// ......................................................................................................................................
				// Prepare to collect results and status for "Specified Complaint Age" on each page
				List<String> expectedTexts = Arrays.asList("300");
				 

				List<String> results = new ArrayList<>();

				// Initialize the variable to track if the next page button is click-able
				boolean isNextPageClickable = true;

				int pageNumber = 0; // Track the current page number
				
				
				boolean dataFound = false;
				// ...................................................................................................
				while (isNextPageClickable) {
					// Collect all elements representing the filtered data

					List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class=\"mat-cell cdk-cell cdk-column-complaintAge mat-column-complaintAge ng-star-inserted\"]"));

					// Log the size of "Specified Complaint Age" on each page
					System.out.println("Page " + (pageNumber + 1) + " - Size of Specified Complaint Age: " + dataElements.size());
                    
				
					boolean pageContainsAge = !dataElements.isEmpty();
					// Add "Complaint Age" data to the results list
					if (pageContainsAge) {
						dataFound = true; // Data is found
						for (WebElement element : dataElements) {
							String elementText = element.getText().trim();
							
							// Split the text by whitespace and take the second part (which should be the number)
			                String numericPart = elementText.replaceAll("[^0-9]", "").trim();
							
							System.out.println("Numeric Part: "+numericPart);

							// Check if any of the expected texts are present in the element text
							boolean matchesExpectedText = false;
			                for (String expectedText : expectedTexts) {
			                    if (numericPart.equals(expectedText)) {
			                        matchesExpectedText = true;
			                        break;
			                    }
			                }
							

							if (matchesExpectedText) {
								results.add(numericPart);
								
							}

							else {
								// Throw an assertion error immediately if none of the expected texts are found
								Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + numericPart
										+ "' does not contain any expected value: " + expectedTexts);
							}
						}

						
						// ......................................................................................................
						// Click on the NextPage button if it's clickable
						WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
						nextPage.click();

						// If the size of dataElements is less than 100, stop the pagination
						if (dataElements.size() < 100) {
							assert true : "Data elements size is less than 100. Stopping pagination.";
							break;
						}
						
						pageNumber++; // Increment the page number
					}
					else {
			        	// Output message if no data found on the current page
		                System.out.println("No 'Complaint Age' data is available on PAGE " + (pageNumber + 1));
		                break;
			        }
		        }
					
			if (!dataFound) {
		        Assert.fail("No 'Complaint Age' data is found in the customer list.");
		    }else if (results.isEmpty()) {
		    	Assert.fail("One or more 'Complaint Age' were found other than specified Complaint Age .");
		    }
			
			System.out.println("------------------------------------------------------------------------------------------------------");
	}
//..............................................................................................................................	

	@SuppressWarnings("unused")
	@Test (priority=21)
    public void TestFilterResolutionTime() throws InterruptedException {
		Thread.sleep(2000);
		
		
		WebElement ResolvedComplaintTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[4]")));
   		ResolvedComplaintTab.click();

   		Thread.sleep(3000);
   		
        //Refresh the page
		
        WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
        Refresh.click();

   		Thread.sleep(10000);

   		WebElement AdditionFilter = driver.findElement(By.xpath("(//*[@role=\"img\"])[8]"));
   		AdditionFilter.click();
   		Thread.sleep(3000);

        // Locate the filter drop down and select the filterDays option
        WebElement ResolutionTime = driver.findElement(By.xpath("(//*[@role=\"button\"])[26]")); // Replace with the actual ID
        ResolutionTime.click();
        
        Thread.sleep(3000);
                // click filter option
				WebElement TimeOption = driver.findElement(By.xpath("(//*[text()=\" 0 \"])"));
			 	Actions actions1 = new Actions(driver);

        		// Perform click action on the element
        		actions1.click(TimeOption).perform();
        		

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
				WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
				itemsOption.click();

				Thread.sleep(4000);
				// ......................................................................................................................................
				// Prepare to collect results and status for "Specified Resolution Time" on each page
				List<String> expectedTexts = Arrays.asList("0");
				 

				List<String> results = new ArrayList<>();

				// Initialize the variable to track if the next page button is click-able
				boolean isNextPageClickable = true;

				int pageNumber = 0; // Track the current page number
				
				
				boolean dataFound = false;
				// ...................................................................................................
				while (isNextPageClickable) {
					// Collect all elements representing the filtered data

					List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class=\"mat-cell cdk-cell cdk-column-resolutionTime mat-column-resolutionTime ng-star-inserted\"]"));

					// Log the size of "Specified Resolution Time" on each page
					System.out.println("Page " + (pageNumber + 1) + " - Size of Specified Resolution Time: " + dataElements.size());
                    
				
					boolean pageContainsTime = !dataElements.isEmpty();
					// Add "Resolution Days" data to the results list
					if (pageContainsTime) {
						dataFound = true; // Data is found
						for (WebElement element : dataElements) {
							String elementText = element.getText().trim();
							
							// Split the text by whitespace and take the first part (which should be the number)
			                String numericPart = elementText.split("\\s+")[0];
							
							System.out.println("Numeric Part: "+numericPart);

							// Check if any of the expected texts are present in the element text
							boolean matchesExpectedText = false;
			                for (String expectedText : expectedTexts) {
			                    if (numericPart.equals(expectedText)) {
			                        matchesExpectedText = true;
			                        break;
			                    }
			                }
							

							if (matchesExpectedText) {
								results.add(numericPart);
								
							}

							else {
								// Throw an assertion error immediately if none of the expected texts are found
								Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + numericPart
										+ "' does not contain any expected value: " + expectedTexts);
							}
						}

						
						// ......................................................................................................
						// Click on the NextPage button if it's clickable
						WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
						nextPage.click();

						// If the size of dataElements is less than 100, stop the pagination
						if (dataElements.size() < 100) {
							assert true : "Data elements size is less than 100. Stopping pagination.";
							break;
						}
						pageNumber++; // Increment the page number
					}
					else {
			        	// Output message if no data found on the current page
		                System.out.println("No 'Resolution Time' data is available on PAGE " + (pageNumber + 1));
		                break;
			        }
		        }
					
			if (!dataFound) {
		        Assert.fail("No 'Resolution Time' data is found in the customer list.");
		    }else if (results.isEmpty()) {
		    	Assert.fail("One or more Resolution Days were found other than specified Resolution Days .");
		    	
		    }
			
			System.out.println("-----------------------------------------------------------------------------------------------------");
	}
	
//..............................................................................................................................	

	@SuppressWarnings("unused")
	@Test(priority = 22)
	public void PSF_Rating_Index_FilterOption_AVERAGE() throws ParseException, InterruptedException {
		Thread.sleep(4000);
		
		//Navigate to Total Complaint Tab

		WebElement TotalComplaintTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[1]")));
		TotalComplaintTab.click();

		Thread.sleep(3000);


		// Refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);
		
		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on PSF Rating Index option filter
		WebElement RatingIndex = driver.findElement(By.xpath("(//*[@role=\"button\"])[27]"));
		RatingIndex.click();
		Thread.sleep(2000);
		
		//select PSF Rating option- Average
		WebElement Average = driver.findElement(By.xpath("(//*[@class=\"mat-checkbox-label\"])[166]"));
		Average.click();
		Thread.sleep(3000);
			
		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified PSF rating" on each page
		List<String> expectedTexts = Arrays.asList("Average");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-complaintAge mat-column-complaintAge ng-star-inserted']"));

			// Log the size of "Specified PSF Ratings" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified PSF Rating- 'AVERAGE': " + dataElements.size());

			
			
			boolean pageContainsPSFRating = !dataElements.isEmpty();
			// Add "PSF Rating" data to the results list
			if (pageContainsPSFRating) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'PSF Ratings' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more Leads were found with PSF Ratings other than specified 'Average' PSF Rating.");
        }
             System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 23)
	public void PSF_Rating_Index_FilterOption_POOR() throws ParseException, InterruptedException {
		Thread.sleep(4000);

		// Refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);
		
		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on PSF Rating Index option filter
		WebElement RatingIndex = driver.findElement(By.xpath("(//*[@role=\"button\"])[27]"));
		RatingIndex.click();
		Thread.sleep(2000);
		
		//select PSF Rating option- Poor
		WebElement Poor = driver.findElement(By.xpath("(//*[@class=\"mat-checkbox-label\"])[167]"));
		Poor.click();
		Thread.sleep(3000);
				
		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified PSF Rating" on each page
		List<String> expectedTexts = Arrays.asList("Poor");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-complaintAge mat-column-complaintAge ng-star-inserted']"));

			// Log the size of "Specified PSF Rating" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified PSF Rating- 'POOR': " + dataElements.size());

			
			
			boolean pageContainsPSFRatings = !dataElements.isEmpty();
			// Add "PSF Rating" data to the results list
			if (pageContainsPSFRatings) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'PSF Ratings' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more Leads were found with PSF Ratings other than specified 'Poor' PSF Rating.");
        }
             System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 24)
	public void PSF_Rating_Index_FilterOption_GOOD() throws ParseException, InterruptedException {
		Thread.sleep(4000);

		// Refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);
		
		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on PSF Rating Index option filter
		WebElement RatingIndex = driver.findElement(By.xpath("(//*[@role=\"button\"])[27]"));
		RatingIndex.click();
		Thread.sleep(2000);
		
		//select PSF Rating option- Good
		WebElement Good = driver.findElement(By.xpath("(//*[@class=\"mat-checkbox-label\"])[168]"));
		Good.click();
		Thread.sleep(3000);
		
		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified PSF Rating" on each page
		List<String> expectedTexts = Arrays.asList("Good");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-complaintAge mat-column-complaintAge ng-star-inserted']"));

			// Log the size of "Specified PSF Rating" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified PSF Rating- 'GOOD': " + dataElements.size());

			
			
			boolean pageContainsPSFRatings = !dataElements.isEmpty();
			// Add "PSF Rating" data to the results list
			if (pageContainsPSFRatings) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'PSF Ratings' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more Leads were found with PSF Ratings other than specified 'GOOD' PSF Rating.");
        }
             System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 25)
	public void PSF_Rating_Index_FilterOption_EXCELLENT() throws ParseException, InterruptedException {
		Thread.sleep(4000);

		// Refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);
		
		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on PSF Rating Index option filter
		WebElement RatingIndex = driver.findElement(By.xpath("(//*[@role=\"button\"])[27]"));
		RatingIndex.click();
		Thread.sleep(2000);
		
		//select PSF Rating option- Excellent
		WebElement Excellent = driver.findElement(By.xpath("(//*[@class=\"mat-checkbox-label\"])[169]"));
		Excellent.click();
		Thread.sleep(3000);
		
		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified PSF Rating" on each page
		List<String> expectedTexts = Arrays.asList("Excellent");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-complaintAge mat-column-complaintAge ng-star-inserted']"));

			// Log the size of "Specified PSF Rating" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified PSF Rating- 'EXCELLENT': " + dataElements.size());

			
			
			boolean pageContainsPSFRatings = !dataElements.isEmpty();
			// Add "PSF Rating" data to the results list
			if (pageContainsPSFRatings) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'PSF Ratings' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more Leads were found with PSF Ratings other than specified 'EXCELLENT' PSF Rating.");
        }
             System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 26)
	public void PSF_Rating_Index_FilterOption_VERYGOOD() throws ParseException, InterruptedException {
		Thread.sleep(4000);

		// Refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);
		
		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on PSF Rating Index option filter
		WebElement RatingIndex = driver.findElement(By.xpath("(//*[@role=\"button\"])[27]"));
		RatingIndex.click();
		Thread.sleep(2000);
		
		//select PSF Rating option- Excellent
		WebElement VeryGood = driver.findElement(By.xpath("(//*[@class=\"mat-checkbox-label\"])[170]"));
		VeryGood.click();
		Thread.sleep(3000);
		
		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified PSF Rating" on each page
		List<String> expectedTexts = Arrays.asList("Very Good");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-complaintAge mat-column-complaintAge ng-star-inserted']"));

			// Log the size of "Specified PSF Rating" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified PSF Rating- 'VERY GOOD': " + dataElements.size());

			
			
			boolean pageContainsPSFRatings = !dataElements.isEmpty();
			// Add "PSF Rating" data to the results list
			if (pageContainsPSFRatings) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'PSF Ratings' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more Leads were found with PSF Ratings other than specified 'VERY GOOD' PSF Rating.");
        }
             System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 27)
	public void TestVehicleTypeFilter_Private() throws ParseException, InterruptedException {
		// refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);

		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"filter_list\")]")));
		AdditionFilter.click();
		Thread.sleep(3000);
		
		// click on Vehicle type filter
		WebElement vehicletype = driver.findElement(By.xpath("(//*[@role=\"button\"])[30]"));
		vehicletype.click();

		// select "Private" option
		WebElement vehicletypeOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" Private \")]")));
		vehicletypeOption.click();
		Thread.sleep(4000);
		
//		// select "Commercial" option (optional)
//		WebElement vehicletypeOption1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" Commercial \")]")));
//		vehicletypeOption1.click();
//		Thread.sleep(4000);


		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();
		Thread.sleep(3000);

		// ....................... Scroll down.....................................
		Actions scrollAction1 = new Actions(driver);
		scrollAction1.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "PRV" on each page
		List<String> expectedTexts = Arrays.asList("PRV");
		
		List<String> results = new ArrayList<>();
		
		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false;
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class=\"mat-cell cdk-cell cdk-column-serviceType mat-column-serviceType ng-star-inserted\"]"));

			// Log the size of "PRV" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of PRV Vehicle Type: " + dataElements.size());

			boolean pageContainsPRV = !dataElements.isEmpty();
			// Add "BANDP" data to the results list
			if (pageContainsPRV) {
				dataFound = true;
				for (WebElement element : dataElements) {
					String elementText = element.getText();
					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}else{
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

			// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'PRV' data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'PRV' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more text leads were found other than specified text.");
        }
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
 
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 28)
	public void TestVehicleTypeFilter_Comm() throws ParseException, InterruptedException {
		Thread.sleep(4000);

		// refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();
		Thread.sleep(10000);

		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"filter_list\")]")));
	    AdditionFilter.click();
		Thread.sleep(3000);

		// click on Vehicle type filter
		WebElement vehicletype = driver.findElement(By.xpath("(//*[@role=\"button\"])[30]"));
		vehicletype.click();

//	    //select "Private" option (Optional)
//		WebElement vehicletypeOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" Private \")]")));	    
//		vehicletypeOption.click();	    
//	    Thread.sleep(3000);

		// select COM option
		WebElement vehicletypeOption2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" Commercial \")]")));
		vehicletypeOption2.click();
		Thread.sleep(3000);

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();
		Thread.sleep(3000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "COM" on each page
		List<String> expectedTexts = Arrays.asList("COM");
		
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		 boolean dataFound = false;
		// ...................................................................................................
		while (isNextPageClickable) {
		// Collect all elements representing the filtered data
		List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class=\"mat-cell cdk-cell cdk-column-serviceType mat-column-serviceType ng-star-inserted\"]"));

			// Log the size of "COM" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of COM Vehicle Type: " + dataElements.size());

			boolean pageContainsCOM = !dataElements.isEmpty();
			// Add "COM" data to the results list
			if (pageContainsCOM) {
				dataFound = true;
				for (WebElement element : dataElements) {
					String elementText = element.getText();
					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}else{
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

			// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'COM' data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'COM' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more text leads were found other than specified text.");
        }
		
		System.out.println("---------------------------------------------------------------------------------------------------------------");
 
    }
	
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	@SuppressWarnings("unused")
	@Test(priority = 29)
	public void ModelNameFilter() throws ParseException, InterruptedException {
		// Locate the filter elements.
		Thread.sleep(3000);

		// refresh the page
		WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);

		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[8]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Model filter
		WebElement Model = driver.findElement(By.xpath("(//*[@role=\"button\"])[35]"));
		Model.click();
		Thread.sleep(2000);

	    //select first "Model" option
		WebElement Model1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" WagonR \")]")));
		Model1.click();
		Thread.sleep(1000);

	    //select second "Model" option
		WebElement Model2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" NEW SWIFT \")]")));
		Model2.click();
		Thread.sleep(1000);
			    
	    //select third "Model" option
		WebElement Model3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" NEW BALENO \")]")));
		Model3.click();
		Thread.sleep(1000);
			  
	    //select forth "Model" option
		WebElement Model4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" Ignis \")]")));
		Model4.click();
		Thread.sleep(1000);
			    
	    //select fifth "Model" option
		WebElement Model5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" CIAZ \")]")));
		Model5.click();
		Thread.sleep(1000);
		
		//select fifth "Model" option
		WebElement Model6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" NEW ERTIGA \")]")));
		Model6.click();
	    Thread.sleep(1000);


		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role=\"img\"])[9]")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified Model Name" on each page
		List<String> expectedTexts = Arrays.asList("WagonR", "NEW SWIFT", "NEW BALENO", "Ignis", "CIAZ", "NEW ERTIGA");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath("//td[@class=\"mat-cell cdk-cell cdk-column-modelName mat-column-modelName ng-star-inserted\"]"));

			// Log the size of "Specified Model Name" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified Model Name: " + dataElements.size());

			
			
			boolean pageContainsModelName = !dataElements.isEmpty();
			// Add "Model Name" data to the results list
			if (pageContainsModelName) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream().anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

					if (matchesExpectedText) {
						results.add(elementText);
						

					}

					else {
						// Throw an assertion error immediately if none of the expected texts are found
						Assert.fail("On PAGE " + (pageNumber + 1) + ": Element text '" + elementText
								+ "' does not contain any expected value: " + expectedTexts);
					}
				}

				
				// ......................................................................................................
				// Click on the NextPage button if it's clickable
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				// If the size of dataElements is less than 100, stop the pagination
				if (dataElements.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++; // Increment the page number
			}
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Model Name' data is available on PAGE " + (pageNumber + 1));
                break;
		}
		
	}
		if (!dataFound) {
            Assert.fail("No 'Model Name' data is found in the customer list.");
        }else if (results.isEmpty()) {
        	Assert.fail("One or more 'Model Names' were found other than specified Model Names.");
        }
		
		
		System.out.println("----------------------------------Verifying Tab Numbers And their Paginations------------------------------------");
 
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 30)
	public void TotalComplaintTab_Number_MatchWith_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement TotalComplaintsTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[1]"));

		// Get the text from the element
		String TotalComplaints_Text = TotalComplaintsTab.getText();
		System.out.println("Full Text of 'Total Complaints' tab: " + TotalComplaints_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(TotalComplaints_Text);
		String extractedNumber_TotalComplaint = null;
		if (TotalComplaints_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Total Complaints' tab.");
	        Assert.fail("No data available for 'Total Complaints' tab.");
	    } else {
	    	extractedNumber_TotalComplaint = matcher.group(1);
	        System.out.println("Extracted Number from 'Total Complaints' tab text: " + extractedNumber_TotalComplaint);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_TotalComplaint, extractedNumber_Pagination, "Number does not matches in Total Complaints tab and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 31)
	public void Verify_TotalComplaintsTab_Left_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(3000);
	    WebElement TotalComplaintsTab = driver.findElement(By.xpath("(//*[@role=\"tab\"])[1]"));
	    
	    
	    // Get the text from the element
	    String TotalComplaintsText = TotalComplaintsTab.getText();
	    System.out.println("Full Text of 'Total Complaints' Tab: " + TotalComplaintsText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(TotalComplaintsText);
	    int totalLeads = 0;
	    if (TotalComplaintsText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for 'Total Complaints' tab.");
	        Assert.fail("No data available for 'Total Complaints' tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from 'Total Complaints' Tab: " + totalLeads);
	    }

	    // Extract numbers from the Four buttons
	    WebElement BotAndWeblinkButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement CCEIdentifiedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
	    
	    String BotAndWeblinkButtonText = BotAndWeblinkButton.getText();
	    String CCEIdentifiedButtonText = CCEIdentifiedButton.getText();
	    
	    System.out.println("Text of 'BOT and Web Link' button: " + BotAndWeblinkButtonText);
	    System.out.println("Text of 'CCE Identified' button: " + CCEIdentifiedButtonText);
	    
	    int BotAndWeblinkCount = 0;
	    int CCEIdentifiedCount = 0;
	    
	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher BOTMatcher = buttonPattern.matcher(BotAndWeblinkButtonText);
	    Matcher CCEMatcher = buttonPattern.matcher(CCEIdentifiedButtonText);
	    
	    if (BotAndWeblinkButtonText.isEmpty() || !BOTMatcher.find()) {
	    	System.out.println("No data available for 'BOT And Web Link' button.");
	        Assert.fail("No data available for 'BOT And Web Link' button.");
	    } else {
	    	BotAndWeblinkCount = Integer.parseInt(BOTMatcher.group(1));
	        System.out.println("Extracted 'BOT And Web Link' button count: " + BotAndWeblinkCount);
	    }

	    if (CCEIdentifiedButtonText.isEmpty() || !CCEMatcher.find()) {
	    	System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	CCEIdentifiedCount = Integer.parseInt(CCEMatcher.group(1));
	        System.out.println("Extracted 'CCE Identified' button count: " + CCEIdentifiedCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfButtonsNumbers = BotAndWeblinkCount + CCEIdentifiedCount;
	    System.out.println("Sum of two left side buttons of 'Total Complaints' Tab- 'BOT And Weblink' and 'CCE Identified', buttons is: " + sumOfButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfButtonsNumbers, totalLeads, "The Sum of button of 'Total Complaints' tab- 'BOT And WebLink' and 'CCE Identified' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
	@Test(priority = 32)
	public void Verify_TotalComplaintsTab_Right_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(3000);
	    WebElement TotalComplaintsTab = driver.findElement(By.xpath("(//*[@role=\"tab\"])[1]"));
	    
	    
	    // Get the text from the element
	    String TotalComplaintsText = TotalComplaintsTab.getText();
	    System.out.println("Full Text of 'Total Complaints' Tab: " + TotalComplaintsText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(TotalComplaintsText);
	    int totalLeads = 0;
	    if (TotalComplaintsText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for 'Total Complaints' tab.");
	        Assert.fail("No data available for 'Total Complaints' tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from 'Total Complaints' Tab: " + totalLeads);
	    }

	    // Extract numbers from the Four buttons
	    WebElement OpenComplaintsButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[16]"));
	    WebElement InProgressComplaintsButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[17]"));
	    
	    String OpenComplaintsButtonText = OpenComplaintsButton.getText();
	    String InProgressComplaintsButtonText = InProgressComplaintsButton.getText();
	    
	    System.out.println("Text of 'Open Complaints' button: " + OpenComplaintsButtonText);
	    System.out.println("Text of 'In Progress Complaints' button: " + InProgressComplaintsButtonText);
	    
	    int OpenCompCount = 0;
	    int InProgressCompCount = 0;
	    
	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher OpenMatcher = buttonPattern.matcher(OpenComplaintsButtonText);
	    Matcher InProgressMatcher = buttonPattern.matcher(InProgressComplaintsButtonText);
	    
	    if (OpenComplaintsButtonText.isEmpty() || !OpenMatcher.find()) {
	    	System.out.println("No data available for 'Open Complaints' button.");
	        Assert.fail("No data available for 'Open Complaints' button.");
	    } else {
	    	OpenCompCount = Integer.parseInt(OpenMatcher.group(1));
	        System.out.println("Extracted 'Open Complaints' button count: " + OpenCompCount);
	    }

	    if (InProgressComplaintsButtonText.isEmpty() || !InProgressMatcher.find()) {
	    	System.out.println("No data available for 'InProgress Complaints' button.");
	        Assert.fail("No data available for 'InProgress Complaints' button.");
	    } else {
	    	InProgressCompCount = Integer.parseInt(InProgressMatcher.group(1));
	        System.out.println("Extracted 'InProgress Complaints' button count: " + InProgressCompCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfButtonsNumbers = OpenCompCount + InProgressCompCount;
	    System.out.println("Sum of two right side buttons of 'Total Complaints' Tab- 'Open Complaints' and 'InProgress Complaints', buttons is: " + sumOfButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfButtonsNumbers, totalLeads, "The Sum of button of 'Total Complaints' tab- 'Open Complaints' and 'InProgress Complaints' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
//Pagination script of Total Complaints tab..........................................................................................

	@Test(priority = 33)
	public void Verify_TotalComplaintsTab_BOTWebLinkbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement BOTButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		BOTButton.click();

		// Get the text from the element
		String BOTButton_Text = BOTButton.getText();
		System.out.println("Full Text of 'BOT And WebLink' Button: " + BOTButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(BOTButton_Text);
		String extractedNumber_BOTButton = null;
		if (BOTButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'BOT And WebLink' button.");
	        Assert.fail("No data available for 'BOT And WebLink' button.");
	    } else {
	    	extractedNumber_BOTButton = matcher.group(1);
	        System.out.println("Extracted Number from 'BOT And WebLink' button text: " + extractedNumber_BOTButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_BOTButton, extractedNumber_Pagination, "Number does not matches in 'BOT And WebLink' button and in its Pagination");
	}
//...................................................................................................................................................................
  
	@Test(priority = 34)
	public void Verify_TotalComplaintsTab_CCEIdentifiedbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CCEButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		CCEButton.click();

		// Get the text from the element
		String CCEButton_Text = CCEButton.getText();
		System.out.println("Full Text of 'CCE Identified' Button: " + CCEButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CCEButton_Text);
		String extractedNumber_CCEButton = null;
		if (CCEButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	extractedNumber_CCEButton = matcher.group(1);
	        System.out.println("Extracted Number from 'CCE Identified' button text: " + extractedNumber_CCEButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_CCEButton, extractedNumber_Pagination, "Number does not matches in 'CCE Identified' button and in its Pagination");
	}
//...................................................................................................................................................................
    
	@Test(priority = 35)
	public void Verify_TotalComplaintsTab_TodayRegisteredbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement RegisteredButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		RegisteredButton.click();

		// Get the text from the element
		String RegisteredButton_Text = RegisteredButton.getText();
		System.out.println("Full Text of 'Today Registered' Button: " + RegisteredButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(RegisteredButton_Text);
		String extractedNumber_RegisteredButton = null;
		if (RegisteredButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Registered' button.");
	        Assert.fail("No data available for 'Today Registered' button.");
	    } else {
	    	extractedNumber_RegisteredButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Registered' button text: " + extractedNumber_RegisteredButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_RegisteredButton, extractedNumber_Pagination, "Number does not matches in 'Today Registered' button and in its Pagination");
	}
//...................................................................................................................................................................
    
	@Test(priority = 36)
	public void Verify_TotalComplaintsTab_TodayAppointmentbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement AppointmentButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		AppointmentButton.click();

		// Get the text from the element
		String AppointmentButton_Text = AppointmentButton.getText();
		System.out.println("Full Text of 'Today Appointment' Button: " + AppointmentButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(AppointmentButton_Text);
		String extractedNumber_AppointmentButton = null;
		if (AppointmentButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Appointment' button.");
	        Assert.fail("No data available for 'Today Appointment' button.");
	    } else {
	    	extractedNumber_AppointmentButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Appointment' button text: " + extractedNumber_AppointmentButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_AppointmentButton, extractedNumber_Pagination, "Number does not matches in 'Today Appointment' button and in its Pagination");
	}
	
//...................................................................................................................................................................

	@Test(priority = 37)
	public void Verify_TotalComplaintsTab_TomorrowAppointmentbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement TomorrowButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[15]"));
		TomorrowButton.click();

		// Get the text from the element
		String TomorrowButton_Text = TomorrowButton.getText();
		System.out.println("Full Text of 'Tomorrow Appointment' Button: " + TomorrowButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(TomorrowButton_Text);
		String extractedNumber_TomorrowButton = null;
		if (TomorrowButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Tomorrow Appointment' button.");
	        Assert.fail("No data available for 'Tomorrow Appointment' button.");
	    } else {
	    	extractedNumber_TomorrowButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Tomorrow Appointment' button text: " + extractedNumber_TomorrowButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_TomorrowButton, extractedNumber_Pagination, "Number does not matches in 'Tomorrow Appointment' button and in its Pagination");
	}
	
//...................................................................................................................................................................
     
	@Test(priority = 38)
	public void Verify_TotalComplaintsTab_OpenComplaintbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement TomorrowButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[15]"));
		TomorrowButton.click();
		
		Thread.sleep(3000);
		WebElement OpenButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[16]"));
		OpenButton.click();

		// Get the text from the element
		String OpenButton_Text = OpenButton.getText();
		System.out.println("Full Text of 'Open Complaints' Button: " + OpenButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(OpenButton_Text);
		String extractedNumber_OpenButton = null;
		if (OpenButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Open Complaints' button.");
	        Assert.fail("No data available for 'Open Complaints' button.");
	    } else {
	    	extractedNumber_OpenButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Open Complaints' button text: " + extractedNumber_OpenButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_OpenButton, extractedNumber_Pagination, "Number does not matches in 'Open Complaints' button and in its Pagination");
	}
	
//...................................................................................................................................................................

	@Test(priority = 39)
	public void Verify_TotalComplaintsTab_InprogressComplaintbutton_Pagination() throws InterruptedException {
		Thread.sleep(3000);
		WebElement InprogressButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[17]"));
		InprogressButton.click();

		// Get the text from the element
		String InprogressButton_Text = InprogressButton.getText();
		System.out.println("Full Text of 'Inprogress Complaints' Button: " + InprogressButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(InprogressButton_Text);
		String extractedNumber_InprogressButton = null;
		if (InprogressButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Inprogress Complaints' button.");
	        Assert.fail("No data available for 'Inprogress Complaints' button.");
	    } else {
	    	extractedNumber_InprogressButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Inprogress Complaints' button text: " + extractedNumber_InprogressButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_InprogressButton, extractedNumber_Pagination, "Number does not matches in 'Inprogress Complaints' button and in its Pagination");
	}
	
//...................................................................................................................................................................
	
	@Test(priority = 40)
	public void OpenComplaintsTab_Number_MatchWith_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement OpenComplaintsTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[2]"));
		OpenComplaintsTab.click();
		Thread.sleep(3000);

		// Get the text from the element
		String OpenComplaintsTab_Text = OpenComplaintsTab.getText();
		System.out.println("Full Text of 'Open Complaints' tab: " + OpenComplaintsTab_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(OpenComplaintsTab_Text);
		String extractedNumber_OpenComplaintsTab = null;
		if (OpenComplaintsTab_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Open Complaints' tab.");
	        Assert.fail("No data available for 'Open Complaints' tab.");
	    } else {
	    	extractedNumber_OpenComplaintsTab = matcher.group(1);
	        System.out.println("Extracted Number from 'Open Complaints' tab text: " + extractedNumber_OpenComplaintsTab);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_OpenComplaintsTab, extractedNumber_Pagination, "Number does not matches in 'Open Complaints' tab and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 41)
	public void Verify_OpenComplaintsTab_Left_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(3000);
	    WebElement OpenComplaintsTab = driver.findElement(By.xpath("(//*[@role=\"tab\"])[2]"));
	    
	    
	    // Get the text from the element
	    String OpenComplaintsTabText = OpenComplaintsTab.getText();
	    System.out.println("Full Text of 'Open Complaints' Tab: " + OpenComplaintsTabText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(OpenComplaintsTabText);
	    int totalLeads = 0;
	    if (OpenComplaintsTabText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for 'Open Complaints' tab.");
	        Assert.fail("No data available for 'Open Complaints' tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from 'Open Complaints' Tab: " + totalLeads);
	    }

	    // Extract numbers from the Four buttons
	    WebElement BotAndWeblinkButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement CCEIdentifiedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
	    
	    String BotAndWeblinkButtonText = BotAndWeblinkButton.getText();
	    String CCEIdentifiedButtonText = CCEIdentifiedButton.getText();
	    
	    System.out.println("Text of 'BOT and Web Link' button: " + BotAndWeblinkButtonText);
	    System.out.println("Text of 'CCE Identified' button: " + CCEIdentifiedButtonText);
	    
	    int BotAndWeblinkCount = 0;
	    int CCEIdentifiedCount = 0;
	    
	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher BOTMatcher = buttonPattern.matcher(BotAndWeblinkButtonText);
	    Matcher CCEMatcher = buttonPattern.matcher(CCEIdentifiedButtonText);
	    
	    if (BotAndWeblinkButtonText.isEmpty() || !BOTMatcher.find()) {
	    	System.out.println("No data available for 'BOT And Web Link' button.");
	        Assert.fail("No data available for 'BOT And Web Link' button.");
	    } else {
	    	BotAndWeblinkCount = Integer.parseInt(BOTMatcher.group(1));
	        System.out.println("Extracted 'BOT And Web Link' button count: " + BotAndWeblinkCount);
	    }

	    if (CCEIdentifiedButtonText.isEmpty() || !CCEMatcher.find()) {
	    	System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	CCEIdentifiedCount = Integer.parseInt(CCEMatcher.group(1));
	        System.out.println("Extracted 'CCE Identified' button count: " + CCEIdentifiedCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfButtonsNumbers = BotAndWeblinkCount + CCEIdentifiedCount;
	    System.out.println("Sum of two left side buttons of 'Open Complaints' Tab- 'BOT And Weblink' and 'CCE Identified', buttons is: " + sumOfButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfButtonsNumbers, totalLeads, "The Sum of button of 'Open Complaints' tab- 'BOT And WebLink' and 'CCE Identified' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
//Pagination Scripts for Open Complaints tab..............................................................................................................
	
	@Test(priority = 42)
	public void Verify_OpenComplaintsTab_BOTWebLinkbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement BOTButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		BOTButton.click();

		// Get the text from the element
		String BOTButton_Text = BOTButton.getText();
		System.out.println("Full Text of 'BOT And WebLink' Button: " + BOTButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(BOTButton_Text);
		String extractedNumber_BOTButton = null;
		if (BOTButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'BOT And WebLink' button.");
	        Assert.fail("No data available for 'BOT And WebLink' button.");
	    } else {
	    	extractedNumber_BOTButton = matcher.group(1);
	        System.out.println("Extracted Number from 'BOT And WebLink' button text: " + extractedNumber_BOTButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_BOTButton, extractedNumber_Pagination, "Number does not matches in 'BOT And WebLink' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 43)
	public void Verify_OpenComplaintsTab_CCEIdentifiedbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CCEButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		CCEButton.click();

		// Get the text from the element
		String CCEButton_Text = CCEButton.getText();
		System.out.println("Full Text of 'CCE Identified' Button: " + CCEButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CCEButton_Text);
		String extractedNumber_CCEButton = null;
		if (CCEButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	extractedNumber_CCEButton = matcher.group(1);
	        System.out.println("Extracted Number from 'CCE Identified' button text: " + extractedNumber_CCEButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_CCEButton, extractedNumber_Pagination, "Number does not matches in 'CCE Identified' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 44)
	public void Verify_OpenComplaintsTab_TodayRegisteredbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement RegisteredButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		RegisteredButton.click();

		// Get the text from the element
		String RegisteredButton_Text = RegisteredButton.getText();
		System.out.println("Full Text of 'Today Registered' Button: " + RegisteredButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(RegisteredButton_Text);
		String extractedNumber_RegisteredButton = null;
		if (RegisteredButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Registered' button.");
	        Assert.fail("No data available for 'Today Registered' button.");
	    } else {
	    	extractedNumber_RegisteredButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Registered' button text: " + extractedNumber_RegisteredButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_RegisteredButton, extractedNumber_Pagination, "Number does not matches in 'Today Registered' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 45)
	public void Verify_OpenComplaintsTab_TodayFollowUpbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement FollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		FollowUpButton.click();

		// Get the text from the element
		String FollowUpButton_Text = FollowUpButton.getText();
		System.out.println("Full Text of 'Today FollowUp' Button: " + FollowUpButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(FollowUpButton_Text);
		String extractedNumber_FollowUpButton = null;
		if (FollowUpButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today FollowUp' button.");
	        Assert.fail("No data available for 'Today FollowUp' button.");
	    } else {
	    	extractedNumber_FollowUpButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today FollowUp' button text: " + extractedNumber_FollowUpButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_FollowUpButton, extractedNumber_Pagination, "Number does not matches in 'Today FollowUp' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 46)
	public void Verify_OpenComplaintsTab_TodayReopenedbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement ReopenedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[15]"));
		ReopenedButton.click();

		// Get the text from the element
		String ReopenedButton_Text = ReopenedButton.getText();
		System.out.println("Full Text of 'Today Reopened' Button: " + ReopenedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(ReopenedButton_Text);
		String extractedNumber_ReopenedButton = null;
		if (ReopenedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Reopened' button.");
	        Assert.fail("No data available for 'Today Reopened' button.");
	    } else {
	    	extractedNumber_ReopenedButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Reopened' button text: " + extractedNumber_ReopenedButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_ReopenedButton, extractedNumber_Pagination, "Number does not matches in 'Today Reopened' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 47)
	public void InProgressComplaintsTab_Number_MatchWith_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement InProgresComplaintsTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[3]"));
		InProgresComplaintsTab.click();
		Thread.sleep(3000);

		// Get the text from the element
		String InProgresComplaintsTab_Text = InProgresComplaintsTab.getText();
		System.out.println("Full Text of 'InProgress Complaints' tab: " + InProgresComplaintsTab_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(InProgresComplaintsTab_Text);
		String extractedNumber_InProgresComplaintsTab = null;
		if (InProgresComplaintsTab_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'InProgres Complaints' tab.");
	        Assert.fail("No data available for 'InProgres Complaints' tab.");
	    } else {
	    	extractedNumber_InProgresComplaintsTab = matcher.group(1);
	        System.out.println("Extracted Number from 'InProgres Complaints' tab text: " + extractedNumber_InProgresComplaintsTab);
	    }
//.............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_InProgresComplaintsTab, extractedNumber_Pagination, "Number does not matches in 'InProgres Complaints' tab and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 48)
	public void Verify_InProgressComplaintsTab_Left_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(3000);
	    WebElement InprogresComplaintTab = driver.findElement(By.xpath("(//*[@role=\"tab\"])[3]"));
	    
	    
	    // Get the text from the element
	    String InprogresComplaintTabText = InprogresComplaintTab.getText();
	    System.out.println("Full Text of 'Inprogress Complaints' Tab: " + InprogresComplaintTabText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(InprogresComplaintTabText);
	    int totalLeads = 0;
	    if (InprogresComplaintTabText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for 'Inprogress Complaints' tab.");
	        Assert.fail("No data available for 'Inprogress Complaints' tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from 'Inprogress Complaints' Tab: " + totalLeads);
	    }

	    // Extract numbers from the Four buttons
	    WebElement BotAndWeblinkButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement CCEIdentifiedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
	    
	    String BotAndWeblinkButtonText = BotAndWeblinkButton.getText();
	    String CCEIdentifiedButtonText = CCEIdentifiedButton.getText();
	    
	    System.out.println("Text of 'BOT and Web Link' button: " + BotAndWeblinkButtonText);
	    System.out.println("Text of 'CCE Identified' button: " + CCEIdentifiedButtonText);
	    
	    int BotAndWeblinkCount = 0;
	    int CCEIdentifiedCount = 0;
	    
	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher BOTMatcher = buttonPattern.matcher(BotAndWeblinkButtonText);
	    Matcher CCEMatcher = buttonPattern.matcher(CCEIdentifiedButtonText);
	    
	    if (BotAndWeblinkButtonText.isEmpty() || !BOTMatcher.find()) {
	    	System.out.println("No data available for 'BOT And Web Link' button.");
	        Assert.fail("No data available for 'BOT And Web Link' button.");
	    } else {
	    	BotAndWeblinkCount = Integer.parseInt(BOTMatcher.group(1));
	        System.out.println("Extracted 'BOT And Web Link' button count: " + BotAndWeblinkCount);
	    }

	    if (CCEIdentifiedButtonText.isEmpty() || !CCEMatcher.find()) {
	    	System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	CCEIdentifiedCount = Integer.parseInt(CCEMatcher.group(1));
	        System.out.println("Extracted 'CCE Identified' button count: " + CCEIdentifiedCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfButtonsNumbers = BotAndWeblinkCount + CCEIdentifiedCount;
	    System.out.println("Sum of two left side buttons of 'Inprogress Complaints' Tab- 'BOT And Weblink' and 'CCE Identified', buttons is: " + sumOfButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfButtonsNumbers, totalLeads, "The Sum of button of 'Inprogress Complaints' tab- 'BOT And WebLink' and 'CCE Identified' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
//Pagination Scripts for Open Complaints tab..............................................................................................................

	@Test(priority = 49)
	public void Verify_InprogresComplaintTab_BOTWebLinkbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement BOTButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		BOTButton.click();

		// Get the text from the element
		String BOTButton_Text = BOTButton.getText();
		System.out.println("Full Text of 'BOT And WebLink' Button: " + BOTButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(BOTButton_Text);
		String extractedNumber_BOTButton = null;
		if (BOTButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'BOT And WebLink' button.");
	        Assert.fail("No data available for 'BOT And WebLink' button.");
	    } else {
	    	extractedNumber_BOTButton = matcher.group(1);
	        System.out.println("Extracted Number from 'BOT And WebLink' button text: " + extractedNumber_BOTButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_BOTButton, extractedNumber_Pagination, "Number does not matches in 'BOT And WebLink' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 50)
	public void Verify_InprogresComplaintTab_CCEIdentifiedbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CCEButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		CCEButton.click();

		// Get the text from the element
		String CCEButton_Text = CCEButton.getText();
		System.out.println("Full Text of 'CCE Identified' Button: " + CCEButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CCEButton_Text);
		String extractedNumber_CCEButton = null;
		if (CCEButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	extractedNumber_CCEButton = matcher.group(1);
	        System.out.println("Extracted Number from 'CCE Identified' button text: " + extractedNumber_CCEButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_CCEButton, extractedNumber_Pagination, "Number does not matches in 'CCE Identified' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 51)
	public void Verify_InprogresComplaintTab_TomorrowAppointmentbutton_Pagination() throws InterruptedException {
		Thread.sleep(4000);
		
		WebElement CCEButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		CCEButton.click();
		Thread.sleep(3000);

		WebElement TomorrowButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		TomorrowButton.click();
		
		Thread.sleep(5000);

		// Get the text from the element
		String TomorrowButton_Text = TomorrowButton.getText();
		System.out.println("Full Text of 'Tomorrow Appointment' Button: " + TomorrowButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(TomorrowButton_Text);
		String extractedNumber_TomorrowButton = null;
		if (TomorrowButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Tomorrow Appointment' button.");
	        Assert.fail("No data available for 'Tomorrow Appointment' button.");
	    } else {
	    	extractedNumber_TomorrowButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Tomorrow Appointment' button text: " + extractedNumber_TomorrowButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_TomorrowButton, extractedNumber_Pagination, "Number does not matches in 'Tomorrow Appointment' button and in its Pagination");
	}
	
//...................................................................................................................................................................
	@Test(priority = 52)
	public void Verify_InprogresComplaintTab_TodayAppointmentbutton_Pagination() throws InterruptedException {
		Thread.sleep(4000);
		
		WebElement TomorrowButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		TomorrowButton.click();
		
        Thread.sleep(3000);
		WebElement AppointmentButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		AppointmentButton.click();
		
		Thread.sleep(5000);

		// Get the text from the element
		String AppointmentButton_Text = AppointmentButton.getText();
		System.out.println("Full Text of 'Today Appointment' Button: " + AppointmentButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(AppointmentButton_Text);
		String extractedNumber_AppointmentButton = null;
		if (AppointmentButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Appointment' button.");
	        Assert.fail("No data available for 'Today Appointment' button.");
	    } else {
	    	extractedNumber_AppointmentButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Appointment' button text: " + extractedNumber_AppointmentButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_AppointmentButton, extractedNumber_Pagination, "Number does not matches in 'Today Appointment' button and in its Pagination");
	}
	
//...................................................................................................................................................................

	@Test(priority = 53)
	public void Verify_InprogresComplaintTab_TodayFollowUpbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement FollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[15]"));
		FollowUpButton.click();

		// Get the text from the element
		String FollowUpButton_Text = FollowUpButton.getText();
		System.out.println("Full Text of 'Today FollowUp' Button: " + FollowUpButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(FollowUpButton_Text);
		String extractedNumber_FollowUpButton = null;
		if (FollowUpButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today FollowUp' button.");
	        Assert.fail("No data available for 'Today FollowUp' button.");
	    } else {
	    	extractedNumber_FollowUpButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today FollowUp' button text: " + extractedNumber_FollowUpButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_FollowUpButton, extractedNumber_Pagination, "Number does not matches in 'Today FollowUp' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 54)
	public void Verify_InprogresComplaintTab_TodayReopenedbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement ReopenedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[16]"));
		ReopenedButton.click();

		// Get the text from the element
		String ReopenedButton_Text = ReopenedButton.getText();
		System.out.println("Full Text of 'Today Reopened' Button: " + ReopenedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(ReopenedButton_Text);
		String extractedNumber_ReopenedButton = null;
		if (ReopenedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Reopened' button.");
	        Assert.fail("No data available for 'Today Reopened' button.");
	    } else {
	    	extractedNumber_ReopenedButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Reopened' button text: " + extractedNumber_ReopenedButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_ReopenedButton, extractedNumber_Pagination, "Number does not matches in 'Today Reopened' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 55)
	public void Verify_InprogresComplaintTab_TodayRegisteredbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement RegisteredButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[17]"));
		RegisteredButton.click();

		// Get the text from the element
		String RegisteredButton_Text = RegisteredButton.getText();
		System.out.println("Full Text of 'Today Registered' Button: " + RegisteredButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(RegisteredButton_Text);
		String extractedNumber_RegisteredButton = null;
		if (RegisteredButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Registered' button.");
	        Assert.fail("No data available for 'Today Registered' button.");
	    } else {
	    	extractedNumber_RegisteredButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Registered' button text: " + extractedNumber_RegisteredButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_RegisteredButton, extractedNumber_Pagination, "Number does not matches in 'Today Registered' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 56)
	public void ResolvedComplaintsTab_Number_MatchWith_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement ResolvedComplaintsTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[4]"));
		ResolvedComplaintsTab.click();
		Thread.sleep(3000);

		// Get the text from the element
		String ResolvedComplaintsTab_Text = ResolvedComplaintsTab.getText();
		System.out.println("Full Text of 'Resolved Complaints' tab: " + ResolvedComplaintsTab_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(ResolvedComplaintsTab_Text);
		String extractedNumber_ResolvedComplaintsTab = null;
		if (ResolvedComplaintsTab_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Resolved Complaints' tab.");
	        Assert.fail("No data available for 'Resolved Complaints' tab.");
	    } else {
	    	extractedNumber_ResolvedComplaintsTab = matcher.group(1);
	        System.out.println("Extracted Number from 'Resolved Complaints' tab text: " + extractedNumber_ResolvedComplaintsTab);
	    }
//.............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_ResolvedComplaintsTab, extractedNumber_Pagination, "Number does not matches in 'Resolved Complaints' tab and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 57)
	public void Verify_ResolvedComplaintsTab_Left_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(5000);
	    WebElement ResolvedComplaintTab = driver.findElement(By.xpath("(//*[@role=\"tab\"])[4]"));
	    
	    
	    // Get the text from the element
	    String ResolvedComplaintTabText = ResolvedComplaintTab.getText();
	    System.out.println("Full Text of 'Resolved Complaints' Tab: " + ResolvedComplaintTabText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(ResolvedComplaintTabText);
	    int totalLeads = 0;
	    if (ResolvedComplaintTabText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for 'Resolved Complaints' tab.");
	        Assert.fail("No data available for 'Resolved Complaints' tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from 'Resolved Complaints' Tab: " + totalLeads);
	    }

	    // Extract numbers from the Four buttons
	    WebElement BotAndWeblinkButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement CCEIdentifiedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
	    
	    String BotAndWeblinkButtonText = BotAndWeblinkButton.getText();
	    String CCEIdentifiedButtonText = CCEIdentifiedButton.getText();
	    
	    System.out.println("Text of 'BOT and Web Link' button: " + BotAndWeblinkButtonText);
	    System.out.println("Text of 'CCE Identified' button: " + CCEIdentifiedButtonText);
	    
	    int BotAndWeblinkCount = 0;
	    int CCEIdentifiedCount = 0;
	    
	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher BOTMatcher = buttonPattern.matcher(BotAndWeblinkButtonText);
	    Matcher CCEMatcher = buttonPattern.matcher(CCEIdentifiedButtonText);
	    
	    if (BotAndWeblinkButtonText.isEmpty() || !BOTMatcher.find()) {
	    	System.out.println("No data available for 'BOT And Web Link' button.");
	        Assert.fail("No data available for 'BOT And Web Link' button.");
	    } else {
	    	BotAndWeblinkCount = Integer.parseInt(BOTMatcher.group(1));
	        System.out.println("Extracted 'BOT And Web Link' button count: " + BotAndWeblinkCount);
	    }

	    if (CCEIdentifiedButtonText.isEmpty() || !CCEMatcher.find()) {
	    	System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	CCEIdentifiedCount = Integer.parseInt(CCEMatcher.group(1));
	        System.out.println("Extracted 'CCE Identified' button count: " + CCEIdentifiedCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfButtonsNumbers = BotAndWeblinkCount + CCEIdentifiedCount;
	    System.out.println("Sum of two left side buttons of 'Resolved Complaints' Tab- 'BOT And Weblink' and 'CCE Identified', buttons is: " + sumOfButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfButtonsNumbers, totalLeads, "The Sum of button of 'Resolved Complaints' tab- 'BOT And WebLink' and 'CCE Identified' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
//Pagination Scripts for Open Complaints tab..............................................................................................................
  
	@Test(priority = 58)
	public void Verify_ResolvedComplaintTab_BOTWebLinkbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement BOTButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		BOTButton.click();

		// Get the text from the element
		String BOTButton_Text = BOTButton.getText();
		System.out.println("Full Text of 'BOT And WebLink' Button: " + BOTButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(BOTButton_Text);
		String extractedNumber_BOTButton = null;
		if (BOTButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'BOT And WebLink' button.");
	        Assert.fail("No data available for 'BOT And WebLink' button.");
	    } else {
	    	extractedNumber_BOTButton = matcher.group(1);
	        System.out.println("Extracted Number from 'BOT And WebLink' button text: " + extractedNumber_BOTButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_BOTButton, extractedNumber_Pagination, "Number does not matches in 'BOT And WebLink' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 59)
	public void Verify_ResolvedComplaintTab_CCEIdentifiedbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CCEButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		CCEButton.click();

		// Get the text from the element
		String CCEButton_Text = CCEButton.getText();
		System.out.println("Full Text of 'CCE Identified' Button: " + CCEButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CCEButton_Text);
		String extractedNumber_CCEButton = null;
		if (CCEButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	extractedNumber_CCEButton = matcher.group(1);
	        System.out.println("Extracted Number from 'CCE Identified' button text: " + extractedNumber_CCEButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_CCEButton, extractedNumber_Pagination, "Number does not matches in 'CCE Identified' button and in its Pagination");
	}
//...................................................................................................................................................................
	
	@Test(priority = 60)
	public void Verify_ResolvedComplaintTab_TodayResolvedbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement CCEButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		CCEButton.click();
		Thread.sleep(3000);

		WebElement ResolvedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		ResolvedButton.click();
		
		Thread.sleep(3000);

		// Get the text from the element
		String ResolvedButton_Text = ResolvedButton.getText();
		System.out.println("Full Text of 'Today Resolved' Button: " + ResolvedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(ResolvedButton_Text);
		String extractedNumber_ResolvedButton = null;
		if (ResolvedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Resolved' button.");
	        Assert.fail("No data available for 'Today Resolved' button.");
	    } else {
	    	extractedNumber_ResolvedButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Resolved' button text: " + extractedNumber_ResolvedButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_ResolvedButton, extractedNumber_Pagination, "Number does not matches in 'Today Resolved' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 61)
	public void Verify_ResolvedComplaintTab_TodayPRF_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement PRFButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		PRFButton.click();

		// Get the text from the element
		String PRFButton_Text = PRFButton.getText();
		System.out.println("Full Text of 'Today PRF' Button: " + PRFButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(PRFButton_Text);
		String extractedNumber_PRFButton = null;
		if (PRFButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today PRF' button.");
	        Assert.fail("No data available for 'Today PRF' button.");
	    } else {
	    	extractedNumber_PRFButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today PRF' button text: " + extractedNumber_PRFButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_PRFButton, extractedNumber_Pagination, "Number does not matches in 'Today PRF' button and in its Pagination");
	}
//...................................................................................................................................................................
	
	@Test(priority = 62)
	public void ClosedComplaintsTab_Number_MatchWith_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement ClosedComplaintsTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[5]"));
		ClosedComplaintsTab.click();
		Thread.sleep(3000);

		// Get the text from the element
		String ClosedComplaintsTab_Text = ClosedComplaintsTab.getText();
		System.out.println("Full Text of 'Closed Complaints' tab: " + ClosedComplaintsTab_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(ClosedComplaintsTab_Text);
		String extractedNumber_ClosedComplaintsTab = null;
		if (ClosedComplaintsTab_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Closed Complaints' tab.");
	        Assert.fail("No data available for 'Closed Complaints' tab.");
	    } else {
	    	extractedNumber_ClosedComplaintsTab = matcher.group(1);
	        System.out.println("Extracted Number from 'Closed Complaints' tab text: " + extractedNumber_ClosedComplaintsTab);
	    }
//.............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_ClosedComplaintsTab, extractedNumber_Pagination, "Number does not matches in 'Closed Complaints' tab and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 63)
	public void Verify_ClosedComplaintsTab_Left_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(5000);
	    WebElement ClosedComplaintTab = driver.findElement(By.xpath("(//*[@role=\"tab\"])[5]"));
	    
	    
	    // Get the text from the element
	    String ClosedComplaintTabText = ClosedComplaintTab.getText();
	    System.out.println("Full Text of 'Closed Complaint' Tab: " + ClosedComplaintTabText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(ClosedComplaintTabText);
	    int totalLeads = 0;
	    if (ClosedComplaintTabText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for 'Closed Complaint' tab.");
	        Assert.fail("No data available for 'Closed Complaint' tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from 'Closed Complaint' Tab: " + totalLeads);
	    }

	    // Extract numbers from the Four buttons
	    WebElement BotAndWeblinkButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement CCEIdentifiedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
	    
	    String BotAndWeblinkButtonText = BotAndWeblinkButton.getText();
	    String CCEIdentifiedButtonText = CCEIdentifiedButton.getText();
	    
	    System.out.println("Text of 'BOT and Web Link' button: " + BotAndWeblinkButtonText);
	    System.out.println("Text of 'CCE Identified' button: " + CCEIdentifiedButtonText);
	    
	    int BotAndWeblinkCount = 0;
	    int CCEIdentifiedCount = 0;
	    
	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher BOTMatcher = buttonPattern.matcher(BotAndWeblinkButtonText);
	    Matcher CCEMatcher = buttonPattern.matcher(CCEIdentifiedButtonText);
	    
	    if (BotAndWeblinkButtonText.isEmpty() || !BOTMatcher.find()) {
	    	System.out.println("No data available for 'BOT And Web Link' button.");
	        Assert.fail("No data available for 'BOT And Web Link' button.");
	    } else {
	    	BotAndWeblinkCount = Integer.parseInt(BOTMatcher.group(1));
	        System.out.println("Extracted 'BOT And Web Link' button count: " + BotAndWeblinkCount);
	    }

	    if (CCEIdentifiedButtonText.isEmpty() || !CCEMatcher.find()) {
	    	System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	CCEIdentifiedCount = Integer.parseInt(CCEMatcher.group(1));
	        System.out.println("Extracted 'CCE Identified' button count: " + CCEIdentifiedCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfButtonsNumbers = BotAndWeblinkCount + CCEIdentifiedCount;
	    System.out.println("Sum of two left side buttons of 'Closed Complaint' Tab- 'BOT And Weblink' and 'CCE Identified', buttons is: " + sumOfButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfButtonsNumbers, totalLeads, "The Sum of button of 'Closed Complaint' tab- 'BOT And WebLink' and 'CCE Identified' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
//Pagination Scripts for Open Complaints tab..............................................................................................................
  
	@Test(priority = 64)
	public void Verify_ClosedComplaintTab_BOTWebLinkbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement BOTButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		BOTButton.click();

		// Get the text from the element
		String BOTButton_Text = BOTButton.getText();
		System.out.println("Full Text of 'BOT And WebLink' Button: " + BOTButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(BOTButton_Text);
		String extractedNumber_BOTButton = null;
		if (BOTButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'BOT And WebLink' button.");
	        Assert.fail("No data available for 'BOT And WebLink' button.");
	    } else {
	    	extractedNumber_BOTButton = matcher.group(1);
	        System.out.println("Extracted Number from 'BOT And WebLink' button text: " + extractedNumber_BOTButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_BOTButton, extractedNumber_Pagination, "Number does not matches in 'BOT And WebLink' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 65)
	public void Verify_ClosedComplaintTab_CCEIdentifiedbutton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CCEButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		CCEButton.click();

		// Get the text from the element
		String CCEButton_Text = CCEButton.getText();
		System.out.println("Full Text of 'CCE Identified' Button: " + CCEButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CCEButton_Text);
		String extractedNumber_CCEButton = null;
		if (CCEButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	extractedNumber_CCEButton = matcher.group(1);
	        System.out.println("Extracted Number from 'CCE Identified' button text: " + extractedNumber_CCEButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_CCEButton, extractedNumber_Pagination, "Number does not matches in 'CCE Identified' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 66)
	public void Verify_ClosedComplaintTab_TodayClosed_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement CCEButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		CCEButton.click();

		Thread.sleep(4000);
		WebElement TodayClosedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		TodayClosedButton.click();
		
		Thread.sleep(3000);

		// Get the text from the element
		String TodayClosedButton_Text = TodayClosedButton.getText();
		System.out.println("Full Text of 'Today Closed' Button: " + TodayClosedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(TodayClosedButton_Text);
		String extractedNumber_TodayClosedButton = null;
		if (TodayClosedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Closed' button.");
	        Assert.fail("No data available for 'Today Closed' button.");
	    } else {
	    	extractedNumber_TodayClosedButton = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Closed' button text: " + extractedNumber_TodayClosedButton);
	    }
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher1.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_TodayClosedButton, extractedNumber_Pagination, "Number does not matches in 'Today Closed' button and in its Pagination");
	}
//...................................................................................................................................................................
	
}
