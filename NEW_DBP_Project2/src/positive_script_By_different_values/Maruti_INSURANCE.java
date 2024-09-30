package positive_script_By_different_values;

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
		
		//\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		// Then we will fill the dataas we want
		
		Maruti_Insurance(MI_1,"32324");
		Maruti_Insurance(MI_2,"4435");
		Maruti_Insurance(MI_3,"9324");
		Maruti_Insurance(MI_4,"9289");
		Maruti_Insurance(MI_5,"33324");
		
		Thread.sleep(3000);
		///////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////////////\\\\\\\\\\\
		
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved succesfully in maruti Insurance");
		Thread.sleep(4000);
		
		
	}

	private static void Maruti_Insurance(WebElement element, String value) throws InterruptedException {
	



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
		
		if((value.length()> 12))
			
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