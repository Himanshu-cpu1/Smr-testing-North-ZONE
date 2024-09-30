package sTOCK_Calculations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ALTO_K10 {
	@Test
	public static void stock(WebDriver driver)  {
		      
       // find the path of ALTO K10
       
       WebElement A1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
       WebElement A2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
       WebElement A3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
       WebElement A4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
       WebElement A5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
       WebElement A6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
       WebElement A7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
       WebElement A8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
       WebElement A9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
       WebElement A10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
       WebElement A11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
       WebElement A12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
       WebElement A13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
       WebElement A14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
       WebElement A15= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
       WebElement A16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
       
    //    SEND THE VALUES 
       
       A1.sendKeys("10423324000");
       A2.sendKeys("323333777722");
       A3.sendKeys("6273334672");
       A4.sendKeys("4433332");
       A5.sendKeys("2873232732");
       A6.sendKeys("222032320");
       
       A8.sendKeys("627322333");
       A10.sendKeys("220032320");
       A11.sendKeys("22233232");
       A12.sendKeys("82032320");
       
       ///////////////////////////////////////////////////////////////////////////////////////////////////
       
     //  Convert longo longegers
        long alto1 = Long.parseLong(A1.getAttribute("value"));
        long alto2 = Long.parseLong(A2.getAttribute("value"));
	    long alto3 = Long.parseLong(A3.getAttribute("value"));
	    long alto4 = Long.parseLong(A4.getAttribute("value"));
	    long alto5 = Long.parseLong(A5.getAttribute("value"));
	    long alto6 = Long.parseLong(A6.getAttribute("value"));
	    long alto7 = Long.parseLong(A7.getAttribute("value"));
	    long alto8 = Long.parseLong(A8.getAttribute("value"));
	    long alto9 = Long.parseLong(A9.getAttribute("value"));
	    long alto10 = Long.parseLong(A10.getAttribute("value"));
	    long alto11 = Long.parseLong(A11.getAttribute("value"));
	    long alto12 = Long.parseLong(A12.getAttribute("value"));
	    long alto13 = Long.parseLong(A13.getAttribute("value"));
	    long alto14 = Long.parseLong(A14.getAttribute("value"));
	    long alto15 = Long.parseLong(A15.getAttribute("value"));
	    long alto16 = Long.parseLong(A16.getAttribute("value"));
	    
	    double Alto1 = Double.parseDouble(A7.getAttribute("value"));
	    
	    ///////////////////////////////////////////////////////////////////////////////////////////////
	    
	    {
	    	System.out.println("...............................................................................");
	    }
	    
	    // THEN WE PUT THE CONDITION FOR RESPECTED ELEMENTS
	  //..................................................................................................  
	    long expectedValue1= (alto1+alto3)-alto5;  // RETAIL SALES # QTY
        if (alto7 == expectedValue1 ) {
	        	
			  System.out.println("CALCULATION ALTO_K10 [RETAIL SALES # QTY]    VALID  =" + alto7 );
										                            
		       } else {
	 	System.out.println("CALCULATION ALTO_K10 [RETAIL SALES # QTY] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + alto7 );			        
				 }
    //................................................................................................
        //..................................................................................................  
	    long expectedValue2= alto8-(alto2+alto4-alto6);  // MARGIN 
        if (alto9 == expectedValue2 ) {
	        	
			  System.out.println("CALCULATION ALTO_K10 [(margin Amount (Rs.)] is   VALID  =" + alto9 );
										                            
		       } else {
	 	System.out.println("CALCULATION ALTO_K10 [(margin Amount (Rs.)] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   INVALID  = " + alto9 );			        
				 }
       //................................................................................................
        //..................................................................................................  
	    long expectedValue3= alto11+alto12;  //Total Discount
        if (alto13 == expectedValue3 ) {
	        	
			  System.out.println("CALCULATION ALTO_K10 [Total Discount] is   VALID  =" + alto13 );
										                            
		       } else {
	 	System.out.println(" CALCULATION ALTO_K10 [Total Discount] is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + alto13 );			        
				 }
       //................................................................................................
       
        double expectedValue4 =alto9/Alto1 ;	// Margin/Car (Rs.)
		long roundedResults1 = Math.round(expectedValue4);
					
        if ( alto14== roundedResults1 ) {
        	
		  System.out.println("CALCULATION ALTO_K10  (Margin/Car (Rs.) VALID  =" + alto14 );
									                            
	       } else {
 	      System.out.println("CALCULATION ALTO_K10 (Margin/Car (Rs.) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + alto14 );			        
			 }
        
      //................................................................................................
        
        double expectedValue5 =alto10/Alto1 ;	// DRF/Car (Rs.)
        
		long roundedResults2 = Math.round(expectedValue5);
					
        if ( alto15== roundedResults2 ) {
        	
		  System.out.println("CALCULATION ALTO_K10  (DRF/Car (Rs.)) VALID  =" + alto15 );
									                            
	       } else {
 	      System.out.println("CALCULATION ALTO_K10 (DRF/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID  = " + alto15 );			        
			 }
      //......................................................................................................
//................................................................................................
        
        double expectedValue6 =alto13/Alto1 ;	// Discount/Car (Rs.)
        
		long roundedResults3 = Math.round(expectedValue6);
					
        if ( alto16== roundedResults3 ) {
        	
		  System.out.println("CALCULATION ALTO_K10  (Discount/Car (Rs.)) VALID  =" + alto16 );
									                            
	       } else {
 	      System.out.println("CALCULATION ALTO_K10 (Discount/Car (Rs.)) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>INVALID  = " + alto16 );			        
			 }
        {
        	System.out.println("............................................................................");
        }
      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
      
       
       
       
		
		
		
		
		
	}

}
