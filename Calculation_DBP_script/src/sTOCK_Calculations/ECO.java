package sTOCK_Calculations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ECO {
	public static void eco(WebDriver driver) {
		

		// Find the path ECO
	       
	       WebElement Ec1= driver.findElement(By.xpath("(//*[@type=\"number\"])[129]"));
	       WebElement Ec2= driver.findElement(By.xpath("(//*[@type=\"number\"])[130]"));
	       WebElement Ec3= driver.findElement(By.xpath("(//*[@type=\"number\"])[131]"));
	       WebElement Ec4= driver.findElement(By.xpath("(//*[@type=\"number\"])[132]"));
	       WebElement Ec5= driver.findElement(By.xpath("(//*[@type=\"number\"])[133]"));
	       WebElement Ec6= driver.findElement(By.xpath("(//*[@type=\"number\"])[134]"));
	       WebElement Ec7= driver.findElement(By.xpath("(//*[@type=\"number\"])[135]"));
	       WebElement Ec8= driver.findElement(By.xpath("(//*[@type=\"number\"])[136]"));
	       WebElement Ec9= driver.findElement(By.xpath("(//*[@type=\"number\"])[137]"));
	       WebElement Ec10= driver.findElement(By.xpath("(//*[@type=\"number\"])[138]"));
	       WebElement Ec11= driver.findElement(By.xpath("(//*[@type=\"number\"])[139]"));
	       WebElement Ec12= driver.findElement(By.xpath("(//*[@type=\"number\"])[140]"));
	       WebElement Ec13= driver.findElement(By.xpath("(//*[@type=\"number\"])[141]"));
	       WebElement Ec14= driver.findElement(By.xpath("(//*[@type=\"number\"])[142]"));
	       WebElement Ec15= driver.findElement(By.xpath("(//*[@type=\"number\"])[143]"));
	       WebElement Ec16= driver.findElement(By.xpath("(//*[@type=\"number\"])[144]"));
	      
	       // SEND THE VALUES 
	       
	       Ec1.sendKeys("10000");
	       Ec2.sendKeys("6000");
	       Ec3.sendKeys("50099");
	       Ec4.sendKeys("30000");
	       Ec5.sendKeys("130000");
	       Ec6.sendKeys("08665");
	     
	       Ec8.sendKeys("10000");
	       Ec10.sendKeys("3000");
	       Ec11.sendKeys("8000");
	       Ec12.sendKeys("8200");
	    
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo longegers
	        long ECO1 = Long.parseLong(Ec1.getAttribute("value"));
	        long ECO2 = Long.parseLong(Ec2.getAttribute("value"));
		    long ECO3 = Long.parseLong(Ec3.getAttribute("value"));
		    long ECO4 = Long.parseLong(Ec4.getAttribute("value"));
		    long ECO5 = Long.parseLong(Ec5.getAttribute("value"));
		    long ECO6 = Long.parseLong(Ec6.getAttribute("value"));
		    long ECO7 = Long.parseLong(Ec7.getAttribute("value"));
		    long ECO8 = Long.parseLong(Ec8.getAttribute("value"));
		    long ECO9 = Long.parseLong(Ec9.getAttribute("value"));
		    long ECO10 = Long.parseLong(Ec10.getAttribute("value"));
		    long ECO11 = Long.parseLong(Ec11.getAttribute("value"));
		    long ECO12 = Long.parseLong(Ec12.getAttribute("value"));
		    long ECO13 = Long.parseLong(Ec13.getAttribute("value"));
		    long ECO14 = Long.parseLong(Ec14.getAttribute("value"));
		    long ECO15 = Long.parseLong(Ec15.getAttribute("value"));
		    long ECO16 = Long.parseLong(Ec16.getAttribute("value"));
		    
		    double Eco1 = Double.parseDouble(Ec7.getAttribute("value"));  // convert longo double FOR the Division
		   
		//........................................................................................................
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
		  //..................................................................................................  
		    long expectedValue1= (ECO1+ECO3)-ECO5;  // RETAIL SALES # QTY
	        if (ECO7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION ECO [RETAIL SALES # QTY]    VALID  =" + ECO7 );
											                            
			       } else {
		 	System.out.println("CALCULATION ECO [RETAIL SALES # QTY]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + ECO7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue2= ECO8-(ECO2+ECO4-ECO6);  // MARGIN 
	        if (ECO9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION ECO [(margin Amount (Rs.)] is   VALID  =" + ECO9 );
											                            
			       } else {
		 	System.out.println("CALCULATION ECO [(margin Amount (Rs.)] is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + ECO9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue3= ECO11+ECO12;  //Total Discount
	        if (ECO13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION ECO [Total Discount] is   VALID  =" + ECO13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION ECO [Total Discount] is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + ECO13 );			        
					 }
	       //................................................................................................
	        
	        
	        double expectedValue4 =ECO9/Eco1 ;	// Margin/Car (Rs.)
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( ECO14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION ECO (Margin/Car (Rs.) VALID  =" + ECO14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION ECO (Margin/Car (Rs.)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + ECO14 );			        
				 }
	        
	      //................................................................................................
	        
	        double expectedValue5 = ECO10/Eco1 ;	// DRF/Car (Rs.)	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( ECO15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION  ECO (DRF/Car (Rs.)) VALID  =" + ECO15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION ECO (DRF/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + ECO15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double expectedValue6 = ECO13/Eco1 ;	// Discount/Car (Rs.)	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( ECO16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION ECO  (Discount/Car (Rs.)) VALID  =" +  ECO16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION ECO (Discount/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " +ECO16 );			        
				 }
	        {
	        	System.out.println(".....................................................................................");
	        }
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<	        
	      
		
		
	}

}
