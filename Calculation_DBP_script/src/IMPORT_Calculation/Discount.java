package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Discount {
	
	static void discount(WebDriver driver) throws InterruptedException {
		
		 Thread.sleep(1000);
//////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Click on the discount
		 
   driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[3]")).click();        
   Thread.sleep(5000);
   
   System.out.println("....................DISCOUNT......................................");
   System.out.println("............................................................................");

 //.......................................................................................................  
   // put the path oof all the element

	WebElement D1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));//Consumer Offer (SPOT+ RIPS)	
	
    WebElement D2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));//ISL/RMK
	
	WebElement D3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));	//	Exchange Bonus

	WebElement D4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));//Any Regional Office Scheme

	WebElement D5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));//Dealer Discount (Compulsion)
			
	WebElement D6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));//  Any Other

	WebElement D7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));// Total Discount *
	
	
	//...........................................................................................	
	// Then we send the values 
//	D1.sendKeys("600");
//	D2.sendKeys("400");
//	D3.sendKeys("200");
//	D4.sendKeys("100");
//	D6.sendKeys("300");  

	Thread.sleep(2000);
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// convert longo longegers
	
	  long Discount1 = Long.parseLong(D1.getAttribute("value")); //Consumer Offer (SPOT+ RIPS)
	  long Discount2 = Long.parseLong(D2.getAttribute("value")); //ISL/RMK
	  long Discount3 = Long.parseLong(D3.getAttribute("value")); //Exchange Bonus
	  long Discount4 = Long.parseLong(D4.getAttribute("value")); //Any Regional Office Scheme
	  long Discount5 = Long.parseLong(D5.getAttribute("value")); //Dealer Discount (Compulsion)
	  long Discount6 = Long.parseLong(D6.getAttribute("value")); //  Any Other
	  long Discount7 = Long.parseLong(D7.getAttribute("value")); // Total Discount *
	  
	  ///////////////////////////////////////////////////////////////////////////////////
	  
//	  //save data
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("(//*[@class=\"save-button btn custom-btn-primary ng-star-inserted\"])")).click();
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	  
	  // Then We put the condition for Autopopulated cells
	  
	  // We click on the STOCK To find the value of Total Dealer compulsion discount and Total Discount
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[2]")).click();        
	   Thread.sleep(2000);
	 //.....................................................................................
	   
	   WebElement S1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]")); // Total values of dealer Compulsion Discount
	   String STOCKS_Discount = S1.getAttribute("value"); // Or another attribute name   
       System.out.println("STOCKS Total Dealer compulsion Discount =  "+ STOCKS_Discount);
       
       WebElement S2= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]")); //Total Discount
       long TOTAL_Discount= Long.parseLong(S2.getAttribute("value"));
       System.out.println("STOCK SHEET Total Discount =  "+ TOTAL_Discount);
  //......................................................................................................
       // Then Again click on the Discount To match the Attribute values.
       
       Thread.sleep(4000);
         WebElement C = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[3]")); 
         Thread.sleep(1000);
                C.click();
                Thread.sleep(1000);
                
           WebElement DISCOUNT1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")); 
         
         String Dealer_Discount_Compulsion = DISCOUNT1.getAttribute("value"); 
         
         System.out.println("DISCOUNT Page: Dealer compulsion Discount  =  "+ Dealer_Discount_Compulsion);
         
     //.......................................................................................................  
         Thread.sleep(1000);
         
         if(Dealer_Discount_Compulsion.equals( STOCKS_Discount))
         {
         	System.out.println("Autopopulated Values of Dealer Compulsion Discount is VALID    =  "  + Dealer_Discount_Compulsion);         	
         }
         else 
         {
         	System.out.println("Autopopulated Values of Dealer Compulsion Discount >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Invalid   = "+   Dealer_Discount_Compulsion);
         }
    ////////////////////////////////////////////////////////////////////////////////////////
         	Thread.sleep(3000);
         	
		// Then we Put the condition For Total Values of Discount
         	
         	long  calculate_All_values = Discount1+Discount2+Discount3+Discount4+Discount5+Discount6;
         	if(Discount7==calculate_All_values)
         	{
         		System.out.println("Total Discount Value in DISCOUNT page is VALID * =  " +Discount7 );
         		
         	}
         	else
         	{
         		System.out.println("Total Discount Value in DISCOUNT page is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> INVALID * =  " +Discount7 );      		
         	}
         	
         	//Verify Total Discount in Discount page equals Total discount in stock sheet page
         	Thread.sleep(2000);
         	//WebElement DISCOUNT7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
         	
         	if(Discount7==TOTAL_Discount)
         	{
         		System.out.println("Total Discount in Discount equals Total Discount in Stock Sheet  VALID=  "  + TOTAL_Discount); 	
            }
         	else 
         	{
            	    System.out.println("Total Discount cell in Discount page should be highlighted with red color--------------------------------> INVALID "+TOTAL_Discount);
         	}
       	
         	
		
	}}
