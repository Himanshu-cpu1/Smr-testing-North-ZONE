package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SUPPER_CARRY {
	static void supercarry(WebDriver driver ) {

		// Find the path SUPER CARRY
	       
	       WebElement super1= driver.findElement(By.xpath("(//*[@type=\"number\"])[145]"));
	       WebElement super2= driver.findElement(By.xpath("(//*[@type=\"number\"])[146]"));
	       WebElement super3= driver.findElement(By.xpath("(//*[@type=\"number\"])[147]"));
	       WebElement super4= driver.findElement(By.xpath("(//*[@type=\"number\"])[148]"));
	       WebElement super5= driver.findElement(By.xpath("(//*[@type=\"number\"])[149]"));
	       WebElement super6= driver.findElement(By.xpath("(//*[@type=\"number\"])[150]"));
	       WebElement super7= driver.findElement(By.xpath("(//*[@type=\"number\"])[151]"));
	       WebElement super8= driver.findElement(By.xpath("(//*[@type=\"number\"])[152]"));
	       WebElement super9= driver.findElement(By.xpath("(//*[@type=\"number\"])[153]"));
	       WebElement super10= driver.findElement(By.xpath("(//*[@type=\"number\"])[154]"));
	       WebElement super11= driver.findElement(By.xpath("(//*[@type=\"number\"])[155]"));
	       WebElement super12= driver.findElement(By.xpath("(//*[@type=\"number\"])[156]"));
	       WebElement super13= driver.findElement(By.xpath("(//*[@type=\"number\"])[157]"));
	       WebElement super14= driver.findElement(By.xpath("(//*[@type=\"number\"])[158]"));
	       WebElement super15= driver.findElement(By.xpath("(//*[@type=\"number\"])[159]"));
	       WebElement super16= driver.findElement(By.xpath("(//*[@type=\"number\"])[160]"));
	      
	       // SEND THE VALUES 
//	       
//	       super1.sendKeys("100800");
//	       super2.sendKeys("60000");
//	       super3.sendKeys("400088");
//	       super4.sendKeys("3032000");
//	       super5.sendKeys("2000");
//	       super6.sendKeys("1000000");
//	     
//	       super8.sendKeys("1000000");
//	       super10.sendKeys("308700");
//	       super11.sendKeys("800870");
//	       super12.sendKeys("820870");
	    
	       ///////////////////////////////////////////////////////////////////////////////////////////////////
	       
	     //  Convert longo longegers
	        long CARRY1 = Long.parseLong(super1.getAttribute("value"));
	        long CARRY2 = Long.parseLong(super2.getAttribute("value"));
		    long CARRY3 = Long.parseLong(super3.getAttribute("value"));
		    long CARRY4 = Long.parseLong(super4.getAttribute("value"));
		    long CARRY5 = Long.parseLong(super5.getAttribute("value"));
		    long CARRY6 = Long.parseLong(super6.getAttribute("value"));
		    long CARRY7 = Long.parseLong(super7.getAttribute("value"));
		    long CARRY8 = Long.parseLong(super8.getAttribute("value"));
		    long CARRY9 = Long.parseLong(super9.getAttribute("value"));
		    long CARRY10 = Long.parseLong(super10.getAttribute("value"));
		    long CARRY11 = Long.parseLong(super11.getAttribute("value"));
		    long CARRY12 = Long.parseLong(super12.getAttribute("value"));
		    long CARRY13 = Long.parseLong(super13.getAttribute("value"));
		    long CARRY14 = Long.parseLong(super14.getAttribute("value"));
		    long CARRY15 = Long.parseLong(super15.getAttribute("value"));
		    long CARRY16 = Long.parseLong(super16.getAttribute("value"));
		    
		    double Carry1 = Double.parseDouble(super7.getAttribute("value"));// convert longo float FOR the Division
		    
		   
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////
		    
		    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
//..................................................................................................  
		   long expectedValue1= (CARRY1+CARRY3)-CARRY5;  // RETAIL SALES # QTY
	        if (CARRY7 == expectedValue1 ) {
		        	
				  System.out.println("CALCULATION SUPPER_CARRY [RETAIL SALES # QTY]    VALID  =" + CARRY7 );
											                            
			       } else {
		 	System.out.println("CALCULATION SUPPER_CARRY [RETAIL SALES # QTY] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   INVALID  = " + CARRY7 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue2= CARRY8-(CARRY2+CARRY4-CARRY6);  // MARGIN 
	        if (CARRY9 == expectedValue2 ) {
		        	
				  System.out.println("CALCULATION SUPPER_CARRY [(margin Amount (Rs.)] is   VALID  =" + CARRY9 );
											                            
			       } else {
		 	System.out.println("CALCULATION SUPPER_CARRY [(margin Amount (Rs.)] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + CARRY9 );			        
					 }
	       //................................................................................................
	        //..................................................................................................  
		    long expectedValue3= CARRY11+CARRY12;  //Total Discount
	        if (CARRY13 == expectedValue3 ) {
		        	
				  System.out.println("CALCULATION SUPPER_CARRY [Total Discount] is   VALID  =" + CARRY13 );
											                            
			       } else {
		 	System.out.println(" CALCULATION SUPPER_CARRY [Total Discount] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + CARRY13 );			        
					 }
	   //................................................................................................
	        
	        
	        double expectedValue4 =CARRY9/Carry1 ;	// Margin/Car (Rs.) 
			long roundedResults1 = Math.round(expectedValue4);
						
	        if ( CARRY14== roundedResults1 ) {
	        	
			  System.out.println("CALCULATION SUPPER_CARRY (Margin/Car (Rs.) VALID  =" + CARRY14 );
										                            
		       } else {
	 	      System.out.println("CALCULATION SUPPER_CARRY (Margin/Car (Rs.) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + CARRY14 );			        
				 }
	        
	      //................................................................................................
	        
	        double expectedValue5 = CARRY10/Carry1 ;	// DRF/Car (Rs.)
	        
			long roundedResults2 = Math.round(expectedValue5);
						
	        if ( CARRY15== roundedResults2 ) {
	        	
			  System.out.println("CALCULATION  SUPPER_CARRY (DRF/Car (Rs.)) VALID  =" + CARRY15 );
										                            
		       } else {
	 	      System.out.println("CALCULATION SUPPER_CARRY (DRF/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + CARRY15 );			        
				 }
	      //......................................................................................................
	//................................................................................................
	        
	        double expectedValue6 = CARRY13/Carry1 ;	// Discount/Car (Rs.)
	        
			long roundedResults3 = Math.round(expectedValue6);
						
	        if ( CARRY16== roundedResults3 ) {
	        	
			  System.out.println("CALCULATION SUPPER_CARRY  (Discount/Car (Rs.)) VALID  =" +  CARRY16 );
										                            
		       } else {
	 	      System.out.println("CALCULATION SUPPER_CARRY (Discount/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " +CARRY16 );			        
				 }
	        
	        
	        
	        {
	        	System.out.println(".........................................................................");

	        	System.out.println("...........................................................................");
	        }
	      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<	        
	      
		
	}

}
