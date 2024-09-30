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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {
	public static WebDriver driver;
	public WebDriverWait wait; 
	

	@SuppressWarnings("deprecation")
	
  //...............................................................................................................	
	@BeforeClass
	public void setup() {
		
		    WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://psfcrm.dealercrm.co.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
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

  //......................................................................................
		@Test(priority=3)
		public void Login_Button () throws InterruptedException {
			    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    WebElement password= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
			    password.click();
			    Thread.sleep(3000);
		}
		//......................................................................................
				@Test(priority=4)				
				public void Click_On_PSF () throws InterruptedException {
					    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					    WebElement PSF= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POST SERVICE FEEDBACK(PSF)\")]")));
					    PSF.click();
					    Thread.sleep(3000);
					    // Define the expected URL
			   	        String expectedURL = "https://psfcrm.dealercrm.co.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0";

			   	        // Wait until the URL is the expected URL
			   	        wait.until(ExpectedConditions.urlToBe(expectedURL));

			   	        // Get the current URL after the click
			   	        String currentURL = driver.getCurrentUrl();
			   	        //System.out.println("currentURL    = " +currentURL  );

			   	        // Print the current URL for debugging purposes
			   	        System.out.println("currentURL = " + currentURL);

			   	        // Compare the current URL with the expected URL
			   	        Assert.assertEquals(expectedURL, currentURL);
					    
			   	       Thread.sleep(3000);
				      }
	//...............................................................................................		
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

//....................................................................................................
				
				@Test(priority = 7)
				public void CCE_Name_FILTER() throws InterruptedException {
				    String[] filters = {"Bharti Rajput"};

				    SoftAssert softAssert = new SoftAssert();

				    for (String filter : filters) {
				        applyFilter1(filter, softAssert);
				    }

				    softAssert.assertAll(); // Report all collected errors at the end of the test
				}

				// This method is to select the filter
				private void applyFilter1(String filterText, SoftAssert softAssert) throws InterruptedException {
				    WebElement filterDropdown = wait.until(ExpectedConditions
				            .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-7\"]")));
				    filterDropdown.click();

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
				    
				    Thread.sleep(1000);
				    WebElement itemsPerPage = wait.until(ExpectedConditions.elementToBeClickable(
				            By.xpath("(//*[@class=\"mat-option-text\"])[4]")));
				    itemsPerPage.click();

				    Thread.sleep(1000);

				    List<String> results = new ArrayList<>();
				    List<String> errors = new ArrayList<>();
				    boolean isNextPageClickable = true;
				    int pageNumber = 0;

				    while (isNextPageClickable) {
				        try {
				            List<WebElement> dataElements = driver
				                    .findElements(By.xpath("//*[contains(text(), \"" + filterText + "\") and not(contains(text(), \"" + filterText + "03/31/2024 00:00:00\"))]"));

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
				            if (nextPage.isEnabled()) {
				                nextPage.click();
				                wait.until(ExpectedConditions.stalenessOf(dataElements.get(0))); // Wait until the page is refreshed
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
				}

				// This method is to remove the filter
				private void removeFilter1(String filterText) throws InterruptedException {
				    WebElement filterDropdown = wait.until(ExpectedConditions
				            .visibilityOfElementLocated(By.cssSelector("[id=\"mat-select-value-7\"]")));
				    filterDropdown.click();

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
				        System.out.println("Failed to remove filter: " + filterText);
				    }

				    WebElement blankFields = driver.findElement(By.cssSelector("[id=\"mat-input-2\"]"));
				    Actions actions = new Actions(driver);
				    actions.doubleClick(blankFields).perform();

				    Thread.sleep(2000);
				}
}

								