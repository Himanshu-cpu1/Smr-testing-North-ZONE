package dBP_Login_ALL;

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

import Import_DATA_Of_DBP.Login_Page;

public class MDS  {
	public static WebDriver driver;
	public WebDriverWait wait; 
	   double MD1;
	   long MD2;
	   long MD3;
	   long MD4;
	   long MD5;
	   long MD6;
	   long MD7;
	   long MD9;
	   long MD10;
	   long MD12;
	   
	   long MD13;
	   long MD15;
	   long MD16;
	   long MD18;
	   long MD19;
	   long MD21;
	   long MD22;
	   long MD24;
	   long MD25;
	   long MD27;
	   
	   double N_cars1;
	   long MP;
	   long ic;
		
		@SuppressWarnings({"static-access" })
		
		   @BeforeClass
			public void mds() throws InterruptedException {
			Thread.sleep(3000);	
			
	//...................................................................................    	
			   this.driver=New_Car_TestNG.driver;   // call the login page 
//................................................................................................	    
	 // click o the MDS 
		 Thread.sleep(3000);
	    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[7]")).click();        
	    Thread.sleep(3000);
		}	 
		 
	  //..................................................................................
        @Test(priority=0)
        public void  Click_on_NewCars() throws InterruptedException {  
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

//......................................................................................................							
    @Test(priority=1)
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
	        
 WebElement IC1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[47]"));
										
 ic = Long.parseLong(IC1.getAttribute("value"));
 System.out.println("Total lntrest Paid on ST Loans VALUES  = "  + ic);
 
 Thread.sleep(3000);	
   
    }	
    //......................................................................................................							

    @Test(priority=2)
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
	        
 WebElement manpower1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
										
 MP = Long.parseLong(manpower1.getAttribute("value"));
	System.out.println("Maruti Driving School	OF Manpowercost VALUES  = "  + MP);	
	
	// click on the MDS again
	Thread.sleep(4000);	
    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[7]")).click();        
    Thread.sleep(3000);
		   			
   }
      
		    		       
	//.......................................................................................................
		
		        @Test(priority=3)   // clear the data
		          	public void SendTheValues() throws InterruptedException {
				    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
				    Thread.sleep(2000);
				    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
				    Thread.sleep(2000);
				    
				       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
					   String actualMessage = Validationmessage.getText();
					   
					   System.out.println("clear data Message  =" +actualMessage);
					   String expectedMessage = "Cleared Successfully";
					   Thread.sleep(3000);	
					   Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
					// Find the path of all the elements 
						Thread.sleep(2000);			
														
						WebElement mds1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
						WebElement mds2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
						WebElement mds3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));							
						WebElement mds4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));								
						WebElement mds5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));		
						WebElement mds6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));		
						WebElement mds7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
						
						WebElement mds9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));									
						WebElement mds10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
						
						WebElement mds12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
						WebElement mds13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
					
						WebElement mds15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));								
						WebElement mds16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));		
						
						WebElement mds18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));		
						WebElement mds19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
						
						WebElement mds21 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));									
						WebElement mds22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
						
						WebElement mds24 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
						WebElement mds25 = driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
						
						WebElement mds27 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));

											
						Thread.sleep(2000);
						
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
						// send the values 
						mds1.sendKeys("-.Hg4089088.");
						mds2.sendKeys("-P10566565.");
						mds4.sendKeys("-ZX206565.");
						mds6.sendKeys("-Kh10656565.");
						mds15.sendKeys("-Ahj10566565.");
						
		////////////////////////////////////////////////////////////////////////////////////////////////////////
						// Convert all the values longo longegers
						 MD1 = Long.parseLong(mds1.getAttribute("value"));
						 MD2 = Long.parseLong(mds2.getAttribute("value"));
						 MD3 = Long.parseLong(mds3.getAttribute("value"));// ALL data we have to fill 
						 MD4 = Long.parseLong(mds4.getAttribute("value"));
						 MD5 = Long.parseLong(mds5.getAttribute("value"));					
						 MD6 = Long.parseLong(mds6.getAttribute("value"));//
						 MD7 = Long.parseLong(mds7.getAttribute("value"));// Net Earning from MDS = [A] - [B]
						
						 MD9 = Long.parseLong(mds9.getAttribute("value"));// Net Earning from MDS Enrollment
						 MD10 = Long.parseLong(mds10.getAttribute("value"));
						
						 MD12 = Long.parseLong(mds12.getAttribute("value"));
						 MD13 = Long.parseLong(mds13.getAttribute("value"));
						
						 MD15 = Long.parseLong(mds15.getAttribute("value"));
						 MD16 = Long.parseLong(mds16.getAttribute("value"));
						
						 MD18 = Long.parseLong(mds18.getAttribute("value"));//
						 MD19 = Long.parseLong(mds19.getAttribute("value"));
						
						 MD21 = Long.parseLong(mds21.getAttribute("value"));
						 MD22 = Long.parseLong(mds22.getAttribute("value"));
						
						 MD24 = Long.parseLong(mds24.getAttribute("value"));
						 MD25 = Long.parseLong(mds25.getAttribute("value"));
						
						 MD27 = Long.parseLong(mds27.getAttribute("value"));
						 
		      }
			//////////////////////////////////////////////////////////////////////////////////////////////
	//..................................Save Data.......................................................................
						 // Save the Data
					     @Test (priority=4)
					     public void Save_the_Data() throws InterruptedException {
					      //  save data
					       Thread.sleep(2000);	           
					       driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click(); 
					       driver.findElement(By.cssSelector("[class=\"save\"]")).click();
					       
					       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
						   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
						   String actualMessage = Validationmessage.getText();
						   
						  // System.out.println("actualMessage  =" +actualMessage);
						   String expectedMessage = "Saved Successfully";
						   Thread.sleep(3000);	
						   Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
						   Thread.sleep(2000);					 
	                   }
		//.................................................................................................................
		//..................................................................................
				          @Test(priority=5)
				          public void  MDS_Enrollment_Income_QTY() throws InterruptedException {  
				        	   wait = new WebDriverWait(driver, Duration.ofSeconds(20));
							   WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));
				     				  			    
				      	       String MDS1= m1.getAttribute("value");	
							   Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
					           Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
					           Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabet ");
				          }
				        //..................................................................................
				          @Test(priority=6)
				          public void  MDS_Enrollment_Income_Amount	() throws InterruptedException {  
				        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
							   WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));
				     				  			    
				      	       String MDS1= m1.getAttribute("value");	
							   Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
					           Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
					           Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabet ");
				          }
				     //..................................................................................
				          @Test(priority=7)
				          public void  MDS_Incentives_Amount() throws InterruptedException {  
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
				          public void  Any_other_Expense_MDS_only	() throws InterruptedException {  
				        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
							   WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[15]")));
				     				  			    
				      	       String MDS1= m1.getAttribute("value");	
							   Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
					           Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
					           Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabet ");
				          
			
	//......................................................................................................							
				          }
				          @Test(priority=10)
				   	        public void Per_new_cars__Income_Of_MDS_Enrollment() throws InterruptedException {  
				   	         double  Expected =MD2/N_cars1;
				   	         long roundedResult1 = Math.round(Expected);
				   	         
				   	         Assert.assertEquals(roundedResult1, MD3, "Values are INVALID");			   	         
				   	        			   			
				   	      } 
	 //......................................................................................................							

	               @Test(priority=11)
	                public void Per_new_cars__Income_Of_MDS_Incentives() throws InterruptedException {  
	                double  Expected =MD4/N_cars1;
	                long roundedResult1 = Math.round(Expected);
	      
	                 Assert.assertEquals(roundedResult1, MD5, "Values are INVALID");			   	         
	     			   			
	              }
	       //......................................................................................................							

	               @Test(priority=12)
	                public void Per_new_cars__Income_Of_Any_other_Income() throws InterruptedException {  
	                double  Expected =MD6/N_cars1;
	                long roundedResult1 = Math.round(Expected);
	      
	                 Assert.assertEquals(roundedResult1, MD7, "Values are INVALID");			   	         
	     			   			
	              }
	       
	        //......................................................................................................							
	        //..................................................................................................................
	               @Test(priority=13)
	                public void Per_new_cars__Expense_Of_Manpower_Cost_and_salary_Incentives() throws InterruptedException {  
	                double  Expected =MP/N_cars1;
	                long roundedResult1 = Math.round(Expected);
	      
	                 Assert.assertEquals(roundedResult1, MD10, "Values are INVALID");			   	         
	     			   			
	   //..........................................................................................         
	               }		   			
	               @Test(priority=14)
	                public void Per_new_cars__Expense_Of_Short_term_Interest_Cost() throws InterruptedException {  
	                double  Expected =MD12/N_cars1;
	                long roundedResult1 = Math.round(Expected);
	      
	                 Assert.assertEquals(roundedResult1, MD13, "Values are INVALID");			   	         
	     			   			
	              }
	         //................................................................................................
			   			
	             @Test(priority=15)
	             public void Per_New_cars_Expense_Of_Any_other_Expense_MDS_only() throws InterruptedException {  
	             double  Expected =MD15/N_cars1;
	             long roundedResult1 = Math.round(Expected);

	             Assert.assertEquals(roundedResult1, MD16, "Values are INVALID");			   	         
		   			
	           }
	  /////////////////////////////////////////////....TOTAL...../////////////////////////////////////////////////////////////
	             @Test(priority=16)
	             public void Total_MDS_Income_A() throws InterruptedException {  
	             long expected=MD2+MD4+MD6;

	             Assert.assertEquals(expected, MD18, "Values are INVALID");			   	         
		   			
	           }   
		//....................................................................................................................			
	             @Test(priority=17)
	             public void Per_New_cars_Expense_Of_Total_MDS_Income_A() throws InterruptedException {  
	             double  Expected =MD18/N_cars1;
	             long roundedResult1 = Math.round(Expected);

	             Assert.assertEquals(roundedResult1, MD19, "Values are INVALID");			   	         
		   			
	           } 
	     //..........................................................................................................
	             @Test(priority=18)
	             public void Net_Earning_from_MDS_A_B () throws InterruptedException {  
	             long expected=MD18-MD24;

	             Assert.assertEquals(expected, MD21, "Values are INVALID");			   	         
		   			
	           }
	      //.......................................................................................................
	             @Test(priority=19)
	             public void Net_Earning_from_MDS_A_B_of_per_New_Car_Income() throws InterruptedException {  
	            	 double  Expected =MD21/N_cars1;
	                 long roundedResult1 = Math.round(Expected);

	                 Assert.assertEquals(roundedResult1, MD22, "Values are INVALID");	
	           } 
	       //.......................................................................................................
	             @Test(priority=20)
	             public void Total_MDS_Direct_Expense_B () throws InterruptedException {  
	             long expected=MD9+MD12+MD15;

	             Assert.assertEquals(expected, MD24, "Values are INVALID");			   	         
		   			
	           }
	       //.....................................................................................
	             @Test(priority=21)
	             public void Total_MDS_Direct_Expense_B_of_per_New_cars_Expenses() throws InterruptedException {  
	            	 double  Expected =MD24/N_cars1;
	                 long roundedResult1 = Math.round(Expected);

	                 Assert.assertEquals(roundedResult1, MD25, "Values are INVALID");	
	           } 
	           //.....................................................................................
	           //.....................................................................................
	             @Test(priority=22)
	             public void Net_Earning_from_MDS_Enrolments() throws InterruptedException {  
	            	 double  Expected =MD2/MD1;
	                 long roundedResult1 = Math.round(Expected);

	                 Assert.assertEquals(roundedResult1, MD27, "Values are INVALID");	   
	           } 
         //.......................................................................................................
	      //........................................................................................
	             @Test(priority=22)
	             public void  Manpower_Cost_Salary_and_Incentives_matches_from_ManpowerCOST_Modules () throws InterruptedException {  
	             
	           	  Assert.assertEquals(MD9, MP, "Values are INVALID");	
	           	  
	             }
	       //........................................................................................
	             @Test(priority=23)
	             public void  Short_term_Interest_Cost_MDS_Matches_from_Intrest_Cost_MODULES	 () throws InterruptedException {  
	             
	           	  Assert.assertEquals(MD12, ic, "Values are INVALID");	
	           	  
	             }
	      //...................................................................................       
	             
	             @AfterClass
	             public void tearDown () throws InterruptedException {	
	            	 Thread.sleep(3000);
	             }       
	             
	}

