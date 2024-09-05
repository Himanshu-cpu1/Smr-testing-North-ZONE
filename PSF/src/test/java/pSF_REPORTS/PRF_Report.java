package pSF_REPORTS;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class PRF_Report {
	
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
	String z16;
	String z17;
	String z18;

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
	String d16;
	String d17;
	String d18;


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
	String w16;
	String w17;
	String w18;
	

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
	String day16;
	String day17;
	String day18;
	
	

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
	String s16;
	String s17;
	String s18;
			
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
		    public void Click_On_PRF_Report() throws InterruptedException {
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Switch to the iframe containing the element
		        WebElement iframe = driver.findElement(By.cssSelector("[title=\"Close message\"]"));
		        driver.switchTo().frame(iframe);
		        
		        Thread.sleep(2000);

		        // Find and click the close button within the iframe
		        WebElement close = driver.findElement(By.cssSelector("[aria-label=\"Close message from company\"]"));
		        close.click();

		        // Switch back to the default content after interacting with the iframe
		        driver.switchTo().defaultContent();
		     //..............................................................................   
		      
		        WebElement PRF = wait.until(
				        ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"PRF Report \"]")));
				    
				    // Scroll the element into view using JavaScript
				    JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("arguments[0].scrollIntoView(true);", PRF);
				    
				    // Optionally, wait for a short time to ensure everything is in place
				    Thread.sleep(500); // 0.5 seconds, adjust if necessary
				    
				    // Now click on the element
				    PRF.click();
				    
				    Thread.sleep(5000);
		    }
		   
		    		
		// .........................................................................................................

				@Test(priority = 7)
				public void Zone_Region_Wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					
					
		            //..........Select Required Fillters.....................................................................................
					
			// 1.  .........................click on  select_Dealer_Channel and select All..........................
					WebElement select_Dealer_Channel = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-5")));
					select_Dealer_Channel.click();
					Thread.sleep(2000);
					
					WebElement All = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
					All.click();
					
					Thread.sleep(2000);
			// 2.   .........................click on  select Service Type and select All..........................
					WebElement select_Service_Type = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-7")));
					
					Actions action =new Actions(driver);
					action.doubleClick(select_Service_Type).perform();						
					Thread.sleep(2000);
					
					WebElement All2 = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
					All2.click();
					
					Thread.sleep(2000);
				//................................................................................................	
					// Click on the calendar to open date picker
					
					WebElement select = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-label=\"Open calendar\"]")));
					Actions action4 =new Actions(driver);
					action4.doubleClick(select).perform();						
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
					WebElement PRF_Pending = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[3]"));
					WebElement PRF_Pending_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[4]"));
					WebElement Complaint_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[5]"));
					WebElement Complaint_Closed_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[6]"));
					WebElement PRF_Whatssap_Sent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[7]"));
					WebElement Respose_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[8]"));
					WebElement percent_Response_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[9]"));
					WebElement Complaint_Reopened = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[10]"));
					WebElement Complaint_Reopened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[11]"));
					WebElement complaint_Closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[12]"));
					WebElement complaint_Closed2_percent= driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[13]"));
					WebElement PRF_Done_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[14]"));
					WebElement Percent_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[15]"));
					WebElement Compalint_Re_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[16]"));
					WebElement Compalint_Re_Opened2_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[17]"));
					WebElement complaint_closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[18]"));
					WebElement complaint_closed2_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[19]"));
				
					Thread.sleep(4000);

					z1 = Total_complaint.getText();
					System.out.println("Total_complaint of Zone and region wise ::" + z1);

					z2 = PRF_Pending.getText();
					z3 = PRF_Pending_Percent.getText();
					z4 = Complaint_Closed.getText();
					z5 = Complaint_Closed_Percent.getText();
					z6 = PRF_Whatssap_Sent.getText();
					z7 = Respose_recived.getText();
					z8 = percent_Response_recived.getText();
					z9 = Complaint_Reopened.getText();
					z10 = Complaint_Reopened_Percent.getText();
					z11 = complaint_Closed2.getText();
					z12 = complaint_Closed2_percent.getText();
					z13 = PRF_Done_By_CCE_CCM.getText();
					z14 = Percent_By_CCE_CCM.getText();
					z15 = Compalint_Re_Opened2.getText();
					z16 = Compalint_Re_Opened2_percent.getText();
					z17 = complaint_closed2.getText();
					z18 = complaint_closed2_Percent.getText();

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
					Thread.sleep(21000);
					
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.PAGE_DOWN).perform();

					Thread.sleep(2000);
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
					WebElement PRF_Pending = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement PRF_Pending_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement Complaint_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement Complaint_Closed_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement PRF_Whatssap_Sent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement Respose_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement percent_Response_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement Complaint_Reopened = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement Complaint_Reopened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement complaint_Closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement complaint_Closed2_percent= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement PRF_Done_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement Percent_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement Compalint_Re_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement Compalint_Re_Opened2_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
					WebElement complaint_closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[20]"));
					WebElement complaint_closed2_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[21]"));
				
				
					Thread.sleep(4000);

					d1 = Total_complaint.getText();
					System.out.println("Total_complaint of Dealer Parent Group wise ::" + d1);

					d2 = PRF_Pending.getText();
					d3 = PRF_Pending_Percent.getText();
					d4 = Complaint_Closed.getText();
					d5 = Complaint_Closed_Percent.getText();
					d6 = PRF_Whatssap_Sent.getText();
					d7 = Respose_recived.getText();
					d8 = percent_Response_recived.getText();
					d9 = Complaint_Reopened.getText();
					d10 = Complaint_Reopened_Percent.getText();
					d11 = complaint_Closed2.getText();
					d12 = complaint_Closed2_percent.getText();
					d13 = PRF_Done_By_CCE_CCM.getText();
					d14 = Percent_By_CCE_CCM.getText();
					d15 = Compalint_Re_Opened2.getText();
					d16 = Compalint_Re_Opened2_percent.getText();
					d17 = complaint_closed2.getText();
					d18 = complaint_closed2_Percent.getText();

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
					Thread.sleep(17000);
					
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.PAGE_DOWN).perform();

					Thread.sleep(2000);
					 // Check if Items per page can be set to 100
				    try {
				        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-13\"]"));
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
					WebElement PRF_Pending = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement PRF_Pending_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement Complaint_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement Complaint_Closed_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement PRF_Whatssap_Sent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement Respose_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement percent_Response_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement Complaint_Reopened = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement Complaint_Reopened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement complaint_Closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement complaint_Closed2_percent= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement PRF_Done_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement Percent_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement Compalint_Re_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
					WebElement Compalint_Re_Opened2_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[20]"));
					WebElement complaint_closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[21]"));
					WebElement complaint_closed2_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[22]"));
				
					Thread.sleep(4000);

					w1 = Total_complaint.getText();
					System.out.println("Total_complaint of Workshop_Wise ::" + w1);

					w2 = PRF_Pending.getText();
					w3 = PRF_Pending_Percent.getText();
					w4 = Complaint_Closed.getText();
					w5 = Complaint_Closed_Percent.getText();
					w6 = PRF_Whatssap_Sent.getText();
					w7 = Respose_recived.getText();
					w8 = percent_Response_recived.getText();
					w9 = Complaint_Reopened.getText();
					w10 = Complaint_Reopened_Percent.getText();
					w11 = complaint_Closed2.getText();
					w12 = complaint_Closed2_percent.getText();
					w13 = PRF_Done_By_CCE_CCM.getText();
					w14 = Percent_By_CCE_CCM.getText();
					w15 = Compalint_Re_Opened2.getText();
					w16 = Compalint_Re_Opened2_percent.getText();
					w17 = complaint_closed2.getText();
					w18 = complaint_closed2_Percent.getText();
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

				// .........................................................................................................

				@Test(priority = 10)
				public void Day_Wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					 WebElement Day_Wise = wait.until(
					            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Day Wise \"]")));
					 Day_Wise.click();
					 
					    Thread.sleep(3000);
					    //...................Select Required Fillter............................................................................						
						  //1.  .........................click on  select_zone and select All..........................
							WebElement select_zone = wait
									.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-21")));
							select_zone.click();
							Thread.sleep(2000);
							
							WebElement All = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
							All.click();
							
							Thread.sleep(2000);
					//2.   .........................click on  select_Region and select All..........................
							WebElement select_region = wait
									.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-23")));
							
							Actions action =new Actions(driver);
							action.doubleClick(select_region).perform();						
							Thread.sleep(2000);
							
							
							WebElement All2 = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
							All2.click();						
							Thread.sleep(5000);
							
					//  3 ..........................click on  Dealer parent group and select All..........................
							WebElement select_Dealer_Parent = wait
									.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-25")));
							
							Actions action2 =new Actions(driver);
							action2.doubleClick(select_Dealer_Parent).perform();						
							Thread.sleep(2000);
							
							WebElement All3 = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
							All3.click();						
							Thread.sleep(6000);
							
					// 4.  ..........................click on  Workshop and select All..........................
							WebElement Workshop = wait
									.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-27")));
							
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
					Thread.sleep(17000);
					
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.PAGE_DOWN).perform();

					Thread.sleep(2000);
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
						Total_complaint = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_complaint.isDisplayed()||Total_complaint==null) {
							Assert.fail(
									"No Data Found in DAY_Wise: Total_complaint element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in DAY_Wise: Total_complaint element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_complaint.isEnabled()) {
						Assert.fail("DAY_Wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement PRF_Pending = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
					WebElement PRF_Pending_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
					WebElement Complaint_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement Complaint_Closed_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement PRF_Whatssap_Sent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement Respose_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement percent_Response_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement Complaint_Reopened = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement Complaint_Reopened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement complaint_Closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement complaint_Closed2_percent= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement PRF_Done_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement Percent_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement Compalint_Re_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement Compalint_Re_Opened2_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement complaint_closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement complaint_closed2_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
				
					Thread.sleep(4000);

					day1 = Total_complaint.getText();
					System.out.println("Total_complaint of DAY_Wise ::" + day1);

					day2 = PRF_Pending.getText();
					day3 = PRF_Pending_Percent.getText();
					day4 = Complaint_Closed.getText();
					day5 = Complaint_Closed_Percent.getText();
					day6 = PRF_Whatssap_Sent.getText();
					day7 = Respose_recived.getText();
					day8 = percent_Response_recived.getText();
					day9 = Complaint_Reopened.getText();
					day10 = Complaint_Reopened_Percent.getText();
					day11 = complaint_Closed2.getText();
					day12 = complaint_Closed2_percent.getText();
					day13 = PRF_Done_By_CCE_CCM.getText();
					day14 = Percent_By_CCE_CCM.getText();
					day15 = Compalint_Re_Opened2.getText();
					day16 = Compalint_Re_Opened2_percent.getText();
					day17 = complaint_closed2.getText();
					day18 = complaint_closed2_Percent.getText();
					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(day1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found of Total_complaint for DAY_Wise:: " + day1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found of Total_complaint for DAY_Wise:: " + e.getMessage());
					}
				}
				// .........................................................................................................
				// .........................................................................................................

				@Test(priority = 11)
				public void Service_Type_Wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					 WebElement Service_Type_Wise = wait.until(
					            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Service Type Wise\"]")));
					 Service_Type_Wise.click();
					 
					    Thread.sleep(3000);
					    										
			            //...............................................................................................						
						 				    
					    
					// Click on the generate report button
					WebElement clickOnGenerate = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					Actions actions2 =new Actions(driver);
					actions2.doubleClick(clickOnGenerate).perform();
					Thread.sleep(17000);
					
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.PAGE_DOWN).perform();

					Thread.sleep(2000);
					 // Check if Items per page can be set to 100
				    try {
				        WebElement Items_Per_page = driver.findElement(By.cssSelector("[id=\"mat-select-value-19\"]"));
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
					WebElement PRF_Pending = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
					WebElement PRF_Pending_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
					WebElement Complaint_Closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement Complaint_Closed_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement PRF_Whatssap_Sent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement Respose_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement percent_Response_recived = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement Complaint_Reopened = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement Complaint_Reopened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement complaint_Closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement complaint_Closed2_percent= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement PRF_Done_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement Percent_By_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement Compalint_Re_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement Compalint_Re_Opened2_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement complaint_closed2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement complaint_closed2_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
				
					Thread.sleep(4000);

					s1 = Total_complaint.getText();
					System.out.println("Total_complaint of Service_Type_Wise ::" + s1);

					s2 = PRF_Pending.getText();
					s3 = PRF_Pending_Percent.getText();
					s4 = Complaint_Closed.getText();
					s5 = Complaint_Closed_Percent.getText();
					s6 = PRF_Whatssap_Sent.getText();
					s7 = Respose_recived.getText();
					s8 = percent_Response_recived.getText();
					s9 = Complaint_Reopened.getText();
					s10 = Complaint_Reopened_Percent.getText();
					s11 = complaint_Closed2.getText();
					s12 = complaint_Closed2_percent.getText();
					s13 = PRF_Done_By_CCE_CCM.getText();
					s14 = Percent_By_CCE_CCM.getText();
					s15 = Compalint_Re_Opened2.getText();
					s16 = Compalint_Re_Opened2_percent.getText();
					s17 = complaint_closed2.getText();
					s18 = complaint_closed2_Percent.getText();
					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(s1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found of Total_complaint for Service_Type_Wise:: " + s1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found of Total_complaint for Service_Type_Wise:: " + e.getMessage());
					}
				}
				// .........................................................................................................
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
					public void Compare_PRF_Pending_Of_ZONE_Region_Wise_from_Dealer_parent_group_Wise() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertEquals(z2, d2);
					}
				//..............................................................................................
							@Test(priority = 17)
							public void Compare_PRF_Pending_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, w2);
							}
					//..............................................................................................
							@Test(priority = 18)
							public void Compare_PRF_Pending_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, day2);
							}
					//..............................................................................................
							@Test(priority = 19)
							public void Compare_PRF_Pending_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z2, s2);
							}
					//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 20)
							public void Compare_PRF_Pending_Percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z3.trim().replace(" ", "");
								String normalizedW10 = d3.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
								
							}
							//..............................................................................................
							@Test(priority = 21)
							public void Compare_PRF_Pending_Percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z3.trim().replace(" ", "");
								String normalizedW10 = w3.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 22)
							public void Compare_PRF_Pending_Percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z3.trim().replace(" ", "");
								String normalizedW10 = day3.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 23)
							public void Compare_PRF_Pending_Percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z3.trim().replace(" ", "");
								String normalizedW10 = s3.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
			         //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 24)
							public void Compare_Complaint_Closed_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, d4);
							}
							//..............................................................................................
							@Test(priority = 25)
							public void Compare_Complaint_Closed_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, w4);
							}
					      //..............................................................................................
							@Test(priority = 26)
							public void Compare_Complaint_Closed_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, day4);
							}
					      //..............................................................................................
							@Test(priority = 27)
							public void Compare_Complaint_Closed_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, s4);
							}

			    //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 28)
							public void Compare_Complaint_Closed_Percent_Percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z5.trim().replace(" ", "");
								String normalizedW10 = d5.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 29)
							public void Compare_Complaint_Closed_Percent_Percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z5.trim().replace(" ", "");
								String normalizedW10 = w5.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 30)
							public void Compare_Complaint_Closed_Percent_Percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z5.trim().replace(" ", "");
								String normalizedW10 = day5.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 31)
							public void Compare_Complaint_Closed_Percent_Percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z5.trim().replace(" ", "");
								String normalizedW10 = s5.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
			     //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 32)
							public void Compare_PRF_Whatssap_Sent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, d6);
							}
							//..............................................................................................
							@Test(priority = 33)
							public void Compare_PRF_Whatssap_Sent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, w6);
							}
					      //..............................................................................................
							@Test(priority = 34)
							public void Compare_PRF_Whatssap_Sent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, day6);
							}
					      //..............................................................................................
							@Test(priority = 35)
							public void Compare_PRF_Whatssap_Sent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, s6);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 36)
							public void Compare_Respose_recived_Percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								
								Assert.assertEquals(z7, d7);
								
							}
							//..............................................................................................
							@Test(priority = 37)
							public void Compare_Respose_recived_Percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								
								Assert.assertEquals(z7, w7);
								
							}
					      //..............................................................................................
							@Test(priority = 38)
							public void Compare_Respose_recived_Percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, day7);
							}
					      //..............................................................................................
							@Test(priority = 39)
							public void Compare_Respose_recived_Percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z7, s7);
							}
			   //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 40)
							public void Compare_percent_Response_recived_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z8.trim().replace(" ", "");
								String normalizedW10 = d8.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 41)
							public void Compare_percent_Response_recived_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z8.trim().replace(" ", "");
								String normalizedW10 = w8.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 42)
							public void Compare_percent_Response_recived_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z8.trim().replace(" ", "");
								String normalizedW10 = day8.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 43)
							public void Compare_percent_Response_recived_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z8.trim().replace(" ", "");
								String normalizedW10 = s8.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 44)
							public void Compare_Complaint_Reopened_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, d9);
							}
							//..............................................................................................
							@Test(priority = 45)
							public void Compare_Complaint_Reopened_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, w9);
							}
					      //..............................................................................................
							@Test(priority = 46)
							public void Compare_Complaint_Reopened_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, day9);
							}
					      //..............................................................................................
							@Test(priority = 47)
							public void Compare_Complaint_Reopened_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z9, s9);;
							}
							
			            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 48)
							public void Compare_Complaint_Reopened_Percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z10.trim().replace(" ", "");
								String normalizedW10 = d10.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 49)
							public void Compare_Complaint_Reopened_Percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z10.trim().replace(" ", "");
								String normalizedW10 = w10.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 50)
							public void Compare_Complaint_Reopened_Percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z10.trim().replace(" ", "");
								String normalizedW10 = day10.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 51)
							public void Compare_Complaint_Reopened_Percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z10.trim().replace(" ", "");
								String normalizedW10 = s10.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 52)
							public void Compare_complaint_Closed2_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, d11);
							}
							//..............................................................................................
							@Test(priority = 53)
							public void Compare_complaint_Closed2_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, w11);
							}
					      //..............................................................................................
							@Test(priority = 54)
							public void Compare_complaint_Closed2_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, day11);
							}
					      //..............................................................................................
							@Test(priority = 55)
							public void Compare_complaint_Closed2_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, s11);
							}
							
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 56)
							public void Compare_complaint_Closed2_percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z12.trim().replace(" ", "");
								String normalizedW10 = d12.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 57)
							public void Compare_complaint_Closed2_percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z12.trim().replace(" ", "");
								String normalizedW10 = w12.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 58)
							public void Compare_complaint_Closed2_percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z12.trim().replace(" ", "");
								String normalizedW10 = day12.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 59)
							public void Compare_complaint_Closed2_percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z12.trim().replace(" ", "");
								String normalizedW10 = s12.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 60)
							public void Compare_PRF_Done_By_CCE_CCM_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, d13);
							}
							//..............................................................................................
							@Test(priority = 61)
							public void Compare_PRF_Done_By_CCE_CCM_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, w13);
							}
					      //..............................................................................................
							@Test(priority = 62)
							public void Compare_PRF_Done_By_CCE_CCM_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, day13);
							}
					      //..............................................................................................
							@Test(priority = 63)
							public void Compare_PRF_Done_By_CCE_CCM_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, s13);
							}
                //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 64)
							public void Compare_Percent_By_CCE_CCM_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z14.trim().replace(" ", "");
								String normalizedW10 = d14.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 65)
							public void Compare_Percent_By_CCE_CCM_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z14.trim().replace(" ", "");
								String normalizedW10 = w14.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 66)
							public void Compare_Percent_By_CCE_CCM_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z14.trim().replace(" ", "");
								String normalizedW10 = day14.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 67)
							public void Compare_Percent_By_CCE_CCM_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z14.trim().replace(" ", "");
								String normalizedW10 = s14.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							
			            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 68)
							public void Compare_Compalint_Re_Opened2_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, d15);
							}
							//..............................................................................................
							@Test(priority = 69)
							public void Compare_Compalint_Re_Opened2_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, w15);
							}
					      //..............................................................................................
							@Test(priority = 70)
							public void Compare_Compalint_Re_Opened2_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, day15);
							}
					      //..............................................................................................
							@Test(priority = 71)
							public void Compare_Compalint_Re_Opened2_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, s15);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 72)
							public void Compare_Compalint_Re_Opened2_percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z16.trim().replace(" ", "");
								String normalizedW10 = d16.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 73)
							public void Compare_Compalint_Re_Opened2_percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z16.trim().replace(" ", "");
								String normalizedW10 = w16.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 74)
							public void Compare_Compalint_Re_Opened2_percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z16.trim().replace(" ", "");
								String normalizedW10 = day16.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 75)
							public void Compare_Compalint_Re_Opened2_percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z16.trim().replace(" ", "");
								String normalizedW10 = s16.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 76)
							public void Compare_complaint_closed2_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z17, d17);
							}
							//..............................................................................................
							@Test(priority = 77)
							public void Compare_complaint_closed2_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z17, w17);
							}
					      //..............................................................................................
							@Test(priority = 78)
							public void Compare_complaint_closed2_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z17, day17);
							}
					      //..............................................................................................
							@Test(priority = 79)
							public void Compare_complaint_closed2_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z17, s17);
							}
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 80)
							public void Compare_complaint_closed2_Percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z18.trim().replace(" ", "");
								String normalizedW10 = d18.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 81)
							public void Compare_complaint_closed2_Percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z18.trim().replace(" ", "");
								String normalizedW10 = w18.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 82)
							public void Compare_complaint_closed2_Percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z18.trim().replace(" ", "");
								String normalizedW10 = day18.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 83)
							public void Compare_complaint_closed2_Percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z18.trim().replace(" ", "");
								String normalizedW10 = s18.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							
			      //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>....  E   N   D  .....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
}
