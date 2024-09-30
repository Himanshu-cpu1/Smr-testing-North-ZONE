package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManpowerCost {	
	static void MPCost_Page(WebDriver driver) throws InterruptedException  {
		
		//click on Manpower Cost option
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")).click();  
        Thread.sleep(2000);
        
        System.out.println("........................Manpower cost...............................................");
        System.out.println(".................................................................................................");

//		//clear data first
//		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//		Thread.sleep(2000);
		//.............................................................................................................................................			
		//MPCost>NewCar elements
		WebElement c1= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
		WebElement c2= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
		WebElement c3= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
		WebElement c4= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
		WebElement c5= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
		WebElement c6= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
		WebElement c7= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
		
		//send values
		Thread.sleep(3000);
//		c1.sendKeys("10000");
//		c2.sendKeys("1000");
//		c3.sendKeys("20000");
//		c4.sendKeys("1000");
		
		//convert longo longegers
		long mpc1= Long.parseLong(c1.getAttribute("value"));
		long mpc2= Long.parseLong(c2.getAttribute("value"));
		long mpc3= Long.parseLong(c3.getAttribute("value"));
		long mpc4= Long.parseLong(c4.getAttribute("value"));
		long mpc5= Long.parseLong(c5.getAttribute("value"));
		long mpc6= Long.parseLong(c6.getAttribute("value"));
		long mpc7= Long.parseLong(c7.getAttribute("value"));
		//.............................................................................................................
		//calculation>New Car>Total Salary
		long expresult1= mpc1+mpc3;
		
	  	//get the value from automated cell
	  	long actresult1= Long.parseLong(c5.getAttribute("value"));
	  	
	 
	  	
	  	//Verify if result is as expected
	 	if(actresult1==expresult1) 
	 	  {
	 		System.out.println("New Car-Total Salary formula cell displays expected value- PASS=  " +expresult1);  
	 	  }
	 	else
	 	  {
	 		System.out.println("New Car-Total Salary formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   FAIL= " +expresult1);
	 	  }
	 	//.............................................................................................................
	 	//calculation>New Car>Total Incentive
	 	long expresult2= mpc2+mpc4;
	 			
	 	//get the value from automated cell
	 	long actresult2= Long.parseLong(c6.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult2==expresult2) 
	 	  {
	 		 System.out.println("New Car-Total Incentive formula cell displays expected value- PASS=  " +expresult2);  
	 	  }
	    else
	 	  {
	 		 System.out.println("New Car-Total Incentive formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult2);
	 	  }
	 	//.........................................................................................................................................
	 	//Calculation>New Car>Total MP Cost
	 	long expresult3= mpc5+mpc6;
			
	 	//get the value from automated cell
	 	long actresult3= Long.parseLong(c7.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult3==expresult3) 
	 	  {
	 		 System.out.println("New Car-Total MP Cost formula cell displays expected value- PASS=  " +expresult3);  
	 	  }
	    else
	 	  {
	 		 System.out.println("New Car-Total MP Cost formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult3);
	 	  }
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	
	 	//.....................................................................................................................................
	 	//MP Cost>MDS elements
	 	WebElement c8= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
	 	WebElement c9= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
	 	WebElement c10= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
	 	WebElement c11= driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
	 	WebElement c12= driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
	 	WebElement c13= driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
	 	WebElement c14= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
	 	
	 	//send values
//	 	c8.sendKeys("20000");
//	 	c9.sendKeys("2000");
//	 	c10.sendKeys("30000");
//	 	c11.sendKeys("1500");
	 	
	 	//convert longo longegers
	 	long mpc8= Long.parseLong(c8.getAttribute("value"));
	 	long mpc9= Long.parseLong(c9.getAttribute("value"));
	 	long mpc10= Long.parseLong(c10.getAttribute("value"));
	 	long mpc11= Long.parseLong(c11.getAttribute("value"));
	 	long mpc12= Long.parseLong(c12.getAttribute("value"));
	 	long mpc13= Long.parseLong(c13.getAttribute("value"));
	 	long mpc14= Long.parseLong(c14.getAttribute("value"));
	 	//..........................................................................................................................................
	 	//Calculation>MDS>Total Salary
	 	long expresult4= mpc8+mpc10;
		
	  	//get the value from automated cell
	 	long actresult4= Long.parseLong(c12.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult4==expresult4) 
	 	  {
	 		System.out.println("MDS-Total Salary formula cell displays expected value- PASS=  " +expresult4);  
	 	  }
	 	else
	 	  {
	 		System.out.println("MDS-Total Salary formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult4);
	 	  }
	 	//..........................................................................................................................................................
	 	//calculation>MDS>Total Incentive
	 	long expresult5= mpc9+mpc11;
	 			
	 	//get the value from automated cell
	 	long actresult5= Long.parseLong(c13.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult5==expresult5) 
	 	  {
	 		 System.out.println("MDS-Total Incentive formula cell displays expected value- PASS=  " +expresult5);  
	 	  }
	    else
	 	  {
	 		 System.out.println("MDS-Total Incentive formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult5);
	 	  }
	 	//.............................................................................................................................................................
	 	//Calculation>MDS>Total MP Cost
	 	long expresult6= mpc12+mpc13;
			
	 	//get the value from automated cell
	 	long actresult6= Long.parseLong(c14.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult6==expresult6) 
	 	  {
	 		 System.out.println("MDS-Total MP Cost formula cell displays expected value- PASS=  " +expresult6);  
	 	  }
	    else
	 	  {
	 		 System.out.println("MDS-Total MP Cost formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult6);
	 	  }
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//.............................................................................................................................................................
	 	//MP Cost>MI Renewal elements
	 	WebElement c15= driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
	 	WebElement c16= driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
	 	WebElement c17= driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
	 	WebElement c18= driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
	 	WebElement c19= driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
	 	WebElement c20= driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
	 	WebElement c21= driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
	 	
	 	//send values
//	 	c15.sendKeys("40000");
//	 	c16.sendKeys("4000");
//	 	c17.sendKeys("30000");
//	 	c18.sendKeys("2500");
	 	
	 	//convert longo longegers
	 	long mpc15= Long.parseLong(c15.getAttribute("value"));
	 	long mpc16= Long.parseLong(c16.getAttribute("value"));
	 	long mpc17= Long.parseLong(c17.getAttribute("value"));
	 	long mpc18= Long.parseLong(c18.getAttribute("value"));
	 	long mpc19= Long.parseLong(c19.getAttribute("value"));
	 	long mpc20= Long.parseLong(c20.getAttribute("value"));
	 	long mpc21= Long.parseLong(c21.getAttribute("value"));
	 	//.......................................................................................................................................
	 	//Calculation>MIR>Total Salary
	 	long expresult7= mpc15+mpc17;
		
	  	//get the value from automated cell
	 	long actresult7= Long.parseLong(c19.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult7==expresult7) 
	 	  {
	 		System.out.println("MI Renewal-Total Salary formula cell displays expected value- PASS=  " +expresult7);  
	 	  }
	 	else
	 	  {
	 		System.out.println("MI Renewal-Total Salary formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult7);
	 	  }
	 	//........................................................................................................................................
	 	//calculation>MIR>Total Incentive
	 	long expresult8= mpc16+mpc18;
	 			
	 	//get the value from automated cell
	 	long actresult8= Long.parseLong(c20.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult8==expresult8) 
	 	  {
	 		 System.out.println("MI Renewal-Total Incentive formula cell displays expected value- PASS=  " +expresult8);  
	 	  }
	    else
	 	  {
	 		 System.out.println("MI Renewal-Total Incentive formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.. FAIL= " +expresult8);
	 	  }
	 	//.................................................................................................................................................
	 	//Calculation>MIR>Total MP Cost
	 	long expresult9= mpc19+mpc20;
			
	 	//get the value from automated cell
	 	long actresult9= Long.parseLong(c21.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult9==expresult9) 
	 	  {
	 		 System.out.println("MI Renewal-Total MP Cost formula cell displays expected value- PASS=  " +expresult9);  
	 	  }
	    else
	 	  {
	 		 System.out.println("MI Renewal-Total MP Cost formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult9);
	 	  }
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//.................................................................................................................................................
	 	//MP Cost>MSGA elements
	 	WebElement c22= driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
	 	WebElement c23= driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
	 	WebElement c24= driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
	 	WebElement c25= driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
	 	WebElement c26= driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
	 	WebElement c27= driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
	 	WebElement c28= driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
	 	
	 	//send values
//	 	c22.sendKeys("10000");
//	 	c23.sendKeys("4000");
//	 	c24.sendKeys("30000");
//	 	c25.sendKeys("1500");
//	 	
	 	//convert longo longegers
	 	long mpc22= Long.parseLong(c22.getAttribute("value"));
	 	long mpc23= Long.parseLong(c23.getAttribute("value"));
	 	long mpc24= Long.parseLong(c24.getAttribute("value"));
	 	long mpc25= Long.parseLong(c25.getAttribute("value"));
	 	long mpc26= Long.parseLong(c26.getAttribute("value"));
	 	long mpc27= Long.parseLong(c27.getAttribute("value"));
	 	long mpc28= Long.parseLong(c28.getAttribute("value"));
	 	//........................................................................................................................................................................
	 	//Calculation>MSGA>Total Salary
	 	long expresult10= mpc22+mpc24;
		
	  	//get the value from automated cell
	 	long actresult10= Long.parseLong(c26.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult10==expresult10) 
	 	  {
	 		System.out.println("MSGA-Total Salary formula cell displays expected value- PASS=  " +expresult10);  
	 	  }
	 	else
	 	  {
	 		System.out.println("MSGA-Total Salary formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult10);
	 	  }
	 	//...................................................................................................................................................
	 	//calculation>MSGA>Total Incentive
	 	long expresult11= mpc23+mpc25;
	 			
	 	//get the value from automated cell
	 	long actresult11= Long.parseLong(c27.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult11==expresult11) 
	 	  {
	 		 System.out.println("MSGA-Total Incentive formula cell displays expected value- PASS=  " +expresult11);  
	 	  }
	    else
	 	  {
	 		 System.out.println("MSGA-Total Incentive formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult11);
	 	  }
	 	//......................................................................................................................................................................
	 	//Calculation>MSGA>Total MP Cost
	 	long expresult12= mpc26+mpc27;			
	 	//get the value from automated cell
	 	long actresult12= Long.parseLong(c28.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult12==expresult12) 
	 	  {
	 		 System.out.println("MSGA-Total MP Cost formula cell displays expected value- PASS=  " +expresult12);  
	 	  }
	    else
	 	  {
	 		 System.out.println("MSGA-Total MP Cost formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult12);
	 	  }
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//...................................................................................................................................................................
	 	//MP Cost>True Value elements
	 	WebElement c29= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
	 	WebElement c30= driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
	 	WebElement c31= driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
	 	WebElement c32= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
	 	WebElement c33= driver.findElement(By.xpath("(//*[@type=\"text\"])[48]"));
	 	WebElement c34= driver.findElement(By.xpath("(//*[@type=\"text\"])[49]"));
	 	WebElement c35= driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
	 	
	 	//send values
//	 	c29.sendKeys("50000");
//	 	c30.sendKeys("5000");
//	 	c31.sendKeys("25000");
//	 	c32.sendKeys("5000");
	 	
	 	//convert longo longegers
	 	long mpc29= Long.parseLong(c29.getAttribute("value"));
	 	long mpc30= Long.parseLong(c30.getAttribute("value"));
	 	long mpc31= Long.parseLong(c31.getAttribute("value"));
	 	long mpc32= Long.parseLong(c32.getAttribute("value"));
	 	long mpc33= Long.parseLong(c33.getAttribute("value"));
	 	long mpc34= Long.parseLong(c34.getAttribute("value"));
	 	long mpc35= Long.parseLong(c35.getAttribute("value"));
	 	//.............................................................................................................................................
	 	//Calculation>True Value>Total Salary
	 	long expresult13= mpc29+mpc31;
		
	  	//get the value from automated cell
	 	long actresult13= Long.parseLong(c33.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult13==expresult13) 
	 	  {
	 		System.out.println("True Value-Total Salary formula cell displays expected value- PASS=  " +expresult13);  
	 	  }
	 	else
	 	  {
	 		System.out.println("True Value-Total Salary formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult13);
	 	  }
	 	//...........................................................................................................................................................................
	 	//calculation>True Value>Total Incentive
	 	long expresult14= mpc30+mpc32;
	 			
	 	//get the value from automated cell
	 	long actresult14= Long.parseLong(c34.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult14==expresult14) 
	 	  {
	 		 System.out.println("True Value-Total Incentive formula cell displays expected value- PASS=  " +expresult14);  
	 	  }
	    else
	 	  {
	 		 System.out.println("True Value-Total Incentive formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult14);
	 	  }
	 	//..................................................................................................................................................................................
	 	//Calculation>True Value>Total MP Cost
	 	long expresult15= mpc33+mpc34;
			
	 	//get the value from automated cell
	 	long actresult15= Long.parseLong(c35.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult15==expresult15) 
	 	  {
	 		 System.out.println("True Value-Total MP Cost formula cell displays expected value- PASS=  " +expresult15);  
	 	  }
	    else
	 	  {
	 		 System.out.println("True Value-Total MP Cost formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult15);
	 	  }
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//....................................................................................................................................................................................
	 	//MP Cost>Spares elements
	 	WebElement c36= driver.findElement(By.xpath("(//*[@type=\"text\"])[54]"));
	 	WebElement c37= driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
	 	WebElement c38= driver.findElement(By.xpath("(//*[@type=\"text\"])[56]"));
	 	WebElement c39= driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
	 	WebElement c40= driver.findElement(By.xpath("(//*[@type=\"text\"])[58]"));
	 	WebElement c41= driver.findElement(By.xpath("(//*[@type=\"text\"])[59]"));
	 	WebElement c42= driver.findElement(By.xpath("(//*[@type=\"text\"])[60]"));
	 	
	 	//send values
//	 	c36.sendKeys("28000");
//	 	c37.sendKeys("2500");
//	 	c38.sendKeys("30000");
//	 	c39.sendKeys("2000");
	 	
	 	//convert longo longegers
	 	long mpc36= Long.parseLong(c36.getAttribute("value"));
	 	long mpc37= Long.parseLong(c37.getAttribute("value"));
	 	long mpc38= Long.parseLong(c38.getAttribute("value"));
	 	long mpc39= Long.parseLong(c39.getAttribute("value"));
	 	long mpc40= Long.parseLong(c40.getAttribute("value"));
	 	long mpc41= Long.parseLong(c41.getAttribute("value"));
	 	long mpc42= Long.parseLong(c42.getAttribute("value"));
	 	//...........................................................................................................................................................
	 	//Calculation>Spares>Total Salary
	 	long expresult16= mpc36+mpc38;
		
	  	//get the value from automated cell
	 	long actresult16= Long.parseLong(c40.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult16==expresult16) 
	 	  {
	 		System.out.println("Spares-Total Salary formula cell displays expected value- PASS=  " +expresult16);  
	 	  }
	 	else
	 	  {
	 		System.out.println("Spares-Total Salary formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult16);
	 	  }
	 	//..................................................................................................................................................................
	 	//calculation>Spares>Total Incentive
	 	long expresult17= mpc37+mpc39;
	 			
	 	//get the value from automated cell
	 	long actresult17= Long.parseLong(c41.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult17==expresult17) 
	 	  {
	 		 System.out.println("Spares-Total Incentive formula cell displays expected value- PASS=  " +expresult17);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Spares-Total Incentive formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult17);
	 	  }
	 	//.............................................................................................................................................................................................
	 	//Calculation>Spares>Total MP Cost
	 	long expresult18= mpc40+mpc41;
			
	 	//get the value from automated cell
	 	long actresult18= Long.parseLong(c42.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult18==expresult18) 
	 	  {
	 		 System.out.println("Spares-Total MP Cost formula cell displays expected value- PASS=  " +expresult18);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Spares-Total MP Cost formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>. FAIL= " +expresult18);
	 	  }
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//.............................................................................................................................................................................................
	 	//MP Cost>Service elements
	 	WebElement c43= driver.findElement(By.xpath("(//*[@type=\"text\"])[64]"));
	 	WebElement c44= driver.findElement(By.xpath("(//*[@type=\"text\"])[65]"));
	 	WebElement c45= driver.findElement(By.xpath("(//*[@type=\"text\"])[66]"));
	 	WebElement c46= driver.findElement(By.xpath("(//*[@type=\"text\"])[67]"));
	 	WebElement c47= driver.findElement(By.xpath("(//*[@type=\"text\"])[68]"));
	 	WebElement c48= driver.findElement(By.xpath("(//*[@type=\"text\"])[69]"));
	 	WebElement c49= driver.findElement(By.xpath("(//*[@type=\"text\"])[70]"));
	 	
	 	//send values
//	 	c43.sendKeys("28000");
//	 	c44.sendKeys("2800");
//	 	c45.sendKeys("20000");
//	 	c46.sendKeys("2800");
//	 	
	 	//convert to longegers
	 	long mpc43= Long.parseLong(c43.getAttribute("value"));
	 	long mpc44= Long.parseLong(c44.getAttribute("value"));
	 	long mpc45= Long.parseLong(c45.getAttribute("value"));
	 	long mpc46= Long.parseLong(c46.getAttribute("value"));
	 	long mpc47= Long.parseLong(c47.getAttribute("value"));
	 	long mpc48= Long.parseLong(c48.getAttribute("value"));
	 	long mpc49= Long.parseLong(c49.getAttribute("value"));
	 	//....................................................................................................................................................................
	 	//Calculation>Service>Total Salary
	 	long expresult19= mpc43+mpc45;
		
	  	//get the value from automated cell
	 	long actresult19= Long.parseLong(c47.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult19==expresult19) 
	 	  {
	 		System.out.println("Service-Total Salary formula cell displays expected value- PASS=  " +expresult19);  
	 	  }
	 	else
	 	  {
	 		System.out.println("Service-Total Salary formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult19);
	 	  }
	 	//............................................................................................................................................................................................
	 	//calculation>Service>Total Incentive
	 	long expresult20= mpc44+mpc46;
	 			
	 	//get the value from automated cell
	 	long actresult20= Long.parseLong(c48.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult20==expresult20) 
	 	  {
	 		 System.out.println("Service-Total Incentive formula cell displays expected value- PASS=  " +expresult20);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Service-Total Incentive formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult20);
	 	  }
	 	//...........................................................................................................................................................................................
	 	//Calculation>Service>Total MP Cost
	 	long expresult21= mpc47+mpc48;
			
	 	//get the value from automated cell
	 	long actresult21= Long.parseLong(c49.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult21==expresult21) 
	 	  {
	 		 System.out.println("Service-Total MP Cost formula cell displays expected value- PASS=  " +expresult21);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Service-Total MP Cost formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult21);
	 	  }
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//.....................................................................................................................................................................................................
	 	//MP Cost>Common MP elements
	 	WebElement c50= driver.findElement(By.xpath("(//*[@type=\"text\"])[74]"));
	 	WebElement c51= driver.findElement(By.xpath("(//*[@type=\"text\"])[75]"));
	 	WebElement c52= driver.findElement(By.xpath("(//*[@type=\"text\"])[76]"));
	 	WebElement c53= driver.findElement(By.xpath("(//*[@type=\"text\"])[77]"));
	 	WebElement c54= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]"));
	 	WebElement c55= driver.findElement(By.xpath("(//*[@type=\"text\"])[79]"));
	 	WebElement c56= driver.findElement(By.xpath("(//*[@type=\"text\"])[80]"));
	 	
	 	//send values
//	 	c50.sendKeys("40000");
//	 	c51.sendKeys("400");
//	 	c52.sendKeys("20000");
//	 	c53.sendKeys("800");
	 	
	 	//convert longo longegers
	 	long mpc50= Long.parseLong(c50.getAttribute("value"));
	 	long mpc51= Long.parseLong(c51.getAttribute("value"));
	 	long mpc52= Long.parseLong(c52.getAttribute("value"));
	 	long mpc53= Long.parseLong(c53.getAttribute("value"));
	 	long mpc54= Long.parseLong(c54.getAttribute("value"));
	 	long mpc55= Long.parseLong(c55.getAttribute("value"));
	 	long mpc56= Long.parseLong(c56.getAttribute("value"));
	 	//..................................................................................................................................................
	 	//Calculation>Common MP>Total Salary
	 	long expresult22= mpc50+mpc52;
		
	  	//get the value from automated cell
	 	long actresult22= Long.parseLong(c54.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult22==expresult22) 
	 	  {
	 		System.out.println("Common MP-Total Salary formula cell displays expected value- PASS=  " +expresult22);  
	 	  }
	 	else
	 	  {
	 		System.out.println("Common MP-Total Salary formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult22);
	 	  }
	 	//.....................................................................................................................................................................................
	 	//calculation>Common MP>Total Incentive
	 	long expresult23= mpc51+mpc53;
	 			
	 	//get the value from automated cell
	 	long actresult23= Long.parseLong(c55.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult23==expresult23) 
	 	  {
	 		 System.out.println("Common MP-Total Incentive formula cell displays expected value- PASS=  " +expresult23);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Common MP-Total Incentive formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult23);
	 	  }
	 	//.....................................................................................................................................................................................................
	 	//Calculation>Common MP>Total MP Cost
	 	long expresult24= mpc54+mpc55;
			
	 	//get the value from automated cell
	 	long actresult24= Long.parseLong(c56.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult24==expresult24) 
	 	  {
	 		 System.out.println("Common MP-Total MP Cost formula cell displays expected value- PASS=  " +expresult24);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Common MP-Total MP Cost formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult24);
	 	  }
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//........................................................................................................................................................................................................
	 	//MP Cost>Total elements
	 	WebElement c57= driver.findElement(By.xpath("(//*[@type=\"text\"])[84]"));
	 	WebElement c58= driver.findElement(By.xpath("(//*[@type=\"text\"])[85]"));
	 	WebElement c59= driver.findElement(By.xpath("(//*[@type=\"text\"])[86]"));
	 	WebElement c60= driver.findElement(By.xpath("(//*[@type=\"text\"])[87]"));
	 	WebElement c61= driver.findElement(By.xpath("(//*[@type=\"text\"])[88]"));
	 	WebElement c62= driver.findElement(By.xpath("(//*[@type=\"text\"])[89]"));
	 	WebElement c63= driver.findElement(By.xpath("(//*[@type=\"text\"])[90]"));
	 	 
	 	
	 	//convert longo longegers
	 	long mpc57= Long.parseLong(c57.getAttribute("value"));
	 	long mpc58= Long.parseLong(c58.getAttribute("value"));
	 	long mpc59= Long.parseLong(c59.getAttribute("value"));
	 	long mpc60= Long.parseLong(c60.getAttribute("value"));
	 	long mpc61= Long.parseLong(c61.getAttribute("value"));
	 	long mpc62= Long.parseLong(c62.getAttribute("value"));
	 	long mpc63= Long.parseLong(c63.getAttribute("value"));
	 	//.....................................................................................................................................................................
	 	//Calculation>Total> Total Salary
	 	long expresult25= mpc57+mpc59;
		
	  	//get the value from automated cell
	 	long actresult25= Long.parseLong(c61.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult25==expresult25) 
	 	  {
	 		System.out.println("Total-Total Salary formula cell displays expected value- PASS=  " +expresult25);  
	 	  }
	 	else
	 	  {
	 		System.out.println("Total-Total Salary formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult25);
	 	  }
	 	//.........................................................................................................................................................................................
	 	//calculation>Total>Total Incentive
	 	long expresult26= mpc58+mpc60;
	 			
	 	//get the value from automated cell
	 	long actresult26= Long.parseLong(c62.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult26==expresult26) 
	 	  {
	 		 System.out.println("Total-Total Incentive formula cell displays expected value- PASS=  " +expresult26);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Total-Total Incentive formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult26);
	 	  }
	 	//.........................................................................................................................................................................................
	 	//Calculation>Total>Total MP Cost
	 	long expresult27= mpc61+mpc62;
			
	 	//get the value from automated cell
	 	long actresult27= Long.parseLong(c63.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult27==expresult27) 
	 	  {
	 		 System.out.println("Total-Total MP Cost formula cell displays expected value- PASS=  " +expresult27);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Total-Total MP Cost formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult27);
	 	  }	 
	 	//.......................................................................................................................................................................................
	 	//Calculating Total> Total Salary
	 	long expresult28= mpc5+mpc12+mpc19+mpc26+mpc33+mpc40+mpc47+mpc54;
		
	  	//get the value from automated cell
	 	long actresult28= Long.parseLong(c61.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult28==expresult28) 
	 	  {
	 		System.out.println("Total Salary formula cell displays expected value- PASS=  " +expresult28);  
	 	  }
	 	else
	 	  {
	 		System.out.println("Total Salary formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult28);
	 	  }
	 	//........................................................................................................................................................................................
	 	//calculation>Total>Total Incentive
	 	long expresult29= mpc6+mpc13+mpc20+mpc27+mpc34+mpc41+mpc48+mpc55;
	 			
	 	//get the value from automated cell
	 	long actresult29= Long.parseLong(c62.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult29==expresult29) 
	 	  {
	 		 System.out.println("Total Incentive formula cell displays expected value- PASS=  " +expresult29);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Total Incentive formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  FAIL= " +expresult29);
	 	  }
	 	//......................................................................................................................................................................................
	 	//Calculation>Total>Total MP Cost
	 	long expresult30= mpc7+mpc14+mpc21+mpc28+mpc35+mpc42+mpc49+mpc56;
			
	 	//get the value from automated cell
	 	long actresult30= Long.parseLong(c63.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult30==expresult30) 
	 	  {
	 		 System.out.println("Total Manpower Cost formula cell displays expected value- PASS=  " +expresult30);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Total Manpower Cost formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult30);
	 	  }
	 	{
	 		System.out.println("..........................................................................");
	 	}
	 	{
	 		System.out.println("..............................................................................");
	 	}
	  	//........................................................................................................................................................................................
	 	//calculate Total Manpower Cost Per Car- auto populated cell	 
	 	//Navigate to New Car
        Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();
	 	Thread.sleep(2000);
	    WebElement QN1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // New Car Quantity
	 	Thread.sleep(2000);
	 	String quantity1 = QN1.getAttribute("value"); // Or another attribute name   
	 	System.out.println("Quantity- Auto populated cell in New Car page: "+ quantity1);
	 	double Q1= Long.parseLong(QN1.getAttribute("value"));
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//............................................................................................................................................................................................
	 	//Navigate back to ManPower Cost Page
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")).click();
	 	Thread.sleep(3000);
	 	WebElement cq63= driver.findElement(By.xpath("(//*[@type=\"text\"])[90]"));
	 	WebElement c64= driver.findElement(By.xpath("(//*[@type=\"number\"])"));
	 	long mcq63= Long.parseLong(cq63.getAttribute("value"));
	 		 		 	
	 	double expresult31= mcq63/Q1;
	 	long roundexp31= Math.round(expresult31);
		
	 	//get the value from automated cell
	 	long actresult31= Long.parseLong(c64.getAttribute("value"));
	 		  	
	 	//Verify if result is as expected
	 	if(actresult31==roundexp31) 
	 	  {
	 		 System.out.println("Total Manpower Cost Per Car- auto populated cell displays expected value- PASS=  " +roundexp31);  
	 	  }
	    else
	 	  {
	 		 System.out.println("Total Manpower Cost Per Car- auto populated cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +roundexp31);
	 	  }	 
	 	{
	 		System.out.println("..............................................................................");
	 	}
	 	//......................................................................................................................................................................................
//	 	//save data
//	 	Thread.sleep(2000);
//	 	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	 	Thread.sleep(2000);
//	 	driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	 	Thread.sleep(2000); 	
	 	//..........................................................................................................................................................................................	 	
	 	//To check the value of auto populated cells is correctly auto populated or not.
	    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[5]")).click();           //Navigate to Manpower Count sheet
	    Thread.sleep(2000);
	    WebElement MP1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]")); // New Car Direct Manpower Count
	    Thread.sleep(2000);
	    String count1 = MP1.getAttribute("value");    
	    System.out.println("New Car- Direct ManPower Count auto populated cell: "+ count1);
	    
	    Thread.sleep(2000);
	    WebElement MP2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]")); // New Car Indirect Manpower Count
	    Thread.sleep(2000);
	    String count2 = MP2.getAttribute("value");    
	    System.out.println("New Car- Indirect ManPower Count auto populated cell: "+ count2);
	    {
	 		System.out.println("..............................................................................");
	 	} 
	    //click on MSGA
	    driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[2]")).click();
	    Thread.sleep(1000);
	    WebElement MP3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")); // MSGA direct Manpower Count
	    Thread.sleep(2000);
	    String count3 = MP3.getAttribute("value");    
	    System.out.println("MSGA- Direct ManPower Count auto populated cell: "+ count3);
	    
	    Thread.sleep(1000);
	    WebElement MP4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")); // MSGA indirect Manpower Count
	    Thread.sleep(2000);
	    String count4 = MP4.getAttribute("value");    
	    System.out.println("MSGA- Indirect ManPower Count auto populated cell: "+ count4);
	    {
	 		System.out.println("..............................................................................");
	 	}
	    //click on Workshop/Bodyshop
	    driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[3]")).click();
	    Thread.sleep(1000);
	    WebElement MP5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[44]")); // Service direct Manpower Count
	    Thread.sleep(2000);
	    String count5 = MP5.getAttribute("value");    
	    System.out.println("Service- Direct ManPower Count auto populated cell:: "+ count5);
	    
	    Thread.sleep(1000);
	    WebElement MP6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[45]")); // Service indirect Manpower Count
	    Thread.sleep(2000);
	    String count6 = MP6.getAttribute("value");    
	    System.out.println("Service- Indirect ManPower Count auto populated cell: "+ count6);
	    {
	 		System.out.println("..............................................................................");
	 	}
	    //click on Spares
	    driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[4]")).click();
	    Thread.sleep(1000);
	    WebElement MP7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")); // Spares direct Manpower Count
	    Thread.sleep(2000);
	    String count7 = MP7.getAttribute("value");    
	    System.out.println("Spares- Direct ManPower Count auto populated cell: "+ count7);
	    
	    Thread.sleep(1000);
	    WebElement MP8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]")); // Spares indirect Manpower Count
	    Thread.sleep(2000);
	    String count8 = MP8.getAttribute("value");    
	    System.out.println("Spares- Indirect ManPower Count auto populated cell: "+ count8);
	    {
	 		System.out.println("..............................................................................");
	 	}
	    //click on True Value
	    driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[5]")).click();
	    Thread.sleep(1000);
	    WebElement MP9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]")); // True Value direct Manpower Count
	    Thread.sleep(2000);
	    String count9 = MP9.getAttribute("value");    
	    System.out.println("True Value- Direct ManPower Count auto populated cell: "+ count9);
	    
	    Thread.sleep(1000);
	    WebElement MP10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]")); // True Value indirect Manpower Count
	    Thread.sleep(2000);
	    String count10 = MP10.getAttribute("value");    
	    System.out.println("True Value- Indirect ManPower Count auto populated cell: "+ count10);
	    {
	 		System.out.println("..............................................................................");
	 	}
	    //click on MI Renewal
	    driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[6]")).click();
	    Thread.sleep(1000);
	    WebElement MP11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")); // MI Renewal direct Manpower Count
	    Thread.sleep(2000);
	    String count11 = MP11.getAttribute("value");    
	    System.out.println("MI Renewal- Direct ManPower Count auto populated cell: "+ count11);
	    
	    Thread.sleep(1000);
	    WebElement MP12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]")); // MI Renewal indirect Manpower Count
	    Thread.sleep(2000);
	    String count12 = MP12.getAttribute("value");    
	    System.out.println("MI Renewal- Indirect ManPower Count auto populated cell: "+ count12);
	    {
	 		System.out.println("..............................................................................");
	 	}
	    //click on MDS
	    driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[7]")).click();
	    Thread.sleep(1000);
	    WebElement MP13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")); // MDS direct Manpower Count
	    Thread.sleep(2000);
	    String count13 = MP13.getAttribute("value");    
	    System.out.println("MDS- Direct ManPower Count auto populated cell:: "+ count13);
	    
	    Thread.sleep(1000);
	    WebElement MP14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")); // MDS indirect Manpower Count
	    Thread.sleep(2000);
	    String count14 = MP14.getAttribute("value");    
	    System.out.println("MDS- Indirect ManPower Count auto populated cell:: "+ count14);
	    {
	 		System.out.println("..............................................................................");
	 	}
	    //click on Corporate Office
	    driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[8]")).click();
	    Thread.sleep(1000);
	    WebElement MP15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]")); //Corporate Office direct Manpower Count
	    Thread.sleep(2000);
	    String count15 = MP15.getAttribute("value");    
	    System.out.println("Corporate Office- Direct ManPower Count auto populated cell: "+ count15);
	    
	    Thread.sleep(1000);
	    WebElement MP16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]")); // Corporate Office indirect Manpower Count
	    Thread.sleep(2000);
	    String count16 = MP16.getAttribute("value");    
	    System.out.println("Corporate Office- Indirect ManPower Count auto populated cell:: "+ count16);
	    //...............................................................................................................................................................................................
	    {
	 		System.out.println("..............................................................................");
	 	}    
	    //Navigate to Manpower Cost again        
	    Thread.sleep(4000);
	    WebElement M1 = driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")); // Adjust locator
	    Thread.sleep(1000);
	    M1.click();
	    Thread.sleep(1000);
	             
	    WebElement MC1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // New Car direct Manpower Cost                       
	    // Get the attribute value from the second module's web element     
	    String cost1 = MC1.getAttribute("value"); 
	    System.out.println("Manpower Cost- Direct MP for New Car : "+ cost1);     
	    if(cost1.equals(count1)) 
	      {
	        System.out.println("Valid: "+cost1);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost1);   
	      }
	    {
	 		System.out.println("..............................................................................");
	 	}
	    //.....................................................................................................................................................
	    WebElement MC2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")); // New Car Indirect Manpower Cost                       
	    // Get the attribute value from the second module's web element     
	    String cost2 = MC2.getAttribute("value"); 
	    System.out.println("Manpower Cost- Indirect MP for New Car : "+ cost2);     
	    if(cost2.equals(count2)) 
	      {
	        System.out.println("Valid: "+cost2);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost2);   
	      }
{
	System.out.println("..............................................................................");
}
	    //.........................................................................................................................................................
	    WebElement MC3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[31]")); // MSGA direct Manpower Cost                       
	    // Get the attribute value from the second module's web element     
	    String cost3 = MC3.getAttribute("value"); 
	    System.out.println("Manpower Cost- Direct MP for MSGA : "+ cost3);     
	    if(cost3.equals(count3)) 
	      {
	        System.out.println("Valid: "+cost3);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost3);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }	    
	    
	    //................................................................................................................................................................
	    WebElement MC4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[32]")); // MSGA indirect Manpower Cost                       
	    // Get the attribute value from the second module's web element     
	    String cost4 = MC4.getAttribute("value"); 
	    System.out.println("Manpower Cost- Indirect MP for MSGA : "+ cost4);     
	    if(cost4.equals(count4)) 
	      {
	        System.out.println("Valid: "+cost4);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost4);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //...................................................................................................................................................................
	    WebElement MC5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[61]")); // Service direct Manpower Cost                            
	    String cost5 = MC5.getAttribute("value"); 
	    System.out.println("Manpower Cost- Direct MP for Service : "+ cost5);     
	    if(cost5.equals(count5)) 
	      {
	        System.out.println("Valid: "+cost5);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost5);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //....................................................................................................................................................................
	    WebElement MC6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[62]")); // Service indirect Manpower Cost                            
	    String cost6 = MC6.getAttribute("value"); 
	    System.out.println("Manpower Cost- Indirect MP for Service : "+ cost6);     
	    if(cost6.equals(count6)) 
	      {
	        System.out.println("Valid: "+cost6);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost6);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //.................................................................................................................................................................................
	    WebElement MC7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[51]")); // Spares direct Manpower Cost                            
	    String cost7 = MC7.getAttribute("value"); 
	    System.out.println("Manpower Cost- Direct MP for Spares : "+ cost7);     
	    if(cost7.equals(count7)) 
	      {
	        System.out.println("Valid: "+cost7);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost7);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //................................................................................................................................................................................
	    WebElement MC8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[52]")); // Spares indirect Manpower Cost                            
	    String cost8 = MC8.getAttribute("value"); 
	    System.out.println("Manpower Cost- Indirect MP for Spares : "+ cost8);     
	    if(cost8.equals(count8)) 
	      {
	        System.out.println("Valid: "+cost8);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost8);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //................................................................................................................................................................................
	    WebElement MC9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[41]")); // True Value direct Manpower Cost                            
	    String cost9 = MC9.getAttribute("value"); 
	    System.out.println("Manpower Cost- Direct MP for True Value : "+ cost9);     
	    if(cost9.equals(count9)) 
	      {
	        System.out.println("Valid: "+cost9);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost9);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //.................................................................................................................................................................................
	    WebElement MC10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[42]")); // True Value indirect Manpower Cost                            
	    String cost10 = MC10.getAttribute("value"); 
	    System.out.println("Manpower Cost- Indirect MP for True Value : "+ cost10);     
	    if(cost10.equals(count10)) 
	      {
	        System.out.println("Valid: "+cost10);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost10);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //................................................................................................................................................................................
	    WebElement MC11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[21]")); // MI Renewal direct Manpower Cost                            
	    String cost11 = MC11.getAttribute("value"); 
	    System.out.println("Manpower Cost- Direct MP for MI Renewal: "+ cost11);     
	    if(cost11.equals(count11)) 
	      {
	        System.out.println("Valid: "+cost11);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost11);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //..................................................................................................................................................................................
	    WebElement MC12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[22]")); // MI Renewal indirect Manpower Cost                            
	    String cost12 = MC12.getAttribute("value"); 
	    System.out.println("Manpower Cost- Indirect MP for MI Renewal: "+ cost12);     
	    if(cost12.equals(count12)) 
	      {
	        System.out.println("Valid: "+cost12);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost12);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //..................................................................................................................................................................................
	    WebElement MC13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]")); // MDS direct Manpower Cost                            
	    String cost13 = MC13.getAttribute("value"); 
	    System.out.println("Manpower Cost- Direct MP for MDS: "+ cost13);     
	    if(cost13.equals(count13)) 
	      {
	        System.out.println("Valid: "+cost13);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost13);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //...................................................................................................................................................................................
	    WebElement MC14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]")); // MDS indirect Manpower Cost                            
	    String cost14 = MC14.getAttribute("value"); 
	    System.out.println("Manpower Cost- Indirect MP for MDS: "+ cost14);     
	    if(cost14.equals(count14)) 
	      {
	        System.out.println("Valid: "+cost14);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost14);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //....................................................................................................................................................................................
	    WebElement MC15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[71]")); // Corporate Office direct Manpower Cost                            
	    String cost15 = MC15.getAttribute("value"); 
	    System.out.println("Manpower Cost- Direct MP for Corporate Office: "+ cost15);     
	    if(cost15.equals(count15)) 
	      {
	        System.out.println("Valid: "+cost15);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost15);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    //.....................................................................................................................................................................................
	    WebElement MC16 = driver.findElement(By.xpath("(//*[@type=\"text\"])[72]")); // Corporate Office indirect Manpower Cost                            
	    String cost16 = MC16.getAttribute("value"); 
	    System.out.println("Manpower Cost- Indirect MP for Corporate Office: "+ cost16);     
	    if(cost16.equals(count16)) 
	      {
	        System.out.println("Valid: "+cost16);          	
	      }
	    else 
	      {
	      	System.out.println("Invalid: "+cost16);   
	      }
	    {
	    	System.out.println("..............................................................................");
	    }
	    	//..................................................................................................................................................................................... 		
	System.out.println("Following displays- Total Manpower counts of all the mentioned incomes: ");	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	 	//New Car>Total Manpower
	
	  	WebElement cc64= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
	  	WebElement c65= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
	  	WebElement c66= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
	  	
	  	//convert longo longeger
	  	long mpcc64= Long.parseLong(cc64.getAttribute("value"));
	  	long mpc65= Long.parseLong(c65.getAttribute("value"));
	  	long mpc66= Long.parseLong(c66.getAttribute("value"));
	  	//....................................................................................................................................................................................
	  	//calculate>New Car>Total Manpower	 	
	  	long expresult43= mpcc64+mpc65 ;
	 	
	   	//get the value from automated cell
	  	long actresult43= Long.parseLong(c66.getAttribute("value"));
	   	
	   	//Verify if result is as expected
	  	if(actresult43==expresult43) 
	  	  {
	  		System.out.println("New Car-Total Manpower formula cell displays expected value: PASS=  " +expresult43);  
	  	  }
	  	else
	  	  {
	  		System.out.println("New Car-Total Manpower formula cell displays incorrect value: >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult43);
	  	  }
	  	{
	  		System.out.println("..............................................................................");
	  	}
	  	//....................................................................................................................................................................................
	  	//MDS>Total Manpower
	  	WebElement c67= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
	  	WebElement c68= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
	  	WebElement c69= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
	  	 	
	  	//convert longo longeger
	  	long mpc67= Long.parseLong(c67.getAttribute("value"));
	  	long mpc68= Long.parseLong(c68.getAttribute("value"));
	  	long mpc69= Long.parseLong(c69.getAttribute("value"));
	  	
	  	//calculate>MDS>Total Manpower
	  	long expresult32= (mpc67+mpc68);
	  			
	  	//get the value from automated cell
	  	long actresult32= Long.parseLong(c69.getAttribute("value"));
	  		  	
	  	//Verify if result is as expected
	  	if(actresult32==expresult32) 
	  	  {
	  		 System.out.println("MDS-Total Manpower formula cell displays expected value: PASS=  " +expresult32);  
	  	  }
	     else
	  	  {
	  		 System.out.println("MDS-Total Manpower formula cell displays incorrect value:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult32);
	  	  }
	  	{
	  		System.out.println("..............................................................................");
	  	}
	  	//...................................................................................................................................................................................................
	  	//MI Renewal>Total Manpower
	  	WebElement c70= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
	  	WebElement c71= driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
	  	WebElement c72= driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
	  	 	
	  	//convert longo longeger
	  	long mpc70= Long.parseLong(c70.getAttribute("value"));
	  	long mpc71= Long.parseLong(c71.getAttribute("value"));
	  	long mpc72= Long.parseLong(c72.getAttribute("value"));
	  	
	  	
	  	//Calculation>MI Renewal>Total Manpower
	  	long expresult33= mpc70+mpc71 ;
	 		
	  	//get the value from automated cell
	  	long actresult33= Long.parseLong(c72.getAttribute("value"));
	  		  	
	  	//Verify if result is as expected
	  	if(actresult33==expresult33) 
	  	  {
	  		 System.out.println("MI Renewal-Total Manpower formula cell displays expected value: PASS=  " +expresult33);  
	  	  }
	     else
	  	  {
	  		 System.out.println("MI Renewal-Total Manpower formula cell displays incorrect value:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult33);
	  	  }	
	  	{
	  		System.out.println("..............................................................................");
	  	}
	  	//.............................................................................................................................................................................................................
	  	//MSGA>Total Manpower
	  	WebElement c73= driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
	   	WebElement c74= driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
	  	WebElement c75= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
	  	 	 	
	  	//convert longo longeger
	  	long mpc73= Long.parseLong(c73.getAttribute("value"));
	  	long mpc74= Long.parseLong(c74.getAttribute("value"));
	  	long mpc75= Long.parseLong(c75.getAttribute("value"));
	  	
	  	//Calculation>MSGA>Total Manpower
	  	long expresult34= mpc73+mpc74 ;
	  			
	  	//get the value from automated cell
	  	long actresult34= Long.parseLong(c75.getAttribute("value"));
	  	 		  	
	  	//Verify if result is as expected
	  	if(actresult34==expresult34) 
	  	  {
	  	 	System.out.println("MSGA-Total Manpower formula cell displays expected value: PASS=  " +expresult34);  
	  	  }
	  	else
	  	  {
	  	 	System.out.println("MSGA-Total Manpower formula cell displays incorrect value:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult34);
	  	  }	
	  	{
	  		System.out.println("..............................................................................");
	  	}
	  	//.................................................................................................................................................................................................................
	  	//True Value>Total Manpower
	  	 	WebElement c76= driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
	  	  	WebElement c77= driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
	  	 	WebElement c78= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
	  	 	 	 	
	  	 	//convert longo longeger
	  	 	long mpc76= Long.parseLong(c76.getAttribute("value"));
	  	 	long mpc77= Long.parseLong(c77.getAttribute("value"));
	  	 	long mpc78= Long.parseLong(c78.getAttribute("value"));
	  	 	
	  	 	//Calculation>True Value>Total Manpower
	  	 	long expresult35= mpc76+mpc77 ;
	  	 			
	  	 	//get the value from automated cell
	  	 	long actresult35= Long.parseLong(c78.getAttribute("value"));
	  	 	 		  	
	  	 	//Verify if result is as expected
	  	 	if(actresult35==expresult35) 
	  	 	  {
	  	 	 	System.out.println("True Value-Total Manpower formula cell displays expected value: PASS=  " +expresult35);  
	  	 	  }
	  	 	else
	  	 	  {
	  	 	 	System.out.println("True Value-Total Manpower formula cell displays incorrect value:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult35);
	  	 	  }
	  	 	{
	  	 		System.out.println("..............................................................................");
	  	 	}
	  	 //...................................................................................................................................................................................................................	
	  	 //Spares>Total Manpower
	  	 	WebElement c79= driver.findElement(By.xpath("(//*[@type=\"text\"])[51]"));
	  	  	WebElement c80= driver.findElement(By.xpath("(//*[@type=\"text\"])[52]"));
	  	 	WebElement c81= driver.findElement(By.xpath("(//*[@type=\"text\"])[53]"));
	  	 	 	 	
	  	 	//convert longo longeger
	  	 	long mpc79= Long.parseLong(c79.getAttribute("value"));
	  	 	long mpc80= Long.parseLong(c80.getAttribute("value"));
	  	 	long mpc81= Long.parseLong(c81.getAttribute("value"));
	  	 	
	  	 	//Calculation>Spares>Total Manpower
	  	 	long expresult36= mpc79+mpc80 ;
	  	 			
	  	 	//get the value from automated cell
	  	 	long actresult36= Long.parseLong(c81.getAttribute("value"));
	  	 	 		  	
	  	 	//Verify if result is as expected
	  	 	if(actresult36==expresult36) 
	  	 	  {
	  	 	 	System.out.println("Spares-Total Manpower formula cell displays expected value: PASS=  " +expresult36);  
	  	 	  }
	  	 	else
	  	 	  {
	  	 	 	System.out.println("Spares-Total Manpower formula cell displays incorrect value:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult36);
	  	 	  }	
	  	 	{
	  	 		System.out.println("..............................................................................");
	  	 	}
	  	 //....................................................................................................................................................................................................................	
	  	 //Service>Total Manpower
	  	 	WebElement c82= driver.findElement(By.xpath("(//*[@type=\"text\"])[61]"));
	  	  	WebElement c83= driver.findElement(By.xpath("(//*[@type=\"text\"])[62]"));
	  	 	WebElement c84= driver.findElement(By.xpath("(//*[@type=\"text\"])[63]"));
	  	 	 	 	
	  	 	//convert longo longeger
	  	 	long mpc82= Long.parseLong(c82.getAttribute("value"));
	  	 	long mpc83= Long.parseLong(c83.getAttribute("value"));
	  	 	long mpc84= Long.parseLong(c84.getAttribute("value"));
	  	 	
	  	 	//Calculation>Service>Total Manpower
	  	 	long expresult37= mpc82+mpc83 ;
	  	 			
	  	 	//get the value from automated cell
	  	 	long actresult37= Long.parseLong(c84.getAttribute("value"));
	  	 	 		  	
	  	 	//Verify if result is as expected
	  	 	if(actresult37==expresult37) 
	  	 	  {
	  	 	 	System.out.println("Service-Total Manpower formula cell displays expected value: PASS=  " +expresult37);  
	  	 	  }
	  	 	else
	  	 	  {
	  	 	 	System.out.println("Service-Total Manpower formula cell displays incorrect value:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult37);
	  	 	  }	
	  	 	{
	  	 		System.out.println("..............................................................................");
	  	 	}
	  	//.............................................................................................................................................................................................................................
	  	 //Common Manpower>Total Manpower
	  	 	WebElement c85= driver.findElement(By.xpath("(//*[@type=\"text\"])[71]"));
	  	  	WebElement c86= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));
	  	 	WebElement c87= driver.findElement(By.xpath("(//*[@type=\"text\"])[73]"));
	  	 	 	 	
	  	 	//convert longo longeger
	  	 	long mpc85= Long.parseLong(c85.getAttribute("value"));
	  	 	long mpc86= Long.parseLong(c86.getAttribute("value"));
	  	 	long mpc87= Long.parseLong(c87.getAttribute("value"));
	  	 	
	  	 	//Calculation>Common Manpower>Total Manpower
	  	 	long expresult38= mpc85+mpc86 ;
	  	 			
	  	 	//get the value from automated cell
	  	 	long actresult38= Long.parseLong(c87.getAttribute("value"));
	  	 	 		  	
	  	 	//Verify if result is as expected
	  	 	if(actresult38==expresult38) 
	  	 	  {
	  	 	 	System.out.println("Common Manpower-Total Manpower formula cell displays expected value: PASS=  " +expresult38);  
	  	 	  }
	  	 	else
	  	 	  {
	  	 	 	System.out.println("Common Manpower-Total Manpower formula cell displays incorrect value: >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult38);
	  	 	  }	
	  	 	{
	  	 		System.out.println("..............................................................................");
	  	 	}
	  	  //.............................................................................................................................................................................................................................
	  	  //Total>Total Manpower
	  	 	WebElement c88= driver.findElement(By.xpath("(//*[@type=\"text\"])[81]"));
	  	  	WebElement c89= driver.findElement(By.xpath("(//*[@type=\"text\"])[82]"));
	  	 	WebElement c90= driver.findElement(By.xpath("(//*[@type=\"text\"])[83]"));
	  	 	 	 	
	  	 	//convert longo longeger
	  	 	long mpc88= Long.parseLong(c88.getAttribute("value"));
	  	 	long mpc89= Long.parseLong(c89.getAttribute("value"));
	  	 	long mpc90= Long.parseLong(c90.getAttribute("value"));
	  	 	//...........................................................................................................................................................................................
	  	 	//Calculation>Total>Total Manpower
	  	 	long expresult39= mpc88+mpc89 ;
	  	 			
	  	 	//get the value from automated cell
	  	 	long actresult39= Long.parseLong(c90.getAttribute("value"));
	  	 	 		  	
	  	 	//Verify if result is as expected
	  	 	if(actresult39==expresult39) 
	  	 	  {
	  	 	 	System.out.println("Total-Total Manpower formula cell displays expected value: PASS=  " +expresult39);  
	  	 	  }
	  	 	else
	  	 	  {
	  	 	 	System.out.println("Total-Total Manpower formula cell displays incorrect value: >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult39);
	  	 	  }	
	  	  	//..................................................................................................................................................................................................... 	
	  	 	//Calculation>Total>Direct Manpower
	  	 	long expresult40= mpcc64+mpc67+mpc70+mpc73+mpc76+mpc79+mpc82+mpc85 ;
	  	 			
	  	 	//get the value from automated cell
	  	 	long actresult40= Long.parseLong(c88.getAttribute("value"));
	  	 	 		  	
	  	 	//Verify if result is as expected
	  	 	if(actresult40==expresult40) 
	  	 	  {
	  	 	 	System.out.println("Total Direct Manpower formula cell displays expected value: PASS=  " +expresult40);  
	  	 	  }
	  	 	else
	  	 	  {
	  	 	 	System.out.println("Total Direct Manpower formula cell displays incorrect value: >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult40);
	  	 	  }	
	  	 	//...............................................................................................................................................................................................
	  	   //Calculation>Total>Indirect Manpower
	  	 	long expresult41= mpc65+mpc68+mpc71+mpc74+mpc77+mpc80+mpc83+mpc86 ;
	  	 			
	  	 	//get the value from automated cell
	  	 	long actresult41= Long.parseLong(c89.getAttribute("value"));
	  	 	 		  	
	  	 	//Verify if result is as expected
	  	 	if(actresult41==expresult41) 
	  	 	  {
	  	 	 	System.out.println("Total Indirect Manpower formula cell displays expected value: PASS=  " +expresult41);  
	  	 	  }
	  	 	else
	  	 	  {
	  	 	 	System.out.println("Total Indirect Manpower formula cell displays incorrect value: >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult41);
	  	 	  }	
	  	 	//...............................................................................................................................................................................................................
	  	 	//Calculation>Total>Total Manpower
	  	 	long expresult42= mpc66+mpc69+mpc72+mpc75+mpc78+mpc81+mpc84+mpc87 ;
	 			
	  	 	//get the value from automated cell
	  	 	long actresult42= Long.parseLong(c90.getAttribute("value"));
	  	 	 		  	
	  	 	//Verify if result is as expected
	  	 	if(actresult42==expresult42) 
	  	 	  {
	  	 	 	System.out.println("Total-Total Manpower formula cell displays expected value: PASS=  " +expresult42);  
	  	 	  }
	  	 	else
	  	 	  {
	  	 	 	System.out.println("Total-Total Indirect Manpower formula cell displays incorrect value:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult42);
	  	 	  }	
	  	 	
	  	 	System.out.println("...........................E..N..D...................................................");
	}

}
