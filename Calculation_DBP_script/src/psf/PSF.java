package psf;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PSF {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        try {
		            // Navigate to the URL
		            driver.get("https://psfcrm.dealercrm.co.in/");
		            // Log into the application
		            driver.findElement(By.id("username")).sendKeys("190302CCM00003");
		            driver.findElement(By.id("password")).sendKeys("Raghunath@123#");
		            driver.findElement(By.id("loginButton")).click();

		            // Wait for the page to load
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someElementAfterLogin")));

		            // Apply filters and verify response
		            applyAndVerifyFilter(driver, wait, "Service Type", "desiredServiceType");
		            applyAndVerifyFilter(driver, wait, "Workshop", "desiredWorkshop");
		            applyAndVerifyFilter(driver, wait, "CCE Name", "desiredCCEName");
		            applyAndVerifyFilter(driver, wait, "Channel filter", "desiredChannel");

		            // Verify numbers on tabs
		            verifyTabNumbers(driver, wait, "Todays Due PSF", 101); // Replace 10 with the expected number
		            verifyTabNumbers(driver, wait, "Pending PSF & Followup", 5839); // Replace 5 with the expected number
		            verifyTabNumbers(driver, wait, "Follow Up PSF", 177); // Replace 15 with the expected number

		            // Verify side filters
		            applyAndVerifySideFilter(driver, wait, "Technician name", "desiredTechnician");
		            applyAndVerifySideFilter(driver, wait, "Fuel Type", "desiredFuelType");
		            applyAndVerifySideFilter(driver, wait, "Vehicle Type", "desiredVehicleType");

		        } finally {
		            // Quit the driver
		            driver.quit();
		        }
		    }

		    private static void applyAndVerifyFilter(WebDriver driver, WebDriverWait wait, String filterName, String filterValue) {
		        // Locate and apply the filter
		        WebElement filterElement = driver.findElement(By.id("mat-select-value-1" + filterName));
		        filterElement.click();
		        WebElement filterCheckbox = driver.findElement(By.xpath("//label[contains(text(),'" + filterValue + "')]/preceding-sibling::input"));
		        filterCheckbox.click();

		        // Wait for the filter to apply and fetch the response
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("filter-response")));
		        WebElement responseElement = driver.findElement(By.id("filter-response"));
		        String response = responseElement.getText();

		        // Verify the response
		        if (response.contains(filterValue)) {
		            System.out.println(filterName + " filter applied successfully.");
		        } else {
		            System.err.println(filterName + " filter failed.");
		        }
		    }

		    private static void verifyTabNumbers(WebDriver driver, WebDriverWait wait, String tabName, int expectedNumber) {
		        // Locate the tab and fetch the number
		        WebElement tabElement = driver.findElement(By.id("tab-" + tabName));
		        String tabNumberText = tabElement.getText();
		        int tabNumber = Integer.parseInt(tabNumberText);

		        // Verify the number
		        if (tabNumber == expectedNumber) {
		            System.out.println(tabName + " tab number is correct.");
		        } else {
		            System.err.println(tabName + " tab number is incorrect. Expected: " + expectedNumber + ", Found: " + tabNumber);
		        }
		    }

		    private static void applyAndVerifySideFilter(WebDriver driver, WebDriverWait wait, String filterName, String filterValue) {
		        // Locate and apply the side filter
		        WebElement filterElement = driver.findElement(By.id("side-filter-" + filterName));
		        filterElement.click();
		        WebElement filterCheckbox = driver.findElement(By.xpath("//label[contains(text(),'" + filterValue + "')]/preceding-sibling::input"));
		        filterCheckbox.click();

		        // Wait for the filter to apply and fetch the response
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("side-filter-response")));
		        WebElement responseElement = driver.findElement(By.id("side-filter-response"));
		        String response = responseElement.getText();

		        // Verify the response
		        if (response.contains(filterValue)) {
		            System.out.println(filterName + " side filter applied successfully.");
		        } else {
		            System.err.println(filterName + " side filter failed.");
		        }
		    
		}}

///////////////////////////////////////////////////////////////////////////////

	


