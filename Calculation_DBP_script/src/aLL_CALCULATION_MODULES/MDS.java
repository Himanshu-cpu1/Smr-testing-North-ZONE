package aLL_CALCULATION_MODULES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MDS {

	static void mds(WebDriver driver) throws InterruptedException  {
		
					
				// Then click on the MDS option on the left ....
				driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[8]")).click();
				Thread.sleep(3000);
		// /////////////////////////////////////////////////////////////////////////////////////////////////////
				//clear data first
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
			    Thread.sleep(2000);
				
		// Find the path of all the elements 
				Thread.sleep(1000);			
												
				WebElement mds_1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));//MDS Enrollment & Income	
				WebElement mds_2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));//MDS Enrollment & Income	
				WebElement mds_3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));//MDS Incentives							
				WebElement mds_4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));//Any other Income								
				WebElement mds_5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));	//Any other Expense (MDS only)	
				
				WebElement mds_6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));//Total MDS Income [A]
				WebElement mds_7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));	// Net Earning from MDS = [A] - [B]	
							
				WebElement mds_8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));// Total MDS Direct Expense [B]
				WebElement mds_9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));// Net Earning from MDS Enrollment
				WebElement mds_12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
				
				Thread.sleep(2000);
				
////////////////////////////////////////////////////////////////////////////////////////////////////////////
				// send the values 
				mds_1.sendKeys("4089088");
				mds_2.sendKeys("10566565");
				mds_3.sendKeys("206565");
				mds_4.sendKeys("10656565");
				mds_5.sendKeys("10566565");
				
////////////////////////////////////////////////////////////////////////////////////////////////////////
				// Convert all the values longo longegers
				double MD1 = Double.parseDouble(mds_1.getAttribute("value"));
				long MD2 = Long.parseLong(mds_2.getAttribute("value"));
				long MD3 = Long.parseLong(mds_3.getAttribute("value"));// ALL data we have to fill 
				long MD4 = Long.parseLong(mds_4.getAttribute("value"));
				long MD5 = Long.parseLong(mds_5.getAttribute("value"));
				
				long MD6 = Long.parseLong(mds_6.getAttribute("value"));//Total MDS Income [A]
				long MD7 = Long.parseLong(mds_7.getAttribute("value"));// Net Earning from MDS = [A] - [B]
				long MD8 = Long.parseLong(mds_8.getAttribute("value"));// Total MDS Direct Expense [B]
				double md88 =(long)MD8;
				long MD9 = Long.parseLong(mds_9.getAttribute("value"));// Net Earning from MDS Enrollment
				long MD12 = Long.parseLong(mds_12.getAttribute("value"));
	//////////////////////////////////////////////////////////////////////////////////////////////
								
				Thread.sleep(2000);				
	////////////////////////////////////////////////////////////////////////////////////////////
				// Then we put the calculation condition:
				long EXPECTED_Result_A=MD2+MD3+MD4;
				
				  if (MD6 == EXPECTED_Result_A ) {
			        	
			            System.out.println("Total MDS Income [A] calculation is CORRECT  =" + MD6 );
			                            
			        } else {
			        	System.out.println("Total MDS Income [A] calculation is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + MD6 );		        
			        }
				
	//.......................................................................................................
				  long EXPECTED_Result_B=MD5+MD9+MD12;
					
				  if (MD8 == EXPECTED_Result_B ) {
			        	
			            System.out.println("Total MDS Direct Expense [B] calculation is CORRECT  =" + MD8 );
			                            
			        } else {
			        	System.out.println("Total MDS Direct Expense [B] calculation is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + MD8 );			        
			        }
	//.......................................................................................................
		  long EXPECTED_Result_A_B=MD6-MD8;
					
				  if (MD7 == EXPECTED_Result_A_B ) {
			        	
			            System.out.println("Net Earning from MDS =[A] - [B] calculation is CORRECT  =" + MD7 );
			                            
			        } else {
			        	System.out.println("Net Earning from MDS =[A] - [B] calculation is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + MD7 );			        
			        }		
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				  //AUTOPOPULATED SHELLS
				  
				  
					Thread.sleep(3000);
//.......................................................................................................					
					//	click on the NEW cars to find the values
						
						driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[7]")).click();
						Thread.sleep(3000);
						
						//	Path of New Car Retail Sales In (NEW cars)
						
						WebElement NEW_cars_1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
						
					// convert longo longegers
						
						double N_cars1 = Long.parseLong(NEW_cars_1.getAttribute("value"));
						System.out.println("New Car Retail Sales In (NEW cars)  VALUE =  " + N_cars1 );	
						
						Thread.sleep(2000);
						
//..................................................................................................................
//.................................................................................................................						
		// then click on the Manpowercost
						
						driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[6]")).click();
						Thread.sleep(3000);	
						
		// find the path Of the  Maruti Driving School	OF Manpowercost	
						
		WebElement ManPOWER1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
		
		// convert longo long
		long MP1 = Long.parseLong(ManPOWER1.getAttribute("value"));
		System.out.println("Maruti Driving School	OF Manpowercost VALUES  = "  + MP1);	
		
	// .....................................................................................................
	//......................................................................................................
		Thread.sleep(3000);
		  // then click on the InterestCost and find the path of Total longerest Paid on ST Loans
		
		  driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[4]")).click();
		  Thread.sleep(3000);	
		
           // find the path Of the  Maruti Driving School	OF Manpowercost	
		
         WebElement InterestCost1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[47]"));

           // convert longo longegers
           long ICost1 = Long.parseLong(InterestCost1.getAttribute("value"));
            System.out.println("Total longerest Paid on ST Loans VALUES  = "  + ICost1);
		
	//.......................................................................................................
     //........................................................................................................
		
            Thread.sleep(3000);
						// click on the MDS
						driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[8]")).click();
						Thread.sleep(2000);
						
	////////////////////////////////////////////////////////////////////////////////////////////
						
			//path of the Autopopulated shells
		WebElement A1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		WebElement A2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));				
		WebElement A3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		WebElement A4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
		
		WebElement A5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		WebElement A6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));				
		WebElement A7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		WebElement A8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
		
		WebElement A9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		WebElement A10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));				
		WebElement A11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
		WebElement A12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
		
		// convert longo longegers
		long AP1 = Long.parseLong(A1.getAttribute("value"));
		long AP2 = Long.parseLong(A2.getAttribute("value"));
		long AP3 = Long.parseLong(A3.getAttribute("value"));
		long AP4 = Long.parseLong(A4.getAttribute("value"));
		long AP5 = Long.parseLong(A5.getAttribute("value"));
		long AP6 = Long.parseLong(A6.getAttribute("value"));
		long AP7 = Long.parseLong(A7.getAttribute("value"));
		long AP8 = Long.parseLong(A8.getAttribute("value"));
		long AP9 = Long.parseLong(A9.getAttribute("value"));
		long AP10 = Long.parseLong(A10.getAttribute("value"));
		long AP11 = Long.parseLong(A11.getAttribute("value"));
		long AP12 = Long.parseLong(A12.getAttribute("value"));
		
		//............................................................................................................	
			
						
			double expectedRESult1 = MD2/N_cars1;
			long roundedResult1 = Math.round(expectedRESult1);
			if(AP1==roundedResult1) {
				
				System.out.println("AUTOPOPULATED MDS Enrollment & Income[ Per New new car Income (Rs.)] VALID =  "  + AP1 );
			}else{
				
				System.out.println("AUTOPOPULATED MDS Enrollment & Income[ Per New new car Income (Rs.)]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + AP1);
				}
//........................................................................................................				
//..................................................................................................
			
			double expectedreSult2 = MD3/N_cars1 ;
			long roundedResult2 = Math.round(expectedreSult2);
			
			if(AP2==roundedResult2) {
				System.out.println("AUTOPOPULATED MDS Incentives[ Per New new car Income (Rs.)]  VALID  = "   +  AP2);
			}else{
				
				System.out.println("AUTOPOPULATEDMDS Incentives[ Per New new car Income (Rs.)]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + AP2   );
			}
										
	//.........................................................................	
						
		double expectedreSult3 = MD4/N_cars1 ;	
		long roundedResult3 = Math.round(expectedreSult3);
						
					if (AP3==roundedResult3){
						System.out.println("AUTOPOPULATED Any other Income [ Per New Car] VALID  = "  + AP3);								
				}else{
			
			System.out.println("AUTOPOPULATED Any other Income  [ Per New Car] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + AP3  );
							
				}
					
	//...................................................................................................
					
										
					double expectedreSult4 = MD9/N_cars1 ;	
					long roundedResult4 = Math.round(expectedreSult4);
					
					if (AP5==roundedResult4){
						System.out.println("AUTO-POPULATED  Manpower Cost (Salary & Incentives[ Per New Car/Expense ] is VALID  = "  + AP5);								
				}else{
			
			System.out.println("AUTO-POPULATED  Manpower Cost (Salary & Incentives[ Per New Car/Expense ] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + AP5  );
							
				}			
	//...........................................................................................
					
					
	double expectedreSult5 = MD12/N_cars1 ;	
	long roundedResult5 = Math.round(expectedreSult5);				
					if (AP7==roundedResult5){
						System.out.println("AUTO-POPULATED Short term longerest Cost(MDS) [ Per New Car/expense ] is VALID  = "  + AP7);								
				}else{
			
			System.out.println("AUTO-POPULATED Short term longerest Cost(MDS)  [ Per New Car/expense ] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + AP7  );
							
				}				
//...........................................................................................
					
	double expectedreSult6 = MD5/N_cars1 ;	
	long roundedResult6 = Math.round(expectedreSult6);
							
				if (AP8==roundedResult6){
				System.out.println("AUTO-POPULATED Per New Car [Any other Expense(MDS only)] is VALID  = "  + AP8);								
					}else{
							
				System.out.println("AUTO-POPULATED Per New Car [Any other Expense(MDS only)]  is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + AP8  );
											
					}			
//.......................................................................................................
				double expectedreSult7 = MD6/N_cars1 ;	
				long roundedResult7 = Math.round(expectedreSult7);
										
							if (AP9==roundedResult7){
							System.out.println("AUTO-POPULATED Total MDS Income [A] , Per New Car/INCOME ]  VALID  = "  + AP9);								
								}else{
										
							System.out.println("AUTO-POPULATED Total MDS Income [A] , Per New Car/INCOME ]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID =  "  + AP9  );
														
								}
				
			//...............................................................................................................
							double expectedreSult8 = MD7/N_cars1 ;	
							long roundedResult8 = Math.round(expectedreSult8);
													
										if (AP10==roundedResult8){
										System.out.println("AUTO-POPULATED Total MDS Income [A]-[B] ,Per New Car/INCOME ]  VALID  = "  + AP10);								
											}else{
													
										System.out.println("AUTO-POPULATED Total MDS Income [A]-[B] , Per New Car/INCOME ] >>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + AP10  );
																	
											}
		//........................................................................................................
				   double expectedreSult9 = MD8/N_cars1 ;	
					long roundedResult9 = Math.round(expectedreSult9);
																
					if (AP11==roundedResult9){
					System.out.println("AUTO-POPULATED Total MDS Income [B] ,Per New Car/Expense ]  VALID  = "  + AP11);								
								}else{
																
				System.out.println("AUTO-POPULATED Total MDS Income [B] , Per New Car/expense ] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + AP11  );
																				
								}		
					
		//............................................................................................
				 // Manpower Cost (Salary & Incentive) Amount (Rs.)
													
				  if (MP1 == AP4 ) {
												        	
					  System.out.println("Manpower Cost (Salary & Incentive) Amount (Rs.) is VALID  =" + AP4 );
												                            
				       } else {
			 	System.out.println("Manpower Cost (Salary & Incentive) Amount (Rs.) is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + AP4 );			        
						 }
													
	//............................................................................................
					 // Short term longerest Cost ( MDS)
														
					  if (ICost1 == AP6 ) {
													        	
						  System.out.println("Short term longerest Cost ( MDS) Amount (Rs.) is VALID  =" + AP6 );
													                            
					       } else {
				 	System.out.println("Short term longerest Cost ( MDS)  Amount (Rs.) is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.. INVALID  = " + AP6 );			        
							 }	
	
					  //Check Net Earnings from MDS Enrollment
					  double expectedreSult10= md88/MD1;
					  long roundedResult10 = Math.round(expectedreSult10);
						
						if (AP12==roundedResult10){
						System.out.println("AUTO-POPULATED- Net Earning from MDS Enrollment cell value is  VALID  = "  + roundedResult10);								
									}else{
																	
					System.out.println("AUTO-POPULATED- Net Earning from MDS Enrollment cell value is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + roundedResult10  );
																					
									}	

						
			  
				}}						
						
						
										  
				  
				  
	


