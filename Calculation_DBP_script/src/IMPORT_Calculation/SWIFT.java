package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SWIFT {
	static void swift(WebDriver driver) {
		// Find the path SWIFT 
	       
	       WebElement S1= driver.findElement(By.xpath("(//*[@type=\"number\"])[65]"));
	       WebElement S2= driver.findElement(By.xpath("(//*[@type=\"number\"])[66]"));
	       WebElement S3= driver.findElement(By.xpath("(//*[@type=\"number\"])[67]"));
	       WebElement S4= driver.findElement(By.xpath("(//*[@type=\"number\"])[68]"));
	       WebElement S5= driver.findElement(By.xpath("(//*[@type=\"number\"])[69]"));
	       WebElement S6= driver.findElement(By.xpath("(//*[@type=\"number\"])[70]"));
	       WebElement S7= driver.findElement(By.xpath("(//*[@type=\"number\"])[71]"));
	       WebElement S8= driver.findElement(By.xpath("(//*[@type=\"number\"])[72]"));
	       WebElement S9= driver.findElement(By.xpath("(//*[@type=\"number\"])[73]"));
	       WebElement S10= driver.findElement(By.xpath("(//*[@type=\"number\"])[74]"));
	       WebElement S11= driver.findElement(By.xpath("(//*[@type=\"number\"])[75]"));
	       WebElement S12= driver.findElement(By.xpath("(//*[@type=\"number\"])[76]"));
	       WebElement S13= driver.findElement(By.xpath("(//*[@type=\"number\"])[77]"));
	       WebElement S14= driver.findElement(By.xpath("(//*[@type=\"number\"])[78]"));
	       WebElement S15= driver.findElement(By.xpath("(//*[@type=\"number\"])[79]"));
	       WebElement S16= driver.findElement(By.xpath("(//*[@type=\"number\"])[80]"));
	       
	       // SEND THE VALUES 
	       
//	       S1.sendKeys("3286");
//	       S2.sendKeys("3232");
//	       S3.sendKeys("6273");
//	       S4.sendKeys("2089");
//	       S5.sendKeys("282");
//	       S6.sendKeys("8800");
//	      
//	       S8.sendKeys("62732");
//	       S10.sendKeys("209389");
//	       S11.sendKeys("287732");
//	       S12.sendKeys("8200");
//	      
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo longegers
	        long SWIFT1 = Long.parseLong(S1.getAttribute("value"));
	        long SWIFT2 = Long.parseLong(S2.getAttribute("value"));
		    long SWIFT3 = Long.parseLong(S3.getAttribute("value"));
		    long SWIFT4 = Long.parseLong(S4.getAttribute("value"));
		    long SWIFT5 = Long.parseLong(S5.getAttribute("value"));
		    long SWIFT6 = Long.parseLong(S6.getAttribute("value"));
		    long SWIFT7 = Long.parseLong(S7.getAttribute("value"));
		    long SWIFT8 = Long.parseLong(S8.getAttribute("value"));
		    long SWIFT9 = Long.parseLong(S9.getAttribute("value"));
		    long SWIFT10 = Long.parseLong(S10.getAttribute("value"));
		    long SWIFT11 = Long.parseLong(S11.getAttribute("value"));
		    long SWIFT12 = Long.parseLong(S12.getAttribute("value"));
		    long SWIFT13 = Long.parseLong(S13.getAttribute("value"));
		    long SWIFT14 = Long.parseLong(S14.getAttribute("value"));
		    long SWIFT15 = Long.parseLong(S15.getAttribute("value"));
		    long SWIFT16 = Long.parseLong(S16.getAttribute("value"));
		    
		    double swift1 = Double.parseDouble(S7.getAttribute("value"));// convert longo float for Division
		   
		//........................................................................................................
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
		  //..................................................................................................  
		    long expectedValue1= (SWIFT1+SWIFT3)-SWIFT5;  // RETAIL SALES # QTY
	        if (SWIFT7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION SWIFT [RETAIL SALES # QTY]    VALID  =" + SWIFT7 );
											                            
			       } else {
		 	System.out.println("CALCULATION SWIFT [RETAIL SALES # QTY] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + SWIFT7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue2= SWIFT8-(SWIFT2+SWIFT4-SWIFT6);  // MARGIN 
	        if (SWIFT9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION SWIFT [(margin Amount (Rs.)] is   VALID  =" + SWIFT9 );
											                            
			       } else {
		 	System.out.println("CALCULATION SWIFT [(margin Amount (Rs.)] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + SWIFT9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		   long expectedValue3= SWIFT11+SWIFT12;  //Total Discount
	        if (SWIFT13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION SWIFT [Total Discount] is   VALID  =" + SWIFT13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION SWIFT [Total Discount] is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + SWIFT13 );			        
					 }
	       //................................................................................................
	       
	        double expectedValue4 =SWIFT9/swift1 ;	// Margin/Car (Rs.)
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( SWIFT14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION SWIFT (Margin/Car (Rs.) VALID  =" + SWIFT14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION SWIFT (Margin/Car (Rs.)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + SWIFT14 );			        
				 }
	        
	      //................................................................................................
	        
	        double expectedValue5 =SWIFT10/swift1 ;	// DRF/Car (Rs.)
	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( SWIFT15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION SWIFT (DRF/Car (Rs.)) VALID  =" +SWIFT15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION SWIFT (DRF/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + SWIFT15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double expectedValue6 =SWIFT13/swift1 ;	// Discount/Car (Rs.)
	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( SWIFT16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION SWIFT  (Discount/Car (Rs.)) VALID  =" +SWIFT16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION SWIFT (Discount/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + SWIFT16 );			        
				 }
	        {
	        	System.out.println("..................................................................................");
	        }
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<	        
	      
		
	}

}
