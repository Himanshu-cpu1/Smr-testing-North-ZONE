package positive_script_By_different_values;

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
		
		Thread.sleep(3000);
///////////\\\\\\\///////////////////////////////////////\\\\\///////////////////////////////////////////////////////////////////		
		// Then we will fill all the data 
		
		Manpowercost(M1,"656546");
		Manpowercost(M2,"4242");
		Manpowercost(M3,"24");
		Manpowercost(M4,"6775");
		Manpowercost(M5,"5454");
		Manpowercost(M6,"707");
		Manpowercost(M7,"6565");
		Manpowercost(M8,"664");
		Manpowercost(M9,"44");
		Manpowercost(M10,"64");
		Manpowercost(M11,"464");
		
		Manpowercost(M12,"45454");
		Manpowercost(M13,"8765");
		Manpowercost(M14,"2233");
		Manpowercost(M15,"0877");
		Manpowercost(M16,"6453");
		Manpowercost(M17,"456645");
		Manpowercost(M18,"35536");
		Manpowercost(M19,"6532");
		Manpowercost(M20,"765");
		Manpowercost(M21,"707");
		Manpowercost(M22,"453");
		
		Manpowercost(M23,"8677");
		Manpowercost(M24,"67707");
		Manpowercost(M25,"707");
		Manpowercost(M26,"00");
		Manpowercost(M27,"707");
		Manpowercost(M28,"667");
		Manpowercost(M29,"6564");
		Manpowercost(M30,"54");
		Manpowercost(M31,"45");
		Manpowercost(M32,"5454");
		
		
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\		
		Thread.sleep(3000);
		
		
		// we will save the following numbers
		System.out.println("all the numbers has been filled succesfully");
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved in man power cost");
		Thread.sleep(3000);
		
		
		
	}

	private static void Manpowercost(WebElement element, String value) {
		


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