package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Celerio {
	static void CElERIO(WebDriver driver) {
		
		// Find the path CELERIO 
	       	       
	       WebElement C1= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
	       WebElement C2= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
	       WebElement C3= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
	       WebElement C4= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
	       WebElement C5= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
	       WebElement C6= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
	       WebElement C7= driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
	       WebElement C8= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
	       WebElement C9= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
	       WebElement C10= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
	       WebElement C11= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
	       WebElement C12= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
	       WebElement C13= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
	       WebElement C14= driver.findElement(By.xpath("(//*[@type=\"number\"])[46]"));
	       WebElement C15= driver.findElement(By.xpath("(//*[@type=\"number\"])[47]"));
	       WebElement C16= driver.findElement(By.xpath("(//*[@type=\"number\"])[48]"));
	       
	       // SEND THE VALUES 
//	       
//	       C1.sendKeys("3286");
//	       C2.sendKeys("33232");
//	       C3.sendKeys("6273");
//	       C4.sendKeys("209389");
//	       C5.sendKeys("282");
//	       C6.sendKeys("8239800");
//	      
//	       C8.sendKeys("62732");
//	       C10.sendKeys("209389");
//	       C11.sendKeys("287732");
//	       C12.sendKeys("8200");
	      
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo Longs
	        long CELERIO1 = Long.parseLong(C1.getAttribute("value"));
	        long CELERIO2 = Long.parseLong(C2.getAttribute("value"));
		    long CELERIO3 = Long.parseLong(C3.getAttribute("value"));
		    long CELERIO4 = Long.parseLong(C4.getAttribute("value"));
		    long CELERIO5 = Long.parseLong(C5.getAttribute("value"));
		    long CELERIO6 = Long.parseLong(C6.getAttribute("value"));
		    long CELERIO7 = Long.parseLong(C7.getAttribute("value"));
		    long CELERIO8 = Long.parseLong(C8.getAttribute("value"));
		    long CELERIO9 = Long.parseLong(C9.getAttribute("value"));
		    long CELERIO10 = Long.parseLong(C10.getAttribute("value"));
		    long CELERIO11 = Long.parseLong(C11.getAttribute("value"));
		    long CELERIO12 = Long.parseLong(C12.getAttribute("value"));
		    long CELERIO13 = Long.parseLong(C13.getAttribute("value"));
		    long CELERIO14 = Long.parseLong(C14.getAttribute("value"));
		    long CELERIO15 = Long.parseLong(C15.getAttribute("value"));
		    long CELERIO16 = Long.parseLong(C16.getAttribute("value"));
		    
		    double Celerio1 = Double.parseDouble(C7.getAttribute("value")); // convert flat for division
		//........................................................................................................
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
		  //..................................................................................................  
		    long expectedValue1= (CELERIO1+CELERIO3)-CELERIO5;  // RETAIL SALES # QTY
	        if (CELERIO7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION CELERIO [RETAIL SALES # QTY]    VALID  =" + CELERIO7 );
											                            
			       } else {
		 	System.out.println("CALCULATION CELERIO [RETAIL SALES # QTY] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + CELERIO7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
	        long expectedValue2= CELERIO8-(CELERIO2+CELERIO4-CELERIO6);  // MARGIN 
	        if (CELERIO9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION CELERIO [(margin Amount (Rs.)] is   VALID  =" + CELERIO9 );
											                            
			       } else {
		 	System.out.println("CALCULATION CELERIO [(margin Amount (Rs.)] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + CELERIO9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
	        long expectedValue3= CELERIO11+CELERIO12;  //Total Discount
	        if (CELERIO13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION CELERIO [Total Discount] is   VALID  =" + CELERIO13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION CELERIO [Total Discount] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + CELERIO13 );			        
					 }
	       //................................................................................................
	       
	        double expectedValue4 =CELERIO9/Celerio1 ;	// Margin/Car (Rs.)
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( CELERIO14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION CELERIO  (Margin/Car (Rs.) VALID  =" + CELERIO14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION CELERIO (Margin/Car (Rs.) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + CELERIO14 );			        
				 }
	        
	      //................................................................................................
	        
	        double expectedValue5 =CELERIO10/Celerio1 ;	// DRF/Car (Rs.)
	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( CELERIO15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION CELERIO (DRF/Car (Rs.)) VALID  =" + CELERIO15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION CELERIO (DRF/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + CELERIO15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double expectedValue6 =CELERIO13/Celerio1 ;	// Discount/Car (Rs.)
	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( CELERIO16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION CELERIO  (Discount/Car (Rs.)) VALID  =" + CELERIO16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION CELERIO (Discount/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + CELERIO16 );			        
				 }
	        {
	        	System.out.println(".........................................................................");
	        }
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	        
	      
		
	}

}
