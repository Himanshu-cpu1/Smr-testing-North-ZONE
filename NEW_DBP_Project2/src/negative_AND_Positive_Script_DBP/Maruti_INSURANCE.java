package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Maruti_INSURANCE {
	static void MARUTI_INSURANCE(WebDriver driver) throws InterruptedException {
		
		
		// Then click on the maruti Renewal option on the left ....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[9]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/Maruti-Insurance-Renewal";


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
		WebElement MI_1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		WebElement MI_2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		WebElement MI_3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		WebElement MI_4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		// then we will fill the expenses in particualr required field..
		
		WebElement MI_5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		Thread.sleep(3000);
		
///////////\\\\\\\///////////////////////////////////////\\\\\///////////////////////////////////////////////////////////////////		
		 
		// Then fill the all data 
		
		Thread.sleep(3000);
		
		 String[] Data = {"0998988"};
		 Thread.sleep(3000);
		 
		
		  
		  // Through each web element
	        for (WebElement element : new WebElement[] {MI_1,MI_2,MI_3,MI_4,MI_5}) 
	        	
	          
	        	 // Send  data
	            for (String data : Data) {
	                
	                sendData1( element, data);
	            }
	    		    //Save data
	    		    Thread.sleep(1000);
	    		    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	    		    Thread.sleep(2000);
	    		    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
	    		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		private static void sendData1(WebElement element, String data) throws InterruptedException {
				
			   // Clear existing data
	        element.clear();
	        // Send new data
	        element.sendKeys(data);
	        
		
		
		}}