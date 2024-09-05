package pSF_REPORTS;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Last_Attempt_Report {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	String z1;
	String z2;
	String z3;
	String z4;
	String z5;
	String z6;
	String z7;
	String z8;
	String z9;
	String z10;
	String z11;
	String z12;
	String z13;

	String d1;
	String d2;
	String d3;
	String d4;
	String d5;
	String d6;
	String d7;
	String d8;
	String d9;
	String d10;
	String d11;
	String d12;
	String d13;


	String w1;
	String w2;
	String w3;
	String w4;
	String w5;
	String w6;
	String w7;
	String w8;
	String w9;
	String w10;
	String w11;
	String w12;
	String w13;

	String day1;
	String day2;
	String day3;
	String day4;
	String day5;
	String day6;
	String day7;
	String day8;
	String day9;
	String day10;
	String day11;
	String day12;
	String day13;
	

	String s1;
	String s2;
	String s3;
	String s4;
	String s5;
	String s6;
	String s7;
	String s8;
	String s9;
	String s10;
	String s11;
	String s12;
	String s13;
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dealercrm.co.in/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);

	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		@Test(priority = 1)
		public void Username() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement Username = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
			Username.sendKeys("North2RSM00001");

			Thread.sleep(2000);
		}

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		@Test(priority = 2)
		public void Password() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement password = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
			password.sendKeys("MarutiCNM#@123");
			Thread.sleep(2000);
		}

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		@Test(priority = 3)
		public void Login_Button() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement password = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
			password.click();
			Thread.sleep(20000);
		}

		// wait for 15 Second and put the captcha code

		// .....................................................................................................

		@Test(priority = 4)
		public void SUBMIT_Button() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement Submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Submit\"]")));
			Submit.click();
			Thread.sleep(5000);

		}

		// ..................................................................................................
		@Test(priority = 5)
		public void Click_On__PSF_Report() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement report = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"PSF-Reports \"]")));
			report.click();
			Thread.sleep(3000);
			
//............................................................................................................
	}
		@Test(priority = 6)
		public void Click_On_Last_attempt_Report() throws InterruptedException {
		    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    WebElement lastAttemptReport = wait.until(
		        ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Last Attempt Report \"]")));
		    
		    // Scroll the element into view using JavaScript
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", lastAttemptReport);
		    
		    // Optionally, wait for a short time to ensure everything is in place
		    Thread.sleep(500); // 0.5 seconds, adjust if necessary
		    
		    // Now click on the element
		    lastAttemptReport.click();
		    
		    Thread.sleep(5000);
		}
		// .........................................................................................................

				@Test(priority = 7)
				public void Zone_Region_Wise() throws InterruptedException {
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));

					// Click on the calendar to open date picker
					WebElement select = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"arrow_drop_down\"])[5]")));
					select.click();
					Thread.sleep(4000);

					// Select start date (1st of the current month)
					LocalDate today = LocalDate.now();
					LocalDate firstDayOfMonth = today.withDayOfMonth(1);
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");


					WebElement selectStart = wait.until(ExpectedConditions.presenceOfElementLocated(
							By.cssSelector("[aria-label=\"" + firstDayOfMonth.format(formatter) + "\"]")));
					selectStart.click();
					Thread.sleep(2000);

					// Select today's date
					WebElement selectToday = wait.until(ExpectedConditions
							.presenceOfElementLocated(By.cssSelector("[aria-label=\"" + today.format(formatter) + "\"]")));
					selectToday.click();
					Thread.sleep(2000);

					// Click on the generate report button
					WebElement clickOnGenerate = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					clickOnGenerate.click();

					Thread.sleep(10000);

					// Try to locate the Totalleads_recived element
					WebElement Total_Disposition;
					try {
						Total_Disposition = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[2]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_Disposition.isDisplayed()||Total_Disposition==null) {
							Assert.fail(
									"No Data Found in Zone Region Wise: Total_Disposition element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Zone Region Wise: Total_Disposition element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_Disposition.isEnabled()) {
						Assert.fail("Total_Disposition element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[3]"));
					WebElement Satisfied_Rating = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[4]"));
					WebElement Dissatified_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[5]"));
					WebElement callME_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[6]"));
					WebElement Not_Intrest_providing_feedback = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[7]"));
					WebElement Wrong_Number = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[8]"));
					WebElement call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[9]"));
					WebElement Psf_Calibration_done = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[10]"));
					WebElement complaint_status_Updated = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[11]"));
					WebElement Appointment_Reschedule = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[12]"));
					WebElement PSF_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[13]"));
					WebElement Adhoc_Complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[14]"));


					Thread.sleep(4000);

					z1 = Total_Disposition.getText();
					System.out.println("Total_Disposition of Zone and region wise ::" + z1);

					z2 = Psf_done.getText();
					z3 = Satisfied_Rating.getText();
					z4 = Dissatified_rating.getText();
					z5 = callME_Later.getText();
					z6 = Not_Intrest_providing_feedback.getText();
					z7 = Wrong_Number.getText();
					z8 = call_not_Connected.getText();
					z9 = Psf_Calibration_done.getText();
					z10 = complaint_status_Updated.getText();
					z11 = Appointment_Reschedule.getText();
					z12 = PSF_Done.getText();
					z13 = Adhoc_Complaints.getText();
					

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(z1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found for Zone_Region_wise_Wise  Total_Disposition:: " + z1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found for Zone_Region_Wise of Total_Disposition: " + e.getMessage());
					}
				}
				//......................................................................................................................		    
				@Test(priority = 8)
			    public void Dealer_Parent_Group_Wise_Tab() throws InterruptedException {
					 Thread.sleep(7000);
					    wait = new WebDriverWait(driver, Duration.ofSeconds(5));

					    WebElement Dealer_Parent_Group_Wise = wait.until(
					            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Dealer Parent Group Wise\"]")));
					    Dealer_Parent_Group_Wise.click();
					    Thread.sleep(3000);

					    // Click on the calendar to open date picker
					    WebElement select = wait
					            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"arrow_drop_down\"])[5]")));
					    select.click();
					    Thread.sleep(3000);

					    // Select start date (1st of the current month)
					    LocalDate today = LocalDate.now();
					    LocalDate firstDayOfMonth = today.withDayOfMonth(1);
					    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

					    WebElement selectStart = wait.until(ExpectedConditions.presenceOfElementLocated(
					            By.cssSelector("[aria-label=\"" + firstDayOfMonth.format(formatter) + "\"]")));
					    selectStart.click();
					    Thread.sleep(2000);

					    // Select today's date
					    WebElement selectToday = wait.until(ExpectedConditions
					            .presenceOfElementLocated(By.cssSelector("[aria-label=\"" + today.format(formatter) + "\"]")));
					    selectToday.click();
					    Thread.sleep(2000);

					    // Click on the generate report button
					    WebElement clickOnGenerate = wait
					            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					    clickOnGenerate.click();
					    Thread.sleep(31000);	        
					    // Check if Items per page can be set to 100
					    try {
					        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-3\"]"));
					        if (Items_Per_page.isDisplayed()) {
					            Items_Per_page.click();
					            Thread.sleep(2000);

					            WebElement click_On_Hundred = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
					            click_On_Hundred.click();
					            Thread.sleep(3000);
					        }
					    } catch (NoSuchElementException e) {
					        System.out.println("Pagination is disabled or less than 100 items are available.");
					    }

			        
			        boolean lastPageReached = false;

			        while (!lastPageReached) {
			            // Check if the next page button is disabled
			            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[6]"));
			            
			            if (!nextPageButton.isEnabled()) {
			                lastPageReached = true;
			            } else {
			                // Click on the next page button
			                nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[6]"));
			                nextPageButton.click();
			                Thread.sleep(3000);
			            }
			        }
			        
			        
			        // Proceed with the rest of your element locators and text retrievals
				    WebElement Total_Disposition = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));

				    // Check if Total_Disposition element is displayed and not null
				    if (Total_Disposition != null && Total_Disposition.isDisplayed()) {
				        d1 = Total_Disposition.getText();
				        System.out.println("Total dispostion of Dealer_Parent_Group_Wise ::" + d1);
				    } else {
				        Assert.fail("No data found for Dealer Parent Group Wise");
				    }
			        WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
				    WebElement Satisfied_Rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
				    WebElement Dissatified_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
				    WebElement callME_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
				    WebElement Not_Intrest_providing_feedback = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
				    WebElement Wrong_Number = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
				    WebElement call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
				    WebElement Psf_Calibration_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
				    WebElement complaint_status_Updated = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
				    WebElement Appointment_Reschedule = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
				    WebElement PSF_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
				    WebElement Adhoc_Complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));

				    Thread.sleep(2000);
				    if (Total_Disposition.isDisplayed()) {
				        d1 = Total_Disposition.getText();
				     //   System.out.println("Dealer_Parent_Group_Wise ::" + d1);
				    } else {
				        Assert.fail("no data found for Dealer_Parent_Group_Wise");
				    }

				    d2 = Psf_done.getText();
				    d3 = Satisfied_Rating.getText();
				    d4 = Dissatified_rating.getText();
				    d5 = callME_Later.getText();
				    d6 = Not_Intrest_providing_feedback.getText();
				    d7 = Wrong_Number.getText();
				    d8 = call_not_Connected.getText();
				    d9 = Psf_Calibration_done.getText();
				    d10 = complaint_status_Updated.getText();
				    d11 = Appointment_Reschedule.getText();
				    d12 = PSF_Done.getText();
				    d13 = Adhoc_Complaints.getText();

			    	
			        try {
			       
			            // Parse the Total Disposition value to a numeric type
			            double totalDisposition = Double.parseDouble(d1);
			            
			            if (totalDisposition <= 0 || d1==null) {
			                // Fail the test if Total Disposition value is 0 or less
			                Assert.fail("No Data Found for Dealer Parent Group Wise: " + d1);
			            } else {
			                // Print the Total Disposition value
			                System.out.println("'Total Dispositions' column value of Dealer Parent Group Wise Tab is::: " + d1);
			            }

			        } catch (Exception e) {
			            // Fail the test if an exception is thrown
			            Assert.fail("No Data Found for Dealer Parent Group Wise Tab " + e.getMessage());
			        }
			    }
				//......................................................................................................................		    
				@Test(priority = 9)
			    public void Workshop_Wise_Tab() throws InterruptedException {
					  Thread.sleep(7000);
					    wait = new WebDriverWait(driver, Duration.ofSeconds(5));

					    WebElement Workshop_Wise = wait.until(
					            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Workshop Wise \"]")));
					    Workshop_Wise.click();
					    Thread.sleep(3000);

					    // Click on the calendar to open date picker
					    WebElement select = wait
					            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"arrow_drop_down\"])[5]")));
					    select.click();
					    Thread.sleep(3000);

					    // Select start date (1st of the current month)
					    LocalDate today = LocalDate.now();
					    LocalDate firstDayOfMonth = today.withDayOfMonth(1);
					    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

					    WebElement selectStart = wait.until(ExpectedConditions.presenceOfElementLocated(
					            By.cssSelector("[aria-label=\"" + firstDayOfMonth.format(formatter) + "\"]")));
					    selectStart.click();
					    Thread.sleep(2000);

					    // Select today's date
					    WebElement selectToday = wait.until(ExpectedConditions
					            .presenceOfElementLocated(By.cssSelector("[aria-label=\"" + today.format(formatter) + "\"]")));
					    selectToday.click();
					    Thread.sleep(2000);

					    // Click on the generate report button
					    WebElement clickOnGenerate = wait
					            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					    clickOnGenerate.click();
					    
					    Thread.sleep(26000);	        
					    // Check if Items per page can be set to 100
					    try {
					        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-1\"]"));
					        if (Items_Per_page.isDisplayed()) {
					            Items_Per_page.click();
					            Thread.sleep(2000);

					            WebElement click_On_Hundred = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
					            click_On_Hundred.click();
					            Thread.sleep(3000);
					        }
					    } catch (NoSuchElementException e) {
					        System.out.println("Pagination is disabled or less than 100 items are available.");
					    }

			        
			        boolean lastPageReached = false;

			        while (!lastPageReached) {
			            // Check if the next page button is disabled
			            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[4]"));
			            
			            if (!nextPageButton.isEnabled()) {
			                lastPageReached = true;
			            } else {
			                // Click on the next page button
			                nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[4]"));
			                nextPageButton.click();
			                Thread.sleep(3000);
			            }
			        }
			        
			        
			        // Proceed with the rest of your element locators and text retrievals
				    WebElement Total_Disposition = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));

				    // Check if Total_Disposition element is displayed and not null
				    if (Total_Disposition != null && Total_Disposition.isDisplayed()) {
				        w1 = Total_Disposition.getText();
				        System.out.println("Total disposition of workshop wise ::" + w1);
				    } else {
				        Assert.fail("No data found for workshop wise");
				    }
				    WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
				    WebElement Satisfied_Rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
				    WebElement Dissatified_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
				    WebElement callME_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
				    WebElement Not_Intrest_providing_feedback = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
				    WebElement Wrong_Number = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
				    WebElement call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
				    WebElement Psf_Calibration_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
				    WebElement complaint_status_Updated = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
				    WebElement Appointment_Reschedule = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
				    WebElement PSF_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
				    WebElement Adhoc_Complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));

				    Thread.sleep(2000);

				    if (Total_Disposition.isDisplayed()) {
				        w1 = Total_Disposition.getText();
				     //   System.out.println("Dealer_Parent_Group_Wise ::" + d1);
				    } else {
				        Assert.fail("no data found for Workshop_Wise");
				    }

				    w2 = Psf_done.getText();
				    w3 = Satisfied_Rating.getText();
				    w4 = Dissatified_rating.getText();
				    w5 = callME_Later.getText();
				    w6 = Not_Intrest_providing_feedback.getText();
				    w7 = Wrong_Number.getText();
				    w8 = call_not_Connected.getText();
				    w9 = Psf_Calibration_done.getText();
				    w10 = complaint_status_Updated.getText();
				    w11 = Appointment_Reschedule.getText();
				    w12 = PSF_Done.getText();
				    w13 = Adhoc_Complaints.getText();

				    Thread.sleep(5000);

			    	
			        try {
			       
			            // Parse the Total Disposition value to a numeric type
			            double totalDisposition = Double.parseDouble(w1);
			            
			            if (totalDisposition <= 0 || w1==null) {
			                // Fail the test if Total Disposition value is 0 or less
			                Assert.fail("No Data Found for Workshop_Wise: " + w1);
			            } else {
			                // Print the Total Disposition value
			               // System.out.println("'Total Dispositions' column value ofWorkshop_Wise Tab is::: " + w1);
			            }

			        } catch (Exception e) {
			            // Fail the test if an exception is thrown
			            Assert.fail("No Data Found for Workshop_Wise Tab " + e.getMessage());
			        }
			    }
				//......................................................................................................................		    
				@Test(priority = 11)
			    public void Day_Wise_Tab() throws InterruptedException {
					  Thread.sleep(7000);
					    wait = new WebDriverWait(driver, Duration.ofSeconds(5));

					    WebElement Day_Wise = wait
								.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Day Wise \"]")));
						Day_Wise.click();
						Thread.sleep(3000);
		      //  1.  ..................................select All fillter...................................................................................
					    WebElement zone = driver.findElement(By.cssSelector("[id=\"mat-select-value-13\"]"));
					    zone.click();
					    Thread.sleep(2000);
					    
					    WebElement Select_ALL1 = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[1]"));
					    Select_ALL1.click();			    
					    Thread.sleep(2000);
			 //   2.  ......................................................................    
					    WebElement Region = driver.findElement(By.cssSelector("[id=\"mat-select-value-15\"]"));
					    Actions actions = new Actions(driver);
					    actions.doubleClick(Region).perform();
					    Thread.sleep(2000);
					    WebElement Select_ALL2 = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[1]"));
					    Select_ALL2.click();
					    
					    Thread.sleep(2000);
			//    3.   ....................................................................................   
					    WebElement Select_dealaer_parent = driver.findElement(By.cssSelector("[id=\"mat-select-value-17\"]"));
					    Actions actions1 = new Actions(driver);
					    actions1.doubleClick(Select_dealaer_parent).perform();
					    
					    Thread.sleep(2000);
					    WebElement Select_ALL3 = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[1]"));
					    Select_ALL3.click();
					    
					    Thread.sleep(2000);
			//    4.  ...........................................................................................   
					    WebElement Select_Workshop = driver.findElement(By.cssSelector("[id=\"mat-select-value-19\"]"));
					    Actions actions2 = new Actions(driver);
					    actions2.doubleClick(Select_Workshop).perform();
					    Thread.sleep(2000);
					    
					    WebElement Select_ALL4 = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[1]"));
					    Select_ALL4.click();
					    Thread.sleep(2000);
						//.....................................................................................................................

					    // Click on the calendar to open date picker
					    WebElement select = wait
					            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"arrow_drop_down\"])[5]")));
					    Actions actions4 = new Actions(driver);
					    actions4.doubleClick(select).perform();
					    Thread.sleep(2000);

					    // Select start date (1st of the current month)
					    LocalDate today = LocalDate.now();
					    LocalDate firstDayOfMonth = today.withDayOfMonth(1);
					    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

					    WebElement selectStart = wait.until(ExpectedConditions.presenceOfElementLocated(
					            By.cssSelector("[aria-label=\"" + firstDayOfMonth.format(formatter) + "\"]")));
					    selectStart.click();
					    Thread.sleep(2000);

					    // Select today's date
					    WebElement selectToday = wait.until(ExpectedConditions
					            .presenceOfElementLocated(By.cssSelector("[aria-label=\"" + today.format(formatter) + "\"]")));
					    selectToday.click();
					    Thread.sleep(2000);

					    // Click on the generate report button
					    WebElement clickOnGenerate = wait
					            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					    clickOnGenerate.click();
					    
					    Thread.sleep(26000);	        
					    // Check if Items per page can be set to 100
					    try {
					        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-5\"]"));
					        if (Items_Per_page.isDisplayed()) {
					            Items_Per_page.click();
					            Thread.sleep(2000);

					            WebElement click_On_Hundred = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
					            click_On_Hundred.click();
					            Thread.sleep(3000);
					        }
					    } catch (NoSuchElementException e) {
					        System.out.println("Pagination is disabled or less than 100 items are available.");
					    }

			        
			        boolean lastPageReached = true;

			        while (!lastPageReached) {
			            // Check if the next page button is disabled
			            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[6]"));
			            
			            if (!nextPageButton.isEnabled()) {
			                lastPageReached = false;
			            } else {
			                // Click on the next page button
			                nextPageButton = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[6]"));
			                nextPageButton.click();
			               
			            }
			            }
			        Thread.sleep(2000);     
			        // Proceed with the rest of your element locators and text retrievals
				    WebElement Total_Disposition = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

				    // Check if Total_Disposition element is displayed and not null
				    if (Total_Disposition != null && Total_Disposition.isDisplayed()) {
				        day1 = Total_Disposition.getText();
				        System.out.println("Total dispostions of Day_Wise ::" + day1);
				    } else {
				        Assert.fail("No data found for Day_Wise");
				    }
				    WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
				    WebElement Satisfied_Rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
				    WebElement Dissatified_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
				    WebElement callME_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
				    WebElement Not_Intrest_providing_feedback = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
				    WebElement Wrong_Number = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
				    WebElement call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
				    WebElement Psf_Calibration_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
				    WebElement complaint_status_Updated = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
				    WebElement Appointment_Reschedule = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
				    WebElement PSF_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
				    WebElement Adhoc_Complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));

				    Thread.sleep(2000);

				    if (Total_Disposition.isDisplayed()) {
				        day1 = Total_Disposition.getText();
				     //   System.out.println("Dealer_Parent_Group_Wise ::" + d1);
				    } else {
				        Assert.fail("no data found for Day_Wise");
				    }

				    day2 = Psf_done.getText();
				    day3 = Satisfied_Rating.getText();
				    day4 = Dissatified_rating.getText();
				    day5 = callME_Later.getText();
				    day6 = Not_Intrest_providing_feedback.getText();
				    day7 = Wrong_Number.getText();
				    day8 = call_not_Connected.getText();
				    day9 = Psf_Calibration_done.getText();
				    day10 = complaint_status_Updated.getText();
				    day11 = Appointment_Reschedule.getText();
				    day12 = PSF_Done.getText();
				    day13 = Adhoc_Complaints.getText();

				    Thread.sleep(5000);

			    	
			        try {
			       
			            // Parse the Total Disposition value to a numeric type
			            double totalDisposition = Double.parseDouble(day1);
			            
			            if (totalDisposition <= 0 || day1==null) {
			                // Fail the test if Total Disposition value is 0 or less
			                Assert.fail("No Data Found for Day_Wise: " + day1);
			            } else {
			                // Print the Total Disposition value
			             //   System.out.println("'Total Dispositions' column value Day_Wise Tab is::: " + day1);
			            }

			        } catch (Exception e) {
			            // Fail the test if an exception is thrown
			            Assert.fail("No Data Found for Day_Wise Tab " + e.getMessage());
			        }
			        
			    				    
			    }
				
				//......................................................................................................................		    
				@Test(priority = 12)
			    public void Service_Type_Wise_Tab() throws InterruptedException {
					  Thread.sleep(7000);
					    wait = new WebDriverWait(driver, Duration.ofSeconds(5));

					    WebElement Service_Type_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Service Type Wise\"]")));
				        Service_Type_Wise.click();
				        Thread.sleep(3000);
		      		    
						//.....................................................................................................................

					    // Click on the calendar to open date picker
					    WebElement select = wait
					            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"arrow_drop_down\"])[5]")));
					    select.click();
					    Thread.sleep(2000);

					    // Select start date (1st of the current month)
					    LocalDate today = LocalDate.now();
					    LocalDate firstDayOfMonth = today.withDayOfMonth(1);
					    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

					    WebElement selectStart = wait.until(ExpectedConditions.presenceOfElementLocated(
					            By.cssSelector("[aria-label=\"" + firstDayOfMonth.format(formatter) + "\"]")));
					    selectStart.click();
					    Thread.sleep(2000);

					    // Select today's date
					    WebElement selectToday = wait.until(ExpectedConditions
					            .presenceOfElementLocated(By.cssSelector("[aria-label=\"" + today.format(formatter) + "\"]")));
					    selectToday.click();
					    Thread.sleep(2000);

					    // Click on the generate report button
					    WebElement clickOnGenerate = wait
					            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					    clickOnGenerate.click();
					    
					    Thread.sleep(26000);	        
					    // Check if Items per page can be set to 100
					    try {
					        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-7\"]"));
					        if (Items_Per_page.isDisplayed()) {
					            Items_Per_page.click();
					            Thread.sleep(2000);

					            WebElement click_On_Hundred = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[4]"));
					            click_On_Hundred.click();
					            Thread.sleep(3000);
					        }
					    } catch (NoSuchElementException e) {
					        System.out.println("Pagination is disabled or less than 100 items are available.");
					    }

			        
			        boolean lastPageReached = true;

			        while (!lastPageReached) {
			            // Check if the next page button is disabled
			            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[8]"));
			            
			            if (!nextPageButton.isEnabled()) {
			                lastPageReached = false;
			            } else {
			                // Click on the next page button
			                nextPageButton = driver.findElement(By.xpath("(//*[@class=\"mat-paginator-icon\"])[6]"));
			                nextPageButton.click();
			               
			            }
			            }
			        Thread.sleep(2000);     
			        // Proceed with the rest of your element locators and text retrievals
				    WebElement Total_Disposition = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

				    // Check if Total_Disposition element is displayed and not null
				    if (Total_Disposition != null && Total_Disposition.isDisplayed()) {
				        s1 = Total_Disposition.getText();
				        System.out.println("Total dispostions of Service_Type_Wise ::" + s1);
				    } else {
				        Assert.fail("No data found for Service_Type_Wise");
				    }
				    WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
				    WebElement Satisfied_Rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
				    WebElement Dissatified_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
				    WebElement callME_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
				    WebElement Not_Intrest_providing_feedback = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
				    WebElement Wrong_Number = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
				    WebElement call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
				    WebElement Psf_Calibration_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
				    WebElement complaint_status_Updated = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
				    WebElement Appointment_Reschedule = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
				    WebElement PSF_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
				    WebElement Adhoc_Complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));

				    Thread.sleep(2000);

				    if (Total_Disposition.isDisplayed()) {
				        s1 = Total_Disposition.getText();
				     //   System.out.println("Dealer_Parent_Group_Wise ::" + d1);
				    } else {
				        Assert.fail("no data found for Service_Type_Wise");
				    }

				    s2 = Psf_done.getText();
				    s3 = Satisfied_Rating.getText();
				    s4 = Dissatified_rating.getText();
				    s5 = callME_Later.getText();
				    s6 = Not_Intrest_providing_feedback.getText();
				    s7 = Wrong_Number.getText();
				    s8 = call_not_Connected.getText();
				    s9 = Psf_Calibration_done.getText();
				    s10 = complaint_status_Updated.getText();
				    s11 = Appointment_Reschedule.getText();
				    s12 = PSF_Done.getText();
				    s13 = Adhoc_Complaints.getText();

				    Thread.sleep(5000);

			    	
			        try {
			       
			            // Parse the Total Disposition value to a numeric type
			            double totalDisposition = Double.parseDouble(s1);
			            
			            if (totalDisposition <= 0 || s1==null) {
			                // Fail the test if Total Disposition value is 0 or less
			                Assert.fail("No Data Found for Service_Type_Wise: " + s1);
			            } else {
			                // Print the Total Disposition value
			              //  System.out.println("'Total Dispositions' column value Service_Type_Wise Tab is::: " + day1);
			            }

			        } catch (Exception e) {
			            // Fail the test if an exception is thrown
			            Assert.fail("No Data Found for Service_Type_Wise Tab " + e.getMessage());
			        }
			    }
				
				//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				
				@Test(priority = 12)
				public void Compare_Total_dispostion_Of_ZONE_Region_Wise_from__Dealer_Parent_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, d1);
				}
				//..............................................................................................
				@Test(priority = 13)
				public void Compare_Total_dispostion_Of_ZONE_Region_Wise_from_Worshop_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, w1);
				}
				//..............................................................................................
				@Test(priority = 14)
				public void Compare_Total_dispostion_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, day1);
				}
				//..............................................................................................
				@Test(priority = 15)
				public void Compare_Total_dispostion_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, s1);
				}
				//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				//..............................................................................................
					@Test(priority = 16)
					public void Compare_Psf_done_Of_ZONE_Region_Wise_from_Dealer_parent_group_Wise() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertEquals(z2, d2);
					}
				//..............................................................................................
							@Test(priority = 17)
							public void Compare_Psf_done_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, w2);
							}
					//..............................................................................................
							@Test(priority = 18)
							public void Compare_Psf_done_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, day2);
							}
					//..............................................................................................
							@Test(priority = 19)
							public void Compare_Psf_done_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, s2);
							}
					//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 20)
							public void Compare_Satisfied_Rating_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z3, d3);
							}
							//..............................................................................................
							@Test(priority = 21)
							public void Compare_Satisfied_Rating_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z3, w3);
							}
					      //..............................................................................................
							@Test(priority = 22)
							public void Compare_Satisfied_Rating_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z3, day3);
							}
					      //..............................................................................................
							@Test(priority = 23)
							public void Compare_Satisfied_Rating_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z3, s3);
							}
			         //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 24)
							public void Compare_DisSatisfied_Rating_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, d4);
							}
							//..............................................................................................
							@Test(priority = 25)
							public void Compare_DisSatisfied_Rating_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, w4);
							}
					      //..............................................................................................
							@Test(priority = 26)
							public void Compare_DisSatisfied_Rating_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, day4);
							}
					      //..............................................................................................
							@Test(priority = 27)
							public void Compare_DisSatisfied_Rating_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, s4);
							}

			    //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 28)
							public void Compare_callME_Later_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z5, d5);
							}
							//..............................................................................................
							@Test(priority = 29)
							public void Compare_callME_Later_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z5, w5);
							}
					      //..............................................................................................
							@Test(priority = 30)
							public void Compare_callME_Later_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z5, day5);
							}
					      //..............................................................................................
							@Test(priority = 31)
							public void Compare_callME_Later_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z5, s5);
							}
			     //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 32)
							public void Compare_Not_Intrest_providing_feedback_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, d6);
							}
							//..............................................................................................
							@Test(priority = 33)
							public void Compare_Not_Intrest_providing_feedback_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, w6);
							}
					      //..............................................................................................
							@Test(priority = 34)
							public void Compare_Not_Intrest_providing_feedback_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, day6);
							}
					      //..............................................................................................
							@Test(priority = 35)
							public void Compare_Not_Intrest_providing_feedback_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, s6);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 36)
							public void Compare_Wrong_Number_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, d7);
							}
							//..............................................................................................
							@Test(priority = 37)
							public void Compare_Wrong_Number_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, w7);
							}
					      //..............................................................................................
							@Test(priority = 38)
							public void Compare_Wrong_Number_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, day7);
							}
					      //..............................................................................................
							@Test(priority = 39)
							public void Compare_Wrong_Number_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, s7);
							}
			   //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 40)
							public void Compare_call_not_Connected_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, d8);
							}
							//..............................................................................................
							@Test(priority = 41)
							public void Compare_call_not_Connected_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, w8);
							}
					      //..............................................................................................
							@Test(priority = 42)
							public void Compare_call_not_Connected_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, day8);
							}
					      //..............................................................................................
							@Test(priority = 43)
							public void Compare_call_not_Connected_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, s8);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 44)
							public void Compare_Psf_Calibration_done_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, d9);
							}
							//..............................................................................................
							@Test(priority = 45)
							public void Compare_Psf_Calibration_done_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, w9);
							}
					      //..............................................................................................
							@Test(priority = 46)
							public void Compare_Psf_Calibration_done_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, day9);
							}
					      //..............................................................................................
							@Test(priority = 47)
							public void Compare_Psf_Calibration_done_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, s9);
							}
							
			            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 48)
							public void Compare_complaint_status_Updated_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, d10);
							}
							//..............................................................................................
							@Test(priority = 49)
							public void Compare_complaint_status_Updated_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, w10);
							}
					      //..............................................................................................
							@Test(priority = 50)
							public void Compare_complaint_status_Updated_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, day10);
							}
					      //..............................................................................................
							@Test(priority = 51)
							public void Compare_complaint_status_Updated_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, s10);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 52)
							public void Compare_Appointment_Reschedule_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, d11);
							}
							//..............................................................................................
							@Test(priority = 53)
							public void Compare_Appointment_Reschedule_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, w11);
							}
					      //..............................................................................................
							@Test(priority = 54)
							public void Compare_Appointment_Reschedule_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, day11);
							}
					      //..............................................................................................
							@Test(priority = 55)
							public void Compare_Appointment_Reschedule_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, s11);
							}
							
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 56)
							public void Compare_PSF_Done_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, d12);
							}
							//..............................................................................................
							@Test(priority = 57)
							public void Compare_PSF_Done_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, w12);
							}
					      //..............................................................................................
							@Test(priority = 58)
							public void Compare_PSF_Done_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, day12);
							}
					      //..............................................................................................
							@Test(priority = 59)
							public void Compare_PSF_Done_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, s12);
							}
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 60)
							public void Compare_Adhoc_Complaints_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, d13);
							}
							//..............................................................................................
							@Test(priority = 61)
							public void Compare_Adhoc_Complaints_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, w13);
							}
					      //..............................................................................................
							@Test(priority = 62)
							public void Compare_Adhoc_Complaints_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, day13);
							}
					      //..............................................................................................
							@Test(priority = 63)
							public void Compare_Adhoc_Complaints_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, s13);
							}
			      //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

          }
