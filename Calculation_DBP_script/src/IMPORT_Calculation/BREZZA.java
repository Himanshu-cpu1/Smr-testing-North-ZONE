package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BREZZA {

	static void Brezza(WebDriver driver ) {
		

		// Find the path BREZZA 
	       
	       WebElement B1= driver.findElement(By.xpath("(//*[@type=\"number\"])[97]"));
	       WebElement B2= driver.findElement(By.xpath("(//*[@type=\"number\"])[98]"));
	       WebElement B3= driver.findElement(By.xpath("(//*[@type=\"number\"])[99]"));
	       WebElement B4= driver.findElement(By.xpath("(//*[@type=\"number\"])[100]"));
	       WebElement B5= driver.findElement(By.xpath("(//*[@type=\"number\"])[101]"));
	       WebElement B6= driver.findElement(By.xpath("(//*[@type=\"number\"])[102]"));
	       WebElement B7= driver.findElement(By.xpath("(//*[@type=\"number\"])[103]"));
	       WebElement B8= driver.findElement(By.xpath("(//*[@type=\"number\"])[104]"));
	       WebElement B9= driver.findElement(By.xpath("(//*[@type=\"number\"])[105]"));
	       WebElement B10= driver.findElement(By.xpath("(//*[@type=\"number\"])[106]"));
	       WebElement B11= driver.findElement(By.xpath("(//*[@type=\"number\"])[107]"));
	       WebElement B12= driver.findElement(By.xpath("(//*[@type=\"number\"])[108]"));
	       WebElement B13= driver.findElement(By.xpath("(//*[@type=\"number\"])[109]"));
	       WebElement B14= driver.findElement(By.xpath("(//*[@type=\"number\"])[110]"));
	       WebElement B15= driver.findElement(By.xpath("(//*[@type=\"number\"])[111]"));
	       WebElement B16= driver.findElement(By.xpath("(//*[@type=\"number\"])[112]"));
	      
	       // SEND THE VALUES 
	       
//	       B1.sendKeys("328456");
//	       B2.sendKeys("239583");
//	       B3.sendKeys("62743");
//	       B4.sendKeys("208965");
//	       B5.sendKeys("18383");
//	       B6.sendKeys("88500");
//	     
//	       B8.sendKeys("10000");
//	       B10.sendKeys("200000");
//	       B11.sendKeys("229000");
//	       B12.sendKeys("8200");
//	    
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo longegers
	        long BREZZA1 = Long.parseLong(B1.getAttribute("value"));
	        long BREZZA2 = Long.parseLong(B2.getAttribute("value"));
		    long BREZZA3 = Long.parseLong(B3.getAttribute("value"));
		    long BREZZA4 = Long.parseLong(B4.getAttribute("value"));
		    long BREZZA5 = Long.parseLong(B5.getAttribute("value"));
		    long BREZZA6 = Long.parseLong(B6.getAttribute("value"));
		    long BREZZA7 = Long.parseLong(B7.getAttribute("value"));
		    long BREZZA8 = Long.parseLong(B8.getAttribute("value"));
		    long BREZZA9 = Long.parseLong(B9.getAttribute("value"));
		    long BREZZA10 = Long.parseLong(B10.getAttribute("value"));
		    long BREZZA11 = Long.parseLong(B11.getAttribute("value"));
		    long BREZZA12 = Long.parseLong(B12.getAttribute("value"));
		    long BREZZA13 = Long.parseLong(B13.getAttribute("value"));
		    long BREZZA14 = Long.parseLong(B14.getAttribute("value"));
		    long BREZZA15 = Long.parseLong(B15.getAttribute("value"));
		    long BREZZA16 = Long.parseLong(B16.getAttribute("value"));
		   
		    double brezza1 = Double.parseDouble(B7.getAttribute("value"));
		//........................................................................................................
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
		  //..................................................................................................  
		    long expectedValue1= (BREZZA1+BREZZA3)-BREZZA5;  // RETAIL SALES # QTY
	        if (BREZZA7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION BREZZA [RETAIL SALES # QTY]    VALID  =" + BREZZA7 );
											                            
			       } else {
		 	System.out.println("CALCULATION BREZZA [RETAIL SALES # QTY] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " +BREZZA7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
	        long expectedValue2= BREZZA8-(BREZZA2+BREZZA4-BREZZA6);  // MARGIN 
	        if (BREZZA9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION BREZZA [(margin Amount (Rs.)] is   VALID  =" + BREZZA9 );
											                            
			       } else {
		 	System.out.println("CALCULATION BREZZA [(margin Amount (Rs.)] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + BREZZA9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
	        long expectedValue3= BREZZA11+BREZZA12;  //Total Discount
	        if (BREZZA13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION BREZZA [Total Discount] is   VALID  =" + BREZZA13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION BREZZA [Total Discount] is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + BREZZA13 );			        
					 }
	       //................................................................................................
	       
	        double expectedValue4 =BREZZA9/brezza1 ;	// Margin/Car (Rs.)
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( BREZZA14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION BREZZA (Margin/Car (Rs.) VALID  =" + BREZZA14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION BREZZA (Margin/Car (Rs.) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + BREZZA14 );			        
				 }
	        
	      //................................................................................................
	        
	        double expectedValue5 =BREZZA10/brezza1 ;	// DRF/Car (Rs.)
	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( BREZZA15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION  BREZZA (DRF/Car (Rs.)) VALID  =" + BREZZA15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION BREZZA (DRF/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + BREZZA15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double expectedValue6 = BREZZA13/brezza1 ;	// Discount/Car (Rs.)
	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( BREZZA16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION BREZZA  (Discount/Car (Rs.)) VALID  =" +  BREZZA16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION BREZZA (Discount/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " +BREZZA16 );			        
				 }
	        {
	        	System.out.println("........................................................................");
	        }
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<	        
	      
		
		
		
		
	}
	
}
