package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SERVICE {
	
	static void service (WebDriver driver ) throws InterruptedException {
		

		// Then click on the Service Modules option on the left side....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[13]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/service";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			

		// Service
		WebElement S1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
		WebElement S2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
		WebElement S3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
		
		//Income
		WebElement S4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
		WebElement S5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
		WebElement S6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
		WebElement S7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
		WebElement S8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
		WebElement S9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
		WebElement S10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
		WebElement S11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
		WebElement S12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
		WebElement S13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
		WebElement S14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
		WebElement S15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
		
		//Expense
		WebElement S16 = driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
		WebElement S17 = driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
		WebElement S18 = driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
		WebElement S19 = driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
		WebElement S20 = driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
		WebElement S21 = driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
		WebElement S22 = driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
		WebElement S23 = driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
		WebElement S24 = driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
		WebElement S25 = driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
		
		Thread.sleep(3000);
///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/\///////////////////////////////////\\\\\\\\\\\\\\\/\
		
		// Then fill the all data 
		servicess(S1,"34233");
		servicess(S2,"3433");
		servicess(S3,"2111");
		servicess(S4,"23");
		servicess(S5,"23223");
		
		servicess(S6,"32");
		servicess(S7,"3223");
		servicess(S8,"53454");
		servicess(S9,"9624");
		servicess(S10,"5454");
		
		servicess(S11,"9624");
		servicess(S12,"9624");
		servicess(S13,"9624");
		servicess(S14,"9624");
		servicess(S15,"9624");
		
		servicess(S16,"9624");
		servicess(S17,"5454");
		servicess(S18,"545");
		servicess(S19,"09323");
		servicess(S20,"324");
		
		servicess(S21,"9624");
		servicess(S22,"43032");
		servicess(S23,"42332");
		servicess(S24,"9624");
		servicess(S25,"9624");
		
		
		
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////////////////\\\\\\		
		Thread.sleep(3000);
		
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved succesfully");
		Thread.sleep(3000);
		
		
		// we have created the method....
		
	}

	private static void servicess(WebElement element, String value) {

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