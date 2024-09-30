package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class COMMAN_expenses {
	static void commanEXPENSE(WebDriver driver) throws InterruptedException {
		
		// Then click on the comman expenses option on the left side....
		
				driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[14]")).click();
				Thread.sleep(3000);
				
////////////////////////////////////////////////////////////////////////////////////////////////////
				
// We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/common-expense";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

}
else {
System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
				// Depreciation & Rent
			
				WebElement C1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
				WebElement C2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
				WebElement C3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
				WebElement C4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
				WebElement C5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
				WebElement C6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
				WebElement C7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
				
				WebElement C8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
				WebElement C9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
				WebElement C10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
				WebElement C11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
				WebElement C12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
				WebElement C13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
				WebElement C14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));

				WebElement C15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
				WebElement C16 = driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
				WebElement C17 = driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
				WebElement C18 = driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
				WebElement C19 = driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
				WebElement C20 = driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
				WebElement C21 = driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));

				WebElement C22 = driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
				WebElement C23 = driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
				WebElement C24 = driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
				WebElement C25 = driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
				WebElement C26 = driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
				WebElement C27 = driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
				WebElement C28 = driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
				
				WebElement C29 = driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
				WebElement C30 = driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
				WebElement C31 = driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
				WebElement C32 = driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
				WebElement C33 = driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
				WebElement C34 = driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
				WebElement C35 = driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
				WebElement C36 = driver.findElement(By.xpath("(//*[@type=\"text\"])[48]"));

				WebElement C37 = driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
				WebElement C38 = driver.findElement(By.xpath("(//*[@type=\"text\"])[51]"));
				WebElement C39 = driver.findElement(By.xpath("(//*[@type=\"text\"])[52]"));
				WebElement C40 = driver.findElement(By.xpath("(//*[@type=\"text\"])[53]"));
				WebElement C41 = driver.findElement(By.xpath("(//*[@type=\"text\"])[54]"));
				WebElement C42 = driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
				WebElement C43 = driver.findElement(By.xpath("(//*[@type=\"text\"])[56]"));
				WebElement C44 = driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
				
				Thread.sleep(3000);
	///////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////////////////////////////////
				
				// Then fill the all data 
				
				commanexpense(C1,"6324");
				commanexpense(C2,"6324");
				commanexpense(C3,"6324");
				commanexpense(C4,"324");
				commanexpense(C5,"3324");
				commanexpense(C6,"3324");
				commanexpense(C7,"43324");
				commanexpense(C8,"34324");
				commanexpense(C9,"423324");
				commanexpense(C10,"64324");
				commanexpense(C11,"224");
				
				commanexpense(C12,"6324");
				commanexpense(C13,"6324");
				commanexpense(C14,"6324");
				commanexpense(C15,"324");
				commanexpense(C16,"653");
				commanexpense(C17,"3324");
				commanexpense(C18,"43324");
				commanexpense(C19,"34324");
				commanexpense(C20,"423324");
				commanexpense(C21,"64324");
				commanexpense(C22,"224");
				
				commanexpense(C23,"6324");
				commanexpense(C24,"6324");
				commanexpense(C25,"6324");
				commanexpense(C26,"324");
				commanexpense(C27,"3324");
				commanexpense(C28,"3324");
				commanexpense(C29,"43324");
				commanexpense(C30,"34324");
				commanexpense(C31,"423324");
				commanexpense(C32,"64324");
				commanexpense(C33,"224");
				
				commanexpense(C34,"3423");
				commanexpense(C35,"234324");
				commanexpense(C36,"24342");
				commanexpense(C37,"324");
				commanexpense(C38,"3324");
				commanexpense(C39,"3324");
				commanexpense(C40,"7553");
				commanexpense(C41,"34324");
				commanexpense(C42,"423324");
				commanexpense(C43,"64324");
				commanexpense(C44,"224");
				
				
				
	//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////\\\\\\\\\\\\\\\\\\\\\\\\///////////			
				
				Thread.sleep(3000);
				
				// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
				System.out.println("all the data has been saved succesfully in OTHER EXPENSES");
				
				Thread.sleep(4000);
				
				// Then we use Scroll up method
				
				Actions actions = new Actions(driver);
			     actions.sendKeys(Keys.PAGE_UP).perform();
			     
			     Thread.sleep(2000);
			     Actions actions2 = new Actions(driver);
			     actions2.sendKeys(Keys.PAGE_UP).perform();
			     
			     
			     Thread.sleep(2000);
			     Actions actions3 = new Actions(driver);
			     actions3.sendKeys(Keys.PAGE_UP).perform();
			     
			     
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
				Thread.sleep(3000);
				
				// Click  On the 	OTHER EXPENSES and fill all the required fields
				
				driver.findElement(By.cssSelector("[id=\"nav-Expense-tab\"]")).click();
				
				Thread.sleep(3000);
				
				// Comman expenses Amount
				WebElement C444 = driver.findElement(By.xpath("(//*[@type=\"text\"])[82]"));
				WebElement C45 = driver.findElement(By.xpath("(//*[@type=\"text\"])[84]"));
				WebElement C46 = driver.findElement(By.xpath("(//*[@type=\"text\"])[86]"));
				WebElement C47 = driver.findElement(By.xpath("(//*[@type=\"text\"])[88]"));
				WebElement C48 = driver.findElement(By.xpath("(//*[@type=\"text\"])[90]"));
				WebElement C49 = driver.findElement(By.xpath("(//*[@type=\"text\"])[92]"));
				
				
				WebElement C50 = driver.findElement(By.xpath("(//*[@type=\"text\"])[94]"));
				WebElement C51 = driver.findElement(By.xpath("(//*[@type=\"text\"])[96]"));
				WebElement C52 = driver.findElement(By.xpath("(//*[@type=\"text\"])[98]"));
				WebElement C53 = driver.findElement(By.xpath("(//*[@type=\"text\"])[100]"));
				WebElement C54 = driver.findElement(By.xpath("(//*[@type=\"text\"])[102]"));
				WebElement C55 = driver.findElement(By.xpath("(//*[@type=\"text\"])[104]"));
				WebElement C56 = driver.findElement(By.xpath("(//*[@type=\"text\"])[106]"));
				WebElement C57 = driver.findElement(By.xpath("(//*[@type=\"text\"])[108]"));
				WebElement C58 = driver.findElement(By.xpath("(//*[@type=\"text\"])[110]"));
				WebElement C59 = driver.findElement(By.xpath("(//*[@type=\"text\"])[112]"));
				WebElement C60 = driver.findElement(By.xpath("(//*[@type=\"text\"])[114]"));
				WebElement C61 = driver.findElement(By.xpath("(//*[@type=\"text\"])[116]"));
				
				Thread.sleep(3000);
				
///>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
				// Then fill the data 
				
				commanexpense(C444,"3324");
				commanexpense(C45,"64324");
				commanexpense(C46,"224");
				
				commanexpense(C47,"6324");
				commanexpense(C48,"6324");
				commanexpense(C49,"6324");
				commanexpense(C50,"324");
				commanexpense(C51,"3324");
				commanexpense(C52,"3324");
				commanexpense(C53,"43324");
				commanexpense(C54,"34324");
				commanexpense(C55,"423324");
				commanexpense(C56,"64324");
				commanexpense(C57,"224");
				commanexpense(C58,"224");
				commanexpense(C59,"224");
				commanexpense(C60,"224");
				commanexpense(C61,"224");
				
				
///>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
			
				Thread.sleep(3000);
				// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
				System.out.println("all the data has been saved succesfully in comman expenses");

				Thread.sleep(3000);
				

		
	}

	private static void commanexpense(WebElement element, String value) {

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
//2. If the value length is not more than 12 characters	
		
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
      System.out.println("Element is null. Cannot perform action: =   fail     ");
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