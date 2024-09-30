package aLL_CALCULATION_MODULES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MSGA_Calculation {

	static void msga(WebDriver driver ) throws InterruptedException  {
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				// Click on MSGA
				
				driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[9]")).click();        
				Thread.sleep(1000);
				//clear data first
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
			    Thread.sleep(2000);
				
	//////////////////////////////////////////////////////////////////////////////////////////////////////
				
		//Find the path of All elements	
				
				// then we will fill the details of Income in Maruti Insurance
				
				// 1.MSGA-Sales
				WebElement MSG_1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
				WebElement MSG_2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
				WebElement MSG_3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
				
   WebElement MSG_501 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));  // Total MSGA Sales

				
				// 2.MSGA-COGS
				WebElement MSG_4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
				WebElement MSG_5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
				WebElement MSG_6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
				
	WebElement MSG_502 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));  // Cost of Goods Sold (A+B-C)
		
				// 3.Income
				WebElement MSG_7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
				WebElement MSG_8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
				WebElement MSG_9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	WebElement MSG_503 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));  // MSGA Margin (Sales - Cost of Goods Sold)

				//4.Expense
				WebElement MSG_10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
				WebElement MSG_11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
				
				//Total
				WebElement MSG_504 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));// Total MSGA Income [A]
				WebElement MSG_505 = driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));//Net earning from MSGA = [A] - [B]
				WebElement MSG_506 = driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));//Total MSGA Direct Expense [B]
				
				WebElement M7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));// manpower cost path
				WebElement M8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));// longrest cost path
				
				
				Thread.sleep(1000);	
						
				// send the values In DRF
				
				MSG_1.sendKeys("84322");
				MSG_2.sendKeys("343224");
				MSG_3.sendKeys("743240");
				MSG_4.sendKeys("60");
				MSG_5.sendKeys("30");
				MSG_6.sendKeys("30");
				MSG_7.sendKeys("50");
				MSG_8.sendKeys("10");
				MSG_9.sendKeys("50");
				MSG_10.sendKeys("70");
				MSG_11.sendKeys("70");
				Thread.sleep(1000);
				
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.				
				// convert longo longegers 
				
				 long m1 = Long.parseLong(MSG_1.getAttribute("value"));
				 long m2 = Long.parseLong(MSG_2.getAttribute("value"));// // 1.MSGA-Sales
				 long m3 = Long.parseLong(MSG_3.getAttribute("value"));
	//...............................................................................................			 
				 long mg1 = Long.parseLong(MSG_501.getAttribute("value")); // Total MSGA Sales
	//.............................................................................................			 
				 long m4 = Long.parseLong(MSG_4.getAttribute("value"));
				 long m5 = Long.parseLong(MSG_5.getAttribute("value")); // 2.MSGA-COGS
				 long m6 = Long.parseLong(MSG_6.getAttribute("value"));
		//........................................................................................		 
				 long mg2 = Long.parseLong(MSG_502.getAttribute("value")); // Cost of Goods Sold (A+B-C)
			//................................................................................................	 
				 long m7 = Long.parseLong(MSG_7.getAttribute("value"));
				 long m8 = Long.parseLong(MSG_8.getAttribute("value")); 		// 3.Income			 
				 long m9 = Long.parseLong(MSG_9.getAttribute("value"));
	//...........................................................................................................			 
				 long mg3 = Long.parseLong(MSG_503.getAttribute("value"));// MSGA Margin (Sales - Cost of Goods Sold)
	//...........................................................................................................			 
				 long m10 = Long.parseLong(MSG_10.getAttribute("value"));
				 long m11 = Long.parseLong(MSG_11.getAttribute("value")); //4.Expense
	//............................................................................................................			 
				 long mg4 = Long.parseLong(MSG_504.getAttribute("value"));// Total MSGA Income [A]
				 long mg5 = Long.parseLong(MSG_505.getAttribute("value")); //Net earning from MSGA = [A] - [B]
				 long mg6 = Long.parseLong(MSG_506.getAttribute("value"));//Total MSGA Direct Expense [B]
				 
				 long mg7 = Long.parseLong(M7.getAttribute("value")); // manpowercost
				 long mg8 = Long.parseLong(M8.getAttribute("value")); //  longrest cost
				 
////////////////////////////////////////////////////////////////////////////////////////////////////////...
				 
				// Then we put the Calculation and condition for non clickable elements
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 // MSGA-Sales
				 
   long MSGA_sales_expectedValue = m1+m2+m3 ; //Total Amount of Total MSGA Sales 			        
				
					        
	  if (mg1 == MSGA_sales_expectedValue ) {
					        	
		  System.out.println("Total Amount MSGA Sales  is VALID  =" + mg1 );
					      					            
		    } else {
		 	System.out.println("Total Amount MSGA Sales  is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + mg1 );
					        
					        }	 				
//...........................................................................................................
	  
	  // MSGA-COGS
	  
	  long Cost_of_Goods_Sold_expectedValue = m4+m5-m6 ; //   Cost of Goods Sold (A+B-C) 			        
		
	  if (mg2 == Cost_of_Goods_Sold_expectedValue ) {
					        	
		  System.out.println("Total Amount Cost of Goods Sold (A+B-C)  is VALID  =" + mg2 );
					      					            
		    } else {
		 	System.out.println("Total Amount Cost of Goods Sold (A+B-C)  is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + mg2 );
					        
					        }	 
	//......................................................................................................	  
	  // Income
	  
	  long MSGA_margin_expectedValue = mg1-mg2 ; // MSGA Margin (Sales - Cost of Goods Sold)
			        		
	  if (mg3 == MSGA_margin_expectedValue ) {
					        	
		  System.out.println("MSGA Margin (Sales - Cost of Goods Sold) calculation is VALID  =" + mg3 );
					      					            
		    } else {
		 	System.out.println("MSGA Margin (Sales - Cost of Goods Sold) calculation is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + mg3 );
					        	}	  
	//........................................................................................................
	  
	   // Total
	  long Total_MSGA_Income_expectedValue = mg3+m7+m8+m9 ; //Total MSGA Direct Expense [A]
		
	  if (mg4 == Total_MSGA_Income_expectedValue ) {
					        	
		  System.out.println("Total MSGA Income [A] calculation is VALID  =" + mg4 );
					      					            
		    } else {
		 	System.out.println("Total MSGA Income [A] calculation is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + mg4 );
					        	}	
     //....................................................................................................
	  // Total
	  long Total_MSGA_Direct_Expense_expectedValue = m10+m11+mg7+mg8 ; // Total MSGA Direct Expense [B]
		
	  if (mg6 == Total_MSGA_Direct_Expense_expectedValue ) {
		  					        	
		  System.out.println("Total MSGA Direct Expense [B] calculation is VALID  =" + mg6 );
					      					            
		    } else {
		 	System.out.println("Total MSGA Direct Expense [B] calculation is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + mg6 );
					        	}

	//....................................................................................................
	  // Total
	  long Net_earning_from_MSGA_expectedValue = mg4-mg6 ; // Net earning from MSGA = [A] - [B]
		
	  if (mg5 == Net_earning_from_MSGA_expectedValue ) {
					        	
		  System.out.println("Net earning from MSGA = [A] - [B] calculation is VALID  =" + mg5 );
					      					            
		    } else {
		 	System.out.println("Net earning from MSGA = [A] - [B] calculation is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + mg5 );
					        	}
	  //......................................................................................................
    		
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
			
			double New_cars1 = Double.parseDouble(NEW_cars_1.getAttribute("value"));
			//System.out.println("New Car Retail Sales In (NEW cars)  VALUE =  " + New_cars1 );	
			
			Thread.sleep(2000);
			
//..................................................................................................................
//.................................................................................................................						
     
			// then click on the Manpowercost
			
						driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[6]")).click();
						Thread.sleep(3000);	
						
			// find the path Of the  Maruti Driving School	OF Manpowercost	
						
			WebElement ManPOWER1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));

			// convert longo longegers
			long MP1 = Long.parseLong(ManPOWER1.getAttribute("value"));
			//System.out.println("Maruti Driving School	OF Manpowercost VALUES  = "  + MP1);	

			// .....................................................................................................
			//......................................................................................................
			Thread.sleep(3000);
			// then click on the longrestCost and find the path of Total longerest Paid on ST Loans

			driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[4]")).click();
			Thread.sleep(3000);	

			// find the path Of the  Maruti Driving School	OF Manpowercost	

			WebElement intrestcost1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));

			// convert longo longegers
			long ICost1 = Long.parseLong(intrestcost1.getAttribute("value"));
			//System.out.println("Total longerest Paid on ST Loans VALUES  = "  + ICost1);

			// Click on MSGA
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[9]")).click();        
			Thread.sleep(1000);
			
	//.......................................................................................................
	//........................................................................................................

   
			//path of the Autopopulated shells
			WebElement M1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
			WebElement M2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));				
			WebElement M3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
			WebElement M4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
			
			WebElement M5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
			WebElement M6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));				
			
			WebElement M9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
			WebElement M10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));				
			WebElement M11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
			WebElement M12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
			WebElement M13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
			WebElement M14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
			
			WebElement M15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
			
			
			// convert longo longegers
			long P1 = Long.parseLong(M1.getAttribute("value"));
			long P2 = Long.parseLong(M2.getAttribute("value"));
			long P3 = Long.parseLong(M3.getAttribute("value"));
			long P4 = Long.parseLong(M4.getAttribute("value"));
			long P5 = Long.parseLong(M5.getAttribute("value"));
			long P6 = Long.parseLong(M6.getAttribute("value"));
			
			long P9 = Long.parseLong(M9.getAttribute("value"));
			long P10 = Long.parseLong(M10.getAttribute("value"));
			long P11 = Long.parseLong(M11.getAttribute("value"));
			long P12 = Long.parseLong(M12.getAttribute("value"));
			long P13 = Long.parseLong(M13.getAttribute("value"));
			long P14 = Long.parseLong(M14.getAttribute("value"));
			long P15 = Long.parseLong(M15.getAttribute("value"));
			
		//......................................................................................................
			
		//	Then We Put the condition for Autopopulated shells..
			
			
			double EXP_RESult1 = mg1/New_cars1;
			long roundedResult1 = Math.round(EXP_RESult1);
			if(P1==roundedResult1) {
				
				System.out.println("AUTOPOPULATED MSGA Sales [Per New Car Income] VALID =  "  + P1 );
			}else{
				
				System.out.println("AUTOPOPULATED MSGA Sales [Per New Car Income] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID =  "  + P1);
				}
		//............................................................................................................
			double EXP_RESult2 = mg2/New_cars1;
			long roundedResult2 = Math.round(EXP_RESult2);
			if(P2==roundedResult2) {
				
				System.out.println("AUTOPOPULATED Cost of Goods Sold (A+B-C)[Per New Car Expense] VALID =  "  + P2 );
			}else{
				
				System.out.println("AUTOPOPULATED  Cost of Goods Sold (A+B-C)[Per New Car Expense] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P2);
				}
			
	//............................................................................................................
			double EXP_RESult3 = mg3/New_cars1;
			long roundedResult3 = Math.round(EXP_RESult3);
			if(P3==roundedResult3) {
				
				System.out.println("AUTOPOPULATED MSGA Margin (Sales - Cost of Goods Sold)[Per New Car Income] VALID =  "  + P3 );
			}else{
				
				System.out.println("AUTOPOPULATED MSGA Margin (Sales - Cost of Goods Sold)[Per New Car Income] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID =  "  + P3);
				}
	//............................................................................................................
			double EXP_RESult4 = m7/New_cars1;
			long roundedResult4 = Math.round(EXP_RESult4);
			if(P4==roundedResult4) {
				
				System.out.println("AUTOPOPULATED TCU Commission : Suzuki Connect (only Commission) [Per New Car Income] VALID =  "  + P4 );
			}else{
				
				System.out.println("AUTOPOPULATED TCU Commission : Suzuki Connect (only Commission)[Per New Car Income]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P4);
				}

	//............................................................................................................
			double EXP_RESult5 = m8/New_cars1;
			long roundedResult5 = Math.round(EXP_RESult5);
			if(P5==roundedResult5) {
				
				System.out.println("AUTOPOPULATED Incentive earned on Accessories sales [Per New Car Income] VALID =  "  + P5 );
			}else{
				
				System.out.println("AUTOPOPULATED Incentive earned on Accessories sales [Per New Car Income]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P5);
				}


	//............................................................................................................
			double EXP_RESult6 = m9/New_cars1;
			long roundedResult6 = Math.round(EXP_RESult6);
			if(P6==roundedResult6) {
				
				System.out.println("AUTOPOPULATED Any other MSGA Income [Per New Car Income] VALID =  "  + P6 );
			}else{
				
				System.out.println("AUTOPOPULATED Any other MSGA Income [Per New Car Income]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P6);
				}
	//............................................................................................................
			double EXP_RESult7 = mg7/New_cars1;
			long roundedResult7 = Math.round(EXP_RESult7);
			if(P9 ==roundedResult7) {
				
				System.out.println("AUTOPOPULATED  Manpower Cost (Salary & Incentive) [Per New Car EXPENSE] VALID =  "  + P9 );
			}else{
				
				System.out.println("AUTOPOPULATED Manpower Cost (Salary & Incentive) [Per New Car EXPENSE] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P9);
				}

	//............................................................................................................
			double EXP_RESult8 = m10/New_cars1;
			long roundedResult8 = Math.round(EXP_RESult8);
			if(P10 ==roundedResult8) {
				
				System.out.println("AUTOPOPULATED Discount (Bill discount) [Per New Car Expense] VALID =  "  + P10 );
			}else{
				
				System.out.println("AUTOPOPULATED Discount (Bill discount) [Per New Car Expense]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P10);
				}

	//............................................................................................................
			double EXP_RESult9 = mg8/New_cars1;
			long roundedResult9 = Math.round(EXP_RESult9);
			if(P11 ==roundedResult9) {
				
				System.out.println("AUTOPOPULATED Short Term longerest Cost ( MSGA) [Per New Car Expense] VALID =  "  + P11 );
			}else{
				
				System.out.println("AUTOPOPULATED Short Term longerest Cost ( MSGA) [Per New Car Expense]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P11);
				}
			
	//............................................................................................................
			double EXP_RESult10 = m11/New_cars1;
			long roundedResult10 = Math.round(EXP_RESult10);
			if(P12 ==roundedResult10) {
				
				System.out.println("AUTOPOPULATED Any other Expense (MSGA only) [Per New Car Expense] VALID =  "  + P12 );
			}else{
				
				System.out.println("AUTOPOPULATED Any other Expense (MSGA only) [Per New Car Expense]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P12);
				}
	//............................................................................................................
			double EXP_RESult11 = mg4/New_cars1;
			long roundedResult11 = Math.round(EXP_RESult11);
			if(P13 ==roundedResult11) {
				
				System.out.println("AUTOPOPULATED Total MSGA Income [A] VALID =  "  + P13 );
			}else{
				
				System.out.println("AUTOPOPULATED Total MSGA Income [A] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID =  "  + P13);
				}
		
	//............................................................................................................
			double EXP_RESult12 = mg5/New_cars1;
			long roundedResult12 = Math.round(EXP_RESult12);
			if(P14 ==roundedResult12) {
				
				System.out.println("AUTOPOPULATED Net earning from MSGA = [A] - [B] VALID =  "  + P14 );
			}else{
				
				System.out.println("AUTOPOPULATED Net earning from MSGA = [A] - [B]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P14);
				}
			
	//............................................................................................................
			double EXP_RESult13 = mg6/New_cars1;
			long roundedResult13 = Math.round(EXP_RESult13);
			if(P15 ==roundedResult13) {
				
				System.out.println("AUTOPOPULATED Total MSGA Direct Expense [B] VALID =  "  + P15 );
			}else{
				
				System.out.println("AUTOPOPULATED Total MSGA Direct Expense [B]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID =  "  + P15);
				}
				
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			// We match the Autopopulated values of longrest cost
			
			if (ICost1 == mg8 ) {
	        	
				  System.out.println("Manpower Cost (Salary & Incentive) is VALID  =" + mg8 );
											                            
			       } else {
		 	System.out.println("Manpower Cost (Salary & Incentive) is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + mg8 );			        
					 }	

	//...............................................................................
			// We match the Autopopulated values of Manpower cost
			
						if (MP1 == mg7 ) {
				        	
							  System.out.println("Short Term longerest Cost ( MSGA) AMOUNT is VALID  =" + mg7 );
														                            
						       } else {
					 	System.out.println("Short Term longerest Cost ( MSGA) AMOUNT is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + mg7 );			        
								 }	

			
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>			
			System.out.println("......................E  N  D .......................................");
			
			
			

}}
