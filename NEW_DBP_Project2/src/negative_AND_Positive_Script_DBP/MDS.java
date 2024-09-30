package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MDS {
	static void mds(WebDriver driver ) throws InterruptedException {
		
		// Then click on the MDS option on the left ....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[8]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/mdc";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
		
		
		// then we will fill the details of Income in maruti driving school
		WebElement MDS_1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		WebElement MDS_2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		WebElement MDS_3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		WebElement MDS_4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		// then we will fill the expenses in particualr required field..
		
		WebElement MDS_5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
		
		Thread.sleep(3000);
		
///////////\\\\\\\///////////////////////////////////////\\\\\///////////////////////////////////////////////////////////////////		
		 
		// Then fill the all data 
		
		
		String[] Data= {"abcvd", "tyghfd", "#%&@", "90000", "100000"};	
		    
		    for(WebElement element : new WebElement[] {MDS_1,MDS_2,MDS_3,MDS_4,MDS_5})
		    	
		    	//send data
		    	for(String data: Data)
		    	{
		    		sendingData1(element, data);
		    		Thread.sleep(1000);
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
			
			//You can add additional actions here if needed
			
			Methods_of_conditions.sendData1(element, data);
			
		}}