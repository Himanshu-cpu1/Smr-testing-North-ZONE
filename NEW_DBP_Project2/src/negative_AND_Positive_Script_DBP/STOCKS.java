package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class STOCKS {
	
	static void stOcks(WebDriver driver) throws InterruptedException {
		
		
		
		//Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[2]")).click();        
				Thread.sleep(3000);
				
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/stock";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
		        
		        Thread.sleep(3000);        
		        driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();        
		        Thread.sleep(2000);        
		        driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();        
		        Thread.sleep(2000);
		        
		        WebElement a1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		        WebElement a2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		        WebElement a3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		        WebElement a4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		        WebElement a5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		        WebElement a6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		        
		        WebElement a7= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		        
		        WebElement a8= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		        WebElement a9= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
		        WebElement a10= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
//...........................................................................................................		        
		        WebElement a11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
		        WebElement a12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
		        WebElement a13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		        WebElement a14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
		        WebElement  a15  = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
		        WebElement a16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
		        
		        WebElement a17= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
		        
		        WebElement a18= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
		        WebElement a19= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
		        WebElement a20= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
//...........................................................................................................		        
		        WebElement a21= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
		        WebElement a22= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
		        WebElement a23= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
		        WebElement a24= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
		        WebElement a25= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
		        WebElement a26= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
		        
		        WebElement a27= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
		        
		        WebElement a28= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
		        WebElement a29= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
		        WebElement a30= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
//..........................................................................................................		        
		        WebElement a31= driver.findElement(By.xpath("(//*[@type=\"number\"])[49]"));
		        WebElement a32= driver.findElement(By.xpath("(//*[@type=\"number\"])[50]"));
		        WebElement a33= driver.findElement(By.xpath("(//*[@type=\"number\"])[51]"));
		        WebElement a34= driver.findElement(By.xpath("(//*[@type=\"number\"])[52]"));
		        WebElement a35= driver.findElement(By.xpath("(//*[@type=\"number\"])[53]"));
		        WebElement a36= driver.findElement(By.xpath("(//*[@type=\"number\"])[54]"));
		        
		        WebElement a37= driver.findElement(By.xpath("(//*[@type=\"number\"])[56]"));
		        
		        WebElement a38= driver.findElement(By.xpath("(//*[@type=\"number\"])[58]"));
		        WebElement a39= driver.findElement(By.xpath("(//*[@type=\"number\"])[59]"));
		        WebElement a40= driver.findElement(By.xpath("(//*[@type=\"number\"])[60]"));
//.........,..................................................,,,,,,,,,,,,,................................		        
		        WebElement a41= driver.findElement(By.xpath("(//*[@type=\"number\"])[65]"));
		        WebElement a42= driver.findElement(By.xpath("(//*[@type=\"number\"])[66]"));
		        WebElement a43= driver.findElement(By.xpath("(//*[@type=\"number\"])[67]"));
		        WebElement a44= driver.findElement(By.xpath("(//*[@type=\"number\"])[68]"));
		        WebElement a45= driver.findElement(By.xpath("(//*[@type=\"number\"])[69]"));
		        WebElement a46= driver.findElement(By.xpath("(//*[@type=\"number\"])[70]"));
		        
		        WebElement a47= driver.findElement(By.xpath("(//*[@type=\"number\"])[72]"));
		        
		        WebElement a48= driver.findElement(By.xpath("(//*[@type=\"number\"])[74]"));
		        WebElement a49= driver.findElement(By.xpath("(//*[@type=\"number\"])[75]"));
		        WebElement a50= driver.findElement(By.xpath("(//*[@type=\"number\"])[76]"));
//.........................................................................................................		        
		        WebElement a51= driver.findElement(By.xpath("(//*[@type=\"number\"])[81]"));
		        WebElement a52= driver.findElement(By.xpath("(//*[@type=\"number\"])[82]"));
		        WebElement a53= driver.findElement(By.xpath("(//*[@type=\"number\"])[83]"));
		        WebElement a54= driver.findElement(By.xpath("(//*[@type=\"number\"])[84]"));
		        WebElement a55= driver.findElement(By.xpath("(//*[@type=\"number\"])[85]"));
		        WebElement a56= driver.findElement(By.xpath("(//*[@type=\"number\"])[86]"));
		        
		        WebElement a57= driver.findElement(By.xpath("(//*[@type=\"number\"])[88]"));
		        
		        WebElement a58= driver.findElement(By.xpath("(//*[@type=\"number\"])[90]"));
		        WebElement a59= driver.findElement(By.xpath("(//*[@type=\"number\"])[91]"));
		        WebElement a60= driver.findElement(By.xpath("(//*[@type=\"number\"])[92]"));
//............................................................................................................		        
		        WebElement a61= driver.findElement(By.xpath("(//*[@type=\"number\"])[97]"));
		        WebElement a62= driver.findElement(By.xpath("(//*[@type=\"number\"])[98]"));
		        WebElement a63= driver.findElement(By.xpath("(//*[@type=\"number\"])[99]"));
		        WebElement a64= driver.findElement(By.xpath("(//*[@type=\"number\"])[100]"));
		        WebElement a65= driver.findElement(By.xpath("(//*[@type=\"number\"])[101]"));
		        WebElement a66= driver.findElement(By.xpath("(//*[@type=\"number\"])[102]"));
		        
		        WebElement a67= driver.findElement(By.xpath("(//*[@type=\"number\"])[104]"));
		        
		        WebElement a68= driver.findElement(By.xpath("(//*[@type=\"number\"])[106]"));
		        WebElement a69= driver.findElement(By.xpath("(//*[@type=\"number\"])[107]"));
		        WebElement a70= driver.findElement(By.xpath("(//*[@type=\"number\"])[108]"));
//............................................................................................................		        
		        WebElement a71= driver.findElement(By.xpath("(//*[@type=\"number\"])[113]"));
		        WebElement a72= driver.findElement(By.xpath("(//*[@type=\"number\"])[114]"));
		        WebElement a73= driver.findElement(By.xpath("(//*[@type=\"number\"])[115]"));
		        WebElement a74= driver.findElement(By.xpath("(//*[@type=\"number\"])[116]"));
		        WebElement a75= driver.findElement(By.xpath("(//*[@type=\"number\"])[117]"));
		        WebElement a76= driver.findElement(By.xpath("(//*[@type=\"number\"])[118]"));
		        
		        WebElement a78= driver.findElement(By.xpath("(//*[@type=\"number\"])[120]"));
		        
		        WebElement a79= driver.findElement(By.xpath("(//*[@type=\"number\"])[122]"));
		        WebElement a80= driver.findElement(By.xpath("(//*[@type=\"number\"])[123]"));
		        WebElement a81= driver.findElement(By.xpath("(//*[@type=\"number\"])[124]"));
//......................................................................................................		        
		        WebElement a82= driver.findElement(By.xpath("(//*[@type=\"number\"])[129]"));
		        WebElement a83= driver.findElement(By.xpath("(//*[@type=\"number\"])[130]"));
		        WebElement a84= driver.findElement(By.xpath("(//*[@type=\"number\"])[131]"));
		        WebElement a85= driver.findElement(By.xpath("(//*[@type=\"number\"])[132]"));
		        WebElement a86= driver.findElement(By.xpath("(//*[@type=\"number\"])[133]"));
		        WebElement a87= driver.findElement(By.xpath("(//*[@type=\"number\"])[134]"));
		        
		        WebElement a88= driver.findElement(By.xpath("(//*[@type=\"number\"])[136]"));
		        
		        WebElement a89= driver.findElement(By.xpath("(//*[@type=\"number\"])[138]"));
		        WebElement a90= driver.findElement(By.xpath("(//*[@type=\"number\"])[139]"));
		        WebElement a91= driver.findElement(By.xpath("(//*[@type=\"number\"])[140]"));
//.........................................................................................................		        
		        WebElement a92= driver.findElement(By.xpath("(//*[@type=\"number\"])[145]"));
		        WebElement a93= driver.findElement(By.xpath("(//*[@type=\"number\"])[146]"));
		        WebElement a94= driver.findElement(By.xpath("(//*[@type=\"number\"])[147]"));
		        WebElement a95= driver.findElement(By.xpath("(//*[@type=\"number\"])[148]"));
		        WebElement a96= driver.findElement(By.xpath("(//*[@type=\"number\"])[149]"));
		        WebElement a97= driver.findElement(By.xpath("(//*[@type=\"number\"])[150]"));
		        
		        WebElement a98= driver.findElement(By.xpath("(//*[@type=\"number\"])[152]"));
		        
		        WebElement a99= driver.findElement(By.xpath("(//*[@type=\"number\"])[154]"));
		        WebElement a100= driver.findElement(By.xpath("(//*[@type=\"number\"])[155]"));
		        
		    	// /  /// /	//	/////\\\\\\\\\\\\\\\\\\\\\\\\\\\\/\////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////\\\\\\\\\\\\\\\\\\\\\\\
				
				// Then we will fill all the data 
				
				 String[] Data = {"jghhkk","ygjhfdkh","iokllklk","0998988"};
					
				  
				  // Through each web element
			        for (WebElement element : new WebElement[] {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a27,a26,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,a41,a42,a43,a44,a45,a46,a47,a48,a49,a50,a51,a52,a53,a54,a55,a56,a57,a58,a59,a60,a61,a62,a63,a64,a65,a66,a67,a68,a69,a70,a71,a72,a72,a73,a74,a75,a76,a78,a79,a80,a81,a82,a83,a84,a85,a86,a87,a88,a89,a90,a91,a92,a93,a94,a95,a96,a97,a98,a99,a100}) 
			        	
			         
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
			        
				
