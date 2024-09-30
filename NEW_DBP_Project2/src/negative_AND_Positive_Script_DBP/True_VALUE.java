package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class True_VALUE {
	
	static void truevalue(WebDriver driver) throws InterruptedException {
		

		// Then click on the True Value option on the left side....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[11]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/poc";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			

		// POC Sales
		WebElement T1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		
		// POC Sales - COGS
		WebElement T2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		WebElement T3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		WebElement T4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		WebElement T5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		WebElement T6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		WebElement T7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
		
		// Income
		WebElement T8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		WebElement T9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
		WebElement T10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
		WebElement T11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		WebElement T12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
		
		// Expense
		WebElement T13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
		WebElement T14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
		WebElement T15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
		WebElement T16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
		WebElement T17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
		WebElement T18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
		WebElement T19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
		
		// /  /// /	//	/////\\\\\\\\\\\\\\\\\\\\\\\\\\\\/\////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////\\\\\\\\\\\\\\\\\\\\\\\
		
		// Then we will fill all the data 
		
		 String[] Data = {"jghhkk","ygjhfdkh","iokllklk","0998988"};
			
		  
		  // Through each web element
	        for (WebElement element : new WebElement[] {T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19}) 
	        	
	         
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
	        
		

