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

public class MSGA {
	public static WebDriver driver;
	public WebDriverWait wait;
	
	long Msga1;
	long Msga2;
	long Msga3;
	long Msga4;
	long Msga5;
	long Msga6;
	long Msga7;
	long Msga8;
	long Msga9;
	long Msga10;
	long Msga11;
	long Msga12;
	long Msga13;
	long Msga14;
	long Msga15;
	long Msga16;
	
	long Msga17;
	long Msga18;
	long Msga19;
	long Msga20;
	long Msga21;
	long Msga22;
	long Msga23;
	long Msga24;
	long Msga25;
	long Msga26;
	long Msga27;
	long Msga28;
	long Msga29;
	long Msga30;
	long Msga31;
	long Msga32;
	
	double N_cars1;	
	long MPC;
	long Ic;
	
	@SuppressWarnings("static-access")
	@BeforeClass
	public void Msga() throws InterruptedException {
		Thread.sleep(3000);	
		//...................................................................................    	
		   this.driver=Maruti_Insurance.driver;   // call the login page 

    //....................................Click on the MSGA........................................................
	           
           Thread.sleep(2000);
	       driver.findElement(By.xpath("(//*[contains(text(),\"MSGA \")])[1]")).click();        
	       Thread.sleep(3000);		       
  //.......................................................................................................
     }
	    @Test(priority=0)   // clear the data
    	public void clearData() throws InterruptedException {
	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
	    Thread.sleep(2000);
	    
	       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
		   String actualMessage = Validationmessage.getText();
		   
		 //  System.out.println("clear data Message  =" +actualMessage);
		   String expectedMessage = "Cleared Successfully";
		   Thread.sleep(3000);	
		   Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");		   
	    
	//.......................................................................................................
	    //.........................Find The Path of MSGA all fields.....................................................................
	 // Find the path of all the elements 
		   Thread.sleep(3000);		
		
		WebElement MSGA1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		WebElement MSGA2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		WebElement MSGA3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));							
		WebElement MSGA4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));								
		WebElement MSGA5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));		
		WebElement MSGA6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));		
		WebElement MSGA7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		
		WebElement MSGA8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));									
		WebElement MSGA9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));				
		WebElement MSGA10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		WebElement MSGA11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));			
		WebElement MSGA12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));								
		WebElement MSGA13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));				
		WebElement MSGA14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));		
		WebElement MSGA15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));		
		WebElement MSGA16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));									
		WebElement MSGA17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));		
		WebElement MSGA18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
		WebElement MSGA19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		
		WebElement MSGA20 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));			
		WebElement MSGA21 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));								
		WebElement MSGA22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));				
		WebElement MSGA23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));		
		WebElement MSGA24 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));		
		WebElement MSGA25 = driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));									
		WebElement MSGA26 = driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));		
		WebElement MSGA27 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
		WebElement MSGA28 = driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
		
		WebElement MSGA29 = driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));									
		WebElement MSGA30 = driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));		
		WebElement MSGA31 = driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
		WebElement MSGA32 = driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
										
		Thread.sleep(2000);
//............................ send the values ...............................................
		MSGA1.sendKeys("-Aa>683298.");
		MSGA2.sendKeys("-Zz>4222.");
		MSGA3.sendKeys("-Et>96000.");
		MSGA6.sendKeys("-W>10000.");
		MSGA7.sendKeys("-tW>400000.");
		MSGA8.sendKeys("-DE>43222.");
		MSGA12.sendKeys("-#@>10000.");
		MSGA13.sendKeys("-5@>185000.");
		MSGA14.sendKeys("-YT>70000.");
		MSGA20.sendKeys("-SE>30000.");
		MSGA22.sendKeys("-ft>257009.");
		
		Thread.sleep(3000);	
//...........................Convert Into Long to match & Calculate the values .........................................
		
		 Msga1 = Long.parseLong(MSGA1.getAttribute("value"));
		 Msga2 = Long.parseLong(MSGA2.getAttribute("value"));
		 Msga3 = Long.parseLong(MSGA3.getAttribute("value"));
		 Msga4 = Long.parseLong(MSGA4.getAttribute("value"));
		 Msga5 = Long.parseLong(MSGA5.getAttribute("value"));
		 Msga6 = Long.parseLong(MSGA6.getAttribute("value"));
		 Msga7 = Long.parseLong(MSGA7.getAttribute("value"));
		 Msga8 = Long.parseLong(MSGA8.getAttribute("value"));
		 Msga9 = Long.parseLong(MSGA9.getAttribute("value"));
		 Msga10 = Long.parseLong(MSGA10.getAttribute("value"));
		 Msga11 = Long.parseLong(MSGA11.getAttribute("value"));
		 Msga12 = Long.parseLong(MSGA12.getAttribute("value"));
		 Msga13 = Long.parseLong(MSGA13.getAttribute("value"));
		 Msga14 = Long.parseLong(MSGA14.getAttribute("value"));
		 Msga15 = Long.parseLong(MSGA15.getAttribute("value"));
		 
		 Msga16 = Long.parseLong(MSGA16.getAttribute("value"));
		 Msga17 = Long.parseLong(MSGA17.getAttribute("value"));
		 Msga18 = Long.parseLong(MSGA18.getAttribute("value"));
		 Msga19 = Long.parseLong(MSGA19.getAttribute("value"));
		 Msga20 = Long.parseLong(MSGA20.getAttribute("value"));
		 Msga21 = Long.parseLong(MSGA21.getAttribute("value"));
		 Msga22 = Long.parseLong(MSGA22.getAttribute("value"));
		 Msga23 = Long.parseLong(MSGA23.getAttribute("value"));
		 Msga24 = Long.parseLong(MSGA24.getAttribute("value"));
		 Msga25 = Long.parseLong(MSGA25.getAttribute("value"));
		 Msga26 = Long.parseLong(MSGA26.getAttribute("value"));
		 Msga27 = Long.parseLong(MSGA27.getAttribute("value"));
		 Msga28 = Long.parseLong(MSGA28.getAttribute("value"));
		 Msga29= Long.parseLong(MSGA29.getAttribute("value"));
		 Msga30 = Long.parseLong(MSGA30.getAttribute("value"));
		 Msga31= Long.parseLong(MSGA31.getAttribute("value"));
		 Msga32 = Long.parseLong(MSGA32.getAttribute("value"));
	    }		 
//............................................................................................................
		//////////////////////////////////////////////////////////////////////////////////////////////
//..................................Save Data.......................................................................
					 // Save the Data
				     @Test (priority=1)
				     public void Save_the_Data() throws InterruptedException {
				      //  save data
				       Thread.sleep(1000);	           
				       driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click(); 
				       driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				       
				       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
					   String actualMessage = Validationmessage.getText();
					   
					  // System.out.println("actualMessage  =" +actualMessage);
					   String expectedMessage = "Saved Successfully";
					   Thread.sleep(3000);	
					   Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
					 					 
                   }
//........................................................................................................
//..................................................................................
		 @Test(priority=2)
	     public void  MSGA_Sales_New_Car_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }  
//..................................................................................
		 @Test(priority=3)
	     public void  MSGA_Sales_True_Value_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }  
//..................................................................................
		 @Test(priority=4)
	     public void  MSGA_Sales_Workshop_And_Bodyshop_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          } 

//..................................................................................
		 @Test(priority=5)
	     public void MSGA_Opening_Stock_A_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          } 
//..................................................................................
		 @Test(priority=6)
	     public void MSGA_Purchase_B_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[7]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }
//..................................................................................
		 @Test(priority=7)
	     public void Closing_Stock_C_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }
//..................................................................................
		 @Test(priority=8)
	     public void TCU_Commission_Suzuki_Connect_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[12]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }
	//..................................................................................
		 @Test(priority=9)
	     public void Incentive_earned_on_Accessories_sales_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[13]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }
//..................................................................................
		 @Test(priority=10)
	     public void Any_other_MSGA_Income_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[14]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }
	//..................................................................................
		 @Test(priority=11)
	     public void Discount_Bill_discount_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[20]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }
	//..................................................................................
		 @Test(priority=12)
	     public void Any_other_Expense_MSGA_only_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement m1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[22]")));
			     				  			    
	     String msga= m1.getAttribute("value");	
		 Assert.assertTrue(msga.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(msga) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(msga.matches("[0-9]+") && Long.parseLong(msga)>=0, "Input accepts alphabet ");
			          }
	//.........................................................................................
		 @Test(priority=13)
	     public void Total_MSGA_Sales_Amount() throws InterruptedException {
		 
		 long Expected=Msga1+Msga2+Msga3;
		 Assert.assertEquals(Expected, Msga4, "Values are INVALID");	
          }
     //.......................................................................................
		 @Test(priority=14)
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

	      // click on the MSGA
	      Thread.sleep(4000);
	       driver.findElement(By.xpath("(//*[contains(text(),\"MSGA \")])[1]")).click();        
	       Thread.sleep(3000);	
}
//..........................................................................................
		 @Test(priority=15)
         public void  Total_MSGA_Sales_Per_new_Cars	() throws InterruptedException {  		 
		 double  Expected =Msga4/N_cars1;
         long roundedResult1 = Math.round(Expected);

         Assert.assertEquals(roundedResult1, Msga5, "Values are INVALID");	
      }
//.........................................................................................	 
		 
		 @Test(priority=16)
         public void  Cost_of_Goods_Sold__A_B_C() throws InterruptedException {  		 
		
         long expectedresult=Msga6+Msga7-Msga8;
         Assert.assertEquals(expectedresult, Msga9, "Values are INVALID  in  >[ Cost of Goods Sold (A+B-C) ] In MSGA >>>>>>>>>");	
      }
//........................................................................................................
		 @Test(priority=17)
         public void  Cost_of_Goods_Sold__A_B_C_per_new_cars_expense () throws InterruptedException {  		 
		
			 double  Expected =Msga9/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga10, "Values are INVALID  in  >[ Cost of Goods Sold (A+B-C) ] / Per New Car Expense  In MSGA >>>>>>>>>");	
      }
//........................................................................................................
		 @Test(priority=18)
         public void  MSGA_Margin_Sales_Cost_of_Goods_Sold_Amount () throws InterruptedException {  		 
		
			 long expectedresult=Msga4-Msga9;
             Assert.assertEquals(expectedresult, Msga11, "Values are INVALID  in  >[ MSGA Margin (Sales - Cost of Goods Sold)]  Amount (Rs.)  In MSGA >>>>>>>>>");	
      }	 
//........................................................................................................
		 @Test(priority=19)
         public void  MSGA_Margin_Sales_Cost_of_Goods_Sold_Per_new_cars_Income () throws InterruptedException {  		 
		
			 double  Expected =Msga11/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga15, "Values are INVALID  in  >[ MSGA Margin (Sales - Cost of Goods Sold)] Per New Car Income (Rs.)  In MSGA >>>>>>>>>");	
      }
//.....................................................................................................
		 @Test(priority=20)
         public void  TCU_Commission_per_new_car_Income () throws InterruptedException {  		 
		
			 double  Expected =Msga12/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga16, "Values are INVALID  in ..[ TCU Commission Amount (Rs.) ] In MSGA >>>>>>>>>");	
      }	 
//.....................................................................................................
		 @Test(priority=21)
         public void  Incentives_earned_on_Accessories_sales_per_new_car_Income () throws InterruptedException {  		 
		
			 double  Expected =Msga13/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga17, "Values are INVALID  in ..[ Incentives_earned_on_Accessories_sales_Per_new_car_Income ]  Rs.   In MSGA >>>>>>>>>");	
      }	 
//.....................................................................................................
		 @Test(priority=22)
         public void  Any_other_MSGA_Income_per_new_car_Income () throws InterruptedException {  		 
		
			 double  Expected =Msga14/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga18, "Values are INVALID  in ..[ Any other MSGA Income / per new car  Income ]  Rs.   In MSGA >>>>>>>>>");	
             Thread.sleep(3000);	
		 }	 
//.......................................................................................................
		 @Test(priority=23)
         public void  Click_on_ManPower_Cost () throws InterruptedException { 
			 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement manPowerCost= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"Manpower Cost \")])[1]")));
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
   	        
          WebElement MC1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
											
	      MPC = Long.parseLong(MC1.getAttribute("value"));
	       System.out.println("Total lntrest Paid on ST Loans VALUES  = "  + MPC);
			 
	   // click on the MSGA
	      Thread.sleep(4000);	
	       driver.findElement(By.xpath("(//*[contains(text(),\"MSGA \")])[1]")).click();        
	       Thread.sleep(3000);	
		 }
	//.................................................................................................
		 @Test(priority=24)
         public void  Total_manpower_cost_MSGA___Matches_the_values___Manpower_Cost_Salary_AND_Incentive_In_MSGA () throws InterruptedException {
		long actual= Msga19;	 
		long Expected= MPC; 
        Assert.assertEquals(actual, Expected, "Values are INVALID  in ..[ Total_manpower_cost_MSGA___Matches_the_values___Manpower_Cost_Salary_AND_Incentive_In_MSGA ]   In MSGA >>>>>>>>>");	
	 
      }
//...................................................................................................
		 @Test(priority=25)
         public void  Manpower_Cost_Salary_AND_Incentive_Per_NEW_car_Expenses () throws InterruptedException {  		 
		
			 double  Expected =Msga19/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga23, "Values are INVALID  in ..[ Manpower_Cost_Salary_AND_Incentive_Per_NEW_car_Expenses]     In MSGA >>>>>>>>>");	
      }	
//.....................................................................................................
		 @Test(priority=25)
         public void  Discount_Bill_discount_Per_NEW_car_Expenses () throws InterruptedException {  		 
		
			 double  Expected =Msga20/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga24, "Values are INVALID  in ..[ Discount (Bill discount)] Per New Car Expenses (Rs.)    In MSGA >>>>>>>>>");	
             Thread.sleep(3000);	
		 }		 
//....................................Click on Intrest cost..............................................................	 
		 @Test(priority=26)
         public void click_on_IntrestCost() throws InterruptedException {  
     	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement IntrestCost= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"Interest Cost \")])[1]")));
			   IntrestCost.click();
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
   	        
      WebElement IC1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
											
	    Ic = Long.parseLong(IC1.getAttribute("value"));
	    System.out.println("Total Interest Paid on ST Loans  MSGA  = "  + Ic);
	    
	 // click on the MSGA
	    Thread.sleep(4000);	
	       driver.findElement(By.xpath("(//*[contains(text(),\"MSGA \")])[1]")).click();        
	       Thread.sleep(3000);
}		 
//..........................................................................................................
		 @Test(priority=27)
         public void  Total_Interest_Paid_on_ST_Loans_MSGA___Matches_the_values___Short_Term_Interest_Cost_MSGA() throws InterruptedException {
		long actual= Msga21;	 
		long Expected= Ic; 
        Assert.assertEquals(actual, Expected, "Values are INVALID  in ..[ Total Interest Paid on ST Loans MSGA Matches the values Short Term Interest Cost MSGA  ]   In MSGA >>>>>>>>>");	
	  
       }		 
//............................................................................................................
		 @Test(priority=28)
         public void  Short_Term_Interest_Cost_MSGA_Per_new_Car_EXPENSES () throws InterruptedException {  		 
		
			 double  Expected =Msga21/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga25, "Values are INVALID  in ..[ Short Term Interest Cost (MSGA) Per new Car EXPENSES ]  (Rs.)    In MSGA >>>>>>>>>");	
      }		  
 //............................................................................................................
		 @Test(priority=29)
         public void  Any_Other_Expense_MSGA_only__Per_new_Car_EXPENSES () throws InterruptedException {  		 
		
			 double  Expected =Msga22/N_cars1;
	         long roundedResult1 = Math.round(Expected);
             Assert.assertEquals(roundedResult1, Msga26, "Values are INVALID  in ..[  Any Other Expense(MSGA)only Per new Car EXPENSES]  (Rs.)    In MSGA >>>>>>>>>");	
      }	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //..............................Totals...........................................
		    @Test(priority=30)
            public void  Total_MSGA_Income_A () throws InterruptedException {  		 
		    long expectedRESULT=Msga11+Msga12+Msga13+Msga14 ;
             Assert.assertEquals(expectedRESULT, Msga27, "Values are INVALID  in ..[  Total_MSGA_Income_A ] amount (Rs.)    In MSGA >>>>>>>>>");	
      }	
 //........................................................................................
		   @Test(priority=31)
           public void  Total_MSGA_Income_A_Per_New_Car_Income () throws InterruptedException {  		 
	
	        double  Expected =Msga27/N_cars1;
            long roundedResult1 = Math.round(Expected);
            Assert.assertEquals(roundedResult1, Msga29, "Values are INVALID  in ..[ Total_MSGA_Income_A_Per_New_Car_Income ]  (Rs.)    In MSGA >>>>>>>>>");	
          }	 
//.....................................................................................................
		   @Test(priority=32)
           public void  Net_earning_from_MSGA () throws InterruptedException {  		 
		    long expectedRESULT=Msga27-Msga31 ;
            Assert.assertEquals(expectedRESULT, Msga28, "Values are INVALID  in ..[  Net earning from MSGA = [A] - [B] ]  (Rs.)    In MSGA >>>>>>>>>");	
          }	 
//.....................................................................................................
		      @Test(priority=33)
                public void  Net_earning_from_MSGA_Per_new_CARS_Income () throws InterruptedException {  		 
			   double  Expected =Msga28/N_cars1;
	            long roundedResult1 = Math.round(Expected);
	            Assert.assertEquals(roundedResult1, Msga30, "Values are INVALID  in ..[ Net earning from MSGA = [A] - [B] ]/per New Car Income (Rs.)    In MSGA >>>>>>>>>");	
	          }	 
		 //.....................................................................................................
		      @Test(priority=34)
                public void  Total_MSGA_Income_B_Per_New_Car_Expense () throws InterruptedException {  		 
			    double  Expected =Msga31/N_cars1;
	            long roundedResult1 = Math.round(Expected);
	            Assert.assertEquals(roundedResult1, Msga32, "Values are INVALID  in ..[ Total MSGA Income B ]/per New Car Income (Rs.)    In MSGA >>>>>>>>>");	
	          }	   
		   
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//////////////////////////////////////////////////////////////////////////////////////////////////////////
		    
		      @AfterClass
		      public void tearDown () throws InterruptedException {	
		    	  Thread.sleep(3000);
		      }
}		 
		 
		 
		 
		 
		 
		 