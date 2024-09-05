package pSF_DEMO;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoALL_prod_P_S_F {

	public static WebDriver driver;
	public WebDriverWait wait;

	// ...............................................................................................................
	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://psfcrm.dealercrm.co.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

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
	public void Click_On_PSF() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

	// ...............................................................................................
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

		Thread.sleep(3000);
	}

	// ..................................................................................
	// ..................................................................................
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

	// ........................................................................................
//				@SuppressWarnings("unused")
//				@Test(priority = 7)
//				public void Click_On_Service_Type_Fillter_Select_BODY_REPAIR() throws InterruptedException {
//
//				    // ................. Apply the "BODY REPAIR" filter..............................
//				
//				    WebElement filterDropdown = wait.until(ExpectedConditions
//				            .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-1\"]")));
//				    filterDropdown.click();
//				    
//				    
//				 // Wait for all options to be visible
//			        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
//			        String optionText ="BODY REPAIR";
//			       
//			        for (WebElement option : options) {
//			            if (option.getText().equals(optionText)) {
//			                Actions actions = new Actions(driver);
//			                actions.click(option).perform();
//			                break;
//			            }
//			        }
//
//				    // ....................... Scroll down.....................................
//				    Actions scrollAction = new Actions(driver);
//				    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
//
//				    Thread.sleep(2000);
//
//				    // ..............................Click on Item Per Page.............................
//
//				    WebElement page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
//				    Actions actions = new Actions(driver);
//				    actions.doubleClick(page).perform();
//
//				    Thread.sleep(3000);
//				    WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
//				    itemsPerPage.click();
//
//				    Thread.sleep(2000);
//
//				    // Prepare to collect results and status for "BODY REPAIR" on each page
//				    List<String> results = new ArrayList<>();
//				    List<String> errors = new ArrayList<>();
//
//				    // Initialize the variable to track if the next page button is clickable
//				    boolean isNextPageClickable = true;
//
//				    int pageNumber = 0; // Track the current page number
//				  //.......................................................................................................	    
//				    while (isNextPageClickable) {
//				        try {
//				            // Collect all elements representing the filtered data
//				            List<WebElement> dataElements = driver.findElements(By.xpath("//*[contains(text(),\" BODY  REPAIR \")]"));
//
//				            // Log the size of "BODY REPAIR" on each page
//				            System.out.println("Page " + (pageNumber + 1) + " - Size of BODY REPAIR: " + dataElements.size());
//
//				            boolean pageContainsPaidService = !dataElements.isEmpty();
//				            //..............................................................................................
//				            // Add "SERVICE CAMP" data to the results list
//				            if (pageContainsPaidService) {
//				                for (WebElement element : dataElements) {
//				                    String elementText = element.getText();
//				                    results.add(elementText);
//
//				                    // Assert that the element's text is equal to the expected value
//				                    if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
//				                        errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText + "' does not match any in dataElements");
//				                    }
//				                }
//				            } else {
//				                // Log an error if no "SERVICE CAMP" elements are found on the page
//				                errors.add("Page " + (pageNumber + 1) + " - No 'BODY REPAIR  ' elements found.");
//				            }
//				            //......................................................................................................
//				            // Click on the NextPage button if it's clickable
//				            WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
//				            nextPage.click();
//
//				            // If the size of dataElements is less than 100, stop the pagination
//				            if (dataElements.size() < 100) {
//				          //      System.out.println("Data elements size is less than 100. Stopping pagination.");
//				                break;
//				            }
//				        } catch (Exception e) {
//				            // Log any exception encountered during the page processing
//				            errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
//				        }
//				        pageNumber++; // Increment the page number
//				    }
//				 // .........Again click on the fillter to remove the selected BODY REPAIR..............
//					
//				    WebElement filterDropdown2 = wait.until(ExpectedConditions
//				            .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-1\"]")));
//				    filterDropdown2.click();
//
//				 // Wait for all options to be visible
//			        List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
//			        String optionText1 ="BODY REPAIR";
//			       
//			        for (WebElement option1 : options1) {
//			            if (option1.getText().equals(optionText1)) {
//			                Actions actions1 = new Actions(driver);
//			                actions1.click(option1).perform();
//			                break;
//			            }}
//					//..............Click  on the Blank Fields.................................
//					WebElement blankFields2 = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
//					Actions actions2 = new Actions(driver);  
//					actions.doubleClick(blankFields2).perform();
//					
//					Thread.sleep(2000);
//					
//				    // Assert that there were no errors
//				    if (!errors.isEmpty()) {
//				        Assert.fail("Errors encountered during page processing:\n" + String.join("\n", errors));
//				    }
//
//				    
//				    Thread.sleep(2000);
//				}
//				
//	//...............................................................................................
//				
//				 @Test(priority = 8)
//				    public void Service_Type_FILLTER() throws InterruptedException {
//				        String[] filters = { "3RD FREE SERVICE", "SERVICE CAMP", 
//				        		           "2ND FREE SERVICE", "PMS120", "PMS 20", "PMS 30", 
//				        		           "RUNNING REPAIR", "1ST FREE SERVICE","PMS 50","PMS70"
//				        		           ,"PMS80","PMS 60","PMS130","PMS 40","PMS110","PMS200"
//				        		           ,"PMS90","PMS210","PMS150","PMS100","PMS140","WASHING",
//				        		           "PMS180","4TH FREE SERVICE","PMS160","PMS170","PMS230"
//				        		           ,"PMS220","PMS190" };
//				        SoftAssert softAssert = new SoftAssert();
//
//				        for (String filter : filters) {
//				            applyFilter(filter, softAssert);
//				        }
//
//				        softAssert.assertAll(); // Report all collected errors at the end of the test
//				    }
//
//				    // This method is to select the filter
//				    private void applyFilter(String filterText, SoftAssert softAssert) throws InterruptedException {
//				        WebElement filterDropdown = wait.until(ExpectedConditions
//				                .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-1\"]")));
//				        filterDropdown.click();
//
//				        boolean filterSelected = false;
//				        for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
//				            try {
//				                List<WebElement> options = wait.until(ExpectedConditions
//				                        .visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
//				                for (WebElement option : options) {
//				                    if (option.getText().equals(filterText)) {
//				                        Actions actions = new Actions(driver);
//				                        actions.click(option).perform();
//				                        filterSelected = true;
//				                        break;
//				                    }
//				                }
//				                if (!filterSelected) {
//				                    throw new Exception("Filter option not found on attempt " + (attempt + 1));
//				                }
//				            } catch (Exception e) {
//				                System.out.println("Attempt " + (attempt + 1) + " to select filter failed: " + e.getMessage());
//				                Thread.sleep(1000); // Wait before retrying
//				            }
//				        }
//
//				        softAssert.assertTrue(filterSelected, "Failed to select filter: " + filterText);
//
//				        if (!filterSelected) {
//				            return; // Skip the rest of the process if filter selection failed
//				        }
//
//				        Actions scrollAction = new Actions(driver);
//				        scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
//				        Thread.sleep(2000);
//
//				        WebElement page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
//				        Actions actions = new Actions(driver);
//				        actions.doubleClick(page).perform();
//
//				        Thread.sleep(3000);
//				        WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
//				        itemsPerPage.click();
//
//				        Thread.sleep(2000);
//
//				        List<String> results = new ArrayList<>();
//				        List<String> errors = new ArrayList<>();
//				        boolean isNextPageClickable = true;
//				        int pageNumber = 0;
//
//				        while (isNextPageClickable) {
//				            try {
//				                List<WebElement> dataElements = driver
//				                        .findElements(By.xpath("//*[contains(text(),\" " + filterText + "\")]"));
//
//				                System.out.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());
//
//				                boolean pageContainsFilterText = !dataElements.isEmpty();
//				                if (pageContainsFilterText) {
//				                    for (WebElement element : dataElements) {
//				                        String elementText = element.getText();
//				                        results.add(elementText);
//
//				                        if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
//				                            errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText
//				                                    + "' does not match any in dataElements");
//				                        }
//				                    }
//				                } else {
//				                    errors.add("Page " + (pageNumber + 1) + " - No '" + filterText + "' elements found.");
//				                }
//
//				                WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
//				                if (nextPage.isEnabled()) {
//				                    nextPage.click();
//				                } else {
//				                    isNextPageClickable = false;
//				                }
//
//				                if (dataElements.size() < 100) {
//				                    break;
//				                }
//				            } catch (Exception e) {
//				                errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
//				                isNextPageClickable = false;
//				            }
//				            pageNumber++;
//				        }
//
//				        removeFilter(filterText);
//
//				        for (String error : errors) {
//				            softAssert.fail("Error for filter '" + filterText + "' - " + error);
//				        }
//
//				        Thread.sleep(2000);
//				    }
//
//				    // This method is to remove the filter
//				    private void removeFilter(String filterText) throws InterruptedException {
//				        Thread.sleep(3000);
//				        WebElement filterDropdown = wait.until(ExpectedConditions
//				                .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-1\"]")));
//				        filterDropdown.click();
//
//				        boolean filterRemoved = false;
//				        for (int attempt = 0; attempt < 3 && !filterRemoved; attempt++) {
//				            try {
//				                List<WebElement> options = wait.until(ExpectedConditions
//				                        .visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
//				                for (WebElement option : options) {
//				                    if (option.getText().equals(filterText)) {
//				                        Actions actions = new Actions(driver);
//				                        actions.click(option).perform();
//				                        filterRemoved = true;
//				                        break;
//				                    }
//				                }
//				                if (!filterRemoved) {
//				                    throw new Exception("Filter option not found for removal on attempt " + (attempt + 1));
//				                }
//				            } catch (Exception e) {
//				                System.out.println("Attempt " + (attempt + 1) + " to remove filter failed: " + e.getMessage());
//				                Thread.sleep(1000); // Wait before retrying
//				            }
//				        }
//
//				        if (!filterRemoved) {
//				            System.out.println("Failed to remove filter: " + filterText);
//				        }
//
//				        WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
//				        Actions actions = new Actions(driver);
//				        actions.doubleClick(blankFields).perform();
//
//				        Thread.sleep(2000);
//				    }
//				
////...................................................................................................
//					 @Test(priority =9)
//					    public void Workshop_FILLTER() throws InterruptedException {
//					        String[] filters = { "MAYAPURI-2S"};
//					        		           
//					        SoftAssert softAssert = new SoftAssert();
//
//					        for (String filter : filters) {
//					            applyFilter1(filter, softAssert);
//					        }
//
//					        softAssert.assertAll(); // Report all collected errors at the end of the test
//					    }
//
//					    // This method is to select the filter
//					    private void applyFilter1(String filterText, SoftAssert softAssert) throws InterruptedException {
//					        WebElement filterDropdown = wait.until(ExpectedConditions
//					                .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-3\"]")));
//					        filterDropdown.click();
//
//					        boolean filterSelected = false;
//					        for (int attempt = 0; attempt < 3 && !filterSelected; attempt++) {
//					            try {
//					                List<WebElement> options = wait.until(ExpectedConditions
//					                        .visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
//					                for (WebElement option : options) {
//					                    if (option.getText().equals(filterText)) {
//					                        Actions actions = new Actions(driver);
//					                        actions.click(option).perform();
//					                        filterSelected = true;
//					                        break;
//					                    }
//					                }
//					                if (!filterSelected) {
//					                    throw new Exception("Filter option not found on attempt " + (attempt + 1));
//					                }
//					            } catch (Exception e) {
//					                System.out.println("Attempt " + (attempt + 1) + " to select filter failed: " + e.getMessage());
//					                Thread.sleep(1000); // Wait before retrying
//					            }
//					        }
//
//					        softAssert.assertTrue(filterSelected, "Failed to select filter: " + filterText);
//
//					        if (!filterSelected) {
//					            return; // Skip the rest of the process if filter selection failed
//					        }
//
//					        Actions scrollAction = new Actions(driver);
//					        scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
//					        Thread.sleep(2000);
//
//					        WebElement page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
//					        Actions actions = new Actions(driver);
//					        actions.doubleClick(page).perform();
//
//					        Thread.sleep(3000);
//					        WebElement itemsPerPage = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
//					        itemsPerPage.click();
//
//					        Thread.sleep(2000);
//
//					        List<String> results = new ArrayList<>();
//					        List<String> errors = new ArrayList<>();
//					        boolean isNextPageClickable = true;
//					        int pageNumber = 0;
//
//					        while (isNextPageClickable) {
//					            try {
//					                List<WebElement> dataElements = driver
//					                		.findElements(By.xpath("//*[text()=\" " + filterText + "\"]"));
//
//					                System.out.println("Page " + (pageNumber + 1) + " - Size of " + filterText + ": " + dataElements.size());
//
//					                boolean pageContainsFilterText = !dataElements.isEmpty();
//					                if (pageContainsFilterText) {
//					                    for (WebElement element : dataElements) {
//					                        String elementText = element.getText();
//					                        results.add(elementText);
//
//					                        if (!dataElements.stream().anyMatch(e -> e.getText().equals(elementText))) {
//					                            errors.add("Page " + (pageNumber + 1) + " - Element text '" + elementText
//					                                    + "' does not match any in dataElements");
//					                        }
//					                    }
//					                } else {
//					                    errors.add("Page " + (pageNumber + 1) + " - No '" + filterText + "' elements found.");
//					                }
//
//					                WebElement nextPage = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[2]"));
//					                if (nextPage.isEnabled()) {
//					                    nextPage.click();
//					                } else {
//					                    isNextPageClickable = false;
//					                }
//
//					                if (dataElements.size() < 100) {
//					                    break;
//					                }
//					            } catch (Exception e) {
//					                errors.add("Page " + (pageNumber + 1) + " - Exception: " + e.getMessage());
//					                isNextPageClickable = false;
//					            }
//					            pageNumber++;
//					        }
//
//					        removeFilter1(filterText);
//
//					        for (String error : errors) {
//					            softAssert.fail("Error for filter '" + filterText + "' - " + error);
//					        }
//
//					        Thread.sleep(2000);
//					    }
//
//					    // This method is to remove the filter
//					    private void removeFilter1(String filterText) throws InterruptedException {
//					        Thread.sleep(3000);
//					        WebElement filterDropdown = wait.until(ExpectedConditions
//					                .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-3\"]")));
//					        filterDropdown.click();
//
//					        boolean filterRemoved = false;
//					        for (int attempt = 0; attempt < 3 && !filterRemoved; attempt++) {
//					            try {
//					                List<WebElement> options = wait.until(ExpectedConditions
//					                        .visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"mat-option-text\"]")));
//					                for (WebElement option : options) {
//					                    if (option.getText().equals(filterText)) {
//					                        Actions actions = new Actions(driver);
//					                        actions.click(option).perform();
//					                        filterRemoved = true;
//					                        break;
//					                    }
//					                }
//					                if (!filterRemoved) {
//					                    throw new Exception("Filter option not found for removal on attempt " + (attempt + 1));
//					                }
//					            } catch (Exception e) {
//					                System.out.println("Attempt " + (attempt + 1) + " to remove filter failed: " + e.getMessage());
//					                Thread.sleep(1000); // Wait before retrying
//					            }
//					        }
//
//					        if (!filterRemoved) {
//					            System.out.println("Failed to remove filter: " + filterText);
//					        }
//
//					        WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
//					        Actions actions = new Actions(driver);
//					        actions.doubleClick(blankFields).perform();
//
//					        Thread.sleep(4000);
//					    }
//					
//.........................................................................................
//................................................................................................
	@Test(priority = 10)
	public void CCE_Name_FILTER() throws InterruptedException {
		String[] filters = { "Bharti Rajput" };
		SoftAssert softAssert = new SoftAssert();

		for (String filter : filters) {
			applyFilter11(filter, softAssert);
		}

		softAssert.assertAll(); // Report all collected errors at the end of the test
	}
	

	private void applyFilter11(String filterText, SoftAssert softAssert) throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));
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
			}
		
		System.out.println("Failed to remove filter: " + filterText);
		WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
		System.out.println("second");
		new Actions(driver).doubleClick(blankFields).perform();
		Thread.sleep(2000);
	}

}
