package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class True_value {
	static void truevalue(WebDriver driver) throws InterruptedException  {
		
		
		// Then click on the True value 
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[11]")).click();
		Thread.sleep(3000);
// /////////////////////////////////////////////////////////////////////////////////////////////////////
//		//clear data first
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	    Thread.sleep(2000);
		
		System.out.println("..........................TRUE VALUE .....................................");
		System.out.println("............................................................................");
	///.......................................................................................
	    // Find the path of all all Elements
	    
	    WebElement T1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		WebElement T2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		WebElement T3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	    WebElement T4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	    WebElement T5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	    WebElement T6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	    
	    WebElement T7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		WebElement T8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		WebElement T9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	    WebElement T10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	    WebElement T11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	    WebElement T12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
			
	    WebElement T13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		WebElement T14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
		WebElement T15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	    WebElement T16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	    WebElement T17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	    WebElement T18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
			
	    WebElement T19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		WebElement T20 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
		WebElement T21 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
	    WebElement T22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	    WebElement T23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	    WebElement T24 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
			
	    WebElement T25 = driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
		WebElement T26 = driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
		WebElement T27 = driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
	    WebElement T28 = driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
	    WebElement T29 = driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
	    WebElement T30 = driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
			
	    WebElement T31 = driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
		WebElement T32 = driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
		WebElement T33 = driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
	    WebElement T34 = driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
	    WebElement T35 = driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
	    WebElement T36 = driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
			
	    WebElement T37 = driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
		WebElement T38 = driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
		WebElement T39 = driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
	    WebElement T40 = driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
	    WebElement T41 = driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
	    WebElement T42 = driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
	    WebElement T43 = driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
	    WebElement T44 = driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
	    WebElement T45 = driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
	    WebElement T46 = driver.findElement(By.xpath("(//*[@type=\"number\"])[46]"));
	  //......................................................................................
	    // SEND The values 
	    
//	    T2.sendKeys("633000");
//	    T4.sendKeys("62200");
//	    T5.sendKeys("30000");
//	    T6.sendKeys("601030");
//	    T7.sendKeys("30034200");
//	    T8.sendKeys("600100");
//	    T9.sendKeys("30000");
//	    
//	    T13.sendKeys("600200");
//	    T15.sendKeys("313200");
//	    T17.sendKeys("34000");
//	    T19.sendKeys("34000");
//	    T21.sendKeys("32000");
//	    
//	    T27.sendKeys("32000");
//	    T29.sendKeys("32000");
//	    T31.sendKeys("3203440");
//	    T33.sendKeys("32100");
//	    T35.sendKeys("32000");
//	    T37.sendKeys("3200330");
//	    T39.sendKeys("32000");
	    	    
	    
	//.....................................................................................................    
			// convert longo longegers
	   double TRUE1 = Double.parseDouble(T1.getAttribute("value"));
	   long convertedLong1 = (long) TRUE1;
	   
	    long TRUE2 = Long.parseLong(T2.getAttribute("value"));
	    long TRUE3 = Long.parseLong(T3.getAttribute("value"));
	    long TRUE4 = Long.parseLong(T4.getAttribute("value"));
	    long TRUE5 = Long.parseLong(T5.getAttribute("value"));
	    long TRUE6 = Long.parseLong(T6.getAttribute("value"));
	    long TRUE7 = Long.parseLong(T7.getAttribute("value"));
	    long TRUE8 = Long.parseLong(T8.getAttribute("value"));
	    long TRUE9 = Long.parseLong(T9.getAttribute("value"));
	    long TRUE10 = Long.parseLong(T10.getAttribute("value"));
	    long TRUE11 = Long.parseLong(T11.getAttribute("value"));
	    long TRUE12 = Long.parseLong(T12.getAttribute("value"));
	    long TRUE13 = Long.parseLong(T13.getAttribute("value"));
	    long TRUE14 = Long.parseLong(T14.getAttribute("value"));
	    long TRUE15 = Long.parseLong(T15.getAttribute("value"));
	    long TRUE16 = Long.parseLong(T16.getAttribute("value"));
	    long TRUE17 = Long.parseLong(T17.getAttribute("value"));
	    long TRUE18 = Long.parseLong(T18.getAttribute("value"));
	    long TRUE19 = Long.parseLong(T19.getAttribute("value"));
	    long TRUE20 = Long.parseLong(T20.getAttribute("value"));
	    long TRUE21 = Long.parseLong(T21.getAttribute("value"));
	    long TRUE22 = Long.parseLong(T22.getAttribute("value"));
	    long TRUE23 = Long.parseLong(T23.getAttribute("value"));
	    long TRUE24 = Long.parseLong(T24.getAttribute("value"));
	    long TRUE25 = Long.parseLong(T25.getAttribute("value"));
	    long TRUE26 = Long.parseLong(T26.getAttribute("value"));
	    long TRUE27 = Long.parseLong(T27.getAttribute("value"));
	    long TRUE28 = Long.parseLong(T28.getAttribute("value"));
	    long TRUE29 = Long.parseLong(T29.getAttribute("value"));
	    long TRUE30 = Long.parseLong(T30.getAttribute("value"));
	    long TRUE31 = Long.parseLong(T31.getAttribute("value"));
	    long TRUE32 = Long.parseLong(T32.getAttribute("value"));
	    long TRUE33 = Long.parseLong(T33.getAttribute("value"));
	    long TRUE34 = Long.parseLong(T34.getAttribute("value"));
	    long TRUE35 = Long.parseLong(T35.getAttribute("value"));
	    long TRUE36 = Long.parseLong(T36.getAttribute("value"));
	    long TRUE37 = Long.parseLong(T37.getAttribute("value"));
	    long TRUE38 = Long.parseLong(T38.getAttribute("value"));
	    long TRUE39 = Long.parseLong(T39.getAttribute("value"));
	    long TRUE40 = Long.parseLong(T40.getAttribute("value"));
	    long TRUE41 = Long.parseLong(T41.getAttribute("value"));
	    long TRUE42 = Long.parseLong(T42.getAttribute("value"));
	    long TRUE43 = Long.parseLong(T43.getAttribute("value"));
	    long TRUE44 = Long.parseLong(T44.getAttribute("value"));
	    long TRUE45 = Long.parseLong(T45.getAttribute("value"));
	    long TRUE46 = Long.parseLong(T46.getAttribute("value"));

//..........................................................................................................
	   	    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                      //AUTOPOPULATED SHELLS


                    Thread.sleep(3000);
         //.......................................................................................................					
         //	click on the NEW cars to find the values

          driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[7]")).click();
            Thread.sleep(3000);

                //	Path of New Car Retail Sales In (NEW cars)

            WebElement New_cars_1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));

            // convert longo longegers

           double N_cars1 = Double.parseDouble(New_cars_1.getAttribute("value"));
          //System.out.println("New Car Retail Sales In (NEW cars)  VALUE =  " + N_cars1 );	

            Thread.sleep(2000);
	    
	  ////////////////////////////////////////////////////////////////////////////////////////////////////////
	    	  		// then click on the Manpowercost
	  						
	  						driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[6]")).click();
	  						Thread.sleep(3000);	
	  						
	  		// find the path Of the  Maruti Driving School	OF Manpowercost	
	  						
	  		WebElement ManPOWER1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
	  		
	  		// convert longo longegers
	  		long MP_cost1 = Long.parseLong(ManPOWER1.getAttribute("value"));
	  		//System.out.println("Maruti Driving School	OF Manpowercost VALUES  = "  + MP_cost1);	
	  		
	  	// .....................................................................................................
	  	//......................................................................................................
	  		Thread.sleep(3000);
	  		  // then click on the longrestCost and find the path of Total longerest Paid on ST Loans
	  		
	  		  driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[4]")).click();
	  		  Thread.sleep(3000);	
	  		
	             // find the path Of the  Maruti Driving School	OF Manpowercost	
	  		
	           WebElement longrestCOST1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));

	             // convert longo longegers
	             long longRESTCost1 = Long.parseLong(longrestCOST1.getAttribute("value"));
	             // System.out.println("Total longerest Paid on ST Loans VALUES  = "  + longRESTCost1);
	              
	              Thread.sleep(2000);
	    //......................................................................................
	              // clcik on the TRUE VALUE
	              driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[11]")).click();
	      		Thread.sleep(2000);
	              
	//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	  		// Then We put the condition for All AutoPopulated 	& calculations shells 
	              
	              long expectedValues= TRUE4+TRUE6-TRUE8;
	              if (convertedLong1 == expectedValues ) {
			        	
					  System.out.println("AUTOPOPULATED  POC Sales[Quantity (A+B-C)] VALID  =" + convertedLong1 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED  POC Sales[Quantity (A+B-C)] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + convertedLong1 );			        
						 }	
//........................................................................................................
	             double expectedValues1 = TRUE2/TRUE1;	
					long roundedResult1 = Math.round(expectedValues1);
								
	              if (TRUE3 == roundedResult1 ) {
			        	
					  System.out.println("AUTOPOPULATED Per POC Sales (Rs.) VALID  =" + TRUE3 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED Per POC Sales (Rs.)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE3 );			        
						 }	
	    //.............................................................................................
	              long expectedValues222= TRUE5+TRUE7-TRUE9;
	              if (TRUE10 == expectedValues222 ) {
			        	
					  System.out.println("AUTOPOPULATED Cost Of Goods Sold(A+B-C) AMOUNT VALID  =" + TRUE10 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED Cost Of Goods Sold(A+B-C) AMOUNT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE10 );			        
						 }
	              
	    //.........................................................................................
	              long expectedValues2= TRUE2-TRUE10;
	              if (TRUE11 == expectedValues2 ) {
			        	
					  System.out.println("AUTOPOPULATED POC Sales Margin (Sales-Cost of Goods sold) AMOUNT VALID  =" + TRUE11 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED POC Sales Margin (Sales-Cost of Goods sold) AMOUNT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE11 );			        
						 }
	    
	  //........................................................................................................
	              double expectedValues3 = TRUE11/N_cars1;	
					long roundedResult3 = Math.round(expectedValues3);
								
	              if (TRUE12 == roundedResult3 ) {
			        	
					  System.out.println("AUTOPOPULATED (POC Sales Margin (Sales-Cost of Goods sold)) Per New Car Income (Rs.)[1] VALID  =" + TRUE12 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED (POC Sales Margin (Sales-Cost of Goods sold)) Per New Car Income (Rs.)[1]>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE12 );			        
						 }
	    
	   //........................................................................................................
	              double expectedValues4 = TRUE13/N_cars1;	
					long roundedResult4 = Math.round(expectedValues4);
								
	              if (TRUE14 == roundedResult4 ) {
			        	
					  System.out.println("AUTOPOPULATED(POC Sales Incentive (TVAC/other incentive)) Per New Car Income (Rs.)[2] VALID  =" + TRUE14 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED (POC Sales Incentive (TVAC/other incentive))Per New Car Income (Rs.)[2] >>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + TRUE14 );			        
						 }         
	  //........................................................................................................
	              double expectedValues5 = TRUE15/N_cars1;	
					long roundedResult5 = Math.round(expectedValues5);
								
	              if (TRUE16 == roundedResult5 ) {
			        	
					  System.out.println("AUTOPOPULATED [Finance Commission (POC sales)	] Per New Car Income (Rs.)[3] VALID  =" + TRUE16 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Finance Commission (POC sales)	] Per New Car Income (Rs.)[3]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE16 );			        
						 }    
	      //........................................................................................................
	              double expectedValues6 = TRUE17/N_cars1;	
					long roundedResult6 = Math.round(expectedValues6);
								
	              if (TRUE18 == roundedResult6 ) {
			        	
					  System.out.println("AUTOPOPULATED (Insurance Commission (POC sales))Per New Car Income (Rs.)[4] VALID  =" + TRUE18 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED (Insurance Commission (POC sales))Per New Car Income (Rs.)[4]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE18 );			        
						 }
	 //........................................................................................................
	              double expectedValues7 = TRUE19/N_cars1;	
					long roundedResult7 = Math.round(expectedValues7);
								
	              if (TRUE20 == roundedResult7 ) {
			        	
					  System.out.println("AUTOPOPULATED (Net Earnings from registration/Transfer of RC) Per New Car Income (Rs.)[5] VALID  =" + TRUE20 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED (Net Earnings from registration/Transfer of RC) Per New Car Income (Rs.)[5]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE20 );			        
						 }
	 //........................................................................................................
	              double expectedValues8 = TRUE21/N_cars1;	
					long roundedResult8 = Math.round(expectedValues8);
								
	              if (TRUE20 == roundedResult8 ) {
			        	
					  System.out.println("AUTOPOPULATED(Any other POC Sales Income) Per New Car Income (Rs.)[6] VALID  =" + TRUE22 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED(Any other POC Sales Income) Per New Car Income (Rs.)[6]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE22 );			        
						 }
  //...............................................................................................................
	            
	              if (TRUE23 == MP_cost1  ) {  // manpower cost Autopopulated
			        	
					  System.out.println("AUTOPOPULATED Manpower Cost(Salary & Incentive) Amount(Rs.) is VALID  =" + TRUE23 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED Manpower Cost(Salary & Incentive) Amount(Rs.) is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE23 );			        
						 }
	   //...........................................................................................................
	              if (TRUE25 == longRESTCost1  ) {  // longrest Cost autopopulated
			        	
					  System.out.println("AUTOPOPULATED Short Term longerest Cost Amount(Rs.) is VALID  =" + TRUE25 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED Short Term longerest Cost Amount(Rs.) is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + TRUE25 );			        
						 }
	          
	   //........................................................................................................
	              double expectedValues9 = TRUE23/N_cars1;	
					long roundedResult9 = Math.round(expectedValues9);
								
	              if (TRUE24 == roundedResult9 ) {
			        	
					  System.out.println("AUTOPOPULATED [Manpower Cost(Salary & Incentive)] Per New Car Expense VALID  =" + TRUE24 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Manpower Cost(Salary & Incentive)] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE24 );			        
						 }   
	     //........................................................................................................
	              double expectedValues10 = TRUE25/N_cars1;	
					long roundedResult10 = Math.round(expectedValues10);
								
	              if (TRUE26 == roundedResult10 ) {
			        	
					  System.out.println("AUTOPOPULATED [Short Term longerest Cost] Per New Car Expense VALID  =" + TRUE26 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Short Term longerest Cost] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE26 );			        
						 } 
	        //........................................................................................................
	              double expectedValues11 = TRUE27/N_cars1;	
					long roundedResult11 = Math.round(expectedValues11);
								
	              if (TRUE28 == roundedResult11 ) {
			        	
					  System.out.println("AUTOPOPULATED [Short Term longerest Cost] Per New Car Expense VALID  =" + TRUE28 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Short Term longerest Cost ] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE28 );			        
						 } 
	     //........................................................................................................
	              double expectedValues12 = TRUE29/N_cars1;	
					long roundedResult12 = Math.round(expectedValues12);
								
	              if (TRUE30 == roundedResult12 ) {
			        	
					  System.out.println("AUTOPOPULATED [Refurbishment Cost] Per New Car Expense VALID  =" + TRUE30 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Refurbishment Cost ] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE30 );			        
						 }
  //........................................................................................................
	              double expectedValues13 = TRUE31/N_cars1;	
					long roundedResult13 = Math.round(expectedValues13);
								
	              if (TRUE32 == roundedResult13 ) {
			        	
					  System.out.println("AUTOPOPULATED [Advertisement/Marketing/Promotional] Per New Car Expense VALID  =" + TRUE32 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Advertisement/Marketing/Promotional ] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE32 );			        
						 }
	   //........................................................................................................
	              double expectedValues14 = TRUE33/N_cars1;	
					long roundedResult14 = Math.round(expectedValues14);
								
	              if (TRUE34 == roundedResult14 ) {
			        	
					  System.out.println("AUTOPOPULATED [Hyperlocal Expense Retainer fee ] Per New Car Expense VALID  =" + TRUE34 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [ Hyperlocal Expense Retainer fee  ] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE34 );			        
						 }       
	  //........................................................................................................
	              double expectedValues15 = TRUE35/N_cars1;	
					long roundedResult15 = Math.round(expectedValues15);
								
	              if (TRUE36 == roundedResult15 ) {
			        	
					  System.out.println("AUTOPOPULATED [Management Fees to MSIL] Per New Car Expense VALID  =" + TRUE36 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [ Management Fees to MSIL ] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE36 );			        
						 }  
	  //........................................................................................................
	              double expectedValues16 = TRUE37/N_cars1;	
					long roundedResult16 = Math.round(expectedValues16);
								
	              if (TRUE38 == roundedResult16 ) {
			        	
					  System.out.println("AUTOPOPULATED [Warranty Cost (Certified POC Sales cars only)] Per New Car Expense VALID  =" + TRUE38 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Warranty Cost (Certified POC Sales cars only) ] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE38 );			        
						 }        
	 //........................................................................................................
	              double expectedValues17 = TRUE39/N_cars1;	
					long roundedResult17 = Math.round(expectedValues17);
								
	              if (TRUE40 == roundedResult17 ) {
			        	
					  System.out.println("AUTOPOPULATED [Any other Expense (POC Sales only)] Per New Car Expense VALID  =" + TRUE40 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Any other Expense (POC Sales only) ] Per New Car Expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE40 );			        
						 }         
	 //.................................................................................................................................
	              
	              long expectedValues18= TRUE11+TRUE13+TRUE15+TRUE17+TRUE19+TRUE21;
	              if (TRUE41 == expectedValues18 ) {
			        	
					  System.out.println("AUTOPOPULATED  [Total POC Sales Income [A] ] VALID  =" + TRUE41 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Total POC Sales Income [A] ]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE41 );			        
						 }
	  //........................................................................................................
	              double expectedValues19 = TRUE41/N_cars1;	
					long roundedResult19 = Math.round(expectedValues19); // [Total POC Sales Income [A]] Per New Car Income
								
	           if (TRUE42 == roundedResult19 ) {
			        	
					  System.out.println("AUTOPOPULATED [Total POC Sales Income [A]] Per New Car Income VALID  =" + TRUE42 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Total POC Sales Income [A]] Per New Car Income>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE42 );			        
						 } 
	  //.................................................................................................................................
	              
	            long expectedValues20= TRUE41-TRUE45;  // [Net earning from POC Sales = [A] - [B]]
	              if (TRUE43 == expectedValues20 ) {
			        	
					  System.out.println("AUTOPOPULATED  [Net earning from POC Sales = [A] - [B]] VALID  =" + TRUE43 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Net earning from POC Sales = [A] - [B]]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE43 );			        
						 }   
	  //........................................................................................................
	              double expectedValues21 = TRUE43/N_cars1;	
					long roundedResult21 = Math.round(expectedValues21); // [Net earning from POC Sales = [A] - [B]] Per New Car Income
								
	           if (TRUE44 == roundedResult21 ) {
			        	
					  System.out.println("AUTOPOPULATED [Net earning from POC Sales = [A] - [B]] Per New Car Income VALID  =" + TRUE44 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Net earning from POC Sales = [A] - [B]] Per New Car Income >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE44 );			        
						 } 
	   //.................................................................................................................................
	              
	            long expectedValues22= TRUE23+TRUE25+TRUE27+TRUE29+TRUE31+TRUE33+TRUE35+TRUE37+TRUE39;  // Total POC Sales Direct Expense [B]
	              if (TRUE45 == expectedValues22 ) {
			        	
					  System.out.println("AUTOPOPULATED  (Total POC Sales Direct Expense [B]) VALID  =" + TRUE45 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED (Total POC Sales Direct Expense [B])>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE45 );			        
						 }  
	   //........................................................................................................
	              double expectedValues23 = TRUE45/N_cars1;	
					long roundedResult23 = Math.round(expectedValues23); //[Total POC Sales Direct Expense [B]] Per New Car expense
								
	           if (TRUE46 == roundedResult23 ) {
			        	
					  System.out.println("AUTOPOPULATED [Total POC Sales Direct Expense [B]] Per New Car expense VALID  =" + TRUE46 );
												                            
				       } else {
			 	System.out.println("AUTOPOPULATED [Total POC Sales Direct Expense [B]] Per New Car expense>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + TRUE46 );			        
						 } 
	              
	    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     
	           System.out.println(".............................E N D .................................................");
	}

}
