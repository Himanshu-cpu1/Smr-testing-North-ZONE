package Dev_Psf_code;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_PSF_Dev_Code {

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

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

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
	public void Service_Type() throws InterruptedException { // Seelect all the Fillter Option

		String[] filters = { "PAID SEREVICE", "RR", "FR3", "BANDP", "FR1", "FR2", "WASH", "WMOS", "SC" };
		for (String filter : filters) {
			applyFilter(filter);
		}
	}
	// This method is to Select the Fillter

	private void applyFilter(String filterText) throws InterruptedException {
		WebElement filterDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
		filterDropdown.click();

		// Retry mechanism to handle cases where options may not be immediately
		// available
		boolean filterSelected = false;
		for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
			try {
				List<WebElement> options = wait.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
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

		if (!filterSelected) {
			Assert.fail("Failed to select filter: " + filterText);
		}

		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

		WebElement page = driver.findElement(By.cssSelector("[class=\"mat-select-arrow ng-tns-c136-29\"]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(page).perform();

		Thread.sleep(3000);
		WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
		itemsPerPage.click();

		Thread.sleep(2000);

		List<String> results = new ArrayList<>();
		List<String> errors = new ArrayList<>();
		boolean isNextPageClickable = true;
		int pageNumber = 0;

		while (isNextPageClickable) {
			try {
				List<WebElement> dataElements = driver
						.findElements(By.xpath("//*[contains(text(),\"" + filterText + " \")]"));

				System.out
						.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());

				boolean pageContainsFilterText = !dataElements.isEmpty();
				if (pageContainsFilterText) {
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
				nextPage.click();

				if (dataElements.size() < 100) {
					break;
				}
			} catch (Exception e) {
				errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
			}
			pageNumber++;
		}

		removeFilter(filterText);

		if (!errors.isEmpty()) {
			Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
		}

		Thread.sleep(2000);
	}

	// This method is to remove the Fillter

	private void removeFilter(String filterText) throws InterruptedException {
		Thread.sleep(3000);
		WebElement filterDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
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

		Thread.sleep(2000);
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Test(priority = 8)
	public void Workshop_FILLTER() throws InterruptedException {
		String[] filters = { "NARAINA INDUSTRIAL AREA-SRV" };

		SoftAssert softAssert = new SoftAssert();

		for (String filter : filters) {
			applyFilter2(filter, softAssert);
		}

		softAssert.assertAll(); // Report all collected errors at the end of the test
	}

	// This method is to select the filter
	private void applyFilter2(String filterText, SoftAssert softAssert) throws InterruptedException {
		WebElement filterDropdown = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-3\"]")));
		filterDropdown.click();

		boolean filterSelected = false;
		for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
			try {
				List<WebElement> options = wait.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class=\"mat-option-text\"])[2]")));
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
		int pageNumber = 0;

		while (isNextPageClickable) {
			try {
				List<WebElement> dataElements = driver.findElements(By.xpath("//*[text()=\" " + filterText + "\"]"));

				System.out
						.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());

				boolean pageContainsFilterText = !dataElements.isEmpty();
				if (pageContainsFilterText) {
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

		for (String error : errors) {
			softAssert.fail("Error for filter '" + filterText + "' - " + error);
		}

		Thread.sleep(2000);
	}

	// This method is to remove the filter
	private void removeFilter1(String filterText) throws InterruptedException {
		Thread.sleep(3000);
		WebElement filterDropdown = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-3\"]")));
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

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 9)
	public void CCE_Name_FILTER() throws InterruptedException {
		String[] filters = { "Morish Kapoor" };
		SoftAssert softAssert = new SoftAssert();

		for (String filter : filters) {
			applyFilter11(filter, softAssert);
		}

		softAssert.assertAll(); // Report all collected errors at the end of the test
	}
	

	private void applyFilter11(String filterText, SoftAssert softAssert) throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement filterDropdown = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-7\"]")));
		filterDropdown.click();

		boolean filterSelected = selectFilterOption(filterText, wait1);

		softAssert.assertTrue(filterSelected, "Failed to select filter: " + filterText);

		if (!filterSelected) {
			return; // Skip the rest of the process if filter selection failed
		}

		setItemsPerPage(wait1);
		List<String> errors = new ArrayList<>();
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

	// ..................................setItemsper
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

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]")));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on Date Filter
		WebElement DateFilter = driver
				.findElement(By.xpath("(//*[@class=\"mat-expansion-panel-header-title ng-tns-c166-31\"])"));
		DateFilter.click();
		Thread.sleep(3000);

		// click on Date of Sale Filter
		WebElement DateOfSale = driver
				.findElement(By.xpath("(//*[@class=\"mat-expansion-panel-header-title ng-tns-c166-33\"])"));
		DateOfSale.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-form-field-infix ng-tns-c67-34\"])")).click();
		Thread.sleep(2000);

		// select date from start date calendar
		// Select the year- start date
		driver.findElement(
				By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])"))
				.click();
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
		driver.findElement(By.xpath("(//*[@class=\"mat-form-field-infix ng-tns-c67-35\"])")).click();
		Thread.sleep(2000);

		// select year-end date
		driver.findElement(
				By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();
		Thread.sleep(3000);

		// select month-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[8]")).click();

		// Select the day- start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[31]"))
				.click();

		// click on arrow to close additional filter tab.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-focus-indicator clos-btn-right mat-button mat-button-base\"])"))
				.click();

		String startdate = "01-Jan-2022";
		String enddate = "31-Aug-2022";

		// ....................... Scroll down.....................................
		Actions scrollAction = new Actions(driver);
		scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);

		// ..............................Click on Item Per
		// Page.........................................
		WebElement itemsPerPage = driver.findElement(By.cssSelector("[class=\"mat-select-arrow ng-tns-c136-29\"]"));
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
		}

		if (testFailed) {
			Assert.fail("One or more dates of sale were found outside the specified date range.");
		}
	}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@SuppressWarnings("unused")
	@Test(priority = 13)
	public void JCBillDateFilter() throws ParseException, InterruptedException {
		// Locate the date filter elements and apply the date range
		Thread.sleep(4000);

		// refresh the page
				WebElement Refresh = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();

		Thread.sleep(10000);

		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]")));
		AdditionFilter.click();
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
		driver.findElement(
				By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])"))
				.click();
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
		WebElement itemsPerPage = driver
				.findElement(By.xpath("(//*[@class=\"mat-form-field-wrapper ng-tns-c67-26\"])"));
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
//...................................................................................................	    
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dateCells = driver.findElements(By.xpath(
					"//td[@class='mat-cell cdk-cell cdk-column-jCbillDate mat-column-jCbillDate ng-star-inserted']/span"));
			// Pattern to split the dates by <br> or <br_ngcontent-omw-c207>
			
			Pattern pattern = Pattern.compile("\\s*<br.*?>\\s*");

			// Log the size of "Sale Date" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of JC Bill Date: " + dateCells.size());

			boolean pageContainsSaleDate = !dateCells.isEmpty();
//..............................................................................................
			// Add "Sale Date" data to the results list
			if (pageContainsSaleDate) {
				// Process each <td> element to extract and validate dates
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
		}

		if (testFailed) {
			Assert.fail("One or more dates of sale were found outside the specified date range.");
		}
		 Thread.sleep(2000);
	}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

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
			}
		}

		if (testFailed) {
			Assert.fail("One or more PSF Due dates were found outside the specified date range.");
		}
		 Thread.sleep(2000);
	}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings({ "unused" })
	@Test(priority = 15)
	public void LastCallDateFilter() throws ParseException, InterruptedException {
		// refresh the page
		
				WebElement Refresh = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();

		Thread.sleep(10000);

		WebElement Non_Responsive = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[6]")));
		Non_Responsive.click();

		Thread.sleep(2000);

		WebElement AdditionFilter = driver
				.findElement(By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]"));
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
		driver.findElement(
				By.xpath("(//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"])"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[1]")).click();
		Thread.sleep(3000);

		// select month-end date
		driver.findElement(By.xpath("(//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"])[10]"))
				.click();

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
		}

		if (testFailed) {
			Assert.fail("One or more Last Call Date were found outside the specified date range.");
		}
		 Thread.sleep(2000);
	}
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 16)
	public void ServiceAdvisorNameFilter() throws ParseException, InterruptedException {
		// Locate the filter elements.
		Thread.sleep(2000);

		// refresh the page
				WebElement Refresh = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
				Refresh.click();

		Thread.sleep(10000);
		WebElement TotalPSFDue = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"tab\"])[1]")));
		TotalPSFDue.click();

		// Locate the date filter elements and apply the date range
		Thread.sleep(3000);

		// click on Additional Filter
		WebElement AdditionFilter = driver
				.findElement(By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]"));
		AdditionFilter.click();
		Thread.sleep(3000);

		// click on SA Name filter
		WebElement SAName = driver.findElement(By.id("mat-expansion-panel-header-7"));
		SAName.click();
		Thread.sleep(2000);

//		    //select first "SA NAme" option
		WebElement SAName1 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" BHOLE SHANKER \")]")));
		SAName1.click();
		Thread.sleep(1000);

//		    //select second "SA NAme" option
		WebElement SAName2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" SHASHI KANT \")]")));
		SAName2.click();
		Thread.sleep(1000);

		// select third "SA NAme" option
		WebElement SAName3 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" MATBAR SINGH \")]")));
		SAName3.click();
		Thread.sleep(1000);

		// select forth "SA NAme" option
		WebElement SAName4 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" SANJAY KUMAR \")]")));
		SAName4.click();
		Thread.sleep(1000);

		// select fifth "SA NAme" option
		WebElement SAName5 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" DEEPAK RANA \")]")));
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

		// ..............................Click on Item Per
		// Page.........................................
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
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath(
					"//td[text()=' BHOLE SHANKER ' or text()=' SHASHI KANT ' or text()=' MATBAR SINGH ' or text()=' SANJAY KUMAR ' or text()=' DEEPAK RANA ']"));

			// Log the size of "Specified SA Name" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified SA Name: " + dataElements.size());

			boolean pageContainsSpecifiedTexts = false;

			boolean pageContainsSAName = !dataElements.isEmpty();
			// Add "SA Name" data to the results list
			if (pageContainsSAName) {
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
			Thread.sleep(3000);
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
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\" PRV \")]"));

			// Log the size of "PRV" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of PRV: " + dataElements.size());

			boolean pageContainsPRV = !dataElements.isEmpty();
			// Add "BANDP" data to the results list
			if (pageContainsPRV) {
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
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data
			List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\" COM \")]"));

			// Log the size of "COM" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of COM Vehicle Type: " + dataElements.size());

			boolean pageContainsCOM = !dataElements.isEmpty();
			// Add "COM" data to the results list
			if (pageContainsCOM) {
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
		Thread.sleep(2000);
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
		WebElement AdditionFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//*[@class=\"mat-icon notranslate material-icons mat-icon-no-color\"])[5]")));
		AdditionFilter.click();
		Thread.sleep(2000);

		// click on Model filter
		WebElement Model = driver.findElement(By.xpath("(//*[@role=\"button\"])[20]"));
		Model.click();
		Thread.sleep(2000);

//			    //select first "Model" option
		WebElement Model1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" WagonR \")]")));
		Model1.click();
		Thread.sleep(1000);

//			    //select second "Model" option
		WebElement Model2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" NEW SWIFT \")]")));
		Model2.click();
		Thread.sleep(1000);
//			    
//			  //select third "Model" option
		WebElement Model3 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" NEW BALENO \")]")));
		Model3.click();
		Thread.sleep(1000);
//			  
//			  //select forth "Model" option
		WebElement Model4 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" Ignis \")]")));
		Model4.click();
		Thread.sleep(1000);
//			    
//			  //select fifth "Model" option
		WebElement Model5 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \" CIAZ \")]")));
		Model5.click();
		Thread.sleep(1000);

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
		// Prepare to collect results and status for "Specified Model Name" on each page
		List<String> expectedTexts = Arrays.asList("WagonR", "NEW SWIFT", "NEW BALENO", "Ignis", "CIAZ");

		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is click-able
		boolean isNextPageClickable = true;

		int pageNumber = 0; // Track the current page number
		// ...................................................................................................
		while (isNextPageClickable) {
			// Collect all elements representing the filtered data

			List<WebElement> dataElements = driver.findElements(By.xpath(
					"//td[text()=' WagonR ' or text()=' NEW SWIFT ' or text()=' NEW BALENO ' or text()=' Ignis ' or text()=' CIAZ ']"));

			// Log the size of "Specified SA Name" on each page
			System.out.println("Page " + (pageNumber + 1) + " - Size of Specified Model Name: " + dataElements.size());

			boolean pageContainsSpecifiedTexts = false;

			boolean pageContainsModelName = !dataElements.isEmpty();
			// Add "SA Name" data to the results list
			if (pageContainsModelName) {
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
		}
		Thread.sleep(3000);
	}

//	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Test(priority = 20)
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

		// Prepare to collect results and status for "PSF Due Date" on each page
		List<String> results = new ArrayList<>();

		// Initialize the variable to track if the next page button is clickable
		boolean isNextPageClickable = true;
		boolean testFailed = false;
		boolean dataFound = false;
		int pageNumber = 0; // Track the current page number
		

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

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     
	@AfterClass
	public void tearsDown() {
		driver.quit();
	}
}
