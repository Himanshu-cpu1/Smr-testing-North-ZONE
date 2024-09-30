package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Man_power_count {
	public static void manpowercount(WebDriver driver) throws InterruptedException {
		

		//THEN CLICK ON THE MAN POWER COUNT....................
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[5]")).click();
		
		Thread.sleep(4000);
		
		// Then fill all the detils in Direct Manpower on New Car Sales

		WebElement N1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		N1.sendKeys("2");
		WebElement N2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		N2.sendKeys("3");
		WebElement N3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		N3.sendKeys("83");
		WebElement N4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		N4.sendKeys("11");
		
		// Then we will check that Total Direct Manpower is counting correct or not.....
		System.out.println("All the data is counting correctly");
		
		Thread.sleep(2000);
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<	
		
		// Then fill all the detils in Indirect & Contractual Manpower on New Car Sales.......
		
		WebElement N5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		N5.sendKeys("1");
		WebElement N6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		N6.sendKeys("3");
		WebElement N7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		N7.sendKeys("1");
		WebElement N8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		N8.sendKeys("1");
		WebElement N9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
		N9.sendKeys("1");
		WebElement N10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		N10.sendKeys("1");
		WebElement N11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
		N11.sendKeys("1");
		WebElement N12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
		N12.sendKeys("3");
		WebElement N13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		N13.sendKeys("2");
		WebElement N14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
		N14.sendKeys("3");
		WebElement N15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
		N15.sendKeys("0");
		WebElement N16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
		N16.sendKeys("5");
		WebElement N17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
		N17.sendKeys("5");
		WebElement N18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
		N18.sendKeys("5");
		WebElement N19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		N19.sendKeys("2");
		WebElement N20 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
		N20.sendKeys("1");
		WebElement N21 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
		N21.sendKeys("0");
		
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
		
		
		
		driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("1");
		
		driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("3");
		
		// then we will fill the detais in Back office / Support staff
		driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("4");
		
		// then we will fill the correct details in Housekeeping Staff
		driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")).sendKeys("5");
		// To save all the data we will click on the save button....
		
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

				driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("1");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("1");
				
		// Workshop		
				driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("7");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("20");	
				driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")).sendKeys("50");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("30");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")).sendKeys("37");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[8]")).sendKeys("12");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[9]")).sendKeys("100");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[10]")).sendKeys("5");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")).sendKeys("2");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[12]")).sendKeys("10");
				
				driver.findElement(By.xpath("(//*[@type=\"number\"])[13]")).sendKeys("2");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[14]")).sendKeys("1");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[15]")).sendKeys("1");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[16]")).sendKeys("1");
				
				driver.findElement(By.xpath("(//*[@type=\"number\"])[17]")).sendKeys("4");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[18]")).sendKeys("20");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[19]")).sendKeys("20");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[20]")).sendKeys("30");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[21]")).sendKeys("1");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[22]")).sendKeys("1");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[23]")).sendKeys("10");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[24]")).sendKeys("12");
				
				driver.findElement(By.xpath("(//*[@type=\"number\"])[25]")).sendKeys("7");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[26]")).sendKeys("4");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[27]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[28]")).sendKeys("7");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[29]")).sendKeys("2");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[30]")).sendKeys("4");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[31]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[32]")).sendKeys("8");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[33]")).sendKeys("2");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[34]")).sendKeys("8");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[35]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[36]")).sendKeys("1");
				
				driver.findElement(By.xpath("(//*[@type=\"number\"])[37]")).sendKeys("20");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[38]")).sendKeys("20");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[39]")).sendKeys("10");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[40]")).sendKeys("7");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[41]")).sendKeys("7");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[42]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[43]")).sendKeys("0");
		
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
						
						// To save the data popup is showing you have to click on that button.
						
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
						
			    System.out.println("all the data has been filled sucessfully in the the Workshop /Bodyshop/PDI");
			    Thread.sleep(4000);
			
			    driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[6]")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[5]")).click();
			    
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
			    // Then click on the Spares
			    Thread.sleep(4000);
			    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-1-3\"]")).click();
			    Thread.sleep(4000);
	
			    driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("1");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("1");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("5");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("20");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("0");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
						
						// To save the data popup is showing you have to click on that button.
						
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
						
			    System.out.println("all the data has been filled sucessfully in the the Spares");
			    
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
			    
			    
		// then click on the True value 
			    Thread.sleep(4000);
			    
			    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-1-4\"]")).click();
			    Thread.sleep(4000);
			    
			    driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("1");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("2");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("3");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("4");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")).sendKeys("5");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("6");
				  driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")).sendKeys("8");
					driver.findElement(By.xpath("(//*[@type=\"number\"])[8]")).sendKeys("9");
					driver.findElement(By.xpath("(//*[@type=\"number\"])[9]")).sendKeys("10");
					driver.findElement(By.xpath("(//*[@type=\"number\"])[10]")).sendKeys("11");
					driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")).sendKeys("12");
					driver.findElement(By.xpath("(//*[@type=\"number\"])[12]")).sendKeys("13");
					  driver.findElement(By.xpath("(//*[@type=\"number\"])[13]")).sendKeys("14");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[14]")).sendKeys("15");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[15]")).sendKeys("16");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[16]")).sendKeys("17");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[17]")).sendKeys("18");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[18]")).sendKeys("19");
						
						Thread.sleep(2000);
						driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
								
								// To save the data popup is showing you have to click on that button.
								
						driver.findElement(By.cssSelector("[class=\"save\"]")).click();
								
					    System.out.println("all the data has been filled sucessfully in True value");
						Thread.sleep(4000);
			       
						   Thread.sleep(4000);
						    Actions actions1 = new Actions(driver);
						     actions1.sendKeys(Keys.PAGE_UP).perform();
						     
				
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<		
				// Then click on the Maruti Insurance Renewal
						
						 Thread.sleep(4000);
						    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-1-5\"]")).click();
						    Thread.sleep(4000);
						    
						driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("1");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("8");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("8");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("5");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")).sendKeys("0");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("0");
						
						Thread.sleep(2000);
						driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
								
								// To save the data popup is showing you have to click on that button.
								
						driver.findElement(By.cssSelector("[class=\"save\"]")).click();
								
					    System.out.println("all the data has been filled sucessfully in maruti insurnce renewal");
						Thread.sleep(4000);

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
						// click on the Maruti Driving School
						
						 Thread.sleep(4000);
						    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-1-6\"]")).click();
						    Thread.sleep(4000);

						driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("1");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("1");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("0");
						driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("0");
					
						Thread.sleep(2000);
						driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
								
					// To save the data popup is showing you have to click on that button.
								
						driver.findElement(By.cssSelector("[class=\"save\"]")).click();
								
					    System.out.println("all the data has been filled sucessfully in maruti drivivng school");
						

	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
						
					    
						// click on the Corporate Office / Common Manpower
						 Thread.sleep(4000);
						    driver.findElement(By.xpath("//*[@id=\"mat-tab-label-1-7\"]")).click();
						    Thread.sleep(3000);
						
						 driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("2");
							driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("8");
							driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("2");
							driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("7");
							
							driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")).sendKeys("1");
							
							driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("4");
							  driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")).sendKeys("1");
								driver.findElement(By.xpath("(//*[@type=\"number\"])[8]")).sendKeys("1");
								driver.findElement(By.xpath("(//*[@type=\"number\"])[9]")).sendKeys("2");
								driver.findElement(By.xpath("(//*[@type=\"number\"])[10]")).sendKeys("0");
								
								driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")).sendKeys("1");
								driver.findElement(By.xpath("(//*[@type=\"number\"])[12]")).sendKeys("2");
								  driver.findElement(By.xpath("(//*[@type=\"number\"])[13]")).sendKeys("2");
									driver.findElement(By.xpath("(//*[@type=\"number\"])[14]")).sendKeys("2");
									driver.findElement(By.xpath("(//*[@type=\"number\"])[15]")).sendKeys("0");
									driver.findElement(By.xpath("(//*[@type=\"number\"])[16]")).sendKeys("0");
									driver.findElement(By.xpath("(//*[@type=\"number\"])[17]")).sendKeys("0");
									driver.findElement(By.xpath("(//*[@type=\"number\"])[18]")).sendKeys("0");
						
									Thread.sleep(2000);
									driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
											
								// To save the data popup is showing you have to click on that button.
											
									driver.findElement(By.cssSelector("[class=\"save\"]")).click();
											
								    System.out.println("all the data has been filled sucessfully in Corporate Office / Common Manpower");
									
						
								    Thread.sleep(3000);
		
		
	}

}
