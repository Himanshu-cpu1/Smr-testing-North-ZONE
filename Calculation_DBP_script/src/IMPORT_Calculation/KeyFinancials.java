package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyFinancials {

	static void keyfinancial(WebDriver driver ) throws InterruptedException{
		
		//click on  the Keyfinancials
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[15]")).click();
		Thread.sleep(2000);
		
		{
			System.out.println(".........................KEY FINANCIALS.....................................");
		}
		
// /////////////////////////////////////////////////////////////////////////////////////////////////////
		//clear data first
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
	    Thread.sleep(2000);
	    
	    ////////////////////////////////////////////////////////////////////////////////
	    
	    // Find the Path of all elements
	    
	    WebElement KF1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
	    WebElement KF2 = driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
	    WebElement KF3 = driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")); // Long term Debt
	    WebElement KF4 = driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")); // Short term Debt

	    WebElement KF5 = driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
	    WebElement KF6 = driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
	    WebElement KF7 = driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
	    WebElement KF8 = driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
	    WebElement KF9 = driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
	    WebElement KF10 = driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
	    WebElement KF11 = driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
	    WebElement KF12 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
	    WebElement KF13 = driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
	    WebElement KF14 = driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
	    WebElement KF15 = driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
	
	    
	    // send the values in all fields
//	    KF1.sendKeys("10000");
//	    KF2.sendKeys("6000");
//	    KF5.sendKeys("34800");
//	    KF6.sendKeys("65554");
//	    KF7.sendKeys("2000");
//	    KF8.sendKeys("590000");
//	    KF9.sendKeys("1000540");
//	    KF10.sendKeys("434334");
//	    KF11.sendKeys("10000");
//	    KF12.sendKeys("3232");
//	    KF13.sendKeys("434");
//	    KF14.sendKeys("10443000");
//	    KF15.sendKeys("4443");
	    
	    // convert long  
	    long KeyFinancials1= Long.parseLong(KF3.getAttribute("value"));
	    long KeyFinancials2 = Long.parseLong(KF4.getAttribute("value"));
	    
//	    
////	       save data
//        Thread.sleep(1000);
//        
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
//        
//	   
	    
	   
	////////////////////////////////////////////////////////////////////////
	    
	     // Click on the longrest cost for matching data in key financials
	    
	    Thread.sleep(6000);
		
		  driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[4]")).click();
		  Thread.sleep(3000);	
		  
		  
           WebElement longrestCOST1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[73]"));// Totals of Long Term Loan          
           WebElement longrestCOST2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));// Total Short Term Loans
           
         // convert longo longegers
           
         long ICost1 = Long.parseLong(longrestCOST1.getAttribute("value"));
         
         long ICost2 = Long.parseLong(longrestCOST2.getAttribute("value"));

         
         // again it will comes to KeyFinancials
         driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[15]")).click();
 		 Thread.sleep(2000);
 		
 		
  //////////////////////////////////////////////////////////////////////////////////////////
         // put the condition to match the data from longrest cost
 		System.out.println("Totals of Long Term Loan  from lntrest Cost  =  "    + ICost1); // total long term loans
         if(KeyFinancials1==ICost1) {                                                  // Totals of Long Term Loan
				
				System.out.println("Matches values =  " + KeyFinancials1 );
			}else{
				
				System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Invalid  =  "  + KeyFinancials1);
				}
        //.............................................................................................
         
         {
        	 System.out.println(".......................................................................");
         }
         //......................................................................................
         
    	 System.out.println("Totals of short Term Loan  from lntrest cost =  "    + ICost2);  // Total Short Term Loans
  
         if(KeyFinancials2==ICost2) {
				
				System.out.println("Matches values =  " + KeyFinancials2 );
			}else{
				
				System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Invalid  =  "  + KeyFinancials2);
				}                          
         {
     		System.out.println(".........................E..N..D........................................................");
     		 }
	    
	    
	    
	    
	    
	    
	}
}
