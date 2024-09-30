package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Maruti_Insurance {
static void MIR_Page(WebDriver driver) throws InterruptedException  {
	
	  //click on MI Renewal
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[8]")).click();
    Thread.sleep(2000);

//	//clear data first
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	Thread.sleep(2000);
	
	//find elements
	WebElement mi1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement mi2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));		
	WebElement mi4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));		
	WebElement mi6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));					
			
//	//send values
//	mi1.sendKeys("100");
//	mi2.sendKeys("80005455");
//	mi4.sendKeys("84870067");
//	mi6.sendKeys("1098954");
	
//	//save data
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	
	//check auto populated cells
	//Navigate to New Car
	Thread.sleep(2000);
    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();
	Thread.sleep(2000);
    WebElement QN1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // New Car Quantity
	Thread.sleep(2000);
	String quantity1 = QN1.getAttribute("value"); // Or another attribute name   
	System.out.println("Quantity- Auto populated cell in New Car page: "+ quantity1);
	double Q1= Double.parseDouble(QN1.getAttribute("value"));
	
	//Navigate back to MI Renewal Page
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[8]")).click();
	WebElement miq2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement mi3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement miq4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement mi5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement miq6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement mi7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement mi16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	WebElement mi17= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	
    long mirq2= Long.parseLong(miq2.getAttribute("value"));
	long mirq4 = Long.parseLong(miq4.getAttribute("value"));		
	long mirq6 = Long.parseLong(miq6.getAttribute("value"));		
	long mir16= Long.parseLong(mi16.getAttribute("value"));
					
	//calculate Insurance Renewal* Per New Car Income- auto populated cell
	double exp1= mirq2/Q1 ;
	long roundedexp1 = Math.round(exp1);
	    
	//get the value from automated cell
	long act1= Long.parseLong(mi3.getAttribute("value"));
	    
	//Verify if result is as expected
	if(act1==roundedexp1) 
	  {
		 System.out.println("Insurance Renewal*- Per New Car Income auto populated cell displays correct value- PASS=  " +roundedexp1);  
	  }
	else
	  {
		 System.out.println("Insurance Renewal*- Per New Car Income auto populated cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +roundedexp1);		   
	  }
	 
	//calculate Insurance Renewal Commission# Per new car income- auto populated cell
	double exp2= mirq4/Q1 ;
	long roundedexp2 = Math.round(exp2);
	    
	//get the value from automated cell
	long act2= Long.parseLong(mi5.getAttribute("value"));
	    
	//Verify if result is as expected
	if(act2==roundedexp2) 
	  {
		 System.out.println("Insurance Renewal Commission#- Per New Car Income auto populated cell displays correct value- PASS=  " +roundedexp2);  
	  }
	else
	  {
		 System.out.println("Insurance Renewal Commission#- Per New Car Income auto populated cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +roundedexp2);		   
	  }
	 
	//calculate Any other Income Per new car income- auto populated cell
	double exp3= mirq6/Q1 ;
	long roundedexp3 = Math.round(exp3);
	    
	//get the value from automated cell
	long act3= Long.parseLong(mi7.getAttribute("value"));
	    
	//Verify if result is as expected
	if(act3==roundedexp3) 
	  {
		 System.out.println("Any other Income- Per New Car Income auto populated cell displays correct value- PASS=  " +roundedexp3);  
	  }
    else
	  {
		 System.out.println("Any other Income- Per New Car Income auto populated cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +roundedexp3);		   
	  }
	 
	//calculate Total MI Renewal Income [A]- Formula cell    
	long exp4= mirq4+mirq6;
	    
	//get the value from automated cell
	long act4= Long.parseLong(mi16.getAttribute("value"));
	    
	//Verify if result is as expected
	if(act4==exp4) 
	   {
		 System.out.println("Total MI Renewal Income [A] formula cell displays correct value- PASS=  " +exp4);  
	   }
	else
	   {
		   System.out.println("Total MI Renewal Income [A] formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>. FAIL= " +exp4);
	   }
	   
	//calculate Per new Car income of [A]- auto populated cell
	double exp5= mir16/Q1 ;
	long roundedexp5 = Math.round(exp5);
	    
	//get the value from automated cell
	long act5= Long.parseLong(mi17.getAttribute("value"));
		    
    //Verify if result is as expected
	if(act5==roundedexp5) 
	  {
		 System.out.println("Per new Car income of [A]- auto populated cell displays correct value- PASS=  " +roundedexp5);  
	  }
	else
	  {
	     System.out.println("Per new Car income of [A]- auto populated cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +roundedexp5);		   
	  }
	   
	//To verify Manpower Cost- auto populated cell
	//Navigate to Manpower Cost page
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")).click();
	Thread.sleep(2000);
	WebElement MP1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[30]")); //  MIR -Manpower Cost Page
	Thread.sleep(2000);
	String mpcost1 = MP1.getAttribute("value");    
	System.out.println("ManPower Cost Page- Manpower Cost auto populated cell: "+ mpcost1);
	   
    //Navigate to MI Renewal again        
	Thread.sleep(4000);		  
	WebElement MI1 = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[8]")); // Adjust locator
	Thread.sleep(2000);	   
	MI1.click();
	Thread.sleep(1000);		            
	WebElement mi9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]")); // MIR Manpower Cost (Salary & Incentive)                      
	// Get the attribute value from the second module's web element     
	String micost1 = mi9.getAttribute("value"); 
	System.out.println("MI Renewal Page- Manpower Cost auto populated cell: "+ micost1);     
	if(micost1.equals(mpcost1)) 
	  {
	     System.out.println("Valid: Manpower Cost auto populated cell is correctly auto populated: "+micost1);          	
	  }
	else 
	  {
	     System.out.println(" Manpower Cost auto populated cell is NOT correctly auto populated:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Invalid: "+micost1);   
	  }
	   
	Thread.sleep(2000);
    // WebElement mi9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	WebElement mi10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	long mir9= Long.parseLong(mi9.getAttribute("value"));
	//calculate per new car expense of Manpower Cost- auto populated cell
	double exp6= mir9/Q1 ;
	long roundedexp6 = Math.round(exp6);
	    
    //get the value from automated cell
	long act6= Long.parseLong(mi10.getAttribute("value"));
		    
	//Verify if result is as expected
	if(act6==roundedexp6) 
	  {
		 System.out.println("Manpower Cost- Per new Car income auto populated cell displays correct value- PASS=  " +roundedexp6);  
	  }
	else
	  {
		 System.out.println("Manpower Cost- Per new Car income auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp6);		   
	  }
	   
	 //navigate to longerest Cost page
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[4]")).click();
	 Thread.sleep(2000);
	 WebElement IC1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[46]")); //  MIR- longerest Cost page
	 Thread.sleep(2000);
	 String icmir = IC1.getAttribute("value");    
	 System.out.println("longerest Cost Page- ST MIR auto populated cell: "+ icmir);
	   
	 //Navigate to MI Renewal again        
	 Thread.sleep(4000);		  
	 WebElement MI2 = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[8]")); // Adjust locator
	 Thread.sleep(2000);	   
	 MI2.click();
	 Thread.sleep(1000);		            
	 WebElement mi11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")); // MIR Page- Short term longerest Cost	
	 double mir11= Double.parseDouble(mi11.getAttribute("value"));
	 // Get the attribute value from the second module's web element     
	 String ic11 = mi11.getAttribute("value"); 
	 System.out.println("MI Renewal Page- Short term longerest Cost auto populated cell: "+ ic11);     
	 if(ic11.equals(icmir)) 
	   {
	      System.out.println("Valid: Short term longerest Cost auto populated cell is correctly auto populated: "+ic11);          	
	   }
	 else 
	   {
	      System.out.println("Invalid: Short term longerest Cost auto populated cell is NOT correctly auto populated:>>>>>>>>>>>>>>>>>>>>>Invalid = "+ic11);		     	
	   }
	     
	  //calculate per new car expense of Short Term IC
	  Thread.sleep(2000);	  
      WebElement mi12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));			   
		   
      double exp7= mir11/Q1 ;
      long roundedexp7 = Math.round(exp7);
		    
      //get the value from automated cell
      long act7= Long.parseLong(mi12.getAttribute("value"));
			    
      //Verify if result is as expected
	  if(act7==roundedexp7) 
	    {
		   System.out.println("Short term IC- Per new Car income auto populated cell displays correct value- PASS=  " +roundedexp7);  
	    }
	   else
	    {
		   System.out.println("Short term IC- Per new Car income auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp7);		   
	    }
		   
		//calculate per new car income of -Any other Expense
		Thread.sleep(2000);
		WebElement miq13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		miq13.sendKeys("1009803");
		WebElement mi14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));	
		   
		double mirq13= Double.parseDouble(miq13.getAttribute("value"));
		//calculate per new car expense of Manpower Cost- auto populated cell
		double exp8= mirq13/Q1 ;
		long roundedexp8 = Math.round(exp8);
		    
		//get the value from automated cell
		long act8= Long.parseLong(mi14.getAttribute("value"));
			    
		//Verify if result is as expected
		if(act8==roundedexp8) 
		  {
		     System.out.println("Any Other Expense- Per new Car income auto populated cell displays correct value- PASS=  " +roundedexp8);  
		  }
		else
		  {
		     System.out.println("Any Other Expense- Per new Car income auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp8);		   
		  }
		   
		   //calculate -Total MI Direct Expense [B]	
		   WebElement miB9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
		   WebElement miB11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
		   WebElement miB13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
		   WebElement mi22= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
		   long miBT9= Long.parseLong(miB9.getAttribute("value"));
		   long miBT11= Long.parseLong(miB11.getAttribute("value"));
		   long miBT13= Long.parseLong(miB13.getAttribute("value"));
		   long mir22= Long.parseLong(mi22.getAttribute("value"));
		   long exp9= miBT9+miBT11+miBT13;
		   			    
		   //get the value from automated cell
		   long act9= Long.parseLong(mi22.getAttribute("value"));
			    
		   //Verify if result is as expected
		   if(act9==exp9) 
			 {
			    System.out.println("Total Direct Expense[B]- Amount formula cell displays correct value- PASS=  " +exp9);  
			 }
		   else
			 {
				System.out.println("Total Direct Expense[B]- Amount formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp9);		   
			 }
		   
		   //calculate per new car expense of [B]
		   WebElement mi23= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
		   double exp10= mir22/Q1 ;
		   long roundedexp10 = Math.round(exp10);
		    
		   //get the value from automated cell
		   long act10= Long.parseLong(mi23.getAttribute("value"));
			    
		   //Verify if result is as expected
		   if(act10==roundedexp10) 
			 {
			    System.out.println("Total Direct Expense[B]- Per new Car income auto populated cell displays correct value- PASS=  " +roundedexp10);  
			 }
		   else
			 {
				System.out.println("Total Direct Expense[B]- Per new Car income auto populated cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +roundedexp10);	
			 }
				
	       //calculate Net Earning MI Renewal= [A]-[B]
		   WebElement miB16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
		   WebElement mi19= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		   WebElement mi20= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
		   long mir19= Long.parseLong(mi19.getAttribute("value"));
		   long miBT16= Long.parseLong(miB16.getAttribute("value"));
		   
		   long exp11= miBT16-mir22 ;
					    
		   //get the value from automated cell
		   long act11= Long.parseLong(mi19.getAttribute("value"));
					    
		   //Verify if result is as expected
		    if(act11==exp11) 
			  {
			     System.out.println("Net Earning MI Renewal- Amount Formula cell displays correct value- PASS=  " +exp11);  
			  }
		    else
			  {
				 System.out.println("Net Earning MI Renewal- Amount Formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.. FAIL= " +exp11);													
			  }
		    
		    //calculate per new car income of [A]-[B]
		    double exp12= mir19/Q1 ;
			long roundedexp12 = Math.round(exp12);
			    
			//get the value from automated cell
			long act12= Long.parseLong(mi20.getAttribute("value"));
				    
			//Verify if result is as expected
			if(act12==roundedexp12) 
		      {
				 System.out.println("Net Earning MI Renewal- Per new Car income auto populated cell displays correct value- PASS=  " +roundedexp12);  
			  }
			 else
			  {
			     System.out.println("Net Earning MI Renewal- Per new Car income auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp12);			    
			  }
			   
			System.out.println("...................E..N..D........................................");
//			 //save data
//			 Thread.sleep(2000);
//			 driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//			 Thread.sleep(2000);
//			 driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//			   
			  		   
			 }  

}
