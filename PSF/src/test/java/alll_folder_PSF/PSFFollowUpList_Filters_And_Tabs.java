package alll_folder_PSF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PSFFollowUpList_Filters_And_Tabs {
	
	public static WebDriver driver;
	public WebDriverWait wait;

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	// Other parts of your class remain the same...

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

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 1)
	public void Username() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Username = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
		Username.sendKeys("081001CCM00001");

		Thread.sleep(1000);
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 2)
	public void Password() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
		password.sendKeys("Maruti@123");
		Thread.sleep(1000);
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 3)
	public void Login_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
		password.click();
		Thread.sleep(3000);
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

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

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

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

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 7)
	public void Service_Type() throws InterruptedException { // Select all the Filter Option

		String[] filters = { "PAID SEREVICE", "RR", "FR3", "BANDP", "FR1", "FR2", "WASH", "WMOS", "SC" };
		for (String filter : filters) {
			applyFilter(filter);
			Thread.sleep(4000);		
			refreshPage(); // Refresh the page after each filter is tested
		}
	}
	// This method is to Select the Filter

	private void applyFilter(String filterText) throws InterruptedException {
		WebElement filterDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"combobox\"])[1]")));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.click(filterDropdown).perform();
         Thread.sleep(2000);
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

		WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(blankFields).perform();

		Thread.sleep(3000);
	}
	
	// This method is to refresh the page
	private void refreshPage() throws InterruptedException {
	    WebElement refreshButton = driver.findElement(By.xpath("(//*[@role=\"img\"])[6]")); // Replace with the actual selector for your refresh button
	    refreshButton.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"combobox\"])[1]"))); // Wait until the filter dropdown is visible again
	    Thread.sleep(7000); // Wait for the page to refresh
	}

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Test(priority = 8)
	public void Workshop_FILLTER() throws InterruptedException {
		String[] filters = { "NARAINA INDUSTRIAL AREA-SRV" };

		SoftAssert softAssert = new SoftAssert();

		for (String filter : filters) {
			applyFilter2(filter, softAssert);
			Thread.sleep(3000);
	        refreshPage1(); // Refresh the page after each filter is tested
	    
		}

		softAssert.assertAll(); // Report all collected errors at the end of the test
	}

	// This method is to select the filter
	private void applyFilter2(String filterText, SoftAssert softAssert) throws InterruptedException {
		WebElement filterDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-3\"]")));
		filterDropdown.click();

		boolean filterSelected = false;
		for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
			try {
				List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class=\"mat-option-text\"])[2]")));
				for (WebElement option : options) {
					if (option.getText().equals(filterText)) {
						Actions actions = new Actions(driver);
						actions.click(option).perform();
						filterSelected = true;
						break;
					}
				}
				if (!filterSelected) {
					throw new Exception("Filter option not found on attempt " + (attempt + 1));
				}
			} catch (Exception e) {
				System.out.println("Attempt " + (attempt + 1) + " to select filter failed: " + e.getMessage());
				Thread.sleep(1000); // Wait before retrying
			}
		}

		softAssert.assertTrue(filterSelected, "Failed to select filter: " + filterText);

		if (!filterSelected) {
			return; // Skip the rest of the process if filter selection failed
		}

		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

		WebElement page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(page).perform();

		Thread.sleep(3000);
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsPerPage.click();

		Thread.sleep(2000);

		List<String> results = new ArrayList<>();
		List<String> errors = new ArrayList<>();
		boolean isNextPageClickable = true;
		boolean dataFound = false;
		int pageNumber = 0;

		while (isNextPageClickable) {
			try {
				List<WebElement> dataElements = driver.findElements(By.xpath("//*[text()=\" " + filterText + "\"]"));

				System.out
						.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());

				boolean pageContainsFilterText = !dataElements.isEmpty();
				if (pageContainsFilterText) {
					dataFound = true;
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

		removeFilter1(filterText);
 
		if (!dataFound) {
	        softAssert.fail("No data found for filter: " + filterText);
	    }
		
		for (String error : errors) {
			softAssert.fail("Error for filter '" + filterText + "' - " + error);
		}

		Thread.sleep(2000);
	}

	// This method is to remove the filter
	private void removeFilter1(String filterText) throws InterruptedException {
		Thread.sleep(3000);
		WebElement filterDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-3\"]")));
		filterDropdown.click();

		boolean filterRemoved = false;
		for (int attempt = 0; attempt < 3 && !filterRemoved; attempt++) {
			try {
				List<WebElement> options = wait.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class=\"mat-option-text\"])[2]")));
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
			System.out.println("Failed to remove filter: " + filterText);
		}

		WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(blankFields).perform();

		Thread.sleep(2000);
	}
		
		// This method is to refresh the page
		private void refreshPage1() throws InterruptedException {
		    WebElement refreshButton = driver.findElement(By.xpath("(//*[@role=\"img\"])[6]")); // Replace with the actual selector for your refresh button
		    refreshButton.click();
		    Thread.sleep(10000); // Wait for the page to refresh
	}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 9)
	public void CCE_Name_FILTER() throws InterruptedException {
		String[] filters = { "Morish Kapoor" };
		SoftAssert softAssert = new SoftAssert();

		for (String filter : filters) {
			applyFilter11(filter, softAssert);
			Thread.sleep(3000);
	        refreshPage2(); // Refresh the page after each filter is tested
	    
		}

		softAssert.assertAll(); // Report all collected errors at the end of the test
	}
	

	private void applyFilter11(String filterText, SoftAssert softAssert) throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement filterDropdown = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-7\"]")));
		filterDropdown.click();

		boolean filterSelected = selectFilterOption(filterText, wait1);

		softAssert.assertTrue(filterSelected, "Failed to select filter: " + filterText);

		if (!filterSelected) {
			return; // Skip the rest of the process if filter selection failed
		}

		setItemsPerPage(wait1);
		List<String> errors = new ArrayList<>();
		boolean dataFound = false;
		int pageNumber = 0;

		while (true) {
			try {
				List<WebElement> dataElements = driver
						.findElements(By.xpath("//*[contains(text(),\"" + filterText + "\")]"));
				System.out
						.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());

				if (dataElements.isEmpty()) {
					errors.add("Page " + (pageNumber + 1) + " - No '" + filterText + "' elements found.");
				} else {
					dataFound = true;
					// Check if all elements contain the filter text
					for (WebElement element : dataElements) {
						if (!element.getText().contains(filterText)) {
							errors.add("Page " + (pageNumber + 1) + " - Element text does not match filter: "
									+ element.getText());
						}
					}
				}

				if (!goToNextPage(wait1, dataElements)) {
					break;
				}

				pageNumber++;
			} catch (Exception e) {
				errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
				break;
			}
		}

		removeFilter(filterText, wait1);
		
		if (!dataFound) {
	        softAssert.fail("No data found for filter: " + filterText);
	    }

		for (String error : errors) {
			softAssert.fail("Error for filter '" + filterText + "' - " + error);
		}
	}

	private boolean selectFilterOption(String filterText, WebDriverWait wait1) throws InterruptedException {
		boolean filterSelected = false;
		for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
			try {
				List<WebElement> options = wait1.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				for (WebElement option : options) {
					if (option.getText().equals(filterText)) {
						new Actions(driver).click(option).perform();
						filterSelected = true;
						break;
					}
				}
				if (!filterSelected) {
					throw new Exception("Filter option not found on attempt " + (attempt + 1));
				}
			} catch (Exception e) {
				System.out.println("Attempt " + (attempt + 1) + " to select filter failed: " + e.getMessage());
				Thread.sleep(1000); // Wait before retrying
			}
		}
		return filterSelected;
	}

	//..................................setItemsper
	// page........................................................
	private void setItemsPerPage(WebDriverWait wait1) throws InterruptedException {
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

		WebElement page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
		new Actions(driver).doubleClick(page).perform();

		Thread.sleep(1000);

		WebElement itemsPerPage = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class=\"mat-option-text\"])[4]")));
		itemsPerPage.click();

		Thread.sleep(1000);
	}
	// ..........................next page
	// click..............................................................................

	private boolean goToNextPage(WebDriverWait wait1, List<WebElement> dataElements) throws InterruptedException {
		try {
			WebElement nextPage = wait1.until(
					ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]")));
			nextPage.click();
			wait1.until(ExpectedConditions.stalenessOf(dataElements.get(0))); // Wait until the page is refreshed
			return true;
		} catch (Exception e) {
			System.out.println("Next page is not clickable: " + e.getMessage());
			return false;
		}
	}

	// ..................................remove the
	// Filter..............................................................
	private void removeFilter(String filterText, WebDriverWait wait2) throws InterruptedException {
		WebElement filterDropdown = wait2
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-7\"]")));
		filterDropdown.click();

			try {
				List<WebElement> options = wait2.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				System.out.println();
				for (WebElement option : options) {
					if (option.getText().equals(filterText)) {
						new Actions(driver).click(option).perform();
					}
				}
			} catch (Exception e) {
				Thread.sleep(1000); // Wait before retrying
				System.out.println("Failed to remove filter: " + filterText);
			}
		
		
		WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
		System.out.println("second");
		new Actions(driver).doubleClick(blankFields).perform();
		Thread.sleep(2000);
	}
	// This method is to refresh the page
			private void refreshPage2() throws InterruptedException {
			    WebElement refreshButton = driver.findElement(By.xpath("(//*[@role=\"img\"])[6]")); // Replace with the actual selector for your refresh button
			    refreshButton.click();
			    Thread.sleep(10000); // Wait for the page to refresh
		}

////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Test(priority = 10)
	public void HeaderPresence() throws InterruptedException {
		// Find the page header element (e.g., header tag)
		WebElement pageHeader = driver.findElement(By.xpath("(//*[@class=\"pageHeader\"])"));
		String Header = pageHeader.getText();

		System.out.println("Header is Displayed: " + Header);
		// Verify the page header is displayed
		Assert.assertTrue(pageHeader.isDisplayed(), "Page header is not displayed");
		
		Thread.sleep(2000);
	}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Test(priority = 11)
	public void HeaderContent() throws InterruptedException {
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
		System.out.println("Actual Header: " + headerText);
		Thread.sleep(2000);
	}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 12)
	public void Date_Of_Sale_Filter() throws InterruptedException, ParseException {
		// Locate the date filter elements and apply the date range
		Thread.sleep(2000);
		
	
		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Date Filter
		WebElement DateFilter = driver.findElement(By.id("mat-expansion-panel-header-0"));
        DateFilter.click();
		Thread.sleep(3000);

		// click on Date of Sale Filter
		WebElement DateOfSale = driver.findElement(By.xpath("(//*[@role=\"button\"])[10]"));
		DateOfSale.click();

		Thread.sleep(3000);
		WebElement fromdate= driver.findElement(By.xpath("(//*[text()=\"From Date\"])[1]"));
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);

		// Perform double-click action on the element
		actions1.click(fromdate).perform();

		Thread.sleep(2000);
	
		// select date from start date calendar
		// Select the year- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[7]")).click();
		Thread.sleep(3000);

		// Select the month- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

		// Select Date from end date calendar
		Thread.sleep(2000);
		WebElement Todate= driver.findElement(By.xpath("(//*[text()=\"To Date\"])[1]"));
		Thread.sleep(2000);
		Actions actions2 = new Actions(driver);

		// Perform double-click action on the element
		actions2.click(Todate).perform();

		Thread.sleep(2000);

		// select year-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();
		Thread.sleep(3000);

		// select month-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[8]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[31]")).click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])"))
				.click();

		String startdate = "01-Jan-2022";
		String enddate = "31-Aug-2022";

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(3000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
//......................................................................................................................................
		// Prepare to collect results and status for "BANDP" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number

		boolean testFailed = false;
		
		 boolean dataFound = false; // Track if any data is found
//...................................................................................................	    
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dateCells = driver.findElements(By.xpath(
					"//td[@class='mat-cell cdk-cell cdk-column-saleDate mat-column-saleDate ng-star-inserted']"));

			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "Sale Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Sale Date: " + dateCells.size());

			boolean pageContainsSaleDate = !dateCells.isEmpty();
//..............................................................................................
			// Add "Sale Date" data to the results list
			if (pageContainsSaleDate) {
				// Process each <td> element to extract and validate dates
				dataFound = true; // Data is found
				
				for (WebElement cell : dateCells) {
					String cellHtml = cell.getAttribute("innerHTML").trim();
					String[] dates = pattern.split(cellHtml);

					// Process each date in the cell
					for (int i = 0; i < dates.length; i += 2) {
						String dateText = dates[i].trim();
						if (!dateText.isEmpty()) {
							results.add(dateText); // Add to results list
							Date dateOfSale = dateFormat.parse(dateText);
							Date start = dateFormat.parse(startdate);
							Date end = dateFormat.parse(enddate);
							if (!(dateOfSale.compareTo(start) >= 0 && dateOfSale.compareTo(end) <= 0)) {
								System.out.println("Date of sale " + dateText + " on PAGE " + (pageNumber + 1)
										+ " is not within the range " + startdate + " to " + enddate);
								testFailed = true;
							}
							Assert.assertTrue(dateOfSale.compareTo(start) >= 0 && dateOfSale.compareTo(end) <= 0,
									"Date of sale " + dateText + " is not within the range " + startdate + " to "
											+ enddate);

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
			else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Date Of Sale' data is available on PAGE " + (pageNumber + 1));
                break;
	        }
		}

		if (!dataFound) {
            Assert.fail("No 'Date Of Sale' data is found in the customer list.");
        }
		
		else if (testFailed) {
        	Assert.fail("One or more Sale Date were found outside the specified date range.");
        }
 
    }
	
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 13)
	public void JCBillDateFilter() throws ParseException, InterruptedException {
		// Locate the date filter elements and apply the date range
		Thread.sleep(4000);

		// refresh the page
				WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();

		Thread.sleep(10000);

		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]")));
		Actions actions = new Actions(driver);

		// Perform double-click action on the element
		actions.click(AdditionFilter).perform();

		Thread.sleep(3000);

//	    //click on Date Filter
		WebElement DateFilter = driver.findElement(By.id("mat-expansion-panel-header-0"));
		DateFilter.click();
		Thread.sleep(3000);

		// click on JC Bill Date Filter
		WebElement JCBillD = driver.findElement(By.id("mat-expansion-panel-header-3"));
		JCBillD.click();

		// from date button
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("(//*[text()=\"From Date\"])[3]"));
		Thread.sleep(2000);

		// Interact with the element, for example, click it
		Thread.sleep(3000);

		Actions actions1 = new Actions(driver);

		// Perform double-click action on the element
		actions1.click(element).perform();

		Thread.sleep(2000);
		// select date from start date calendar
		// Select the year- start date
		driver.findElement(
				By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])"))
				.click();
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
		WebElement ToDate = driver.findElement(By.xpath("(//*[text()=\"To Date\"])[3]"));

		// Interact with the element, for example, click it
		Thread.sleep(3000);

		Actions actions2 = new Actions(driver);

		// Perform double-click action on the element
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
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[31]"))
				.click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])"))
				.click();

		String startdate = "01-May-2023";
		String enddate = "31-May-2023";

		// ....................... Scroll down.....................................

		Thread.sleep(3000);
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-form-field-wrapper ng-tns-c67-26\"])"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
//......................................................................................................................................
		// Prepare to collect results and status for "BANDP" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number

		boolean testFailed = false;
		
		boolean dataFound = false; // Track if any data is found
//...................................................................................................	    
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-jCbillDate mat-column-jCbillDate ng-star-inserted']/span"));
			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "Sale Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of JC Bill Date: " + dateCells.size());

			boolean pageContainsSaleDate = !dateCells.isEmpty();
//..............................................................................................
			// Add "Sale Date" data to the results list
			
			
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
 
    }

	
////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 14)
	public void PSFDueDateFilter() throws ParseException, InterruptedException {
		// Locate the date filter elements and apply the date range
		Thread.sleep(3000);

		// refresh the page
		WebElement Refresh = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		Refresh.click();

		Thread.sleep(10000);

		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]")));
		AdditionFilter.click();
		Thread.sleep(3000);

//			    //click on Date Filter
		WebElement DateFilter = driver.findElement(By.id("mat-expansion-panel-header-0"));
		DateFilter.click();
		Thread.sleep(3000);

		// click on PSF Due Date Filter
		WebElement PSFDueDate = driver.findElement(By.id("mat-expansion-panel-header-4"));
		PSFDueDate.click();

		// from date
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("(//*[text()=\"From Date\"])[4]"));

		Thread.sleep(3000);

		Actions actions1 = new Actions(driver);

		// Perform double-click action on the element
		actions1.click(element1).perform();

		Thread.sleep(2000);

		// select date from start date calendar
		// Select the year- start date
		driver.findElement(
				By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[8]")).click();
		Thread.sleep(3000);

		// Select the month- start date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();

		// Select Date from end date calendar
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("(//*[text()=\"To Date\"])[4]"));
		Thread.sleep(3000);

		Actions actions2 = new Actions(driver);

		// Perform double-click action on the element
		actions2.click(element2).perform();

		Thread.sleep(2000);

		// select year-end date
		driver.findElement(
				By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();
		Thread.sleep(3000);

		// select month-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[6]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[30]"))
				.click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])"))
				.click();

		// select date range
		String startdate = "01-Jan-2023";
		String enddate = "30-June-2023";

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver
				.findElement(By.xpath("(//*[@class=\"mat-form-field-wrapper ng-tns-c67-26\"])"));
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
		
		boolean dataFound = false; // Track if any data is found
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dateCells = driver.findElements(By.xpath(
					"//td[@class='mat-cell cdk-cell cdk-column-saleDate mat-column-saleDate ng-star-inserted']"));

			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "PSF Due Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of PSF Due Date: " + dateCells.size());

			boolean pageContainsPSFDueDate = !dateCells.isEmpty();
			// ..............................................................................................
			// Add "PSF Due Date" data to the results list
			if (pageContainsPSFDueDate) {
				
				dataFound = true; // Data is found
				// Process each <td> element to extract and validate dates
				for (WebElement cell : dateCells) {
					String cellHtml = cell.getAttribute("innerHTML").trim();
					String[] dates = pattern.split(cellHtml);

					// Process each psf due date in the cell
					for (int i = 1; i < dates.length; i += 2) {

						String dateText = dates[i].trim();
						if (!dateText.isEmpty()) {
							results.add(dateText); // Add to results list
							Date DueDate = dateFormat.parse(dateText);
							Date start = dateFormat.parse(startdate);
							Date end = dateFormat.parse(enddate);
							if (!(DueDate.compareTo(start) >= 0 && DueDate.compareTo(end) <= 0)) {
								System.out.println("PSF Due date " + dateText + " on PAGE " + (pageNumber + 1)
										+ " is not within the range " + startdate + " to " + enddate);
								testFailed = true;
							}
							Assert.assertTrue(DueDate.compareTo(start) >= 0 && DueDate.compareTo(end) <= 0,
									"PSF Due Date " + dateText + " is not within the range " + startdate + " to "
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
			}else {
	        	// Output message if no data found on the current page
                System.out.println("No 'PSF Due Date' data is available on PAGE " + (pageNumber + 1));
                break;
	        }
        }
		

		if (!dataFound) {
            Assert.fail("No 'PSF Due Date' data is found in the customer list.");
        }else if (testFailed) {
        	Assert.fail("One or more PSF Due Dates were found outside the specified date range.");
        }
 
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings({ "unused" })
	@Test(priority = 15)
	public void LastCallDateFilter() throws ParseException, InterruptedException {
		// refresh the page
		
     WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();

		Thread.sleep(10000);

		WebElement Non_Responsive = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[6]")));
		Non_Responsive.click();

		Thread.sleep(2000);

		WebElement AdditionFilter = driver.findElement(By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]"));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Date Filter
		WebElement DateFilter = driver.findElement(By.id("mat-expansion-panel-header-0"));
		DateFilter.click();
		Thread.sleep(3000);

		// click on Last Call date Filter
		WebElement LastCallDate = driver.findElement(By.xpath("(//*[text()=\"Last Call Date\"])"));
		Thread.sleep(2000);

		Actions actions = new Actions(driver);

		// Perform double-click action on the element
		actions.click(LastCallDate).perform();

		// from date
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("(//*[text()=\"From Date\"])[5]"));

		Thread.sleep(3000);

		Actions actions1 = new Actions(driver);

		// Perform double-click action on the element
		actions1.click(element1).perform();

		Thread.sleep(2000);

		// select date from start date calendar
		// Select the year- start date
		driver.findElement(
				By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])"))
				.click();
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
		WebElement element2 = driver.findElement(By.xpath("(//*[text()=\"To Date\"])[5]"));
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
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[31]"))
				.click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])"))
				.click();

		// select date range
		String startdate = "01-Oct-2023";
		String enddate = "31-Oct-2023";

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(3000);

		// ..............................Click on Item Per
		// Page.........................................

		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));

		Thread.sleep(2000);
		Actions actions3 = new Actions(driver);

		// Perform double-click action on the element
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
			List<WebElement> dateCells = driver.findElements(By.xpath(
					"//td[@class='mat-cell cdk-cell cdk-column-lastcalldateandtime mat-column-lastcalldateandtime ng-star-inserted']"));

			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "Last Call Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Last Call Date: " + dateCells.size());

			boolean pageContainsLastCallDate = !dateCells.isEmpty();
			// ..............................................................................................
			// Add "PSF Due Date" data to the results list
			if (pageContainsLastCallDate) {
				// Process each <td> element to extract and validate dates
				dataFound = true; // Data is found
				for (WebElement cell : dateCells) {
					String cellHtml = cell.getAttribute("innerHTML").trim();
					String[] dates = pattern.split(cellHtml);

					// Process each Last Call Date in the cell
					for (int i = 0; i < dates.length; i += 2) {

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
	 
	    }
//..............................................................................................................
	@SuppressWarnings("unused")
	@Test(priority=16)
    public void FollowUp_Date_Filter() throws InterruptedException, ParseException {
		// Locate the date filter elements and apply the date range
	    Thread.sleep(3000);
	     
	    //navigate to Follow Up PSF Tab
	    
		   WebElement FollowUp= driver.findElement(By.xpath("(//*[@role=\"tab\"])[4]"));
		    FollowUp.click();
		    
		    Thread.sleep(3000);
		    
		  //refresh the page
		    WebElement Refresh= driver.findElement(By.xpath("(//*[@role=\"img\"])[6]"));
			   Refresh.click();
			   
			   Thread.sleep(5000);
		    
		    //click on Additional Filter
		    WebElement AdditionFilter= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]")));
		    AdditionFilter.click();
		    Thread.sleep(3000);
		    
		    //click on Date Filter
		    WebElement DateFilter= driver.findElement(By.xpath("(//*[@role=\"button\"])[10]"));
            Thread.sleep(2000);
	        
	        Actions actions1 = new Actions(driver);
	        
	    // Perform single-click action on the element
	        actions1.click(DateFilter).perform();
		    Thread.sleep(3000);
		    
		    //click on Follow Up Date Filter
		    WebElement FollowUpDate= driver.findElement(By.xpath("(//*[@role=\"button\"])[16]"));
            Thread.sleep(2000);
	        
	        Actions actions4 = new Actions(driver);
	        
	    // Perform single-click action on the element
	        actions4.click(FollowUpDate).perform();
		    Thread.sleep(3000);
		    
		    //click on From Date
		    Thread.sleep(3000);
	        WebElement  FromDate=  driver.findElement(By.xpath("(//*[text()=\"From Date\"])[6]"));
	        Thread.sleep(2000);
	        
	        Actions actions2 = new Actions(driver);
	        
	    // Perform single-click action on the element
	        actions2.click(FromDate).perform();
	        Thread.sleep(3000);
	        
	        //select date from start date calendar
	        // Select the year- start date
	        driver.findElement(By.xpath("(//*[@type=\"button\"])[6]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-container ng-star-inserted\"])[9]")).click();
	        Thread.sleep(3000);
	        
	        // Select the month- start date
	        driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-container ng-star-inserted\"])[7]")).click();
	        
	        // Select the day- start date
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-container ng-star-inserted\"])[1]")).click();
	        
	        //Select Date from end date calendar
	        Thread.sleep(2000);
	        WebElement ToDate= driver.findElement(By.xpath("(//*[text()=\"To Date\"])[6]"));
	        Actions actions3 = new Actions(driver);
	        
		    // Perform single-click action on the element
		    actions3.click(ToDate).perform();
		        
	        
	        Thread.sleep(2000);
	        
	        //select year-end date
	        driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-container ng-star-inserted\"])[1]")).click();	        
	         Thread.sleep(3000);
	       
	        //select month-end date
	        driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-container ng-star-inserted\"])[7]")).click();
	        
	        // Select the day- end date
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-container ng-star-inserted\"])[1]")).click();
	        
	        //click on arrow to close additional filter tab.
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();
	        
	        String startdate= "1-Jul-2024";
	        String enddate= "1-Jul-2024";
	        
	        
	      //....................... Scroll down.....................................
		    Actions scrollAction = new Actions(driver);
		    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		    Thread.sleep(3000);

		 // ..............................Click on Item Per Page.........................................
		    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		    itemsPerPage.click();
		    WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		    itemsOption.click();

		    Thread.sleep(4000);
	//......................................................................................................................................
		 // Prepare to collect results and status for "BANDP" on each page
		    List<String> results = new ArrayList<>();

		    // Initialize the variable to track if the next page button is click-able
		    boolean isNextPageClickable = true;
		    
		    int pageNumber = 0; // Track the current page number
		    
		    boolean testFailed = false;
		    
		    boolean dataFound = false;
	//...................................................................................................	    
		    while (isNextPageClickable) {
		        // Collect all elements representing the filtered data
		        List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-saleDate mat-column-saleDate ng-star-inserted']"));
	            
		     // Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
		        Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");
		        
		        // Log the size of "Sale Date" on each page
		        System.out.println("Page " + (pageNumber+1) + " - Size of Follow Up Date: " + dateCells.size());

		        boolean pageContainsSaleDate = !dateCells.isEmpty();
	//..............................................................................................
		        // Add "Sale Date" data to the results list
		        if (pageContainsSaleDate) {
		        	// Process each <td> element to extract and validate dates
		        	dataFound = true; // Data is found
		            for (WebElement cell : dateCells) {
		                String cellHtml = cell.getAttribute("innerHTML").trim();
		                String[] dates = pattern.split(cellHtml);
		                
		                // Process each date in the cell
		                for (int i = 0; i < dates.length; i += 2) { 
		                    String dateText = dates[i].trim();
		                    if (!dateText.isEmpty()) {
		                        results.add(dateText); // Add to results list
		                        Date dateOfFollowUp = dateFormat.parse(dateText);
		                        Date start = dateFormat.parse(startdate);
		                        Date end = dateFormat.parse(enddate);
		                        if (!(dateOfFollowUp.compareTo(start) >= 0 && dateOfFollowUp.compareTo(end) <= 0)) {
	                                System.out.println("Follow Up Date " + dateText + " on PAGE " + (pageNumber + 1) + " is not within the range " + startdate + " to " + enddate);
	                                testFailed = true;
		                        }
		                        Assert.assertTrue(dateOfFollowUp.compareTo(start) >= 0 && dateOfFollowUp.compareTo(end) <= 0,
	                                    "Follow Up Date " + dateText + " is not within the range " + startdate + " to " + enddate);
	                                             
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
	                System.out.println("No 'Follow Up Date' data is available on PAGE " + (pageNumber + 1));
	                break;
		        }
	        }
	        

		    if (!dataFound) {
	            Assert.fail("No 'Follow Up Date' data is found in the customer list.");
	        }else if (testFailed) {
	        	Assert.fail("One or more Follow Up Date were found outside the specified date range.");
	        }
	 
	    }
	
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 16)
	public void ServiceAdvisorNameFilter() throws ParseException, InterruptedException {
		// Locate the filter elements.
		Thread.sleep(2000);

		// refresh the page
				WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();

		Thread.sleep(10000);
		WebElement TotalPSFDue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[1]")));
		TotalPSFDue.click();

		// Locate the date filter elements and apply the date range
		Thread.sleep(3000);

		// click on Additional Filter
		WebElement AdditionFilter = driver.findElement(By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]"));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on SA Name filter
		WebElement SAName = driver.findElement(By.id("mat-expansion-panel-header-7"));
		SAName.click();
		Thread.sleep(2000);

//		    //select first "SA NAme" option
		WebElement SAName1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" BHOLE SHANKER \")]")));
		SAName1.click();
		Thread.sleep(1000);

//		    //select second "SA NAme" option
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

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])"))
				.click();
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
		List<String> expectedTexts = Arrays.asList("BHOLE SHANKER", "SHASHI KANT", "MATBAR SINGH", "SANJAY KUMAR",
				"DEEPAK RANA");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean pageContainsSpecifiedTexts = false;
		
		boolean dataFound = false;
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath(
					"//td[text()=' BHOLE SHANKER ' or text()=' SHASHI KANT ' or text()=' MATBAR SINGH ' or text()=' SANJAY KUMAR ' or text()=' DEEPAK RANA ']"));

			// Log the size of "Specified SA Name" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified SA Name: " + dataElements.size());

			

			boolean pageContainsSAName = !dataElements.isEmpty();
			// Add "SA Name" data to the results list
			if (pageContainsSAName) {
				dataFound = true; // Data is found
				for (WebElement element : dataElements) {
					String elementText = element.getText();

					// Check if any of the expected texts are present in the element text
					boolean matchesExpectedText = expectedTexts.stream()
							.anyMatch(expectedText -> elementText.contains(expectedText));

					// System.out.println("Element Text: "+elementText);

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

}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 17)
	public void testVehicleTypeFilter_Private() throws ParseException, InterruptedException {
		// Locate the filter elements.
		
		// refresh the page
				WebElement Refresh = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();

		Thread.sleep(10000);

		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[contains(text(),\"filter_list\")]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Vehicle type filter
		WebElement vehicletype = driver.findElement(By.id("mat-expansion-panel-header-10"));
		vehicletype.click();

		// select "Private" option
		WebElement vehicletypeOption = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-checkbox-81")));
		vehicletypeOption.click();
		Thread.sleep(3000);


		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])"))
				.click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver
				.findElement(By.xpath("(//*[@class=\"mat-form-field-wrapper ng-tns-c67-26\"])"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "PRV" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false;
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\" PRV \")]"));

			// Log the size of "PRV" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of PRV: " + dataElements.size());

			boolean pageContainsPRV = !dataElements.isEmpty();
			// Add "BANDP" data to the results list
			if (pageContainsPRV) {
				dataFound = true;
				for (WebElement element : dataElements) {
					String elementText = element.getText();
					results.add(elementText);

					// Assert that the element's text is equal to the expected value
					Assert.assertTrue(dataElements.stream().anyMatch(e -> e.getText().equals(elementText)),
							"Element text '" + elementText + "' does not match any in dataElements");
				}
			} else {
				// Throw an assertion error if no "PRV" elements are found on the pages
				Assert.fail("No 'PRV' elements found on page " + (pageNumber + 1) + ".");
				break;
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
		 if (!dataFound) {
		        Assert.fail("No 'PRV' data is found in the vehicle type list.");
		    }
	}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 18)
	public void testVehicleTypeFilter_Comm() throws ParseException, InterruptedException {
		// Locate the filter elements.
		Thread.sleep(3000);

		// refresh the page
				WebElement Refresh = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();
		Thread.sleep(10000);

		// click on Additional Filter
				WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//*[contains(text(),\"filter_list\")]")));
				AdditionFilter.click();
				Thread.sleep(3000);

		// click on Vehicle type filter
		WebElement vehicletype = driver.findElement(By.id("mat-expansion-panel-header-10"));
		vehicletype.click();

//			    //select "Private" option
//		        WebElement vehicletypeOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-checkbox-81")));	    
//		        vehicletypeOption.click();	    
//			    Thread.sleep(3000);

		// select COM option
		WebElement vehicletypeOption2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-checkbox-82")));
		vehicletypeOption2.click();
		Thread.sleep(3000);

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])"))
				.click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-form-field-wrapper ng-tns-c67-26\"])"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "PRV" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		 boolean dataFound = false;
		// ...................................................................................................
		while (isNextPageClickable) {
		// Collect all elements representing the filtered data
		List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\" COM \")]"));

			// Log the size of "COM" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of COM Vehicle Type: " + dataElements.size());

			boolean pageContainsCOM = !dataElements.isEmpty();
			// Add "COM" data to the results list
			if (pageContainsCOM) {
				 dataFound = true;
				for (WebElement element : dataElements) {
					String elementText = element.getText();
					results.add(elementText);

					// Assert that the element's text is equal to the expected value
					Assert.assertTrue(dataElements.stream().anyMatch(e -> e.getText().equals(elementText)),
							"Element text '" + elementText + "' does not match any in dataElements");
				}
			} else {
				// Throw an assertion error if no "COM" elements are found on the pages
				Assert.fail("No 'COM' elements found on page " + (pageNumber + 1) + ".");
				break;
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
		if (!dataFound) {
	        Assert.fail("No 'COM' data is found in the vehicle type list.");
	    }
	}
	

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 19)
	public void ModelNameFilter() throws ParseException, InterruptedException {
		// Locate the filter elements.
		Thread.sleep(2000);

		// refresh the page
				WebElement Refresh = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();

		Thread.sleep(10000);

		// click on Additional Filter
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]")));
		AdditionFilter.click();
		Thread.sleep(2000);

		// click on Model filter
		WebElement Model = driver.findElement(By.xpath("(//*[@role=\"button\"])[20]"));
		Model.click();
		Thread.sleep(2000);

//			    //select first "Model" option
		WebElement Model1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" WagonR \")]")));
		Model1.click();
		Thread.sleep(1000);

//			    //select second "Model" option
		WebElement Model2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" NEW SWIFT \")]")));
		Model2.click();
		Thread.sleep(1000);
//			    
//			  //select third "Model" option
		WebElement Model3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" NEW BALENO \")]")));
		Model3.click();
		Thread.sleep(1000);
//			  
//			  //select forth "Model" option
		WebElement Model4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" Ignis \")]")));
		Model4.click();
		Thread.sleep(1000);
//			    
//			  //select fifth "Model" option
		WebElement Model5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" CIAZ \")]")));
		Model5.click();
		Thread.sleep(1000);

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])")).click();
		Thread.sleep(2000);

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-form-field-wrapper ng-tns-c67-26\"])"));
		itemsPerPage.click();
		WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsOption.click();

		Thread.sleep(4000);
		// ......................................................................................................................................
		// Prepare to collect results and status for "Specified Model Name" on each page
		List<String> expectedTexts = Arrays.asList("WagonR", "NEW SWIFT", "NEW BALENO", "Ignis", "CIAZ");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		
		boolean dataFound = false; // Track if any data is found
		
	
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath(
					"//td[text()=' WagonR ' or text()=' NEW SWIFT ' or text()=' NEW BALENO ' or text()=' Ignis ' or text()=' CIAZ ']"));

			// Log the size of "Specified SA Name" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified Model Name: " + dataElements.size());

			
			
			boolean pageContainsModelName = !dataElements.isEmpty();
			// Add "SA Name" data to the results list
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
        	Assert.fail("One or more Model Names were found other than specified Model Names.");
        }
 
    }

//	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 20)
	public void verifyCurrentDate() throws InterruptedException {
		
		// refresh the page
				WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
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
	
		// ......................................................................................................................................
// Prepare to collect results and status for "PSF Due Date" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number

		boolean testFailed = false;
		
		boolean dataFound = false; // Track if any data is found
// ...................................................................................................
		
			// Collect all elements representing the filtered data
			List<WebElement> initialdateCells = driver.findElements(By.xpath(
					"//td[@class='mat-cell cdk-cell cdk-column-saleDate mat-column-saleDate ng-star-inserted']"));
			
			if(initialdateCells.isEmpty()) {
				System.out.println("No data available for the current date: " +formattedCurrentDate);
				Assert.fail("No data available for current date: " +formattedCurrentDate);
				}
			
			// Scroll down
			Actions scrollAction = new Actions(driver);
			scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(3000);

			// Click on Item Per Page
			WebElement itemsPerPage = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
			itemsPerPage.click();
			WebElement itemsOption = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
			itemsOption.click();
			Thread.sleep(4000);
			
			while (isNextPageClickable) {
		    List<WebElement> dateCells = driver.findElements(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-saleDate mat-column-saleDate ng-star-inserted']"));
					
             
			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "PSF Due Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of PSF Due Date: " + dateCells.size());

			boolean pageContainsPSFDueDate = !dateCells.isEmpty();
			// ..............................................................................................
			// Add "PSF Due Date" data to the results list
			if (pageContainsPSFDueDate) {
				// Process each <td> element to extract and validate dates
				dataFound = true; // Data is found
				for (WebElement cell : dateCells) {
					String cellHtml = cell.getAttribute("innerHTML").trim();
					String[] dates = pattern.split(cellHtml);

					// Process each psf due date in the cell
					for (int i = 1; i < dates.length; i += 2) {

						String dateText = dates[i].trim();

						// Extract only the date part from the retrieved text
						String extractedDateText = dateText.split(" ")[0];
						System.out.println("Actual PSF Due Date in tab: " + extractedDateText);
						if (!extractedDateText.isEmpty()) {
							results.add(dateText); // Add to results list

							// Compare the date text with the formatted current date
							if (!extractedDateText.equals(formattedCurrentDate)) {
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

				// ......................................................................................................
				WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
				nextPage.click();

				if (dateCells.size() < 100) {
					assert true : "Data elements size is less than 100. Stopping pagination.";
					break;
				}
				pageNumber++;
			}else {
	        	// Output message if no data found on the current page
                System.out.println("No 'Today's Due PSF' data is available on PAGE " + (pageNumber + 1));
                break;
			}
		}

		if (!dataFound) {
            Assert.fail("No 'TodayDue PSF' data is found in the customer list.");
        }else if (testFailed) {
        	Assert.fail("One or more PSF Due Date were found not equal to Today's Date.");
        }
 
    }
//........................................................................................................................
	
	
@Test(priority = 21)
public void ClickOn_TotalPSFDue_Numbers_Match() throws InterruptedException {

Thread.sleep(6000);
WebElement TotalPSFDueTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[1]"));
TotalPSFDueTab.click();

}				
	
			
//...................................................................................................................................................................
	@Test(priority = 23)
	public void Verify_TotalPSFDue_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(3000);
	    WebElement TotalPSFDueTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[1]"));
	    
	    //click on Show all lead
	    WebElement ShowAllLead= driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
	    ShowAllLead.click();
	    
	    // Get the text from the element
	    String TotalPSFDueText = TotalPSFDueTab.getText();
	    System.out.println("Full Text of Total PSF Due Tab: " + TotalPSFDueText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(TotalPSFDueText);
	    int totalLeads = 0;
	    if (TotalPSFDueText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for 'Total PSF Due' tab.");
	        Assert.fail("No data available for 'Total PSF Due' tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from 'Total PSF Due' Tab: " + totalLeads);
	    }

	    // Extract numbers from the Four buttons
	    WebElement TodayDueButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement PendingPSFButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
	    WebElement FollowUpButton= driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
	    WebElement NonResponsiveButton= driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
	    

	    String TodayDueButtonText = TodayDueButton.getText();
	    String PendingPSFButtonText = PendingPSFButton.getText();
	    String FollowUpButtonText = FollowUpButton.getText();
	    String NonResponsiveButtonText = NonResponsiveButton.getText();
	    
	    
	    System.out.println("Text of 'Today Due PSF' button: " + TodayDueButtonText);
	    System.out.println("Text of 'Pending PSF and Follow Up' button: " + PendingPSFButtonText);
	    System.out.println("Text of 'Follow Up PSF' button: " + FollowUpButtonText);
	    System.out.println("Text of 'Non Responsive PSF' button: " + NonResponsiveButtonText);
	    

	    int TodayDueCount = 0;
	    int PendingPSFCount = 0;
	    int FollowUpCount = 0;
	    int NonResponsiveCount = 0;

	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher TodayDueMatcher = buttonPattern.matcher(TodayDueButtonText);
	    Matcher PendingPSFMatcher = buttonPattern.matcher(PendingPSFButtonText);
	    Matcher FollowUpMatcher= buttonPattern.matcher(FollowUpButtonText);
	    Matcher NonResponsiveMatcher= buttonPattern.matcher(NonResponsiveButtonText);
	    

	    if (TodayDueButtonText.isEmpty() || !TodayDueMatcher.find()) {
	    	System.out.println("No data available for 'Today Due PSF' button.");
	        Assert.fail("No data available for 'Today Due PSF' button.");
	    } else {
	    	TodayDueCount = Integer.parseInt(TodayDueMatcher.group(1));
	        System.out.println("Extracted 'Today Due PSF' button count: " + TodayDueCount);
	    }

	    if (PendingPSFButtonText.isEmpty() || !PendingPSFMatcher.find()) {
	    	System.out.println("No data available for 'Pending PSF and Follow Up' button.");
	        Assert.fail("No data available for 'Pending PSF and Follow Up' button.");
	    } else {
	    	PendingPSFCount = Integer.parseInt(PendingPSFMatcher.group(1));
	        System.out.println("Extracted 'Pending PSF and Follow Up' button count: " + PendingPSFCount);
	    }
	    
	    if (FollowUpButtonText.isEmpty() || !FollowUpMatcher.find()) {
	    	System.out.println("No data available for 'Follow Up PSF' button.");
	        Assert.fail("No data available for 'Follow Up PSF' button.");
	    } else {
	    	FollowUpCount = Integer.parseInt(FollowUpMatcher.group(1));
	        System.out.println("Extracted 'Follow Up PSF' count: " + FollowUpCount);
	    }
	    
	    if (NonResponsiveButtonText.isEmpty() || !NonResponsiveMatcher.find()) {
	    	System.out.println("No data available for 'Non Responsive PSF' button.");
	        Assert.fail("No data available for 'Non Responsive PSF' button.");
	    } else {
	    	NonResponsiveCount = Integer.parseInt(NonResponsiveMatcher.group(1));
	        System.out.println("Extracted 'Non Responsive PSF' button count: " + NonResponsiveCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfButtonsNumbers = TodayDueCount + PendingPSFCount + FollowUpCount + NonResponsiveCount;
	    System.out.println("Sum of four buttons of 'Total PSF Due' Tab- 'Today Due PSF', 'Pending PSF and Follow Up', 'Follow Up PSF' and 'Non Responsive PSF' buttons is: " + sumOfButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfButtonsNumbers, totalLeads, "The Sum of button of 'Total PSF Due' tab- 'Today Due PSF', 'Pending PSF and Follow Up', 'Follow Up' and 'Non Responsive' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
	@Test(priority = 24)
	public void Verify_TotalPSFTab_TodayDuebutton_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement TodayDueButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		TodayDueButton.click();

		// Get the text from the element
		String TodayDuePSF_Text = TodayDueButton.getText();
		System.out.println("Full Text of 'Total PSF Due' Button: " + TodayDuePSF_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(TodayDuePSF_Text);
		String extractedNumber_TodayDue = null;
		if (TodayDuePSF_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Due PSF' button.");
	        Assert.fail("No data available for 'Today Due PSF' button.");
	    } else {
	    	extractedNumber_TodayDue = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Due PSF' button text: " + extractedNumber_TodayDue);
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
		Assert.assertEquals(extractedNumber_TodayDue, extractedNumber_Pagination, "Number does not matches in 'Today Due PSF' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 25)
	public void Verify_TotalPSFTab_NonResponsive_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement NonResponsiveButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		NonResponsiveButton.click();

		// Get the text from the element
		String NonResponsiveButton_Text = NonResponsiveButton.getText();
		System.out.println("Full Text of 'Non Responsive PSF' Button: " + NonResponsiveButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(NonResponsiveButton_Text);
		String extractedNumber_NonResponsive = null;
		if (NonResponsiveButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Non Responsive PSF' button.");
	        Assert.fail("No data available for 'Non Responsive PSF' button.");
	    } else {
	    	extractedNumber_NonResponsive = matcher.group(1);
	        System.out.println("Extracted Number from 'Non Responsive PSF' button text: " + extractedNumber_NonResponsive);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_NonResponsive, extractedNumber_Pagination, "Number does not matches in 'Non Responsive PSF' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 26)
	public void Verify_TotalPSFTab_PendingPSFFollpwUpButton_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement PendingPSFButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		PendingPSFButton.click();

		// Get the text from the element
		String PendingPSFButton_Text = PendingPSFButton.getText();
		System.out.println("Full Text of 'Pending PSF and Follow Up' Button: " + PendingPSFButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(PendingPSFButton_Text);
		String extractedNumber_PendingPSF = null;
		if (PendingPSFButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Pending PSF and Follow Up' button.");
	        Assert.fail("No data available for 'Pending PSF and Follow Up' button.");
	    } else {
	    	extractedNumber_PendingPSF = matcher.group(1);
	        System.out.println("Extracted Number from 'Pending PSF and Follow Up' button text: " + extractedNumber_PendingPSF);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_PendingPSF, extractedNumber_Pagination, "Number does not matches in 'Pending PSF and Follow Up' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 27)
	public void Verify_TotalPSFTab_FollpwUpPSFButton_Pagination() throws InterruptedException {

		Thread.sleep(5000);
		WebElement FollowUpPSFButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		FollowUpPSFButton.click();

		// Get the text from the element
		String FollowUpPSFButton_Text = FollowUpPSFButton.getText();
		System.out.println("Full Text of 'Follow Up PSF' Button: " + FollowUpPSFButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(FollowUpPSFButton_Text);
		String extractedNumber_FollowUpPSF = null;
		if (FollowUpPSFButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Follow Up PSF' button.");
	        Assert.fail("No data available for 'Follow Up PSF' button.");
	    } else {
	    	extractedNumber_FollowUpPSF = matcher.group(1);
	        System.out.println("Extracted Number from 'Follow Up PSF' button text: " + extractedNumber_FollowUpPSF);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_FollowUpPSF, extractedNumber_Pagination, "Number does not matches in 'Follow Up PSF' button and in its Pagination");
	}
//...................................................................................................................................................................
	
	@Test(priority = 28)
	public void Click_On_TodayPSFDue_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]")));
		button.click();
		Thread.sleep(5000);
		
	}
//....................................................................................................................	
	@Test(priority = 29)
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
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement Tab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-tab-label-content\"])[2]")));
		Tab.click();
		Thread.sleep(3000);
			
//....................................................................................................................		
        //click on Today PSF Due tab
		
		// Get the text from the element
		String TodayDuePSF_text = Tab.getText();
		System.out.println("Full Text of Today Due PSF tab: " + TodayDuePSF_text);
		
		// Check if the tab text indicates no data
	    if (TodayDuePSF_text.isEmpty() || TodayDuePSF_text.equals("Today's Due PSF")) {
	        System.out.println("No data available in Today Due PSF tab.");
	        Assert.fail("No data found in Today Due PSF tab.");
	    } else {
		
		// Extract the numeric value using regular expressions
		Pattern pattern2 = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher2 = pattern2.matcher(TodayDuePSF_text);
		String extractedNumber_TodayDue_PSF = null;
		if (matcher2.find()) {
			extractedNumber_TodayDue_PSF = matcher2.group(1);
			System.out.println("Extracted Number from Today Due PSF tab text: " + extractedNumber_TodayDue_PSF);
			Assert.assertEquals(extractedNumber_TodayDue_PSF, extractedNumber_Button, "Number does not match in Total PSF Due and Today Due PSF tab");
		}
		else {
			System.out.println("No number found in Today Due PSF tab text.");
			Assert.fail("No data found in Today Due PSF tab.");
		}
		
	}
	}
//......................................................................................................................	
	@Test(priority = 30)
	public void Click_On_PendingPSFFollowUp_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement TotalDue= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@role=\"tab\"])[1]")));
		TotalDue.click();
		Thread.sleep(3000);
		
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]")));
		button.click();
		Thread.sleep(5000);
		
	}
//.......................................................................................
	@Test(priority = 31)
	public void Total_PSFDue_PendingPSFFollowUp_Button_Matching_With_Tab() throws InterruptedException {
		WebElement PendingFollowUp_Button  = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));

		// Get the text from the element
		String Button1 = PendingFollowUp_Button.getText();
		System.out.println("Full Text of Total PSF Due > Pending PSF and FollowUP button: " + Button1);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("(\\d+)$");
		Matcher matcher = pattern.matcher(Button1);
		String extractedNumber_Button = null;
		if (matcher.find()) {
			extractedNumber_Button = matcher.group(1);
			System.out.println("Extracted Number from Pending PSF and FollowUp button text: " + extractedNumber_Button);
		}
		else {
		    System.out.println("No number found in Pending PSF and FollowUP button text.");
		}
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-range-label\"])"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination for Pending PSF and FollowUp Button: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		else {
		    System.out.println("No number found in Pending PSF and FollowUP pagination text.");
		}
		
		Assert.assertEquals(extractedNumber_Button, extractedNumber_Pagination, "Number does not matches in Pending PSF and Follow UP and in Pagination ");
	    Thread.sleep(3000);

//...........................................................................................................................................................
	    //click on Pending PSF and Follow Up tab
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement Tab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@role=\"tab\"])[3]")));
		Tab.click();
		Thread.sleep(5000);
			
//....................................................................................................................		
        //click on Pending PSF and FollowUP tab
		
		// Get the text from the element
		String PendingPSF_text = Tab.getText();
		System.out.println("Full Text of Pending PSF and FollowUP tab: " + PendingPSF_text);
		
		// Check if the tab text indicates no data
	    if (PendingPSF_text.isEmpty() || PendingPSF_text.equals("Pending PSF & Followup")) {
	        System.out.println("No data available in Pending PSF and FollowUp tab.");
	        Assert.fail("No data found in Pending PSF and FollowUp tab.");
	    } else {
		
		// Extract the numeric value using regular expressions
		Pattern pattern2 = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher2 = pattern2.matcher(PendingPSF_text);
		String extractedNumber_Pending_PSF = null;
		if (matcher2.find()) {
			extractedNumber_Pending_PSF = matcher2.group(1);
			System.out.println("Extracted Number from Pending PSF and FollowUp tab text: " + extractedNumber_Pending_PSF);
			Assert.assertEquals(extractedNumber_Pending_PSF, extractedNumber_Button, "Number does not match in Pending PSF button and Pending PSF tab");
		}
		else {
			System.out.println("No number found in Pending PSF and FollowUp tab text.");
			Assert.fail("No data found in Pending PSF and  FollowUp tab.");
		}
		
	}
	    Thread.sleep(3000);
	}
//...............................................................................................................	
	@Test(priority = 32)
	public void Click_On_FollowUp_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement TotalDue= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@role=\"tab\"])[1]")));
		TotalDue.click();
		Thread.sleep(3000);
		
		//click on FollowUp button under Total PSD Due tab
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]")));
		button.click();
		Thread.sleep(5000);
		
	}
//.......................................................................................
	@Test(priority = 33)
	public void Total_PSFDue_FollowUp_Button_Matching_With_Tab() throws InterruptedException {
		WebElement FollowUp_Button  = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));

		// Get the text from the element
		String Button1 = FollowUp_Button.getText();
		System.out.println("Full Text of Total PSF Due > FollowUP button: " + Button1);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("(\\d+)$");
		Matcher matcher = pattern.matcher(Button1);
		String extractedNumber_Button = null;
		if (matcher.find()) {
			extractedNumber_Button = matcher.group(1);
			System.out.println("Extracted Number from FollowUp button text: " + extractedNumber_Button);
		}
		else {
		    System.out.println("No number found in FollowUP button text.");
		}
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-range-label\"])"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination for FollowUp Button: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		else {
		    System.out.println("No number found in FollowUP pagination text.");
		}
		
		Assert.assertEquals(extractedNumber_Button, extractedNumber_Pagination, "Number does not matches in Follow UP and in Pagination ");
	    Thread.sleep(3000);

//...........................................................................................................................................................
	    //click on Follow Up tab
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement Tab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@role=\"tab\"])[4]")));
		Tab.click();
		Thread.sleep(6000);
			
//....................................................................................................................		
        //click on FollowUP tab
		// Get the text from the element
		String FollowUp_text = Tab.getText();
		System.out.println("Full Text of FollowUP tab: " + FollowUp_text);
		
		// Check if the tab text indicates no data
	    if (FollowUp_text.isEmpty() || FollowUp_text.equals("Follow Up PSF")) {
	        System.out.println("No data available in FollowUp tab.");
	        Assert.fail("No data found in FollowUp tab.");
	    } else {
		
		// Extract the numeric value using regular expressions
		Pattern pattern2 = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher2 = pattern2.matcher(FollowUp_text);
		String extractedNumber_FollowUp = null;
		if (matcher2.find()) {
			extractedNumber_FollowUp = matcher2.group(1);
			System.out.println("Extracted Number from FollowUp tab text: " + extractedNumber_FollowUp);
			Assert.assertEquals(extractedNumber_FollowUp, extractedNumber_Button, "Number does not match in Follow Up button and Follow Up tab");
		}
		else {
			System.out.println("No number found in Follow Up tab text.");
			Assert.fail("No data found in Follow Up tab.");
		}
		
	}
	}
//........................................................................................................................................................
	@Test(priority = 34)
	public void Click_On_NonResponsive_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement TotalDue= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@role=\"tab\"])[1]")));
		TotalDue.click();
		Thread.sleep(3000);
		
		
		//click on Show All Leads button
		WebElement button1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]")));
		button1.click();
		Thread.sleep(3000);
		
		WebElement button2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]")));
		button2.click();
		Thread.sleep(6000);
		
	}
//.......................................................................................
	@Test(priority = 35)
	public void Total_PSFDue_NonResponsive_Button_Matching_With_Tab() throws InterruptedException {
		WebElement NonResponsive_Button  = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));

		// Get the text from the element
		String Button1 = NonResponsive_Button.getText();
		System.out.println("Full Text of Total PSF Due > NonResponsive Button: " + Button1);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("(\\d+)$");
		Matcher matcher = pattern.matcher(Button1);
		String extractedNumber_Button = null;
		if (matcher.find()) {
			extractedNumber_Button = matcher.group(1);
			System.out.println("Extracted Number from NonResponsive Button button text: " + extractedNumber_Button);
		}
		else {
		    System.out.println("No number found in NonResponsive Button button text.");
		}
		// .............................Item per page numbers...........................................................

		WebElement Pagination_totalCountElement = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-range-label\"])"));
		// Get the text from the element
		String Pagination_text = Pagination_totalCountElement.getText();
	    System.out.println("Full Text of Pagination for NonResponsive Button: " + Pagination_text);

		// Extract the total count using regular expressions
		Pattern pattern1 = Pattern.compile("of\\s+(\\d+)");
		Matcher matcher1 = pattern1.matcher(Pagination_text);
		String extractedNumber_Pagination = null;
		if (matcher1.find()) {
			extractedNumber_Pagination = matcher.group(1);
			System.out.println("Extracted Number from Pagination text= : " + extractedNumber_Pagination);

		}
		else {
		    System.out.println("No number found in NonResponsive Button pagination text.");
		}
		
		Assert.assertEquals(extractedNumber_Button, extractedNumber_Pagination, "Number does not matches in NonResponsive Button and in Pagination ");
	    Thread.sleep(4000);

//...........................................................................................................................................................
	    //click on NonResponsive tab
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement Tab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@role=\"tab\"])[6]")));
		Tab.click();
		Thread.sleep(5000);
			
//....................................................................................................................		
        //click on NonResponsive tab
		
		// Get the text from the element
		String NonResponsive_text = Tab.getText();
		System.out.println("Full Text of Non Responsive tab: " + NonResponsive_text);
		
		// Check if the tab text indicates no data
	    if (NonResponsive_text.isEmpty() || NonResponsive_text.equals("Non-Responsive PSF")) {
	        System.out.println("No data available in  Non-Responsive PSF tab.");
	        Assert.fail("No data found in Non-Responsive PSF tab.");
	    } else {
		
		// Extract the numeric value using regular expressions
		Pattern pattern2 = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher2 = pattern2.matcher(NonResponsive_text);
		String extractedNumber_NonResponsive = null;
		if (matcher2.find()) {
			extractedNumber_NonResponsive = matcher2.group(1);
			System.out.println("Extracted Number from NonResponsive_text tab text: " + extractedNumber_NonResponsive);
			Assert.assertEquals(extractedNumber_NonResponsive, extractedNumber_Button, "Number does not match in NonResponsive button and NonResponsive tab");
		}
		else {
			System.out.println("No number found in Non Responsive tab text.");
			Assert.fail("No data found in Non Responsive tab.");
		}
		
	}
	    Thread.sleep(4000);
	}
//...............................................................................................................	
	@Test(priority = 36)
	public void ClickOnTodayDueTab() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement TodayDuePSF = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[2]"));
		Thread.sleep(3000);		 
		Actions actions1 = new Actions(driver);

        // Perform double-click action on the element
        actions1.click(TodayDuePSF).perform();    
		Thread.sleep(6000);
	}
//.........................................................................
	
	@Test(priority = 37)
	public void TodayPSFDue_Numbers_Match() throws InterruptedException {

		Thread.sleep(2000);
		WebElement TodayDue = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[2]"));

		// Get the text from the element
		String TodayDuePSFText = TodayDue.getText();
		System.out.println("Full Text of Today's Due PSF: " + TodayDuePSFText);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(TodayDuePSFText);
		String extractedNumber_TodayDuePSF = null;
		if (TodayDuePSFText.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for Today's Due PSF tab.");
	        Assert.fail("No data available for Today's Due PSF tab.");
	    } else {
	    	extractedNumber_TodayDuePSF = matcher.group(1);
	        System.out.println("Extracted Number from Today's Due PSF text: " + extractedNumber_TodayDuePSF);
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
			System.out.println("Extracted Number from Pagination text : " + extractedNumber_Pagination);

		}
		Assert.assertEquals(extractedNumber_TodayDuePSF, extractedNumber_Pagination, "Number does not matches in Today's Due PSF and in its Pagination ");
	}

//...............................................................................................................................................
	@Test(priority = 38)
	public void ClickOnPendingPSFFollowUp() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement PendingPSF = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[3]"));
		PendingPSF.click();
		Thread.sleep(6000);
	}
//.........................................................................
	
	@Test(priority = 39)
	public void PendingPSFFollowUp_Numbers_Match() throws InterruptedException {

		Thread.sleep(2000);
		WebElement PendingPSF = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[3]"));

		// Get the text from the element
		String PendingPSFText = PendingPSF.getText();
		System.out.println("Full Text of Total PSF Due: " + PendingPSFText);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(PendingPSFText);
		String extractedNumber_PendingPSF = null;
		if (PendingPSFText.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for Pending PSF and Follow Up tab.");
	        Assert.fail("No data available for Pending PSF and Follow Up tab.");
	    } else {
	        extractedNumber_PendingPSF = matcher.group(1);
	        System.out.println("Extracted Number from Pending PSF and Follow Up text: " + extractedNumber_PendingPSF);
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
		Assert.assertEquals(extractedNumber_PendingPSF, extractedNumber_Pagination, "Number does not matches in Pending PSF and in Pagination ");
	}
//.......................................................................................................................................................................
	@Test(priority = 40)
	public void VerifyPendingPSFAndFollowUpSum() throws InterruptedException {
	    Thread.sleep(2000);
	    WebElement PendingPSFAndFollowUpTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[3]"));

	    // Get the text from the element
	    String PendingPSFAndFollowUpText = PendingPSFAndFollowUpTab.getText();
	    System.out.println("Full Text of Pending PSF and Follow Up Tab: " + PendingPSFAndFollowUpText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(PendingPSFAndFollowUpText);
	    int totalLeads = 0;
	    if (PendingPSFAndFollowUpText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for Pending PSF and Follow Up tab.");
	        Assert.fail("No data available for Pending PSF and Follow Up tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from Pending PSF and Follow Up Tab: " + totalLeads);
	    }

	    // Extract numbers from the two buttons
	    WebElement PendingPSFButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement PendingFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));

	    String PendingPSFButtonText = PendingPSFButton.getText();
	    String PendingFollowUpButtonText = PendingFollowUpButton.getText();

	    System.out.println("Text of Pending PSF button: " + PendingPSFButtonText);
	    System.out.println("Text of Pending Followup button: " + PendingFollowUpButtonText);

	    int pendingPSFCount = 0;
	    int pendingFollowUpCount = 0;

	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher psfMatcher = buttonPattern.matcher(PendingPSFButtonText);
	    Matcher followUpMatcher = buttonPattern.matcher(PendingFollowUpButtonText);

	    if (PendingPSFButtonText.isEmpty() || !psfMatcher.find()) {
	    	System.out.println("No data available for Pending PSF button.");
	        Assert.fail("No data available for Pending PSF button.");
	    } else {
	        pendingPSFCount = Integer.parseInt(psfMatcher.group(1));
	        System.out.println("Extracted Pending PSF count: " + pendingPSFCount);
	    }

	    if (PendingFollowUpButtonText.isEmpty() || !followUpMatcher.find()) {
	    	System.out.println("No data available for Pending Followup button.");
	        Assert.fail("No data available for Pending Followup button.");
	    } else {
	        pendingFollowUpCount = Integer.parseInt(followUpMatcher.group(1));
	        System.out.println("Extracted Pending Followup count: " + pendingFollowUpCount);
	    }

	    // Sum the numbers from the buttons
	    int sumOfLeads = pendingPSFCount + pendingFollowUpCount;
	    System.out.println("Sum of Pending PSF and Followup leads: " + sumOfLeads);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfLeads, totalLeads, "The Sum of Pending PSF and Followup leads does not match the total leads in the tab.");
	}	
//........................................................................................................................................................	
	@Test(priority = 41)
	public void Verify_PendingPSFFollowUpTab_PendingPSFButton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement PendingPSFButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		PendingPSFButton.click();

		// Get the text from the element
		String PendingPSFButton_Text = PendingPSFButton.getText();
		System.out.println("Full Text of 'Pending PSF' Button: " + PendingPSFButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(PendingPSFButton_Text);
		String extractedNumber_PendingPSF = null;
		if (PendingPSFButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Pending PSF' button.");
	        Assert.fail("No data available for 'Pending PSF' button.");
	    } else {
	    	extractedNumber_PendingPSF = matcher.group(1);
	        System.out.println("Extracted Number from 'Pending PSF' button text: " + extractedNumber_PendingPSF);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_PendingPSF, extractedNumber_Pagination, "Number does not matches in 'Pending PSF' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 42)
	public void Verify_PendingPSFFollowUpTab_PendingFollowUpButton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement PendingFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		PendingFollowUpButton.click();

		// Get the text from the element
		String PendingFollowUpButton_Text = PendingFollowUpButton.getText();
		System.out.println("Full Text of 'Pending PSF' Button: " + PendingFollowUpButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(PendingFollowUpButton_Text);
		String extractedNumber_PendingFollowUp = null;
		if (PendingFollowUpButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Pending Follow Up' button.");
	        Assert.fail("No data available for 'Pending Follow Up' button.");
	    } else {
	    	extractedNumber_PendingFollowUp = matcher.group(1);
	        System.out.println("Extracted Number from 'Pending Follow Up' button text: " + extractedNumber_PendingFollowUp);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_PendingFollowUp, extractedNumber_Pagination, "Number does not matches in 'Pending Follow Up' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 43)
	public void Verify_PendingPSFFollowUpTab_CallNotConnectedButton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CallNotConnectedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		CallNotConnectedButton.click();

		// Get the text from the element
		String CallNotConnectedButton_Text = CallNotConnectedButton.getText();
		System.out.println("Full Text of 'Pending PSF' Button: " + CallNotConnectedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CallNotConnectedButton_Text);
		String extractedNumber_CallNotConnected = null;
		if (CallNotConnectedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Call Not Connected' button.");
	        Assert.fail("No data available for 'Call Not Connected' button.");
	    } else {
	    	extractedNumber_CallNotConnected = matcher.group(1);
	        System.out.println("Extracted Number from 'Call Not Connected' button text: " + extractedNumber_CallNotConnected);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_CallNotConnected, extractedNumber_Pagination, "Number does not matches in 'Call Not Connected' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 44)
	public void Verify_PendingPSFFollowUpTab_CallConnectedButton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CallConnectedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		CallConnectedButton.click();

		// Get the text from the element
		String CallConnectedButton_Text = CallConnectedButton.getText();
		System.out.println("Full Text of 'Pending PSF' Button: " + CallConnectedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CallConnectedButton_Text);
		String extractedNumber_CallConnected = null;
		if (CallConnectedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Call Connected' button.");
	        Assert.fail("No data available for 'Call Connected' button.");
	    } else {
	    	extractedNumber_CallConnected = matcher.group(1);
	        System.out.println("Extracted Number from 'Call Connected' button text: " + extractedNumber_CallConnected);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_CallConnected, extractedNumber_Pagination, "Number does not matches in 'Call Connected' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 45)
	public void ClickOnFollowUpPSF() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement FollowUpPSF = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[4]"));
		FollowUpPSF.click();
		Thread.sleep(6000);
	}
//.........................................................................
	
	@Test(priority = 46)
	public void FollowUpPSF_Numbers_Match() throws InterruptedException {

		Thread.sleep(2000);
		WebElement FollowUpPSF = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[4]"));

		// Get the text from the element
		String FollowUpPSFText = FollowUpPSF.getText();
		System.out.println("Full Text of Follow Up PSF: " + FollowUpPSFText);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(FollowUpPSFText);
		String extractedNumber_FollowUpPSF = null;
		if (FollowUpPSFText.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for Follow Up PSF tab.");
	        Assert.fail("No data available for Follow Up PSF tab.");
	    } else {
	    	extractedNumber_FollowUpPSF = matcher.group(1);
	        System.out.println("Extracted Number from Follow Up PSF text: " + extractedNumber_FollowUpPSF);
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
		Assert.assertEquals(extractedNumber_FollowUpPSF, extractedNumber_Pagination, "Number does not matches in Follow Up PSF tab and in its Pagination ");
	}
//..................................................................................................................................................................
	@Test(priority = 47)
	public void VerifyFollowUpButtonsSum() throws InterruptedException {
	    Thread.sleep(2000);
	    WebElement FollowUpTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[4]"));

	    // Get the text from the element
	    String FollowUpText = FollowUpTab.getText();
	    System.out.println("Full Text of Follow Up Tab: " + FollowUpText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(FollowUpText);
	    int totalLeads = 0;
	    if (FollowUpText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for Follow Up tab.");
	        Assert.fail("No data available for Follow Up PSF tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from Follow Up Tab: " + totalLeads);
	    }

	    // Extract numbers from the two buttons
	    WebElement TodayFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement FutureFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));

	    String TodayFollowUpButtonText = TodayFollowUpButton.getText();
	    String FutureFollowUpButtonText = FutureFollowUpButton.getText();

	    System.out.println("Text of Today Follow Up button: " + TodayFollowUpButtonText);
	    System.out.println("Text of Future FollowUp button: " + FutureFollowUpButtonText);

	    int TodayFollowUpCount = 0;
	    int FutureFollowUpCount = 0;

	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher psfMatcher = buttonPattern.matcher(TodayFollowUpButtonText);
	    Matcher followUpMatcher = buttonPattern.matcher(FutureFollowUpButtonText);

	    if (TodayFollowUpButtonText.isEmpty() || !psfMatcher.find()) {
	    	System.out.println("No data available for Today Follow Up button.");
	        Assert.fail("No data available for Today Follow Up button.");
	    } else {
	    	TodayFollowUpCount = Integer.parseInt(psfMatcher.group(1));
	        System.out.println("Extracted Today Follow Up button count: " + TodayFollowUpCount);
	    }

	    if (FutureFollowUpButtonText.isEmpty() || !followUpMatcher.find()) {
	    	System.out.println("No data available for Future Follow Up button.");
	        Assert.fail("No data available for Future Follow Up button.");
	    } else {
	    	FutureFollowUpCount = Integer.parseInt(followUpMatcher.group(1));
	        System.out.println("Extracted Future Followup count: " + FutureFollowUpCount);
	    }

	    // Sum the numbers from the buttons
	    int sumOfLeads = TodayFollowUpCount + FutureFollowUpCount;
	    System.out.println("Sum of Today Follow Up and Future Follow Up leads: " + sumOfLeads);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfLeads, totalLeads, "The Sum of Today Follow Up and Future Followup leads does not match the total leads in the tab.");
	}	
//........................................................................................................................................................	
	@Test(priority = 48)
	public void Verify_FollowUpTab_TodayFollowUpButton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement TodayFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		TodayFollowUpButton.click();

		// Get the text from the element
		String TodayFollowUpButton_Text = TodayFollowUpButton.getText();
		System.out.println("Full Text of 'Today Follow Up' Button: " + TodayFollowUpButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(TodayFollowUpButton_Text);
		String extractedNumber_TodayFollowUp = null;
		if (TodayFollowUpButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Follow Up' button.");
	        Assert.fail("No data available for 'Today Follow Up' button.");
	    } else {
	    	extractedNumber_TodayFollowUp = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Follow Up' button text: " + extractedNumber_TodayFollowUp);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_TodayFollowUp, extractedNumber_Pagination, "Number does not matches in 'Today Follow Up' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 49)
	public void Verify_FollowUpTab_FutureFollowUpButton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement FutureFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		FutureFollowUpButton.click();

		// Get the text from the element
		String FutureFollowUpButton_Text = FutureFollowUpButton.getText();
		System.out.println("Full Text of 'Future Follow Up' Button: " + FutureFollowUpButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(FutureFollowUpButton_Text);
		String extractedNumber_FutureFollowUp = null;
		if (FutureFollowUpButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Future Follow Up' button.");
	        Assert.fail("No data available for 'Future Follow Up' button.");
	    } else {
	    	extractedNumber_FutureFollowUp = matcher.group(1);
	        System.out.println("Extracted Number from 'Future Follow Up' button text: " + extractedNumber_FutureFollowUp);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_FutureFollowUp, extractedNumber_Pagination, "Number does not matches in 'Future Follow Up' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 50)
	public void Verify_FollowUpTab_CallNotConnectedButton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CallNotConnectedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		CallNotConnectedButton.click();

		// Get the text from the element
		String CallNotConnectedButton_Text = CallNotConnectedButton.getText();
		System.out.println("Full Text of 'Call Not Connected' Button: " + CallNotConnectedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CallNotConnectedButton_Text);
		String extractedNumber_CallNotConnected = null;
		if (CallNotConnectedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Call Not Connected' button.");
	        Assert.fail("No data available for 'Call Not Connected' button.");
	    } else {
	    	extractedNumber_CallNotConnected = matcher.group(1);
	        System.out.println("Extracted Number from 'Call Not Connected' button text: " + extractedNumber_CallNotConnected);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_CallNotConnected, extractedNumber_Pagination, "Number does not matches in 'Call Not Connected' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 51)
	public void Verify_FollowUpTab_CallConnectedButton_Pagination() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CallConnectedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		CallConnectedButton.click();

		// Get the text from the element
		String CallConnectedButton_Text = CallConnectedButton.getText();
		System.out.println("Full Text of 'Call Connected' Button: " + CallConnectedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CallConnectedButton_Text);
		String extractedNumber_CallConnected = null;
		if (CallConnectedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Call Connected' button.");
	        Assert.fail("No data available for 'Call Connected' button.");
	    } else {
	    	extractedNumber_CallConnected = matcher.group(1);
	        System.out.println("Extracted Number from 'Call Connected' button text: " + extractedNumber_CallConnected);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_CallConnected, extractedNumber_Pagination, "Number does not matches in 'Call Connected' button and in its Pagination");
	}
//...................................................................................................................................................................
	
	@Test(priority = 52)
	public void ClickOnPSFDone_Tab() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement PSFDone = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[5]"));
		PSFDone.click();
		Thread.sleep(6000);
	}
//.........................................................................
	
	@Test(priority = 53)
	public void PSFDone_Numbers_Match() throws InterruptedException {

		Thread.sleep(3000);
		WebElement PSFDoneTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[5]"));

		// Get the text from the element
		String PSFDone_Text = PSFDoneTab.getText();
		System.out.println("Full Text of PSF Done tab: " + PSFDone_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(PSFDone_Text);
		String extractedNumber_PSFDone = null;
		if (PSFDone_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for PSF Done tab.");
	        Assert.fail("No data available for PSF Done tab.");
	    } else {
	    	extractedNumber_PSFDone = matcher.group(1);
	        System.out.println("Extracted Number from PSF Done text: " + extractedNumber_PSFDone);
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
		Assert.assertEquals(extractedNumber_PSFDone, extractedNumber_Pagination, "Number does not matches in PSF Done tab and in its Pagination ");
	}
//.............................................................................................................................................................
	@Test(priority = 54)
	public void VerifyPSFDone_Left_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(2000);
	    WebElement PSFDoneTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[5]"));

	    // Get the text from the element
	    String PSFDoneText = PSFDoneTab.getText();
	    System.out.println("Full Text of PSF Done Tab: " + PSFDoneText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(PSFDoneText);
	    int totalLeads = 0;
	    if (PSFDoneText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for PSF Done tab.");
	        Assert.fail("No data available for PSF Done tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from PSF Done Tab: " + totalLeads);
	    }

	    // Extract numbers from the Three buttons
	    WebElement TodayFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
	    WebElement FutureFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
	    WebElement PendingCalibrationButton= driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[15]"));

	    String TodayFollowUpButtonText = TodayFollowUpButton.getText();
	    String FutureFollowUpButtonText = FutureFollowUpButton.getText();
	    String PendingCalibrationButtonText = PendingCalibrationButton.getText();
	    

	    System.out.println("Text of Today Follow Up button: " + TodayFollowUpButtonText);
	    System.out.println("Text of Future FollowUp button: " + FutureFollowUpButtonText);
	    System.out.println("Text of Pending Calibration button: " + PendingCalibrationButtonText);
	    

	    int TodayFollowUpCount = 0;
	    int FutureFollowUpCount = 0;
	    int PendingCalibrationCount = 0;

	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher psfMatcher = buttonPattern.matcher(TodayFollowUpButtonText);
	    Matcher followUpMatcher = buttonPattern.matcher(FutureFollowUpButtonText);
	    Matcher CalibrationMatcher= buttonPattern.matcher(PendingCalibrationButtonText);

	    if (TodayFollowUpButtonText.isEmpty() || !psfMatcher.find()) {
	    	System.out.println("No data available for Today Follow Up button.");
	        Assert.fail("No data available for Today Follow Up button.");
	    } else {
	    	TodayFollowUpCount = Integer.parseInt(psfMatcher.group(1));
	        System.out.println("Extracted Today Follow Up button count: " + TodayFollowUpCount);
	    }

	    if (FutureFollowUpButtonText.isEmpty() || !followUpMatcher.find()) {
	    	System.out.println("No data available for Future Follow Up button.");
	        Assert.fail("No data available for Future Follow Up button.");
	    } else {
	    	FutureFollowUpCount = Integer.parseInt(followUpMatcher.group(1));
	        System.out.println("Extracted Future Followup count: " + FutureFollowUpCount);
	    }
	    
	    if (PendingCalibrationButtonText.isEmpty() || !CalibrationMatcher.find()) {
	    	System.out.println("No data available for Pending Calibration button.");
	        Assert.fail("No data available for Pending Calibration button.");
	    } else {
	    	PendingCalibrationCount = Integer.parseInt(CalibrationMatcher.group(1));
	        System.out.println("Extracted Pending Calibration count: " + PendingCalibrationCount);
	    }
	    

	    // Sum the numbers from the buttons
	    int sumOfLeftButtonsNumbers = TodayFollowUpCount + FutureFollowUpCount + PendingCalibrationCount;
	    System.out.println("Sum of three Left buttons of PSF Done Tab- 'Today Follow Up', 'Future Follow Up' and 'Pending Calibration' buttons is: " + sumOfLeftButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfLeftButtonsNumbers, totalLeads, "The Sum of left button of PSF Tab- 'Today Follow Up', 'Future Followup' and 'Pending Calibration' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	

	@Test(priority = 55)
	public void PSFDone_Right_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(2000);
	    WebElement PSFDoneTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[5]"));

	    // Get the text from the element
	    String PSFDoneText = PSFDoneTab.getText();
	    System.out.println("Full Text of PSF Done Tab: " + PSFDoneText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(PSFDoneText);
	    int totalLeads = 0;
	    if (PSFDoneText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for PSF Done tab.");
	        Assert.fail("No data available for PSF Done tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from PSF Done Tab: " + totalLeads);
	    }

	    // Extract numbers from the two buttons
	    WebElement BotAndWeblinkButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[16]"));
	    WebElement CCEIdentifiedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[17]"));
	    
	    String BotAndWeblinkButtonText = BotAndWeblinkButton.getText();
	    String CCEIdentifiedButtonText = CCEIdentifiedButton.getText();
	    
	    System.out.println("Text of BOT and Weblink button: " + BotAndWeblinkButtonText);
	    System.out.println("Text of CCE Identified button: " + CCEIdentifiedButtonText);
	    
	    int BotAndWeblinkCount = 0;
	    int CCEIdentifiedCount = 0;
	    
	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher botMatcher = buttonPattern.matcher(BotAndWeblinkButtonText);
	    Matcher CCEMatcher = buttonPattern.matcher(CCEIdentifiedButtonText);
	    
	    if (BotAndWeblinkButtonText.isEmpty() || !botMatcher.find()) {
	    	System.out.println("No data available for BOT and Weblink button.");
	        Assert.fail("No data available for BOT and Weblink button.");
	    } else {
	    	BotAndWeblinkCount = Integer.parseInt(botMatcher.group(1));
	        System.out.println("Extracted BOT and Weblink button count: " + BotAndWeblinkCount);
	    }

	    if (CCEIdentifiedButtonText.isEmpty() || !CCEMatcher.find()) {
	    	System.out.println("No data available for CCE Identified button.");
	        Assert.fail("No data available for CCE Identified button.");
	    } else {
	    	CCEIdentifiedCount = Integer.parseInt(CCEMatcher.group(1));
	        System.out.println("Extracted CCE Identified count: " + CCEIdentifiedCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfRightButtonsNumbers = BotAndWeblinkCount + CCEIdentifiedCount;
	    System.out.println("Sum of two Right buttons of PSF Done Tab- 'BOT and Weblink' and 'CCE Identified' is: " + sumOfRightButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfRightButtonsNumbers, totalLeads, "The Sum of Right buttons of PSF Tab- 'BOT and Weblink' and 'CCE Identified' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
	@Test(priority = 56)
	public void Verify_PSFDoneTab_TodayFollowUpButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement TodayFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		TodayFollowUpButton.click();

		// Get the text from the element
		String TodayFollowUpButton_Text = TodayFollowUpButton.getText();
		System.out.println("Full Text of 'Today Follow Up' Button: " + TodayFollowUpButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(TodayFollowUpButton_Text);
		String extractedNumber_TodayFollowUp = null;
		if (TodayFollowUpButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Today Follow Up' button.");
	        Assert.fail("No data available for 'Today Follow Up' button.");
	    } else {
	    	extractedNumber_TodayFollowUp = matcher.group(1);
	        System.out.println("Extracted Number from 'Today Follow Up' button text: " + extractedNumber_TodayFollowUp);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(3000);   
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
		Assert.assertEquals(extractedNumber_TodayFollowUp, extractedNumber_Pagination, "Number does not matches in 'Today Follow Up' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 57)
	public void Verify_PSFDoneTab_FutureFollowUpButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement FutureFollowUpButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		FutureFollowUpButton.click();

		// Get the text from the element
		String FutureFollowUpButton_Text = FutureFollowUpButton.getText();
		System.out.println("Full Text of 'Future Follow Up' Button: " + FutureFollowUpButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(FutureFollowUpButton_Text);
		String extractedNumber_FutureFollowUp = null;
		if (FutureFollowUpButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Future Follow Up' button.");
	        Assert.fail("No data available for 'Future Follow Up' button.");
	    } else {
	    	extractedNumber_FutureFollowUp = matcher.group(1);
	        System.out.println("Extracted Number from 'Future Follow Up' button text: " + extractedNumber_FutureFollowUp);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(3000);   
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
		Assert.assertEquals(extractedNumber_FutureFollowUp, extractedNumber_Pagination, "Number does not matches in 'Future Follow Up' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 58)
	public void Verify_PSFDoneTab_PendingCalibrationButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement PendingCalibrationButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[15]"));
		PendingCalibrationButton.click();

		// Get the text from the element
		String PendingCalibrationButton_Text = PendingCalibrationButton.getText();
		System.out.println("Full Text of 'Pending Calibration' Button: " + PendingCalibrationButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(PendingCalibrationButton_Text);
		String extractedNumber_PendingCalibration = null;
		if (PendingCalibrationButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Pending Calibration' button.");
	        Assert.fail("No data available for 'Pending Calibration' button.");
	    } else {
	    	extractedNumber_PendingCalibration = matcher.group(1);
	        System.out.println("Extracted Number from 'Pending Calibration' button text: " + extractedNumber_PendingCalibration);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(3000);   
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
		Assert.assertEquals(extractedNumber_PendingCalibration, extractedNumber_Pagination, "Number does not matches in 'Pending Calibration' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 59)
	public void Verify_PSFDoneTab_BotAndWeblinkButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement BotAndWeblinkButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[16]"));
		BotAndWeblinkButton.click();

		// Get the text from the element
		String BotAndWeblinkButton_Text = BotAndWeblinkButton.getText();
		System.out.println("Full Text of 'Bot And Weblink' Button: " + BotAndWeblinkButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(BotAndWeblinkButton_Text);
		String extractedNumber_BotAndWeblink = null;
		if (BotAndWeblinkButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Bot And Weblink' button.");
	        Assert.fail("No data available for 'Bot And Weblink' button.");
	    } else {
	    	extractedNumber_BotAndWeblink = matcher.group(1);
	        System.out.println("Extracted Number from 'Bot And Weblink' button text: " + extractedNumber_BotAndWeblink);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(3000);   
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
		Assert.assertEquals(extractedNumber_BotAndWeblink, extractedNumber_Pagination, "Number does not matches in 'Bot And Weblink' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 60)
	public void Verify_PSFDoneTab_CCEIdentifiedButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement CCEIdentifiedButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[17]"));
		CCEIdentifiedButton.click();

		// Get the text from the element
		String CCEIdentifiedButton_Text = CCEIdentifiedButton.getText();
		System.out.println("Full Text of 'CCE Identified' Button: " + CCEIdentifiedButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(CCEIdentifiedButton_Text);
		String extractedNumber_CCEIdentified = null;
		if (CCEIdentifiedButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'CCE Identified' button.");
	        Assert.fail("No data available for 'CCE Identified' button.");
	    } else {
	    	extractedNumber_CCEIdentified = matcher.group(1);
	        System.out.println("Extracted Number from 'CCE Identified' button text: " + extractedNumber_CCEIdentified);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_CCEIdentified, extractedNumber_Pagination, "Number does not matches in 'CCE Identified' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 61)
	public void ClickOnNonResponsive_Tab() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement NonResponsive = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[6]"));
		NonResponsive.click();
		Thread.sleep(6000);
	}
//.........................................................................
	
	@Test(priority = 62)
	public void NonResponsive_Numbers_Match() throws InterruptedException {

		Thread.sleep(3000);
		WebElement NonResponsiveTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[6]"));

		// Get the text from the element
		String NonResponsive_Text = NonResponsiveTab.getText();
		System.out.println("Full Text of Non Responsive tab: " + NonResponsive_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile("\\((\\d+)\\)");
		Matcher matcher = pattern.matcher(NonResponsive_Text);
		String extractedNumber_NonResponsive = null;
		if (NonResponsive_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for Non Responsive tab.");
	        Assert.fail("No data available for Non Responsive tab.");
	    } else {
	    	extractedNumber_NonResponsive = matcher.group(1);
	        System.out.println("Extracted Number from Non Responsive tab text: " + extractedNumber_NonResponsive);
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
		Assert.assertEquals(extractedNumber_NonResponsive, extractedNumber_Pagination, "Number does not matches in Non Responsive tab and in its Pagination ");
	}
//...................................................................................................................................................................
	@Test(priority = 63)
	public void Verify_NonResponsive_Buttons_Sum_Match() throws InterruptedException {
	    Thread.sleep(4000);
	    WebElement NonResponsiveTab = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[6]"));

	    // Get the text from the element
	    String NonResponsiveText = NonResponsiveTab.getText();
	    System.out.println("Full Text of Non Responsive Tab: " + NonResponsiveText);

	    // Extract the total number from the tab
	    Pattern pattern = Pattern.compile("\\((\\d+)\\)");
	    Matcher matcher = pattern.matcher(NonResponsiveText);
	    int totalLeads = 0;
	    if (NonResponsiveText.isEmpty() || !matcher.find()) {
	    	System.out.println("No data available for Non Responsive tab.");
	        Assert.fail("No data available for Non Responsive tab.");
	    } else {
	        totalLeads = Integer.parseInt(matcher.group(1));
	        System.out.println("Total leads from Non Responsive Tab: " + totalLeads);
	    }

	    // Extract numbers from the Four buttons
	    WebElement WrongNumberButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
	    WebElement NotInterestedLeadsButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
	    WebElement NonResponsiveButton= driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
	    WebElement InvalidNumberButton= driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
	    

	    String WrongNumberButtonText = WrongNumberButton.getText();
	    String NotInterestedLeadsButtonText = NotInterestedLeadsButton.getText();
	    String NonResponsiveButtonText = NonResponsiveButton.getText();
	    String InvalidNumberButtonText = InvalidNumberButton.getText();
	    
	    
	    System.out.println("Text of Wrong Number button: " + WrongNumberButtonText);
	    System.out.println("Text of Not Interested Leads button: " + NotInterestedLeadsButtonText);
	    System.out.println("Text of Non Responsive button: " + NonResponsiveButtonText);
	    System.out.println("Text of Invalid Number button: " + InvalidNumberButtonText);
	    

	    int WrongNumberCount = 0;
	    int NotInterestedLeadsCount = 0;
	    int NonResponsiveCount = 0;
	    int InvalidNumberCount = 0;

	    // Extract numbers from button texts
	    Pattern buttonPattern = Pattern.compile(":\\s*(\\d+)");
	    Matcher WrongMatcher = buttonPattern.matcher(WrongNumberButtonText);
	    Matcher NotInterestedMatcher = buttonPattern.matcher(NotInterestedLeadsButtonText);
	    Matcher NonResponsiveMatcher= buttonPattern.matcher(NonResponsiveButtonText);
	    Matcher InvalidMatcher= buttonPattern.matcher(InvalidNumberButtonText);
	    

	    if (WrongNumberButtonText.isEmpty() || !WrongMatcher.find()) {
	    	System.out.println("No data available for Wrong Number button.");
	        Assert.fail("No data available for 'Wrong Number' button.");
	    } else {
	    	WrongNumberCount = Integer.parseInt(WrongMatcher.group(1));
	        System.out.println("Extracted 'Wrong Number' button count: " + WrongNumberCount);
	    }

	    if (NotInterestedLeadsButtonText.isEmpty() || !NotInterestedMatcher.find()) {
	    	System.out.println("No data available for Not Interested Leads button.");
	        Assert.fail("No data available for 'Not Interested Leads' button.");
	    } else {
	    	NotInterestedLeadsCount = Integer.parseInt(NotInterestedMatcher.group(1));
	        System.out.println("Extracted 'Not Interested Leads' button count: " + NotInterestedLeadsCount);
	    }
	    
	    if (NonResponsiveButtonText.isEmpty() || !NonResponsiveMatcher.find()) {
	    	System.out.println("No data available for 'Non Responsive' button.");
	        Assert.fail("No data available for 'Non Responsive' button.");
	    } else {
	    	NonResponsiveCount = Integer.parseInt(NonResponsiveMatcher.group(1));
	        System.out.println("Extracted 'Non Responsive' count: " + NonResponsiveCount);
	    }
	    
	    if (InvalidNumberButtonText.isEmpty() || !InvalidMatcher.find()) {
	    	System.out.println("No data available for 'Invalid Number' button.");
	        Assert.fail("No data available for 'Invalid Number' button.");
	    } else {
	    	InvalidNumberCount = Integer.parseInt(InvalidMatcher.group(1));
	        System.out.println("Extracted 'Invalid Number' count: " + InvalidNumberCount);
	    }
	    
	    // Sum the numbers from the buttons
	    int sumOfButtonsNumbers = WrongNumberCount + NotInterestedLeadsCount + NonResponsiveCount + InvalidNumberCount;
	    System.out.println("Sum of four buttons of 'Non Responsive PSF' Tab- 'Wrong Number', 'Not Interested Leads', 'Non Responsive' and 'Invalid Number' buttons is: " + sumOfButtonsNumbers);

	    // Compare the sum with the total number from the tab
	    Assert.assertEquals(sumOfButtonsNumbers, totalLeads, "The Sum of button of 'Non Responsive' tab- 'Wrong Number', 'Not Interested Leads', 'Non Responsive' and 'Invalid Number' does not match the total leads in the tab text.");
	}	
//........................................................................................................................................................	
	@Test(priority = 64)
	public void Verify_NonResponsivePSFTab_WrongNumberButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement WrongNumberButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[11]"));
		WrongNumberButton.click();

		// Get the text from the element
		String WrongNumberButton_Text = WrongNumberButton.getText();
		System.out.println("Full Text of 'Wrong Number' Button: " + WrongNumberButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(WrongNumberButton_Text);
		String extractedNumber_WrongNumber = null;
		if (WrongNumberButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Wrong Number' button.");
	        Assert.fail("No data available for 'Wrong Number' button.");
	    } else {
	    	extractedNumber_WrongNumber = matcher.group(1);
	        System.out.println("Extracted Number from 'Wrong Number' button text: " + extractedNumber_WrongNumber);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(3000);   
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
		Assert.assertEquals(extractedNumber_WrongNumber, extractedNumber_Pagination, "Number does not matches in 'Wrong Number' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 65)
	public void Verify_NonResponsivePSFTab_NotInterestedLeadsButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement NotInterestedLeadsButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[12]"));
		NotInterestedLeadsButton.click();

		// Get the text from the element
		String NotInterestedLeadsButton_Text = NotInterestedLeadsButton.getText();
		System.out.println("Full Text of 'Not Interested Leads' Button: " + NotInterestedLeadsButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(NotInterestedLeadsButton_Text);
		String extractedNumber_NotInterestedLeads = null;
		if (NotInterestedLeadsButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Not Interested Leads' button.");
	        Assert.fail("No data available for 'Not Interested Leads' button.");
	    } else {
	    	extractedNumber_NotInterestedLeads = matcher.group(1);
	        System.out.println("Extracted Number from 'Not Interested Leads' button text: " + extractedNumber_NotInterestedLeads);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(3000);   
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
		Assert.assertEquals(extractedNumber_NotInterestedLeads, extractedNumber_Pagination, "Number does not matches in 'Not Interested Leads' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 66)
	public void Verify_NonResponsivePSFTab_NonResponsiveButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement NonResponsiveButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[13]"));
		NonResponsiveButton.click();

		// Get the text from the element
		String NonResponsiveButton_Text = NonResponsiveButton.getText();
		System.out.println("Full Text of 'Non Responsive' Button: " + NonResponsiveButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(NonResponsiveButton_Text);
		String extractedNumber_NonResponsive = null;
		if (NonResponsiveButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Non Responsive' button.");
	        Assert.fail("No data available for 'Non Responsive' button.");
	    } else {
	    	extractedNumber_NonResponsive = matcher.group(1);
	        System.out.println("Extracted Number from 'Non Responsive' button text: " + extractedNumber_NonResponsive);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(3000);   
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
		Assert.assertEquals(extractedNumber_NonResponsive, extractedNumber_Pagination, "Number does not matches in 'Non Responsive' button and in its Pagination");
	}
//...................................................................................................................................................................
	@Test(priority = 67)
	public void Verify_NonResponsivePSFTab_InvalidNumberButton_Pagination() throws InterruptedException {
		Thread.sleep(6000);
		WebElement InvalidNumberButton = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[14]"));
		InvalidNumberButton.click();

		// Get the text from the element
		String InvalidNumberButton_Text = InvalidNumberButton.getText();
		System.out.println("Full Text of 'Invalid Number' Button: " + InvalidNumberButton_Text);

		// Extract the numeric value using regular expressions
		Pattern pattern = Pattern.compile(":\\s*(\\d+)");
		Matcher matcher = pattern.matcher(InvalidNumberButton_Text);
		String extractedNumber_InvalidNumber = null;
		if (InvalidNumberButton_Text.isEmpty() || !matcher.find()) {
	        System.out.println("No data available for 'Invalid Number' button.");
	        Assert.fail("No data available for 'Invalid Number' button.");
	    } else {
	    	extractedNumber_InvalidNumber = matcher.group(1);
	        System.out.println("Extracted Number from 'Invalid Number' button text: " + extractedNumber_InvalidNumber);
	    }
		// .............................Item per page numbers...........................................................
		Thread.sleep(2000);   
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
		Assert.assertEquals(extractedNumber_InvalidNumber, extractedNumber_Pagination, "Number does not matches in 'Invalid Number' button and in its Pagination");
	}
//...................................................................................................................................................................

}
