package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DISCOUNTS {
	static void discount(WebDriver driver) throws InterruptedException {
		
		
Thread.sleep(2000);

// 1. Then click on the Discount option On the left side of the Dashboard.

driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[3]")).click();

Thread.sleep(2000);

////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/discount";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("    Valid URL  =   "        + actual_class );

	}
	else {
	System.out.println(" InValid  URL   =    "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			



	

		// 2.Then click on the (Consumer Offer (SPOT+ RIPS) AMOUNT.......
		WebElement D1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		
		
		// 3.Then click on the (ISL/RMK ) AMOUNT...........
        WebElement D2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		
		
		// 4. Then click on the (Exchange Bonus)  AMOUNT......................
		WebElement D3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		
		
		// 5. Then click  on the (Any Regional Office Scheme)  AMOUNT.................
		WebElement D4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		
		
		//>>>>>>.....Dealer Compulsion Amount will comes from the stock DISCOUT Amount........<<<<<<<<
		
		// 6.Then click on the (Any Other) AMOUNT.......................
		WebElement D5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		
		
		
		Thread.sleep(3000);
		
		 String[] Data = {"jghhkk","ygjhfdkh","iokllklk","0998988"};
		
		  
		  // Through each web element
	        for (WebElement element : new WebElement[] {D1,D2,D3,D4,D5}) {
	          
	        	
	        	 // Send  data
	            for (String data : Data) {
	                sendData1(element, data);
	                Thread.sleep(1000);
	                
	                
	            }}}

	           	   

		public static void sendData1(WebElement element, String data) throws InterruptedException {
	        // Clear existing data
	        element.clear();
	        // Send new data
	        element.sendKeys(data);
	        
	        
	        // Then we call the conditions
	        
	        Methods_of_conditions.sendData1(element, data);
	        
	        
	        
	        
		

}}