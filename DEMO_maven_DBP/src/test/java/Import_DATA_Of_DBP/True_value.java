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

public class True_value extends Login_Page {

	public static WebDriver driver;
	public WebDriverWait wait;
	
	long nc1;
	long nc2;
	long nc3;
	long nc4;
	long nc5;
	long nc6;
	long nc7;
	long nc8;
	long nc9;
	long nc10;
	long nc11;
	long nc12;
	
	long nc13;
	long nc14;
	long nc15;
	long nc16;
	long nc17;
	long nc18;
	long nc19;
	long nc20;
	long nc21;
	long nc22;
	long nc23;
	long nc24;
	
	long nc25;
	long nc26;
	long nc27;
	long nc28;
	long nc29;
	long nc30;
	long nc31;
	long nc32;
	long nc33;
	long nc34;
	long nc35;
	long nc36;
	
	long nc37;
	long nc38;
	long nc39;
	long nc40;
	long nc41;
	long nc42;
	long nc43;
	long nc44;
	long nc45;
	long nc46;
	
	double N_cars1;
	double Tvalue;
	long MP;
	long ic;
	
	@SuppressWarnings("static-access")
	@BeforeClass
	public void newcars() throws InterruptedException {
		 Thread.sleep(2000);
	//...................................................................................    	
		   this.driver=Login_Page.driver;   // call the login page 
    //....................................Click on the True value........................................................
	           
           Thread.sleep(2000);
	       driver.findElement(By.xpath("(//*[contains(text(),\"True Value \")])[1]")).click();        
	       Thread.sleep(2000);		       
  //.......................................................................................................
     }
	    @Test(priority=0)   // clear the data
    	public void clearData() throws InterruptedException {
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	    Thread.sleep(2000);
//	    
//	       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
//		   String actualMessage = Validationmessage.getText();
//		   
//		   System.out.println("clear data Message  =" +actualMessage);
//		   String expectedMessage = "Cleared Successfully";
//		   Thread.sleep(2000);
//		   Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");		   
////.....................................................................................................		   	    
///........................Find The Path Of all Input Fields........................................................................
		    WebElement NC1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
			WebElement NC2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
			WebElement NC3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));							
			WebElement NC4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));								
			WebElement NC5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));		
			WebElement NC6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));		
			WebElement NC7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
			
			WebElement NC8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));									
			WebElement NC9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));				
			WebElement NC10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
			WebElement NC11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));			
			WebElement NC12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));								
			WebElement NC13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));				
			WebElement NC14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));		
			WebElement NC15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));		
			WebElement NC16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));									
			WebElement NC17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));		
			WebElement NC18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
			WebElement NC19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
			
			WebElement NC20 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));			
			WebElement NC21 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));								
			WebElement NC22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));				
			WebElement NC23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));		
			WebElement NC24 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));		
			WebElement NC25 = driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));									
			WebElement NC26 = driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));		
			WebElement NC27 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
			WebElement NC28 = driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
			
			WebElement NC29 = driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));									
			WebElement NC30 = driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));		
			WebElement NC31 = driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
			WebElement NC32 = driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
			WebElement NC33 = driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));									
			WebElement NC34 = driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));		
			WebElement NC35 = driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
			WebElement NC36 = driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
			WebElement NC37 = driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));									
			WebElement NC38 = driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));		
			WebElement NC39 = driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
			WebElement NC40 = driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
			WebElement NC41 = driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));									
			WebElement NC42 = driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));		
			WebElement NC43 = driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
			WebElement NC44 = driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
			WebElement NC45 = driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
			WebElement NC46 = driver.findElement(By.xpath("(//*[@type=\"number\"])[46]"));
			
//.................Send The values.............................................................................		
//			
//			 NC2.sendKeys("-TG6778870.");
//			 
//			 NC4.sendKeys("-TG909970.");
//			 NC5.sendKeys("-Tg200070.");
//			 NC6.sendKeys("-TG84548870.");
//			 NC7.sendKeys("-TG6700870.");
//			 NC8.sendKeys("-TG7788070.");
//			 NC9.sendKeys("-TG70000.");
//			 
//			 NC13.sendKeys("-TG2778870.");
//			 NC15.sendKeys("-TG909970.");
//			 NC17.sendKeys("-Tg200070.");
//			 NC19.sendKeys("-TG548870.");
//			 NC21.sendKeys("-TG700870.");
//			 
//			 NC27.sendKeys("-TG988070.");
//			 NC29.sendKeys("-TG90000.");
//			 NC31.sendKeys("-TG7788070.");
//			 NC33.sendKeys("-TG70000.");
//			 NC35.sendKeys("-ws3232.");
//			 NC37.sendKeys("-ff20000.");
//			 NC39.sendKeys("-TG70000.");
		   		
	//....................Convert Into Integers..................................................
			 nc1 = Long.parseLong(NC1.getAttribute("value"));
			 nc2 = Long.parseLong(NC2.getAttribute("value"));
			 nc3 = Long.parseLong(NC3.getAttribute("value"));
			 nc4 = Long.parseLong(NC4.getAttribute("value"));
			 nc5 = Long.parseLong(NC5.getAttribute("value"));
			 nc6 = Long.parseLong(NC6.getAttribute("value"));
			 nc7 = Long.parseLong(NC7.getAttribute("value"));
			 nc8 = Long.parseLong(NC8.getAttribute("value"));
			 nc9 = Long.parseLong(NC9.getAttribute("value"));
			 nc10 = Long.parseLong(NC10.getAttribute("value"));
			 nc11 = Long.parseLong(NC11.getAttribute("value"));
			 nc12 = Long.parseLong(NC12.getAttribute("value"));
			 nc13 = Long.parseLong(NC13.getAttribute("value"));
			 nc14 = Long.parseLong(NC14.getAttribute("value"));
			 nc15 = Long.parseLong(NC15.getAttribute("value"));
			 
			 nc16 = Long.parseLong(NC16.getAttribute("value"));
			 nc17 = Long.parseLong(NC17.getAttribute("value"));
			 nc18 = Long.parseLong(NC18.getAttribute("value"));
			 nc19 = Long.parseLong(NC19.getAttribute("value"));
			 nc20 = Long.parseLong(NC20.getAttribute("value"));
			 nc21 = Long.parseLong(NC21.getAttribute("value"));
			 nc22 = Long.parseLong(NC22.getAttribute("value"));
			 nc23 = Long.parseLong(NC23.getAttribute("value"));
			 nc24 = Long.parseLong(NC24.getAttribute("value"));
			 nc25 = Long.parseLong(NC25.getAttribute("value"));
			 nc26 = Long.parseLong(NC26.getAttribute("value"));
			 nc27 = Long.parseLong(NC27.getAttribute("value"));
			 nc28 = Long.parseLong(NC28.getAttribute("value"));
			 nc29= Long.parseLong(NC29.getAttribute("value"));
			 nc30 = Long.parseLong(NC30.getAttribute("value"));
			 nc31= Long.parseLong(NC31.getAttribute("value"));
			 nc32 = Long.parseLong(NC32.getAttribute("value"));
			 
			 nc33 = Long.parseLong(NC33.getAttribute("value"));
			 nc34 = Long.parseLong(NC34.getAttribute("value"));
			 nc35 = Long.parseLong(NC35.getAttribute("value"));
			 nc36 = Long.parseLong(NC36.getAttribute("value"));
			 nc37 = Long.parseLong(NC37.getAttribute("value"));
			 nc38 = Long.parseLong(NC38.getAttribute("value"));
			 nc39 = Long.parseLong(NC39.getAttribute("value"));
			 nc40 = Long.parseLong(NC40.getAttribute("value"));
			 nc41 = Long.parseLong(NC41.getAttribute("value"));
			 nc42 = Long.parseLong(NC42.getAttribute("value"));
			 nc43 = Long.parseLong(NC43.getAttribute("value"));
			 nc44 = Long.parseLong(NC44.getAttribute("value"));
			 nc45 = Long.parseLong(NC45.getAttribute("value"));
			 nc46= Long.parseLong(NC46.getAttribute("value"));
			 
			 Tvalue = Double.parseDouble(NC1.getAttribute("value"));
			 						 
         }
	  //............................................................................................................
	  		//////////////////////////////////////////////////////////////////////////////////////////////
	  //..................................Save Data.......................................................................
	  			       
//	  	 @Test (priority=1)
//	  	  public void Save_the_Data() throws InterruptedException {
//	  				 
//	  			  Thread.sleep(3000);	           
//	  		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click(); 
//	  	    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
//	  				       
//	  		 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	  		 WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
//	  		 String actualMessage = Validationmessage.getText();
//	  					   
//	  		// System.out.println("actualMessage  =" +  actualMessage);
//	  		 String expectedMessage = "Saved Successfully";
//	  		 Thread.sleep(3000);
//	  	     Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
//	  					 					 
//	                     }
	  //........................................................................................................
	  //.................................................................................. 
	  	 @Test(priority=2)
	     public void  POC_Sales_Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }  
	
	  	//.................................................................................. 
	  	 @Test(priority=4)
	     public void  POC_Sales_COGS____Opening_Stocks____A____QTY() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          } 
	  //............................................................................................
	  	 @Test(priority=5)
	     public void  POC_Sales_COGS____Opening_Stocks____A____Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          } 
	  //............................................................................................
	  	 @Test(priority=6)
	     public void  POC_Sales_COGS____Purchase____B____QTY() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          } 
	 //............................................................................................
	  	 @Test(priority=7)
	     public void  POC_Sales_COGS____Purchase____B____amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[7]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=8)
	     public void  POC_Sales_COGS____Closing_Stock____C____Qty() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  //............................................................................................
	  	 @Test(priority=9)
	     public void  POC_Sales_COGS____Closing_Stock____C____Amount() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[9]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=10)
	     public void  POC_Sales_Incentive_amount_In_Income() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[13]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=11)
	     public void  Finance_Commission_Amount_In_Income() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[15]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=12)
	     public void  Insurance_Commission_Amount_In_Income() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[17]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	 //............................................................................................
	  	 @Test(priority=13)
	     public void  Net_Earnings_from_registration_Amount_In_Income() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[19]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=14)
	     public void  Any_other_POC_Sales_Income_Amount_In_Income() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[21]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=15)
	     public void  Refurbishment_Cost_Amount_In_Expense() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[27]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  //............................................................................................
	  	 @Test(priority=16)
	     public void  Free_Service_Cost_Amount_In_Expense() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[29]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=17)
	     public void  Advertisement_Marketing_Promotional_Amount_In_Expense() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[31]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	 	//............................................................................................
	  	 @Test(priority=18)
	     public void  Hyperlocal_Expense_Amount_In_Expense() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[33]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=19)
	     public void  Management_Fees_to_MSIL_Amount_In_Expense() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[35]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=20)
	     public void  Warranty_Cost_Amount_In_Expense() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[37]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	  	//............................................................................................
	  	 @Test(priority=21)
	     public void  Any_Other_Expense_Amount_In_Expense() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[39]")));
			     				  			    
	     String NEW1= N1.getAttribute("value");	
		 Assert.assertTrue(NEW1.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(NEW1) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(NEW1.matches("[0-9]+") && Long.parseLong(NEW1)>=0, "Input accepts alphabet ");
			          }
	 /////////////////////////////////////////////////////////////////////////////////////////////////////
	  	        // Calculation based Formula and conditions
	//.................................................................................................
	//................POC Sales..........................................................................................  	
	  	   
	  	 @Test(priority=22)
	        public void  POC_Sales_Quantity() throws InterruptedException { 
	  		long expectedRESULT=(nc4+nc6)-nc8 ;
            Assert.assertEquals(expectedRESULT, nc1,"[ POC Sales] Quantity (A+B-C)  in NEW Cars = ");	
          }	 
	//......................................................................................  	 
	  	  @Test(priority=23)
           public void Per_POC_Sales_Rs () throws InterruptedException {  		 
		   double  Expected =nc2/Tvalue;
           long roundedResult1 = Math.round(Expected);
          Assert.assertEquals(roundedResult1, nc3, "[ Per_POC_Sales_Rs. ] in NEW Cars   = ");	
        }
	  	  
	 //................................................................................................... 	  
	//...............POC Sales - COGS....................................................................................
	
	  	 @Test(priority=24)
	        public void  Cost_Of_Goods_Sold() throws InterruptedException { 
	  		long expectedRESULT=(nc5+nc7)-nc9 ;
         Assert.assertEquals(expectedRESULT, nc10,"[ Cost Of Goods Sold (A+B-C) ] in NEW Cars = ");	
       }
//..............................................................................................
//..........................Income......................................................................
	  
	  	 @Test(priority=25)
	        public void  POC_Sales_Margin_Amount_In_Income() throws InterruptedException { 
	  		long expectedRESULT=nc2-nc10 ;
            Assert.assertEquals(expectedRESULT, nc11,"[ POC Sales Margin (Sales-Cost of Goods sold) Amount ] in NEW Cars = ");	
    } 
  //..............................................................................................
  //..................Click on the new Cars............................................................................
	  	@Test(priority=26)
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
	     System.out.println("New Car Retail Sales In (NEW cars)  VALUE =  " + N_cars1 );
	      
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//*[contains(text(),\"True Value \")])[1]")).click();        
	       Thread.sleep(2000);
	  	}
	//........................................................................................
	  	 @Test(priority=27)
           public void POC_Sales_Margin_per_New_Car_Income () throws InterruptedException {  		 
		   double  Expected =nc11/N_cars1;
           long roundedResult1 = Math.round(Expected);
           Assert.assertEquals(roundedResult1, nc12, "[ POC Sales Margin (Sales-Cost of Goods sold) Per New Car Income (Rs.)] in NEW Cars   = ");	
      }	 
	//.................................................................................................
		 @Test(priority=28)
         public void POC_Sales_Incentive_per_New_Car_Income () throws InterruptedException {  		 
		   double  Expected =nc13/N_cars1;
         long roundedResult1 = Math.round(Expected);
         Assert.assertEquals(roundedResult1, nc14, "[ POC Sales Incentive (TVAC/other incentive) Per New Car Income (Rs.)] in NEW Cars   = ");	
    }	
  //.................................................................................................
		 @Test(priority=29)
         public void Finance_Commission_per_New_Car_Income () throws InterruptedException {  		 
		   double  Expected =nc15/N_cars1;
         long roundedResult1 = Math.round(Expected);
         Assert.assertEquals(roundedResult1, nc16, "[Finance Commission (POC sales) Per New Car Income (Rs.)] in NEW Cars   = ");	
    }	 
//.................................................................................................
		 @Test(priority=30)
         public void Insurance_Commission_per_New_Car_Income () throws InterruptedException {  		 
		   double  Expected =nc17/N_cars1;
         long roundedResult1 = Math.round(Expected);
         Assert.assertEquals(roundedResult1, nc18, "[Insurance Commission (POC sales) Per New Car Income (Rs.)] in NEW Cars   = ");	
    }
//............................................................................................
		 @Test(priority=31)
           public void Net_Earnings_from_registration_per_New_Car_Income () throws InterruptedException {  		 
		   double  Expected =nc19/N_cars1;
           long roundedResult1 = Math.round(Expected);
           Assert.assertEquals(roundedResult1, nc20, "[Net Earnings from registration/Transfer of RC Per New Car Income (Rs.)] in NEW Cars   = ");	
    }	 
//...............................................................................................
		 @Test(priority=32)
           public void Any_other_POC_Sales_Income_per_New_Car_Income () throws InterruptedException {  		 
		   double  Expected =nc21/N_cars1;
           long roundedResult1 = Math.round(Expected);
           Assert.assertEquals(roundedResult1, nc22, "[Any other POC Sales Income Per New Car Income (Rs.)] in NEW Cars   = ");	
    }
//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		 
//..................Expense..................................................................................
	
		 @Test(priority=33)
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
  	        
     WebElement manpower1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
											
	    MP = Long.parseLong(manpower1.getAttribute("value"));
		System.out.println("Maruti Driving School	OF Manpowercost VALUES  = "  + MP);	
//....................................................................................................	    
	 // again click on the True value   
	       Thread.sleep(4000);
	       driver.findElement(By.xpath("(//*[contains(text(),\"True Value \")])[1]")).click();        
	       Thread.sleep(4000);   			
       }
//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 @Test(priority=34)
         public void Manpower_Cost_salary_and_Incentives_AMOUNT() throws InterruptedException {  
		
			 long actual =nc23;
			 long expected=MP;
			 Assert.assertEquals(actual, expected, "Values INVALID in Manpower Cost(Salary & Incentive) matches from manpowercost salry and Incentives in TRUE VALUE");			 			 
		 }	 
//.....................................................................................................
		 @Test(priority=35)
         public void Manpower_Cost_salary_and_Incentives_per_new_cars_Expenses() throws InterruptedException {  
			 double  Expected =nc23/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc24, "INVALID VALUES [Manpower_Cost_salary_and_Incentives_per_new_cars_Expenses] in TRUE VALUE  = ");	
	    }
//..........................................................................................................
		 //......................................................................................................							
         @Test(priority=36)
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
   	        
      WebElement IC1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
											
	    ic = Long.parseLong(IC1.getAttribute("value"));
	    System.out.println("Total Interest Paid on ST Loans of POC   = "  + ic);
	    
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("(//*[contains(text(),\"True Value \")])[1]")).click();        
	        Thread.sleep(4000);
	    
         }	
 //........................................................................................................
         @Test(priority=37)
         public void Short_Term_Interest_Cost_AMOUNT() throws InterruptedException {  
		
			 long actual =nc25;
			 long expected=ic;
			 Assert.assertEquals(actual, expected, "Values INVALID in [ Short Term Interest Cost AMOUNT matches form intrest cost] in TRUE VALUE");			 			 
		 }	
//........................................................................................................
         @Test(priority=38)
         public void Short_Term_Interest_Cost__Per_new_CARS_expenses() throws InterruptedException {  
			 double  Expected =nc25/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc26, "INVALID VALUES [Short Term Interest Cost AMOUNT Per new CARS expenses] in TRUE VALUE  = ");	
	    }
   //........................................................................................................
         @Test(priority=39)
         public void Refurbishment_Cost_Per_new_CARS_expenses() throws InterruptedException {  
			 double  Expected =nc27/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc28, "INVALID VALUES [Refurbishment Cost Per new CARS expenses] in TRUE VALUE  = ");	
	    }        
      //........................................................................................................
         @Test(priority=40)
         public void Free_Service_Cost_Per_new_CARS_expenses() throws InterruptedException {  
			 double  Expected =nc29/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc30, "INVALID VALUES [Free Service Cost Per new CARS expenses] in TRUE VALUE  = ");	
	    }      
       //........................................................................................................
         @Test(priority=41)
         public void Advertisement_Marketing_Promotional_Per_new_CARS_expenses() throws InterruptedException {  
			 double  Expected =nc31/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc32, "INVALID VALUES [Advertisement Marketing Promotional Per new CARS expenses] in TRUE VALUE  = ");	
	    } 
      //........................................................................................................
         @Test(priority=42)
         public void Hyperlocal_Expense_Per_new_CARS_expenses() throws InterruptedException {  
			 double  Expected =nc33/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc34, "INVALID VALUES [Hyperlocal Expense Per new CARS expenses] in TRUE VALUE  = ");	
	    } 
      //........................................................................................................
         @Test(priority=43)
         public void Management_Fees_to_MSIL_Per_new_CARS_expenses() throws InterruptedException {  
			 double  Expected =nc35/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc36, "INVALID VALUES [Management Fees to MSIL Per new CARS expenses] in TRUE VALUE  = ");	
	    }
       //........................................................................................................
         @Test(priority=44)
         public void Warranty_Cost_Per_new_CARS_expenses() throws InterruptedException {  
			 double  Expected =nc37/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc38, "INVALID VALUES [Warranty Cost Per new CARS expenses] in TRUE VALUE  = ");	
	    }
       //........................................................................................................
         @Test(priority=45)
               public void Any_other_Expense_POC_Sales_only_Per_new_CARS_expenses() throws InterruptedException {  
			   double  Expected =nc39/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc40, "INVALID VALUES [Any other Expense POC Sales only Per new CARS expenses] in TRUE VALUE  = ");	
	    } 
         
   //................................................................................................
   //...........................Totals......................................................
         @Test(priority=46)
	        public void  Total_POC_Sales_Income_A() throws InterruptedException { 
	  		long expectedRESULT=nc11+nc13+nc15+nc17+nc19+nc21;
            Assert.assertEquals(expectedRESULT, nc41,"[ Total POC Sales Income [A] ] in TRUE VAlUE = ");	
 } 
     //........................................................................................................
         @Test(priority=47)
               public void Total_POC_Sales_Income_A_per_new_CARS() throws InterruptedException {  
			   double  Expected =nc41/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc42, "INVALID VALUES [Total POC Sales Income [A] Per new CARS expenses] in TRUE VALUE  = ");	
	    }    
 //...................................................................................................
         @Test(priority=47)
	        public void  Net_earning_from_POC_Sales_In_Totals() throws InterruptedException { 
	  		long expectedRESULT=nc41-nc45;
             Assert.assertEquals(expectedRESULT, nc43,"[ Net earning from POC Sales = [A] - [B] ] in TRUE VAlUE = ");	
        } 
       //........................................................................................................
         @Test(priority=48)
               public void Net_earning_from_POC_Sales_In__per_new_CARS() throws InterruptedException {  
			   double  Expected =nc43/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc44, "INVALID VALUES [Net earning from POC Sales = [A] - [B]/ Per new CARS expenses] in TRUE VALUE  = ");	
	    }
   //........................................................................................................
         @Test(priority=47)
	        public void  Total_POC_Sales_Direct_Expense_B() throws InterruptedException { 
	  		long expectedRESULT=nc23+nc25+nc27+nc29+nc31+nc33+nc35+nc37+nc39;
            Assert.assertEquals(expectedRESULT, nc45,"[Total POC Sales Direct Expense [B] ] in TRUE VAlUE = ");	
     } 
       //........................................................................................................
         @Test(priority=48)
	        public void  Total_POC_Sales_Direct_Expense_B_per_new_cars() throws InterruptedException { 
        	   double  Expected =nc45/N_cars1;
	           long roundedResult1 = Math.round(Expected);
	           Assert.assertEquals(roundedResult1, nc46, "INVALID VALUES [Total POC Sales Direct Expense B per new_cars/ Per new CARS expenses] in TRUE VALUE  = ");	
	    }
        	 
      //...............................................................................................
       		                        
         @AfterClass
         public void tearDown () {	
       		 driver.quit();
         }
	    
         
         
}	  	 
	  	 
	  		  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
