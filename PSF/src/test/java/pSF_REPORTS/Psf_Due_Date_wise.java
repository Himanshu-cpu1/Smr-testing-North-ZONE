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

public class Psf_Due_Date_wise {
	
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
		public void Click_On_Last_attempt_Report() throws InterruptedException {
		    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    WebElement lastAttemptReport = wait.until(
		        ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"PSF Due Date Wise \"]")));
		    
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
			
			Thread.sleep(7000);
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//.........................click on  select_logic and select PSF DUE DATE..........................
			WebElement select_logic = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-1")));
			select_logic.click();
			Thread.sleep(2000);
			
			WebElement PSF_DUE = driver.findElement(By.xpath("//*[text()=\"PSF Due Date\"]"));
			PSF_DUE.click();
			
			Thread.sleep(2000);
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
			
			//...................Select Dealer channel............................................................................
			WebElement select_Dealer = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-5")));
			select_Dealer.click();
			Thread.sleep(1000);
			
			WebElement Select_All = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[1]"));
			Select_All.click();
			Thread.sleep(2000);
            //...............................................................................................
							
			//...................Select Service Type............................................................................
			WebElement select_Service = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-7")));
			Actions actions =new Actions(driver);
			actions.doubleClick(select_Service).perform();
			
			Thread.sleep(1000);
			
			WebElement Select_All2 = driver.findElement(By.xpath("(//*[@class=\"mat-option-text\"])[1]"));
			Select_All2.click();
			
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
			WebElement Total_PSF_Due;
			try {
				Total_PSF_Due = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[2]"));

				// Check if Totalleads_recived element is displayed
				if (!Total_PSF_Due.isDisplayed()||Total_PSF_Due==null) {
					Assert.fail(
							"No Data Found in Zone Region Wise: Total_PSF_Due element is not visible on the page.");
				}
			} catch (NoSuchElementException e) {
				Assert.fail("No Data Found in Zone Region Wise: Total_PSF_Due element could not be found: "
						+ e.getMessage());
				return; // Exit the test if the element is not found
			}

			// Check if Totalleads_recived is enabled
			if (!Total_PSF_Due.isEnabled()) {
				Assert.fail("Total_PSF_Due element is not enabled");
			}

			// Proceed with the rest of your element locators and text retrievals
			WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[3]"));
			WebElement Psf_done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[4]"));
			WebElement Psf_Done_By_Kara = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[5]"));
			WebElement Psf_Done_By_Kara_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[6]"));
			WebElement Done_By_AMIE = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[7]"));
			WebElement Done_By_AMIE_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[8]"));
			WebElement Psf_done_By_CCe = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[9]"));
			WebElement Psf_done_By_CCe_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[10]"));
			WebElement Satisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[11]"));
			WebElement Disatisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[12]"));
			WebElement Call_me_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[13]"));
			WebElement Not_Intrested_providing_Fedback = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[14]"));
			WebElement Wrong_number = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[15]"));
			WebElement Call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[16]"));
			WebElement Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[17]"));
			WebElement pending_Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[18]"));
			WebElement Unallocated_data = driver.findElement(By.xpath("(//tr[td[contains(., 'NORTH')]])[1]/td[19]"));


			Thread.sleep(4000);

			z1 = Total_PSF_Due.getText();
			System.out.println("Total_PSF_Due of Zone and region wise ::" + z1);

			z2 = Psf_done.getText();
			z3 = Psf_done_Percent.getText();
			z4 = Psf_Done_By_Kara.getText();
			z5 = Psf_Done_By_Kara_Percent.getText();
			z6 = Done_By_AMIE.getText();
			z7 = Done_By_AMIE_Percent.getText();
			z8 = Psf_done_By_CCe.getText();
			z9 = Psf_done_By_CCe_percent.getText();
			z10 = Satisfied_rating.getText();
			z11 = Disatisfied_rating.getText();
			z12 = Call_me_Later.getText();
			z13 = Not_Intrested_providing_Fedback.getText();
			z14 = Wrong_number.getText();
			z15 = Call_not_Connected.getText();
			z16 = Fresh.getText();
			z17 = pending_Fresh.getText();
			z18 = Unallocated_data.getText();
			

			Thread.sleep(5000);

			try {
				// Parse the Total Due value to a numeric type
				Integer totalDueValue = Integer.parseInt(z1);

				if (totalDueValue <= 0 || totalDueValue == null) {

					// Fail the test if Total Due value is 0 or less
					Assert.fail("No Data Found for Zone_Region_wise_Wise  Total_PSF_Due:: " + z1);
				} else {
					
				}

			} catch (Exception e) {
				// Fail the test if an exception is thrown
				Assert.fail("No Data Found for Zone_Region_Wise of Total_PSF_Due: " + e.getMessage());
			}
		}
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
					WebElement Total_PSF_Due;
					try {
						Total_PSF_Due = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_PSF_Due.isDisplayed()||Total_PSF_Due==null) {
							Assert.fail(
									"No Data Found in Dealer_Parent_Group_Wise: Total_PSF_Due element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Dealer_Parent_Group_Wise: Total_PSF_Due element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_PSF_Due.isEnabled()) {
						Assert.fail("Dealer_Parent_Group_Wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement Psf_done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement Psf_Done_By_Kara = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement Psf_Done_By_Kara_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement Done_By_AMIE = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement Done_By_AMIE_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement Psf_done_By_CCe = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement Psf_done_By_CCe_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement Satisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement Disatisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement Call_me_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement Not_Intrested_providing_Fedback = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement Wrong_number = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement Call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
					WebElement pending_Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[20]"));
					WebElement Unallocated_data = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[21]"));


					Thread.sleep(4000);

					d1 = Total_PSF_Due.getText();
					System.out.println("Dealer_Parent_Group_Wise of Total_PSF_Due    ::" + d1);

					d2 = Psf_done.getText();
					d3 = Psf_done_Percent.getText();
					d4 = Psf_Done_By_Kara.getText();
					d5 = Psf_Done_By_Kara_Percent.getText();
					d6 = Done_By_AMIE.getText();
					d7 = Done_By_AMIE_Percent.getText();
					d8 = Psf_done_By_CCe.getText();
					d9 = Psf_done_By_CCe_percent.getText();
					d10 = Satisfied_rating.getText();
					d11 = Disatisfied_rating.getText();
					d12 = Call_me_Later.getText();
					d13 = Not_Intrested_providing_Fedback.getText();
					d14 = Wrong_number.getText();
					d15 = Call_not_Connected.getText();
					d16 = Fresh.getText();
					d17 = pending_Fresh.getText();
					d18 = Unallocated_data.getText();
					

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(d1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found for Zone_Region_wise_Wise  Dealer_Parent_Group_Wise:: " + d1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found for Dealer_Parent_Group_Wise of Total_PSF_Due: " + e.getMessage());
					}
				}
				// .........................................................................................................

				@Test(priority = 9)
				public void WorkShop_wise() throws InterruptedException {
					
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
					Thread.sleep(25000);
					
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
					WebElement Total_PSF_Due;
					try {
						Total_PSF_Due = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_PSF_Due.isDisplayed()||Total_PSF_Due==null) {
							Assert.fail(
									"No Data Found in WorkShop_wise: Total_PSF_Due element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in WorkShop_wise: Total_PSF_Due element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_PSF_Due.isEnabled()) {
						Assert.fail("WorkShop_wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement Psf_done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement Psf_Done_By_Kara = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement Psf_Done_By_Kara_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement Done_By_AMIE = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement Done_By_AMIE_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement Psf_done_By_CCe = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement Psf_done_By_CCe_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement Satisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement Disatisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement Call_me_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement Not_Intrested_providing_Fedback = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement Wrong_number = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement Call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));
					WebElement Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[20]"));
					WebElement pending_Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[21]"));
					WebElement Unallocated_data = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[22]"));


					Thread.sleep(4000);

					w1 = Total_PSF_Due.getText();
					System.out.println("WorkShop_wise of Total_PSF_Due    ::" + w1);

					w2 = Psf_done.getText();
					w3 = Psf_done_Percent.getText();
					w4 = Psf_Done_By_Kara.getText();
					w5 = Psf_Done_By_Kara_Percent.getText();
					w6 = Done_By_AMIE.getText();
					w7 = Done_By_AMIE_Percent.getText();
					w8 = Psf_done_By_CCe.getText();
					w9 = Psf_done_By_CCe_percent.getText();
					w10 = Satisfied_rating.getText();
					w11 = Disatisfied_rating.getText();
					w12 = Call_me_Later.getText();
					w13 = Not_Intrested_providing_Fedback.getText();
					w14 = Wrong_number.getText();
					w15 = Call_not_Connected.getText();
					w16 = Fresh.getText();
					w17 = pending_Fresh.getText();
					w18 = Unallocated_data.getText();
					

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(w1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found for WorkShop_wise  :: " + w1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found for WorkShop_wise of Total_PSF_Due: " + e.getMessage());
					}
				}
				// .........................................................................................................

				@Test(priority = 10)
				public void Day_wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					 WebElement Day_Wise = wait
								.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Day Wise \"]")));
						Day_Wise.click();
						Thread.sleep(3000);
																		
				//..................Select Required  Fillters...............................................................
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
						Thread.sleep(2000);
						
				//  3 ..........................click on  Dealer parent group and select All..........................
						WebElement select_Dealer_Parent = wait
								.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-select-value-25")));
						
						Actions action2 =new Actions(driver);
						action2.doubleClick(select_Dealer_Parent).perform();						
						Thread.sleep(2000);
						
						WebElement All3 = driver.findElement(By.cssSelector("[class=\"mat-option-text\"]"));
						All3.click();						
						Thread.sleep(2000);
						
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
					Thread.sleep(25000);
					
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
					WebElement Total_PSF_Due;
					try {
						Total_PSF_Due = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_PSF_Due.isDisplayed()||Total_PSF_Due==null) {
							Assert.fail(
									"No Data Found in Day_wise: Total_PSF_Due element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Day_wise: Total_PSF_Due element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_PSF_Due.isEnabled()) {
						Assert.fail("Day_wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
					WebElement Psf_done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
					WebElement Psf_Done_By_Kara = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement Psf_Done_By_Kara_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement Done_By_AMIE = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement Done_By_AMIE_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement Psf_done_By_CCe = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement Psf_done_By_CCe_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement Satisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement Disatisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement Call_me_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement Not_Intrested_providing_Fedback = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement Wrong_number = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement Call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement pending_Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement Unallocated_data = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));


					Thread.sleep(4000);

					day1 = Total_PSF_Due.getText();
					System.out.println("Day_wise of Total_PSF_Due    ::" + day1);

					day2 = Psf_done.getText();
					day3 = Psf_done_Percent.getText();
					day4 = Psf_Done_By_Kara.getText();
					day5 = Psf_Done_By_Kara_Percent.getText();
					day6 = Done_By_AMIE.getText();
					day7 = Done_By_AMIE_Percent.getText();
					day8 = Psf_done_By_CCe.getText();
					day9 = Psf_done_By_CCe_percent.getText();
					day10 = Satisfied_rating.getText();
					day11 = Disatisfied_rating.getText();
					day12 = Call_me_Later.getText();
					day13 = Not_Intrested_providing_Fedback.getText();
					day14 = Wrong_number.getText();
					day15 = Call_not_Connected.getText();
					day16 = Fresh.getText();
					day17 = pending_Fresh.getText();
					day18 = Unallocated_data.getText();
					

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(day1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found for Day_wise  :: " + day1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found for Day_wise of Total_PSF_Due: " + e.getMessage());
					}
				}
				// .........................................................................................................

				@Test(priority = 11)
				public void Service_Type_wise() throws InterruptedException {
					
					Thread.sleep(7000);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					WebElement Service_Type_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Service Type Wise\"]")));
			        Service_Type_Wise.click();
			        Thread.sleep(3000);
																		
								
						Thread.sleep(2000);
		            //...............................................................................................						
					
					// Click on the generate report button
					WebElement clickOnGenerate = wait
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
					Actions actions2 =new Actions(driver);
					actions2.doubleClick(clickOnGenerate).perform();
					Thread.sleep(25000);
					
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
					WebElement Total_PSF_Due;
					try {
						Total_PSF_Due = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));

						// Check if Totalleads_recived element is displayed
						if (!Total_PSF_Due.isDisplayed()||Total_PSF_Due==null) {
							Assert.fail(
									"No Data Found in Service_Type_Wise  : Total_PSF_Due element is not visible on the page.");
						}
					} catch (NoSuchElementException e) {
						Assert.fail("No Data Found in Service_Type_Wise  : Total_PSF_Due element could not be found: "
								+ e.getMessage());
						return; // Exit the test if the element is not found
					}

					// Check if Totalleads_recived is enabled
					if (!Total_PSF_Due.isEnabled()) {
						Assert.fail("Service_Type_Wise element is not enabled");
					}

					// Proceed with the rest of your element locators and text retrievals
					WebElement Psf_done = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
					WebElement Psf_done_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
					WebElement Psf_Done_By_Kara = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
					WebElement Psf_Done_By_Kara_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
					WebElement Done_By_AMIE = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
					WebElement Done_By_AMIE_Percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
					WebElement Psf_done_By_CCe = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
					WebElement Psf_done_By_CCe_percent = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[10]"));
					WebElement Satisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[11]"));
					WebElement Disatisfied_rating = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[12]"));
					WebElement Call_me_Later = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[13]"));
					WebElement Not_Intrested_providing_Fedback = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[14]"));
					WebElement Wrong_number = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[15]"));
					WebElement Call_not_Connected = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[16]"));
					WebElement Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[17]"));
					WebElement pending_Fresh = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[18]"));
					WebElement Unallocated_data = driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[19]"));


					Thread.sleep(4000);

					s1 = Total_PSF_Due.getText();
					System.out.println("Service_Type_Wise of Total_PSF_Due    ::" + s1);

					s2 = Psf_done.getText();
					s3 = Psf_done_Percent.getText();
					s4 = Psf_Done_By_Kara.getText();
					s5 = Psf_Done_By_Kara_Percent.getText();
					s6 = Done_By_AMIE.getText();
					s7 = Done_By_AMIE_Percent.getText();
					s8 = Psf_done_By_CCe.getText();
					s9 = Psf_done_By_CCe_percent.getText();
					s10 = Satisfied_rating.getText();
					s11 = Disatisfied_rating.getText();
					s12 = Call_me_Later.getText();
					s13 = Not_Intrested_providing_Fedback.getText();
					s14 = Wrong_number.getText();
					s15 = Call_not_Connected.getText();
					s16 = Fresh.getText();
					s17 = pending_Fresh.getText();
					s18 = Unallocated_data.getText();
					

					Thread.sleep(5000);

					try {
						// Parse the Total Due value to a numeric type
						Integer totalDueValue = Integer.parseInt(s1);

						if (totalDueValue <= 0 || totalDueValue == null) {

							// Fail the test if Total Due value is 0 or less
							Assert.fail("No Data Found for Service_Type_Wise  :: " + s1);
						} else {
							
						}

					} catch (Exception e) {
						// Fail the test if an exception is thrown
						Assert.fail("No Data Found for Service_Type_Wise of Total_PSF_Due: " + e.getMessage());
					}
				}

				//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				
				@Test(priority = 12)
				public void Compare_Total_PSF_Due_Of_ZONE_Region_Wise_from__Dealer_Parent_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, d1);
				}
				//..............................................................................................
				@Test(priority = 13)
				public void Compare_Total_PSF_Due_Of_ZONE_Region_Wise_from_Worshop_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, w1);
				}
				//..............................................................................................
				@Test(priority = 14)
				public void Compare_Total_PSF_Due_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
					Thread.sleep(1000);
					Assert.assertEquals(z1, day1);
				}
				//..............................................................................................
				@Test(priority = 15)
				public void Compare_Total_PSF_Due_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
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
							public void Compare_Psf_done_Percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z3.trim().replace(" ", "");
								String normalizedW10 = d3.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
								
							}
							//..............................................................................................
							@Test(priority = 21)
							public void Compare_Psf_done_Percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z3.trim().replace(" ", "");
								String normalizedW10 = w3.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 22)
							public void Compare_Psf_done_Percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z3.trim().replace(" ", "");
								String normalizedW10 = day3.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 23)
							public void Compare_Psf_done_Percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z3.trim().replace(" ", "");
								String normalizedW10 = s3.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
			         //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 24)
							public void Compare_Psf_Done_By_Kara_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, d4);
							}
							//..............................................................................................
							@Test(priority = 25)
							public void Compare_Psf_Done_By_Kara_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, w4);
							}
					      //..............................................................................................
							@Test(priority = 26)
							public void Compare_Psf_Done_By_Kara_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, day4);
							}
					      //..............................................................................................
							@Test(priority = 27)
							public void Compare_Psf_Done_By_Kara_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z4, s4);
							}

			    //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 28)
							public void Compare_Psf_Done_By_Kara_Percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z5.trim().replace(" ", "");
								String normalizedW10 = d5.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 29)
							public void Compare_Psf_Done_By_Kara_Percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z5.trim().replace(" ", "");
								String normalizedW10 = w5.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 30)
							public void Compare_Psf_Done_By_Kara_Percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z5.trim().replace(" ", "");
								String normalizedW10 = day5.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 31)
							public void Compare_Psf_Done_By_Kara_Percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z5.trim().replace(" ", "");
								String normalizedW10 = s5.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
			     //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 32)
							public void Compare_Done_By_AMIE_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, d6);
							}
							//..............................................................................................
							@Test(priority = 33)
							public void Compare_Done_By_AMIE_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, w6);
							}
					      //..............................................................................................
							@Test(priority = 34)
							public void Compare_Done_By_AMIE_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, day6);
							}
					      //..............................................................................................
							@Test(priority = 35)
							public void Compare_Done_By_AMIE_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z6, s6);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 36)
							public void Compare_Done_By_AMIE_Percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z7.trim().replace(" ", "");
								String normalizedW10 = d7.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 37)
							public void Compare_Done_By_AMIE_Percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z7.trim().replace(" ", "");
								String normalizedW10 = w7.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 38)
							public void Compare_Done_By_AMIE_Percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z7.trim().replace(" ", "");
								String normalizedW10 = day7.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 39)
							public void Compare_Done_By_AMIE_Percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z7.trim().replace(" ", "");
								String normalizedW10 = s7.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
			   //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 40)
							public void Compare_Psf_done_By_CCe_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, d8);
							}
							//..............................................................................................
							@Test(priority = 41)
							public void Compare_Psf_done_By_CCe_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, w8);
							}
					      //..............................................................................................
							@Test(priority = 42)
							public void Compare_Psf_done_By_CCe_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, day8);
							}
					      //..............................................................................................
							@Test(priority = 43)
							public void Compare_Psf_done_By_CCe_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z8, s8);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 44)
							public void Compare_Psf_done_By_CCe_percent_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z9.trim().replace(" ", "");
								String normalizedW10 = d9.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							//..............................................................................................
							@Test(priority = 45)
							public void Compare_Psf_done_By_CCe_percent_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z9.trim().replace(" ", "");
								String normalizedW10 = w9.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 46)
							public void Compare_Psf_done_By_CCe_percent_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z9.trim().replace(" ", "");
								String normalizedW10 = day9.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
					      //..............................................................................................
							@Test(priority = 47)
							public void Compare_Psf_done_By_CCe_percent_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								String normalizedZ10 = z9.trim().replace(" ", "");
								String normalizedW10 = s9.trim().replace(" ", "");

								Assert.assertEquals(normalizedZ10, normalizedW10);
							}
							
			            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 48)
							public void Compare_Satisfied_rating_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, d10);
							}
							//..............................................................................................
							@Test(priority = 49)
							public void Compare_Satisfied_rating_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, w10);
							}
					      //..............................................................................................
							@Test(priority = 50)
							public void Compare_Satisfied_rating_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, day10);
							}
					      //..............................................................................................
							@Test(priority = 51)
							public void Compare_Satisfied_rating_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z10, s10);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 52)
							public void Compare_Disatisfied_rating_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, d11);
							}
							//..............................................................................................
							@Test(priority = 53)
							public void Compare_Disatisfied_rating_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, w11);
							}
					      //..............................................................................................
							@Test(priority = 54)
							public void Compare_Disatisfied_rating_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, day11);
							}
					      //..............................................................................................
							@Test(priority = 55)
							public void Compare_Disatisfied_rating_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z11, s11);
							}
							
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 56)
							public void Compare_Call_me_Later_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, d12);
							}
							//..............................................................................................
							@Test(priority = 57)
							public void Compare_Call_me_Later_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, w12);
							}
					      //..............................................................................................
							@Test(priority = 58)
							public void Compare_Call_me_Later_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, day12);
							}
					      //..............................................................................................
							@Test(priority = 59)
							public void Compare_Call_me_Later_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z12, s12);
							}
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 60)
							public void Compare_Not_Intrested_providing_Fedback_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, d13);
							}
							//..............................................................................................
							@Test(priority = 61)
							public void Compare_Not_Intrested_providing_Fedback_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, w13);
							}
					      //..............................................................................................
							@Test(priority = 62)
							public void Compare_Not_Intrested_providing_Fedback_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, day13);
							}
					      //..............................................................................................
							@Test(priority = 63)
							public void Compare_Not_Intrested_providing_Fedback_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z13, s13);
							}
                //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 64)
							public void Compare_Wrong_number_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z14, d14);
							}
							//..............................................................................................
							@Test(priority = 65)
							public void Compare_Wrong_number_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z14, w14);
							}
					      //..............................................................................................
							@Test(priority = 66)
							public void Compare_Wrong_number_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z14, day14);
							}
					      //..............................................................................................
							@Test(priority = 67)
							public void Compare_Wrong_number_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z14, s14);
							}
							
			            //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 68)
							public void Compare_Call_not_Connected_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, d15);
							}
							//..............................................................................................
							@Test(priority = 69)
							public void Compare_Call_not_Connected_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, w15);
							}
					      //..............................................................................................
							@Test(priority = 70)
							public void Compare_Call_not_Connected_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, day15);
							}
					      //..............................................................................................
							@Test(priority = 71)
							public void Compare_Call_not_Connected_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z15, s15);
							}
			 //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 72)
							public void Compare_Fresh_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z16, d16);
							}
							//..............................................................................................
							@Test(priority = 73)
							public void Compare_Fresh_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z16, w16);
							}
					      //..............................................................................................
							@Test(priority = 74)
							public void Compare_Fresh_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z16, day16);
							}
					      //..............................................................................................
							@Test(priority = 75)
							public void Compare_Fresh_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z16, s16);
							}
							
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 76)
							public void Compare_pending_Fresh_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z17, d17);
							}
							//..............................................................................................
							@Test(priority = 77)
							public void Compare_pending_Fresh_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z17, w17);
							}
					      //..............................................................................................
							@Test(priority = 78)
							public void Compare_pending_Fresh_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z17, day17);
							}
					      //..............................................................................................
							@Test(priority = 79)
							public void Compare_pending_Fresh_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z17, s17);
							}
			//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							@Test(priority = 80)
							public void Compare_Unallocated_data_Of_ZONE_Region_Wise_from_Dealer_parent_Group_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z18, d18);
							}
							//..............................................................................................
							@Test(priority = 81)
							public void Compare_Unallocated_data_Of_ZONE_Region_Wise_from_workshop__Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z18, w18);
							}
					      //..............................................................................................
							@Test(priority = 82)
							public void Compare_Unallocated_data_Of_ZONE_Region_Wise_from_Day_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z18, day18);
							}
					      //..............................................................................................
							@Test(priority = 83)
							public void Compare_Unallocated_data_Of_ZONE_Region_Wise_from_Service_Type_Wise() throws InterruptedException {
								Thread.sleep(1000);
								Assert.assertEquals(z18, s18);
							}
			      //.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

									
							
							

							
							
							
							
							
}
