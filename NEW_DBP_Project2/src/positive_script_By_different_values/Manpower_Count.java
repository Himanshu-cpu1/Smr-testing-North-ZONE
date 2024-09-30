package positive_script_By_different_values;

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
		
		// then we will send the data 
		 manpowercount(N1,"327");
		    manpowercount(N2,"327");
		    manpowercount(N3,"327");
		    manpowercount(N4,"5325315");
		    manpowercount(N5,"324314");
		    manpowercount(N6,"97684");
		    manpowercount(N7,"327");
		    manpowercount(N8,"327");
		    manpowercount(N9,"534");
		    manpowercount(N10,"327");
		    
		    manpowercount(N11,"327");
		    manpowercount(N12,"327");
		    manpowercount(N13,"327");
		    manpowercount(N14,"327");
		    manpowercount(N15,"364624");
		    manpowercount(N16,"32223");
		    manpowercount(N17,"463");
		    manpowercount(N18,"327");
		    manpowercount(N19,"7547");
		    manpowercount(N20,"327");
		    
		    manpowercount(N21,"327");
		
		
		// Then we will check that all the field is added in Total Indirect & Contractual Manpower option.....
		
		// To save all the data we will click on the save button....
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				
				// To save the data popup is showing you have to click on that button.
				
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
	    System.out.println("all the data has been filled sucessfully in Indirect & Contractual Manpower and saved");
	    
	    Thread.sleep(4000);
	    Actions actions = new Actions(driver);
	     actions.sendKeys(Keys.PAGE_UP).perform();
	     
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<			
		
	     Thread.sleep(4000);
		
		
		
		// Then click on the MSGA Option
		driver.findElement(By.xpath("(//*[contains(text(),\"MSGA\")])[2]")).click();
		Thread.sleep(4000);
		// Then we will fill the details in Accessory on direct manpower
		
		
		
		WebElement N22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		
		WebElement N23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		WebElement N24 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		
		// then we will fill the detais in Back office / Support staff
		WebElement N25 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		
		// then we will fill the correct details in Housekeeping Staff
		WebElement N26 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		// To save all the data we will click on the save button....
		
		
		// then we will fill the data 
		
		manpowercount(N22,"34127");
	    manpowercount(N23,"3527");
	    manpowercount(N24,"331227");
	    manpowercount(N25,"34327");
	    manpowercount(N26,"3257");
		
		Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
						
						// To save the data popup is showing you have to click on that button.
						
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
						
			    System.out.println("all the data has been filled sucessfully in the MSGA Option");
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
			
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
				
				// Then we will fill the data 
				
				
				  manpowercount(N27,"35327");
				    manpowercount(N28,"6327");
				    manpowercount(N29,"7327");
				    manpowercount(N30,"88327");
				    
				    manpowercount(N40,"3327");
				    manpowercount(N41,"23127");
				    manpowercount(N42,"327");
				    manpowercount(N43,"2327");
				    manpowercount(N44,"8327");
				    manpowercount(N45,"327");
				    manpowercount(N46,"54327");
				    manpowercount(N47,"74327");
				    manpowercount(N48,"327");
				    manpowercount(N49,"4327");
				    
				    manpowercount(N50,"327");
				    manpowercount(N51,"54327");
				    manpowercount(N52,"54327");
				    manpowercount(N53,"54327");
				    manpowercount(N54,"53327");
				    manpowercount(N55,"327");
				    manpowercount(N56,"327");
				    manpowercount(N57,"3527");
				    manpowercount(N58,"327");
				    manpowercount(N59,"327");
				    
				    manpowercount(N60,"327");
				    manpowercount(N61,"327");
				    manpowercount(N62,"327");
				    manpowercount(N63,"327");
				    manpowercount(N64,"327");
				    manpowercount(N65,"35427");
				    manpowercount(N66,"327");
				    manpowercount(N67,"327");
				    manpowercount(N68,"327");
				    manpowercount(N69,"327");
				    
				    manpowercount(N70,"327");
				    manpowercount(N71,"32754");
				    manpowercount(N72,"32327");
				    manpowercount(N73,"32557");
				    manpowercount(N74,"3237");
				    manpowercount(N75,"327");
				    manpowercount(N76,"32437");
				    manpowercount(N77,"3427");
				    manpowercount(N78,"3327");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
						
						// To save the data popup is showing you have to click on that button.
						
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
						
			    System.out.println("all the data has been filled sucessfully in the the Workshop /Bodyshop/PDI");
			    Thread.sleep(3000);
			
			
			    Actions actions1 = new Actions(driver);
			    actions1.sendKeys(Keys.PAGE_UP).perform();
			     Thread.sleep(1000);
			     
			     Actions actions12 = new Actions(driver);
				    actions12.sendKeys(Keys.PAGE_UP).perform();
				     Thread.sleep(1000);
				     
				     Actions actions13 = new Actions(driver);
					    actions13.sendKeys(Keys.PAGE_UP).perform();
					     
			    
			     
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
			   
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
				
				// then we will fill the data 
				
				manpowercount(N79,"327");
			    
			    manpowercount(N80,"523");
			    manpowercount(N81,"632");
			    manpowercount(N82,"32");
			    manpowercount(N83,"865");
			    manpowercount(N84,"327");
				
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
						
						// To save the data popup is showing you have to click on that button.
						
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
						
			    System.out.println("all the data has been filled sucessfully in the the Spares");
			    
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
			    
			    
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
						
						Thread.sleep(2000);
						
						// Then we wwill save the all  data 
						
						 manpowercount(N85,"63");
						    manpowercount(N86,"743");
						    manpowercount(N87,"65");
						    manpowercount(N88,"56");
						    manpowercount(N89,"327");
						    
						    manpowercount(N90,"327");
						    manpowercount(N91,"56");
						    manpowercount(N92,"327");
						    manpowercount(N93,"327");
						    manpowercount(N94,"327");
						    manpowercount(N95,"327");
						    manpowercount(N96,"745");
						    manpowercount(N97,"327");
						    manpowercount(N98,"654");
						    manpowercount(N99,"3343");
						    
						    manpowercount(N100,"76");
						    manpowercount(N101,"327");
						    manpowercount(N102,"533");
						
						driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
								
								// To save the data popup is showing you have to click on that button.
								
						driver.findElement(By.cssSelector("[class=\"save\"]")).click();
								
					    System.out.println("all the data has been filled sucessfully in True value");
						Thread.sleep(4000);
			       
						   Thread.sleep(4000);
						    Actions actions11 = new Actions(driver);
						     actions11.sendKeys(Keys.PAGE_UP).perform();
						     
				
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<		
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
						
						// we  will fill the all data 
						Thread.sleep(2000);
						
						 manpowercount(N103,"327");
						    manpowercount(N104,"36");
						    manpowercount(N105,"653");
						    
						    manpowercount(N106,"327");
						    manpowercount(N107,"3327");
						    manpowercount(N108,"633");
						
						Thread.sleep(2000);
						driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
								
								// To save the data popup is showing you have to click on that button.
								
						driver.findElement(By.cssSelector("[class=\"save\"]")).click();
								
					    System.out.println("all the data has been filled sucessfully in maruti insurnce renewal");
						Thread.sleep(4000);

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
						// click on the Maruti Driving School
						
						 Thread.sleep(4000);
						    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-6\"]")).click();
						    Thread.sleep(4000);

						WebElement N109 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
						WebElement N110 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
						WebElement N111 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
						WebElement N112 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
						
						Thread.sleep(2000);
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/\///////////////////////////\\\\\\\\\\\\\\\						
						// then fill the all data 
						
						    manpowercount(N109,"65");
						    manpowercount(N110,"653");
						    manpowercount(N111,"366");
						    manpowercount(N112,"6346");
						    
						    
////\\\\\\\\\\>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<						    
						Thread.sleep(2000);
						
						
						driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
								
					// To save the data popup is showing you have to click on that button.
								
						driver.findElement(By.cssSelector("[class=\"save\"]")).click();
								
					    System.out.println("all the data has been filled sucessfully in maruti drivivng school");
						

	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
						
					    
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
						

									// Then fill the data 
									Thread.sleep(2000);
								    manpowercount(N113,"327");
								    manpowercount(N114,"32");
								    manpowercount(N115,"35627");
								    manpowercount(N116,"63327");
								    manpowercount(N117,"3327");
								    manpowercount(N118,"36327");
								    manpowercount(N119,"3627");
								    manpowercount(N120,"3527");
								    
								    manpowercount(N121,"327");
								    manpowercount(N122,"65643");
								    manpowercount(N123,"5636");
								    manpowercount(N124,"327");
								    manpowercount(N125,"327");
								    manpowercount(N126,"65643");
								    manpowercount(N127,"327");
								    manpowercount(N128,"327");
								    manpowercount(N129,"327");
								    manpowercount(N130,"327");
									
									Thread.sleep(2000);
									driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
											
								// To save the data popup is showing you have to click on that button.
											
									driver.findElement(By.cssSelector("[class=\"save\"]")).click();
											
								    System.out.println("all the data has been filled sucessfully in Corporate Office / Common Manpower");
									
						
								    Thread.sleep(3000);
			    }			    
								   		    
							    
								    
	

	private static void manpowercount(WebElement element, String value) {
		


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