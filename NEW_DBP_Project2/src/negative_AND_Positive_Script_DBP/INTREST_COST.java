package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


 public class INTREST_COST {
	
	static void Intrest_cost(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
	

		//<>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		
		
		// 1.THEN CLICK ON THE INTEREST COST QUANTITY....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[4]")).click();
		//clear data first
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
	    Thread.sleep(2000);
		
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
		
		
///////////\\\\\\\///////////////////////////////////////\\\\\///////////////////////////////////////////////////////////////////		
		 
		// Then fill the all data 
		
		Thread.sleep(1000);
		
		 String[] Data = {"4554"};
		 Thread.sleep(1000);
		 
		
		  
		  // Through each web element
	      
	        	
			for (WebElement element : new WebElement[] {N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22,N23,N24,N25,N26,N27,N28,N29,N30,N31,N32,N33,N34,N35,N36,N37,N38,N39,N40,N41,N42,N43,N44,N45,N46,N47,N48,N49,N50,N51,N52,N53,N54,N55,N56})  

	          
	        	 // Send  data
	            for (String data : Data) {
	                
	                sendData1( element, data);
	           
	            }

		    //Save data
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		}
	            	           	        		        	        	        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		private static void sendData1(WebElement element, String data) throws InterruptedException {
				
			   // Clear existing data
	        element.clear();
	        // Send new data
	        element.sendKeys(data);
	        
		
		
		}}
		
		
