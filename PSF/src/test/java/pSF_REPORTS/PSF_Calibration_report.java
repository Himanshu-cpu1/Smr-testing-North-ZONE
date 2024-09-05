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

public class PSF_Calibration_report {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	

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
	String d19;
	String d20;
	String d21;
	String d22;
	String d23;
	String d24;



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
	String w19;
	String w20;
	String w21;
	String w22;
	String w23;
	String w24;
	

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
	String day19;
	String day20;
	String day21;
	String day22;
	String day23;
	String day24;
	
	

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
	String s19;
	String s20;
	String s21;
	String s22;
	String s23;
	String s24;
			
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
		    public void Click_On_PSF_Calibration_Report() throws InterruptedException {
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
		      
		        WebElement Dialer = wait.until(
				        ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"PSF Calibration Report \"]")));
				    
				    // Scroll the element into view using JavaScript
				    JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("arguments[0].scrollIntoView(true);", Dialer);
				    
				    // Optionally, wait for a short time to ensure everything is in place
				    Thread.sleep(500); // 0.5 seconds, adjust if necessary
				    
				    // Now click on the element
				    Dialer.click();
				    
				    Thread.sleep(5000);
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
					Thread.sleep(25000);
		      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					
				
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
				WebElement Total_psf_due;
				try {
					Total_psf_due = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));

					// Check if Totalleads_recived element is displayed
					if (!Total_psf_due.isDisplayed()||Total_psf_due==null) {
						Assert.fail(
								"No Data Found in Dealer_Parent_Group_Wise: Total_complaint element is not visible on the page.");
					}
				} catch (NoSuchElementException e) {
					Assert.fail("No Data Found in Dealer_Parent_Group_Wise: Total_complaint element could not be found: "
							+ e.getMessage());
					return; // Exit the test if the element is not found
				}

				// Check if Totalleads_recived is enabled
				if (!Total_psf_due.isEnabled()) {
					Assert.fail("Dealer_Parent_Group_Wise element is not enabled");
				}

				// Proceed with the rest of your element locators and text retrievals
				WebElement Total_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
				WebElement Done_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
				WebElement PSF_Calibration_To_be_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
				WebElement pending_calibration_E_VG_G = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
				WebElement Total_Calibration_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
				WebElement Total_Calibration_Done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
				WebElement Psf_closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
				WebElement PSF_CLOSED_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
				WebElement complaint_Opened = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
				WebElement complaint_Opened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
				WebElement Whatssp_sent= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
				WebElement Done_By_kara = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
				WebElement Percent_By_KARA = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
				WebElement PSF_CLosed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
				WebElement PSF_CLosed_percent_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
				WebElement complaint_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[20]"));
				WebElement complaint_Opened_PErcent2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[21]"));
				WebElement Done_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[22]"));
				WebElement percent_by_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[23]"));
				WebElement PSF_CLosed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[24]"));
				WebElement PSF_CLosed_percent3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[25]"));
				WebElement complaint_Opened3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[26]"));
				WebElement complaint_Opened_percent3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[27]"));
			
			
				Thread.sleep(4000);

				d1 = Total_psf_due.getText();
				System.out.println("Total_complaint of Dealer Parent Group wise ::" + d1);

				d2 = Total_Done.getText();
				d3 = Done_percent.getText();
				d4 = PSF_Calibration_To_be_Done.getText();
				d5 = pending_calibration_E_VG_G.getText();
				d6 = Total_Calibration_Done.getText();
				d7 = Total_Calibration_Done_Percent.getText();
				d8 = Psf_closed.getText();
				d9 = PSF_CLOSED_Percent.getText();
				d10 = complaint_Opened.getText();
				d11 = complaint_Opened_Percent.getText();
				d12 = Whatssp_sent.getText();
				d13 = Done_By_kara.getText();
				d14 = Percent_By_KARA.getText();
				d15 = PSF_CLosed_2.getText();
				d16 = PSF_CLosed_percent_2.getText();
				d17 = complaint_Opened2.getText();
				d18 = complaint_Opened_PErcent2.getText();
				d19 = Done_CCE_CCM.getText();
				d20 = percent_by_CCE_CCM.getText();
				d21 = PSF_CLosed_3.getText();
				d22 = PSF_CLosed_percent3.getText();
				d23 = complaint_Opened3.getText();
				d24 = complaint_Opened_percent3.getText();

				Thread.sleep(5000);

				try {
					// Parse the Total Due value to a numeric type
					Integer totalDueValue = Integer.parseInt(d1);

					if (totalDueValue <= 0 || totalDueValue == null) {

						// Fail the test if Total Due value is 0 or less
						Assert.fail("No Data Found of Total_psf_due for Dealer_Parent_Group_Wise:: " + d1);
					} else {
						
					}

				} catch (Exception e) {
					// Fail the test if an exception is thrown
					Assert.fail("No Data Found of Total_psf_due for Dealer_Parent_Group_Wise:: " + e.getMessage());
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
				WebElement Total_psf_due;
				try {
					Total_psf_due = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));

					// Check if Totalleads_recived element is displayed
					if (!Total_psf_due.isDisplayed()||Total_psf_due==null) {
						Assert.fail(
								"No Data Found in Workshop_Wise: Total_complaint element is not visible on the page.");
					}
				} catch (NoSuchElementException e) {
					Assert.fail("No Data Found in Workshop_Wise: Total_complaint element could not be found: "
							+ e.getMessage());
					return; // Exit the test if the element is not found
				}

				// Check if Totalleads_recived is enabled
				if (!Total_psf_due.isEnabled()) {
					Assert.fail("Workshop_Wise element is not enabled");
				}


				// Proceed with the rest of your element locators and text retrievals
				WebElement Total_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
				WebElement Done_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
				WebElement PSF_Calibration_To_be_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
				WebElement pending_calibration_E_VG_G = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
				WebElement Total_Calibration_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
				WebElement Total_Calibration_Done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
				WebElement Psf_closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
				WebElement PSF_CLOSED_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
				WebElement complaint_Opened = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
				WebElement complaint_Opened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
				WebElement Whatssp_sent= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
				WebElement Done_By_kara = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
				WebElement Percent_By_KARA = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
				WebElement PSF_CLosed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
				WebElement PSF_CLosed_percent_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[20]"));
				WebElement complaint_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[21]"));
				WebElement complaint_Opened_PErcent2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[22]"));
				WebElement Done_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[23]"));
				WebElement percent_by_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[24]"));
				WebElement PSF_CLosed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[25]"));
				WebElement PSF_CLosed_percent3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[26]"));
				WebElement complaint_Opened3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[27]"));
				WebElement complaint_Opened_percent3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[28]"));
			
			
				Thread.sleep(4000);

				w1 = Total_psf_due.getText();
				System.out.println("Total_complaint of Workshop_Wise ::" + w1);

				w2 = Total_Done.getText();
				w3 = Done_percent.getText();
				w4 = PSF_Calibration_To_be_Done.getText();
				w5 = pending_calibration_E_VG_G.getText();
				w6 = Total_Calibration_Done.getText();
				w7 = Total_Calibration_Done_Percent.getText();
				w8 = Psf_closed.getText();
				w9 = PSF_CLOSED_Percent.getText();
				w10 = complaint_Opened.getText();
				w11 = complaint_Opened_Percent.getText();
				w12 = Whatssp_sent.getText();
				w13 = Done_By_kara.getText();
				w14 = Percent_By_KARA.getText();
				w15 = PSF_CLosed_2.getText();
				w16 = PSF_CLosed_percent_2.getText();
				w17 = complaint_Opened2.getText();
				w18 = complaint_Opened_PErcent2.getText();
				w19 = Done_CCE_CCM.getText();
				w20 = percent_by_CCE_CCM.getText();
				w21 = PSF_CLosed_3.getText();
				w22 = PSF_CLosed_percent3.getText();
				w23 = complaint_Opened3.getText();
				w24 = complaint_Opened_percent3.getText();

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
				Thread.sleep(210000);
				
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
				WebElement Total_psf_due;
				try {
					Total_psf_due = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

					// Check if Totalleads_recived element is displayed
					if (!Total_psf_due.isDisplayed()||Total_psf_due==null) {
						Assert.fail(
								"No Data Found in DAY_Wise: Total_psf_due element is not visible on the page.");
					}
				} catch (NoSuchElementException e) {
					Assert.fail("No Data Found in DAY_Wise: Total_psf_due element could not be found: "
							+ e.getMessage());
					return; // Exit the test if the element is not found
				}

				// Check if Totalleads_recived is enabled
				if (!Total_psf_due.isEnabled()) {
					Assert.fail("DAY_Wise element is not enabled");
				}

				// Proceed with the rest of your element locators and text retrievals
				WebElement Total_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
				WebElement Done_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
				WebElement PSF_Calibration_To_be_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
				WebElement pending_calibration_E_VG_G = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
				WebElement Total_Calibration_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
				WebElement Total_Calibration_Done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
				WebElement Psf_closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
				WebElement PSF_CLOSED_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
				WebElement complaint_Opened = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
				WebElement complaint_Opened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
				WebElement Whatssp_sent= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
				WebElement Done_By_kara = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
				WebElement Percent_By_KARA = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
				WebElement PSF_CLosed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
				WebElement PSF_CLosed_percent_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[20]"));
				WebElement complaint_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[21]"));
				WebElement complaint_Opened_PErcent2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[22]"));
				WebElement Done_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[23]"));
				WebElement percent_by_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[24]"));
				WebElement PSF_CLosed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[25]"));
				WebElement PSF_CLosed_percent3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[26]"));
				WebElement complaint_Opened3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[27]"));
				WebElement complaint_Opened_percent3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[28]"));
			
			
				Thread.sleep(4000);

				day1 = Total_psf_due.getText();
				System.out.println("Total_psf_due of Workshop_Wise ::" + w1);

				day2 = Total_Done.getText();
				day3 = Done_percent.getText();
				day4 = PSF_Calibration_To_be_Done.getText();
				day5 = pending_calibration_E_VG_G.getText();
				day6 = Total_Calibration_Done.getText();
				day7 = Total_Calibration_Done_Percent.getText();
				day8 = Psf_closed.getText();
				day9 = PSF_CLOSED_Percent.getText();
				day10 = complaint_Opened.getText();
				day11 = complaint_Opened_Percent.getText();
				day12 = Whatssp_sent.getText();
				day13 = Done_By_kara.getText();
				day14 = Percent_By_KARA.getText();
				day15 = PSF_CLosed_2.getText();
				day16 = PSF_CLosed_percent_2.getText();
				day17 = complaint_Opened2.getText();
				day18 = complaint_Opened_PErcent2.getText();
				day19 = Done_CCE_CCM.getText();
				day20 = percent_by_CCE_CCM.getText();
				day21 = PSF_CLosed_3.getText();
				day22 = PSF_CLosed_percent3.getText();
				day23 = complaint_Opened3.getText();
				day24 = complaint_Opened_percent3.getText();

				Thread.sleep(5000);

				try {
					// Parse the Total Due value to a numeric type
					Integer totalDueValue = Integer.parseInt(day1);

					if (totalDueValue <= 0 || totalDueValue == null) {

						// Fail the test if Total Due value is 0 or less
						Assert.fail("No Data Found of Total_psf_due for DAY_Wise:: " + day1);
					} else {
						
					}

				} catch (Exception e) {
					// Fail the test if an exception is thrown
					Assert.fail("No Data Found of Total_psf_due for DAY_Wise:: " + e.getMessage());
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
				WebElement Total_psf_due;
				try {
					Total_psf_due = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

					// Check if Totalleads_recived element is displayed
					if (!Total_psf_due.isDisplayed()||Total_psf_due==null) {
						Assert.fail(
								"No Data Found in Service_Type_Wise: Total_psf_due element is not visible on the page.");
					}
				} catch (NoSuchElementException e) {
					Assert.fail("No Data Found in Service_Type_Wise: Total_psf_due element could not be found: "
							+ e.getMessage());
					return; // Exit the test if the element is not found
				}

				// Check if Totalleads_recived is enabled
				if (!Total_psf_due.isEnabled()) {
					Assert.fail("Service_Type_Wise element is not enabled");
				}


				// Proceed with the rest of your element locators and text retrievals
				WebElement Total_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
				WebElement Done_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
				WebElement PSF_Calibration_To_be_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
				WebElement pending_calibration_E_VG_G = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
				WebElement Total_Calibration_Done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
				WebElement Total_Calibration_Done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
				WebElement Psf_closed = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
				WebElement PSF_CLOSED_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
				WebElement complaint_Opened = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
				WebElement complaint_Opened_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
				WebElement Whatssp_sent= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
				WebElement Done_By_kara = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
				WebElement Percent_By_KARA = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
				WebElement PSF_CLosed_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
				WebElement PSF_CLosed_percent_2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[20]"));
				WebElement complaint_Opened2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[21]"));
				WebElement complaint_Opened_PErcent2 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[22]"));
				WebElement Done_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[23]"));
				WebElement percent_by_CCE_CCM = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[24]"));
				WebElement PSF_CLosed_3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[25]"));
				WebElement PSF_CLosed_percent3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[26]"));
				WebElement complaint_Opened3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[27]"));
				WebElement complaint_Opened_percent3 = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[28]"));
			
			
				Thread.sleep(4000);

				s1 = Total_psf_due.getText();
				System.out.println("Total_psf_due of Workshop_Wise ::" + s1);

				s2 = Total_Done.getText();
				s3 = Done_percent.getText();
				s4 = PSF_Calibration_To_be_Done.getText();
				s5 = pending_calibration_E_VG_G.getText();
				s6 = Total_Calibration_Done.getText();
				s7 = Total_Calibration_Done_Percent.getText();
				s8 = Psf_closed.getText();
				s9 = PSF_CLOSED_Percent.getText();
				s10 = complaint_Opened.getText();
				s11 = complaint_Opened_Percent.getText();
				s12 = Whatssp_sent.getText();
				s13 = Done_By_kara.getText();
				s14 = Percent_By_KARA.getText();
				s15 = PSF_CLosed_2.getText();
				s16 = PSF_CLosed_percent_2.getText();
				s17 = complaint_Opened2.getText();
				s18 = complaint_Opened_PErcent2.getText();
				s19 = Done_CCE_CCM.getText();
				s20 = percent_by_CCE_CCM.getText();
				s21 = PSF_CLosed_3.getText();
				s22 = PSF_CLosed_percent3.getText();
				s23 = complaint_Opened3.getText();
				s24 = complaint_Opened_percent3.getText();

				Thread.sleep(5000);

				try {
					// Parse the Total Due value to a numeric type
					Integer totalDueValue = Integer.parseInt(s1);

					if (totalDueValue <= 0 || totalDueValue == null) {

						// Fail the test if Total Due value is 0 or less
						Assert.fail("No Data Found of Total_psf_due for Service_Type_Wise:: " + s1);
					} else {
						
					}

				} catch (Exception e) {
					// Fail the test if an exception is thrown
					Assert.fail("No Data Found of Total_psf_due for Service_Type_Wise:: " + e.getMessage());
				}
			}
			// .........................................................................................................
		
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
			
			@Test(priority = 13)
			public void Compare_Total_psf_due_Of_Dealer_Parent_group_wise_from_Worshop_Wise() throws InterruptedException {
				Thread.sleep(1000);
				Assert.assertEquals(d1, w1);
			}
			//..............................................................................................
			@Test(priority = 14)
			public void Compare_Total_psf_due_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
				Thread.sleep(1000);
				Assert.assertEquals(d1, day1);
			}
			//..............................................................................................
			@Test(priority = 15)
			public void Compare_Total_psf_due_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
				Thread.sleep(1000);
				Assert.assertEquals(d1, s1);
			}
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
						@Test(priority = 17)
						public void Compare_Total_Done_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d2, w2);
						}
				//..............................................................................................
						@Test(priority = 18)
						public void Compare_Total_Done_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d2, day2);
						}
				//..............................................................................................
						@Test(priority = 19)
						public void Compare_Total_Done_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d2, s2);
						}
				//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 21)
						public void Compare_Done_percent_Percent_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d3.trim().replace(" ", "");
							String normalizedW10 = w3.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 22)
						public void Compare_Done_percent_Percent_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d3.trim().replace(" ", "");
							String normalizedW10 = day3.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 23)
						public void Compare_Done_percent_Percent_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d3.trim().replace(" ", "");
							String normalizedW10 = s3.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
		         //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 25)
						public void Compare_PSF_Calibration_To_be_Done_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d4, w4);
						}
				      //..............................................................................................
						@Test(priority = 26)
						public void Compare_PSF_Calibration_To_be_Done_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d4, day4);
						}
				      //..............................................................................................
						@Test(priority = 27)
						public void Compare_PSF_Calibration_To_be_Done_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d4, s4);
						}

		    //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 29)
						public void Compare_pending_calibration_E_VG_G_Percent_Percent_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							
							Assert.assertEquals(d5, w5);
							
						}
				      //..............................................................................................
						@Test(priority = 30)
						public void Compare_pending_calibration_E_VG_G_Percent_Percent_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d5, day5);
						}
				      //..............................................................................................
						@Test(priority = 31)
						public void Compare_pending_calibration_E_VG_G_Percent_Percent_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d5, s5);
						}
		     //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 33)
						public void Compare_Total_Calibration_Done_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d6, w6);
						}
				      //..............................................................................................
						@Test(priority = 34)
						public void Compare_Total_Calibration_Done_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d6, day6);
						}
				      //..............................................................................................
						@Test(priority = 35)
						public void Compare_Total_Calibration_Done_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d6, s6);
						}
		 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
					
						//..............................................................................................
						@Test(priority = 37)
						public void Compare_Total_Calibration_Done_Percent_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							
							String normalizedZ10 = d7.trim().replace(" ", "");
							String normalizedW10 = w7.trim().replace(" ", "");
							Assert.assertEquals(d7, w7);
							Assert.assertEquals(normalizedZ10, normalizedW10);
							
						}
				      //..............................................................................................
						@Test(priority = 38)
						public void Compare_Total_Calibration_Done_Percent_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d7.trim().replace(" ", "");
							String normalizedW10 = day7.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 39)
						public void Compare_Total_Calibration_Done_Percent_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d7.trim().replace(" ", "");
							String normalizedW10 = s7.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
		   //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 41)
						public void Compare_Psf_closed_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d8, w8);
						}
				      //..............................................................................................
						@Test(priority = 42)
						public void Compare_Psf_closed_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d8, day8);
						}
				      //..............................................................................................
						@Test(priority = 43)
						public void Compare_Psf_closed_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d8, s8);
						}
		 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 45)
						public void Compare_PSF_CLOSED_Percent_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d9.trim().replace(" ", "");
							String normalizedW10 = w9.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 46)
						public void Compare_PSF_CLOSED_Percent_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d9.trim().replace(" ", "");
							String normalizedW10 = day9.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 47)
						public void Compare_PSF_CLOSED_Percent_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d9.trim().replace(" ", "");
							String normalizedW10 = s9.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
						
		            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						//..............................................................................................
						@Test(priority = 49)
						public void Compare_complaint_Opened_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d10, w10);
						}
				      //..............................................................................................
						@Test(priority = 50)
						public void Compare_complaint_Opened_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d10, day10);
						}
				      //..............................................................................................
						@Test(priority = 51)
						public void Compare_complaint_Opened_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d10, s10);
						}
		 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 53)
						public void Compare_complaint_Opened_Percent_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d11.trim().replace(" ", "");
							String normalizedW10 = w11.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 54)
						public void Compare_complaint_Opened_Percent_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d11.trim().replace(" ", "");
							String normalizedW10 = day11.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 55)
						public void Compare_complaint_Opened_Percent_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d11.trim().replace(" ", "");
							String normalizedW10 = s11.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
						
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
					
						//..............................................................................................
						@Test(priority = 57)
						public void Compare_Whatssp_sent_percent_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d12, w12);
						}
				      //..............................................................................................
						@Test(priority = 58)
						public void Compare_Whatssp_sent_percent_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d12, day12);
						}
				      //..............................................................................................
						@Test(priority = 59)
						public void Compare_Whatssp_sent_percent_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d12, s12);
						}
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 61)
						public void Compare_Done_By_kara_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d13, w13);
						}
				      //..............................................................................................
						@Test(priority = 62)
						public void Compare_Done_By_kara_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d13, day13);
						}
				      //..............................................................................................
						@Test(priority = 63)
						public void Compare_Done_By_kara_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d13, s13);
						}
            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 65)
						public void Compare_Percent_By_KARA_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d14.trim().replace(" ", "");
							String normalizedW10 = w14.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 66)
						public void Compare_Percent_By_KARA_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d14.trim().replace(" ", "");
							String normalizedW10 = day14.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 67)
						public void Compare_Percent_By_KARA_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d14.trim().replace(" ", "");
							String normalizedW10 = s14.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
						
		            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
					
						//..............................................................................................
						@Test(priority = 69)
						public void Compare_PSF_CLosed_2_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d15, w15);
						}
				      //..............................................................................................
						@Test(priority = 70)
						public void Compare_PSF_CLosed_2_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d15, day15);
						}
				      //..............................................................................................
						@Test(priority = 71)
						public void Compare_PSF_CLosed_2_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d15, s15);
						}
		 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
					
						//..............................................................................................
						@Test(priority = 73)
						public void Compare_PSF_CLosed_percent_2_percent_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d16, w16);
						}
				      //..............................................................................................
						@Test(priority = 74)
						public void Compare_PSF_CLosed_percent_2_percent_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d16, day16);
						}
				      //..............................................................................................
						@Test(priority = 75)
						public void Compare_PSF_CLosed_percent_2_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d16, s16);
						}
						
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						//..............................................................................................
						@Test(priority = 77)
						public void Compare_complaint_Opened2_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d17, w17);
						}
				      //..............................................................................................
						@Test(priority = 78)
						public void Compare_complaint_Opened2_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d17, day17);
						}
				      //..............................................................................................
						@Test(priority = 79)
						public void Compare_complaint_Opened2_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d17, s17);
						}
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
					
						
						//..............................................................................................
						@Test(priority = 81)
						public void Compare_complaint_Opened_PErcent2_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d18.trim().replace(" ", "");
							String normalizedW10 = w18.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 82)
						public void Compare_complaint_Opened_PErcent2_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d18.trim().replace(" ", "");
							String normalizedW10 = day18.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 83)
						public void Compare_complaint_Opened_PErcent2_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d18.trim().replace(" ", "");
							String normalizedW10 = s18.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 84)
						public void Compare_Done_CCE_CCM_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d19, w19);
						}
				      //..............................................................................................
						@Test(priority = 85)
						public void Compare_Done_CCE_CCM_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d19, day19);
						}
				      //..............................................................................................
						@Test(priority = 86)
						public void Compare_Done_CCE_CCM_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d19, s19);
						}
            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						
						//..............................................................................................
						@Test(priority = 87)
						public void Compare_percent_by_CCE_CCM_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d20.trim().replace(" ", "");
							String normalizedW10 = w20.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 88)
						public void Compare_percent_by_CCE_CCM_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d20.trim().replace(" ", "");
							String normalizedW10 = day20.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 89)
						public void Compare_percent_by_CCE_CCM_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d20.trim().replace(" ", "");
							String normalizedW10 = s20.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
						
		            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
					
						//..............................................................................................
						@Test(priority = 90)
						public void Compare_PSF_CLosed_3_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d21, w21);
						}
				      //..............................................................................................
						@Test(priority = 91)
						public void Compare_PSF_CLosed_3_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d21, day21);
						}
				      //..............................................................................................
						@Test(priority = 92)
						public void Compare_PSF_CLosed_3_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d21, s21);
						}
		 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
					
						//..............................................................................................
						@Test(priority = 93)
						public void Compare_PSF_CLosed_percent_3_percent_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d22.trim().replace(" ", "");
							String normalizedW10 = w22.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 94)
						public void Compare_PSF_CLosed_percent_3_percent_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d22.trim().replace(" ", "");
							String normalizedW10 = day22.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 95)
						public void Compare_PSF_CLosed_percent_3_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d22.trim().replace(" ", "");
							String normalizedW10 = s22.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
						
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
						//..............................................................................................
						@Test(priority = 96)
						public void Compare_complaint_Opened3_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d23, w23);
						}
				      //..............................................................................................
						@Test(priority = 97)
						public void Compare_complaint_Opened3_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d23, day23);
						}
				      //..............................................................................................
						@Test(priority = 98)
						public void Compare_complaint_Opened3_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							Assert.assertEquals(d23, s23);
						}
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						
					
						
						//..............................................................................................
						@Test(priority = 99)
						public void Compare_complaint_Opened_PErcent3_Of_Dealer_Parent_group_wise_from_workshop__Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d24.trim().replace(" ", "");
							String normalizedW10 = w24.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 100)
						public void Compare_complaint_Opened_PErcent3_Of_Dealer_Parent_group_wise_from_Day_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d24.trim().replace(" ", "");
							String normalizedW10 = day24.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
				      //..............................................................................................
						@Test(priority = 101)
						public void Compare_complaint_Opened_PErcent3_Of_Dealer_Parent_group_wise_from_Service_Type_Wise() throws InterruptedException {
							Thread.sleep(1000);
							String normalizedZ10 = d24.trim().replace(" ", "");
							String normalizedW10 = s24.trim().replace(" ", "");

							Assert.assertEquals(normalizedZ10, normalizedW10);
						}
						
						
		      //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>....  E   N   D  .....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

             }
