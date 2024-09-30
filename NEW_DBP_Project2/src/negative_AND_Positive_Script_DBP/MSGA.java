package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MSGA {
	static void msga(WebDriver driver ) throws InterruptedException {
		
		// Then click on the MSGA option on the left ....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[10]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/MSGA";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
		
		// then we will fill the details of Income in Maruti Insurance
		
		// 1.MSGA-Sales
		WebElement MSGA_1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		WebElement MSGA_2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		WebElement MSGA_3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		
		// 2.MSGA-COGS
		WebElement MSGA_4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		WebElement MSGA_5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		WebElement MSGA_6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		
		// 3.Income
		WebElement MSGA_7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
		WebElement MSGA_8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		WebElement MSGA_9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
		
		//4.Expense
		WebElement MSGA_10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
		WebElement MSGA_11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));

		Thread.sleep(3000);
// /  /// /	//	/////\\\\\\\\\\\\\\\\\\\\\\\\\\\\/\////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////\\\\\\\\\\\\\\\\\\\\\\\
		
		// Then we will fill all the data 
		
		 String[] Data = {"jghhkk","ygjhfdkh","iokllklk","0998988"};
			
		  
		  // Through each web element
	        for (WebElement element : new WebElement[] {MSGA_1,MSGA_2,MSGA_3,MSGA_4,MSGA_5,MSGA_6,MSGA_7,MSGA_8,MSGA_9,MSGA_10,MSGA_11}) 
	          
	        	
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