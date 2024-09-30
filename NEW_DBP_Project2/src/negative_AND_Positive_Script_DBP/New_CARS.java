package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class New_CARS {
	
	static void newCars(WebDriver driver) throws InterruptedException {
		

		// Then click on the new cars option on the left ....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[7]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/New-car";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		// then we will fill the details in the income in new cars
		WebElement C1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
		WebElement C2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
		WebElement C3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
		WebElement C4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
		
		WebElement C5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
		WebElement C6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
		WebElement C7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
		WebElement C8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
		
		WebElement C9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
		WebElement C10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
		WebElement C11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
		WebElement C12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
		
		WebElement C13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
		WebElement C14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
		WebElement C15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
		WebElement C16 = driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
		
		WebElement C17 = driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
		WebElement C18 = driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
		WebElement C19 = driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
		WebElement C20 = driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
		
		WebElement C21 = driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
		WebElement C22 = driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
		WebElement C23 = driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
		// Then we will se that all the deatils are filled correctly in Total New Car Income [A]
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// then we will fill the details in new cars Expense
		
		Thread.sleep(3000);
		WebElement C24 = driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
		WebElement C25 = driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
		WebElement C26 = driver.findElement(By.xpath("(//*[@type=\"text\"])[59]"));
		WebElement C27 = driver.findElement(By.xpath("(//*[@type=\"text\"])[61]"));
		
		WebElement C28 = driver.findElement(By.xpath("(//*[@type=\"text\"])[63]"));
		WebElement C29 = driver.findElement(By.xpath("(//*[@type=\"text\"])[65]"));
		WebElement C30 = driver.findElement(By.xpath("(//*[@type=\"text\"])[67]"));
		WebElement C31 = driver.findElement(By.xpath("(//*[@type=\"text\"])[69]"));
		
		// /  /// /	//	/////\\\\\\\\\\\\\\\\\\\\\\\\\\\\/\////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////\\\\\\\\\\\\\\\\\\\\\\\
		
		// Then we will fill all the data 
		
		 String[] Data = {"0998988"};
			
		 
		  // Through each web element
	        for (WebElement element : new WebElement[] {C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22,C23,C24,C25,C26,C27,C28,C29,C30,C31}) 
	        	
	         
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
	        
		

