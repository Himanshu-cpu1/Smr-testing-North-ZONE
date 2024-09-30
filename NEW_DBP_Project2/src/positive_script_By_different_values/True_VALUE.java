package positive_script_By_different_values;

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
		
		Thread.sleep(3000);
////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\//////
		
		// THEN WE WILL FILL ALL THE DATA 
		
		Truevalue(T1,"66");
		
		Truevalue(T2,"3553");
		
		Truevalue(T3,"333");
		Truevalue(T4,"4553");
		Truevalue(T5,"756");
		Truevalue(T6,"978");
		Truevalue(T7,"98");
		Truevalue(T8,"76");
		Truevalue(T9,"4242");
		Truevalue(T10,"734766");
		Truevalue(T11,"7764226");
		Truevalue(T12,"7766");
		Truevalue(T13,"433");
		Truevalue(T14,"3232");
		Truevalue(T15,"7766");
		Truevalue(T16,"432");
		Truevalue(T17,"77466");
		Truevalue(T18,"443");
		Truevalue(T19,"7766");
		
		
		
////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\		
		Thread.sleep(3000);
		// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
				System.out.println("all the data has been saved succesfully in True VALUE");
				Thread.sleep(3000);
		
		// Then we created the method .......
		
	}

	private static void Truevalue(WebElement element, String value) {
		 
		


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

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<

//3. Verify if the element is not null
  
  if (element != null) {
      // Perform action (e.g., sending keys) on the element
      
      System.out.println("Element  is not NULL : =   pass    ");
  } else {
      System.out.println("Element is null. Cannot perform action: =   fail    ");
    
}
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
  
  //  4.... If the element is Disable
  
  if (!element.isEnabled()) {
  	System.out.println("element is disable : = fail    ");
  
  
	}else{
		
		System.out.println("element is enable  = pass  ");
	}
//.....>>>>>>..>>>..>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

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