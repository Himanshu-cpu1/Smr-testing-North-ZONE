package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Manpower_Count {
	
	static void manPOWER(WebDriver driver) throws InterruptedException {
		

		//THEN CLICK ON THE MAN POWER COUNT....................
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[5]")).click();
		
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/main-power-count";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
		// Then fill all the detils in Direct Manpower on New Car Sales

		WebElement N1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	
		WebElement N2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		
		WebElement N3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		
		WebElement N4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		
		
		// Then we will check that Total Direct Manpower is counting correct or not.....
		System.out.println("All the data is counting correctly");
		
		Thread.sleep(2000);
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<	
		
		// Then fill all the detils in Indirect & Contractual Manpower on New Car Sales.......
		
		WebElement N5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		
		WebElement N6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		
		WebElement N7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		
		WebElement N8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		
		WebElement N9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
		
		WebElement N10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		
		WebElement N11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	
		WebElement N12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
		
		WebElement N13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		
		WebElement N14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
		
		WebElement N15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
		
		WebElement N16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
		
		WebElement N17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
		
		WebElement N18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
		
		WebElement N19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		
		WebElement N20 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
		
		WebElement N21 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
		
///////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////////////////////////////////
		
         // Then fill the all data 
         Thread.sleep(1000);

           String[] Data = {"FGFFS"};
           Thread.sleep(2000);



   // Through each web element
     for (WebElement element : new WebElement[] {N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21}) 


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
     
     Thread.sleep(1000);
     
     Actions actions23 = new Actions(driver);
     actions23.sendKeys(Keys.PAGE_UP).perform();

///////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////////////////////////////////
		

     Thread.sleep(4000);
	
	
	
	// Then click on the MSGA Option
	driver.findElement(By.xpath("(//*[contains(text(),\"MSGA\")])[2]")).click();
	Thread.sleep(3000);
	// Then we will fill the details in Accessory on direct manpower
	
	WebElement N22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	
	WebElement N23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement N24 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	
	// then we will fill the detais in Back office / Support staff
	WebElement N25 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	
	// then we will fill the correct details in Housekeeping Staff
	WebElement N26 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	// To save all the data we will click on the save button....
	
     
          // Then fill the all data 
           

            String[] Data2 = {"DAFASF"};
                Thread.sleep(2000);



             // Through each web element
                 for (WebElement element : new WebElement[] {N22,N23,N24,N25,N26}) 


                    // Send  data
                for (String data : Data2) 
                       {

                sendingData1( element, data);

                   }

                  //Save data
                     Thread.sleep(1000);
                    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
                        Thread.sleep(2000);
                          driver.findElement(By.cssSelector("[class=\"save\"]")).click();

                          
    //////////////////////////////////////////////////////////////////////////////////////

          			    Thread.sleep(4000);
          		// the click on the Workshop /Bodyshop/PDI

          				driver.findElement(By.cssSelector("[id=\"mat-tab-label-0-2\"]")).click();

          		//Direct Manpower  /Operation Head
          				Thread.sleep(4000);

          				WebElement N27 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
          				WebElement N28 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
          				
          		// Workshop		
          				WebElement N29 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
          				WebElement N30 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));	
          				WebElement N40 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
          				WebElement N41 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
          				WebElement N42 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
          				WebElement N43 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
          				WebElement N44 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
          				WebElement N45 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
          				WebElement N46 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
          				WebElement N47 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
          				
          				WebElement N48 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
          				WebElement N49 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
          				WebElement N50 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
          				WebElement N51 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
          				
          				WebElement N52 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
          				WebElement N53 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
          				WebElement N54 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
          				WebElement N55 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
          				WebElement N56 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
          				WebElement N57 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
          				WebElement N58 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
          				WebElement N59 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
          				
          				WebElement N60 = driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
          				WebElement N61 = driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
          				WebElement N62 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
          				WebElement N63 = driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
          				WebElement N64 = driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
          				WebElement N65 = driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
          				WebElement N66 = driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
          				WebElement N67 = driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
          				WebElement N68 = driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
          				WebElement N69 = driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
          				WebElement N70 = driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
          				WebElement N71 = driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
          				
          				WebElement N72 = driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
          				WebElement N73 = driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
          				WebElement N74 = driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
          				WebElement N75 = driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
          				WebElement N76 = driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
          				WebElement N77 = driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
          				WebElement N78 = driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
          		
          				Thread.sleep(2000);
          				

          				
          	          // Then fill the all data 
          	           

          	            String[] Data3 = {"sdfsd"};
          	                Thread.sleep(2000);



          	             // Through each web element
          	                 for (WebElement element : new WebElement[] {N27,N28,N29,N30,N40,N41,N42,N43,N44,N45,N46,N47,N48,N49,N50,N51,N52,N53,N54,N55,N56,N57,N58,N59,N60,N61,N62,N63,N64,N65,N66,N67,N68,N69,N70,N71,N72,N73,N74,N75,N76,N77,N78}) 


          	                    // Send  data
          	                for (String data : Data3) 
          	                       {

          	                sendingData1( element, data);

          	                   }

          	                  //Save data
          	                     Thread.sleep(1000);
          	                    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
          	                        Thread.sleep(2000);
          	                          driver.findElement(By.cssSelector("[class=\"save\"]")).click();

          	                        Thread.sleep(2000);
          	                          
          	                        Actions actions1 = new Actions(driver);
          	      			    actions1.sendKeys(Keys.PAGE_UP).perform();
          	      			     Thread.sleep(1000);
          	      			     
          	      			     Actions actions12 = new Actions(driver);
          	      				    actions12.sendKeys(Keys.PAGE_UP).perform();
          	      				     Thread.sleep(1000);
          	      				     
          	      				     Actions actions13 = new Actions(driver);
          	      					    actions13.sendKeys(Keys.PAGE_UP).perform();
          	                          
         //////////////////////////////////////////////////////////////////////////////////////
          	                        
          	      					    

          	      				     // Then click on the Spares
          	      				     
          	      				    Thread.sleep(4000);
          	      				    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-3\"]")).click();
          	      				    Thread.sleep(4000);
          	      		
          	      				    WebElement N79 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
          	      					WebElement N80 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
          	      					WebElement N81 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
          	      					WebElement N82 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
          	      					WebElement N83 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
          	      					WebElement N84 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
          	      					Thread.sleep(2000);
          	      									    
          	                
          	      				
          	          	          // Then fill the all data 
          	          	           

             String[] Data4 = {"dfsdfs"};
          	  Thread.sleep(2000);



          	  // Through each web element
          for (WebElement element : new WebElement[] {N79,N80,N81,N82,N83,N84}) 


          	      // Send  data
             for (String data : Data4) 
             {
                sendingData1( element, data);

          	          	                   }
                       
          //Save data
            Thread.sleep(1000);
           driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
               Thread.sleep(2000);
                 driver.findElement(By.cssSelector("[class=\"save\"]")).click();

                
     ////////////////////////////////////////////////////////////////////////////////////////////////////////            
                 
              // then click on the True value 
 			    Thread.sleep(4000);
 			    
 			    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-4\"]")).click();
 			    Thread.sleep(4000);
 			    
 			    WebElement N85 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
 				WebElement N86 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
 				WebElement N87 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
 				WebElement N88 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
 				WebElement N89 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
 				WebElement N90 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
 				 WebElement N91 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
 					WebElement N92 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
 					WebElement N93 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
 					WebElement N94 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
 					WebElement N95 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
 					WebElement N96 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
 					  WebElement N97 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
 						WebElement N98 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
 						WebElement N99 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
 						WebElement N100 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
 						WebElement N101 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
 						WebElement N102 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
 						
 						Thread.sleep(1000);        
	
 	    				
	          	          // Then fill the all data 
	          	           

   String[] Data5 = {"dfddd"};
	  



	  // Through each web element
for (WebElement element : new WebElement[] {N85,N86,N87,N88,N89,N90,N91,N92,N93,N94,N95,N96,N97,N98,N99,N100,N101,N102}) 


	      // Send  data
   for (String data : Data5) 
   {
      sendingData1( element, data);
      
	          	                   }	                          
//Save data

  Thread.sleep(1000);
 driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
     Thread.sleep(2000);
       driver.findElement(By.cssSelector("[class=\"save\"]")).click();
       
       
       Thread.sleep(4000);
	    Actions actions16 = new Actions(driver);
	     actions16.sendKeys(Keys.PAGE_UP).perform();
	     


      
////////////////////////////////////////////////////////////////////////////////////////////////////////	
 						
	
	  // Then click on the Maruti Insurance Renewal
			
		 Thread.sleep(4000);
		    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-5\"]")).click();
		    Thread.sleep(4000);
		    
		WebElement N103 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		WebElement N104 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		WebElement N105 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		WebElement N106 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		WebElement N107 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		WebElement N108 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		
       
       
		Thread.sleep(2000);        
		
			
          // Then fill the all data 
           

String[] Data6 = {"-dfg"};




    // Through each web element
     for (WebElement element : new WebElement[] {N103,N104,N105,N106,N107,N108}) 


      // Send  data
      for (String data : Data6) 
    {
       sendingData1( element, data);

                   }
    
            //Save data
          Thread.sleep(1000);
           driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
             Thread.sleep(2000);
            driver.findElement(By.cssSelector("[class=\"save\"]")).click();

       /////////////////////////////////////////////////////////////////////////////////////////
       
         // click on the Maruti Driving School
			
			 Thread.sleep(4000);
			    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-6\"]")).click();
			    Thread.sleep(4000);

			WebElement N109 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
			WebElement N110 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
			WebElement N111 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
			WebElement N112 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
			
			Thread.sleep(2000);
			
			
			
			
			
	          // Then fill the all data 
	           

	String[] Data7 = {"fdsfds"};
	



	    // Through each web element
	     for (WebElement element : new WebElement[] {N109,N110,N111,N112}) 


	      // Send  data
	      for (String data : Data7) 
	    {
	       sendingData1( element, data);

	                   }
	    
	            //Save data
	          Thread.sleep(1000);
	           driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	             Thread.sleep(2000);
	            driver.findElement(By.cssSelector("[class=\"save\"]")).click();
			
			///////////////////////////////////////////////////////////////////////////////////////
	            
	            
	         // click on the Corporate Office / Common Manpower
				 Thread.sleep(4000);
				    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-7\"]")).click();
				    Thread.sleep(3000);
				
				WebElement N113 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
					WebElement N114 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
					WebElement N115 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
					WebElement N116 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
					
					WebElement N117 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
					
					WebElement N118 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
					  WebElement N119 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
						WebElement N120 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
						WebElement N121 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
						WebElement N122 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
						
						WebElement N123 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
						WebElement N124 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
						  WebElement N125 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
							WebElement N126 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
							WebElement N127 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
							WebElement N128 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
							WebElement N129 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
							WebElement N130 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
				

							
							Thread.sleep(2000);
						
					          // Then fill the all data 
					           

					String[] Data8 = {"gfsg"};
					



					    // Through each web element
					     for (WebElement element : new WebElement[] {N113,N114,N113,N114,N115,N116,N117,N118,N119,N120,N121,N122,N123,N124,N125,N126,N127,N128,N129,N130}) 


					      // Send  data
					      for (String data : Data8) 
					    {
					       sendingData1( element, data);

					                   }
					    
					            //Save data
					          Thread.sleep(1000);
					           driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
					             Thread.sleep(2000);
					            driver.findElement(By.cssSelector("[class=\"save\"]")).click();
							
	            
       
	}
                          
                                 
                          
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&                          
			   		    							    							
	private static void sendingData1(WebElement element, String data) throws InterruptedException {
		//clear existing data
		element.clear();
		
		//send new data
		element.sendKeys(data);
		
		// We will go for conditional methods
		
		Methods_of_conditions.sendData1(element, data);
		
		
	}}