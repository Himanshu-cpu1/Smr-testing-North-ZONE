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


public class Network_Details  extends Login_Page {
	
   public static WebDriver driver;
   public WebDriverWait wait;
   
   @SuppressWarnings({"static-access" })
   @BeforeClass 
	public void Network() throws InterruptedException {
	   
	 //...................................................................................    	
	   this.driver=Login_Page.driver;   // call the login page 
//	   
//.............................Click on the Network Details..............................................................		
		WebElement Network = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[1]"));
		 Network.click();
//...........................Clear The Data.............................................
   }
   @Test(priority=0)   // clear the data
     	public void clearData() throws InterruptedException {
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	    Thread.sleep(2000);
//	    
//	       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
//		   String actualMessage = Validationmessage.getText();
//		   
//		   System.out.println("clear data Message  =" +actualMessage);
//		   String expectedMessage = "Cleared Successfully";
//		   Thread.sleep(2000);
//		   Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
//		   		
//..........................................................................................			    	      
	        WebElement N1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));	 	
			WebElement N2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));			
			WebElement N3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));			
			WebElement N4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));	
			
			WebElement N5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));			
			WebElement N6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));			
			WebElement N7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));			
			WebElement N8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));			
			WebElement N9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));		
			WebElement N10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));			
			WebElement N11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));			
			WebElement N12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
			
	     
//	     N1.sendKeys("-We9888989.");
//	     N2.sendKeys("-rY727180.");
//	     N3.sendKeys("-We9802989.");
//	     N4.sendKeys("-rY729880.");
//	     N5.sendKeys("-We9888989.");
//	     N6.sendKeys("-rY700180.");
//	     N7.sendKeys("-We900008989.");
//	     N8.sendKeys("-rY727180.");
//	     N9.sendKeys("-We9800989.");
//	     N10.sendKeys("-r1000000.");
//	     N11.sendKeys("-We98889899.");
//	     N12.sendKeys("-rY727180.");
   }
////.................Save the Data....................
//
//	 // Save the Data
//   @Test (priority=1)
//   public void Save_the_Data() throws InterruptedException {
//    //  save data
//     Thread.sleep(1000);	           
//     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click(); 
//     driver.findElement(By.cssSelector("[class=\"save\"]")).click();
//     
//     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
//	   String actualMessage = Validationmessage.getText();
//	   
//	  // System.out.println("actualMessage  =" +actualMessage);
//	   String expectedMessage = "Saved Successfully";
//	   Thread.sleep(2000);
//	   Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
//	   
//   }
		    // Put The Conditions For Every Elements
//.............................................................................................		

   
   @Test
   public void Main_Outlets_In_Network_details() {
		  wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));		  
		  
		   String RS1= N1.getAttribute("value");	
		   Assert.assertTrue(RS1.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(RS1) >= 0, "Input accepts negative value");	        
           Assert.assertTrue(RS1.matches("[0-9]+") && Long.parseLong(RS1)>=0, "Input accepts alphabet ");
           	}
  //..................................................................................................

        @Test
          public void E_Outlets_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		  
		  
		   String NS2= N2.getAttribute("value");	
		   Assert.assertTrue(NS2.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS2) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS2.matches("[0-9]+") && Long.parseLong(NS2)>=0, "Input accepts alphabet ");
        	}
     //..................................................................................................
        @Test
          public void R_Outlets_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));		  
		  
		   String NS3= N3.getAttribute("value");	
		   Assert.assertTrue(NS3.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS3) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS3.matches("[0-9]+") && Long.parseLong(NS3)>=0, "Input accepts alphabet ");
        	}
     //..................................................................................................
        @Test
          public void True_Value_Outlet_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));		  
		  
		   String NS4= N4.getAttribute("value");	
		   Assert.assertTrue(NS4.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS4) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS4.matches("[0-9]+") && Long.parseLong(NS4)>=0, "Input accepts alphabet ");
        	}
    //..................................................................................................
        @Test
          public void Workshop_Main_Workshops_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));		  
		  
		   String NS5= N5.getAttribute("value");	
		   Assert.assertTrue(NS5.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS5) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS5.matches("[0-9]+") && Long.parseLong(NS5)>=0, "Input accepts alphabet ");
        	}
     //..................................................................................................
        @Test
          public void Workshop_E_Workshops_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));		  
		  
		   String NS6= N6.getAttribute("value");	
		   Assert.assertTrue(NS6.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS6) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS6.matches("[0-9]+") && Long.parseLong(NS6)>=0, "Input accepts alphabet ");
        	}
     //..................................................................................................
        @Test
          public void Workshop_R_Workshops_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[7]")));		  
		  
		   String NS7= N7.getAttribute("value");	
		   Assert.assertTrue(NS7.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS7) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS7.matches("[0-9]+") && Long.parseLong(NS7)>=0, "Input accepts alphabet ");
        	}
     //..................................................................................................
        @Test
          public void Workshop_MSSSP_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));		  
		  
		   String NS8= N8.getAttribute("value");	
		   Assert.assertTrue(NS8.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS8) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS8.matches("[0-9]+") && Long.parseLong(NS8)>=0, "Input accepts alphabet ");
        	}
       //...........................................................................................................
        @Test
        public void BodyShop_Main_Workshops_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[9]")));		  
		  
		   String NS9= N9.getAttribute("value");	
		   Assert.assertTrue(NS9.length() <= 12, "Input accepts more than 12 characters");
         Assert.assertTrue(Long.parseLong(NS9) >= 0, "Input accepts negative value");	        
          Assert.assertTrue(NS9.matches("[0-9]+") && Long.parseLong(NS9)>=0, "Input accepts alphabet ");
      	}
        //..................................................................................................
        @Test
          public void Bodyshop_E_Workshops_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[10]")));		  
		  
		   String NS10= N10.getAttribute("value");	
		   Assert.assertTrue(NS10.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS10) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS10.matches("[0-9]+") && Long.parseLong(NS10)>=0, "Input accepts alphabet ");
        	}
      //..................................................................................................
        @Test
          public void Bodyshop_R_Workshops_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[11]")));		  
		  
		    String NS11= N11.getAttribute("value");	
		    Assert.assertTrue(NS11.length() <= 12, "Input accepts more than 12 characters");
            Assert.assertTrue(Long.parseLong(NS11) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS11.matches("[0-9]+") && Long.parseLong(NS11)>=0, "Input accepts alphabet ");
        	}
      //..................................................................................................
        @Test
          public void Bodyshop_MSSSP_In_Network_details() {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   WebElement N12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[12]")));		  
		  
		   String NS12= N12.getAttribute("value");	
		   Assert.assertTrue(NS12.length() <= 12, "Input accepts more than 12 characters");
           Assert.assertTrue(Long.parseLong(NS12) >= 0, "Input accepts negative value");	        
            Assert.assertTrue(NS12.matches("[0-9]+") && Long.parseLong(NS12)>=0, "Input accepts alphabet ");
        	}
        
      //.........................................................................................................
        @AfterClass
        public void tearDown () {	
      		 driver.quit();
        }
}
	

