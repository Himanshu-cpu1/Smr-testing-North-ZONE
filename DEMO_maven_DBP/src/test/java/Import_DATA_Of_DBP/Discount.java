package Import_DATA_Of_DBP;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public  class Discount extends Login_Page  {
	  public static WebDriver driver;
	   public WebDriverWait wait;
	   
	   long Discount1;
	   long Discount2;
	   long Discount3;
	   long Discount4;
	   long Discount5;
	   long Discount6;
	   long Discount7;
	   
	   long STOCKS_Discount;
	   long TOTAL_Discount;
	   
//.............................................................................................	   
	  	  
	   
	   @SuppressWarnings("static-access")
	    @BeforeClass 
		public void discount () throws InterruptedException{
		  
		   
		 this.driver=Login_Page.driver;
		 
		//.............................Click on the Discount..............................................................		
			WebElement Discounts = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[3]"));
			 Discounts.click();
			//...........................Clear The Data.............................................
//			 //clear data first
//	         Thread.sleep(2000);
//	          driver.findElement(By.xpath("(//*[@type=\"button\"])[1]")).click();
//	          Thread.sleep(2000);
//	          driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	          Thread.sleep(2000);
	//...........................................................................................
	          
	  		WebElement D1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));		  		
	        WebElement D2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));						
			WebElement D3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));						
			WebElement D4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));									
			WebElement D5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
			WebElement D6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));									
			WebElement D7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
			
			
//......................................Send The Values.......................................................			
//	         
//			D1.sendKeys("-Hj3000922");
//			D2.sendKeys("-8700327jhds.");
//			D3.sendKeys("-kjds134206230.");
//			D4.sendKeys("-[3828000isJ.");
//			D6.sendKeys("-jh8-82888");
			
			
//...................................................................

Discount1 = Long.parseLong(D1.getAttribute("value")); //Consumer Offer (SPOT+ RIPS)
Discount2 = Long.parseLong(D2.getAttribute("value")); //ISL/RMK
Discount3 = Long.parseLong(D3.getAttribute("value")); //Exchange Bonus
Discount4 = Long.parseLong(D4.getAttribute("value")); //Any Regional Office Scheme
Discount5 = Long.parseLong(D5.getAttribute("value")); //Dealer Discount (Compulsion)
Discount6 = Long.parseLong(D6.getAttribute("value")); //  Any Other
Discount7 = Long.parseLong(D7.getAttribute("value")); // Total Discount *

Thread.sleep(2000);
//...................................Save the Data.............................................................			
//			WebElement Save = driver.findElement(By.xpath("//*[contains(text(),'Save')]"));
//			Save.click();
//			WebElement save2 = driver.findElement(By.xpath("(//*[@type=\"button\"])[5]"));
//			save2.click();
//......................................Click on the Stocks To match The values in Discounts............................................................			
			   Thread.sleep(1000);
		       driver.findElement(By.xpath("//*[contains(text(),'Stock Sheet ')]")).click();        
		       Thread.sleep(1000);
		       
//.............................. Total values of dealer Compulsion Discount................................................................
		       
			WebElement S1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[12]")); 
			 STOCKS_Discount= Long.parseLong(S1.getAttribute("value"));  
			System.out.println("STOCKS Total Dealer compulsion Discount =  "+ STOCKS_Discount);

			WebElement S2= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]")); //Total Discount
			 TOTAL_Discount= Long.parseLong(S2.getAttribute("value"));
			System.out.println("STOCK SHEET Total Discount =  "+ TOTAL_Discount);
//..................................................................................................
//.............................Click on the Discount again..............................................................		
			 WebElement Discounts1 = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[3]"));
			 Discounts1.click();
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>			 
	   }
	//...........................................................................
	    @Test(priority=0)
    public void Consumer_Offer_SPOT_RIPS() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement D1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));		  
		  
		   String DS1= D1.getAttribute("value");	
		   Assert.assertTrue(DS1.length() <= 12, "Input accepts more than 12 characters");
        Assert.assertTrue(Long.parseLong(DS1) >= 0, "Input accepts negative value");	        
        Assert.assertTrue(DS1.matches("[0-9]+") && Long.parseLong(DS1)>=0, "Input accepts alphabet ");
  	}
//...........................................................................
	    @Test(priority=1)
    public void ISL_RMK() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement D2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		  
		  
		   String DS1= D2.getAttribute("value");	
		   Assert.assertTrue(DS1.length() <= 12, "Input accepts more than 12 characters");
        Assert.assertTrue(Long.parseLong(DS1) >= 0, "Input accepts negative value");	        
        Assert.assertTrue(DS1.matches("[0-9]+") && Long.parseLong(DS1)>=0, "Input accepts alphabet ");
  	}
	//...........................................................................
	    @Test(priority=2)
    public void Exchange_Bonus() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement D3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));		  
		  
		   String DS3= D3.getAttribute("value");	
		   Assert.assertTrue(DS3.length() <= 12, "Input accepts more than 12 characters");
        Assert.assertTrue(Long.parseLong(DS3) >= 0, "Input accepts negative value");	        
        Assert.assertTrue(DS3.matches("[0-9]+") && Long.parseLong(DS3)>=0, "Input accepts alphabet ");
  	}
	//...........................................................................
	    @Test(priority=3)
    public void Any_Regional_Office_Scheme() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement D4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));		  
		  
		   String DS4= D4.getAttribute("value");	
		   Assert.assertTrue(DS4.length() <= 12, "Input accepts more than 12 characters");
        Assert.assertTrue(Long.parseLong(DS4) >= 0, "Input accepts negative value");	        
        Assert.assertTrue(DS4.matches("[0-9]+") && Long.parseLong(DS4)>=0, "Input accepts alphabet ");
  	}
	//...........................................................................
	    @Test(priority=4)
    public void Any_Other() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement D6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));		  
		  
		   String DS6= D6.getAttribute("value");	
		   Assert.assertTrue(DS6.length() <= 12, "Input accepts more than 12 characters");
        Assert.assertTrue(Long.parseLong(DS6) >= 0, "Input accepts negative value");	        
        Assert.assertTrue(DS6.matches("[0-9]+") && Long.parseLong(DS6)>=0, "Input accepts alphabet ");
  	}
	 //...........................................................................
	    @Test(priority=5)
       public void Total_Discount() throws InterruptedException {
	       Thread.sleep(1000);
		   long ExpectedDiscount = Discount1+Discount2+Discount3+Discount4+Discount5+Discount6;		   
		   Assert.assertEquals(ExpectedDiscount, Discount7, "Value is INVALID =  ");		   		   		   		  
  	}
	//...........................................................................
	    @Test(priority=6)
       public void Dealer_Discount_Compulsion_Matches_From_STOCKs() throws InterruptedException {
	       Thread.sleep(1000);
		  	  Assert.assertEquals(STOCKS_Discount, Discount5, "Values are Invalid =");	   	   		   		   		  
  	}
	//...........................................................................
	    @Test(priority=7)
       public void Total_Discount_Matches_From_STOCKs() throws InterruptedException {
	       Thread.sleep(1000);
		  	  Assert.assertEquals(Discount7 , TOTAL_Discount, "Values are Invalid =");	   	   		   		   		  
  	}
	    
	/////////////////////////////////////////////////////////////////////////////////////////////////   
	         @AfterClass
	          public static void tearDown () throws InterruptedException {	
	        	 
	        	 driver.quit();
	        	 
	          }
			 
	
			 
}
