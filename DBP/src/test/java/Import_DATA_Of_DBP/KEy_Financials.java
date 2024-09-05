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

public class KEy_Financials extends LOGIN {

	public static WebDriver driver;
	public WebDriverWait wait;
	//...................................................................
	long s1;
	long s2;
	long s3;
	long s4;
	long s5;
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
	
	long ICost1;
	long ICost2;
	
	//.......................................................................................................

		@SuppressWarnings({ "static-access" })
		@BeforeClass
		public void Services() throws InterruptedException {
			
			 this.driver=LOGIN.driver;
		
	//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//...................................................................................................................................................	
		//click on KeyFinancials   
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),\"Key Financials \")])[1]")).click();        
		Thread.sleep(3000);
		
		
		}
		 @Test(priority=0)
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
   	        
   	     WebElement lnterestCOST1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[73]"));// Totals of Long Term Loan          
         WebElement lnterestCOST2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));// Total Short Term Loans
         
       // convert longo longegers
         
            ICost1 = Long.parseLong(lnterestCOST1.getAttribute("value"));
           System.out.println("Totals of Long Term Loan  from lnterest Cost  =  "    + ICost1);
       
            ICost2 = Long.parseLong(lnterestCOST2.getAttribute("value"));
           System.out.println("Totals of short Term Loan  from lnterest cost =  "    + ICost2);
											
	    
	   
	  //  click on Service  Again 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),\"Key Financials \")])[1]")).click();        
		Thread.sleep(2000);
		   }
		   
//		//....................................................................................................................
//		@Test(priority=2)     // clear the data
//		public void Clear_Data() throws InterruptedException {
//		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//		Thread.sleep(2000);
//		    
//		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
//		String actualMessage = Validationmessage.getText();
//			   
//		System.out.println("Clear data Message  =" +actualMessage);
//		String expectedMessage = "Cleared Successfully";
//		Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
//	//................................................................................................
//}
		@Test(priority=3)     
		public void sendTheVAlues() throws InterruptedException {	
			//................................................................................................
			///........................Find The Path Of all Input Fields........................................................................
		    WebElement K1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
			WebElement K2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
			WebElement K3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
			WebElement K4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
			WebElement K5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
			WebElement K6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));		
			WebElement K7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));	
			WebElement K8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));									
			WebElement K9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));				
			WebElement K10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
			WebElement K11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));			
			WebElement K12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));								
			WebElement K13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));				
			WebElement K14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));		
			WebElement K15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
			
//		//..........send the values.......................................	
//			K1.sendKeys("-PH700300.");
//			K2.sendKeys("-kH500200.");
//			
//			K5.sendKeys("-PH600300.");
//			
//			K6.sendKeys("-tY200300.");
//			K7.sendKeys("-tY200300.");
//			K8.sendKeys("-Uq200300.");
//			K9.sendKeys("-Uq600300.");
//			K10.sendKeys("-PH900300.");
//			K11.sendKeys("-tY100300.");
//			K12.sendKeys("-Uq100300.");
//			K13.sendKeys("-PH700300.");
//			K14.sendKeys("-tY100300.");
//			K15.sendKeys("-Uq200300.");	
			
			//..........Convert Into Integers...........................................................
			 s1 = Long.parseLong(K1.getAttribute("value"));
			 s2 = Long.parseLong(K2.getAttribute("value"));
			 s3= Long.parseLong(K3.getAttribute("value"));
			 s4 = Long.parseLong(K4.getAttribute("value"));
			 s5 = Long.parseLong(K5.getAttribute("value"));
			 s6 = Long.parseLong(K6.getAttribute("value"));
			 s7 = Long.parseLong(K7.getAttribute("value"));
			 s8 = Long.parseLong(K8.getAttribute("value"));
			 s9 = Long.parseLong(K9.getAttribute("value"));
			 s10 = Long.parseLong(K10.getAttribute("value"));
			 s11 = Long.parseLong(K11.getAttribute("value"));
			 s12 = Long.parseLong(K12.getAttribute("value"));
			 s13 = Long.parseLong(K13.getAttribute("value"));
			 s14 = Long.parseLong(K14.getAttribute("value"));
			 s15 = Long.parseLong(K15.getAttribute("value"));
			 			
		    }
//...>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//..................................Save Data.......................................................................
//	       
//		 @Test (priority=4)
//		  public void Save_the_Data() throws InterruptedException {
//					 
//				  Thread.sleep(1000);	           
//			driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click(); 
//		    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
//					       
//			 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//			 WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
//			 String actualMessage = Validationmessage.getText();
//						   
//			// System.out.println("actualMessage  =" +  actualMessage);
//			 String expectedMessage = "Saved Successfully";
//		     Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
//						 					 
//	                 }
//...................................................................................
//...........................................................................................
		 @Test(priority=5)
	     public void  Share_Capital () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[1]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=6)
	     public void  Reserves_Surplus() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[2]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
	//...........................................................................................
		 @Test(priority=7)
	     public void  Long_term_Debt() throws InterruptedException {  
	     long actual=ICost1;
	     long expected =s3;
			 
			Assert.assertEquals(actual, expected, "Values does not matches of Long term Debt"); 
			          }
  //...........................................................................................
		 @Test(priority=8)
	     public void  Short_term_Debt() throws InterruptedException {  
	     long actual=ICost2;
	     long expected =s4;
			 
		Assert.assertEquals(actual, expected, "Values does not matches of Short term Debt"); 
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Current_Asset () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[5]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Current_Liabilities () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[6]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Total_Asset () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[7]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Total_Liabilities () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[8]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Creditors () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[9]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Debtors () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[10]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Cash_in_Hand () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[11]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Loans_Advances () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[12]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Investment () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[13]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Closing_Stock () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[14]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		//...........................................................................................
		 @Test(priority=9)
	     public void  Deferred_Tax_Liability () throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[15]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "( INPUT FIELD ) accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "( INPUT FIELD ) accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "( INPUT FIELD ) accepts alphabet ");
			          }
		 
		 @AfterClass
         public void tearDown () {	
       		 driver.quit();
         }
}









