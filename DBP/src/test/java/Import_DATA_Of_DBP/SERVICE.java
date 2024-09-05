package Import_DATA_Of_DBP;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SERVICE extends LOGIN {
	public static WebDriver driver;
	public WebDriverWait wait;
	
	//........................................................................................................
	long s1;
	long s2;
	
	long s4;
	
	long s6;
	long s7;
	long s8;
	long s9;
	long s10;
	
	long s11;
	long s12;
	long s13;
	long s14;
	long s15;
	long s16;
	long s17;
	long s18;
	
	long s19;
	long s20;
	long s21;
	long s22;
	long s23;
	long s24;
	long s25;
	long s26;
	long s27;
	
	long s28;
	long s29;
	long s30;
	long s31;
	long s32;
	long s33;
	long s34;
	long s35;
	
	long s36;
	long s37;
	long s38;
	long s39;
	long s40;
	long s41;
	long s42;
	long s43;
	
	long s44;
	long s45;
	long s46;
	long s47;
	long s48;
	long s49;
	
	double N_cars1;
	double SS2;
	double SS3;
	long MP;
     long	ic;
	//.......................................................................................................

	@SuppressWarnings("static-access")
	@BeforeClass
	public void Services() throws InterruptedException {
	
		Thread.sleep(3000);
		//...................................................................................    	
		   this.driver=LOGIN.driver;   // call the login page 	
//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//...................................................................................................................................................	
	//click on Service  option 
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),\"Service \")])[1]")).click();        
	Thread.sleep(4000);
	   }
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//..................Click on the new Cars............................................................................
  	       @Test(priority=0)
            public void  Click_on_NewCars	() throws InterruptedException {  
  	       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement Cars1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"New Car \")])[1]")));
			  Cars1.click();
			 // Define the expected URL
	        String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/New-car";

	        // Wait until the URL is the expected URL
	        wait.until(ExpectedConditions.urlToBe(expectedURL));

	        // Get the current URL after the click
	        String currentURL = driver.getCurrentUrl();

	        // Print the current URL for debugging purposes
	        System.out.println("currentURL = " + currentURL);

	        // Compare the current URL with the expected URL
	        Assert.assertEquals(expectedURL, currentURL);
//........................................Find The Values to match...........................................................
	        
       WebElement NEW_cars_1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
										
       N_cars1 = Double.parseDouble(NEW_cars_1.getAttribute("value"));
       long New_car = (long) N_cars1;
       
       System.out.println("New Car Retail Sales In (NEW cars)  VALUE =  " + New_car );
 //.............................................................................................     	
      
    //click on service again
  	Thread.sleep(4000);
  	driver.findElement(By.xpath("(//*[contains(text(),\"Service \")])[1]")).click();        
  	Thread.sleep(4000);
  	}		 
//....................................................................................................................
	@Test(priority=1)     // clear the data
	public void Clear_Data() throws InterruptedException {
//	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	Thread.sleep(2000);
//	    
//	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
//	String actualMessage = Validationmessage.getText();
//		   
//	System.out.println("Clear data Message  =" +actualMessage);
//	String expectedMessage = "Cleared Successfully";
//	Thread.sleep(3000);
//	Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
////................................................................................................
	///........................Find The Path Of all Input Fields........................................................................
    WebElement S1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
	WebElement S2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
	
	WebElement S4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
	
	WebElement S6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));		
	WebElement S7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));	
	WebElement S8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));									
	WebElement S9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));				
	WebElement S10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
	WebElement S11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));			
	WebElement S12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));								
	WebElement S13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));				
	WebElement S14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));		
	WebElement S15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));		
	WebElement S16 = driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));									
	WebElement S17 = driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));		
	WebElement S18 = driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
	WebElement S19 = driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
	
	WebElement S20 = driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));			
	WebElement S21 = driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));								
	WebElement S22 = driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));				
	WebElement S23 = driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));		
	WebElement S24 = driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));		
	WebElement S25 = driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));									
	WebElement S26 = driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));		
	WebElement S27 = driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
	WebElement S28 = driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));	
	WebElement S29 = driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));									
	WebElement S30 = driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));		
	WebElement S31 = driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
	WebElement S32 = driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
	WebElement S33 = driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));									
	WebElement S34 = driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));		
	WebElement S35 = driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
	WebElement S36 = driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
	WebElement S37 = driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));									
	WebElement S38 = driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));		
	WebElement S39 = driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
	WebElement S40 = driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
	WebElement S41 = driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));									
	WebElement S42 = driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));		
	WebElement S43 = driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
	
	WebElement S44 = driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
	WebElement S45 = driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
	WebElement S46 = driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
	WebElement S47 = driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
	
	WebElement S48 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement S49 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));

	//.....................................................................................................................
	//...........................Send The Values..........................................................
	Thread.sleep(2000);
	
//	S1.sendKeys("-PH700300.");
//	S2.sendKeys("-kH500200.");
//	
//	S4.sendKeys("-PH600300.");
//	
//	S6.sendKeys("-tY100300.");
//	S8.sendKeys("-Uq200300.");
//	S10.sendKeys("-PH700300.");
//	S11.sendKeys("-tY100300.");
//	S12.sendKeys("-Uq200300.");
//	S13.sendKeys("-PH700300.");
//	S14.sendKeys("-tY100300.");
//	S15.sendKeys("-Uq200300.");
//	S16.sendKeys("-PH700300.");
//	S17.sendKeys("-tY100300.");
//	S18.sendKeys("-Uq900300.");
//	S19.sendKeys("-PH700300.");
//	
//	S24.sendKeys("-PH400300.");
//	S26.sendKeys("-tY200300.");
//	S28.sendKeys("-Uq500300.");
//	S30.sendKeys("-PH800300.");
//	S32.sendKeys("-PH500300.");
//	S34.sendKeys("-tY100300.");
//	S36.sendKeys("-Uq200300.");
//	S38.sendKeys("-PH500300.");
//	S40.sendKeys("-Uq300300.");
//	S42.sendKeys("-PH900300.");
//	
//	Thread.sleep(3000);
	
	//....................Convert Into Integers..................................................
		 s1 = Long.parseLong(S1.getAttribute("value"));
		 s2 = Long.parseLong(S2.getAttribute("value"));
		 SS2=(double)s2;
		 
		 s4 = Long.parseLong(S4.getAttribute("value"));
		 SS3=(double)s4;
		 
		 s6 = Long.parseLong(S6.getAttribute("value"));
		 s7 = Long.parseLong(S7.getAttribute("value"));
		 s8 = Long.parseLong(S8.getAttribute("value"));
		 s9 = Long.parseLong(S9.getAttribute("value"));
		 s10 = Long.parseLong(S10.getAttribute("value"));
		 s11 = Long.parseLong(S11.getAttribute("value"));
		 s12 = Long.parseLong(S12.getAttribute("value"));
		 s13 = Long.parseLong(S13.getAttribute("value"));
		 s14 = Long.parseLong(S14.getAttribute("value"));
		 s15 = Long.parseLong(S15.getAttribute("value"));
		 s16 = Long.parseLong(S16.getAttribute("value"));
		 s17 = Long.parseLong(S17.getAttribute("value"));
		 s18 = Long.parseLong(S18.getAttribute("value"));
		 s19 = Long.parseLong(S19.getAttribute("value"));
		 s20 = Long.parseLong(S20.getAttribute("value"));
		 s21 = Long.parseLong(S21.getAttribute("value"));
		 s22 = Long.parseLong(S22.getAttribute("value"));
		 s23 = Long.parseLong(S23.getAttribute("value"));
		 s24 = Long.parseLong(S24.getAttribute("value"));
		 s25 = Long.parseLong(S25.getAttribute("value"));
		 s26 = Long.parseLong(S26.getAttribute("value"));
		 s27 = Long.parseLong(S27.getAttribute("value"));
		 s28 = Long.parseLong(S28.getAttribute("value"));
		 s29 = Long.parseLong(S29.getAttribute("value"));
		 s30 = Long.parseLong(S30.getAttribute("value"));
		 s31 = Long.parseLong(S31.getAttribute("value"));
		 s32 = Long.parseLong(S32.getAttribute("value"));
		 s33= Long.parseLong(S33.getAttribute("value"));
		 s34 = Long.parseLong(S34.getAttribute("value"));
		 s35 = Long.parseLong(S35.getAttribute("value"));
		 s36 = Long.parseLong(S36.getAttribute("value"));
		 s37 = Long.parseLong(S37.getAttribute("value"));
		 s38 = Long.parseLong(S38.getAttribute("value"));
		 s39 = Long.parseLong(S39.getAttribute("value"));
		 s40 = Long.parseLong(S40.getAttribute("value"));
		 s41 = Long.parseLong(S41.getAttribute("value"));
		 s42 = Long.parseLong(S42.getAttribute("value"));
		 s43 = Long.parseLong(S43.getAttribute("value"));
		 s44 = Long.parseLong(S44.getAttribute("value"));
		 s45 = Long.parseLong(S45.getAttribute("value"));
		 s46 = Long.parseLong(S46.getAttribute("value"));
		 s47 = Long.parseLong(S47.getAttribute("value"));
		 
		 s48 = Long.parseLong(S48.getAttribute("value"));
		 s49 = Long.parseLong(S49.getAttribute("value"));
				 
       }
	
	 //............................................................................................................
		//////////////////////////////////////////////////////////////////////////////////////////////
//..................................Save Data.......................................................................
			       
//	 @Test (priority=2)
//	  public void Save_the_Data() throws InterruptedException {
//				 
//	   Thread.sleep(2000);	           
//		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click(); 
//	    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
//				       
//		 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		 WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
//		 String actualMessage = Validationmessage.getText();
//					   
//		// System.out.println("actualMessage  =" +  actualMessage);
//		 String expectedMessage = "Saved Successfully";
//		 Thread.sleep(3000);
//	     Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
//					 					 
//                 }
	 
//...........................................................................................
	 @Test(priority=3)
     public void  Free_Service_Load_Workshop____QTY () throws InterruptedException {  
     wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[1]")));
		     				  			    
     String NEW1= N1.getAttribute("value");	
	 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
	 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
	 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
		          }  
	//...........................................................................................
		 @Test(priority=4)
	     public void  Bodyshop_Load____QTY () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[2]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
//...........................................................................................
		 @Test(priority=5)
	     public void  Paid_AND_Running_Repairs_Load____QTY () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[4]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
	//...........................................................................................
		 @Test(priority=6)
	     public void  Labour_charges_Work_shop_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[6]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
	//...........................................................................................
		 @Test(priority=7)
	     public void  Labour_charges_Bodyshop_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[8]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=8)
	     public void Labour_charges_Warranty_claims_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[10]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
	//...........................................................................................
		 @Test(priority=9)
	     public void Free_service_Receipts_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[11]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=10)
	     public void Transit_Damage_Claim_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[12]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=11)
	     public void Scrap_Sales_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[13]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=12)
	     public void EW_Commisison_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[14]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=13)
	     public void Service_Incentive_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[15]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=14)
	     public void CRI_Incentive_payout_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[16]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=15)
	     public void PDI_Incentive_payout_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[17]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=16)
	     public void CCP_Renewal_Commission_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[18]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=17)
	     public void Any_other_Service_Income_In_INCOME () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[19]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//.................................EXPENSE.........................................................
		//...........................................................................................
		 @Test(priority=18)
	     public void Contractual_Labour_Workshop_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[24]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=19)
	     public void Contractual_Labour_Bodyshop_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[26]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=20)
	     public void Any_other_Job_done_by_external_agency_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[28]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=21)
	     public void Free_Service_Payout_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[30]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=22)
	     public void Advertisement_Marketing_Promotional_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[32]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=23)
	     public void Hyperlocal_Expense_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[34]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=24)
	     public void Discount_Bill_discount_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[36]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=25)
	     public void Discount_under_MSR_Autocard_My_Nexa_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[38]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=26)
	     public void Cost_of_Consumption_of_Paints_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[40]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=27)
	     public void Any_other_Expense_Service_Only_In_EXPENSE () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[42]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }		 
	//	 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//.....................Per Load (Rs.) In INCOME............................................
				 @Test(priority=28)
		           public void Labour_charges_Work_shop_per_Load_In_Income () throws InterruptedException {  		 
				   double  Expected =s6/SS3;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s7, "[ Labour charges - Work shop Per Load (Rs.)] in Service   = ");	
		    }	 
	//...........................................................................................
				 @Test(priority=29)
		         public void Labour_charges_Bodyshop_Accidental_per_Load_In_Income () throws InterruptedException {  		 
				   double  Expected =s8/SS2;
		         long roundedResult1 = Math.round(Expected);
		         Assert.assertEquals(roundedResult1, s9, "[ Labour charges - Bodyshop (Accidental Per Load (Rs.)] in Service   = ");	
		  }	 
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//..............................Per New Car Expense (Rs.).......................................................				 
				 @Test(priority=30)
		           public void Manpower_Cost_Salary_Incentive_per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s20/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s21, "[ Manpower Cost (Salary & Incentive) Per New Car Expense (Rs.) in Service   = ");	
		    }	 
	//...........................................................................................
				 @Test(priority=31)
		           public void Short_Term_Interest_Cost_Service__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s22/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s23, "[ Short Term Interest Cost ( Service)/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=32)
		           public void Contractual_Labour_Workshop__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s24/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s25, "[ Contractual Labour: Workshop/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=33)
		           public void Contractual_Labour_Bodyshop__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s26/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s27, "[ Contractual Labour: Bodyshop/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=34)
		           public void Any_other_Job_done_by_external_agency__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s28/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s29, "[ Any other Job done by external agency/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=35)
		           public void Free_Service_Payout__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s30/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s31, "[ Free Service Payout (If net negative)/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=36)
		           public void Advertisement_Marketing_Promotional__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s32/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s33, "[ Advertisement/Marketing/Promotional/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=37)
		           public void Hyperlocal_Expense__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s34/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s35, "[ Hyperlocal Expense (Retainer fee )/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=38)
		           public void Discount_Bill_discount__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s36/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s37, "[ Discount (Bill discount)/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=39)
		           public void Discount_under_MSR__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s38/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s39, "[ Discount under MSR/Autocard/My Nexa/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=40)
		           public void Cost_of_Consumption_of_Paints__per_New_cars_Expenses () throws InterruptedException {  		 
				   double  Expected =s40/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s41, "[ Cost of Consumption of Paints/ Per New Car Expense (Rs.)] in Service   = ");	
		    }
	//...........................................................................................
				 @Test(priority=41)
		           public void Any_other_Expense_Service_Only__per_New_cars_Expenses () throws InterruptedException {  		 
					 Thread.sleep(1000);
					 double  Expected =s42/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s43, "[ Any other Expense(Service Only)/ Per New Car Expense (Rs.)] in Service   = ");		           
		    }
				 
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//........................................Total......................................................................
				 @Test(priority=42)
		           public void Total_Service_Income_A__per_New_cars_Expenses () throws InterruptedException { 
					 Thread.sleep(1000);
					 long expected =s6+s8+s10+s11+s12+s13+s14+s15+s16+s17+s18+s19;
					 Assert.assertEquals(expected, s44, "Total Service Income [A] Is Invalid in SERVICE");
				 }
	//....................................................................................................
				 @Test(priority=43)
		           public void Total_Service_Income_A_per_New_Cars () throws InterruptedException {  		 
					 Thread.sleep(1000);
					 double  Expected =s44/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s45, "[ Total Service Income A /per New Cars in Service   = ");	
				 }         
		//...........................................................................................................	
				 @Test(priority=44)
		           public void Net_earning_from_Service_A_B () throws InterruptedException { 
					 Thread.sleep(1000);
					 long expected =s44-s48;
					 Assert.assertEquals(expected, s46, "[Net earning from Service = [A] - [B]] is invalid in SERVICE");
				 }
		//.......................................................................................................
				 @Test(priority=45)
		           public void Net_earning_from_Service_A_B_per_New_Cars () throws InterruptedException {  		 
					 Thread.sleep(1000);
					 double  Expected =s46/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s47, "Invalid  [ Net earning from Service = [A] - [B]] /per New Cars in Service    = ");	
				 }         
		//...........................................................................................................
				 
				 @Test(priority=46)
		           public void Total_Service_Direct_Expense_B () throws InterruptedException { 
					 Thread.sleep(1000);
					 long expected =s20+s22+s24+s26+s28+s30+s32+s34+s36+s38+s40+s42;
					 Assert.assertEquals(expected, s48, "[Total Service Direct Expense [B] ]Is Invalid in SERVICE");
				 }
				 
	//........................................................................................................
				 @Test(priority=47)
		           public void Total_Service_Direct_Expense_B_per_New_cars () throws InterruptedException {  		 
					 Thread.sleep(1000);
					 double  Expected =s48/N_cars1;
		           long roundedResult1 = Math.round(Expected);
		           Assert.assertEquals(roundedResult1, s49, "Invalid  [ Total Service Direct Expense [B] /per New Cars in Service    = ");	
				 }
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//.................................Data matches from different Modules .........................................................			 
		//.1 Manpower Cost (Salary & Incentive)
				 
				 @Test(priority=48)
		         public void click_on_ManPowerCost() throws InterruptedException {  
		     	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement manPowerCost= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"Manpower Cost\")])[1]")));
					   manPowerCost.click();
		  			 // Define the expected URL
		  	        String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/Man-Power-Cost";

		  	        // Wait until the URL is the expected URL
		  	        wait.until(ExpectedConditions.urlToBe(expectedURL));

		  	        // Get the current URL after the click
		  	        String currentURL = driver.getCurrentUrl();

		  	        // Print the current URL for debugging purposes
		  	        System.out.println("currentURL = " + currentURL);

		  	        // Compare the current URL with the expected URL
		  	        Assert.assertEquals(expectedURL, currentURL);
		//...........................................Find The Values to match...........................................................
		  	        
		     WebElement manpower1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[70]"));
													
			    MP = Long.parseLong(manpower1.getAttribute("value"));
				System.out.println("Maruti Driving School	OF Manpowercost VALUES  = "  + MP);				    
				 Thread.sleep(3000);
		       }	
	//.................................................................................................................
				 @Test(priority=49)
		         public void click_on_IntrestCost() throws InterruptedException {  
		     	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement manPowerCost= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"Interest Cost \")])[1]")));
					   manPowerCost.click();
		   			 // Define the expected URL
		   	        String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/Interest-Cost";

		   	        // Wait until the URL is the expected URL
		   	        wait.until(ExpectedConditions.urlToBe(expectedURL));

		   	        // Get the current URL after the click
		   	        String currentURL = driver.getCurrentUrl();

		   	        // Print the current URL for debugging purposes
		   	        System.out.println("currentURL = " + currentURL);

		   	        // Compare the current URL with the expected URL
		   	        Assert.assertEquals(expectedURL, currentURL);
		//...........................................Find The Values to match...........................................................
		   	        
		      WebElement IC1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
													
			    ic = Long.parseLong(IC1.getAttribute("value"));
			    System.out.println("Total Interest Paid on ST Loans of POC   = "  + ic);
			    
			  //  click on Service  option 
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//*[contains(text(),\"Service \")])[1]")).click();        
				Thread.sleep(4000);
				   }
	//..................Match The values from differnet Modules ...................................................................
				
				 @Test(priority=50)
		         public void Manpower_Cost_MAtches_from__total_manpowercost() throws InterruptedException {  
					
					 long actual=s20;
					 long expected=MP;
					 Assert.assertEquals(actual, expected, "values Not matches in Manpower Cost (Salary & Incentive)");
					  
				 }
//...........................................................................................................
				 
				 @Test(priority=51)
		         public void Short_Term_Interest_Cost_Service_MAtches_from__IntrestCost_Modules() throws InterruptedException {  
					
					 long actual=s22;
					 long expected=ic;
					 Assert.assertEquals(actual, expected, "values Not matches in Short Term Interest Cost ( Service)");
					  
				 }	 
///////////////////////////////////////////////////////////////////////////////////////////////////				 
				  
		         @AfterClass
		         public void tearDown () {	
		       		 driver.quit();
		         }
				 
		         }	
				 





























