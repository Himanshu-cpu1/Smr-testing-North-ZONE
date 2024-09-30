package psf;

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

public class PSFF {
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


	// .>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@SuppressWarnings("unused")
	@Test(priority = 9)
	public void Click_On_Service_Type_Fillter_Select_SERVICE_CAMP() throws InterruptedException {

	    // ................. Apply the "SERVICE CAMP" filter..............................
	
	    WebElement filterDropdown = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-1\"]")));
	    filterDropdown.click();
	    
	    
	 // Wait for all options to be visible
        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
        String optionText ="SERVICE CAMP";
       
        for (WebElement option : options) {
            if (option.getText().equals(optionText)) {
                Actions actions = new Actions(driver);
                actions.click(option).perform();
                break;
            }
        }

	    // ....................... Scroll down.....................................
	    Actions scrollAction = new Actions(driver);
	    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

	    Thread.sleep(2000);

	    // ..............................Click on Item Per Page.............................

	    WebElement page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
	    Actions actions = new Actions(driver);
	    actions.doubleClick(page).perform();

	    Thread.sleep(3000);
	    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
	    itemsPerPage.click();

	    Thread.sleep(2000);

	    // Prepare to collect results and status for "SERVICE CAMP" on each page
	    List<String> results = new ArrayList<>();
	    List<String> errors = new ArrayList<>();

	    // Initialize the variable to track if the next page button is clickable
	    boolean isNextPageClickable = true;

	    int pageNumber = 0; // Track the current page number
	  //.......................................................................................................	    
	    while (isNextPageClickable) {
	        try {
	            // Collect all elements representing the filtered data
	            List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\" SERVICE CAMP \")]"));

	            // Log the size of "SERVICE CAMP" on each page
	            System.out.println("Page " + (pageNumber + 1) + " - Size of SERVICE CAMP: " + dataElements.size());

	            boolean pageContainsPaidService = !dataElements.isEmpty();
	            //..............................................................................................
	            // Add "SERVICE CAMP" data to the results list
	            if (pageContainsPaidService) {
	                for (WebElement element : dataElements) {
	                    String elementText = element.getText();
	                    results.add(elementText);

	                    // Assert that the element's text is equal to the expected value
	                    if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
	                        errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText + "' does not match any in dataElements");
	                    }
	                }
	            } else {
	                // Log an error if no "SERVICE CAMP" elements are found on the page
	                errors.add("Page " + (pageNumber + 1) + " - No 'SERVICE CAMP' elements found.");
	            }
	            //......................................................................................................
	            // Click on the NextPage button if it's clickable
	            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
	            nextPage.click();

	            // If the size of dataElements is less than 100, stop the pagination
	            if (dataElements.size() < 100) {
	          //      System.out.println("Data elements size is less than 100. Stopping pagination.");
	                break;
	            }
	        } catch (Exception e) {
	            // Log any exception encountered during the page processing
	            errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
	        }
	        pageNumber++; // Increment the page number
	    }
	 // .........Again click on the fillter to remove the selected SERVICE CAMP..............
		
	    WebElement filterDropdown2 = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-1\"]")));
	    filterDropdown2.click();

	 // Wait for all options to be visible
        List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
        String optionText1 ="SERVICE CAMP";
       
        for (WebElement option1 : options1) {
            if (option1.getText().equals(optionText1)) {
                Actions actions1 = new Actions(driver);
                actions1.click(option1).perform();
                break;
            }}
		//..............Click  on the Blank Fields.................................
		WebElement blankFields2 = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
		Actions actions2 = new Actions(driver);  
		actions.doubleClick(blankFields2).perform();
		
		Thread.sleep(2000);
		
	    // Assert that there were no errors
	    if (!errors.isEmpty()) {
	        Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
	    }

	    
	    Thread.sleep(2000);
	}


	//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
		@SuppressWarnings("unused")
		@Test(priority = 10)
		public void Click_On_Service_Type_Fillter_Select_BANDP() throws InterruptedException {

	////.................click on the service type Apply the BANDP filter...................................

			    WebElement filterDropdown = wait.until(ExpectedConditions
			            .visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
			    filterDropdown.click();
			   
			 // Wait for all options to be visible of BANDP
		        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
		        String optionText ="BANDP";
		       
		        for (WebElement option : options) {
		            if (option.getText().equals(optionText)) {
		                Actions actions = new Actions(driver);
		                actions.click(option).perform();
		                break;
		            }
		        }

			    // ....................... Scroll down.....................................
			    Actions scrollAction = new Actions(driver);
			    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

			    Thread.sleep(2000);

			    // ..............................Click on Item Per Page.............................

			    WebElement page = driver.findElement(By.cssSelector("[class=\"mat-select-arrow ng-tns-c136-29\"]"));
			    Actions actions = new Actions(driver);
			    actions.doubleClick(page).perform();

			    Thread.sleep(3000);
			    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
			    itemsPerPage.click();

			    Thread.sleep(2000);

			    // Prepare to collect results and errors for "BANDP" on each page
			    List<String> results = new ArrayList<>();
			    List<String> errors = new ArrayList<>();

			    // Initialize the variable to track if the next page button is clickable
			    boolean isNextPageClickable = true;

			    int pageNumber = 0; // Track the current page number
			    //...................................................................................................	    
			    while (isNextPageClickable) {
			        try {
			            // Collect all elements representing the filtered data
			        	List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\"BANDP\")]"));

			            // Log the size of "BANDP" on each page
			            System.out.println("Page " + (pageNumber + 1) + " - Size of BANDP: " + dataElements.size());

			            boolean pageContainsBANDP = !dataElements.isEmpty();
			            //..............................................................................................
			            // Add "BANDP" data to the results list
			            if (pageContainsBANDP) {
			                for (WebElement element : dataElements) {
			                    String elementText = element.getText();
			                    results.add(elementText);

			                    // Assert that the element's text is equal to the expected value
			                    if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
			                        errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText + "' does not match any in dataElements");
			                    }
			                }
			            } else {
			                // Log an error if no "BANDP" elements are found on the page
			                errors.add("Page " + (pageNumber + 1) + " - BANDP' elements found.");
			            }
			            //......................................................................................................
			            // Click on the NextPage button if it's clickable
			            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
			            nextPage.click();

			            // If the size of dataElements is less than 100, stop the pagination
			            if (dataElements.size() < 100) {
			             //   System.out.println("Data elements size is less than 100. Stopping pagination.");
			                break;
			            }
			        } catch (Exception e) {
			            // Log any exception encountered during the page processing
			            errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
			        }
			        pageNumber++; // Increment the page number
			    }
			    // ..............Again click on the fillter to remove the selected BANDP   ..............
				
				Thread.sleep(3000);
				WebElement filterDropdown1 = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
				filterDropdown1.click(); // click on the Fillter

				 // .......Wait for BANDP to be Visible and click to remove.......
				
		        List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
		        String optionText1 ="BANDP";
		       
		        for (WebElement option1 : options1) {
		            if (option1.getText().equals(optionText1)) {
		                Actions actions1 = new Actions(driver);
		                actions.click(option1).perform();
		                break;
		            }
		        }
				//..............Click  on the Blank Fields.................................
				WebElement blankFields2 = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
				Actions actions2 = new Actions(driver);  
				actions.doubleClick(blankFields2).perform();
				
				Thread.sleep(2000);

			    // Assert that there were no errors
			    if (!errors.isEmpty()) {
			        Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
			    }
	   			
			Thread.sleep(2000);
	           }
		
	//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
		@SuppressWarnings("unused")
		@Test(priority = 11)
		public void Click_On_Service_Type_Fillter_Select_FR1() throws InterruptedException {

	////.................click on the service type Apply the FR1 filter...................................

			    WebElement filterDropdown = wait.until(ExpectedConditions
			            .visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
			    filterDropdown.click();
			   
			 // Wait for all options to be visible of FR1
		        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
		        String optionText ="FR1";
		       
		        for (WebElement option : options) {
		            if (option.getText().equals(optionText)) {
		                Actions actions = new Actions(driver);
		                actions.click(option).perform();
		                break;
		            }
		        }

			    // ....................... Scroll down.....................................
			    Actions scrollAction = new Actions(driver);
			    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

			    Thread.sleep(2000);

			    // ..............................Click on Item Per Page.............................

			    WebElement page = driver.findElement(By.cssSelector("[class=\"mat-select-arrow ng-tns-c136-29\"]"));
			    Actions actions = new Actions(driver);
			    actions.doubleClick(page).perform();

			    Thread.sleep(3000);
			    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
			    itemsPerPage.click();

			    Thread.sleep(2000);

			    // Prepare to collect results and errors for "BANDP" on each page
			    List<String> results = new ArrayList<>();
			    List<String> errors = new ArrayList<>();

			    // Initialize the variable to track if the next page button is clickable
			    boolean isNextPageClickable = true;

			    int pageNumber = 0; // Track the current page number
			    //...................................................................................................	    
			    while (isNextPageClickable) {
			        try {
			            // Collect all elements representing the filtered data
			        	List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\"FR1\")]"));

			            // Log the size of "FR1" on each page
			            System.out.println("Page " + (pageNumber + 1) + " - Size of FR1: " + dataElements.size());

			            boolean pageContainsFR1 = !dataElements.isEmpty();
			            //..............................................................................................
			            // Add "BANDP" data to the results list
			            if (pageContainsFR1) {
			                for (WebElement element : dataElements) {
			                    String elementText = element.getText();
			                    results.add(elementText);

			                    // Assert that the element's text is equal to the expected value
			                    if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
			                        errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText + "' does not match any in dataElements");
			                    }
			                }
			            } else {
			                // Log an error if no "FR1" elements are found on the page
			                errors.add("Page " + (pageNumber + 1) + " - FR1' elements found.");
			            }
			            //......................................................................................................
			            // Click on the NextPage button if it's clickable
			            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
			            nextPage.click();

			            // If the size of dataElements is less than 100, stop the pagination
			            if (dataElements.size() < 100) {
			             //   System.out.println("Data elements size is less than 100. Stopping pagination.");
			                break;
			            }
			        } catch (Exception e) {
			            // Log any exception encountered during the page processing
			            errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
			        }
			        pageNumber++; // Increment the page number
			    }
			 // ..............Again click on the fillter to remove the selected FR1   ..............
				
				Thread.sleep(3000);
				WebElement filterDropdown1 = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
				filterDropdown1.click(); // click on the Fillter

				 // .......Wait for FR1 to be Visible and click to remove.......
				
		        List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
		        String optionText1 ="FR1";
		       
		        for (WebElement option1 : options1) {
		            if (option1.getText().equals(optionText1)) {
		                Actions actions1 = new Actions(driver);
		                actions.click(option1).perform();
		                break;
		            }
		        }
				//..............Click  on the Blank Fields.................................
				WebElement blankFields2 = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
				Actions actions2 = new Actions(driver);  
				actions.doubleClick(blankFields2).perform();
			
				   Thread.sleep(2000);
			    // Assert that there were no errors
			    if (!errors.isEmpty()) {
			        Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
			    }

	   Thread.sleep(2000);
	           }
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
				@SuppressWarnings("unused")
				@Test(priority = 12)
				public void Click_On_Service_Type_Fillter_Select_FR2() throws InterruptedException {

			////.................click on the service type Apply the FR2 filter...................................

					    WebElement filterDropdown = wait.until(ExpectedConditions
					            .visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
					    filterDropdown.click();
					   
					 // Wait for all options to be visible of FR2
				        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				        String optionText ="FR2";
				       
				        for (WebElement option : options) {
				            if (option.getText().equals(optionText)) {
				                Actions actions = new Actions(driver);
				                actions.click(option).perform();
				                break;
				            }
				        }

					    // ....................... Scroll down.....................................
					    Actions scrollAction = new Actions(driver);
					    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

					    Thread.sleep(2000);

					    // ..............................Click on Item Per Page.............................

					    WebElement page = driver.findElement(By.cssSelector("[class=\"mat-select-arrow ng-tns-c136-29\"]"));
					    Actions actions = new Actions(driver);
					    actions.doubleClick(page).perform();

					    Thread.sleep(3000);
					    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
					    itemsPerPage.click();

					    Thread.sleep(2000);

					    // Prepare to collect results and errors for "FR2" on each page
					    List<String> results = new ArrayList<>();
					    List<String> errors = new ArrayList<>();

					    // Initialize the variable to track if the next page button is clickable
					    boolean isNextPageClickable = true;

					    int pageNumber = 0; // Track the current page number
					    //...................................................................................................	    
					    while (isNextPageClickable) {
					        try {
					            // Collect all elements representing the filtered data
					        	List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\"FR2\")]"));

					            // Log the size of "FR2" on each page
					            System.out.println("Page " + (pageNumber + 1) + " - Size of FR2   :: " + dataElements.size());

					            boolean pageContainsFR1 = !dataElements.isEmpty();
					            //..............................................................................................
					            // Add "FR2" data to the results list
					            if (pageContainsFR1) {
					                for (WebElement element : dataElements) {
					                    String elementText = element.getText();
					                    results.add(elementText);

					                    // Assert that the element's text is equal to the expected value
					                    if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
					                        errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText + "' does not match any in dataElements");
					                    }
					                }
					            } else {
					                // Log an error if no "FR2" elements are found on the page
					                errors.add("Page " + (pageNumber + 1) + " - FR2' elements found.");
					            }
					            //......................................................................................................
					            // Click on the NextPage button if it's clickable
					            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
					            nextPage.click();

					            // If the size of dataElements is less than 100, stop the pagination
					            if (dataElements.size() < 100) {
					             //   System.out.println("Data elements size is less than 100. Stopping pagination.");
					                break;
					            }
					        } catch (Exception e) {
					            // Log any exception encountered during the page processing
					            errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
					        }
					        pageNumber++; // Increment the page number
					    }
					    // ..............Again click on the fillter to remove the selected FR2   ..............
						
						Thread.sleep(3000);
						WebElement filterDropdown1 = wait.until(ExpectedConditions
								.visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
						filterDropdown1.click(); // click on the Fillter

						 // .......Wait for FR2 to be Visible and click to remove.......
						
				        List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				        String optionText1 ="FR2";
				       
				        for (WebElement option1 : options1) {
				            if (option1.getText().equals(optionText1)) {
				                Actions actions1 = new Actions(driver);
				                actions.click(option1).perform();
				                break;
				            }
				        }
						//..............Click  on the Blank Fields.................................
						WebElement blankFields2 = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
						Actions actions2 = new Actions(driver);  
						actions.doubleClick(blankFields2).perform();
					
						   Thread.sleep(2000);

					    // Assert that there were no errors
					    if (!errors.isEmpty()) {
					        Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
					    }

			  Thread.sleep(2000);
			           }
				
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
				@SuppressWarnings("unused")
				@Test(priority = 13)
				public void Click_On_Service_Type_Fillter_Select_WASH() throws InterruptedException {

			////.................click on the service type Apply the WASH filter...................................

					    WebElement filterDropdown = wait.until(ExpectedConditions
					            .visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
					    filterDropdown.click();
					   
					 // Wait for all options to be visible of WASH
				        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				        String optionText ="WASH";
				       
				        for (WebElement option : options) {
				            if (option.getText().equals(optionText)) {
				                Actions actions = new Actions(driver);
				                actions.click(option).perform();
				                break;
				            }
				        }

					    // ....................... Scroll down.....................................
					    Actions scrollAction = new Actions(driver);
					    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

					    Thread.sleep(2000);

					    // ..............................Click on Item Per Page.............................

					    WebElement page = driver.findElement(By.cssSelector("[class=\"mat-select-arrow ng-tns-c136-29\"]"));
					    Actions actions = new Actions(driver);
					    actions.doubleClick(page).perform();

					    Thread.sleep(3000);
					    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
					    itemsPerPage.click();

					    Thread.sleep(2000);

					    // Prepare to collect results and errors for "WASH" on each page
					    List<String> results = new ArrayList<>();
					    List<String> errors = new ArrayList<>();

					    // Initialize the variable to track if the next page button is clickable
					    boolean isNextPageClickable = true;

					    int pageNumber = 0; // Track the current page number
					    //...................................................................................................	    
					    while (isNextPageClickable) {
					        try {
					            // Collect all elements representing the filtered data
					        	List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\"WASH\")]"));

					            // Log the size of "WASH" on each page
					            System.out.println("Page " + (pageNumber + 1) + " - Size of WASH   :: " + dataElements.size());

					            boolean pageContainsWASH = !dataElements.isEmpty();
					            //..............................................................................................
					            // Add "WASH" data to the results list
					            if (pageContainsWASH) {
					                for (WebElement element : dataElements) {
					                    String elementText = element.getText();
					                    results.add(elementText);

					                    // Assert that the element's text is equal to the expected value
					                    if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
					                        errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText + "' does not match any in dataElements");
					                    }
					                }
					            } else {
					                // Log an error if no "WASH" elements are found on the page
					                errors.add("Page " + (pageNumber + 1) + " - WASH' elements found.");
					            }
					            //......................................................................................................
					            // Click on the NextPage button if it's clickable
					            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
					            nextPage.click();

					            // If the size of dataElements is less than 100, stop the pagination
					            if (dataElements.size() < 100) {
					             //   System.out.println("Data elements size is less than 100. Stopping pagination.");
					                break;
					            }
					        } catch (Exception e) {
					            // Log any exception encountered during the page processing
					            errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
					        }
					        pageNumber++; // Increment the page number
					    }
					    // ..............Again click on the fillter to remove the selected WASH   ..............
						
						Thread.sleep(3000);
						WebElement filterDropdown1 = wait.until(ExpectedConditions
								.visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
						filterDropdown1.click(); // click on the Fillter

						 // .......Wait for WASH to be Visible and click to remove.......
						
				        List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				        String optionText1 ="WASH";
				       
				        for (WebElement option1 : options1) {
				            if (option1.getText().equals(optionText1)) {
				                Actions actions1 = new Actions(driver);
				                actions.click(option1).perform();
				                break;
				            }
				        }
						//..........................Click  on the Blank Fields.................................
						WebElement blankFields2 = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
						Actions actions2 = new Actions(driver);  
						actions.doubleClick(blankFields2).perform();
					
						   Thread.sleep(2000);
					    // Assert that there were no errors
					    if (!errors.isEmpty()) {
					        Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
					    }

			  Thread.sleep(2000);
			           }
	//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
				@SuppressWarnings("unused")
				@Test(priority = 14)
				public void Click_On_Service_Type_Fillter_Select_WMOS() throws InterruptedException {

			////.................click on the service type Apply the WMOS filter...................................

					    WebElement filterDropdown = wait.until(ExpectedConditions
					            .visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
					    filterDropdown.click();
					   
					 // Wait for all options to be visible of WMOS
				        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				        String optionText ="WMOS";
				       
				        for (WebElement option : options) {
				            if (option.getText().equals(optionText)) {
				                Actions actions = new Actions(driver);
				                actions.click(option).perform();
				                break;
				            }
				        }

					    // ....................... Scroll down.....................................
					    Actions scrollAction = new Actions(driver);
					    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

					    Thread.sleep(2000);

					    // ..............................Click on Item Per Page.............................

					    WebElement page = driver.findElement(By.cssSelector("[class=\"mat-select-arrow ng-tns-c136-29\"]"));
					    Actions actions = new Actions(driver);
					    actions.doubleClick(page).perform();

					    Thread.sleep(3000);
					    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
					    itemsPerPage.click();

					    Thread.sleep(2000);

					    // Prepare to collect results and errors for "WMOS" on each page
					    List<String> results = new ArrayList<>();
					    List<String> errors = new ArrayList<>();

					    // Initialize the variable to track if the next page button is clickable
					    boolean isNextPageClickable = true;

					    int pageNumber = 0; // Track the current page number
					    //...................................................................................................	    
					    while (isNextPageClickable) {
					        try {
					            // Collect all elements representing the filtered data
					        	List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\"WMOS\")]"));

					            // Log the size of "WMOS" on each page
					            System.out.println("Page " + (pageNumber + 1) + " - Size of WMOS   :: " + dataElements.size());

					            boolean pageContainsWMOS = !dataElements.isEmpty();
					            //..............................................................................................
					            // Add "WMOS" data to the results list
					            if (pageContainsWMOS) {
					                for (WebElement element : dataElements) {
					                    String elementText = element.getText();
					                    results.add(elementText);

					                    // Assert that the element's text is equal to the expected value
					                    if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
					                        errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText + "' does not match any in dataElements");
					                    }
					                }
					            } else {
					                // Log an error if no "WMOS" elements are found on the page
					                errors.add("Page " + (pageNumber + 1) + " - WMOS' elements found.");
					            }
					            //......................................................................................................
					            // Click on the NextPage button if it's clickable
					            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
					            nextPage.click();

					            // If the size of dataElements is less than 100, stop the pagination
					            if (dataElements.size() < 100) {
					             //   System.out.println("Data elements size is less than 100. Stopping pagination.");
					                break;
					            }
					        } catch (Exception e) {
					            // Log any exception encountered during the page processing
					            errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
					        }
					        pageNumber++; // Increment the page number
					    }
					    // ..............Again click on the fillter to remove the selected WMOS   ..............
						
						Thread.sleep(3000);
						WebElement filterDropdown1 = wait.until(ExpectedConditions
								.visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
						filterDropdown1.click(); // click on the Fillter

						 // .......Wait for WMOS to be Visible and click to remove.......
						
				        List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
				        String optionText1 ="WMOS";
				       
				        for (WebElement option1 : options1) {
				            if (option1.getText().equals(optionText1)) {
				                Actions actions1 = new Actions(driver);
				                actions.click(option1).perform();
				                break;
				            }
				        }
						//..........................Click  on the Blank Fields.................................
						WebElement blankFields2 = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
						Actions actions2 = new Actions(driver);  
						actions.doubleClick(blankFields2).perform();
					
						   Thread.sleep(2000);

					    // Assert that there were no errors
					    if (!errors.isEmpty()) {
					        Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
					    }

			 Thread.sleep(2000);
			           }
								                      		
//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
               @SuppressWarnings("unused")
               @Test(priority = 15)
               public void Click_On_Service_Type_Fillter_Select_SC() throws InterruptedException {

       ////.................click on the service type Apply the SC filter...................................

	    WebElement filterDropdown = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
	    filterDropdown.click();
	   
	 // Wait for all options to be visible of SC
        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
        String optionText ="SC";
       
        for (WebElement option : options) {
            if (option.getText().equals(optionText)) {
                Actions actions = new Actions(driver);
                actions.click(option).perform();
                break;
            }
        }

	    // ....................... Scroll down.....................................
	    Actions scrollAction = new Actions(driver);
	    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();

	    Thread.sleep(2000);

	    // ..............................Click on Item Per Page.............................

	    WebElement page = driver.findElement(By.cssSelector("[class=\"mat-select-arrow ng-tns-c136-29\"]"));
	    Actions actions = new Actions(driver);
	    actions.doubleClick(page).perform();

	    Thread.sleep(3000);
	    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
	    itemsPerPage.click();

	    Thread.sleep(2000);

	    // Prepare to collect results and errors for "SC" on each page
	    List<String> results = new ArrayList<>();
	    List<String> errors = new ArrayList<>();

	    // Initialize the variable to track if the next page button is clickable
	    boolean isNextPageClickable = true;

	    int pageNumber = 0; // Track the current page number
	    //...................................................................................................	    
	    while (isNextPageClickable) {
	        try {
	            // Collect all elements representing the filtered data
	        	List<WebElement> dataElements1 = driver.findElements(By.xpath("//*[contains(text(),\"SC\")]"));

	            // Log the size of "SC" on each page
	            System.out.println("Page " + (pageNumber + 1) + " - Size of SC   :: " + dataElements1.size());

	            boolean pageContainsSC = !dataElements1.isEmpty();
	            //..............................................................................................
	            // Add "SC" data to the results list
	            if (pageContainsSC) {
	                for (WebElement element1 : dataElements1) {
	                    String elementText2 = element1.getText();
	                    results.add(elementText2);

	                    // Assert that the element's text is equal to the expected value
	                    if (!dataElements1.stream().anyMatch(e -> e.getText().equals(elementText2))) {
	                        errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText2 + "' does not match any in dataElements");
	                    }
	                }
	            } else {
	                // Log an error if no "SC" elements are found on the page
	                errors.add("Page " + (pageNumber + 1) + " - No  'SC' elements found.");
	            }
	            //......................................................................................................
	            // Click on the NextPage button if it's clickable
	            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
	            nextPage.click();

	            // If the size of dataElements is less than 100, stop the pagination
	            if (dataElements1.size() < 100) {
	             //   System.out.println("Data elements size is less than 100. Stopping pagination.");
	                break;
	            }
	        } catch (Exception e) {
	            // Log any exception encountered during the page processing
	            errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
	        }
	        pageNumber++; // Increment the page number
	    }
	 // ..............Again click on the fillter to remove the selected SC   ..............
		
		Thread.sleep(3000);
		WebElement filterDropdown1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("[class=\"mat-select-arrow-wrapper ng-tns-c136-6\"]")));
		filterDropdown1.click(); // click on the Fillter

		 // .......Wait for SC to be Visible and click to remove.......
		
	    List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
	    String optionText1 ="SC";
	       
	    for (WebElement option1 : options1) {
	        if (option1.getText().equals(optionText1)) {
	            Actions actions1 = new Actions(driver);
	            actions.click(option1).perform();
	            break;
	        }
	    }
		//..........................Click  on the Blank Fields.................................
		WebElement blankFields2 = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
		Actions actions2 = new Actions(driver);  
		actions.doubleClick(blankFields2).perform();

		   Thread.sleep(2000);

	    // Assert that there were no errors
	    if (!errors.isEmpty()) {
	        Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
	    }

    Thread.sleep(2000);
       }


      }




	
	