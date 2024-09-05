package reports_SMR;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
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

public class CrossSellConversion_Report_SMR {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	String z1;
	String z2;
	String z3;
	String z4;
	String z5;
	String z6;
	String z7;
	String z8;
	String d1;
	String d2;
	String d3;
	String d4;
	String d5;
	String d6;
	String d7;
	String d8;
	String w1;
	String w2;
	String w3;
	String w4;
	String w5;
	String w6;
	String w7;
	String w8;
	String day1;
	String day2;
	String day3;
	String day4;
	String day5;
	String day6;
	String day7;
	String day8;
	String s1;
	String s2;
	String s3;
	String s4;
	String s5;
	String s6;
	String s7;
	String s8;
	
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
		Username.sendKeys("North2RSM00001");

		Thread.sleep(2000);
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 2)
	public void Password() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
		password.sendKeys("MarutiCNM#@123");
		Thread.sleep(2000);
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 3)
	public void Login_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
		password.click();
		Thread.sleep(20000);
	}
	
	// wait for 15 Second  and put the captcha code 
	
//.....................................................................................................
			
	@Test(priority = 4)
	public void SUBMIT_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Submit\"]")));
		Submit.click();
		Thread.sleep(3000);
		
	}
	
//..................................................................................................
	@Test(priority = 5)
	public void Click_On_Report() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement report = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Reports \"]")));
		report.click();
		Thread.sleep(3000);
	
    }
//..............................................................................................................
//..................................................................................................
			@Test(priority = 6)
			public void Click_On_CROSS_SELL_CONVERSION_REPORT() throws InterruptedException {
				wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement CrossConv = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Cross Sell Conversion \"]")));
				CrossConv.click();
				Thread.sleep(4000);
			
		    }
//........................................................................................................................
			@Test(priority = 7)
		    public void Zone_And_Region_Wise_Tab() throws InterruptedException {
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
		        
		        WebElement North= driver.findElement(By.xpath("//tr[td[contains(normalize-space(), 'NORTH')]]/td[2]"));
		        North.click();
		        Thread.sleep(3000);
		        
		        //Elements of Zone and Region Wise
		        WebElement TotalInterestedLeads=   driver.findElement(By.xpath("(//th[text()='N2']/following-sibling::th[1])[4]"));
		    	WebElement NotAttemptedLeads=      driver.findElement(By.xpath("(//th[text()='N2']/following-sibling::th[2])[4]"));
		    	WebElement NotConnectedLeads=      driver.findElement(By.xpath("(//th[text()='N2']/following-sibling::th[3])[4]"));
		    	WebElement ConnectedFollowUpLeads= driver.findElement(By.xpath("(//th[text()='N2']/following-sibling::th[4])[4]"));
		    	WebElement ProposalSharedLeads=    driver.findElement(By.xpath("(//th[text()='N2']/following-sibling::th[5])[4]"));
		    	WebElement ReadyToPurchaseLeads=   driver.findElement(By.xpath("(//th[text()='N2']/following-sibling::th[6])[4]"));
		    	WebElement PurchaseCompletedLeads= driver.findElement(By.xpath("(//th[text()='N2']/following-sibling::th[7])[4]"));
		    	WebElement PurchaseCancelledLeads= driver.findElement(By.xpath("(//th[text()='N2']/following-sibling::th[8])[4]"));
		    	
		    	Thread.sleep(4000);
		    	//GET THE VALUES
		    	
		    	z1= TotalInterestedLeads.getText();
		    	z2= NotAttemptedLeads.getText();
		    	z3= NotConnectedLeads.getText();
		    	z4= ConnectedFollowUpLeads.getText();
		    	z5= ProposalSharedLeads.getText();
		    	z6= ReadyToPurchaseLeads.getText();
		    	z7= PurchaseCompletedLeads.getText();
		    	z8= PurchaseCancelledLeads.getText();
		    	
		    	Thread.sleep(5000);
		    	
		    	//value of N2 regions are printed
		    	System.out.println("z1=" +z1);
		    	System.out.println("z2=" +z2);
		    	System.out.println("z3=" +z3);
		    	System.out.println("z4=" +z4);
		    	System.out.println("z5=" +z5);
		    	System.out.println("z6=" +z6);
		    	System.out.println("z7=" +z7);
		    	System.out.println("z8=" +z8);
		    	
		    	
		    	try {
		            // Find the attribute value of Total Interested Leads
		        
		            // Parse the Total Interested Leads value to a numeric type
		            double TotalInterestedValue = Double.parseDouble(z1);
		            
		            if (TotalInterestedValue <= 0 || z1==null) {
		                // Fail the test if Total Interested Leads column Value is 0 or less
		                Assert.fail("No Data Found for Zone And Region Wise: " + z1);
		            } else {
		                // Print the Total Interested Leads value
		                System.out.println("'Total Interested Leads' column Value of Zone And Region Wise Tab is::: " + z1);
		            }

		        } catch (Exception e) {
		            // Fail the test if an exception is thrown
		            Assert.fail("No Data Found for Zone And Region Wise Tab  " + e.getMessage());
		        }
		    }
//......................................................................................................................		    
			@Test(priority = 8)
		    public void Dealer_Parent_Group_Wise_Tab() throws InterruptedException {
		        Thread.sleep(7000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        
		        WebElement Dealer_Parent_Group_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Dealer Parent Group Wise \"]")));
		        Dealer_Parent_Group_Wise.click();
		        Thread.sleep(3000);
		        
		        // Click on the calendar to open date picker
		        WebElement select = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[alt=\"calendar\"]")));
		        select.click();
		        Thread.sleep(3000);

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
		        
		        //set item per page as 100
		        
		        WebElement ItemPerPage= driver.findElement(By.xpath("(//*[@role=\"combobox\"])[4]"));
		        ItemPerPage.click();
		        Thread.sleep(1000);
		        
		        WebElement Items= driver.findElement(By.xpath("(//*[@role=\"option\"])[4]"));
		        Items.click();
		        Thread.sleep(3000);
		        
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
		        
		        //Elements of Dealer Parent Wise
		        WebElement TotalInterestedLeads=   driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[2]"));
		    	WebElement NotAttemptedLeads=      driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[3]"));
		    	WebElement NotConnectedLeads=      driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[4]"));
		    	WebElement ConnectedFollowUpLeads= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[5]"));
		    	WebElement ProposalSharedLeads=    driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[6]"));
		    	WebElement ReadyToPurchaseLeads=   driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[7]"));
		    	WebElement PurchaseCompletedLeads= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[8]"));
		    	WebElement PurchaseCancelledLeads= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[1]/td[9]"));
		    	
		    	Thread.sleep(4000);
		    	//GET THE VALUES
		    	
		    	d1= TotalInterestedLeads.getText();
		    	d2= NotAttemptedLeads.getText();
		    	d3= NotConnectedLeads.getText();
		    	d4= ConnectedFollowUpLeads.getText();
		    	d5= ProposalSharedLeads.getText();
		    	d6= ReadyToPurchaseLeads.getText();
		    	d7= PurchaseCompletedLeads.getText();
		        d8= PurchaseCancelledLeads.getText();
		        
		    	Thread.sleep(5000);
		    	
		        try {
		       
		            // Parse the Total Interested Leads value to a numeric type
		            double TotalInterested = Double.parseDouble(d1);
		            
		            if (TotalInterested <= 0 || d1==null) {
		                // Fail the test if Total Interested value is 0 or less
		                Assert.fail("No Data Found for Dealer Parent Group Wise: " + d1);
		            } else {
		                // Print the Total Interested value
		                System.out.println("'Total Interested Leads' column value of Dealer Parent Group Wise Tab is::: " + d1);
		            }

		        } catch (Exception e) {
		            // Fail the test if an exception is thrown
		            Assert.fail("No Data Found for Dealer Parent Group Wise Tab " + e.getMessage());
		        }
		    }
//.............................................................................................................................		    
			@Test(priority = 9)
		    public void WorkShop_Wise_Tab() throws InterruptedException {
		    	Thread.sleep(7000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        
		        WebElement WorkShop_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Workshop Wise \"]")));
		        WorkShop_Wise.click();
		        Thread.sleep(3000);
		        
		        // Click on the calendar to open date picker
		        WebElement select = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[alt=\"calendar\"]")));
		        select.click();
		        Thread.sleep(3000);
                 
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
		 	        
		        //set item per page as 100
		        
		        WebElement ItemPerPage= driver.findElement(By.xpath("(//*[@role=\"combobox\"])[5]"));
		        ItemPerPage.click();
		        Thread.sleep(1000);
		        
		        WebElement Items= driver.findElement(By.xpath("(//*[@role=\"option\"])[4]"));
		        Items.click();
		        Thread.sleep(3000);
		        
		        boolean lastPageReached = false;

		        while (!lastPageReached) {
		            // Check if the next page button is disabled
		            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[8]"));
		            
		            if (!nextPageButton.isEnabled()) {
		                lastPageReached = true;
		            } else {
		                // Click on the next page button
		                nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[8]"));
		                nextPageButton.click();
		                Thread.sleep(3000);
		            }
		        }
		        
		        //Elements of Workshop Wise
		        WebElement TotalInterestedLeads=   driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[2]/td[3]"));
		    	WebElement NotAttemptedLeads=      driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[2]/td[4]"));
		    	WebElement NotConnectedLeads=      driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[2]/td[5]"));
		    	WebElement ConnectedFollowUpLeads= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[2]/td[6]"));
		    	WebElement ProposalSharedLeads=    driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[2]/td[7]"));
		    	WebElement ReadyToPurchaseLeads=   driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[2]/td[8]"));
		    	WebElement PurchaseCompletedLeads= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[2]/td[9]"));
		    	WebElement PurchaseCancelledLeads= driver.findElement(By.xpath("(//tr[td[contains(., 'Total')]])[2]/td[10]"));
		    	
		    	Thread.sleep(4000);
		    	//GET THE VALUES
		    	
		    	w1= TotalInterestedLeads.getText();
		    	w2= NotAttemptedLeads.getText();
		    	w3= NotConnectedLeads.getText();
		    	w4= ConnectedFollowUpLeads.getText();
		    	w5= ProposalSharedLeads.getText();
		    	w6= ReadyToPurchaseLeads.getText();
		    	w7= PurchaseCompletedLeads.getText();
		    	w8= PurchaseCancelledLeads.getText();
		    	Thread.sleep(5000);
		    	
		        try {
		            // Find the attribute value of Total Interested Leads
		        	
		            // Parse the Total Interested Leads value to a numeric type
		            double TotalInterested = Double.parseDouble(w1);
		            
		            if (TotalInterested <= 0 || w1==null) {
		                // Fail the test if Total Interested Leads value is 0 or less
		                Assert.fail("No Data Found for WorkShop_Wise: " + w1);
		            } else {
		                // Print the Total Interested Leads value
		                System.out.println("'Total Interested Leads' column value of WorkShop Wise Tab is::: " + w1);
		            }

		        } catch (Exception e) {
		            // Fail the test if an exception is thrown
		            Assert.fail("No Data Found for WorkShop Wise Tab  " + e.getMessage());
		        }
		    }
		    
//..........................................................................................................
			@Test(priority = 10)
		    public void Day_Wise_Tab() throws InterruptedException {
		    	Thread.sleep(7000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        
		        WebElement Day_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Day Wise \"]")));
		        Day_Wise.click();
		        Thread.sleep(3000);
		        
		        // Click on the calendar to open date picker
		        WebElement select = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[alt=\"calendar\"]")));
		        select.click();
		        Thread.sleep(3000);
                 
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
		             
		        //set item per page as 100
		        
		        WebElement ItemPerPage= driver.findElement(By.xpath("(//*[@role=\"combobox\"])[6]"));
		        Actions actions1 = new Actions(driver);
                actions1.click(ItemPerPage).perform();

		        Thread.sleep(2000);
		        
		        WebElement Items= driver.findElement(By.xpath("(//*[@role=\"option\"])[4]"));
		        Items.click();
		        Thread.sleep(3000);
		        
		        boolean lastPageReached = false;

		        while (!lastPageReached) {
		            // Check if the next page button is disabled
		            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[10]"));
		            
		            if (!nextPageButton.isEnabled()) {
		                lastPageReached = true;
		            } else {
		                // Click on the next page button
		                nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[10]"));
		                nextPageButton.click();
		                Thread.sleep(3000);
		            }
		        }
		        
		            //Elements of Day Wise
		        WebElement TotalInterestedLeads=   driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[2]"));
		    	WebElement NotAttemptedLeads=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[3]"));
		    	WebElement NotConnectedLeads=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[4]"));
		    	WebElement ConnectedFollowUpLeads= driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[5]"));
		    	WebElement ProposalSharedLeads=    driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[6]"));
		    	WebElement ReadyToPurchaseLeads=   driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[7]"));
		    	WebElement PurchaseCompletedLeads= driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[8]"));
		    	WebElement PurchaseCancelledLeads= driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[3]/td[9]"));
		    	
		    	Thread.sleep(4000);
		    	//GET THE VALUES
		    	
		    	day1= TotalInterestedLeads.getText();
		        day2= NotAttemptedLeads.getText();
		        day3= NotConnectedLeads.getText();
		        day4= ConnectedFollowUpLeads.getText();
		        day5= ProposalSharedLeads.getText();
		        day6= ReadyToPurchaseLeads.getText();
		        day7= PurchaseCompletedLeads.getText();
		        day8= PurchaseCancelledLeads.getText();
		        
		        Thread.sleep(5000);
		    	
		        try {
		            // Find the attribute value of Total Interested Leads
		         
		            // Parse the Total Interested Leads value to a numeric type
		            double TotalInterested  = Double.parseDouble(day1);
		            
		            if (TotalInterested  <= 0 || day1==null) {
		                // Fail the test if Total Interested Leads value is 0 or less
		                Assert.fail("No Data Found for Day Wise Tab: " + day1);
		            } else {
		                // Print the Total Interested Leads value
		                System.out.println("'Total Interested Leads' column value of Day Wise Tab is ::: " + day1);
		            }

		        } catch (Exception e) {
		            // Fail the test if an exception is thrown
		            Assert.fail("No Data Found for Day Wise Tab  " + e.getMessage());
		        }
		    }
		    
//..........................................................................................................
			@Test(priority = 11)
		    public void Service_Type_Wise_Tab() throws InterruptedException {
		    	Thread.sleep(7000);
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        
		        WebElement Service_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Service Type Wise \"]")));
		        Service_Wise.click();
		        Thread.sleep(3000);
		        
		        // Click on the calendar to open date picker
		        WebElement select = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[alt=\"calendar\"]")));
		        select.click();
		        Thread.sleep(3000);
                 
		        //Select start date (1st of the current month)
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
		        
		        Thread.sleep(35000);
		             
		        //set item per page as 100
		        
		        WebElement ItemPerPage= driver.findElement(By.xpath("(//*[@role=\"combobox\"])[7]"));
		        ItemPerPage.click();
		        Thread.sleep(1000);
		        
		        WebElement Items= driver.findElement(By.xpath("(//*[@role=\"option\"])[4]"));
		        Items.click();
		        Thread.sleep(3000);
		        
		        boolean lastPageReached = false;

		        while (!lastPageReached) {
		            // Check if the next page button is disabled
		            WebElement nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[12]"));
		            
		            if (!nextPageButton.isEnabled()) {
		                lastPageReached = true;
		            } else {
		                // Click on the next page button
		                nextPageButton = driver.findElement(By.xpath("(//*[@type=\"button\"])[12]"));
		                nextPageButton.click();
		                Thread.sleep(3000);
		            }
		        }
		        
		        //Elements of Service Type Wise
		        WebElement TotalInterestedLeads=   driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[2]"));
		    	WebElement NotAttemptedLeads=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[3]"));
		    	WebElement NotConnectedLeads=      driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[4]"));
		    	WebElement ConnectedFollowUpLeads= driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[5]"));
		    	WebElement ProposalSharedLeads=    driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[6]"));
		    	WebElement ReadyToPurchaseLeads=   driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[7]"));
		    	WebElement PurchaseCompletedLeads= driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[8]"));
		    	WebElement PurchaseCancelledLeads= driver.findElement(By.xpath("(//tr[td[contains(text(),'Total')]])[4]/td[9]"));
		    	
		    	Thread.sleep(4000);
		    	//GET THE VALUES
		    	
		    	s1= TotalInterestedLeads.getText();
		        s2= NotAttemptedLeads.getText();
		        s3= NotConnectedLeads.getText();
		        s4= ConnectedFollowUpLeads.getText();
		        s5= ProposalSharedLeads.getText();
		        s6= ReadyToPurchaseLeads.getText();
		        s7= PurchaseCompletedLeads.getText();
		        s8= PurchaseCancelledLeads.getText();
		    	Thread.sleep(5000);
		    	
		        try {
		            // Find the attribute value of Total Interested Leads
		         
		            // Parse the Total Interested Leads value to a numeric type
		            double TotalInterested = Double.parseDouble(s1);
		            
		            if (TotalInterested <= 0 || s1==null) {
		                // Fail the test if Total Interested Leads value is 0 or less
		                Assert.fail("No Data Found for Service Type Wise Tab: " + s1);
		            } else {
		                // Print the Total Interested Leads value
		                System.out.println("'Total Interested Leads' column value of Service Type Wise Tab is ::: " + s1);
		            }

		        } catch (Exception e) {
		            // Fail the test if an exception is thrown
		            Assert.fail("No Data Found for Service Type Wise Tab  " + e.getMessage());
		        }
		    }
//..................................................................................................................			
			@Test(priority = 12)
			public void Dump_Wise_Tab() throws InterruptedException, TimeoutException {
			    // Wait for the page to load
			    Thread.sleep(6000);
			    
			    // Initialize WebDriverWait
			    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			    
			    // Click on the "Dump Wise" option
			    WebElement Dump_Wise = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\" Dump Wise \"]")));
			    Dump_Wise.click();
			    Thread.sleep(2000);
			    
			 // Click on the calendar to open date picker
		        WebElement select = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[alt=\"calendar\"]")));
		        select.click();
		        Thread.sleep(3000);
			    
		     // Calculate dates
			    LocalDate today = LocalDate.now();
			    LocalDate twoDaysAgo = today.minusDays(2);
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		        
			    // Select start date (2 days before today)
			    WebElement selectStart = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-label=\"" + twoDaysAgo.format(formatter) + "\"]")));
			    selectStart.click();
			    Thread.sleep(2000);

			    // Select today's date
			    WebElement selectToday = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-label=\"" + today.format(formatter) + "\"]")));
			    selectToday.click();
			    Thread.sleep(2000);
			    
			 // Click on the generate report button
		        WebElement clickOnGenerate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Generate\"]")));
		        clickOnGenerate.click();
		        Thread.sleep(20000);
			    				    			    			    
//			    // Click on the "Download" button for first dump
//			    WebElement Download_Dump1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"Download\"])[1]")));
//			    Actions actions1 = new Actions(driver);
//                actions1.click(Download_Dump1).perform();

			    Thread.sleep(6000);
			    
//			 // Click on the "Download" button for second dump
//			    WebElement Download_Dump2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()=\"Download\"])[2]")));
//			    Actions actions2 = new Actions(driver);
//                actions2.click(Download_Dump2).perform();
//
//			    Thread.sleep(5000);	
			   
}

//..........................................................................................................
			@Test(priority=13)
			public void Compare_TotalInterestedLeads_Column_ZoneRegionWise_With_DealerParentWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(d1, z1);
		  }
//...................................................................................................	
		    @Test(priority=14)
			public void Compare_NotAttemptedLeads_Column_ZoneRegionWise_With_DealerParentWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(d2, z2);
		  }
//...................................................................................................			
		    @Test(priority=15)
			public void Compare_NotConnectedLeads_Column_ZoneRegionWise_With_DealerParentWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(d3, z3);
		  }
//...................................................................................................	
		    @Test(priority=16)
			public void Compare_ConnectedFollowUpLeads_Column_ZoneRegionWise_With_DealerParentWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(d4, z4);
		  }
//...................................................................................................	
		    @Test(priority=17)
			public void Compare_ProposalSharedLeads_Column_ZoneRegionWise_With_DealerParentWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(d5, z5);
		  }
//...................................................................................................	
		    @Test(priority=18)
			public void Compare_ReadyToPurchaseLeads_Column_ZoneRegionWise_With_DealerParentWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(d6, z6);
		  }
//...................................................................................................	
		    @Test(priority=19)
			public void Compare_PurchaseCompletedLeads_Column_ZoneRegionWise_With_DealerParentWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(d7, z7);
		  }
//...................................................................................................	
		    @Test(priority=20)
			public void Compare_PurchaseCancelledLeads_Column_ZoneRegionWise_With_DealerParentWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(d8, z8);
		  }
//...................................................................................................	
		    @Test(priority=21)
			public void Compare_TotalInterestedLeads_Column_ZoneRegionWise_With_WorkshopWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w1, z1);
		  }
//...................................................................................................	
		    @Test(priority=22)
			public void Compare_NotAttemptedLeads_Column_ZoneRegionWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w2, z2);
		  }
//...................................................................................................	
		    @Test(priority=23)
			public void Compare_NotConnectedLeads_Column_ZoneRegionWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w3, z3);
		  }
//...................................................................................................	
		    @Test(priority=24)
			public void Compare_ConnectedFollowUpLeads_Column_ZoneRegionWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w4, z4);
		  }
//...................................................................................................	
		    @Test(priority=25)
			public void Compare_ProposalSharedLeads_Column_ZoneRegionWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w5, z5);
		  }
//...................................................................................................	
		    @Test(priority=26)
			public void Compare_ReadyToPurchaseLeads_Column_ZoneRegionWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w6, z6);
		  }
//...................................................................................................	
		    @Test(priority=27)
			public void Compare_PurchaseCompletedLeads_Column_ZoneRegionWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w7, z7);
		  }
//...................................................................................................	
		    @Test(priority=28)
			public void Compare_PurchaseCancelledLeads_Column_ZoneRegionWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w8, z8);
		  }
//...................................................................................................	
		    @Test(priority=29)
			public void Compare_TotalInterestedLeads_Column_ZoneRegionWise_With_DayWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day1, z1);
		  }
//...................................................................................................	
		    @Test(priority=30)
			public void Compare_NotAttemptedLeads_Column_ZoneRegionWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day2, z2);
		  }
//...................................................................................................	
		    @Test(priority=31)
			public void Compare_NotConnectedLeads_Column_ZoneRegionWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day3, z3);
		  }
//...................................................................................................	
		    @Test(priority=32)
			public void Compare_ConnectedFollowUpLeads_Column_ZoneRegionWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day4, z4);
		  }
//...................................................................................................	
		    @Test(priority=33)
			public void Compare_ProposalSharedLeads_Column_ZoneRegionWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day5, z5);
		  }
//...................................................................................................	
		    @Test(priority=34)
			public void Compare_ReadyToPurchaseLeads_Column_ZoneRegionWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day6, z6);
		  }
//...................................................................................................	
		    @Test(priority=35)
			public void Compare_PurchaseCompletedLeads_Column_ZoneRegionWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day7, z7);
		  }
//...................................................................................................	
		    @Test(priority=36)
			public void Compare_PurchaseCancelledLeads_Column_ZoneRegionWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day8, z8);
		  }
//...................................................................................................	
		    @Test(priority=37)
			public void Compare_TotalInterestedLeads_Column_ZoneRegionWise_With_ServiceTypeWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s1, z1);
		  }
//...................................................................................................	
		    @Test(priority=38)
			public void Compare_NotAttemptedLeads_Column_ZoneRegionWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s2, z2);
		  }
//...................................................................................................	
		    @Test(priority=39)
			public void Compare_NotConnectedLeads_Column_ZoneRegionWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s3, z3);
		  }
//...................................................................................................	
		    @Test(priority=40)
			public void Compare_ConnectedFollowUpLeads_Column_ZoneRegionWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s4, z4);
		  }
//...................................................................................................	
		    @Test(priority=41)
			public void Compare_ProposalSharedLeads_Column_ZoneRegionWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s5, z5);
		  }
//...................................................................................................	
		    @Test(priority=42)
			public void Compare_ReadyToPurchaseLeads_Column_ZoneRegionWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s6, z6);
		  }
//...................................................................................................	
		    @Test(priority=43)
			public void Compare_PurchaseCompletedLeads_Column_ZoneRegionWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s7, z7);
		  }
//...................................................................................................	
		    @Test(priority=44)
			public void Compare_PurchaseCancelledLeads_Column_ZoneRegionWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s8, z8);
		  }
//...................................................................................................	
		    @Test(priority=45)
			public void Compare_TotalInterestedLeads_Column_DealerParentWise_With_WorkshopWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w1, d1);
		  }
//...................................................................................................	
		    @Test(priority=46)
			public void Compare_NotAttemptedLeads_Column_DealerParentWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w2, d2);
		  }
//...................................................................................................	
		    @Test(priority=47)
			public void Compare_NotConnectedLeads_Column_DealerParentWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w3, d3);
		  }
//...................................................................................................	
		    @Test(priority=48)
			public void Compare_ConnectedFollowUpLeads_Column_DealerParentWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w4, d4);
		  }
//...................................................................................................	
		    @Test(priority=49)
			public void Compare_ProposalSharedLeads_Column_DealerParentWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w5, d5);
		  }
//...................................................................................................	
		    @Test(priority=50)
			public void Compare_ReadyToPurchaseLeads_Column_DealerParentWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w6, d6);
		  }
//...................................................................................................	
		    @Test(priority=51)
			public void Compare_PurchaseCompletedLeads_Column_DealerParentWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w7, d7);
		  }
//...................................................................................................	
		    @Test(priority=52)
			public void Compare_PurchaseCancelledLeads_Column_DealerParentWise_With_WorkshopWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(w8, d8);
		  }
//...................................................................................................	
		    @Test(priority=53)
			public void Compare_TotalInterestedLeads_Column_DealerParentWise_With_DayWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day1, d1);
		  }
//...................................................................................................	
		    @Test(priority=54)
			public void Compare_NotAttemptedLeads_Column_DealerParentWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day2, d2);
		  }
//...................................................................................................	
		    @Test(priority=55)
			public void Compare_NotConnected_Column_DealerParentWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day3, d3);
		  }
//...................................................................................................	
		    @Test(priority=56)
			public void Compare_ConnectedFollowUpLeads_Column_DealerParentWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day4, d4);
		  }
//...................................................................................................	
		    @Test(priority=57)
			public void Compare_ProposalSharedLeads_Column_DealerParentWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day5, d5);
		  }
//...................................................................................................	
		    @Test(priority=58)
			public void Compare_ReadyToPurchaseLeads_Column_DealerParentWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day6, d6);
		  }
//...................................................................................................	
		    @Test(priority=59)
			public void Compare_PurchaseCompletedLeads_Column_DealerParentWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day7, d7);
		  }
//...................................................................................................	
		    @Test(priority=60)
			public void Compare_PurchaseCancelledLeads_Column_DealerParentWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day8, d8);
		  }
//...................................................................................................	
		    @Test(priority=61)
			public void Compare_TotalInterestedLeads_Column_DealerParentWise_With_ServiceTypeWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s1, d1);
		  }
//...................................................................................................	
		    @Test(priority=62)
			public void Compare_NotAttemptedLeads_Column_DealerParentWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s2, d2);
		  }
//...................................................................................................	
		    @Test(priority=63)
			public void Compare_NotConnectedLeads_Column_DealerParentWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s3, d3);
		  }
//...................................................................................................	
		    @Test(priority=64)
			public void Compare_ConnectedFollowUpLeads_Column_DealerParentWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s4, d4);
		  }
//...................................................................................................	
		    @Test(priority=65)
			public void Compare_ProposalSharedLeads_Column_DealerParentWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s5, d5);
		  }
//...................................................................................................	
		    @Test(priority=66)
			public void Compare_ReadyToPurchaseLeads_Column_DealerParentWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s6, d6);
		  }
//...................................................................................................	
		    @Test(priority=67)
			public void Compare_PurchaseCompletedLeads_Column_DealerParentWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s7, d7);
		  }
//...................................................................................................	
		    @Test(priority=68)
			public void Compare_PurchaseCancelledLeads_Column_DealerParentWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s8, d8);
		  }
//...................................................................................................	
            @Test(priority=69)
			
		    public void Compare_TotalInterestedLeads_Column_WorkshopWise_With_DayWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day1, w1);
		  }
//...................................................................................................	
		    @Test(priority=70)
			public void Compare_NotAttemptedLeads_Column_WorkshopWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day2, w2);
		  }
//...................................................................................................	
		    @Test(priority=71)
			public void Compare_NotConnectedLeads_Column_WorkshopWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day3, w3);
		  }
//...................................................................................................	
		    @Test(priority=72)
			public void Compare_ConnectedFollowUpLeads_Column_WorkshopWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day4, w4);
		  }
//...................................................................................................	
		    @Test(priority=73)
			public void Compare_ProposalSharedLeads_Column_WorkshopWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day5, w5);
		  }
//...................................................................................................	
		    @Test(priority=74)
			public void Compare_ReadyToPurchaseLeads_Column_WorkshopWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day6, w6);
		  }
//...................................................................................................	
		    @Test(priority=75)
			public void Compare_PurchaseCompletedLeads_Column_WorkshopWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day7, w7);
		  }
//...................................................................................................	
		    @Test(priority=76)
			public void Compare_PurchaseCancelledLeads_Column_WorkshopWise_With_DayWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(day8, w8);
		  }
//...................................................................................................	
		    @Test(priority=77)
			public void Compare_TotalInterestedLeads_Column_WorkshopWise_With_ServiceTypeWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s1, w1);
		  }
//...................................................................................................	
		    @Test(priority=78)
			public void Compare_NotAttemptedLeads_Column_WorkshopWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s2, w2);
		  }
//...................................................................................................	
		    @Test(priority=79)
			public void Compare_NotConnectedLeads_Column_WorkshopWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s3, w3);
		  }
//...................................................................................................	
		    @Test(priority=80)
			public void Compare_ConnectedFollowUpLeads_Column_WorkshopWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s4, w4);
		  }
//...................................................................................................	
		    @Test(priority=81)
			public void Compare_ProposalSharedLeads_Column_WorkshopWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s5, w5);
		  }
//...................................................................................................	
		    @Test(priority=82)
			public void Compare_ReaduToPurchaseLeads_Column_WorkshopWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s6, w6);
		  }
//...................................................................................................	
		    @Test(priority=83)
			public void Compare_PurchseCompletedLeads_Column_WorkshopWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s7, w7);
		  }
//...................................................................................................	
		    @Test(priority=84)
			public void Compare_PurchaseCancelledLeads_Column_WorkshopWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s8, w8);
		  }
//...................................................................................................	
		    @Test(priority=85)
			public void Compare_TotalInterestedLeads_Column_DayWise_With_ServiceTypeWise() throws InterruptedException {
			Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s1, day1);
		  }
//...................................................................................................	
		    @Test(priority=86)
			public void Compare_NotAttemptedLeads_Column_DayWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s2, day2);
		  }
//...................................................................................................	
		    @Test(priority=87)
			public void Compare_NotConnectedLeads_Column_DayWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s3, day3);
		  }
//...................................................................................................	
		    @Test(priority=88)
			public void Compare_ConnectedFollowUpLeads_Column_DayWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s4, day4);
		  }
//...................................................................................................	
		    @Test(priority=89)
			public void Compare_ProposalSharedLeads_Column_DayWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s5, day5);
		  }
//...................................................................................................	
		    @Test(priority=90)
			public void Compare_ReadyToPurchaseLeads_Column_DayWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s6, day6);
		  }
//...................................................................................................	
		    @Test(priority=91)
			public void Compare_PurchaseCompletedLeads_Column_DayWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s7, day7);
		  }
//...................................................................................................	
		    @Test(priority=92)
			public void Compare_PurchaseCancelledLeads_Column_DayWise_With_ServiceTypeWise() throws InterruptedException {
		    	Thread.sleep(1000);
		    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Assert.assertEquals(s8, day8);
		  }
//...................................................................................................	
		       			
	

}
