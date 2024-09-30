package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCar {
	
	static void NewCar_Page(WebDriver driver) throws InterruptedException  {
		
		//click on New Car 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();  
        Thread.sleep(2000);
        
        System.out.println("........................... New Car.................................. ");
        System.out.println("......................................................................................... ");
        
//		//clear data first
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//		Thread.sleep(2000);
		
		//To check the value of auto populated cells is correctly auto populated or not.
		//Navigate to stock sheet
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[2]")).click();
		Thread.sleep(2000);
		WebElement QS1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")); // Adjust locator
		Thread.sleep(2000);
        String quantity1 = QS1.getAttribute("value"); // Or another attribute name   
        System.out.println("Quantity- Auto populated cell in Stock Sheet: "+ quantity1);
        
        WebElement AS1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
        Thread.sleep(2000);
        String amount1 = AS1.getAttribute("value");
        System.out.println("New Car Amount- Auto populated cell in Stock Sheet: "+amount1);
        
        WebElement AS2= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
        Thread.sleep(2000);
        String amount3 = AS2.getAttribute("value");
        System.out.println("Margin Amount- Auto populated cell in Stock Sheet: "+amount3);
        
        WebElement AS3= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
        Thread.sleep(2000);
        String amount5= AS3.getAttribute("value");
        System.out.println("DRF Amount- Auto populated cell in Stock Sheet: "+amount5);
        
        WebElement AS4= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
        Thread.sleep(2000);
        String amount7= AS4.getAttribute("value");
        System.out.println("Total Discount- Auto populated cell in Stock Sheet: "+amount7);
        
        //Navigate to New Car again        
        Thread.sleep(4000);
        WebElement C = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")); // Adjust locator
        Thread.sleep(1000);
        C.click();
        Thread.sleep(1000);
                 
        WebElement QN1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // Adjust locator
                            
        // Get the attribute value from the second module's web element
          
        String quantity2 = QN1.getAttribute("value"); // Or another attribute name

       System.out.println("Quantity- Auto populated cell in New Car: "+ quantity2);
          
        if(quantity2.equals(quantity1)) 
          {
            System.out.println("Valid: "+quantity2);          	
          }
        else 
          {
          	System.out.println("Invalid: "+quantity2);          	          	          	
          }
        
        WebElement AN1= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
        String amount2= AN1.getAttribute("value");
        System.out.println("New Car Amount- Auto populated cell in New Car: "+ amount2);
        if(amount2.equals(amount1)) 
        {
          System.out.println("Valid: "+amount2);          	
        }
      else 
        {
        	System.out.println("Invalid: "+amount2);          	          	          	
        }
        
        WebElement AN2= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
        String amount4= AN2.getAttribute("value");
        System.out.println("Margin Amount- Auto populated cell in New Car: "+ amount4);
        if(amount4.equals(amount3)) 
        {
          System.out.println("Valid: "+amount4);          	
        }
      else 
        {
        	System.out.println("Invalid: "+amount4);          	          	          	
        }
        
        WebElement AN3= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
        String amount6= AN3.getAttribute("value");
      System.out.println("DRF Amount- Auto populated cell in New Car: "+ amount6);
        if(amount6.equals(amount5)) 
        {
          System.out.println("Valid: "+amount6);          	
        }
      else 
        {
        	System.out.println("Invalid: "+amount6);          	          	          	
        }
        
        WebElement AN4= driver.findElement(By.xpath("(//*[@type=\"text\"])[51]"));
        String amount8= AN4.getAttribute("value");
        System.out.println("Total Discount- Auto populated cell in New Car: "+ amount8);
        if(amount8.equals(amount7)) 
        {
          System.out.println("Valid: "+amount8);          	
        }
      else 
        {
        	System.out.println("Invalid: "+amount8);          	          	          	
        }
        							
		//New Car elements of Income	
		WebElement n1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); //Quantity auto populate from stock		
		WebElement n2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")); //amount auto populate from stock
		WebElement n3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")); //amount auto populate from stock
		WebElement n4= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")); 
		WebElement n5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")); //amount auto populate from stock
		WebElement n6= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
		WebElement n7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
		WebElement n8= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
		WebElement n9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
		WebElement n10= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
		WebElement n11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
		WebElement n12= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
		WebElement n13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
		WebElement n14= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
		WebElement n15= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
		WebElement n16= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
		WebElement n17= driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
		WebElement n18= driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
		WebElement n19= driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
		WebElement n20= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
		WebElement n21= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
		WebElement n22= driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
		WebElement n23= driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
		WebElement n24= driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
		WebElement n25= driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
		WebElement n26= driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
		WebElement n27= driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
		WebElement n28= driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
		WebElement n29= driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
		WebElement n30= driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
		WebElement n31= driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
		WebElement n32= driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
		WebElement n33= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
		WebElement n34= driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
		WebElement n35= driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
		WebElement n36= driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
		WebElement n37= driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
		WebElement n38= driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
		WebElement n39= driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
		WebElement n40= driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
		WebElement n41= driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
		WebElement n42= driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
		WebElement n43= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
		WebElement n44= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
		WebElement n45= driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
		WebElement n46= driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
		WebElement n47= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
		WebElement n72= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));  //total new car income
		WebElement n73= driver.findElement(By.xpath("(//*[@type=\"text\"])[73]")); //per new car of [72]		
		 
		//send values- Income tab
		Thread.sleep(3000);
//		n7.sendKeys("5000909");
//		n9.sendKeys("4009894");
//		n11.sendKeys("4008797");
//		n13.sendKeys("4007897");
//		n15.sendKeys("4009897");
//		n17.sendKeys("4004564");
//		n19.sendKeys("4004567");
//		n21.sendKeys("4007659");
//		n23.sendKeys("4009866");
//		n25.sendKeys("4007654");
//		n26.sendKeys("4007467");
//		n28.sendKeys("4006487");
//		n29.sendKeys("9008965");
//		n31.sendKeys("40037864");
//		n32.sendKeys("4008856");
//		n34.sendKeys("9006786");
//		n35.sendKeys("40038787");
//		n37.sendKeys("4007777");
//		n38.sendKeys("90039999");
//		n40.sendKeys("4004343");
//		n42.sendKeys("4003333");
//		n44.sendKeys("3233232");
//		n46.sendKeys("4001313");
		
		//convert to long
	    double nc1= Double.parseDouble(n1.getAttribute("value"));		
		long nc3= Long.parseLong(n3.getAttribute("value"));		
		long nc5= Long.parseLong(n5.getAttribute("value"));		
		long nc7= Long.parseLong(n7.getAttribute("value"));		
		long nc9= Long.parseLong(n9.getAttribute("value"));		
		long nc11= Long.parseLong(n11.getAttribute("value"));		
		long nc13= Long.parseLong(n13.getAttribute("value"));		
		long nc15= Long.parseLong(n15.getAttribute("value"));		
		long nc17= Long.parseLong(n17.getAttribute("value"));		
		long nc19= Long.parseLong(n19.getAttribute("value"));		
		long nc21= Long.parseLong(n21.getAttribute("value"));		
		long nc23= Long.parseLong(n23.getAttribute("value"));				
		long nc26= Long.parseLong(n26.getAttribute("value"));		
		long nc29= Long.parseLong(n29.getAttribute("value"));		
		long nc32= Long.parseLong(n32.getAttribute("value"));		
		long nc35= Long.parseLong(n35.getAttribute("value"));		
		long nc38= Long.parseLong(n38.getAttribute("value"));		
		long nc40= Long.parseLong(n40.getAttribute("value"));		
		long nc42= Long.parseLong(n42.getAttribute("value"));		
		long nc44= Long.parseLong(n44.getAttribute("value"));		
		long nc46= Long.parseLong(n46.getAttribute("value"));		
		long nc72= Long.parseLong(n72.getAttribute("value"));
						
		//calculate>Per New Car>n3
		double expresult1= nc3/nc1;
		long roundedexp1= Math.round(expresult1);
				
		//get the value from automated cell
	 	long actresult1= Long.parseLong(n4.getAttribute("value"));
			  	
	 	//Verify if result is as expected
		if(actresult1==roundedexp1) 
		  {
			 System.out.println("New Car Margin: Per new car income formula cell displays correct value- PASS=  " +roundedexp1);  
		  }
		else
		  {
			 System.out.println("New Car Margin: Per new car income formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +roundedexp1);
		  }
		
		//calculate>Per New Car>n5
		double expresult2= nc5/nc1;
		long roundexp2= Math.round(expresult2);
						
		//get the value from automated cell
		long actresult2= Long.parseLong(n6.getAttribute("value"));
					  	
		//Verify if result is as expected
		if(actresult2==roundexp2) 
		  {
			System.out.println("Total DRF Amount: Per new car income formula cell displays correct value- PASS=  " +roundexp2);  
		  }
		else
		  {
			 System.out.println("Total DRF Amount: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp2);
		  }
		
		//calculate>Per New Car>n7
		double expresult3= nc7/nc1;
		long roundexp3= Math.round(expresult3);
								
		//get the value from automated cell
		long actresult3= Long.parseLong(n8.getAttribute("value"));
							  	
		//Verify if result is as expected
		if(actresult3==roundexp3) 
		  {
			System.out.println("Support received as Discount on MSIL Invoice: Per new car income formula cell displays correct value- PASS=  " +roundexp3);  
		  }
		else
		  {
			 System.out.println("Support received as Discount on MSIL Invoice: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp3);
		  }
		
		//calculate>Per New Car>n9
		double expresult4= nc9/nc1;
		long roundexp4= Math.round(expresult4);
										
		//get the value from automated cell
		long actresult4= Long.parseLong(n10.getAttribute("value"));
									  	
		//Verify if result is as expected
		if(actresult4==roundexp4) 
		  {
			System.out.println("Support credited: Per new car income formula cell displays correct value- PASS=  " +roundexp4);  
		  }
		else
		  {
			System.out.println("Support credited: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp4);
		  }
		
		//calculate>Per New Car>n11
		double expresult5= nc11/nc1;
		long roundexp5= Math.round(expresult5);
												
		//get the value from automated cell
		long actresult5= Long.parseLong(n12.getAttribute("value"));
											  	
		//Verify if result is as expected
		if(actresult5==roundexp5) 
		  {
			System.out.println("MAC/NAC: Per new car income formula cell displays correct value- PASS=  " +roundexp5);  
		  }
		else
		  {
			System.out.println("MAC/NAC: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp5);
		  }
		
		//calculate>Per New Car>n13
		double expresult6= nc13/nc1;
		long roundexp6= Math.round(expresult6);
														
		//get the value from automated cell
		long actresult6= Long.parseLong(n14.getAttribute("value"));
													  	
		//Verify if result is as expected
		if(actresult6==roundexp6) 
		  {
			System.out.println("Trade Discount: Per new car income formula cell displays correct value- PASS=  " +roundexp6);  
		  }
		else
		  {
			System.out.println("Trade Discount: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp6);
		  }
		
		//calculate>Per New Car>n15
		double expresult7= nc15/nc1;
		long roundexp7= Math.round(expresult7);
																
		//get the value from automated cell
		long actresult7= Long.parseLong(n16.getAttribute("value"));
															  	
		//Verify if result is as expected
		if(actresult7==roundexp7) 
		  {
			System.out.println("BSC/NSC Payout: Per new car income formula cell displays correct value- PASS=  " +roundexp7);  
		  }
		else
		  {
			System.out.println("BSC/NSC Payout: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp7);
		  }
		
		//calculate>Per New Car>n17
		double expresult8= nc17/nc1;
		long roundexp8= Math.round(expresult8);
																		
		//get the value from automated cell
		long actresult8= Long.parseLong(n18.getAttribute("value"));
																	  	
		//Verify if result is as expected
		if(actresult8==roundexp8) 
		  {
			System.out.println("Any other RO/ZO/HO: Per new car income formula cell displays correct value- PASS=  " +roundexp8);  
		  }
		else
		  {
		    System.out.println("Any other RO/ZO/HO: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp8);
		  }
		
		//calculate>Per New Car>n19
		double expresult9= nc19/nc1;
		long roundexp9= Math.round(expresult9);
																				
		//get the value from automated cell
		long actresult9= Long.parseLong(n20.getAttribute("value"));
																			  	
		//Verify if result is as expected
		if(actresult9==roundexp9) 
		  {
			System.out.println("Demo Vehicle Claims: Per new car income formula cell displays correct value- PASS=  " +roundexp9);  
		  }
		else
		  {
			 System.out.println("Demo Vehicle Claims: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp9);
		  }	
		
		//calculate>Per New Car>n21
		double expresult10= nc21/nc1;
		long roundexp10= Math.round(expresult10);
																						
		//get the value from automated cell
		long actresult10= Long.parseLong(n22.getAttribute("value"));
																					  	
		//Verify if result is as expected
		if(actresult10==roundexp10) 
		  {
			System.out.println("DGS&D Payout: Per new car income formula cell displays correct value- PASS=  " +roundexp10);  
		  }
		else
		  {
			System.out.println("DGS&D Payout: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL  = " +roundexp10);
		  }	
		
		//calculate>Per New Car>n23
		double expresult11= nc23/nc1;
		long roundexp11= Math.round(expresult11);
																								
		//get the value from automated cell
		long actresult11= Long.parseLong(n24.getAttribute("value"));
		
																							  	
		//Verify if result is as expected
		if(actresult11==roundexp11) 
		  {
			System.out.println("JASP Claims: Per new car income formula cell displays correct value- PASS=  " +roundexp11);  
		  }
		else
		  {
			System.out.println("JASP Claims: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp11);
		  }	
		
		//calculate>Per New Car>n26
		double expresult12= nc26/nc1;
		long roundexp12= Math.round(expresult12);
																										
		//get the value from automated cell
		long actresult12= Long.parseLong(n27.getAttribute("value"));
																									  	
		//Verify if result is as expected
		if(actresult12==roundexp12) 
		  {
			System.out.println("Finance Commission: Per new car income formula cell displays correct value- PASS=  " +roundexp12);  
		  }
		else
		  {
			System.out.println("Finance Commission: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp12);
		  }	
		
		//calculate>Per New Car>n29
		double expresult13= nc29/nc1;
		long roundexp13= Math.round(expresult13);
																												
		//get the value from automated cell
		long actresult13= Long.parseLong(n30.getAttribute("value"));
																											  	
		//Verify if result is as expected
		if(actresult13==roundexp13) 
		  {
			System.out.println("Insurance Commission: Per new car income formula cell displays correct value- PASS=  " +roundexp13);  
		  }
		else
		  {
			System.out.println("Insurance Commission: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp13);
		  }	
		
		//calculate>Per New Car>n32
		double expresult14= nc32/nc1;
		long roundexp14= Math.round(expresult14);
																														
		//get the value from automated cell
		long actresult14= Long.parseLong(n33.getAttribute("value"));
																													  	
		//Verify if result is as expected
		if(actresult14==roundexp14) 
		  {
			System.out.println("MSR: Per new car income formula cell displays correct value- PASS=  " +roundexp14);  
		  }
		else
		  {
			System.out.println("MSR: Per new car income formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +roundexp14);
		  }	
		
		//calculate>Per New Car>n35
		double expresult15= nc35/nc1;
		long roundexp15= Math.round(expresult15);
																																
		//get the value from automated cell
		long actresult15= Long.parseLong(n36.getAttribute("value"));
																															  	
		//Verify if result is as expected
		if(actresult15==roundexp15) 
		  {
			System.out.println("Extended Warranty Com: Per new car income formula cell displays correct value- PASS=  " +roundexp15);  
		  }
		else
		  {
			System.out.println("Extended Warranty Com: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp15);
		  }	
		
		//calculate>Per New Car>n38
		double expresult16= nc38/nc1;
		long roundexp16= Math.round(expresult16);
																																		
		//get the value from automated cell
		long actresult16= Long.parseLong(n39.getAttribute("value"));
																																	  	
		//Verify if result is as expected
		if(actresult16==roundexp16) 
		  {
			System.out.println("CCP Commission: Per new car income formula cell displays correct value- PASS=  " +roundexp16);  
		  }
		else
		  {
			System.out.println("CCP Commission: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp16);
		  }
		
		//calculate>Per New Car>n40
		double expresult17= nc40/nc1;
		long roundexp17= Math.round(expresult17);
																																				
		//get the value from automated cell
		long actresult17= Long.parseLong(n41.getAttribute("value"));
																																			  	
		//Verify if result is as expected
		if(actresult17==roundexp17) 
		  {
			System.out.println("Income from Issuance: Per new car income formula cell displays correct value- PASS=  " +roundexp17);  
		  }
		else
		  {
			System.out.println("Income from Issuance: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp17);
		  }
		
		//calculate>Per New Car>n42
		double expresult18= nc42/nc1;
		long roundexp18= Math.round(expresult18);
																																						
		//get the value from automated cell
		long actresult18= Long.parseLong(n43.getAttribute("value"));
																																					  	
		//Verify if result is as expected
		if(actresult18==roundexp18) 
		  {
			System.out.println("longerest Receipt from MSIL: Per new car income formula cell displays correct value- PASS=  " +roundexp18);  
		  }
		else
		  {
			System.out.println("longerest Receipt from MSIL: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp18);
		  }
		
		//calculate>Per New Car>n44
		double expresult19= nc44/nc1;
		long roundexp19= Math.round(expresult19);
																																								
		//get the value from automated cell
		long actresult19= Long.parseLong(n45.getAttribute("value"));
																																							  	
		//Verify if result is as expected
		if(actresult19==roundexp19) 
		  {
			System.out.println("Other income: Per new car income formula cell displays correct value- PASS=  " +roundexp19);  
		  }
		else
		  {
			System.out.println("Other income: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +roundexp19);
		  }
		
		//calculate>Per New Car>n46
		double expresult20= nc46/nc1;
		long roundexp20= Math.round(expresult20);
																																										
		//get the value from automated cell
		long actresult20= Long.parseLong(n47.getAttribute("value"));
																																									  	
		//Verify if result is as expected
		if(actresult20==roundexp20) 
		  {
			System.out.println("Any other Income: Per new car income formula cell displays correct value- PASS=  " +roundexp20);  
		  }
		else
		  {
			System.out.println("Any other Income: Per new car income formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp20);
		  }
		
		//calculate Total New Car Income [A]
		long expresult21= nc3+nc5+nc7+nc9+nc11+nc13+nc15+nc17+nc19+nc21
				         +nc23+nc26+nc29+nc32+nc35+nc38+nc40+nc42+nc44+nc46;
																																												
		//get the value from automated cell
		long actresult21= Long.parseLong(n72.getAttribute("value"));
																																											  	
		//Verify if result is as expected
		if(actresult21==expresult21) 
		  {
			System.out.println("Total New Car Income [A]: formula cell displays correct value- PASS=  " +expresult21);  
		  }
		else
		  {
			System.out.println("Total New Car Income [A]: formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult21);
		  }
		
		//calculate per new car income of [A]
		double expresult22= nc72/nc1;
		long roundexp22= Math.round(expresult22);
																																										
        //get the value from automated cell
		long actresult22= Long.parseLong(n73.getAttribute("value"));
																																									  	
        //Verify if result is as expected
        if(actresult22==roundexp22) 
          {
	         System.out.println("Per new car income of [A]: formula cell displays correct value- PASS=  " +roundexp22);  
          }
        else
          {
	         System.out.println("Per new car income of [A]: formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp22);
          }
        
      //To check the value of auto populated cells is correctly auto populated or not.
      //Navigate to Manpower Cost 
      Thread.sleep(3000);
      driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")).click();
      Thread.sleep(2000);
      WebElement AS5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]")); // Adjust locator
      Thread.sleep(2000);
      String amount9 = AS5.getAttribute("value"); // Or another attribute name   
      System.out.println("New Car Amount- Auto populated cell in Manpower Cost page: "+amount9);
      
      //Navigate to New Car again        
      Thread.sleep(4000);
      WebElement D = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")); // Adjust locator
      Thread.sleep(1000);
      D.click();
      Thread.sleep(1000);               
      WebElement AN5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[49]")); 
      
      // Get the attribute value from the second module's web element        
      String amount10 = AN5.getAttribute("value"); 
      System.out.println("Manpower Cost- Auto populated cell in New Car: "+amount10);        
      if(amount10.equals(amount9)) 
        {
          System.out.println("Valid: "+amount10);          	
        }
      else 
        {
        	System.out.println("Invalid: "+amount10);          	          	          	
        }
      
      //To check the value of auto populated cells is correctly auto populated or not.
      //Navigate to longerest cost page 
      Thread.sleep(3000);
      driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[4]")).click();
      Thread.sleep(2000);
      WebElement AS6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[41]")); // Adjust locator
      Thread.sleep(2000);
      String amount11 = AS6.getAttribute("value"); // Or another attribute name   
      System.out.println("Short term IC- Auto populated cell in longerest Cost page: "+amount11);
      
      //Navigate to New Car again        
      Thread.sleep(4000);
      WebElement E = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")); // Adjust locator
      Thread.sleep(1000);
      E.click();
      Thread.sleep(1000);
               
      WebElement AN6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[53]"));        
      String amount12 = AN6.getAttribute("value"); // Or another attribute name

      System.out.println("Short term IC- Auto populated cell in New Car page: "+amount12);
        
      if(amount12.equals(amount11)) 
        {
          System.out.println("Valid: "+amount12);          	
        }
      else 
        {
        	System.out.println("Invalid: "+amount12);          	          	          	
        }
      
      					
		//New Car elements of Expense
		WebElement n49= driver.findElement(By.xpath("(//*[@type=\"text\"])[49]"));
		WebElement n50= driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
		WebElement n51= driver.findElement(By.xpath("(//*[@type=\"text\"])[51]"));
		WebElement n52= driver.findElement(By.xpath("(//*[@type=\"text\"])[52]"));
		WebElement n53= driver.findElement(By.xpath("(//*[@type=\"text\"])[53]"));
		WebElement n54= driver.findElement(By.xpath("(//*[@type=\"text\"])[54]"));
		WebElement n55= driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
		WebElement n56= driver.findElement(By.xpath("(//*[@type=\"text\"])[56]"));
		WebElement n57= driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
		WebElement n58= driver.findElement(By.xpath("(//*[@type=\"text\"])[58]"));
		WebElement n59= driver.findElement(By.xpath("(//*[@type=\"text\"])[59]"));
		WebElement n60= driver.findElement(By.xpath("(//*[@type=\"text\"])[60]"));
		WebElement n61= driver.findElement(By.xpath("(//*[@type=\"text\"])[61]"));
		WebElement n62= driver.findElement(By.xpath("(//*[@type=\"text\"])[62]"));
		WebElement n63= driver.findElement(By.xpath("(//*[@type=\"text\"])[63]"));
		WebElement n64= driver.findElement(By.xpath("(//*[@type=\"text\"])[64]"));
		WebElement n65= driver.findElement(By.xpath("(//*[@type=\"text\"])[65]"));
		WebElement n66= driver.findElement(By.xpath("(//*[@type=\"text\"])[66]"));
		WebElement n67= driver.findElement(By.xpath("(//*[@type=\"text\"])[67]"));
		WebElement n68= driver.findElement(By.xpath("(//*[@type=\"text\"])[68]"));
		WebElement n69= driver.findElement(By.xpath("(//*[@type=\"text\"])[69]"));
		WebElement n70= driver.findElement(By.xpath("(//*[@type=\"text\"])[70]"));
		WebElement n78= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]")); //total new car expense
		WebElement n79= driver.findElement(By.xpath("(//*[@type=\"text\"])[79]")); //per new car of [78]
		WebElement n75= driver.findElement(By.xpath("(//*[@type=\"text\"])[75]"));
		WebElement n76= driver.findElement(By.xpath("(//*[@type=\"text\"])[76]"));
		
		//send values- Expense tab
		Thread.sleep(3000);
//		n55.sendKeys("500789");
//		n57.sendKeys("400987");
//		n59.sendKeys("400877");
//		n61.sendKeys("400878");
//		n63.sendKeys("400765");
//		n65.sendKeys("400675");
//		n67.sendKeys("700786");
//		n69.sendKeys("400333");
		
		//convert longo longegers
		long nc49= Long.parseLong(n49.getAttribute("value"));		
		long nc51= Long.parseLong(n51.getAttribute("value"));		
		long nc53= Long.parseLong(n53.getAttribute("value"));		
		long nc55= Long.parseLong(n55.getAttribute("value"));		
		long nc57= Long.parseLong(n57.getAttribute("value"));		
		long nc59= Long.parseLong(n59.getAttribute("value"));		
		long nc61= Long.parseLong(n61.getAttribute("value"));		
		long nc63= Long.parseLong(n63.getAttribute("value"));		
		long nc65= Long.parseLong(n65.getAttribute("value"));		
		long nc67= Long.parseLong(n67.getAttribute("value"));		
		long nc69= Long.parseLong(n69.getAttribute("value"));		
		long nc75= Long.parseLong(n75.getAttribute("value"));		
		long nc78= Long.parseLong(n78.getAttribute("value"));		
			
		//calculate per new car>n49
		double expresult23= nc49/nc1;
		long roundexp23= Math.round(expresult23);
																																												
	    //get the value from automated cell
		long actresult23= Long.parseLong(n50.getAttribute("value"));
																																											  	
		//Verify if result is as expected
		if(actresult23==roundexp23) 
		  {
		     System.out.println("Manpower Cost: Per new car formula cell displays correct value- PASS=  " +roundexp23);  
		  }
		 else
		  {
			 System.out.println("Manpower Cost: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp23);
		  }
		
		//calculate per new car>n51
		double expresult24= nc51/nc1;
		long roundexp24= Math.round(expresult24);
																																														
		//get the value from automated cell
		long actresult24= Long.parseLong(n52.getAttribute("value"));
																																													  	
	    //Verify if result is as expected
		if(actresult24==roundexp24) 
		  {
		    System.out.println("Total Discount: Per new car formula cell displays correct value- PASS=  " +roundexp24);  
		  }
		else
		  {
			 System.out.println("Total Discount: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp24);
		  }	
		
		//calculate per new car>n53
		double expresult25= nc53/nc1;
		long roundexp25= Math.round(expresult25);
																																																
		//get the value from automated cell
		long actresult25= Long.parseLong(n54.getAttribute("value"));
																																															  	
	   //Verify if result is as expected
		if(actresult25==roundexp25) 
		  {
		    System.out.println("Short term IC: Per new car formula cell displays correct value- PASS=  " +roundexp25);  
		  }
		else
		  {
			 System.out.println("Short term IC: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp25);
		  }
		
		//calculate per new car>n55
		double expresult26= nc55/nc1;
		long roundexp26= Math.round(expresult26);
																																																		
		//get the value from automated cell
		long actresult26= Long.parseLong(n56.getAttribute("value"));
																																																	  	
	    //Verify if result is as expected
		if(actresult26==roundexp26) 
		  {
			 System.out.println("Delivery Expenses: Per new car formula cell displays correct value- PASS=  " +roundexp26);  
		  }
		else
		  {
			 System.out.println("Delivery Expenses: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp26);
		  }		
		
		//calculate per new car>n57
		double expresult27= nc57/nc1;
		long roundexp27= Math.round(expresult27);
																																																				
		//get the value from automated cell
		long actresult27= Long.parseLong(n58.getAttribute("value"));
																																																			  	
	    //Verify if result is as expected
		if(actresult27==roundexp27) 
		  {
			 System.out.println("Fuel expenses: Per new car formula cell displays correct value- PASS=  " +roundexp27);  
		  }
		else
		  {
			 System.out.println("Fuel expenses: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp27);
		  }	
		
		//calculate per new car>n59
		double expresult28= nc59/nc1;
		long roundexp28= Math.round(expresult28);
																																																						
		//get the value from automated cell
		long actresult28= Long.parseLong(n60.getAttribute("value"));
																																																					  	
	    //Verify if result is as expected
		if(actresult28==roundexp28) 
		  {
			System.out.println("Advertisement: Per new car formula cell displays correct value- PASS=  " +roundexp28);  
		  }
		else
		  {
			 System.out.println("Advertisement: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp28);
		  }	
		
		//calculate per new car>n61
		double expresult29= nc61/nc1;
		long roundexp29= Math.round(expresult29);
																																																								
		//get the value from automated cell
		long actresult29= Long.parseLong(n62.getAttribute("value"));
																																																							  	
	    //Verify if result is as expected
		if(actresult29==roundexp29) 
		  {
			System.out.println("Hyperlocal Expense: Per new car formula cell displays correct value- PASS=  " +roundexp29);  
		  }
		else
		  {
			System.out.println("Hyperlocal Expense: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp29);
		  }	
		
		//calculate per new car>n63
		double expresult30= nc63/nc1;
		long roundexp30= Math.round(expresult30);
																																																										
		//get the value from automated cell
		long actresult30= Long.parseLong(n64.getAttribute("value"));
																																																									  	
	    //Verify if result is as expected
		if(actresult30==roundexp30) 
		  {
			System.out.println("Pool Lifting Charges: Per new car formula cell displays correct value- PASS=  " +roundexp30);  
		  }
		else
		  {
			System.out.println("Pool Lifting Charges: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp30);
		  }
		
		//calculate per new car>n65
		double expresult31= nc65/nc1;
		long roundexp31= Math.round(expresult31);
																																																												
		//get the value from automated cell
		long actresult31= Long.parseLong(n66.getAttribute("value"));
																																																											  	
	    //Verify if result is as expected
		if(actresult31==roundexp31) 
		  {
			System.out.println("DSA/DMA Commission: Per new car formula cell displays correct value- PASS=  " +roundexp31);  
	      }
		else
		  {
			System.out.println("DSA/DMA Commission: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp31);
		  }
		
		//calculate per new car>n67
		double expresult32= nc67/nc1;
		long roundexp32= Math.round(expresult32);
																																																														
		//get the value from automated cell
		long actresult32= Long.parseLong(n68.getAttribute("value"));
																																																													  	
	    //Verify if result is as expected
		if(actresult32==roundexp32) 
		  {
			System.out.println("Lease Rental: Per new car formula cell displays correct value- PASS=  " +roundexp32);  
		  }
		else
		  {
			System.out.println("Lease Rental: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp32);
		  }
		
		//calculate per new car>n69
		double expresult33= nc69/nc1;
		long roundexp33= Math.round(expresult33);		
																																																																
		//get the value from automated cell
		long actresult33= Long.parseLong(n70.getAttribute("value"));
																																																															  	
	    //Verify if result is as expected
		if(actresult33==roundexp33) 
		  {
			System.out.println("Any other Expense: Per new car formula cell displays correct value- PASS=  " +roundexp33);  
		  }
		else
		  {
			System.out.println("Any other Expense: Per new car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp33);
		  }
		
		//calculate Total New Car Direct Expense [B]
		long expresult34= nc49+nc51+nc53+nc55+nc57+nc59+nc61+nc63+nc65+nc67+nc69;
																																																																		
		//get the value from automated cell
		long actresult34= Long.parseLong(n78.getAttribute("value"));
																																																																	  	
	    //Verify if result is as expected
		if(actresult34==expresult34) 
		  {
			System.out.println("Total New Car Direct Expense [B]: formula cell displays correct value- PASS=  " +expresult34);  
		  }
		else
		  {
			System.out.println("Total New Car Direct Expense [B]: formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult34);
		  }
		
		//calculate Total New Car Direct Expense [B]
		double expresult35= nc78/nc1;
		long roundexp35= Math.round(expresult35);
																																																																				
		//get the value from automated cell
		long actresult35= Long.parseLong(n79.getAttribute("value"));
																																																																			  	
		//Verify if result is as expected
		if(actresult35==roundexp35) 
		  {
			System.out.println("Per new car expense of [B]: formula cell displays correct value- PASS=  " +roundexp35);  
		  }
		else
		  {
			System.out.println("Per new car expense of [B]: formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp35);
		  }
//............................................................................................................		
		//calculate Net Earning New car [A]-[B]
				long expresult36= nc72-nc78;
																																																																								
				//get the value from automated cell
				long actresult36= Long.parseLong(n75.getAttribute("value"));
																																																																							  	
				//Verify if result is as expected
				if(actresult36==expresult36)
				  {
					System.out.println("Net Earning New car [A]-[B]: formula cell displays correct value- PASS=  " +expresult36);  
				  }
				else
				  {
					System.out.println("Net Earning New car [A]-[B]: formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult36);
				  }
	//........................................................................................................			
		//calculate per new car of [A]-[B]
		double expresult37= nc75/nc1;
		long roundexp37= Math.round(expresult37);
																																																																								
		//get the value from automated cell
	    long actresult37= Long.parseLong(n76.getAttribute("value"));
																																																																							  	
		//Verify if result is as expected
		if(actresult37==roundexp37) 
		  {
			System.out.println("Per new car of [A]-[B]: formula cell displays correct value- PASS=  " +roundexp37);  
		  }
		else
		  {
			System.out.println("Per new car of [A]-[B]: formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundexp37);
		  }
				System.out.println(".........E..N..D........................................");
//		//save the data
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//		
	}


}
