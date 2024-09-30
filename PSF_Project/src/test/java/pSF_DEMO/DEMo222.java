package pSF_DEMO;

import java.time.Duration;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMo222 {

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
						.findElements(By.xpath("//*[contains(text(),\"" + filterText + "\")]"));
				
				System.out.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());

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
}
