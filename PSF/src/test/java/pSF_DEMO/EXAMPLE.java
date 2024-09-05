package pSF_DEMO;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EXAMPLE {
	
	 public static WebDriver driver;
	    public WebDriverWait wait;

	    @BeforeClass
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://dev.psfcrm.autovyn.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
//.....................................................................................................
	    
	    @Test(priority = 1)
	    public void Username() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
	        username.sendKeys("081001CCM00001");
	        Thread.sleep(1000);
	    }
//.......................................................................................................
	    
	    @Test(priority = 2)
	    public void Password() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
	        password.sendKeys("Maruti@123");
	        Thread.sleep(1000);
	    }
//...................................................................................................
	    @Test(priority = 3)
	    public void Login_Button() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	        WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
	        loginButton.click();
	        Thread.sleep(3000);
	    }
//...................................................................................................
	    @Test(priority = 4)
	    public void Click_On_PSF() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	        WebElement PSF = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POST SERVICE FEEDBACK(PSF)\")]")));
	        PSF.click();
	        Thread.sleep(3000);
	        
	        String expectedURL = "https://dev.psfcrm.autovyn.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0";
	        wait.until(ExpectedConditions.urlToBe(expectedURL));
	        String currentURL = driver.getCurrentUrl();
	        System.out.println("currentURL = " + currentURL);
	        Assert.assertEquals(expectedURL, currentURL);
	        Thread.sleep(3000);
	    }
//..................................................................................................
	    @Test(priority = 5)
	    public void Click_On_the_PSF_Follow_List() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	        WebElement followList = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"PSF Follow Up List\")])[2]")));
	        followList.click();
	        Thread.sleep(3000);
	        
	        String expectedURL = "https://dev.psfcrm.autovyn.in/psf/psf-calling-list?callingTab=0";
	        wait.until(ExpectedConditions.urlToBe(expectedURL));
	        String currentURL = driver.getCurrentUrl();
	        System.out.println("currentURL = " + currentURL);
	        Assert.assertEquals(expectedURL, currentURL);
	        Thread.sleep(3000);
	    }
//.................................................................................................
	    
		@Test(priority = 6)
		public void Total_PSF_Due_Numbers_Match() throws InterruptedException {

			WebElement Total = driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[1]"));

			// Get the text from the element
			String text1 = Total.getText();
			
			// Extract the number from the text
			String textB2 = text1.replaceAll("[^0-9]", ""); // Remove spaces between digits
	 				
			System.out.println("textB2 = " + textB2);
			
// ........................Item per page..numbers...........

			WebElement totalCountElement = driver.findElement(By.cssSelector("[class=\"mat-paginator-range-label\"]"));
			// Get the text from the element
			String text2 = totalCountElement.getText();
			
			String textB1 = text2.substring(text2.lastIndexOf(" ") + 1);
	        System.out.println(" textB1 : " + textB1);
			
			Assert.assertEquals(textB2, textB1, "Numbers does not matches in Total PSF Due ");

			Thread.sleep(2000);
		}
//................................................................................................
		
//		 @Test(priority = 7)
//		    public void CCE_Name_FILTER() throws InterruptedException {
//			 String[] filters = {"Morish Kapoor"};
//		        SoftAssert softAssert = new SoftAssert();
//
//		        for (String filter : filters) {
//		            applyFilter1(filter, softAssert);
//		        }
//
//		        softAssert.assertAll(); // Report all collected errors at the end of the test
//		    }
//
//		    // This method is to select the filter
//		    private void applyFilter1(String filterText, SoftAssert softAssert) throws InterruptedException {
//		        WebElement filterDropdown = wait.until(ExpectedConditions
//		                .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-7\"]")));
//		        filterDropdown.click();
//
//		        boolean filterSelected = false;
//		        for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
//		            try {
//		                List<WebElement> options = wait.until(ExpectedConditions
//		                        .visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class=\"mat-option-text\"])[3]")));
//		                for (WebElement option : options) {
//		                    if (option.getText().equals(filterText)) {
//		                        Actions actions = new Actions(driver);
//		                        actions.click(option).perform();
//		                        filterSelected = true;
//		                        break;
//		                    }
//		                }
//		                if (!filterSelected) {
//		                    throw new Exception("Filter option not found on attempt " + (attempt + 1));
//		                }
//		            } catch (Exception e) {
//		                System.out.println("Attempt " + (attempt + 1) + " to select filter failed: " + e.getMessage());
//		                Thread.sleep(1000); // Wait before retrying
//		            }
//		        }
//
//		        softAssert.assertTrue(filterSelected, "Failed to select filter: " + filterText);
//
//		        if (!filterSelected) {
//		            return; // Skip the rest of the process if filter selection failed
//		        }
//
//		        Actions scrollAction = new Actions(driver);
//		        scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
//		        Thread.sleep(2000);
//
//		        WebElement page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
//		        Actions actions = new Actions(driver);
//		        actions.doubleClick(page).perform();
//
//		        Thread.sleep(3000);
//		        WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
//		        itemsPerPage.click();
//
//		        Thread.sleep(2000);
//
//		        List<String> results = new ArrayList<>();
//		        List<String> errors = new ArrayList<>();
//		        boolean isNextPageClickable = true;
//		        int pageNumber = 0;
//
//		        while (isNextPageClickable) {
//		            try {
//		                List<WebElement> dataElements = driver
//		                		.findElements(By.xpath("//*[text()=\"" + filterText + " \"]"));
//
//		                System.out.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());
//
//		                boolean pageContainsFilterText = !dataElements.isEmpty();
//		                if (pageContainsFilterText) {
//		                    for (WebElement element : dataElements) {
//		                        String elementText = element.getText();
//		                        results.add(elementText);
//
//		                        if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
//		                            errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText
//		                                    + "' does not match any in dataElements");
//		                        }
//		                    }
//		                } else {
//		                    errors.add("Page " + (pageNumber + 1) + " - No '" + filterText + "' elements found.");
//		                }
//
//		                WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
//		                if (nextPage.isEnabled()) {
//		                    nextPage.click();
//		                } else {
//		                    isNextPageClickable = false;
//		                }
//
//		                if (dataElements.size() < 100) {
//		                    break;
//		                }
//		            } catch (Exception e) {
//		                errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
//		                isNextPageClickable = false;
//		            }
//		            pageNumber++;
//		        }
//
//		        removeFilter33(filterText);
//
//		        for (String error : errors) {
//		            softAssert.fail("Error for filter '" + filterText + "' - " + error);
//		        }
//
//		        Thread.sleep(2000);
//		    }
//
//		    // This method is to remove the filter
//		    private void removeFilter33(String filterText) throws InterruptedException {
//		        Thread.sleep(3000);
//		        WebElement filterDropdown = wait.until(ExpectedConditions
//		                .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-7\"]")));
//		        filterDropdown.click();
//
//		        boolean filterRemoved = false;
//		        for (int attempt = 0; attempt < 3 && !filterRemoved; attempt++) {
//		            try {
//		                List<WebElement> options = wait.until(ExpectedConditions
//		                        .visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class=\"mat-option-text\"])[3]")));
//		                for (WebElement option : options) {
//		                    if (option.getText().equals(filterText)) {
//		                        Actions actions = new Actions(driver);
//		                        actions.click(option).perform();
//		                        filterRemoved = true;
//		                        break;
//		                    }
//		                }
//		                if (!filterRemoved) {
//		                    throw new Exception("Filter option not found for removal on attempt " + (attempt + 1));
//		                }
//		            } catch (Exception e) {
//		                System.out.println("Attempt " + (attempt + 1) + " to remove filter failed: " + e.getMessage());
//		                Thread.sleep(1000); // Wait before retrying
//		            }
//		        }
//
//		        if (!filterRemoved) {
//		            System.out.println("Failed to remove filter: " + filterText);
//		        }
//
//		        WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
//		        Actions actions = new Actions(driver);
//		        actions.doubleClick(blankFields).perform();
//
//		        Thread.sleep(2000);
//		    }
//
//		
//		      
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		    
//		    @Test(priority =8)
//		    public void Workshop_FILLTER() throws InterruptedException {
//		        String[] filters = { "NARAINA INDUSTRIAL AREA-SRV"};
//		        		           
//		        SoftAssert softAssert = new SoftAssert();
//
//		        for (String filter : filters) {
//		            applyFilter(filter, softAssert);
//		        }
//
//		        softAssert.assertAll(); // Report all collected errors at the end of the test
//		    }
//
//		    // This method is to select the filter
//		    private void applyFilter(String filterText, SoftAssert softAssert) throws InterruptedException {
//		        WebElement filterDropdown = wait.until(ExpectedConditions
//		                .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-3\"]")));
//		        filterDropdown.click();
//
//		        boolean filterSelected = false;
//		        for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
//		            try {
//		                List<WebElement> options = wait.until(ExpectedConditions
//		                        .visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class=\"mat-option-text\"])[2]")));
//		                for (WebElement option : options) {
//		                    if (option.getText().equals(filterText)) {
//		                        Actions actions = new Actions(driver);
//		                        actions.click(option).perform();
//		                        filterSelected = true;
//		                        break;
//		                    }
//		                }
//		                if (!filterSelected) {
//		                    throw new Exception("Filter option not found on attempt " + (attempt + 1));
//		                }
//		            } catch (Exception e) {
//		                System.out.println("Attempt " + (attempt + 1) + " to select filter failed: " + e.getMessage());
//		                Thread.sleep(1000); // Wait before retrying
//		            }
//		        }
//
//		        softAssert.assertTrue(filterSelected, "Failed to select filter: " + filterText);
//
//		        if (!filterSelected) {
//		            return; // Skip the rest of the process if filter selection failed
//		        }
//
//		        Actions scrollAction = new Actions(driver);
//		        scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
//		        Thread.sleep(2000);
//
//		        WebElement page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
//		        Actions actions = new Actions(driver);
//		        actions.doubleClick(page).perform();
//
//		        Thread.sleep(3000);
//		        WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
//		        itemsPerPage.click();
//
//		        Thread.sleep(2000);
//
//		        List<String> results = new ArrayList<>();
//		        List<String> errors = new ArrayList<>();
//		        boolean isNextPageClickable = true;
//		        int pageNumber = 0;
//
//		        while (isNextPageClickable) {
//		            try {
//		                List<WebElement> dataElements = driver
//		                		.findElements(By.xpath("//*[text()=\" " + filterText + "\"]"));
//
//		                System.out.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());
//
//		                boolean pageContainsFilterText = !dataElements.isEmpty();
//		                if (pageContainsFilterText) {
//		                    for (WebElement element : dataElements) {
//		                        String elementText = element.getText();
//		                        results.add(elementText);
//
//		                        if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
//		                            errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText
//		                                    + "' does not match any in dataElements");
//		                        }
//		                    }
//		                } else {
//		                    errors.add("Page " + (pageNumber + 1) + " - No '" + filterText + "' elements found.");
//		                }
//
//		                WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
//		                if (nextPage.isEnabled()) {
//		                    nextPage.click();
//		                } else {
//		                    isNextPageClickable = false;
//		                }
//
//		                if (dataElements.size() < 100) {
//		                    break;
//		                }
//		            } catch (Exception e) {
//		                errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
//		                isNextPageClickable = false;
//		            }
//		            pageNumber++;
//		        }
//
//		        removeFilter1(filterText);
//
//		        for (String error : errors) {
//		            softAssert.fail("Error for filter '" + filterText + "' - " + error);
//		        }
//
//		        Thread.sleep(2000);
//		    }
//
//		    // This method is to remove the filter
//		    private void removeFilter1(String filterText) throws InterruptedException {
//		        Thread.sleep(3000);
//		        WebElement filterDropdown = wait.until(ExpectedConditions
//		                .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-3\"]")));
//		        filterDropdown.click();
//
//		        boolean filterRemoved = false;
//		        for (int attempt = 0; attempt < 3 && !filterRemoved; attempt++) {
//		            try {
//		                List<WebElement> options = wait.until(ExpectedConditions
//		                        .visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class=\"mat-option-text\"])[2]")));
//		                for (WebElement option : options) {
//		                    if (option.getText().equals(filterText)) {
//		                        Actions actions = new Actions(driver);
//		                        actions.click(option).perform();
//		                        filterRemoved = true;
//		                        break;
//		                    }
//		                }
//		                if (!filterRemoved) {
//		                    throw new Exception("Filter option not found for removal on attempt " + (attempt + 1));
//		                }
//		            } catch (Exception e) {
//		                System.out.println("Attempt " + (attempt + 1) + " to remove filter failed: " + e.getMessage());
//		                Thread.sleep(1000); // Wait before retrying
//		            }
//		        }
//
//		        if (!filterRemoved) {
//		            System.out.println("Failed to remove filter: " + filterText);
//		        }
//
//		        WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
//		        Actions actions = new Actions(driver);
//		        actions.doubleClick(blankFields).perform();
//
//		        Thread.sleep(2000);
//		    }
//		
//.........................................................................................   
		@Test(priority = 20)
		public void verifyCurrentDate() throws InterruptedException {
		    // Refresh the page
		    WebElement Refresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role=\"img\"])[6]")));
		    Refresh.click();		

		    Thread.sleep(10000);
		    // Retrieve the current date
		    LocalDate currentDate = LocalDate.now();
		    // Define the date format
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
		                        results.add("Page " + (pageNumber + 1) + ": " + dateText); // Add to results list with page info

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

}
