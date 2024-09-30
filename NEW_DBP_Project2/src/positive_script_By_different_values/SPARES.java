package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SPARES {
	static void spares(WebDriver driver ) throws InterruptedException {
		
		// Then click on the SPARES on the left side....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[12]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/spare";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			

		// Spares - Sales
		WebElement S1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
		WebElement S2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
		WebElement S3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
		WebElement S4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
		
		//Spares - COGS
		WebElement S5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
		WebElement S6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
		WebElement S7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
		WebElement S8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
		WebElement S9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
		WebElement S10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
		WebElement S11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
		WebElement S12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
		WebElement S13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
		WebElement S14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
		WebElement S15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
		WebElement S16 = driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
		
		//Income
		WebElement S17 = driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
		WebElement S18 = driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
		WebElement S19 = driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
		WebElement S20 = driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));

		// Expense
		WebElement S21 = driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
		WebElement S22 = driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
		WebElement S23 = driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
		WebElement S24 = driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
		
		Thread.sleep(3000);
////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////////////////////
		// Then we will fill all the data 
		
		Spares(S1,"324");
		Spares(S2,"924");
		Spares(S3,"1324");
		Spares(S4,"3324");
		Spares(S5,"31324");
		Spares(S6,"96324");
		Spares(S7,"24");
		Spares(S8,"5354");
		Spares(S9,"324");
		Spares(S10,"9624");
		Spares(S11,"45532");
		Spares(S12,"5454");
		Spares(S13,"124");
		Spares(S14,"9124");
		Spares(S15,"9124");
		Spares(S16,"9324");
		Spares(S17,"324");
		Spares(S18,"624");
		Spares(S19,"324");
		Spares(S20,"924");
		Spares(S21,"964");
		Spares(S22,"924");
		Spares(S23,"924");
		Spares(S24,"9324");
		
		
		
///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////////////////////		
		Thread.sleep(3000);
		
		// Then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved succesfully in Spares");
		Thread.sleep(3000);

			
	}

	private static void Spares(WebElement element, String value) {
		

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