package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DZIRE {

	static void dzire(WebDriver driver ) {
		
		// Find the path SWIFT 
	       
	       WebElement D1= driver.findElement(By.xpath("(//*[@type=\"number\"])[81]"));
	       WebElement D2= driver.findElement(By.xpath("(//*[@type=\"number\"])[82]"));
	       WebElement D3= driver.findElement(By.xpath("(//*[@type=\"number\"])[83]"));
	       WebElement D4= driver.findElement(By.xpath("(//*[@type=\"number\"])[84]"));
	       WebElement D5= driver.findElement(By.xpath("(//*[@type=\"number\"])[85]"));
	       WebElement D6= driver.findElement(By.xpath("(//*[@type=\"number\"])[86]"));
	       WebElement D7= driver.findElement(By.xpath("(//*[@type=\"number\"])[87]"));
	       WebElement D8= driver.findElement(By.xpath("(//*[@type=\"number\"])[88]"));
	       WebElement D9= driver.findElement(By.xpath("(//*[@type=\"number\"])[89]"));
	       WebElement D10= driver.findElement(By.xpath("(//*[@type=\"number\"])[90]"));
	       WebElement D11= driver.findElement(By.xpath("(//*[@type=\"number\"])[91]"));
	       WebElement D12= driver.findElement(By.xpath("(//*[@type=\"number\"])[92]"));
	       WebElement D13= driver.findElement(By.xpath("(//*[@type=\"number\"])[93]"));
	       WebElement D14= driver.findElement(By.xpath("(//*[@type=\"number\"])[94]"));
	       WebElement D15= driver.findElement(By.xpath("(//*[@type=\"number\"])[95]"));
	       WebElement D16= driver.findElement(By.xpath("(//*[@type=\"number\"])[96]"));
	      
	       // SEND THE VALUES 
	       
//	       D1.sendKeys("400");
//	       D2.sendKeys("3000");
//	       D3.sendKeys("6273");
//	       D4.sendKeys("2089");
//	       D5.sendKeys("18383");
//	       D6.sendKeys("6700");
//	      
//	       D8.sendKeys("10000");
//	       D10.sendKeys("77888");
//	       D11.sendKeys("900");
//	       D12.sendKeys("8200");
	     
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo longegers
	        long DZIRE1 = Long.parseLong(D1.getAttribute("value"));
	        long DZIRE2 = Long.parseLong(D2.getAttribute("value"));
		    long DZIRE3 = Long.parseLong(D3.getAttribute("value"));
		    long DZIRE4 = Long.parseLong(D4.getAttribute("value"));
		    long DZIRE5 = Long.parseLong(D5.getAttribute("value"));
		    long DZIRE6 = Long.parseLong(D6.getAttribute("value"));
		    long DZIRE7 = Long.parseLong(D7.getAttribute("value"));
		    long DZIRE8 = Long.parseLong(D8.getAttribute("value"));
		    long DZIRE9 = Long.parseLong(D9.getAttribute("value"));
		    long DZIRE10 = Long.parseLong(D10.getAttribute("value"));
		    long DZIRE11 = Long.parseLong(D11.getAttribute("value"));
		    long DZIRE12 = Long.parseLong(D12.getAttribute("value"));
		    long DZIRE13 = Long.parseLong(D13.getAttribute("value"));
		    long DZIRE14 = Long.parseLong(D14.getAttribute("value"));
		    long DZIRE15 = Long.parseLong(D15.getAttribute("value"));
		    long DZIRE16 = Long.parseLong(D16.getAttribute("value"));
		    
		    double dzire1 = Double.parseDouble(D7.getAttribute("value")); // convert longo float for division
		   
		//........................................................................................................
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
		  //..................................................................................................  
		    long expectedValue1= (DZIRE1+DZIRE3)-DZIRE5;  // RETAIL SALES # QTY
	        if (DZIRE7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION DZIRE [RETAIL SALES # QTY]    VALID  =" + DZIRE7 );
											                            
			       } else {
		 	System.out.println("CALCULATION DZIRE [RETAIL SALES # QTY]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " +DZIRE7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
	        long expectedValue2= DZIRE8-(DZIRE2+DZIRE4-DZIRE6);  // MARGIN 
	        if (DZIRE9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION DZIRE [(margin Amount (Rs.)] is   VALID  =" + DZIRE9 );
											                            
			       } else {
		 	System.out.println("CALCULATION DZIRE [(margin Amount (Rs.)] is <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< INVALID  = " + DZIRE9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
	        long expectedValue3= DZIRE11+DZIRE12;  //Total Discount
	        if (DZIRE13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION DZIRE [Total Discount] is   VALID  =" + DZIRE13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION DZIRE [Total Discount] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + DZIRE13 );			        
					 }
	       //................................................................................................
	       
	        double expectedValue4 =DZIRE9/dzire1 ;	// Margin/Car (Rs.)
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( DZIRE14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION DZIRE (Margin/Car (Rs.) VALID  =" + DZIRE14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION DZIRE (Margin/Car (Rs.)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + DZIRE14 );			        
				 }
	        
	      //................................................................................................
	        
	        double  expectedValue5 =DZIRE10/dzire1 ;	// DRF/Car (Rs.)
	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( DZIRE15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION  DZIRE (DRF/Car (Rs.)) VALID  =" +DZIRE15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION DZIRE (DRF/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + DZIRE15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double  expectedValue6 =DZIRE13/dzire1 ;	// Discount/Car (Rs.)
	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( DZIRE16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION DZIRE  (Discount/Car (Rs.)) VALID  =" +DZIRE16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION DZIRE (Discount/Car (Rs.))>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + DZIRE16 );			        
				 }
	        {
	        	System.out.println("..........................................................................");
	        }
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<	        
	      
		
		
		
		
		
	}
}
