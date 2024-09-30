package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Networkdetails {

	
	static void networkDetails(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/network-details";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
		WebElement N1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	
		WebElement N2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		
		WebElement N3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		
		WebElement N4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	
		
		// 3.Then fil the fill the value in the services...........
		
		WebElement N5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		
		WebElement N6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		
		WebElement N7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		
		WebElement N8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		
		WebElement N9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	
		WebElement N10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		
		WebElement N11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
		
		WebElement N12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		//Then we will pass the data 
		sendnumericvalue(N1,"422");
		sendnumericvalue(N2,"43");
		sendnumericvalue(N3,"422");
		sendnumericvalue(N4,"42");
		
		sendnumericvalue(N5,"4372");
		sendnumericvalue(N6,"35");
		sendnumericvalue(N7,"345");
		sendnumericvalue(N8,"4372");
		
		sendnumericvalue(N9,"4372");
		sendnumericvalue(N10,"3454");
		sendnumericvalue(N11,"4372");
		sendnumericvalue(N12,"967");
		
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<		
		
		
		
		//4. Then we have to click on the save button 
		
		WebElement Save_button = driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]"));
		Save_button.click();
		
		// 5.Then again the save Popup button will show again we have to click .
		
		WebElement Popup_save_button = driver.findElement(By.cssSelector("[class=\"save\"]"));
		Popup_save_button.click();
	
	
		System.out.println("All the data has been saved succesfully in network details");
		Thread.sleep(3000);

		
	      
		}

		 private static void sendnumericvalue(WebElement element, String value) throws InterruptedException {
				


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