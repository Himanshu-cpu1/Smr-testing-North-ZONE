package aLL_CALCULATION_MODULES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonExpense {
	static void CommonExp_Page(WebDriver driver) throws InterruptedException {
		
		 //click on Common Expense 
		 driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[13]")).click();         
	     Thread.sleep(2000);       
		 //...........................................................................................................................................
		 //clear data first
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
		 Thread.sleep(2000);
		 //...........................................................................................................................................
	     WebElement c1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
	     WebElement c2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
	     WebElement c3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
	     WebElement c4= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
	     WebElement c5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
	     WebElement c6= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
	     WebElement c7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
	     WebElement c8= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
	     WebElement c9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
	     WebElement c10= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
	     WebElement c11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
	     WebElement c12= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
	     WebElement c13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
	     WebElement c14= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
	     WebElement c15= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
	     WebElement c16= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
	     WebElement c17= driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
	     WebElement c18= driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
	     WebElement c19= driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
	     WebElement c20= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
	     WebElement c21= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
	     WebElement c22= driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
	     WebElement c23= driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
	     WebElement c24= driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
	     WebElement c25= driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
	     WebElement c26= driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
	     WebElement c27= driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
	     WebElement c28= driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));	    
	     WebElement c29= driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
	     WebElement c30= driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
	     WebElement c31= driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
	     WebElement c32= driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
	     WebElement c33= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
	     WebElement c34= driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
	     WebElement c35= driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
	     WebElement c36= driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
	     WebElement c37= driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
	     WebElement c38= driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
	     WebElement c39= driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
	     WebElement c40= driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
	     WebElement c41= driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
	     WebElement c42= driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
	     WebElement c43= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
	     WebElement c44= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
	     WebElement c45= driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
	     WebElement c46= driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
	     WebElement c47= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
	     WebElement c48= driver.findElement(By.xpath("(//*[@type=\"text\"])[48]"));
	     WebElement c49= driver.findElement(By.xpath("(//*[@type=\"text\"])[49]"));
	     WebElement c50= driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
	     WebElement c51= driver.findElement(By.xpath("(//*[@type=\"text\"])[51]"));
	     WebElement c52= driver.findElement(By.xpath("(//*[@type=\"text\"])[52]"));
	     WebElement c53= driver.findElement(By.xpath("(//*[@type=\"text\"])[53]"));
	     WebElement c54= driver.findElement(By.xpath("(//*[@type=\"text\"])[54]"));
	     WebElement c55= driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
	     WebElement c56= driver.findElement(By.xpath("(//*[@type=\"text\"])[56]"));
	     WebElement c57= driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
	     WebElement c58= driver.findElement(By.xpath("(//*[@type=\"text\"])[58]"));
	     WebElement c59= driver.findElement(By.xpath("(//*[@type=\"text\"])[59]"));
	     WebElement c60= driver.findElement(By.xpath("(//*[@type=\"text\"])[60]"));
	     WebElement c61= driver.findElement(By.xpath("(//*[@type=\"text\"])[61]"));
	     WebElement c62= driver.findElement(By.xpath("(//*[@type=\"text\"])[62]"));
	     WebElement c63= driver.findElement(By.xpath("(//*[@type=\"text\"])[63]"));
	     WebElement c64= driver.findElement(By.xpath("(//*[@type=\"text\"])[64]"));
	     WebElement c65= driver.findElement(By.xpath("(//*[@type=\"text\"])[65]"));
	     WebElement c66= driver.findElement(By.xpath("(//*[@type=\"text\"])[66]"));
	     WebElement c67= driver.findElement(By.xpath("(//*[@type=\"text\"])[67]"));
	     
	     //..........................................................................................................................................
	     //send values for depreciation and rent
	     Thread.sleep(2000);
	     c1.sendKeys("866567");
	     c2.sendKeys("166567");
	     c3.sendKeys("198567");
	     c4.sendKeys("866567");
	     c5.sendKeys("864567");
	     c6.sendKeys("196567");
	     c7.sendKeys("198667");	     
	     c9.sendKeys("198667");
	     c10.sendKeys("198665");
	     c11.sendKeys("198667");
	     c12.sendKeys("198665");
	     c13.sendKeys("198667");
	     c14.sendKeys("66567");
	     c15.sendKeys("866567");   
	     c17.sendKeys("866567");
	     c18.sendKeys("6657667");
	     c19.sendKeys("198567");
	     c20.sendKeys("866567");
	     c21.sendKeys("866567");
	     c22.sendKeys("198667");
	     c23.sendKeys("198667");	     
	     c25.sendKeys("166567");
	     c26.sendKeys("866567");
	     c27.sendKeys("9866567");
	     c28.sendKeys("196567");
	     c29.sendKeys("196567");
	     c30.sendKeys("866567");
	     c31.sendKeys("66567");	     
	     c41.sendKeys("866567");
	     c42.sendKeys("196567");
	     c43.sendKeys("198667");
	     c44.sendKeys("198667");
	     c45.sendKeys("19867");
	     c46.sendKeys("298567");
	     c47.sendKeys("866567");
	     c48.sendKeys("7866567");	    
	     c50.sendKeys("89866");
	     c51.sendKeys("486567");
	     c52.sendKeys("58343336567");
	     c53.sendKeys("786567");
	     c54.sendKeys("966567");
	     c55.sendKeys("3866567");
	     c56.sendKeys("298667");
	     c57.sendKeys("432567");
	    	 //............................................................................................................................    	     
	     //convert longo longegers
	     Thread.sleep(2000);
	     long ce1= Long.parseLong(c1.getAttribute("value"));
	     long ce2= Long.parseLong(c2.getAttribute("value"));
	     long ce3= Long.parseLong(c3.getAttribute("value"));
	     long ce4= Long.parseLong(c4.getAttribute("value"));
	     long ce5= Long.parseLong(c5.getAttribute("value"));
	     long ce6= Long.parseLong(c6.getAttribute("value"));
	     long ce7= Long.parseLong(c7.getAttribute("value"));
	     long ce8= Long.parseLong(c8.getAttribute("value"));
	     long ce9= Long.parseLong(c9.getAttribute("value"));
	     long ce10= Long.parseLong(c10.getAttribute("value"));
	     long ce11= Long.parseLong(c11.getAttribute("value"));
	     long ce12= Long.parseLong(c12.getAttribute("value"));
	     long ce13= Long.parseLong(c13.getAttribute("value"));
	     long ce14= Long.parseLong(c14.getAttribute("value"));
	     long ce15= Long.parseLong(c15.getAttribute("value"));
	     long ce16= Long.parseLong(c16.getAttribute("value"));
	     long ce17= Long.parseLong(c17.getAttribute("value"));
	     long ce18= Long.parseLong(c18.getAttribute("value"));
	     long ce19= Long.parseLong(c19.getAttribute("value"));
	     long ce20= Long.parseLong(c20.getAttribute("value"));
	     long ce21= Long.parseLong(c21.getAttribute("value"));
	     long ce22= Long.parseLong(c22.getAttribute("value"));
	     long ce23= Long.parseLong(c23.getAttribute("value"));
	     long ce24= Long.parseLong(c24.getAttribute("value"));
	     long ce25= Long.parseLong(c25.getAttribute("value"));
	     long ce26= Long.parseLong(c26.getAttribute("value"));
	     long ce27= Long.parseLong(c27.getAttribute("value"));
	     long ce28= Long.parseLong(c28.getAttribute("value"));
	     long ce29= Long.parseLong(c29.getAttribute("value"));
	     long ce30= Long.parseLong(c30.getAttribute("value"));
	     long ce31= Long.parseLong(c31.getAttribute("value"));
	     long ce32= Long.parseLong(c32.getAttribute("value"));
	     long ce33= Long.parseLong(c33.getAttribute("value"));
	     long ce34= Long.parseLong(c34.getAttribute("value"));
	     long ce35= Long.parseLong(c35.getAttribute("value"));
	     long ce36= Long.parseLong(c36.getAttribute("value"));
	     long ce37= Long.parseLong(c37.getAttribute("value"));
	     long ce38= Long.parseLong(c38.getAttribute("value"));
	     long ce39= Long.parseLong(c39.getAttribute("value"));
	     long ce40= Long.parseLong(c40.getAttribute("value"));
	     long ce41= Long.parseLong(c41.getAttribute("value"));
	     long ce42= Long.parseLong(c42.getAttribute("value"));
	     long ce43= Long.parseLong(c43.getAttribute("value"));
	     long ce44= Long.parseLong(c44.getAttribute("value"));
	     long ce45= Long.parseLong(c45.getAttribute("value"));
	     long ce46= Long.parseLong(c46.getAttribute("value"));
	     long ce47= Long.parseLong(c47.getAttribute("value"));
	     long ce48= Long.parseLong(c48.getAttribute("value"));
	     long ce49= Long.parseLong(c49.getAttribute("value"));
	     long ce50= Long.parseLong(c50.getAttribute("value"));
	     long ce51= Long.parseLong(c51.getAttribute("value"));
	     long ce52= Long.parseLong(c52.getAttribute("value"));
	     long ce53= Long.parseLong(c53.getAttribute("value"));
	     long ce54= Long.parseLong(c54.getAttribute("value"));
	     long ce55= Long.parseLong(c55.getAttribute("value"));
	     long ce56= Long.parseLong(c56.getAttribute("value"));
	     long ce57= Long.parseLong(c57.getAttribute("value"));
	     long ce58= Long.parseLong(c58.getAttribute("value"));
	     long ce59= Long.parseLong(c59.getAttribute("value"));
	     long ce60= Long.parseLong(c60.getAttribute("value"));
	     long ce61= Long.parseLong(c61.getAttribute("value"));
	     long ce62= Long.parseLong(c62.getAttribute("value"));
	     long ce63= Long.parseLong(c63.getAttribute("value"));
	     long ce64= Long.parseLong(c64.getAttribute("value"));
	     long ce65= Long.parseLong(c65.getAttribute("value"));
	     long ce66= Long.parseLong(c66.getAttribute("value"));
	     long ce67= Long.parseLong(c67.getAttribute("value"));
	     
	     //.......................................................................................................................................	     
	     long exp1= ce1+ce9+ce17+ce25;           //calculate total depreciation for new car
	     //Verify if result is as expected
	     if(ce33==exp1) 
		   {
			  System.out.println("New Car- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp1);  
		   }
		 else
		   {
			  System.out.println("New Car- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp1);		   
		   }  
	     //.......................................................................................................................................................
	     long exp2= ce2+ce10+ce18+ce26;           //calculate total depreciation for MSGA
	     //Verify if result is as expected
	     if(ce34==exp2) 
		   {
			  System.out.println("MSGA- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp2);  
		   }
		 else
		   {
			  System.out.println("MSGA- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp2);		   
		   }  
		 //........................................................................................................................................................	   
	     long exp3= ce3+ce11+ce19+ce27;           //calculate total depreciation for Service
	     //Verify if result is as expected
	     if(ce35==exp3) 
		   {
			  System.out.println("Service- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp3);  
		   }
		 else
		   {
			  System.out.println("Service- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp3);		   
		   }  
	     //........................................................................................................................................................
	     long exp4= ce4+ce12+ce20+ce28;           //calculate total depreciation for Spares
	     //Verify if result is as expected
	     if(ce36==exp4) 
		   {
			  System.out.println("Spares- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp4);  
		   }
		 else
		   {
			  System.out.println("Spares- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp4);		   
		   }  
		 //........................................................................................................................................................
	     long exp5= ce5+ce13+ce21+ce29;           //calculate total depreciation for True Value
	     //Verify if result is as expected
	     if(ce37==exp5) 
		   {
			  System.out.println("True Value- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp5);  
		   }
		 else
		   {
			  System.out.println("True Value- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp5);		   
		   }  
		 //........................................................................................................................................................
	     long exp6= ce6+ce14+ce22+ce30;           //calculate total depreciation for MI
	     //Verify if result is as expected
	     if(ce38==exp6) 
		   {
			  System.out.println("MI- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp6);  
		   }
		 else
		   {
			  System.out.println("MI- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp6);		   
		   }  
		 //..........................................................................................................................................................
	     long exp7= ce7+ce15+ce23+ce31;           //calculate total depreciation for MDS
	     //Verify if result is as expected
	     if(ce39==exp7) 
		   {
			  System.out.println("MDS- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp7);  
		   }
		 else
		   {
			
			 System.out.println("MDS- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp7);		   
		   }  
		 //...........................................................................................................................................................
	     long exp8= ce8+ce16+ce24+ce32;           //calculate total depreciation for Total
	     //Verify if result is as expected
	     if(ce40==exp8) 
		   {
			  System.out.println("Total- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp8);  
		   }
		 else
		   {
			  System.out.println("Total- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp8);		   
		   }  
		 //............................................................................................................................................................
	     long exp9= ce1+ce2+ce3+ce4+ce5+ce6+ce7;           //calculate total depreciation for Building
	     //Verify if result is as expected
	     if(ce8==exp9) 
		   {
			  System.out.println("Buildng- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp9);  
		   }
		 else
		   {
			  System.out.println("Building- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp9);		   
		   }  
		 //............................................................................................................................................................
	     long exp10= ce9+ce10+ce11+ce12+ce13+ce14+ce15;           //calculate total depreciation for Plant & Machinery
	     //Verify if result is as expected
	     if(ce16==exp10) 
		   {
			  System.out.println("Plant & Machinery- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp10);  
		   }
		 else
		   {
			  System.out.println("Plant & Machinery- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp10);		   
		   }  
	     //............................................................................................................................................................
	     long exp11= ce17+ce18+ce19+ce20+ce21+ce22+ce23;           //calculate total depreciation for Demo Vehicles
	     //Verify if result is as expected
	     if(ce24==exp11) 
		   {
			  System.out.println("Demo Vehicles- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp11);  
		   }
		 else
		   {
			  System.out.println("Demo Vehicles- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp11);		   
		   }  
	     //...............................................................................................................................................................
	     long exp12= ce25+ce26+ce27+ce28+ce29+ce30+ce31;           //calculate total depreciation for Others
	     //Verify if result is as expected
	     if(ce32==exp12) 
		   {
			  System.out.println("Others- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp12);  
		   }
		 else
		   {
			  System.out.println("Others- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp12);		   
		   }  
	     //...............................................................................................................................................................
	     long exp13= ce33+ce34+ce35+ce36+ce37+ce38+ce39;           //calculate total depreciation for Total
	     //Verify if result is as expected
	     if(ce40==exp13) 
		   {
			  System.out.println("Total- Total Depreciation FORMULA CELL displays correct value- PASS=  " +exp13);  
		   }
		 else
		   {
			  System.out.println("Total- Total Depreciation FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp13);		   
		   }  
	     //...............................................................................................................................................................
	     long exp14= ce41+ce50;           //calculate total rent for New Car
	     //Verify if result is as expected
	     if(ce59==exp14) 
		   {
			  System.out.println("New Car- Total Rent FORMULA CELL displays correct value- PASS=  " +exp14);  
		   }
		 else
		   {
			  System.out.println("New Car- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp14);		   
		   }  
	     //................................................................................................................................................................
	     long exp15= ce42+ce51;           //calculate total rent for MSGA
	     //Verify if result is as expected
	     if(ce60==exp15) 
		   {
			  System.out.println("MSGA- Total Rent FORMULA CELL displays correct value- PASS=  " +exp15);  
		   }
		 else
		   {
			  System.out.println("MSGA- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp15);		   
		   }  
	     //................................................................................................................................................................
	     long exp16= ce43+ce52;           //calculate total rent for Service
	     //Verify if result is as expected
	     if(ce61==exp16) 
		   {
			  System.out.println("Service- Total Rent FORMULA CELL displays correct value- PASS=  " +exp16);  
		   }
		 else
		   {
			  System.out.println("Service- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp16);		   
		   }
	     //................................................................................................................................................................
	     long exp17= ce44+ce53;           //calculate total rent for Spares
	     //Verify if result is as expected
	     if(ce62==exp17) 
		   {
			  System.out.println("Spares- Total Rent FORMULA CELL displays correct value- PASS=  " +exp17);  
		   }
		 else
		   {
			  System.out.println("Spares- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp17);		   
		   }
	     //...............................................................................................................................................................
	     long exp18= ce45+ce54;           //calculate total rent for True Value
	     //Verify if result is as expected
	     if(ce63==exp18) 
		   {
			  System.out.println("True Value- Total Rent FORMULA CELL displays correct value- PASS=  " +exp18);  
		   }
		 else
		   {
			  System.out.println("True Value- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp18);		   
		   }
	     //..............................................................................................................................................................
	     long exp19= ce46+ce55;           //calculate total rent for MI
	     //Verify if result is as expected
	     if(ce64==exp19) 
		   {
			  System.out.println("MI- Total Rent FORMULA CELL displays correct value- PASS=  " +exp19);  
		   }
		 else
		   {
			  System.out.println("MI- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp19);		   
		   }
	     //.............................................................................................................................................................
	     long exp20= ce47+ce56;           //calculate total rent for MDS
	     //Verify if result is as expected
	     if(ce65==exp20) 
		   {
			  System.out.println("MDS- Total Rent FORMULA CELL displays correct value- PASS=  " +exp20);  
		   }
		 else
		   {
			  System.out.println("MDS- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp20);		   
		   }
	     //.............................................................................................................................................................
	     long exp21= ce48+ce57;           //calculate total rent for Others
	     //Verify if result is as expected
	     if(ce66==exp21) 
		   {
			  System.out.println("Others- Total Rent FORMULA CELL displays correct value- PASS=  " +exp21);  
		   }
		 else
		   {
			  System.out.println("Others- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp21);		   
		   }
	      //...........................................................................................................................................................
	     long exp22= ce49+ce58;           //calculate total rent for Total
	     //Verify if result is as expected
	     if(ce67==exp22) 
		   {
			  System.out.println("Total- Total Rent FORMULA CELL displays correct value- PASS=  " +exp22);  
		   }
		 else
		   {
			  System.out.println("Total- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp22);		   
		   }
	     //.............................................................................................................................................................
	     long exp23= ce41+ce42+ce43+ce44+ce45+ce46+ce47+ce48;           //calculate total rent for Paid to Self
	     //Verify if result is as expected
	     if(ce49==exp23) 
		   {
			  System.out.println("Paid To Self- Total Rent FORMULA CELL displays correct value- PASS=  " +exp23);  
		   }
		 else
		   {
			  System.out.println("Paid To Self- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp23);		   
		   }
	     //.............................................................................................................................................................
	     long exp24= ce50+ce51+ce52+ce53+ce54+ce55+ce56+ce57;           //calculate total rent for Paid to Others
	     //Verify if result is as expected
	     if(ce58==exp24) 
		   {
			  System.out.println("Paid To Others- Total Rent FORMULA CELL displays correct value- PASS=  " +exp24);  
		   }
		 else
		   {
			  System.out.println("Paid To Others- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp24);		   
		   }
	     //...........................................................................................................................................................
	     long exp25= ce59+ce60+ce61+ce62+ce63+ce64+ce65+ce66;           //calculate total rent for Paid to Others
	     //Verify if result is as expected
	     if(ce67==exp25) 
		   {
			  System.out.println("Total- Total Rent FORMULA CELL displays correct value- PASS=  " +exp25);  
		   }
		 else
		   {
			  System.out.println("Total- Total Rent FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp25);		   
		   }
	     //..........................................................................................................................................................
	     //save data
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	     Thread.sleep(3000);
	     //..........................................................................................................................................................
	     //click on Other Expense
	     Actions A= new Actions(driver);
	     A.sendKeys(Keys.PAGE_UP).perform(); //scroll up
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[2]")).click();
	     Thread.sleep(3000);
	     //.........................................................................................................................................................
	     
	     WebElement c68= driver.findElement(By.xpath("(//*[@type=\"text\"])[68]"));
	     WebElement c69= driver.findElement(By.xpath("(//*[@type=\"text\"])[69]"));
	     WebElement c70= driver.findElement(By.xpath("(//*[@type=\"text\"])[70]"));
	     WebElement c71= driver.findElement(By.xpath("(//*[@type=\"text\"])[71]"));
	     WebElement c72= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));
	     WebElement c73= driver.findElement(By.xpath("(//*[@type=\"text\"])[73]"));
	     WebElement c74= driver.findElement(By.xpath("(//*[@type=\"text\"])[74]"));
	     WebElement c75= driver.findElement(By.xpath("(//*[@type=\"text\"])[75]"));
	     WebElement c76= driver.findElement(By.xpath("(//*[@type=\"text\"])[76]"));
	     WebElement c77= driver.findElement(By.xpath("(//*[@type=\"text\"])[77]"));
	     WebElement c78= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]"));
	     WebElement c79= driver.findElement(By.xpath("(//*[@type=\"text\"])[79]"));
	     WebElement c80= driver.findElement(By.xpath("(//*[@type=\"text\"])[80]"));
	     WebElement c81= driver.findElement(By.xpath("(//*[@type=\"text\"])[81]"));
	     WebElement c82= driver.findElement(By.xpath("(//*[@type=\"text\"])[82]"));
	     WebElement c83= driver.findElement(By.xpath("(//*[@type=\"text\"])[83]"));
	     WebElement c84= driver.findElement(By.xpath("(//*[@type=\"text\"])[84]"));
	     WebElement c85= driver.findElement(By.xpath("(//*[@type=\"text\"])[85]"));
	     WebElement c86= driver.findElement(By.xpath("(//*[@type=\"text\"])[86]"));
	     WebElement c87= driver.findElement(By.xpath("(//*[@type=\"text\"])[87]"));
	     WebElement c88= driver.findElement(By.xpath("(//*[@type=\"text\"])[88]"));
	     WebElement c89= driver.findElement(By.xpath("(//*[@type=\"text\"])[89]"));
	     WebElement c90= driver.findElement(By.xpath("(//*[@type=\"text\"])[90]"));
	     WebElement c91= driver.findElement(By.xpath("(//*[@type=\"text\"])[91]"));
	     WebElement c92= driver.findElement(By.xpath("(//*[@type=\"text\"])[92]"));
	     WebElement c93= driver.findElement(By.xpath("(//*[@type=\"text\"])[93]"));
	     WebElement c94= driver.findElement(By.xpath("(//*[@type=\"text\"])[94]"));
	     WebElement c95= driver.findElement(By.xpath("(//*[@type=\"text\"])[95]"));
	     WebElement c96= driver.findElement(By.xpath("(//*[@type=\"text\"])[96]"));
	     WebElement c97= driver.findElement(By.xpath("(//*[@type=\"text\"])[97]"));
	     WebElement c98= driver.findElement(By.xpath("(//*[@type=\"text\"])[98]"));
	     WebElement c99= driver.findElement(By.xpath("(//*[@type=\"text\"])[99]"));
	     WebElement c100= driver.findElement(By.xpath("(//*[@type=\"text\"])[100]"));
	     WebElement c101= driver.findElement(By.xpath("(//*[@type=\"text\"])[101]"));
	     WebElement c102= driver.findElement(By.xpath("(//*[@type=\"text\"])[102]"));
	     WebElement c103= driver.findElement(By.xpath("(//*[@type=\"text\"])[103]"));
	     WebElement c104= driver.findElement(By.xpath("(//*[@type=\"text\"])[104]"));
	     WebElement c105= driver.findElement(By.xpath("(//*[@type=\"text\"])[105]"));
	     WebElement c106= driver.findElement(By.xpath("(//*[@type=\"text\"])[106]"));
	     WebElement c107= driver.findElement(By.xpath("(//*[@type=\"text\"])[107]"));
	     WebElement c108= driver.findElement(By.xpath("(//*[@type=\"text\"])[108]"));
	     WebElement c109= driver.findElement(By.xpath("(//*[@type=\"text\"])[109]"));
	     WebElement c110= driver.findElement(By.xpath("(//*[@type=\"text\"])[110]"));
	     WebElement c111= driver.findElement(By.xpath("(//*[@type=\"text\"])[111]"));
	     WebElement c112= driver.findElement(By.xpath("(//*[@type=\"text\"])[112]"));
	     WebElement c113= driver.findElement(By.xpath("(//*[@type=\"text\"])[113]"));
	     WebElement c114= driver.findElement(By.xpath("(//*[@type=\"text\"])[114]"));
	     WebElement c115= driver.findElement(By.xpath("(//*[@type=\"text\"])[115]"));
	     WebElement c116= driver.findElement(By.xpath("(//*[@type=\"text\"])[116]"));
	     WebElement c117= driver.findElement(By.xpath("(//*[@type=\"text\"])[117]"));	     
	     WebElement c120= driver.findElement(By.xpath("(//*[@type=\"text\"])[120]"));
	     WebElement c121= driver.findElement(By.xpath("(//*[@type=\"text\"])[121]"));
	     WebElement c122= driver.findElement(By.xpath("(//*[@type=\"text\"])[122]"));
	     WebElement c123= driver.findElement(By.xpath("(//*[@type=\"text\"])[123]"));
	     
	     //send values for depreciation and rent
	     Thread.sleep(2000);
	     c82.sendKeys("8665367");
	     c84.sendKeys("5166567");
	     c86.sendKeys("1198567");
	     c88.sendKeys("6866567");
	     c90.sendKeys("9864567");
	     c92.sendKeys("2196567");
	     c94.sendKeys("5198667");	     
	     c96.sendKeys("6198667");
	     c98.sendKeys("7198665");
	     c100.sendKeys("8198667");
	     c102.sendKeys("9198665");
	     c104.sendKeys("3198667");
	     c106.sendKeys("3198667");
	     c108.sendKeys("4198667");
	     c110.sendKeys("5198667");
	     c112.sendKeys("6198667");
	     c114.sendKeys("7198667");
	     c116.sendKeys("1298667");
	     //...............................................................................................................................
	     //convert to longegers
	     long ce68= Long.parseLong(c68.getAttribute("value"));
	     long ce69= Long.parseLong(c69.getAttribute("value"));
	     long ce70= Long.parseLong(c70.getAttribute("value"));
	     long ce71= Long.parseLong(c71.getAttribute("value"));
	     long ce72= Long.parseLong(c72.getAttribute("value"));
	     long ce73= Long.parseLong(c73.getAttribute("value"));
	     long ce74= Long.parseLong(c74.getAttribute("value"));
	     long ce75= Long.parseLong(c75.getAttribute("value"));
	     long ce76= Long.parseLong(c76.getAttribute("value"));
	     long ce77= Long.parseLong(c77.getAttribute("value"));
	     long ce78= Long.parseLong(c78.getAttribute("value"));
	     long ce79= Long.parseLong(c79.getAttribute("value"));
	     long ce80= Long.parseLong(c80.getAttribute("value"));
	     long ce81= Long.parseLong(c81.getAttribute("value"));
	     long ce82= Long.parseLong(c82.getAttribute("value"));
	     long ce83= Long.parseLong(c83.getAttribute("value"));
	     long ce84= Long.parseLong(c84.getAttribute("value"));
	     long ce85= Long.parseLong(c85.getAttribute("value"));
	     long ce86= Long.parseLong(c86.getAttribute("value"));
	     long ce87= Long.parseLong(c87.getAttribute("value"));
	     long ce88= Long.parseLong(c88.getAttribute("value"));
	     long ce89= Long.parseLong(c89.getAttribute("value"));
	     long ce90= Long.parseLong(c90.getAttribute("value"));
	     long ce91= Long.parseLong(c91.getAttribute("value"));
	     long ce92= Long.parseLong(c92.getAttribute("value"));
	     long ce93= Long.parseLong(c93.getAttribute("value"));
	     long ce94= Long.parseLong(c94.getAttribute("value"));
	     long ce95= Long.parseLong(c95.getAttribute("value"));
	     long ce96= Long.parseLong(c96.getAttribute("value"));
	     long ce97= Long.parseLong(c97.getAttribute("value"));
	     long ce98= Long.parseLong(c98.getAttribute("value"));
	     long ce99= Long.parseLong(c99.getAttribute("value"));
	     long ce100= Long.parseLong(c100.getAttribute("value"));
	     long ce101= Long.parseLong(c101.getAttribute("value"));
	     long ce102= Long.parseLong(c102.getAttribute("value"));
	     long ce103= Long.parseLong(c103.getAttribute("value"));
	     long ce104= Long.parseLong(c104.getAttribute("value"));
	     long ce105= Long.parseLong(c105.getAttribute("value"));
	     long ce106= Long.parseLong(c106.getAttribute("value"));
	     long ce107= Long.parseLong(c107.getAttribute("value"));
	     long ce108= Long.parseLong(c108.getAttribute("value"));
	     long ce109= Long.parseLong(c109.getAttribute("value"));
	     long ce110= Long.parseLong(c110.getAttribute("value"));
	     long ce111= Long.parseLong(c111.getAttribute("value"));
	     long ce112= Long.parseLong(c112.getAttribute("value"));
	     long ce113= Long.parseLong(c113.getAttribute("value"));
	     long ce114= Long.parseLong(c114.getAttribute("value"));
	     long ce115= Long.parseLong(c115.getAttribute("value"));
	     long ce116= Long.parseLong(c116.getAttribute("value"));
	     long ce117= Long.parseLong(c117.getAttribute("value"));
	     long ce120= Long.parseLong(c120.getAttribute("value"));
	     long ce121= Long.parseLong(c121.getAttribute("value"));
	     long ce122= Long.parseLong(c122.getAttribute("value"));
	     long ce123= Long.parseLong(c123.getAttribute("value"));
	     //.........................................................................................................................................
	     //save data
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	     Thread.sleep(4000);
	     //..........................................................................................................................................
	     //navigate to New Car Page	     
		 driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();
	     Thread.sleep(2000);
		 WebElement QN1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // New Car Quantity
	     Thread.sleep(2000);
	     String QNC = QN1.getAttribute("value"); // Or another attribute name   
		 System.out.println("Quantity- AUTO POPULATED CELL in New Car page displays: "+QNC);
		 double Q3= Double.parseDouble(QN1.getAttribute("value"));
		 //..........................................................................................................................................
	     //navigate to Manpower Cost page
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")).click();
		 Thread.sleep(2000);
	     WebElement MP1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[80]")); //  Back office - Total Manpower Cost Page
	     Thread.sleep(2000);
		 String M1 = MP1.getAttribute("value");
		 System.out.println("Back Office- FORMULA CELL in Manpower Cost Page displays: "+ M1);
	     //..........................................................................................................................................
	     //navigate to Interest Cost page
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[4]")).click();
		 Thread.sleep(2000);
		 WebElement IC1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[97]")); //  Long term Interest Cost- Interest Cost page
		 Thread.sleep(2000);
		 String ICST1 = IC1.getAttribute("value");    
		 System.out.println("Total Long term Interest Cost- FORMULA CELL  in Interest Cost Page displays: "+ ICST1);
		 //..........................................................................................................................................	
	     //navigate back to Common Expense- Depreciation & Rent tab
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[13]")).click();
		 Thread.sleep(2000);
		 WebElement CE1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]")); //  Building- Depreciation tab
		 Thread.sleep(2000);
		 String CED1 = CE1.getAttribute("value");    
		 System.out.println("Building- FORMULA CELL in Depreciation tab displays: "+ CED1);
		 WebElement CE2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[16]")); //  Plant & Machinery- Depreciation tab
		 Thread.sleep(2000);
		 String CED2 = CE2.getAttribute("value");    
		 System.out.println("Plant & Machinery- FORMULA CELL in Depreciation tab displays: "+ CED2);
		 WebElement CE3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[24]")); //  Demo Vehicles- Depreciation tab
		 Thread.sleep(2000);
		 String CED3 = CE3.getAttribute("value");    
		 System.out.println("Demo Vehicles- FORMULA CELL in Depreciation tab displays: "+ CED3);
		 WebElement CE4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[32]")); //  Others- Depreciation tab
		 Thread.sleep(2000);
		 String CED4 = CE4.getAttribute("value");    
		 System.out.println("Others- FORMULA CELL in Depreciation tab displays: "+ CED4);
		 WebElement CE5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[67]")); //  Total Rent- Depreciation tab
		 Thread.sleep(2000);
		 String CED5 = CE5.getAttribute("value");    
		 System.out.println("Total Rent- FORMULA CELL in Depreciation tab displays: "+ CED5);
		 //..............................................................................................................................................................
		 //navigate back to Common Expense- Other Expense tab
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[2]")).click();
	     Thread.sleep(3000);
		 //.............................................................................................................................................................
	     Thread.sleep(2000);
		 WebElement OE1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[68]"));         
		 // Get the attribute value from the second module's web element	          
		 String oe1 = OE1.getAttribute("value"); 
	     System.out.println("Back Office (Salary & Incentive)- AUTO POPULATED CELL in OTHER EXPENSE page displays "+oe1);	          
		 if(oe1.equals(M1)) 
		   {
		      System.out.println("VALID CALCULATION of Back Office (Salary & Incentive): "+oe1);          	
		   }
		 else 
		   {
		      System.out.println("INVALID CALCULATION of Back Office (Salary & Incentive)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL: "+oe1);          	          	          	
		   }
		 //................................................................................................................................................   
		 WebElement OE2= driver.findElement(By.xpath("(//*[@type=\"text\"])[70]"));
		 String oe2= OE2.getAttribute("value");
		 System.out.println("Long Term Interest Cost- AUTO POPULATED CELL in OTHER EXPENSE page displays: "+ oe2);
		 if(oe2.equals(ICST1)) 
		   {
		     System.out.println("VALID CALCULATION of Long Term Interest Cost : "+oe2);          	
		   }
		 else 
		   {
		     System.out.println("INVALID CALCULATION of Long Term Interest Cost>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL: "+oe2);          	          	          	
		   } 
		 //..........................................................................................................................................
		 WebElement OE3= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));
		 String oe3= OE3.getAttribute("value");
		 System.out.println("Building (Depreciation)- AUTO POPULATED CELL in OTHER EXPENSE page displays"+ oe3);
		 if(oe3.equals(CED1)) 
		   {
		     System.out.println("VALID CALCULATION of Building (Depreciation) : "+oe3);          	
		   }
		 else 
		   {
		     System.out.println("INVALID CALCULATION of Building (Depreciation)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL: "+oe3);          	          	          	
		   } 
		 //.........................................................................................................................................
		 WebElement OE4= driver.findElement(By.xpath("(//*[@type=\"text\"])[74]"));
		 String oe4= OE4.getAttribute("value");
		 System.out.println("Plant & Machinery (Depreciation)- AUTO POPULATED CELL in OTHER EXPENSE page displays"+ oe4);
		 if(oe4.equals(CED2)) 
		   {
		     System.out.println("VALID CALCULATION of Plant & Machinery (Depreciation) : "+oe4);          	
		   }
		 else 
		   {
		     System.out.println("INVALID CALCULATION of Plant & Machinery (Depreciation)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL: "+oe4);          	          	          	
		   }
		 //............................................................................................................................................
		 WebElement OE5= driver.findElement(By.xpath("(//*[@type=\"text\"])[76]"));
		 String oe5= OE5.getAttribute("value");
		 System.out.println("Demo Vehicles (Depreciation)- AUTO POPULATED CELL in OTHER EXPENSE page displays: "+ oe5);
		 if(oe5.equals(CED3)) 
		   {
		     System.out.println("VALID CALCULATION of Demo Vehicles (Depreciation) : "+oe5);          	
		   }
		 else 
		   {
		     System.out.println("INVALID CALCULATION of Demo Vehicles (Depreciation)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL: "+oe5);          	          	          	
		   }
		 //..............................................................................................................................................
		 WebElement OE6= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]"));
		 String oe6= OE6.getAttribute("value");
		 System.out.println("Others (Depreciation)- AUTO POPULATED CELL in OTHER EXPENSE page displays: "+ oe6);
		 if(oe6.equals(CED4)) 
		   {
		     System.out.println("VALID CALCULATION of Others (Depreciation) : "+oe6);          	
		   }
		 else 
		   {
		     System.out.println("INVALID CALCULATION of Others (Depreciation)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL: "+oe6);          	          	          	
		   }
		 //......................................................................................................................................
		 WebElement OE7= driver.findElement(By.xpath("(//*[@type=\"text\"])[80]"));
		 String oe7= OE7.getAttribute("value");
		 System.out.println("Rent- AUTO POPULATED CELL in OTHER EXPENSE page displays: "+ oe7);
		 if(oe7.equals(CED5)) 
		   {
		     System.out.println("VALID CALCULATION of Rent : "+oe7);          	
		   }
		 else 
		   {
		     System.out.println("INVALID CALCULATION of Rent>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL: "+oe7);          	          	          	
		   }
		 //...................................................................................................................................
		 //calculate per new car income
		 Thread.sleep(3000);
		 double exp26= ce68/Q3 ;
	     long roundedexp26 = Math.round(exp26);  //calculate per new car income- Back Office (Salary & Incentive)			    
		 //Verify if result is as expected
		 if(ce69==roundedexp26) 
		   {
			  System.out.println("Back Office (Salary & Incentive)- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp26);  
		   }
		 else
		   {
				 System.out.println("Back Office (Salary & Incentive)- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp26);		   
		   }
		 //....................................................................................................................................................
		 double exp27= ce70/Q3 ;
	     long roundedexp27 = Math.round(exp27);  //calculate per new car income- Long term Interest Cost			    
		 //Verify if result is as expected
		 if(ce71==roundedexp27) 
		   {
			  System.out.println("Long term Interest Cost- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp27);  
		   }
		 else
		   {
				 System.out.println("Long term Interest Cost- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp27);		   
		   }
		 //......................................................................................................................................................
		 double exp28= ce72/Q3 ;
	     long roundedexp28 = Math.round(exp28);  //calculate per new car income- Building (Depreciation)		    
		 //Verify if result is as expected
		 if(ce73==roundedexp28) 
		   {
			  System.out.println("Building (Depreciation)- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp28);  
		   }
		 else
		   {
				 System.out.println("Building (Depreciation)- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp28);		   
		   }
		 //.......................................................................................................................................................
		 double exp29= ce74/Q3 ;
	     long roundedexp29 = Math.round(exp29);  //calculate per new car income- Plant & Machinery		    
		 //Verify if result is as expected
		 if(ce75==roundedexp29) 
		   {
			  System.out.println("Plant & Machinery- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp29);  
		   }
		 else
		   {
				 System.out.println("Plant & Machinery- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp29);		   
		   }
		 //...........................................................................................................................................................
		 double exp30= ce76/Q3 ;
	     long roundedexp30 = Math.round(exp30);  //calculate per new car income- Demo Vehicles		    
		 //Verify if result is as expected
		 if(ce77==roundedexp30) 
		   {
			  System.out.println("Demo Vehicles- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp30);  
		   }
		 else
		   {
			  System.out.println("Demo Vehicles- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp30);		   
		   }
		 //.............................................................................................................................................................
		 double exp31= ce78/Q3 ;
	     long roundedexp31 = Math.round(exp31);  //calculate per new car income- Others		    
		 //Verify if result is as expected
		 if(ce79==roundedexp31) 
		   {
			  System.out.println("Others- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp31);  
		   }
		 else
		   {
			  System.out.println("Others- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp31);		   
		   }
		 //..............................................................................................................................................................
		 double exp32= ce80/Q3 ;
	     long roundedexp32 = Math.round(exp32);  //calculate per new car income- Rent		    
		 //Verify if result is as expected
		 if(ce81==roundedexp32) 
		   {
			  System.out.println("Rent- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp32);  
		   }
		 else
		   {
			  System.out.println("Rent- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp32);		   
		   }
		 //.................................................................................................................................................................
		 double exp33= ce82/Q3 ;
	     long roundedexp33 = Math.round(exp33);  //calculate per new car income- Repair Malongenance		    
		 //Verify if result is as expected
		 if(ce83==roundedexp33) 
		   {
			  System.out.println("Repair Malongenance- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp33);  
		   }
		 else
		   {
			  System.out.println("Repair Malongenance- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp33);		   
		   }
		 //...........................................................................................................................................................................
		 double exp34= ce84/Q3 ;
	     long roundedexp34 = Math.round(exp34);  //calculate per new car income- Director Promoter Renumeration		    
		 //Verify if result is as expected
		 if(ce85==roundedexp34) 
		   {
			  System.out.println("Director Promoter Renumeration- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp34);  
		   }
		 else
		   {
			  System.out.println("Director Promoter Renumeration- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp34);		   
		   }
		 //.................................................................................................................................................................................................
		 double exp35= ce86/Q3 ;
	     long roundedexp35 = Math.round(exp35);  //calculate per new car income- Staff Welfare Expenses		    
		 //Verify if result is as expected
		 if(ce87==roundedexp35) 
		   {
			  System.out.println("Staff Welfare Expenses- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp35);  
		   }
		 else
		   {
			  System.out.println("Staff Welfare Expenses- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp35);		   
		   }
		 //.................................................................................................................................................................................................
		 double exp36= ce88/Q3 ;
	     long roundedexp36 = Math.round(exp36);  //calculate per new car income- Utilities		    
		 //Verify if result is as expected
		 if(ce89==roundedexp36) 
		   {
			  System.out.println("Utilities- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp36);  
		   }
		 else
		   {
			  System.out.println("Utilities- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp36);		   
		   }
		 //................................................................................................................................................................................................
		 double exp37= ce90/Q3 ;
	     long roundedexp37 = Math.round(exp37);  //calculate per new car income- Securities & Guards		    
		 //Verify if result is as expected
		 if(ce91==roundedexp37) 
		   {
			  System.out.println("Securities & Guards- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp37);  
		   }
		 else
		   {
			  System.out.println("Securities & Guards- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp37);		   
		   }
		 //................................................................................................................................................................................................
		 double exp38= ce92/Q3 ;
	     long roundedexp38 = Math.round(exp38);  //calculate per new car income- Housekeeping & Pantry		    
		 //Verify if result is as expected
		 if(ce93==roundedexp38) 
		   {
			  System.out.println("Housekeeping & Pantry- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp38);  
		   }
		 else
		   {
			  System.out.println("Housekeeping & Pantry- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp38);		   
		   }
		 //................................................................................................................................................................................................
		 double exp39= ce94/Q3 ;
	     long roundedexp39 = Math.round(exp39);  //calculate per new car income- Conveyance/Travelling expense		    
		 //Verify if result is as expected
		 if(ce95==roundedexp39) 
		   {
			  System.out.println("Conveyance/Travelling expense- per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp39);  
		   }
		 else
		   {
			  System.out.println("Conveyance/Travelling expense- per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp39);		   
		   }
		 //...............................................................................................................................................................................................
		 double exp40= ce96/Q3 ;
	     long roundedexp40 = Math.round(exp40);  //calculate per new car income- Fuel Expense		    
		 //Verify if result is as expected
		 if(ce97==roundedexp40) 
		   {
			  System.out.println("Fuel Expense- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp40);  
		   }
		 else
		   {
			  System.out.println("Fuel Expense- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp40);		   
		   }
		 //...............................................................................................................................................................................................
		 double exp41= ce98/Q3 ;
	     long roundedexp41 = Math.round(exp41);  //calculate per new car income- Professional Charge 		    
		 //Verify if result is as expected
		 if(ce99==roundedexp41) 
		   {
			  System.out.println("Professional Charge- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp41);  
		   }
		 else
		   {
			  System.out.println("Professional Charge- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp41);		   
		   }
		 //..............................................................................................................................................................................................
		 double exp42= ce100/Q3 ;
	     long roundedexp42 = Math.round(exp42);  //calculate per new car income- Insurance 		    
		 //Verify if result is as expected
		 if(ce101==roundedexp42) 
		   {
			  System.out.println("Insurance- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp42);  
		   }
		 else
		   {
			  System.out.println("Insurance- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp42);		   
		   }
		 //.............................................................................................................................................................................................
		 double exp43= ce102/Q3 ;
	     long roundedexp43 = Math.round(exp43);  //calculate per new car income- Prlonging & Stationary 		    
		 //Verify if result is as expected
		 if(ce103==roundedexp43) 
		   {
			  System.out.println("Prlonging & Stationary- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp43);  
		   }
		 else
		   {
			  System.out.println("Prlonging & Stationary- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp43);		   
		   }
		 //...........................................................................................................................................................................................
		 double exp44= ce104/Q3 ;
	     long roundedexp44 = Math.round(exp44);  //calculate per new car income- Telephone/Mobile 		    
		 //Verify if result is as expected
		 if(ce105==roundedexp44) 
		   {
			  System.out.println("Telephone/Mobile- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp44);  
		   }
		 else
		   {
			  System.out.println("Telephone/Mobile- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp44);		   
		   }
		 //..........................................................................................................................................................................................
		 double exp45= ce106/Q3 ;
	     long roundedexp45 = Math.round(exp45);  //calculate per new car income- Local/Municipal Taxes 		    
		 //Verify if result is as expected
		 if(ce107==roundedexp45) 
		   {
			  System.out.println("Local/Municipal Taxes- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp45);  
		   }
		 else
		   {
			  System.out.println("Local/Municipal Taxes- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp45);		   
		   }
		 //..........................................................................................................................................................................................
		 double exp46= ce108/Q3 ;
	     long roundedexp46 = Math.round(exp46);  //calculate per new car income- Training 		    
		 //Verify if result is as expected
		 if(ce109==roundedexp46) 
		   {
			  System.out.println("Training- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp46);  
		   }
		 else
		   {
			  System.out.println("Training- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp46);		   
		   }
		 //...........................................................................................................................................................................................
		 double exp47= ce110/Q3 ;
	     long roundedexp47 = Math.round(exp47);  //calculate per new car income- EDP Charges 		    
		 //Verify if result is as expected
		 if(ce111==roundedexp47) 
		   {
			  System.out.println("EDP Charges- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp47);  
		   }
		 else
		   {
			  System.out.println("EDP Charges- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp47);		   
		   }
		 //...........................................................................................................................................................................................
		 double exp48= ce112/Q3 ;
	     long roundedexp48 = Math.round(exp48);  //calculate per new car income- Freight & Cartage 		    
		 //Verify if result is as expected
		 if(ce113==roundedexp48) 
		   {
			  System.out.println("Freight & Cartage- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp48);  
		   }
		 else
		   {
			  System.out.println("Freight & Cartage- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp48);		   
		   }
		 //............................................................................................................................................................................................
		 double exp49= ce114/Q3 ;
	     long roundedexp49 = Math.round(exp49);  //calculate per new car income- longernet/Connectivity Charges		    
		 //Verify if result is as expected
		 if(ce115==roundedexp49) 
		   {
			  System.out.println("longernet/Connectivity Charges- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp49);  
		   }
		 else
		   {
			  System.out.println("longernet/Connectivity Charges- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp49);		   
		   }
		 //..........................................................................................................................................................................................
		 double exp50= ce116/Q3 ;
	     long roundedexp50 = Math.round(exp50);  //calculate per new car income- Others		    
		 //Verify if result is as expected
		 if(ce117==roundedexp50) 
		   {
			  System.out.println("Others- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp50);  
		   }
		 else
		   {
			  System.out.println("Others- Per new car AUTO POPULATED CELLl displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp50);		   
		   }
 //.........................................................................................................................................................................................
		 long exp51= ce68+ce70+ce72+ce74+ce76+ce78+ce80+ce82+ce84+ce86
				    +ce88+ce90+ce92+ce94+ce96+ce98+ce100+ce102+ce104+
				    ce106+ce108+ce110+ce112+ce114+ce116;                //calculate -Total Common Expenses
	     //Verify if result is as expected
	     if(ce120==exp51) 
		   {
			  System.out.println("Total Common Expenses- FORMULA CELL displays correct value- PASS=  " +exp51);  
		   }
		 else
		   {
			  System.out.println("Total Common Expenses- FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp51);		   
		   } 
	//.........................................................................................................................................................................................
	     double exp52= ce120/Q3 ;
	     long roundedexp52 = Math.round(exp52);  //calculate per new car income- Total Common Expenses		    
		 //Verify if result is as expected
		 if(ce121==roundedexp52) 
		   {
			  System.out.println("Total Common Expenses- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp52);  
		   }
		 else
		   {
			  System.out.println("Total Common Expenses- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp52);		   
		   }
	//.........................................................................................................................................................................................
		 long exp53= ce82+ce84+ce86+ce88+ce90+ce92+ce94+ce96+ce98+ce100+ce102+ce104+
				    ce106+ce108+ce110+ce112+ce114+ce116;                             //calculate -Total Overheads
	     //Verify if result is as expected
	     if(ce122==exp53) 
		   {
			  System.out.println("Total Overheads- FORMULA CELL displays correct value- PASS=  " +exp53);  
		   }
		 else
		   {
			  System.out.println("Total Overheads- FORMULA CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp53	);		   
		   } 
 //.........................................................................................................................................................................................
	     double exp54= ce122/Q3 ;
	     long roundedexp54 = Math.round(exp54);  //calculate per new car income- Total Overheads		    
		 //Verify if result is as expected
		 if(ce123==roundedexp54) 
		   {
			  System.out.println("Total Overheads- Per new car AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp54);  
		   }
		 else
		   {
			  System.out.println("Total Overheads- Per new car AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp54);		   
		   }
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 System.out.println("................................E..N..D...........................................................");
	}
}
