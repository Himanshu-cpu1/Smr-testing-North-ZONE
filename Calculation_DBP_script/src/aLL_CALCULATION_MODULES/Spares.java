package aLL_CALCULATION_MODULES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Spares {
	static void Spares_Page(WebDriver driver) throws InterruptedException  {
		
		//click on Spares
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[11]")).click();  
        Thread.sleep(2000);
		
		//clear data
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
		Thread.sleep(2000);
		
		//find elements
	    WebElement s1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
	    WebElement s2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
	    WebElement s3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
	    WebElement s4= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
	    WebElement s5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
	    WebElement s6= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
	    WebElement s7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
	    WebElement s8= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
	    WebElement s9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
	    WebElement s10= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
	    WebElement s11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
	    WebElement s12= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
	    WebElement s13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
	    WebElement s14= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
	    WebElement s15= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
	    WebElement s16= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
	    WebElement s17= driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
	    WebElement s18= driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
	    WebElement s19= driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
	    WebElement s20= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
	    WebElement s21= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
	    WebElement s22= driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
	    WebElement s23= driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
	    WebElement s24= driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
	    WebElement s25= driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
	    WebElement s26= driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
	    WebElement s27= driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
	    WebElement s28= driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
	    WebElement s29= driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
	    WebElement s30= driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
	    WebElement s31= driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
	    WebElement s32= driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
	    WebElement s33= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
	    WebElement s34= driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
	    WebElement s35= driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
	    WebElement s36= driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
	    WebElement s37= driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
	    WebElement s38= driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
	    WebElement s39= driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
	    WebElement s40= driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
	    WebElement s41= driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
	    WebElement s42= driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
	    WebElement s43= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
	    WebElement s44= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
	    WebElement s45= driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
	    WebElement s46= driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
	    WebElement s47= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
	    WebElement s48= driver.findElement(By.xpath("(//*[@type=\"text\"])[48]"));
	    
	    //send values
	    s1.sendKeys("230000089");
	    s3.sendKeys("4300065");
	    s5.sendKeys("77000089");
	    s6.sendKeys("49000034");
	    s8.sendKeys("29945903");
	    s9.sendKeys("23000");
	    s10.sendKeys("43000");
	    s11.sendKeys("93000");
	    s12.sendKeys("93000");
	    s13.sendKeys("8300");
	    s14.sendKeys("1300");
	    s15.sendKeys("23000");
	    s16.sendKeys("2350");
	    s17.sendKeys("4367098");
	    s18.sendKeys("23076");
	    s19.sendKeys("73754");
	    s23.sendKeys("2308909");
	    s25.sendKeys("230654");
	    s27.sendKeys("6307860");
	    s29.sendKeys("43780");
	    s35.sendKeys("1365078");
	    s37.sendKeys("230876");
	    s39.sendKeys("730987");
	    s41.sendKeys("23564");
	    	    
	    //convert to longegers
	    Thread.sleep(2000);
	    long sp1= Long.parseLong(s1.getAttribute("value"));
	    long sp2= Long.parseLong(s2.getAttribute("value"));
	    long sp3= Long.parseLong(s3.getAttribute("value"));
	    long sp4= Long.parseLong(s4.getAttribute("value"));
	    long sp5= Long.parseLong(s5.getAttribute("value"));
	    long sp6= Long.parseLong(s6.getAttribute("value"));
	    long sp7= Long.parseLong(s7.getAttribute("value"));
	    long sp8= Long.parseLong(s8.getAttribute("value"));
	    long sp9= Long.parseLong(s9.getAttribute("value"));
	    long sp10= Long.parseLong(s10.getAttribute("value"));
	    long sp11= Long.parseLong(s11.getAttribute("value"));
	    long sp12= Long.parseLong(s12.getAttribute("value"));
	    long sp13= Long.parseLong(s13.getAttribute("value"));
	    long sp14= Long.parseLong(s14.getAttribute("value"));
	    long sp15= Long.parseLong(s15.getAttribute("value"));
	    long sp16= Long.parseLong(s16.getAttribute("value"));
	    long sp17= Long.parseLong(s17.getAttribute("value"));
	    long sp18= Long.parseLong(s18.getAttribute("value"));
	    long sp19= Long.parseLong(s19.getAttribute("value"));
	    long sp20= Long.parseLong(s20.getAttribute("value"));
	    long sp21= Long.parseLong(s21.getAttribute("value"));
	    long sp22= Long.parseLong(s22.getAttribute("value"));
	    long sp23= Long.parseLong(s23.getAttribute("value"));
	    long sp24= Long.parseLong(s24.getAttribute("value"));
	    long sp25= Long.parseLong(s25.getAttribute("value"));
	    long sp26= Long.parseLong(s26.getAttribute("value"));
	    long sp27= Long.parseLong(s27.getAttribute("value"));
	    long sp28= Long.parseLong(s28.getAttribute("value"));
	    long sp29= Long.parseLong(s29.getAttribute("value"));
	    long sp30= Long.parseLong(s30.getAttribute("value"));
	    long sp31= Long.parseLong(s31.getAttribute("value"));
	    long sp32= Long.parseLong(s32.getAttribute("value"));
	    long sp33= Long.parseLong(s33.getAttribute("value"));
	    long sp34= Long.parseLong(s34.getAttribute("value"));
	    long sp35= Long.parseLong(s35.getAttribute("value"));
	    long sp36= Long.parseLong(s36.getAttribute("value"));
	    long sp37= Long.parseLong(s37.getAttribute("value"));
	    long sp38= Long.parseLong(s38.getAttribute("value"));
	    long sp39= Long.parseLong(s39.getAttribute("value"));
	    long sp40= Long.parseLong(s40.getAttribute("value"));
	    long sp41= Long.parseLong(s41.getAttribute("value"));
	    long sp42= Long.parseLong(s42.getAttribute("value"));
	    long sp43= Long.parseLong(s43.getAttribute("value"));
	    long sp44= Long.parseLong(s44.getAttribute("value"));
	    long sp45= Long.parseLong(s45.getAttribute("value"));
	    long sp46= Long.parseLong(s46.getAttribute("value"));
	    long sp47= Long.parseLong(s47.getAttribute("value"));
	    long sp48= Long.parseLong(s48.getAttribute("value"));
	    
	    //save data
	    Thread.sleep(3000);
	  	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
	    
	    System.out.println("Data is saved");
//.................................................................................................	    
	    //Navigate to Manpower Cost Page
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")).click();
	    Thread.sleep(2000);
		WebElement mp1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[60]")); //  Spares - Total Manpower Cost Page
		Thread.sleep(2000);
		String mpcost1 = mp1.getAttribute("value");    
		//System.out.println("ManPower Cost Page- Spares Manpower Cost auto populated cell: "+ mpcost1);
	    
		//navigate to Interest Cost page
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[4]")).click();
		Thread.sleep(2000);
		WebElement ic1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[44]")); //  Spares- Interest Cost page
		Thread.sleep(2000);
		String icst = ic1.getAttribute("value");    
		//System.out.println("Interest Cost Page- ST Spares auto populated cell: "+ icst);
		
		//navigate to Service Page
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[12]")).click();
		Thread.sleep(2000);
	    WebElement QS1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")); //Quantity-Paid & Running Repairs Load (Workshop)
		Thread.sleep(2000);
		String quantity1 = QS1.getAttribute("value");   
		//System.out.println("Quantity- Paid & Running Repairs Load (Workshop) in SERVICE page: "+ quantity1);
		double Q1= Double.parseDouble(QS1.getAttribute("value"));
		
		WebElement QS2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
		Thread.sleep(2000);
		String quantity2 = QS2.getAttribute("value");   
		//System.out.println("Quantity- Bodyshop Load in SERVICE page: "+ quantity2);
		double Q2= Double.parseDouble(QS2.getAttribute("value"));
		
		//Navigate to New Car
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();
		Thread.sleep(2000);
	    WebElement QN1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // New Car Quantity
		Thread.sleep(2000);
		String QNC = QN1.getAttribute("value"); // Or another attribute name   
		System.out.println("Quantity- Auto populated cell in New Car page: "+QNC);
		double Q3= Double.parseDouble(QN1.getAttribute("value"));
				 
		//navigate back to Spares Page
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[11]")).click();
		Thread.sleep(2000);
		WebElement sm1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));         
	    // Get the attribute value from the second module's web element	          
	    String smp1 = sm1.getAttribute("value"); 
        System.out.println("Manpower Cost for Spares- Auto populated cell in Spares: "+smp1);	          
	    if(smp1.equals(mpcost1)) 
	      {
	         System.out.println("Valid: "+smp1);          	
	      }
	    else 
	      {
	         System.out.println("Invalid: "+smp1);          	          	          	
	      }
	    //.............................................................................................    
	    WebElement sic1= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
	    String spic1= sic1.getAttribute("value");
	    System.out.println("ST Interest Cost for Spares- Auto populated cell in Spares: "+ spic1);
	    if(spic1.equals(icst)) 
	      {
	        System.out.println("Valid: "+spic1);          	
	      }
	    else 
	      {
	        	System.out.println("Invalid: "+spic1);          	          	          	
	      }
	    
	    //.............................................................................................	   
	    Thread.sleep(3000);
	    double exp1= sp1/Q1 ;
		long roundedexp1 = Math.round(exp1);  //calculate Sales per load- Spares Sales :Workshop
		    
		//Verify if result is as expected
		if(sp2==roundedexp1) 
		  {
			 System.out.println("Spares Sales :Workshop- Sales per Load auto populated cell displays correct value- PASS=  " +roundedexp1);  
		  }
		else
		  {
			 System.out.println("Spares Sales :Workshop- Sales per Load auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp1);		   
		  }
		//.............................................................................................				
	    double exp2= sp3/Q2 ;
		long roundedexp2 = Math.round(exp2);   //calculate Sales per load- Spares Sales :Bodyshop
		    
		//Verify if result is as expected
		if(sp4==roundedexp2) 
		  {
			 System.out.println("Spares Sales :Bodyshop- Sales per Load auto populated cell displays correct value- PASS=  " +roundedexp2);  
		  }
		else
		  {
			 System.out.println("Spares Sales :Bodyshop- Sales per Load auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp2);		   
		  }
	    //..................................................................................................
		long exp3= sp1+sp3+sp5+sp6 ;		    
		//Verify if result is as expected
		if(sp7==exp3) 
		  {
			 System.out.println("Total Spares Sales Formula cell displays correct value- PASS=  " +exp3);  
		  }
		else
		  {
			 System.out.println("Total Spares Sales Formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp3);		   
		  }
	    //....................................................................................................
		long Add1= sp8+sp11+sp14+sp17;
		long Add2= sp9+sp12+sp15+sp18;
		long Sub3= sp10+sp13+sp16+sp19;
		long Add3= Add1+Add2;
		long exp4= Add3-Sub3;  // calculate Cost Of Goods Sold
		//Verify if result is as expected
	    if(sp20==exp4) 
		  {
			System.out.println("Cost of Goods Sold [A+B-C]- Formula cell displays correct value- PASS=  " +exp4);  
		  }
		else
		  {
			System.out.println("Cost of Goods Sold[A+B-C]- Formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp4);		   
		  }
	    //.....................................................................................................
	    long exp5= sp7-sp20 ;		    //calculate Spares Margin (Sales - Cost of Goods Sold)	
		//Verify if result is as expected
		if(sp21==exp5) 
		  {
			 System.out.println("Spares Margin from Income- Formula cell displays correct value- PASS=  " +exp5);  
		  }
		else
		  {
			 System.out.println("Spares Margin from Income- Formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp5);		   
		  }
		//.........................................................................................................
		double exp6= sp21/Q3 ;
		long roundedexp6 = Math.round(exp6);   //calculate Per New Car Income- Spares Margin		    
		//Verify if result is as expected
		if(sp22==roundedexp6) 
		  {
			 System.out.println("Spares Margin- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp6);  
		  }
		else
		  {
			 System.out.println("Spares Margin- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp6);		   
		  }
		//................................................................................................................
		double exp7= sp23/Q3 ;
		long roundedexp7 = Math.round(exp7);   //calculate Per new Car- Incentive from Spare parts	    
		//Verify if result is as expected
		if(sp24==roundedexp7) 
		  {
			 System.out.println("Incentive from Spare parts- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp7);  
		  }
		else
		  {
			 System.out.println("Incentive from Spare parts- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp7);		   
		  }
		//..........................................................................................................................
		double exp8= sp25/Q3 ;
		long roundedexp8 = Math.round(exp8);   //calculate Per new Car-Spare Parts Warranty Claims  
		//Verify if result is as expected
		if(sp26==roundedexp8) 
		  {
			 System.out.println("Spare Parts Warranty Claims- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp8);  
		  }
		else
		  {
			 System.out.println("Spare Parts Warranty Claims- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp8);		   
		  }
	    //.................................................................................................................................
		double exp9= sp27/Q3 ;
		long roundedexp9 = Math.round(exp9);   //calculate Per new Car- Scrap Sales	    
		//Verify if result is as expected
		if(sp28==roundedexp9) 
		  {
			 System.out.println("Scrap Sales- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp9);  
		  }
		else
		  {
			 System.out.println("Scrap Sales- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp9);		   
		  }
	    //.......................................................................................................................................
		double exp10= sp29/Q3 ;
		long roundedexp10 = Math.round(exp10);   //calculate per new car- Any other Spares Income	    
		//Verify if result is as expected
		if(sp30==roundedexp10) 
		  {
			 System.out.println("Any other Spares Income- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp10);  
		  }
		else
		  {
			 System.out.println("Any other Spares Income- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp10);		   
		  }
		//.......................................................................................................................................
		double exp11= sp31/Q3 ;
		long roundedexp11 = Math.round(exp11);   //calculate per new car- Manpower Cost 	    
		//Verify if result is as expected
		if(sp32==roundedexp11) 
		  {
			 System.out.println("Manpower Cost- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp11);  
		  }
		else
		  {
			 System.out.println("Manpower Cost- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp11);		   
		  }
		//.....................................................................................................................................
		double exp12= sp33/Q3 ;
		long roundedexp12 = Math.round(exp12);   //calculate per new car- Short term Interest Cost	    
		//Verify if result is as expected
		if(sp34==roundedexp12) 
		  {
			 System.out.println("Short term Interest Cost- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp12);  
		  }
		else
		  {
			 System.out.println("Short term Interest Cost- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp12);		   
		  }
		//.......................................................................................................................................
		double exp13= sp35/Q3 ;
		long roundedexp13 = Math.round(exp13);   //calculate per new car- Discount (Bill discount)    
		//Verify if result is as expected
		if(sp36==roundedexp13) 
		  {
			 System.out.println("Discount (Bill discount)- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp13);  
		  }
		else
		  {
			 System.out.println("Discount (Bill discount)- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp13);		   
		  }
		//..........................................................................................................................................
		double exp14= sp37/Q3 ;
		long roundedexp14 = Math.round(exp14);   //calculate per new car- Discount (through Workshop/Bodyshop)	    
		//Verify if result is as expected
		if(sp38==roundedexp14) 
		  {
			 System.out.println("Discount (through Workshop/Bodyshop)- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp14);  
		  }
		else
		  {
			 System.out.println("Discount (through Workshop/Bodyshop)- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp14);		   
		  }
		//................................................................................................................................................
		double exp15= sp39/Q3 ;
		long roundedexp15 = Math.round(exp15);   //calculate per new car- Discount (any others)	    
		//Verify if result is as expected
		if(sp40==roundedexp15) 
		  {
			 System.out.println("Discount (any others)- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp15);  
		  }
		else
		  {
			 System.out.println("Discount (any others)- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp15);		   
		  }
		//.................................................................................................................................................
		double exp16= sp41/Q3 ;
		long roundedexp16 = Math.round(exp16);   //calculate per new car-Any other Expense (Spares only)    
		//Verify if result is as expected
		if(sp42==roundedexp16) 
		  {
			 System.out.println("Any other Expense- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp16);  
		  }
		else
		  {
			 System.out.println("Any other Expense- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +roundedexp16);		   
		  }
		//..................................................................................................................................................
		long exp17= sp21+sp23+sp25+sp27+sp29 ;		    // calculate Total Spares Income
		//Verify if result is as expected
		if(sp43==exp17) 
		  {
			 System.out.println("Total Spares Income- Formula cell displays correct value- PASS=  " +exp17);  
		  }
		else
		  {
			 System.out.println("Total Spares Income- Formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp17);		   
		  }
		//...................................................................................................................................................
		double exp18= sp43/Q3 ;
		long roundedexp18 = Math.round(exp18);   //calculate Total Spares- Per new Car Income    
		//Verify if result is as expected
		if(sp44==roundedexp18) 
		  {
			 System.out.println("Any other Expense- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp18);  
		  }
		else
		  {
			 System.out.println("Any other Expense- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp18);		   
		  }
		//.......................................................................................................................................................
		long exp19= sp31+sp33+sp35+sp37+sp39+sp41 ;			// calculate Total Spares Direct Expense	   
		//Verify if result is as expected
		if(sp47==exp19) 
		  {
			 System.out.println("Total Spares Direct Expense- Formula cell displays correct value- PASS=  " +exp19);  
		  }
		else
		  {
			 System.out.println("Total Spares Direct Expense- Formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp19);		   
		  }
		//.........................................................................................................................................................
		double exp20= sp47/Q3 ;
		long roundedexp20 = Math.round(exp20);   //calculate Total Spares Direct Expense	- Per new Car    
		//Verify if result is as expected
		if(sp48==roundedexp20) 
		  {
			 System.out.println("Total Spares Direct Expense	- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp20);  
		  }
		else
		  {
			 System.out.println("Total Spares Direct Expense	- Per new Car auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp20);		   
		  }
		//..........................................................................................................................................
		long exp21= sp43-sp47  ;			// calculate Net earning from Spares   
		//Verify if result is as expected
		if(sp45==exp21) 
		  {
			 System.out.println("Net earning from Spares- Formula cell displays correct value- PASS=  " +exp21);  
		  }
		else
		  {
			 System.out.println("Net earning from Spares- Formula cell displays incorrect value- FAIL= " +exp21);		   
		  }
		//...................................................................................................................................................
		double exp22= sp45/Q3 ;
		long roundedexp22 = Math.round(exp22);   //calculate Net earning from Spares- Per new Car    
		//Verify if result is as expected
		if(sp46==roundedexp22) 
		  {
			 System.out.println("Net earning from Spares- Per new Car auto populated cell displays correct value- PASS=  " +roundedexp22);  
		  }
		else
		  {
			 System.out.println("Net earning from Spares	- Per new Car auto populated cell displays incorrect value- FAIL= " +roundedexp22);		   
		  }		
				System.out.println(".............E.....N......D...............................................");
	}

}
