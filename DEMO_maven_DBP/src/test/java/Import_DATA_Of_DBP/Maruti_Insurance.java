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

public class Maruti_Insurance extends Login_Page {
	public static WebDriver driver;
	public WebDriverWait wait;
	
	long Mi1;
	long Mi2;
	long Mi3;
	long Mi4;
	long Mi5;
	long Mi6;
	long Mi7;
	long Mi9;
	long Mi10;
	long Mi11;
	long Mi12;
	long Mi13;
	long Mi14;
	long Mi16;
	long Mi17;
	long Mi19;
	long Mi20;
	long Mi22;
	long Mi23;
	
	double N_cars1;
	long ic;
	double MPP;
	
	@SuppressWarnings({ "static-access" })
	@BeforeClass
	public void MI() throws InterruptedException {
		Thread.sleep(3000);	
		//...................................................................................    	
		   this.driver=Login_Page.driver;   // call the login page 
    //....................................Click on the Maruti_Insurance........................................................
	       
    
           Thread.sleep(4000);
	       driver.findElement(By.xpath("(//*[contains(text(),\"Maruti Insurance \")])[1]")).click();        
	       Thread.sleep(4000);	
	}
//.......................................................................................................
	   //......................click On the New cars.......................................................................
	      
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
	//...........................................Find The Values to match...........................................................
	    	        
	           WebElement NEW_cars_1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
												
		     N_cars1 = Double.parseDouble(NEW_cars_1.getAttribute("value"));
		     System.out.println("New Car Retail Sales In (NEW cars)  VALUE =  " + N_cars1 ); 
		     
		     Thread.sleep(3000);	
	        }
	       //...............................Click_on_Manpower_Cost...................................................
	         @Test(priority=1)
	         public void  Click_on_Manpower_Cost	() throws InterruptedException {  
	       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    		   WebElement ManPower1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"Manpower Cost \")])[1]")));
	    			ManPower1.click();
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
	    	        
	    	         WebElement MP1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[30]")); //  MIR -Manpower Cost Page
	    			 Thread.sleep(1000);
	    			 MPP = Long.parseLong(MP1.getAttribute("value"));   
	    			 System.out.println("Manpower cost of maruti insurance Renewal: "+ MPP);	    			
	    			 
	    			 Thread.sleep(3000);	
	         }
//.........................................................................................................
	       //......................................................................................................							
	         @Test(priority=2)
	         public void click_on_IntrestCost() throws InterruptedException {  
	     	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    		   WebElement intrestCost= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"Interest Cost \")])[1]")));
	    		    intrestCost.click();
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
	    	        
	                WebElement IC1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[46]"));
	    										
	                ic = Long.parseLong(IC1.getAttribute("value"));
	               System.out.println("Total lntrest Paid on ST Loans VALUES  = "  + ic); 
//.......................................................................................................	                
	                // clcik on the Maruti Insurance Again
	     	       Thread.sleep(4000);
	     	       driver.findElement(By.xpath("(//*[contains(text(),\"Maruti Insurance \")])[1]")).click();        
	     	       Thread.sleep(4000);
	         }
	      //..........................................................................................
	         
	         
        @Test(priority=3)   // clear the data
          	public void clearData() throws InterruptedException {
//		    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//		    Thread.sleep(2000);
//		    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//		    Thread.sleep(2000);
//		    
//		       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//			   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
//			   String actualMessage = Validationmessage.getText();
//			   
//			   System.out.println("clear data Message  =" +actualMessage);
//			   String expectedMessage = "Cleared Successfully";
//			   Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
			   
			// Find the path of all the elements 
				Thread.sleep(2000);		
				
				WebElement mi1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
				WebElement mi2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
				WebElement mi3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));							
				WebElement mi4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));								
				WebElement mi5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));		
				WebElement mi6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));		
				WebElement mi7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
				
				WebElement mi9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));									
				WebElement mi10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));				
				WebElement mi11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
				WebElement mi12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));			
				WebElement mi13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));								
				WebElement mi14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));		
				
				WebElement mi16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));		
				WebElement mi17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
				
				WebElement mi19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));									
				WebElement mi20 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
				
				WebElement mi22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
				WebElement mi23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
									
				Thread.sleep(2000);
				
////////////////////////////////////////////////////////////////////////////////////////////////////////////
				// send the values 
//				mi1.sendKeys("-.Hg4089088");
//				mi2.sendKeys("-P10566565.");
//				mi4.sendKeys("-ZX206565.");
//				mi6.sendKeys("-Kh10656565.");
//				mi13.sendKeys("-Ahj10566565.");
				
				Thread.sleep(3000);	
////////////////////////////////////////////////////////////////////////////////////////////////////////
				// Convert all the values longo longegers
				 Mi1 = Long.parseLong(mi1.getAttribute("value"));
				 Mi2 = Long.parseLong(mi2.getAttribute("value"));
				 Mi3 = Long.parseLong(mi3.getAttribute("value"));// ALL data we have to fill 
				 Mi4 = Long.parseLong(mi4.getAttribute("value"));
				 Mi5 = Long.parseLong(mi5.getAttribute("value"));					
				 Mi6 = Long.parseLong(mi6.getAttribute("value"));//
				 Mi7 = Long.parseLong(mi7.getAttribute("value"));// Net Earning from MDS = [A] - [B]
				
				 Mi9 = Long.parseLong(mi9.getAttribute("value"));// Net Earning from MDS Enrollment
				 Mi10 = Long.parseLong(mi10.getAttribute("value"));
				
				 Mi11 = Long.parseLong(mi11.getAttribute("value"));
				 Mi12 = Long.parseLong(mi12.getAttribute("value"));
				
				 Mi13 = Long.parseLong(mi13.getAttribute("value"));
				 Mi14 = Long.parseLong(mi14.getAttribute("value"));
				
				 Mi16 = Long.parseLong(mi16.getAttribute("value"));//
				 Mi17 = Long.parseLong(mi17.getAttribute("value"));
				
				 Mi19 = Long.parseLong(mi19.getAttribute("value"));
				 Mi20 = Long.parseLong(mi20.getAttribute("value"));
				 
				 Mi22 = Long.parseLong(mi22.getAttribute("value"));
				 Mi23 = Long.parseLong(mi23.getAttribute("value"));
				
				 Thread.sleep(3000);	
	}
  //...............................Save The  Data..........................................................
//        // Save the Data
//	     @Test (priority=4)
//	     public void Save_the_Data() throws InterruptedException {
//	      //  save data
//	       Thread.sleep(1000);	           
//	       driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click(); 
//	       driver.findElement(By.cssSelector("[class=\"save\"]")).click();
//	       
//	       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
//		   String actualMessage = Validationmessage.getText();
//		   
//		  // System.out.println("actualMessage  =" +actualMessage);
//		   String expectedMessage = "Saved Successfully";
//		   Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
//		 					 
//      }
        
	   //..................................................................................
         @Test(priority=5)
         public void  Insurance_Renewal_Income_QTY() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));
    				  			    
     	       String MDS1= m1.getAttribute("value");	
			   Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=6)
         public void  Insurance_Renewal_Income_Amount	() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));
    				  			    
     	       String MDS1= m1.getAttribute("value");	
			   Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabet ");
         }
    //..................................................................................
         @Test(priority=7)
         public void  Insurance_Renewal_Commission_Amount() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));
    				  			    
     	       String MDS1= m1.getAttribute("value");	
			   Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabet ");
         }
//...........................................................................................................
         @Test(priority=8)
         public void  Any_other_Income_amount	() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));
    				  			    
     	       String MDS1= m1.getAttribute("value");	
			   Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabet ");
         }
//..................................................................................
         @Test(priority=9)
         public void  Any_other_Expense_Amount	() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[13]")));
    				  			    
     	       String MDS1= m1.getAttribute("value");	
			   Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabet ");
         }   

    //............................................................................................
         
       //......................................................................................................							
       
          @Test(priority=10)
         public void Per_new_cars__Income_Of_MDS_Enrollment() throws InterruptedException {  
         double  Expected =Mi2/N_cars1;
          long roundedResult1 = Math.round(Expected);
      
          Assert.assertEquals(roundedResult1, Mi3, "Values are INVALID");			   	         
     			   			
       } 
//......................................................................................................							

     @Test(priority=11)
       public void Per_new_cars__Income_Of_MDS_Incentives() throws InterruptedException {  
       double  Expected =Mi4/N_cars1;
       //System.out.println("Expected =  "+Expected);
      long roundedResult1 = Math.round(Expected);

      Assert.assertEquals(roundedResult1, Mi5, "Values are INVALID");			   	         
			
    }
//......................................................................................................							

     @Test(priority=12)
       public void Per_new_cars__Income_Of_Any_other_Income() throws InterruptedException {  
     double  Expected =Mi6/N_cars1;
      long roundedResult1 = Math.round(Expected);

      Assert.assertEquals(roundedResult1, Mi7, "Values are INVALID");			   	         
			
     }
//......................................................................................................							
       
     @Test(priority=13)
     public void click_on_MI_again() throws InterruptedException {  
	       driver.findElement(By.xpath("(//*[contains(text(),\"Maruti Insurance \")])[1]")).click();           
     
     }
   //..........................................................................................
      @Test(priority=14)
       public void Per_New_Car_Expense_Of_ManpowerCost_Salary_and_Incentives() throws InterruptedException {  
    	  double  Expected =Mi9/N_cars1;
    	 // System.out.println("Expected =  "+Expected);
          long roundedResult1 = Math.round(Expected);
          Assert.assertEquals(roundedResult1, Mi10, "Values are INVALID");	
    } 
  //........................................................................................... 
      @Test(priority=15)
      public void Per_New_Car_Expense_Of_Short_term_Interest_Cost	() throws InterruptedException {  
   	     double  Expected =Mi11/N_cars1;
         long roundedResult1 = Math.round(Expected);
         Assert.assertEquals(roundedResult1, Mi12, "Values are INVALID");	
   } 
    //........................................................................................... 
      @Test(priority=16)
      public void Per_New_Car_Expense_Of_Any_other_Expense	() throws InterruptedException {  
   	     double  Expected =Mi13/N_cars1;
         long roundedResult1 = Math.round(Expected);
         Assert.assertEquals(roundedResult1, Mi14, "Values are INVALID");	
   }
 /////////////////////////////////////////////////////////////////////////////////////////////////////
  //...............................Totals..............................................................
      @Test(priority=17)
      public void Total_MI_Renewal_Income_A  () throws InterruptedException {  
      long expected=Mi4+Mi6;

      Assert.assertEquals(expected, Mi16, "Values are INVALID");			   	         			
    }
   //.............................................................................................
      @Test(priority=21)
      public void Total_MI_Renewal_Income_A_Per_New_Cars_Income  () throws InterruptedException {  
    	  double  Expected =Mi16/N_cars1;
          long roundedResult1 = Math.round(Expected);
          Assert.assertEquals(roundedResult1, Mi17, "Values are INVALID");			   	         			
    }
   //.............................................................................................
      @Test(priority=18)
      public void Net_Earning_MI_Renewal_A_B () throws InterruptedException {  
    	  long expected=Mi16-Mi22;

          Assert.assertEquals(expected, Mi19, "Values are INVALID");			   	         			
    }
   //........................................................................................
      @Test(priority=19)
      public void  Net_Earning_MI_Renewal_A_B_Per_New_Cars_Income  () throws InterruptedException {  
    	  double  Expected =Mi19/N_cars1;
          long roundedResult1 = Math.round(Expected);
          Assert.assertEquals(roundedResult1, Mi20, "Values are INVALID");	
     }
 //.............................................................................................
      @Test(priority=20)
      public void Total_MI_Direct_Expense_B () throws InterruptedException {  
    	  long expected=Mi9+Mi11+Mi13;
    	 // System.out.println("expected =  "+expected);
          Assert.assertEquals(expected, Mi22, "Values are INVALID");
       }
  //........................................................................................
      @Test(priority=21)
      public void  Total_MI_Direct_Expense_B_per_new_Cars_Expenses () throws InterruptedException {  
    	  double  Expected =Mi22/N_cars1;
          long roundedResult1 = Math.round(Expected);
          Assert.assertEquals(roundedResult1, Mi23, "Values are INVALID");	
     }
      //........................................................................................
      @Test(priority=22)
      public void  Manpower_Cost_Salary_and_Incentives_matches_from_ManpowerCOST_Modules () throws InterruptedException {  
      
    	  Assert.assertEquals(MPP, Mi9, "Values are INVALID");	
    	  
      }
    //........................................................................................
      @Test(priority=23)
      public void  Short_term_Interest_Cost_Matches_from_Intrest_Cost_MODULES	 () throws InterruptedException {  
      
    	  Assert.assertEquals(ic, Mi11, "Values are INVALID");	
    	  
      }  
      
      @AfterClass
      public void tearDown () {	
    		 driver.quit();
      }
  	      
}