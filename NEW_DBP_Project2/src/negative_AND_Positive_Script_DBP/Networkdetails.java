package negative_AND_Positive_Script_DBP;

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

          //clear data first
          Thread.sleep(2000);
           driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
           Thread.sleep(2000);

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
		
		// /  /// /	//	/////\\\\\\\\\\\\\\\\\\\\\\\\\\\\/\////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////\\\\\\\\\\\\\\\\\\\\\\\
		
				// Then we will fill all the data 
				
				 String[] Data = {"fddfddf"};
					
				  
				  // Through each web element
			        for (WebElement element : new WebElement[] {N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12}) 
			        	
			         
			        	 // Send  data
			            for (String data : Data) {
			                sendData1(element, data);
			                Thread.sleep(1000);
			                
			                
			            }
			    		    //Save data
			    		    Thread.sleep(1000);
			    		    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
			    		    Thread.sleep(2000);
			    		    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
			    		}
			           	   

				public static void sendData1(WebElement element, String data) throws InterruptedException {
			        // Clear existing data
			        element.clear();
			        // Send new data
			        element.sendKeys(data);
			        
			        
			        // Then we call the conditions
			        
			        Methods_of_conditions.sendData1(element, data);
			        
			        
				}}			        
			        
				

