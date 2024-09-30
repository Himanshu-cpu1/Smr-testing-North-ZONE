package sTOCK_Calculations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class S_Presso {
	public static void Spresso(WebDriver driver) {
		
		// Find the path Spresso 

	       
	       
	       WebElement S1= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	       WebElement S2= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	       WebElement S3= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	       WebElement S4= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	       WebElement S5= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
	       WebElement S6= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	       WebElement S7= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	       WebElement S8= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
	       WebElement S9= driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
	       WebElement S10= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
	       WebElement S11= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
	       WebElement S12= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
	       WebElement S13= driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
	       WebElement S14= driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
	       WebElement S15= driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
	       WebElement S16= driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
	       
	       // SEND THE VALUES 
	       
	       S1.sendKeys("328832");
	       S2.sendKeys("33232");
	       S3.sendKeys("62732");
	       S4.sendKeys("209389");
	       S5.sendKeys("287732");
	       S6.sendKeys("8239800");
	       
	       S8.sendKeys("62732");
	       S10.sendKeys("209389");
	       S11.sendKeys("287732");
	       S12.sendKeys("8200");
	       
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo longegers
	        long spresso1 = Long.parseLong(S1.getAttribute("value"));
	        long spresso2 = Long.parseLong(S2.getAttribute("value"));
		    long spresso3 = Long.parseLong(S3.getAttribute("value"));
		    long spresso4 = Long.parseLong(S4.getAttribute("value"));
		    long spresso5 = Long.parseLong(S5.getAttribute("value"));
		    long spresso6 = Long.parseLong(S6.getAttribute("value"));
		    long spresso7 = Long.parseLong(S7.getAttribute("value"));
		    long spresso8 = Long.parseLong(S8.getAttribute("value"));
		    long spresso9 = Long.parseLong(S9.getAttribute("value"));
		    long spresso10 = Long.parseLong(S10.getAttribute("value"));
		    long spresso11 = Long.parseLong(S11.getAttribute("value"));
		    long spresso12 = Long.parseLong(S12.getAttribute("value"));
		    long spresso13 = Long.parseLong(S13.getAttribute("value"));
		    long spresso14 = Long.parseLong(S14.getAttribute("value"));
		    long spresso15 = Long.parseLong(S15.getAttribute("value"));
		    long spresso16 = Long.parseLong(S16.getAttribute("value"));
		    
		    double SPRESSO1 = Double.parseDouble(S7.getAttribute("value"));// convert longo double for division
		//........................................................................................................
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
		  //..................................................................................................  
		    long expectedValue1= (spresso1+spresso3)-spresso5;  // RETAIL SALES # QTY
	        if (spresso7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION S_presso [RETAIL SALES # QTY]    VALID  =" + spresso7 );
											                            
			       } else {
		 	System.out.println("CALCULATION S_presso [RETAIL SALES # QTY]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + spresso7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue2= spresso8-(spresso2+spresso4-spresso6);  // MARGIN 
	        if (spresso9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION S_presso [(margin Amount (Rs.)] is   VALID  =" + spresso9 );
											                            
			       } else {
		 	System.out.println("CALCULATION S_presso [(margin Amount (Rs.)] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + spresso9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue3= spresso11+spresso12;  //Total Discount
	        if (spresso13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION S_presso [Total Discount] is   VALID  =" + spresso13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION S_presso [Total Discount] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + spresso13 );			        
					 }
	       //................................................................................................
	       
	        double expectedValue4 =spresso9/SPRESSO1 ;	// Margin/Car (Rs.)
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( spresso14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION S_presso  (Margin/Car (Rs.) VALID  =" + spresso14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION S_presso (Margin/Car (Rs.) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + spresso14 );			        
				 }
	        
	      //................................................................................................
	        
	        double expectedValue5 =spresso10/SPRESSO1 ;	// DRF/Car (Rs.)
	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( spresso15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION S_presso  (DRF/Car (Rs.)) VALID  =" + spresso15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION S_presso (DRF/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + spresso15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double expectedValue6 =spresso13/SPRESSO1 ;	// Discount/Car (Rs.)
	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( spresso16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION S_presso  (Discount/Car (Rs.)) VALID  =" + spresso16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION S_presso (Discount/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>. INVALID  = " + spresso16 );	
	 	      	 	      
				 }
	        {
	        	System.out.println(".................................................................................");
	        }
	        
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	        
	      
	       
	       
	       
			
			
			
		    
		
		
	}

}
