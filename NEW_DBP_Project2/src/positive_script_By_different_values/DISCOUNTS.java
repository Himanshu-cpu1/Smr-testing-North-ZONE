package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DISCOUNTS {
	static void discount(WebDriver driver) throws InterruptedException {
		
		
Thread.sleep(2000);

// 1. Then click on the Discount option On the left side of the Dashboard.

Thread.sleep(3000);

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



		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[3]")).click();
		
		Thread.sleep(2000);

		                // clear the data 
				        
				        Thread.sleep(3000);        
				        driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();        
				        Thread.sleep(2000);        
				        driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();        
				        Thread.sleep(2000);
		
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
		
		
		
		//Then send the data 
		
		 Discount(D1, "sdf");
		 Discount(D2, "21257");
		 Discount(D3, "0");
		 Discount(D4, "0");
		 Discount(D5, "0");
		 
		 Thread.sleep(5000);
		 
			// then we will save the all data 
			driver.findElement(By.xpath("(//*[@type=\"button\"])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[class=\"save\"]")).click();
			
			System.out.println("all the data has been saved in Discount");
			Thread.sleep(3000);
		 
		
		// We have created the method....
	}

	private static void Discount(WebElement element, String value) {
		

		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


		   // 1.We put the condition that only numeric value is acceptable from (0-9+)....
		
		if(value.matches("[0-9]+"))
		   {
	         element.sendKeys(value); // Send the numeric value
	         System.out.println("value is numeric = pass   = "  +value);
	       
	        }
		else
	        {
	           System.out.println("Input value is not numeric =   fail = " +value);
	           //Thread.sleep(1000);	
	        }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//2. If the valye length is not more than 12 characters	
		
		if((value.length()>=12))
			
	   {	
	
			System.out.println("value length is more than 12 character  =  fail = " +value);
}
		else           
{
			System.out.println("value is not more than 12 character =  pass ="   +value);
			//Thread.sleep(1000);
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
//wait for some time to catch the exceptions

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<

//3. Verify if the element is not null
  
  if (element != null) {
      // Perform action (e.g., sending keys) on the element
      
      System.out.println("Element  is not NULL : =   pass    ");
  } else {
      System.out.println("Element is null. Cannot perform action: =   pass     ");
      // Handle the situation where the element is null
}
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
  
  //  4.... If the element is Disable
  
  if (!element.isEnabled()) {
  	System.out.println("element is disable : = fail    ");
  
  
	}else{
		
		System.out.println("element is enable  = pass  ");
	}
//..........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

  // 5. If any data will be send in through the sendkeys it will check that expected result = actual result 
  
  
  String enteredText = element.getAttribute("value");
  if (enteredText.matches(value)) {
 	 
      System.out.println("value will be matches .=   pass =" + value);
      System.out.println("Expected value = Actual value" + value);
  } else {
      System.out.println("Value will not matches = fail  =");
      // Handle the situation where keys were not sent or entered correctly
  }
  
		
}}