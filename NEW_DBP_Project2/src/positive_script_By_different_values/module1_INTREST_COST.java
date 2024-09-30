package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


 public class module1_INTREST_COST {
	
	static void Intrest_cost(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
	

		//<>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		
		
		// 1.THEN CLICK ON THE INTEREST COST QUANTITY....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[4]")).click();
		
		
		Thread.sleep(2000);
////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		// We put the conditions of URL
		
		 String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/Interest-Cost";
		
	
		 String actual_class = driver.getCurrentUrl();
		
		if(expected_class.equals(actual_class)) {
			System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

		}
		else {
		System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
		}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		Thread.sleep(4000);
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//.................SHORT TERM LOAN..............................
		
		WebElement N1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		WebElement N2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		WebElement N3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		WebElement N4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		WebElement N5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		WebElement N6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		WebElement N7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		// we will see that all the data is filling and adding according to the number or not......
		WebElement N8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
		WebElement N9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		WebElement N10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
		WebElement N11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
		WebElement N12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		WebElement N13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
		WebElement N14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		WebElement N15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
		WebElement N16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
		WebElement N17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
		WebElement N18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
		WebElement N19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
		WebElement N20 = driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
		WebElement N21 = driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
		// we will see that all the data is filling and adding according to the number or not......
		WebElement N22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
		WebElement N23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
		WebElement N24 = driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
		WebElement N25 = driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
		WebElement N26 = driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
		WebElement N27 = driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
		WebElement N28 = driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		//.........................LONG TERM LOAN.............................
		WebElement N29 = driver.findElement(By.xpath("(//*[@type=\"number\"])[50]"));
		WebElement N30 = driver.findElement(By.xpath("(//*[@type=\"number\"])[51]"));
		WebElement N31 = driver.findElement(By.xpath("(//*[@type=\"number\"])[52]"));
		WebElement N32 = driver.findElement(By.xpath("(//*[@type=\"number\"])[53]"));
		WebElement N33 = driver.findElement(By.xpath("(//*[@type=\"number\"])[54]"));
		WebElement N34 = driver.findElement(By.xpath("(//*[@type=\"number\"])[55]"));
		WebElement N35 = driver.findElement(By.xpath("(//*[@type=\"number\"])[56]"));
		// we will see that all the data is filling and adding according to the number or not......
		WebElement N36 = driver.findElement(By.xpath("(//*[@type=\"number\"])[58]"));
		WebElement N37 = driver.findElement(By.xpath("(//*[@type=\"number\"])[59]"));
		WebElement N38 = driver.findElement(By.xpath("(//*[@type=\"number\"])[60]"));
		WebElement N39 = driver.findElement(By.xpath("(//*[@type=\"number\"])[61]"));
		WebElement N40 = driver.findElement(By.xpath("(//*[@type=\"number\"])[62]"));
		WebElement N41 = driver.findElement(By.xpath("(//*[@type=\"number\"])[63]"));
		WebElement N42 = driver.findElement(By.xpath("(//*[@type=\"number\"])[64]"));
		// we will see that all the data is filling and adding according to the number or not......
		WebElement N43 = driver.findElement(By.xpath("(//*[@type=\"number\"])[74]"));
		WebElement N44 = driver.findElement(By.xpath("(//*[@type=\"number\"])[75]"));
		WebElement N45 = driver.findElement(By.xpath("(//*[@type=\"number\"])[76]"));
		WebElement N46 = driver.findElement(By.xpath("(//*[@type=\"number\"])[77]"));
		WebElement N47 = driver.findElement(By.xpath("(//*[@type=\"number\"])[78]"));
		WebElement N48 = driver.findElement(By.xpath("(//*[@type=\"number\"])[79]"));
		WebElement N49 = driver.findElement(By.xpath("(//*[@type=\"number\"])[80]"));
		// we will see that all the data is filling and adding according to the number or not......
		WebElement N50 = driver.findElement(By.xpath("(//*[@type=\"number\"])[82]"));
		WebElement N51 = driver.findElement(By.xpath("(//*[@type=\"number\"])[83]"));
		WebElement N52 = driver.findElement(By.xpath("(//*[@type=\"number\"])[84]"));
		WebElement N53 = driver.findElement(By.xpath("(//*[@type=\"number\"])[85]"));
		WebElement N54 = driver.findElement(By.xpath("(//*[@type=\"number\"])[86]"));
		WebElement N55 = driver.findElement(By.xpath("(//*[@type=\"number\"])[87]"));
		WebElement N56 = driver.findElement(By.xpath("(//*[@type=\"number\"])[88]"));
		
		
		
		// After we will pass the data in all the webelements
		
		 sendNumericValue(N1, "6556");
		 sendNumericValue(N2, "46774");
		 sendNumericValue(N3, "123");
		 sendNumericValue(N4, "123");
		 sendNumericValue(N5, "123");
		 sendNumericValue(N6, "7474");
		 sendNumericValue(N7, "123");
		 sendNumericValue(N8, "123");
		 sendNumericValue(N9, "123");
		 sendNumericValue(N10, "12883");
		 sendNumericValue(N11, "352283");
		 sendNumericValue(N12, "123");
		 
		 sendNumericValue(N13, "6556");
		 sendNumericValue(N14, "46774");
		 sendNumericValue(N15, "123");
		 sendNumericValue(N16, "123");
		 sendNumericValue(N17, "123");
		 sendNumericValue(N18, "7474");
		 sendNumericValue(N19, "123");
		 sendNumericValue(N20, "123");
		 sendNumericValue(N21, "123");
		 sendNumericValue(N22, "12883");
		 sendNumericValue(N23, "352283");
		 sendNumericValue(N24, "123");
		 
		 sendNumericValue(N25, "6556");
		 sendNumericValue(N26, "46774");
		 sendNumericValue(N27, "123");
		 sendNumericValue(N28, "123");
		 sendNumericValue(N29, "123");
		 sendNumericValue(N30, "7474");
		 sendNumericValue(N31, "123");
		 sendNumericValue(N32, "123");
		 sendNumericValue(N33, "123");
		 sendNumericValue(N34, "12883");
		 sendNumericValue(N35, "352283");
		 sendNumericValue(N36, "123");
		 
		 sendNumericValue(N37, "6556");
		 sendNumericValue(N38, "46774");
		 sendNumericValue(N39, "123");
		 sendNumericValue(N40, "123");
		 sendNumericValue(N41, "123");
		 sendNumericValue(N42, "7474");
		 sendNumericValue(N43, "123");
		 sendNumericValue(N44, "123");
		 sendNumericValue(N45, "123");
		 sendNumericValue(N46, "12883");
		 sendNumericValue(N47, "352283");
		 sendNumericValue(N48, "123");
		 
		 sendNumericValue(N49, "123");
		 sendNumericValue(N50, "7474");
		 sendNumericValue(N51, "123");
		 sendNumericValue(N52, "123");
		 sendNumericValue(N53, "123");
		 sendNumericValue(N54, "12883");
		 sendNumericValue(N55, "352283");
		 sendNumericValue(N56, "123");
		 
		 Thread.sleep(5000);
		// then we will save the all data 
					driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
					Thread.sleep(2000);
					driver.findElement(By.cssSelector("[class=\"save\"]")).click();
					
					System.out.println("all the data has been saved in Discount");
					Thread.sleep(3000);
					
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
					
					
					
				  	

	// We have created the method ..
	
       private static void sendNumericValue(WebElement element, String value) throws InterruptedException {
    	
    	   

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
        
         
         
         
     }}}