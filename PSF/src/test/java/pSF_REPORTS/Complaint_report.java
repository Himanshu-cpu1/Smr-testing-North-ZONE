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

public class Complaint_report {
	
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
	String z14;
	String z15;
	

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
	String d14;
	String d15;
	


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
	String w14;
	String w15;
	

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
	String day14;
	String day15;
	
	

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
	String s14;
	String s15;
			
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
		public void Click_On_Complaint_Report() throws InterruptedException {
		    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    WebElement Complainteport = wait.until(
		        ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Complaint Report \"]")));
		    
		    // Scroll the element into view using JavaScript
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", Complainteport);
		    
		    // Optionally, wait for a short time to ensure everything is in place
		    Thread.sleep(500); // 0.5 seconds, adjust if necessary
		    
		    // Now click on the element
		    Complainteport.click();
		    
		    Thread.sleep(5000);
		}
		
		// .........................................................................................................

				@Test(priority = 7)
				public void Zone_Region_Wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					
					
		            //...............................................................................................
											
					// Click on the calendar to open date picker
					WebElement select = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-label=\"Open calendar\"]")));
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
				
					
		            //...............................................................................................						
					
					// Click on the generate report button
					WebElement clickOnGenerate = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					Actions actions2 =new Actions(driver);
					actions2.doubleClick(clickOnGenerate).perform();
					Thread.sleep(10000);
		      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					
					// Try to locate the Totalleads_recived element
					WebElement Total_complaint;
					try {
						Total_complaint = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[2]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_complaint.isDisplayed()||Total_complaint==null) {
							Assert.fail(
									"No Data Found in Zone Region Wise: Total_complaint element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Zone Region Wise: Total_complaint element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_complaint.isEnabled()) {
						Assert.fail("Total_complaint element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement KARA_Adhoc_complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[3]"));
					WebElement KARA_post_Psf_calibration = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[4]"));
					WebElement KARA_Open = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[5]"));
					WebElement KARA_In_progress = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[6]"));
					WebElement KARA_resolved = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[7]"));
					WebElement KARA_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[8]"));
					WebElement CCE_OPEN_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[9]"));
					WebElement CCE_In_progress_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[10]"));
					WebElement CCE_Resloved_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[11]"));
					WebElement CCE_Closed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[12]"));
					WebElement AMIE_OPEN_3= driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[13]"));
					WebElement AMIE_In_progress_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[14]"));
					WebElement AMIE_Resolved_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[15]"));
					WebElement AMIE_Closed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[16]"));
				
					Thread.sleep(4000);

					z1 = Total_complaint.getText();
					System.out.println("Total_complaint of Zone and region wise ::" + z1);

					z2 = KARA_Adhoc_complaints.getText();
					z3 = KARA_post_Psf_calibration.getText();
					z4 = KARA_Open.getText();
					z5 = KARA_In_progress.getText();
					z6 = KARA_resolved.getText();
					z7 = KARA_Closed.getText();
					z8 = CCE_OPEN_2.getText();
					z9 = CCE_In_progress_2.getText();
					z10 = CCE_Resloved_2.getText();
					z11 = CCE_Closed_2.getText();
					z12 = AMIE_OPEN_3.getText();
					z13 = AMIE_In_progress_3.getText();
					z14 = AMIE_Resolved_3.getText();
					z15 = AMIE_Closed_3.getText();
					

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(z1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found for Total_complaint of  Zone_Region_Wise of Total_complaint: " + z1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found for Total_complaint of  Zone_Region_Wise of Total_complaint: " + e.getMessage());
					}
				}
				// .........................................................................................................
				// .........................................................................................................

				@Test(priority = 8)
				public void Dealer_Parent_Group_Wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					 WebElement Dealer_Parent_Group_Wise = wait.until(
					            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Dealer Parent Group Wise\"]")));
					    Dealer_Parent_Group_Wise.click();
					    Thread.sleep(3000);
		            //...............................................................................................						
					
					// Click on the generate report button
					WebElement clickOnGenerate = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					Actions actions2 =new Actions(driver);
					actions2.doubleClick(clickOnGenerate).perform();
					Thread.sleep(10000);
					
					 // Check if Items per page can be set to 100
				    try {
				        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-9\"]"));
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
		            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[9]"));
		            
		            if (!nextPageButton.isEnabled()) {
		                lastPageReached = true;
		            } else {
		                // Click on the next page button
		             //   nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[11]"));
		                nextPageButton.click();
		                Thread.sleep(3000);
		            }
		        }
		        
		      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					
					// Try to locate the Totalleads_recived element
					WebElement Total_complaint;
					try {
						Total_complaint = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_complaint.isDisplayed()||Total_complaint==null) {
							Assert.fail(
									"No Data Found in Dealer_Parent_Group_Wise: Total_complaint element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Dealer_Parent_Group_Wise: Total_complaint element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_complaint.isEnabled()) {
						Assert.fail("Dealer_Parent_Group_Wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement KARA_Adhoc_complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement KARA_post_Psf_calibration = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement KARA_Open = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement KARA_In_progress = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement KARA_resolved = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement KARA_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement CCE_OPEN_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement CCE_In_progress_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement CCE_Resloved_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement CCE_Closed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement AMIE_OPEN_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement AMIE_In_progress_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement AMIE_Resolved_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement AMIE_Closed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					

					Thread.sleep(4000);

					d1 = Total_complaint.getText();
					System.out.println("Dealer_Parent_Group_Wise of Total_complaint    ::" + d1);

					d2 = KARA_Adhoc_complaints.getText();
					d3 = KARA_post_Psf_calibration.getText();
					d4 = KARA_Open.getText();
					d5 = KARA_In_progress.getText();
					d6 = KARA_resolved.getText();
					d7 = KARA_Closed.getText();
					d8 = CCE_OPEN_2.getText();
					d9 = CCE_In_progress_2.getText();
					d10 = CCE_Resloved_2.getText();
					d11 = CCE_Closed_2.getText();
					d12 = AMIE_OPEN_3.getText();
					d13 = AMIE_In_progress_3.getText();
					d14 = AMIE_Resolved_3.getText();
					d15 = AMIE_Closed_3.getText();
				

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(d1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found of Total_complaint for Dealer_Parent_Group_Wise:: " + d1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found of Total_complaint for Dealer_Parent_Group_Wise:: " + e.getMessage());
					}
				}
				// .........................................................................................................

				@Test(priority = 9)
				public void Workshop_Wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					 WebElement Workshop_Wise = wait.until(
					            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Workshop Wise \"]")));
					 Workshop_Wise.click();
					    Thread.sleep(3000);
		            //...............................................................................................						
					
					// Click on the generate report button
					WebElement clickOnGenerate = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					Actions actions2 =new Actions(driver);
					actions2.doubleClick(clickOnGenerate).perform();
					Thread.sleep(10000);
					
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

		        
		        boolean lastPageReached = false;

		        while (!lastPageReached) {
		            // Check if the next page button is disabled
		            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[7]"));
		            
		            if (!nextPageButton.isEnabled()) {
		                lastPageReached = true;
		            } else {
		                // Click on the next page button
		             //   nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[11]"));
		                nextPageButton.click();
		                Thread.sleep(3000);
		            }
		        }
		        
		      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					
					// Try to locate the Totalleads_recived element
					WebElement Total_complaint;
					try {
						Total_complaint = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_complaint.isDisplayed()||Total_complaint==null) {
							Assert.fail(
									"No Data Found in Workshop_Wise: Total_complaint element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Workshop_Wise: Total_complaint element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_complaint.isEnabled()) {
						Assert.fail("Workshop_Wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement KARA_Adhoc_complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement KARA_post_Psf_calibration = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement KARA_Open = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement KARA_In_progress = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement KARA_resolved = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement KARA_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement CCE_OPEN_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement CCE_In_progress_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement CCE_Resloved_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement CCE_Closed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement AMIE_OPEN_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement AMIE_In_progress_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement AMIE_Resolved_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement AMIE_Closed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
					

					Thread.sleep(4000);

					w1 = Total_complaint.getText();
					System.out.println("Workshop_Wise of Total_complaint    ::" + w1);

					w2 = KARA_Adhoc_complaints.getText();
					w3 = KARA_post_Psf_calibration.getText();
					w4 = KARA_Open.getText();
					w5 = KARA_In_progress.getText();
					w6 = KARA_resolved.getText();
					w7 = KARA_Closed.getText();
					w8 = CCE_OPEN_2.getText();
					w9 = CCE_In_progress_2.getText();
					w10 = CCE_Resloved_2.getText();
					w11 = CCE_Closed_2.getText();
					w12 = AMIE_OPEN_3.getText();
					w13 = AMIE_In_progress_3.getText();
					w14 = AMIE_Resolved_3.getText();
					w15 = AMIE_Closed_3.getText();
				

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(w1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found of Total_complaint for Workshop_Wise:: " + w1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found of Total_complaint for Workshop_Wise:: " + e.getMessage());
					}
				}
				
				// .........................................................................................................

				@Test(priority = 10)
				public void Day_Wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					 WebElement Workshop_Wise = wait.until(
					            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Day Wise \"]")));
					 Workshop_Wise.click();
					    Thread.sleep(3000);
					    
		            //...................Select Required Fillter............................................................................						
					  //1.  .........................click on  select_zone and select All..........................
						WebElement select_zone = wait
								.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-17")));
						select_zone.click();
						Thread.sleep(2000);
						
						WebElement All = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
						All.click();
						
						Thread.sleep(2000);
				//2.   .........................click on  select_Region and select All..........................
						WebElement select_region = wait
								.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-19")));
						
						Actions action =new Actions(driver);
						action.doubleClick(select_region).perform();						
						Thread.sleep(2000);
						
						
						WebElement All2 = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
						All2.click();						
						Thread.sleep(5000);
						
				//  3 ..........................click on  Dealer parent group and select All..........................
						WebElement select_Dealer_Parent = wait
								.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-21")));
						
						Actions action2 =new Actions(driver);
						action2.doubleClick(select_Dealer_Parent).perform();						
						Thread.sleep(2000);
						
						WebElement All3 = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
						All3.click();						
						Thread.sleep(6000);
						
				// 4.  ..........................click on  Workshop and select All..........................
						WebElement Workshop = wait
								.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-23")));
						
						Actions action3 =new Actions(driver);
						action3.doubleClick(Workshop).perform();						
						Thread.sleep(2000);
						
						WebElement All4 = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
						All4.click();						
						Thread.sleep(2000);
		            //...............................................................................................						
					
					// Click on the generate report button
					WebElement clickOnGenerate = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					Actions actions2 =new Actions(driver);
					actions2.doubleClick(clickOnGenerate).perform();
					Thread.sleep(10000);
					
					 // Check if Items per page can be set to 100
				    try {
				        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-11\"]"));
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
		            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[11]"));
		            
		            if (!nextPageButton.isEnabled()) {
		                lastPageReached = true;
		            } else {
		                // Click on the next page button
		             //   nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[11]"));
		                nextPageButton.click();
		                Thread.sleep(3000);
		            }
		        }
		        
		      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					
					// Try to locate the Totalleads_recived element
					WebElement Total_complaint;
					try {
						Total_complaint = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_complaint.isDisplayed()||Total_complaint==null) {
							Assert.fail(
									"No Data Found in Day_Wise: Total_complaint element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Day_Wise: Total_complaint element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_complaint.isEnabled()) {
						Assert.fail("Day_Wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement KARA_Adhoc_complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
					WebElement KARA_post_Psf_calibration = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
					WebElement KARA_Open = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement KARA_In_progress = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement KARA_resolved = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement KARA_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement CCE_OPEN_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement CCE_In_progress_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement CCE_Resloved_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement CCE_Closed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement AMIE_OPEN_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement AMIE_In_progress_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement AMIE_Resolved_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement AMIE_Closed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					

					Thread.sleep(4000);

					day1 = Total_complaint.getText();
					System.out.println("Day_Wise of Total_complaint    ::" +day1);

					day2 = KARA_Adhoc_complaints.getText();
					day3 = KARA_post_Psf_calibration.getText();
					day4 = KARA_Open.getText();
					day5 = KARA_In_progress.getText();
					day6 = KARA_resolved.getText();
					day7 = KARA_Closed.getText();
					day8 = CCE_OPEN_2.getText();
					day9 = CCE_In_progress_2.getText();
					day10 = CCE_Resloved_2.getText();
					day11 = CCE_Closed_2.getText();
					day12 = AMIE_OPEN_3.getText();
					day13 = AMIE_In_progress_3.getText();
					day14 = AMIE_Resolved_3.getText();
					day15 = AMIE_Closed_3.getText();
				

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(day1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found of Total_complaint for Day_Wise:: " +day1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found of Total_complaint for Day_Wise:: " + e.getMessage());
					}
				}
				// .........................................................................................................

				@Test(priority = 11)
				public void Service_Type_Wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					 WebElement Service_Type_Wise = wait.until(
					            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Service Type Wise\"]")));
					 Service_Type_Wise.click();
					    Thread.sleep(2000);
					    		         										
		            //...............................................................................................						
					
					// Click on the generate report button
					WebElement clickOnGenerate = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					Actions actions2 =new Actions(driver);
					actions2.doubleClick(clickOnGenerate).perform();
					Thread.sleep(10000);
					
					 // Check if Items per page can be set to 100
				    try {
				        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-15\"]"));
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
		            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[15]"));
		            
		            if (!nextPageButton.isEnabled()) {
		                lastPageReached = true;
		            } else {
		                // Click on the next page button
		             //   nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[11]"));
		                nextPageButton.click();
		                Thread.sleep(3000);
		            }
		        }
		        
		      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					
					// Try to locate the Totalleads_recived element
					WebElement Total_complaint;
					try {
						Total_complaint = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_complaint.isDisplayed()||Total_complaint==null) {
							Assert.fail(
									"No Data Found in Service_Type_Wise: Total_complaint element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Service_Type_Wise: Total_complaint element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_complaint.isEnabled()) {
						Assert.fail("Service_Type_Wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement KARA_Adhoc_complaints = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
					WebElement KARA_post_Psf_calibration = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
					WebElement KARA_Open = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement KARA_In_progress = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement KARA_resolved = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement KARA_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement CCE_OPEN_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement CCE_In_progress_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement CCE_Resloved_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement CCE_Closed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement AMIE_OPEN_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement AMIE_In_progress_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement AMIE_Resolved_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement AMIE_Closed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					

					Thread.sleep(4000);

					s1 = Total_complaint.getText();
					System.out.println("Service_Type_Wise of Total_complaint    ::" +s1);

					s2 = KARA_Adhoc_complaints.getText();
					s3 = KARA_post_Psf_calibration.getText();
					s4 = KARA_Open.getText();
					s5 = KARA_In_progress.getText();
					s6 = KARA_resolved.getText();
					s7 = KARA_Closed.getText();
					s8 = CCE_OPEN_2.getText();
					s9 = CCE_In_progress_2.getText();
					s10 = CCE_Resloved_2.getText();
					s11 = CCE_Closed_2.getText();
					s12 = AMIE_OPEN_3.getText();
					s13 = AMIE_In_progress_3.getText();
					s14 = AMIE_Resolved_3.getText();
					s15 = AMIE_Closed_3.getText();
				

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(s1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found of Total_complaint for Service_Type_Wise:: " +s1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found of Total_complaint for Service_Type_Wise:: " + e.getMessage());
					}
				}
				//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				
				@Test(priority = 12)
				public void Compare_Total_complaint_Of_ZONE_Region_Wise_from__Dealer_Parent_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, d1);
				}
				//..............................................................................................
				@Test(priority = 13)
				public void Compare_Total_complaint_Of_ZONE_Region_Wise_from_Worshop_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, w1);
				}
				//..............................................................................................
				@Test(priority = 14)
				public void Compare_Total_complaint_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, day1);
				}
				//..............................................................................................
				@Test(priority = 15)
				public void Compare_Total_complaint_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, s1);
				}
				//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				//..............................................................................................
					@Test(priority = 16)
					public void Compare_KARA_Adhoc_complaints_Of_ZONE_Region_Wise_from_Dealer_parent_group_Wise() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertEquals(z2, d2);
					}
				//..............................................................................................
							@Test(priority = 17)
							public void Compare_KARA_Adhoc_complaints_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, w2);
							}
					//..............................................................................................
							@Test(priority = 18)
							public void Compare_KARA_Adhoc_complaints_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, day2);
							}
					//..............................................................................................
							@Test(priority = 19)
							public void Compare_KARA_Adhoc_complaints_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, s2);
							}
					//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 20)
							public void Compare_KARA_post_Psf_calibration_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z3, d3);
							}
							//..............................................................................................
							@Test(priority = 21)
							public void Compare_KARA_post_Psf_calibration_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z3, w3);
							}
					      //..............................................................................................
							@Test(priority = 22)
							public void Compare_KARA_post_Psf_calibration_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z3, day3);
							}
					      //..............................................................................................
							@Test(priority = 23)
							public void Compare_KARA_post_Psf_calibration_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z3, s3);
							}
			         //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 24)
							public void Compare_KARA_Open_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, d4);
							}
							//..............................................................................................
							@Test(priority = 25)
							public void Compare_KARA_Open_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, w4);
							}
					      //..............................................................................................
							@Test(priority = 26)
							public void Compare_KARA_Open_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, day4);
							}
					      //..............................................................................................
							@Test(priority = 27)
							public void Compare_KARA_Open_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, s4);
							}

			    //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 28)
							public void Compare_KARA_In_progress_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z5, d5);
							}
							//..............................................................................................
							@Test(priority = 29)
							public void Compare_KARA_In_progress_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z5, w5);
							}
					      //..............................................................................................
							@Test(priority = 30)
							public void Compare_KARA_In_progress_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z5, day5);
							}
					      //..............................................................................................
							@Test(priority = 31)
							public void Compare_KARA_In_progress_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z5, s5);
							}
			     //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 32)
							public void Compare_KARA_resolved_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, d6);
							}
							//..............................................................................................
							@Test(priority = 33)
							public void Compare_KARA_resolved_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, w6);
							}
					      //..............................................................................................
							@Test(priority = 34)
							public void Compare_KARA_resolved_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, day6);
							}
					      //..............................................................................................
							@Test(priority = 35)
							public void Compare_KARA_resolved_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, s6);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 36)
							public void Compare_KARA_Closed_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, d7);
							}
							//..............................................................................................
							@Test(priority = 37)
							public void Compare_KARA_Closed_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, w7);
							}
					      //..............................................................................................
							@Test(priority = 38)
							public void Compare_KARA_Closed_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, day7);
							}
					      //..............................................................................................
							@Test(priority = 39)
							public void Compare_KARA_Closed_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, s7);
							}
			   //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 40)
							public void Compare_CCE_OPEN_2_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, d8);
							}
							//..............................................................................................
							@Test(priority = 41)
							public void Compare_CCE_OPEN_2_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, w8);
							}
					      //..............................................................................................
							@Test(priority = 42)
							public void Compare_CCE_OPEN_2_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, day8);
							}
					      //..............................................................................................
							@Test(priority = 43)
							public void Compare_CCE_OPEN_2_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, s8);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 44)
							public void Compare_CCE_In_progress_2_done_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, d9);
							}
							//..............................................................................................
							@Test(priority = 45)
							public void Compare_CCE_In_progress_2_done_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, w9);
							}
					      //..............................................................................................
							@Test(priority = 46)
							public void Compare_CCE_In_progress_2_done_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, day9);
							}
					      //..............................................................................................
							@Test(priority = 47)
							public void Compare_CCE_In_progress_2_done_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, s9);
							}
							
			            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 48)
							public void Compare_CCE_Resloved_2_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, d10);
							}
							//..............................................................................................
							@Test(priority = 49)
							public void Compare_CCE_Resloved_2_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, w10);
							}
					      //..............................................................................................
							@Test(priority = 50)
							public void Compare_CCE_Resloved_2_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, day10);
							}
					      //..............................................................................................
							@Test(priority = 51)
							public void Compare_CCE_Resloved_2_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, s10);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 52)
							public void Compare_CCE_Closed_2_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, d11);
							}
							//..............................................................................................
							@Test(priority = 53)
							public void Compare_CCE_Closed_2_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, w11);
							}
					      //..............................................................................................
							@Test(priority = 54)
							public void Compare_CCE_Closed_2_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, day11);
							}
					      //..............................................................................................
							@Test(priority = 55)
							public void Compare_CCE_Closed_2_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, s11);
							}
							
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 56)
							public void Compare_AMIE_OPEN_3_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, d12);
							}
							//..............................................................................................
							@Test(priority = 57)
							public void Compare_AMIE_OPEN_3_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, w12);
							}
					      //..............................................................................................
							@Test(priority = 58)
							public void Compare_AMIE_OPEN_3_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, day12);
							}
					      //..............................................................................................
							@Test(priority = 59)
							public void Compare_AMIE_OPEN_3_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, s12);
							}
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 60)
							public void Compare_AMIE_In_progress_3_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, d13);
							}
							//..............................................................................................
							@Test(priority = 61)
							public void Compare_AMIE_In_progress_3_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, w13);
							}
					      //..............................................................................................
							@Test(priority = 62)
							public void Compare_AMIE_In_progress_3_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, day13);
							}
					      //..............................................................................................
							@Test(priority = 63)
							public void Compare_AMIE_In_progress_3_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, s13);
							}
			      //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 64)
							public void Compare_AMIE_Resolved_3_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z14, d14);
							}
							//..............................................................................................
							@Test(priority = 65)
							public void Compare_AMIE_Resolved_3_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z14, w14);
							}
					      //..............................................................................................
							@Test(priority = 66)
							public void Compare_AMIE_Resolved_3_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z14, day14);
							}
					      //..............................................................................................
							@Test(priority = 67)
							public void Compare_AMIE_Resolved_3_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z14, s14);
							}
							
			            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 68)
							public void Compare_AMIE_Closed_3_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, d15);
							}
							//..............................................................................................
							@Test(priority = 69)
							public void Compare_AMIE_Closed_3_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, w15);
							}
					      //..............................................................................................
							@Test(priority = 70)
							public void Compare_AMIE_Closed_3_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, day15);
							}
					      //..............................................................................................
							@Test(priority = 71)
							public void Compare_AMIE_Closed_3_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, s15);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
						
				
            }
