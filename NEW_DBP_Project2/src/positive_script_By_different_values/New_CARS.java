package positive_script_By_different_values;

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
		
		///////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\
		// Then we fill the all data 
		Thread.sleep(2000);
		Ncars(C1,"456");
		Ncars(C2,"6565");
		Ncars(C3,"42");
		Ncars(C4,"422");
		Ncars(C5,"323");
		Ncars(C6,"422");
		Ncars(C7,"422");
		Ncars(C8,"4242");
		Ncars(C9,"3223");
		Ncars(C10,"42242");
		Ncars(C11,"223");
		
		Ncars(C12,"223");
		Ncars(C13,"42");
		Ncars(C14,"4242");
		Ncars(C15,"42");
		Ncars(C16,"4242");
		Ncars(C17,"42");
		Ncars(C18,"56636");
		Ncars(C19,"653336");
		Ncars(C20,"3656");
		Ncars(C21,"6363");
		
		Ncars(C22,"5663");
		Ncars(C23,"2");
		Ncars(C24,"4223");
		Ncars(C25,"4242");
		Ncars(C26,"653");
		Ncars(C27,"546");
		Ncars(C28,"645656");
		Ncars(C29,"44");
		Ncars(C30,"2232");
		Ncars(C31,"232");
		
		
	
		Thread.sleep(2000);
		
		
		// then we will se that all the details are correctly added in Total New Car Direct Expense [B]
		// also check Net Earning New car = [A] - [B] is correct or not
		System.out.println("Net Earning New car = [A] - [B]  is correct");
		
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved in the new cars");
		
		Thread.sleep(3000);
		
		
	}

	private static void Ncars(WebElement element, String value) {
		

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