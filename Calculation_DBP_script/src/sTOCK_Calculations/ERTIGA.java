package sTOCK_Calculations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ERTIGA {
	public static void ertiga(WebDriver driver) {

		// Find the path ERTIGA 
	       
	       WebElement E1= driver.findElement(By.xpath("(//*[@type=\"number\"])[113]"));
	       WebElement E2= driver.findElement(By.xpath("(//*[@type=\"number\"])[114]"));
	       WebElement E3= driver.findElement(By.xpath("(//*[@type=\"number\"])[115]"));
	       WebElement E4= driver.findElement(By.xpath("(//*[@type=\"number\"])[116]"));
	       WebElement E5= driver.findElement(By.xpath("(//*[@type=\"number\"])[117]"));
	       WebElement E6= driver.findElement(By.xpath("(//*[@type=\"number\"])[118]"));
	       WebElement E7= driver.findElement(By.xpath("(//*[@type=\"number\"])[119]"));
	       WebElement E8= driver.findElement(By.xpath("(//*[@type=\"number\"])[120]"));
	       WebElement E9= driver.findElement(By.xpath("(//*[@type=\"number\"])[121]"));
	       WebElement E10= driver.findElement(By.xpath("(//*[@type=\"number\"])[122]"));
	       WebElement E11= driver.findElement(By.xpath("(//*[@type=\"number\"])[123]"));
	       WebElement E12= driver.findElement(By.xpath("(//*[@type=\"number\"])[124]"));
	       WebElement E13= driver.findElement(By.xpath("(//*[@type=\"number\"])[125]"));
	       WebElement E14= driver.findElement(By.xpath("(//*[@type=\"number\"])[126]"));
	       WebElement E15= driver.findElement(By.xpath("(//*[@type=\"number\"])[127]"));
	       WebElement E16= driver.findElement(By.xpath("(//*[@type=\"number\"])[128]"));
	      
	       // SEND THE VALUES 
	       
	       E1.sendKeys("328456");
	       E2.sendKeys("239583");
	       E3.sendKeys("62743");
	       E4.sendKeys("208965");
	       E5.sendKeys("18383");
	       E6.sendKeys("88500");
	     
	       E8.sendKeys("10000");
	       E10.sendKeys("200000");
	       E11.sendKeys("229000");
	       E12.sendKeys("8200");
	    
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo longegers
	        long ERTIGA1 = Long.parseLong(E1.getAttribute("value"));
	        long ERTIGA2 = Long.parseLong(E2.getAttribute("value"));
		    long ERTIGA3 = Long.parseLong(E3.getAttribute("value"));
		    long ERTIGA4 = Long.parseLong(E4.getAttribute("value"));
		    long ERTIGA5 = Long.parseLong(E5.getAttribute("value"));
		    long ERTIGA6 = Long.parseLong(E6.getAttribute("value"));
		    long ERTIGA7 = Long.parseLong(E7.getAttribute("value"));
		    long ERTIGA8 = Long.parseLong(E8.getAttribute("value"));
		    long ERTIGA9 = Long.parseLong(E9.getAttribute("value"));
		    long ERTIGA10 = Long.parseLong(E10.getAttribute("value"));
		    long ERTIGA11 = Long.parseLong(E11.getAttribute("value"));
		    long ERTIGA12 = Long.parseLong(E12.getAttribute("value"));
		    long ERTIGA13 = Long.parseLong(E13.getAttribute("value"));
		    long ERTIGA14 = Long.parseLong(E14.getAttribute("value"));
		    long ERTIGA15 = Long.parseLong(E15.getAttribute("value"));
		    long ERTIGA16 = Long.parseLong(E16.getAttribute("value"));
		   
		    double Ertiga1 = Double.parseDouble(E7.getAttribute("value"));  // CONVERT longO double FOR DIVISION
		//........................................................................................................
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
		  //..................................................................................................  
		    long expectedValue1= (ERTIGA1+ERTIGA3)-ERTIGA5;  // RETAIL SALES # QTY
	        if (ERTIGA7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION ERTIGA [RETAIL SALES # QTY]    VALID  =" + ERTIGA7 );
											                            
			       } else {
		 	System.out.println("CALCULATION ERTIGA [RETAIL SALES # QTY]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + ERTIGA7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue2= ERTIGA8-(ERTIGA2+ERTIGA4-ERTIGA6);  // MARGIN 
	        if (ERTIGA9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION ERTIGA [(margin Amount (Rs.)] is   VALID  =" + ERTIGA9 );
											                            
			       } else {
		 	System.out.println("CALCULATION ERTIGA [(margin Amount (Rs.)] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + ERTIGA9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue3= ERTIGA11+ERTIGA12;  //Total Discount
	        if (ERTIGA13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION ERTIGA [Total Discount] is   VALID  =" + ERTIGA13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION ERTIGA [Total Discount] is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + ERTIGA13 );			        
					 }
	       //................................................................................................
	       
	        
	        double expectedValue4 =ERTIGA9/Ertiga1 ;	// Margin/Car (Rs.)
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( ERTIGA14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION ERTIGA (Margin/Car (Rs.) VALID  =" + ERTIGA14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION ERTIGA (Margin/Car (Rs.)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + ERTIGA14 );			        
				 }
	        
	      //................................................................................................
	        
	        double expectedValue5 =ERTIGA10/Ertiga1 ;	// DRF/Car (Rs.)	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( ERTIGA15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION  ERTIGA (DRF/Car (Rs.)) VALID  =" + ERTIGA15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION ERTIGA (DRF/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + ERTIGA15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double expectedValue6 = ERTIGA13/Ertiga1 ;	// Discount/Car (Rs.)	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( ERTIGA16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION ERTIGA  (Discount/Car (Rs.)) VALID  =" +  ERTIGA16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION ERTIGA (Discount/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " +ERTIGA16 );			        
				 }
	        {
	        	System.out.println(".........................................................................");
	        }
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<	        
	      
		
		
		
	}

}
