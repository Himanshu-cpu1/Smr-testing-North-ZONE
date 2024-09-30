package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SPARES {
	static void spares(WebDriver driver ) throws InterruptedException {
		
		// Then click on the SPARES on the left side....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[12]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/spare";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			

		// Spares - Sales
		WebElement S1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
		WebElement S2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
		WebElement S3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
		WebElement S4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
		
		//Spares - COGS
		WebElement S5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
		WebElement S6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
		WebElement S7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
		WebElement S8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
		WebElement S9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
		WebElement S10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
		WebElement S11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
		WebElement S12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
		WebElement S13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
		WebElement S14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
		WebElement S15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
		WebElement S16 = driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
		
		//Income
		WebElement S17 = driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
		WebElement S18 = driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
		WebElement S19 = driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
		WebElement S20 = driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));

		// Expense
		WebElement S21 = driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
		WebElement S22 = driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
		WebElement S23 = driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
		WebElement S24 = driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
		
		// /  /// /	//	/////\\\\\\\\\\\\\\\\\\\\\\\\\\\\/\////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////\\\\\\\\\\\\\\\\\\\\\\\
		
		// Then we will fill all the data 
		
		 String[] Data = {"jghhkk","ygjhfdkh","iokllklk","0998988"};
			
		  
		  // Through each web element
	        for (WebElement element : new WebElement[] {S1,S2,S3,S4,S5,S6,S7,S8,S9,S10,S11,S12,S13,S14,S15,S16,S17,S18,S19,S20,S21,S22,S23,S24}) 
	        	
	         
	        	 // Send  data
	            for (String data : Data) {
	                sendData1(element, data);
	                Thread.sleep(1000);
	                
	                
	            }
	    		    //Save data
	    		    Thread.sleep(1000);
	    		    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	    		    Thread.sleep(2000);
	    		    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
	    		}
	           	   

		public static void sendData1(WebElement element, String data) throws InterruptedException {
	        // Clear existing data
	        element.clear();
	        // Send new data
	        element.sendKeys(data);
	        
	        
	        // Then we call the conditions
	        
	        Methods_of_conditions.sendData1(element, data);
	        
	        
		}}			        
	        
		

