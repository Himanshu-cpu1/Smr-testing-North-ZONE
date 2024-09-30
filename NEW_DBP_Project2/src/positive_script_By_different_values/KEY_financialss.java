package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KEY_financialss {
	
	static void keyfinancials(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[15]")).click();

		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/Key-Financials";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			

				// Key Financials		
				WebElement K1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
				WebElement K2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
				//...................................
				WebElement K3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
				WebElement K4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
				WebElement K5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
				WebElement K6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
				//........................................
				WebElement K7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
				WebElement K8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
				WebElement K9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
				WebElement K10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
				WebElement K11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
				WebElement K12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
				WebElement K13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));

				Thread.sleep(3000);
				
// ////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\//////////////////\\\\\\\\\
				
		// Then we fill the data
				KeYfinancial(K1,"6566");
				KeYfinancial(K2,"6666");
				KeYfinancial(K3,"545");
				KeYfinancial(K4,"979797");
				KeYfinancial(K5,"979797");
				KeYfinancial(K6,"979797");
				KeYfinancial(K7,"68");
				KeYfinancial(K8,"75");
				KeYfinancial(K9,"56");
				KeYfinancial(K10,"46533");
				KeYfinancial(K11,"5555");
				KeYfinancial(K12,"5455");
				KeYfinancial(K13,"5455");
				
				
				Thread.sleep(3000);
// ////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\//////////////////\\\\\\\\\				
				
				// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
				System.out.println("all the data has been saved succesfully in the Key Financials");
				
				Thread.sleep(3000);
		
	}

	private static void KeYfinancial(WebElement element, String value) {
		


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