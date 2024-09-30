package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KEY_financialss {
	
	static void keyfinancials(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[15]")).click();

		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/Key-Financials";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			

				// Key Financials		
				WebElement K1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
				WebElement K2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
				//...................................
				WebElement K3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
				WebElement K4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
				WebElement K5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
				WebElement K6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
				//........................................
				WebElement K7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
				WebElement K8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
				WebElement K9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
				WebElement K10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
				WebElement K11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
				WebElement K12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
				WebElement K13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));

				Thread.sleep(3000);
				
				 String[] Data = {"jghhkk","ygjhfdkh","iokllklk","0998988"};
				
				  
				  // Through each web element
			        for (WebElement element : new WebElement[] {K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13}) 
			          
			        	
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