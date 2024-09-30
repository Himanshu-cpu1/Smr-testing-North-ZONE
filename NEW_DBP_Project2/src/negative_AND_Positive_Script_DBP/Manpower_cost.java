package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Manpower_cost {
		static void manpowercost(WebDriver driver) throws InterruptedException {
		
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[6]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/Man-Power-Cost";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
		
		// 1.New cars
		WebElement M1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
		WebElement M2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
		WebElement M3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
		WebElement M4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
		// 2.Maruti Driving School
		WebElement M5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
		WebElement M6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
		WebElement M7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
		WebElement M8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
		// 3.Maruti Insurance Renewal
		WebElement M9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
		WebElement M10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
		WebElement M11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
		WebElement M12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
		// 4.MSGA
		WebElement M13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
		WebElement M14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
		WebElement M15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
		WebElement M16 = driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
		// 5.True Value	---NOT in sheet
		WebElement M17 = driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
		WebElement M18 = driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
		WebElement M19 = driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
		WebElement M20 = driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
		// 6.Spares
		WebElement M21 = driver.findElement(By.xpath("(//*[@type=\"text\"])[54]"));
		WebElement M22 = driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
		WebElement M23 = driver.findElement(By.xpath("(//*[@type=\"text\"])[56]"));
		WebElement M24 = driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
		// 7.Corporate Office /Common Manpower	----not in thesheet
		WebElement M25 = driver.findElement(By.xpath("(//*[@type=\"text\"])[64]"));
		WebElement M26 = driver.findElement(By.xpath("(//*[@type=\"text\"])[65]"));
		WebElement M27 = driver.findElement(By.xpath("(//*[@type=\"text\"])[66]"));
		WebElement M28 = driver.findElement(By.xpath("(//*[@type=\"text\"])[67]"));
		// 8.services----not in the sheet
		WebElement M29 = driver.findElement(By.xpath("(//*[@type=\"text\"])[74]"));
		WebElement M30 = driver.findElement(By.xpath("(//*[@type=\"text\"])[75]"));
		WebElement M31 = driver.findElement(By.xpath("(//*[@type=\"text\"])[76]"));
		WebElement M32 = driver.findElement(By.xpath("(//*[@type=\"text\"])[77]"));
		
		
		
///////////\\\\\\\///////////////////////////////////////\\\\\///////////////////////////////////////////////////////////////////		
		 
		// Then fill the all data 
		Thread.sleep(3000);
		
		 String[] Data = {"0998988"};
		 Thread.sleep(3000);
		 
		
		  
		  // Through each web element
	        for (WebElement element : new WebElement[] {M1,M2,M3,M4,M5,M6,M7,M8,M9,M10,M11,M12,M13,M14,M15,M16,M17,M18,M19,M20,M21,M22,M23,M24,M25,M26,M27,M28,M29,M30,M31,M32}) 
	          
	        	
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


		private static void sendData1(WebElement element, String data) throws InterruptedException {
				
			   // Clear existing data
	        element.clear();
	        // Send new data
	        element.sendKeys(data);
	        
		
		
		}}