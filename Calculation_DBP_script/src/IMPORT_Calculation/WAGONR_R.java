package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WAGONR_R {

	static void wagonr(WebDriver driver) {
		
		// Find the path WAGONR_R 
	       
	       WebElement W1= driver.findElement(By.xpath("(//*[@type=\"number\"])[49]"));
	       WebElement W2= driver.findElement(By.xpath("(//*[@type=\"number\"])[50]"));
	       WebElement W3= driver.findElement(By.xpath("(//*[@type=\"number\"])[51]"));
	       WebElement W4= driver.findElement(By.xpath("(//*[@type=\"number\"])[52]"));
	       WebElement W5= driver.findElement(By.xpath("(//*[@type=\"number\"])[53]"));
	       WebElement W6= driver.findElement(By.xpath("(//*[@type=\"number\"])[54]"));
	       WebElement W7= driver.findElement(By.xpath("(//*[@type=\"number\"])[55]"));
	       WebElement W8= driver.findElement(By.xpath("(//*[@type=\"number\"])[56]"));
	       WebElement W9= driver.findElement(By.xpath("(//*[@type=\"number\"])[57]"));
	       WebElement W10= driver.findElement(By.xpath("(//*[@type=\"number\"])[58]"));
	       WebElement W11= driver.findElement(By.xpath("(//*[@type=\"number\"])[59]"));
	       WebElement W12= driver.findElement(By.xpath("(//*[@type=\"number\"])[60]"));
	       WebElement W13= driver.findElement(By.xpath("(//*[@type=\"number\"])[61]"));
	       WebElement W14= driver.findElement(By.xpath("(//*[@type=\"number\"])[62]"));
	       WebElement W15= driver.findElement(By.xpath("(//*[@type=\"number\"])[63]"));
	       WebElement W16= driver.findElement(By.xpath("(//*[@type=\"number\"])[64]"));
	       
	       // SEND THE VALUES 
//	       
//	       W1.sendKeys("3286");
//	       W2.sendKeys("33232");
//	       W3.sendKeys("6273");
//	       W4.sendKeys("209389");
//	       W5.sendKeys("282");
//	       W6.sendKeys("8239800");
//	      
//	       W8.sendKeys("62732");
//	       W10.sendKeys("209389");
//	       W11.sendKeys("287732");
//	       W12.sendKeys("8200");
	      
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo longegers
	        long WAGONR1 = Long.parseLong(W1.getAttribute("value"));
	        long WAGONR2 = Long.parseLong(W2.getAttribute("value"));
		    long WAGONR3 = Long.parseLong(W3.getAttribute("value"));
		    long WAGONR4 = Long.parseLong(W4.getAttribute("value"));
		    long WAGONR5 = Long.parseLong(W5.getAttribute("value"));
		    long WAGONR6 = Long.parseLong(W6.getAttribute("value"));
		    long WAGONR7 = Long.parseLong(W7.getAttribute("value"));
		    long WAGONR8 = Long.parseLong(W8.getAttribute("value"));
		    long WAGONR9 = Long.parseLong(W9.getAttribute("value"));
		    long WAGONR10 = Long.parseLong(W10.getAttribute("value"));
		    long WAGONR11 = Long.parseLong(W11.getAttribute("value"));
		    long WAGONR12 = Long.parseLong(W12.getAttribute("value"));
		    long WAGONR13 = Long.parseLong(W13.getAttribute("value"));
		    long WAGONR14 = Long.parseLong(W14.getAttribute("value"));
		    long WAGONR15 = Long.parseLong(W15.getAttribute("value"));
		    long WAGONR16 = Long.parseLong(W16.getAttribute("value"));
		    
		    double wagonar1 = Double.parseDouble(W7.getAttribute("value")); // convert longo float for Division
		   
		//........................................................................................................
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
		  //..................................................................................................  
		   long expectedValue1= (WAGONR1+WAGONR3)-WAGONR5;  // RETAIL SALES # QTY
	        if (WAGONR7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION WAGONR_R [RETAIL SALES # QTY]    VALID  =" + WAGONR7 );
											                            
			       } else {
		 	System.out.println("CALCULATION WAGONR_R [RETAIL SALES # QTY] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + WAGONR7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue2= WAGONR8-(WAGONR2+WAGONR4-WAGONR6);  // MARGIN 
	        if (WAGONR9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION WAGONR_R [(margin Amount (Rs.)] is   VALID  =" + WAGONR9 );
											                            
			       } else {
		 	System.out.println("CALCULATION WAGONR_R [(margin Amount (Rs.)] is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + WAGONR9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue3= WAGONR11+WAGONR12;  //Total Discount
	        if (WAGONR13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION WAGONR_R [Total Discount] is   VALID  =" + WAGONR13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION WAGONR_R [Total Discount] is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + WAGONR13 );			        
					 }
	       //................................................................................................
	       
	        double expectedValue4 =WAGONR9/wagonar1 ;	// Margin/Car (Rs.)
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( WAGONR14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION WAGONR_R (Margin/Car (Rs.) VALID  =" + WAGONR14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION WAGONR_R (Margin/Car (Rs.) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + WAGONR14 );			        
				 }
	        
	      //................................................................................................
	        
	        double expectedValue5 =WAGONR10/wagonar1 ;	// DRF/Car (Rs.)
	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( WAGONR15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION WAGONR_R (DRF/Car (Rs.)) VALID  =" + WAGONR15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION WAGONR_R (DRF/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + WAGONR15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double expectedValue6 =WAGONR13/wagonar1 ;	// Discount/Car (Rs.)
	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( WAGONR16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION WAGONR_R  (Discount/Car (Rs.)) VALID  =" + WAGONR16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION WAGONR_R (Discount/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + WAGONR16 );			        
				 }
	        {
	        	System.out.println("..............................................................................");
	        }
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	        
	      
		
		
	}
}
