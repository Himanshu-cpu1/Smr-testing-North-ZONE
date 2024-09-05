package merge_SMR_Central_Zone;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SMR_Due_Date_Wise_Central {
	
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
	//..................................................................................................
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

	    @Test(priority = 1)
	    public void Username() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Username = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
	        Username.sendKeys("ZSHArenaC00001");

	        Thread.sleep(2000);
	    }

	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	    @Test(priority = 2)
	    public void Password() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
	        password.sendKeys("Aynjwjq@1");
	               
	          Thread.sleep(3000);
		    	    
	        WebElement login_Button = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
	        login_Button.click();
	        
	    }

	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	    @Test(priority = 3)
	    public void Captcha() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        
	      //.................Enter The Captcha ..................................................................
	        WebElement Image = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
			
			String S1 = Image.getAttribute("value");
			System.out.println("captcha ::"+S1);
						
		    Thread.sleep(3000);
		
	        WebElement captcha_field = driver.findElement(By.cssSelector("[placeholder=\"Enter the captcha..\"]"));
		    captcha_field.sendKeys(S1);
	      //......................................................................	   	    
	    }

	    // wait for 15 Second  and put the captcha code

	//.....................................................................................................

	    @Test(priority = 4)
	    public void SUBMIT_Button() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Submit\"]")));
	        Submit.click();
	        Thread.sleep(20000);


	    }
		
	  //................................................................................................	
	//..................................................................................................
		@Test(priority = 5)
		public void Click_On_Report() throws InterruptedException {
			Thread.sleep(3000);
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement report = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Reports \"]")));
			report.click();
			Thread.sleep(3000);
		
	    }
	  //..............................................................................................................
		//..................................................................................................
				@Test(priority = 6)
				public void Click_On_The_SMR_Due_date_Wise() throws InterruptedException {
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					WebElement SMR = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"SMR Due Date Wise \"]")));
					SMR.click();
					Thread.sleep(3000);
				
			    }
				
				//............................................................................................................
				  @Test(priority = 7)
				    public void Zone_Region_Wise() throws InterruptedException {
				        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				        // Click on the calendar to open date picker
				        WebElement select = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[alt=\"calendar\"]")));
				        select.click();
				        Thread.sleep(4000);

				     // Select start date (1st of the current month)
				        LocalDate today = LocalDate.now();
				        LocalDate firstDayOfMonth = today.withDayOfMonth(1);
				        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

				        WebElement selectStart = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-label=\"" + firstDayOfMonth.format(formatter) + "\"]")));
				        selectStart.click();
				        Thread.sleep(2000);

				        // Select today's date
				        WebElement selectToday = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-label=\"" + today.format(formatter) + "\"]")));
				        selectToday.click();
				        Thread.sleep(2000);
				        
				        // Click on the generate report button
				        WebElement clickOnGenerate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
				        clickOnGenerate.click();
				        
				        Thread.sleep(30000);
				       
				        
				    //Elements of Zone and Region Wise
				       WebElement Data_Assigned =             driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[2]"));
				    	WebElement ReportedAtOWN=         driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[3]"));
				    	WebElement ReportedAt_Same_Parent_Other_Outlet= 
				         driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[4]"));
				    	
				    	WebElement Reported_At_Other=     driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[5]"));
				    	WebElement Appointment_Booked=           driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[6]"));
				    	WebElement call_Me_Later=            driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[7]"));
				    	WebElement Low_Mileage=         driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[8]"));
				    	WebElement vehicle_sold_to_New_Owner=      driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[9]"));
				    	WebElement Refuse_for_service=               driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[10]"));
				    	WebElement Wrong_Number=  driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[11]"));
				    	WebElement Appointmment_Cancelled=      driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[12]"));
				    	WebElement call_Not_Connected=                 driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[13]"));
				    	WebElement Fresh=          driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[14]"));
				    	WebElement pending_Fresh=       driver.findElement(By.xpath("(//tr[td[contains(text(),'CENTRAL')]])[1]/td[15]"));
				    	Thread.sleep(4000);
				    	//GET THE VALUES
				    	
				    	z1= Data_Assigned.getText();
				    	z2= ReportedAtOWN.getText();
				    	z3= ReportedAt_Same_Parent_Other_Outlet.getText();
				    	z4= Reported_At_Other.getText();
				    	z5= Appointment_Booked.getText();
				    	z6= call_Me_Later.getText();
				    	z7= Low_Mileage.getText();
				    	z8= vehicle_sold_to_New_Owner.getText();
				    	z9= Refuse_for_service.getText();
				    	z10=Wrong_Number.getText();
				    	z11= Appointmment_Cancelled.getText();
				    	z12= call_Not_Connected.getText();
				    	z13= Fresh.getText();
				    	z14= pending_Fresh.getText();
				    	Thread.sleep(5000);
				    	
				    	try {
				            
				            // Parse the Total Due value to a numeric type
				            double totalDueValue = Double.parseDouble(z1);
				            
				            if (totalDueValue <= 0) {
				            
				                // Fail the test if Total Due value is 0 or less
				                Assert.fail("No Data Found for Zone And Region Wise In SMR due Date wise : " + z1);
				            } else {
				                // Print the Total Due value
				                System.out.println("Total Data_Assigned of Zone And Region Wise  In SMR due Date wise ::: " + z1);
				            }
				            
				            if(z1==null)
				            {
				            	Assert.fail("No Data Found for Zone And Region Wise In SMR due Date wise  " + z1);
				            }

				        } catch (Exception e) {
				            // Fail the test if an exception is thrown
				            Assert.fail("No Data Found for Zone And Region Wise In SMR due Date wise  " + e.getMessage());
				        }
				    }
				    
				   
////.................................................................................................................
				  
				    @Test(priority = 8)
				    public void Dealer_Parent_Group_Wise() throws InterruptedException {
				        Thread.sleep(7000);
				        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement Dealer_Parent_Group_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Dealer Parent Group Wise \"]")));
				        Dealer_Parent_Group_Wise.click();
				        Thread.sleep(3000);
				        				        
				        // Click on the generate report button
				        WebElement clickOnGenerate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
				        clickOnGenerate.click();
				        
				        Thread.sleep(30000);
				        
				        
				        
				        //Elements of Zone and Region Wise
					       WebElement Data_Assigned =             driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[2]"));
					    	WebElement ReportedAtOWN=         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[3]"));
					    	WebElement ReportedAt_Same_Parent_Other_Outlet= 
					         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[4]"));
					    	
					    	WebElement Reported_At_Other=     driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[5]"));
					    	WebElement Appointment_Booked=           driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[6]"));
					    	WebElement call_Me_Later=            driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[7]"));
					    	WebElement Low_Mileage=         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[8]"));
					    	WebElement vehicle_sold_to_New_Owner=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[9]"));
					    	WebElement Refuse_for_service=               driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[10]"));
					    	WebElement Wrong_Number=  driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[11]"));
					    	WebElement Appointmment_Cancelled=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[12]"));
					    	WebElement call_Not_Connected=                 driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[13]"));
					    	WebElement Fresh=          driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[14]"));
					    	WebElement pending_Fresh=       driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[1]/td[15]"));
					    	
					    	Thread.sleep(4000);
					    	//GET THE VALUES
					    	
					    	String S = Data_Assigned.getText();
					    	System.out.println("Dealer parent group wise  of Data_Assigned in SMR Due Date wise In SMR due Date wise:::"+S);
					    	
					    	d1= Data_Assigned.getText();
					    	d2= ReportedAtOWN.getText();
					    	d3= ReportedAt_Same_Parent_Other_Outlet.getText();
					    	d4= Reported_At_Other.getText();
					    	d5= Appointment_Booked.getText();
					    	d6= call_Me_Later.getText();
					    	d7= Low_Mileage.getText();
					    	d8= vehicle_sold_to_New_Owner.getText();
					    	d9= Refuse_for_service.getText();
					    	d10=Wrong_Number.getText();
					    	d11= Appointmment_Cancelled.getText();
					    	d12= call_Not_Connected.getText();
					    	d13= Fresh.getText();
					    	d14= pending_Fresh.getText();
					    	Thread.sleep(5000);

				        try {
				           
				            // Parse the Total Due value to a numeric type
				            int totalDueValue = Integer.parseInt(d1);
				            
				            if (totalDueValue <= 0 || d1==null) {
				                // Fail the test if Total Due value is 0 or less
				                Assert.fail("No Data Found for Dealer_Parent_Group_Wise In SMR due Date wise: " + d1);
				            } else {
				                // Print the Total Due value
				             //  System.out.println("Total Due value of Dealer_Parent_Group_Wise In SMR due Date wise::: " + d1);
				            }

				        } catch (Exception e) {
				            // Fail the test if an exception is thrown
				            Assert.fail("No Data Found for Dealer_Parent_Group_Wise In SMR due Date wise " + e.getMessage());
				        }
				    }
				    
				    
				   //.................................................................................................................
					  
				    @Test(priority = 9)
				    public void WorkShop_Wise() throws InterruptedException {
				    	Thread.sleep(7000);
				        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement WorkShop_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Workshop Wise \"]")));
				        WorkShop_Wise.click();
				        Thread.sleep(3000);
				        				        
				        // Click on the generate report button
				        WebElement clickOnGenerate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
				        clickOnGenerate.click();
				        
				        Thread.sleep(30000);
				        
				      //Elements of Workshop Wise
					    WebElement Data_Assigned =                 driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[3]"));
					    	WebElement ReportedAtOWN=         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[4]"));
					    	WebElement ReportedAt_Same_Parent_Other_Outlet=       driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[5]"));
					    	WebElement Reported_At_Other=     driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[6]"));
					    	WebElement Appointment_Booked=           driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[7]"));
					    	WebElement call_Me_Later=            driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[8]"));
					    	WebElement Low_Mileage=         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[9]"));
					    	WebElement vehicle_sold_to_New_Owner=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[10]"));
					    	WebElement Refuse_for_service=               driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[11]"));
					    	WebElement Wrong_Number=  driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[12]"));
					    	WebElement Appointmment_Cancelled=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[13]"));
					    	WebElement call_Not_Connected=                 driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[14]"));
					    	WebElement Fresh=          driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[15]"));
					    	WebElement pending_Fresh=       driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[2]/td[16]"));
					    	Thread.sleep(4000);
					    	//GET THE VALUES
					    	
					    	w1= Data_Assigned.getText();
					    	w2= ReportedAtOWN.getText();
					    	w3= ReportedAt_Same_Parent_Other_Outlet.getText();
					    	w4= Reported_At_Other.getText();
					    	w5= Appointment_Booked.getText();
					    	w6= call_Me_Later.getText();
					    	w7= Low_Mileage.getText();
					    	w8= vehicle_sold_to_New_Owner.getText();
					    	w9= Refuse_for_service.getText();
					    	w10=Wrong_Number.getText();
					    	w11= Appointmment_Cancelled.getText();
					    	w12= call_Not_Connected.getText();
					    	w13= Fresh.getText();
					    	w14= pending_Fresh.getText();
					    	Thread.sleep(5000);
					    	
				        Thread.sleep(5000);
				        

				        try {
				           
				            // Parse the Total Due value to a numeric type
				            double totalDueValue = Double.parseDouble(w1);
				            
				            if (totalDueValue <= 0 || w1==null) {
				                // Fail the test if Total Due value is 0 or less
				                Assert.fail("No Data Found for WorkShop_Wise In SMR due Date wise : " + w1);
				            } else {
				                // Print the Total Due value
				                System.out.println("Total Data_Assigned of WorkShop_Wise In SMR due Date wise  ::: " + w1);
				            }

				        } catch (Exception e) {
				            // Fail the test if an exception is thrown
				            Assert.fail("No Data Found for WorkShop_Wise  In SMR due Date wise " + e.getMessage());
				        }
				    }
				    
	//..........................................................................................................
				    
				    
				    @Test(priority = 10)
				    public void Day_Wise() throws InterruptedException {
				        Thread.sleep(7000);
				        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement Day_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Day Wise \"]")));
				        Day_Wise.click();
				        Thread.sleep(3000);
				        
				         // Click on the generate report button
				        WebElement clickOnGenerate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
				        clickOnGenerate.click();
				        
				        Thread.sleep(30000);
				        
				        //Elements of Workshop Wise
					    WebElement Data_Assigned =                 driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[2]"));
					    	WebElement ReportedAtOWN=         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[3]"));
					    	WebElement ReportedAt_Same_Parent_Other_Outlet=       driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[4]"));
					    	WebElement Reported_At_Other=     driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[5]"));
					    	WebElement Appointment_Booked=           driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[6]"));
					    	WebElement call_Me_Later=            driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[7]"));
					    	WebElement Low_Mileage=         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[8]"));
					    	WebElement vehicle_sold_to_New_Owner=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[9]"));
					    	WebElement Refuse_for_service=               driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[10]"));
					    	WebElement Wrong_Number=  driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[11]"));
					    	WebElement Appointmment_Cancelled=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[12]"));
					    	WebElement call_Not_Connected=                 driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[13]"));
					    	WebElement Fresh=          driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[14]"));
					    	WebElement pending_Fresh=       driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[15]"));
					    	Thread.sleep(4000);
					    	//GET THE VALUES
					    	
					    	day1= Data_Assigned.getText();
					    	day2= ReportedAtOWN.getText();
					    	day3= ReportedAt_Same_Parent_Other_Outlet.getText();
					    	day4= Reported_At_Other.getText();
					    	day5= Appointment_Booked.getText();
					    	day6= call_Me_Later.getText();
					    	day7= Low_Mileage.getText();
					    	day8= vehicle_sold_to_New_Owner.getText();
					    	day9= Refuse_for_service.getText();
					    	day10=Wrong_Number.getText();
					    	day11= Appointmment_Cancelled.getText();
					    	day12= call_Not_Connected.getText();
					    	day13= Fresh.getText();
					    	day14= pending_Fresh.getText();
					    	Thread.sleep(5000);

				        try {
				            
				            // Parse the Total Due value to a numeric type
				            Integer totalDueValue = Integer.parseInt(day1);
				            
				            if (totalDueValue <= 0 || day1==null) {
				                // Fail the test if Total Due value is 0 or less
				                Assert.fail("No Data Found for Day Wise In SMR due Date wise  : " + day1);
				            } else {
				                // Print the Total Due value
				                System.out.println("Total Data_Assigned of Day_Wise In SMR due Date wise ::: " + day1);
				            }

				        } catch (Exception e) {
				            // Fail the test if an exception is thrown
				            Assert.fail("No Data Found for Day_Wise  In SMR due Date wise  " + e.getMessage());
				        }
				    }
//...............................................................................................................
				    
				    @Test(priority = 11)
				    public void Service_Type_Wise() throws InterruptedException {
				        Thread.sleep(8000);
				        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement Service_Type_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Service Type Wise \"]")));
				        Service_Type_Wise.click();
				       
				        // Click on the generate report button
				        WebElement clickOnGenerate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
				        clickOnGenerate.click();
				        
				        Thread.sleep(30000);
				       
				       
				        
				        //Elements of Workshop Wise
					    WebElement Data_Assigned =                 driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[2]"));
					    	WebElement ReportedAtOWN=         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[3]"));
					    	WebElement ReportedAt_Same_Parent_Other_Outlet=       driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[4]"));
					    	WebElement Reported_At_Other=     driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[5]"));
					    	WebElement Appointment_Booked=           driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[6]"));
					    	WebElement call_Me_Later=            driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[7]"));
					    	WebElement Low_Mileage=         driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[8]"));
					    	WebElement vehicle_sold_to_New_Owner=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[9]"));
					    	WebElement Refuse_for_service=               driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[10]"));
					    	WebElement Wrong_Number=  driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[11]"));
					    	WebElement Appointmment_Cancelled=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[12]"));
					    	WebElement call_Not_Connected=                 driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[13]"));
					    	WebElement Fresh=          driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[14]"));
					    	WebElement pending_Fresh=       driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[15]"));
					    	Thread.sleep(4000);
					    	//GET THE VALUES
					    	
					    	s1= Data_Assigned.getText();
					    	s2= ReportedAtOWN.getText();
					    	s3= ReportedAt_Same_Parent_Other_Outlet.getText();
					    	s4= Reported_At_Other.getText();
					    	s5= Appointment_Booked.getText();
					    	s6= call_Me_Later.getText();
					    	s7= Low_Mileage.getText();
					    	s8= vehicle_sold_to_New_Owner.getText();
					    	s9= Refuse_for_service.getText();
					    	s10=Wrong_Number.getText();
					    	s11= Appointmment_Cancelled.getText();
					    	s12= call_Not_Connected.getText();
					    	s13= Fresh.getText();
					    	s14= pending_Fresh.getText();
					    	Thread.sleep(5000);
				        try {
				            // Find the attribute value of Total Due
				          // Parse the Total Due value to a numeric type
				            double totalDueValue = Double.parseDouble(s1);
				            
				            if (totalDueValue <= 0 || s1==null) {
				                // Fail the test if Total Due value is 0 or less
				                Assert.fail("No Data Found for Service Type Wise   In SMR due Date wise : " + s1);
				            } else {
				                // Print the Total Due value
				                System.out.println("Total Data_Assigned of Service Type  Wise In SMR due Date wise ::: " + s1);
				            }

				        } catch (Exception e) {
				            // Fail the test if an exception is thrown
				            Assert.fail("No Data Found for Service Type Wise In SMR due Date wise  " + e.getMessage());
				        }
				    }
//..............................................................................................................................................
				   
				  //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					   
				    @Test(priority=12)
					public void Compare_Data_Assigned_of_ZONE_and_Region_with_Dealer_Parent_Group_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z1, d1);
				  }
		//..................................................................................
				    @Test(priority=13)
					public void Compare_Data_Assigned_of_ZONE_and_Region_with_WorkShop_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z1, w1);
				  }
		//..................................................................................
				    @Test(priority=14)
					public void Compare_Data_Assigned_of_ZONE_and_Region_with_Day_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z1, day1);
				  }
		//..................................................................................
				    @Test(priority=15)
					public void Compare_Data_Assigned_of_ZONE_and_Region_with_Service_type_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z1, s1);
				  }
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		    
				    @Test(priority=16)
					public void Compare_ReportedAtOWN_of_ZONE_and_Region_with_Dealer_Parent_Group_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z2,d2);
				  }	    
		//..................................................................................
				    @Test(priority=17)
					public void Compare_ReportedAtOWN_of_ZONE_and_Region_with_WorkShop_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z2,w2);
				  }	     
		//..................................................................................
				    @Test(priority=18)
					public void Compare_ReportedAtOWN_of_ZONE_and_Region_with_Day_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z2,day2);
				  }		    				    
		//..................................................................................
				    @Test(priority=19)
					public void Compare_ReportedAtOWN_of_ZONE_and_Region_with_Service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z2,s2);
				  }		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				    @Test(priority=20)
					public void Compare_ReportedAt_Same_Parent_Other_Outlet_of_ZONE_and_Region_with_Dealer_parent_group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z3,d3);
				  }	
		 //............................................................................

				    @Test(priority=20)
					public void Compare_ReportedAt_Same_Parent_Other_Outlet_of_ZONE_and_Region_with_workshopwise_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z3,w3);
				  }	
		 //............................................................................

				    @Test(priority=21)
					public void Compare_ReportedAt_Same_Parent_Other_Outlet_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z3,day3);
				  }	
		//............................................................................

				    @Test(priority=22)
					public void Compare_ReportedAt_Same_Parent_Other_Outlet_of_ZONE_and_Region_with_service_type__wise() throws InterruptedException {
							    	
					Assert.assertEquals(z3,s3);
				  }
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				    @Test(priority=23)
					public void Compare_Reported_At_Other_of_ZONE_and_Region_with_Dealer_parent_group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z4,d4);
				  }
		//............................................................................

				    @Test(priority=24)
					public void Compare_Reported_At_Other_of_ZONE_and_Region_with_Workshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z4,w4);
				  }
		//............................................................................

				    @Test(priority=25)
					public void Compare_Reported_At_Other_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z4,day4);
				  }
		 //............................................................................

				    @Test(priority=25)
					public void Compare_Reported_At_Other_of_ZONE_and_Region_with_service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z4,s4);
				  }
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				    @Test(priority=26)
					public void Compare_Appointment_Booked_of_ZONE_and_Region_with_Dealer_parent_group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z5,d5);
				  }
			//............................................................................

				    @Test(priority=27)
					public void Compare_Appointment_Booked_of_ZONE_and_Region_with_Worshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z5,w5);
				  }
				//............................................................................

				    @Test(priority=28)
					public void Compare_Appointment_Booked_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z5,day5);
				  }
			//............................................................................

				    @Test(priority=29)
					public void Compare_Appointment_Booked_of_ZONE_and_Region_with_service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z5,s5);
				  }
             //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				    @Test(priority=30)
					public void Compare_call_Me_Later_of_ZONE_and_Region_with_Dealer_parent_Group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z6,d6);
				  }
			//.......................................................................................
				    @Test(priority=31)
					public void Compare_call_Me_Later_of_ZONE_and_Region_with_Workshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z6,w5);
				  }
			//.......................................................................................
				    @Test(priority=32)
					public void Compare_call_Me_Later_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z6,day6);
				  }
			//.......................................................................................
				    @Test(priority=33)
					public void Compare_call_Me_Later_of_ZONE_and_Region_with_Service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z6,s6);
				  }
			 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				    @Test(priority=33)
					public void Compare_Low_Mileage_of_ZONE_and_Region_with_Dealer_parent_group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z7,d7);
				  }
		  //.......................................................................................
				    @Test(priority=34)
					public void Compare_Low_Mileage_of_ZONE_and_Region_with_Workshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z7,w7);
				  }
		 //.......................................................................................
				    @Test(priority=35)
					public void Compare_Low_Mileage_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z7,day7);
				  }
		//.......................................................................................
				    @Test(priority=36)
					public void Compare_Low_Mileage_of_ZONE_and_Region_with_Service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z7,s7);
				  }
				    
	   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
				    @Test(priority=37)
					public void Compare_vehicle_sold_to_New_Owner_of_ZONE_and_Region_with_Dealer_parent_group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z8,d8);
				  }  
		//...........................................................................................
				    @Test(priority=38)
					public void Compare_vehicle_sold_to_New_Owner_of_ZONE_and_Region_with_workshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z8,w8);
				  }  
			//...........................................................................................
				    @Test(priority=39)
					public void Compare_vehicle_sold_to_New_Owner_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
				    	Thread.sleep(1000);		  	
					Assert.assertEquals(z8,day8);
				  } 
		 //...........................................................................................
				    @Test(priority=40)
					public void Compare_vehicle_sold_to_New_Owner_of_ZONE_and_Region_with_service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z8,s8);
				  }
		 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				    @Test(priority=41)
					public void Compare_Refuse_for_service_at_OWN_of_ZONE_and_Region_with_Dealer_Parent_Group_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z9,d9);
				  }
		 //..................................................................................
				    @Test(priority=42)
					public void Compare_Refuse_for_service_at_OWN_of_ZONE_and_Region_with_WorkshoP_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z9,w9);
				  }
		//..................................................................................
				    @Test(priority=43)
					public void Compare_Refuse_for_service_at_OWN_of_ZONE_and_Region_with_Day_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z9,day9);
				  }
		//..................................................................................
				    @Test(priority=44)
					public void Compare_Refuse_for_service_at_OWN_of_ZONE_and_Region_with_service_type_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z9,s9);
				  }
				    
/////////////////////////////////////////////////////////////////////////////////////////////////
	 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				    @Test(priority=26)
					public void Compare_Wrong_Number_of_ZONE_and_Region_with_Dealer_parent_group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z10,d10);
				  }
			//............................................................................

				    @Test(priority=27)
					public void Compare_Wrong_Number_of_ZONE_and_Region_with_Worshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z10,w10);
				  }
				//............................................................................

				    @Test(priority=28)
					public void Compare_Wrong_Number_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z10,day10);
				  }
			//............................................................................

				    @Test(priority=29)
					public void Compare_Wrong_Number_of_ZONE_and_Region_with_service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z10,s10);
				  }
             //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				    @Test(priority=30)
					public void Compare_Appointmment_Cancelled_of_ZONE_and_Region_with_Dealer_parent_Group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z11,d11);
				  }
			//.......................................................................................
				    @Test(priority=31)
					public void Compare_Appointmment_Cancelled_of_ZONE_and_Region_with_Workshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z11,w11);
				  }
			//.......................................................................................
				    @Test(priority=32)
					public void Compare_Appointmment_Cancelled_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z11,day11);
				  }
			//.......................................................................................
				    @Test(priority=33)
					public void Compare_Appointmment_Cancelled_of_ZONE_and_Region_with_Service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z11,s11);
				  }
			 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				    @Test(priority=33)
					public void Compare_call_Not_Connected_of_ZONE_and_Region_with_Dealer_parent_group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z12,d12);
				  }
		  //.......................................................................................
				    @Test(priority=34)
					public void Compare_call_Not_Connected_of_ZONE_and_Region_with_Workshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z12,w12);
				  }
		 //.......................................................................................
				    @Test(priority=35)
					public void Compare_call_Not_Connected_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z12,day12);
				  }
		//.......................................................................................
				    @Test(priority=36)
					public void Compare_call_Not_Connected_of_ZONE_and_Region_with_Service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z12,s12);
				  }
				    
	   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
				    @Test(priority=37)
					public void Compare_Fresh_of_ZONE_and_Region_with_Dealer_parent_group_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z13,d13);
				  }  
		//...........................................................................................
				    @Test(priority=38)
					public void Compare_Fresh_of_ZONE_and_Region_with_workshop_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z13,w13);
				  }  
			//...........................................................................................
				    @Test(priority=39)
					public void Compare_Fresh_of_ZONE_and_Region_with_Day_wise() throws InterruptedException {
				    	Thread.sleep(1000);		  	
					Assert.assertEquals(z13,day13);
				  } 
		 //...........................................................................................
				    @Test(priority=40)
					public void Compare_Fresh_of_ZONE_and_Region_with_service_type_wise() throws InterruptedException {
							    	
					Assert.assertEquals(z13,s13);
				  }
		 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				    @Test(priority=41)
					public void Compare_pending_Fresh_of_ZONE_and_Region_with_Dealer_Parent_Group_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z14,d14);
				  }
		 //..................................................................................
				    @Test(priority=42)
					public void Compare_pending_Fresh_of_ZONE_and_Region_with_WorkshoP_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z14,w14);
				  }
		//..................................................................................
				    @Test(priority=43)
					public void Compare_pending_Fresh_of_ZONE_and_Region_with_Day_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z14,day14);
				  }
		//..................................................................................
				    @Test(priority=44)
					public void Compare_pending_Fresh_of_ZONE_and_Region_with_service_type_Wise() throws InterruptedException {
							    	
					Assert.assertEquals(z14,s14);
				  }
				    
                }
				    


