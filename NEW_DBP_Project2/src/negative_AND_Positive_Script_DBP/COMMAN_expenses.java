package negative_AND_Positive_Script_DBP;



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
			
	///////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////////////////////////////////
				
				// Then fill the all data 
				Thread.sleep(1000);
				
				 String[] Data = {"8988"};
				 Thread.sleep(2000);
				 
				
				  
				  // Through each web element
			        for (WebElement element : new WebElement[] {C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22,C23,C24,C25,C26,C27,C28,C29,C30,C31,C32,C33,C34,C35,C36,C37,C38,C39,C40,C41,C42,C43,C44,}) 
			          
			        	
			        	 // Send  data
			            for (String data : Data) 
			            {
			                
			                sendingData1( element, data);
			           
			            }
			            
			            //Save data
					    Thread.sleep(1000);
					    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
					    Thread.sleep(2000);
					    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
					    
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
				    
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
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
					     
					  // Click  On the 	OTHER EXPENSES and fill all the required fields
					    
					     Thread.sleep(2000);

					     
							driver.findElement(By.cssSelector("[id=\"nav-Expense-tab\"]")).click();
							
							Thread.sleep(2000);
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
						
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
							
							// Then fill the all data 
							Thread.sleep(1000);
							
							 String[] Data1 = {"8988"};
							 Thread.sleep(2000);
							 
							
							  
							  // Through each web element
						        for (WebElement element : new WebElement[] {C444,C45,C46,C47,C48,C49,C50,C51,C52,C53,C54,C55,C56,C57,C58,C59,C60,C61}) 
						          
						        	
						        	 // Send  data
						            for (String data : Data1) 
						            {
						                
						                sendingData1( element, data);
						                
  //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
																           
						            }
						            
						            //Save data
								    Thread.sleep(1000);
								    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
								    Thread.sleep(2000);
								    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
								    
								
							
					     
					}
					 
					  private static void sendingData1(WebElement element, String data) throws InterruptedException {
							
						//clear existing data
						element.clear();
						
						//send new data
						element.sendKeys(data);
						
						// We will go for conditional methods
						
						Methods_of_conditions.sendData1(element, data);
						
					}}			   	