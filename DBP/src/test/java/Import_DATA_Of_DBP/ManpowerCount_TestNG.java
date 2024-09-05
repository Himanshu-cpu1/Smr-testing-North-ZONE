package Import_DATA_Of_DBP;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ManpowerCount_TestNG extends LOGIN {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	long nc1;
	long nc2;
	long nc3;
	long nc4;
	long nc5;
	long nc6;
	long nc7;
	long nc8;
	long nc9;
	long nc10;
	long nc11;
	long nc12;
	long nc13;
	long nc14;
	long nc15;
	long nc16;
	long nc17;
	long nc18;
	long nc19;
	long nc20;
	long nc21;
	long nc22;
	long nc23;
	long ms1;
	long ms2;
	long ms3;
	long ms4;
	long ms5;
	long ms6;
	long ms7;
	long ws1;
	long ws2;
	long ws3;
	long ws4;
	long ws5;
	long ws6;
	long ws7;
	long ws8;
	long ws9;
	long ws10;
	long ws11;
	long ws12;
	long ws13;
	long ws14;
	long ws15;
	long ws16;
	long ws17;
	long ws18;
	long ws19;
	long ws20;
	long ws21;
	long ws22;
	long ws23;
	long ws24;
	long ws25;
	long ws26;
	long ws27;
	long ws28;
	long ws29;
	long ws30;
	long ws31;
	long ws32;
	long ws33;
	long ws34;
	long ws35;
	long ws36;
	long ws37;
	long ws38;
	long ws39;
	long ws40;
	long ws41;
	long ws42;
	long ws43;
	long ws44;
	long ws45;
	long sp1;
	long sp2;
	long sp3;
	long sp4;
	long sp5;
	long sp6;
	long sp7;
	long sp8;
	long tv1;
	long tv2;
	long tv3;
	long tv4;
	long tv5;
	long tv6;
	long tv7;
	long tv8;
	long tv9;
	long tv10;
	long tv11;
	long tv12;
	long tv13;
	long tv14;
	long tv15;
	long tv16;
	long tv17;
	long tv18;
	long tv19;
	long tv20;
	long mir1;
	long mir2;
	long mir3;
	long mir4;
	long mir5;
	long mir6;
	long mir7;
	long mir8;
	long mds1;
	long mds2;
	long mds3;
	long mds4;
	long mds5;
	long mds6;
	long cm1;
	long cm2;
	long cm3;
	long cm4;
	long cm5;
	long cm6;
	long cm7;
	long cm8;
	long cm9;
	long cm10;
	long cm11;
	long cm12;
	long cm13;
	long cm14;
	long cm15;
	long cm16;
	long cm17;
	long cm18;
	long cm19;
	long cm20;
	
	
	@SuppressWarnings("static-access")
	@BeforeClass
	public void ManpowerCount() throws InterruptedException {
		   Thread.sleep(3000);	
	//...................................................................................    	
		   this.driver=LOGIN.driver;   // call the login page 
   //...................................................................................................................................................	
	//click on Manpower Count
   Thread.sleep(3000);	
    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[5]")).click();        
    Thread.sleep(3000);
	}
   //............................................................................................
    @Test(priority=0)   // clear the data
  	public void clearData() throws InterruptedException {
//    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//    Thread.sleep(2000);
//    
//    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
//	String actualMessage = Validationmessage.getText();
//	   
//	System.out.println("clear data Message  =" +actualMessage);
//	String expectedMessage = "Cleared Successfully";
//	Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
////.........................................................................................
	Thread.sleep(2000);	
	
	WebElement n1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement n2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement n3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement n4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement n5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement n6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement n7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement n8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	WebElement n9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	WebElement n10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	WebElement n11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	WebElement n12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	WebElement n13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	WebElement n14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	WebElement n15= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	WebElement n16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	WebElement n17= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	WebElement n18= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	WebElement n19= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	WebElement n20= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	WebElement n21= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
	WebElement n22= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	WebElement n23= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	 
//	Thread.sleep(2000);	
//	//send values
//	n1.sendKeys("-10.");
//	n2.sendKeys("-10.");
//	n3.sendKeys("-20.");
//	n4.sendKeys("-20ab.");
//	n5.sendKeys("-30.");
//	n6.sendKeys("-15&&");
//	n7.sendKeys("-25[.");
//	n8.sendKeys("-25[.");
//	n9.sendKeys("-12qa");
//	n10.sendKeys("-12.");
//	n11.sendKeys("-012");
//	n12.sendKeys("-20abc");
//	n13.sendKeys("15@%.");
//	n14.sendKeys("-80@w");
//	n15.sendKeys("-e17.");
//	n16.sendKeys("13ah.");
//	n17.sendKeys("-lo*12.");
//	n18.sendKeys("-12*.");
//	n19.sendKeys("-poi&12.");
//	n20.sendKeys("-&&12.");
//	n21.sendKeys("-12%$er.");	
//	
	Thread.sleep(2000);	
	//convert into integers
	nc1=Long.parseLong(n1.getAttribute("value"));
	nc2=Long.parseLong(n2.getAttribute("value"));
	nc3=Long.parseLong(n3.getAttribute("value"));
	nc4=Long.parseLong(n4.getAttribute("value"));
	nc5=Long.parseLong(n5.getAttribute("value"));
	nc6=Long.parseLong(n6.getAttribute("value"));
	nc7=Long.parseLong(n7.getAttribute("value"));
	nc8=Long.parseLong(n8.getAttribute("value"));
	nc9=Long.parseLong(n9.getAttribute("value"));
	nc10=Long.parseLong(n10.getAttribute("value"));
	nc11=Long.parseLong(n11.getAttribute("value"));
	nc12=Long.parseLong(n12.getAttribute("value"));
	nc13=Long.parseLong(n13.getAttribute("value"));
	nc14=Long.parseLong(n14.getAttribute("value"));
	nc15=Long.parseLong(n15.getAttribute("value"));
	nc16=Long.parseLong(n16.getAttribute("value"));
	nc17=Long.parseLong(n17.getAttribute("value"));
	nc18=Long.parseLong(n18.getAttribute("value"));
	nc19=Long.parseLong(n19.getAttribute("value"));
	nc20=Long.parseLong(n20.getAttribute("value"));
	nc21=Long.parseLong(n21.getAttribute("value"));
	nc22=Long.parseLong(n22.getAttribute("value"));
	nc23=Long.parseLong(n23.getAttribute("value"));
}	
//..................................................................................
    @Test(priority = 1)
    public void  NewCar_DirectMP_GeneralM() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));	    
    
    String NC1= N1.getAttribute("value");	
    Assert.assertTrue(NC1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC1.matches("[0-9]+") && Long.parseLong(NC1)>=0, "Input accepts alphabets");
         
         //NcDm1= Long.parseLong(N1.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 2)
    public void  NewCar_DirectMP_SalesM() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		    
    String NC2= N2.getAttribute("value");	
    Assert.assertTrue(NC2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC2.matches("[0-9]+") && Long.parseLong(NC2)>=0, "Input accepts alphabets");
         
         //NcDm2= Long.parseLong(N2.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 3)
    public void  NewCar_DirectMP_RelationM() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));
	
		    
    String NC3= N3.getAttribute("value");	
    Assert.assertTrue(NC3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC3.matches("[0-9]+") && Long.parseLong(NC3)>=0, "Input accepts alphabets");
         
         //NcDm3= Long.parseLong(N3.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 4)
    public void  NewCar_DirectMP_TeamL() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));
	
		    
    String NC4= N4.getAttribute("value");	
    Assert.assertTrue(NC4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC4.matches("[0-9]+") && Long.parseLong(NC4)>=0, "Input accepts alphabets");
         
        //NcDm4= Long.parseLong(N4.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 5)
    public void  NewCar_InDirectMP_QCM() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));
	
		    
    String NC5= N5.getAttribute("value");	
    Assert.assertTrue(NC5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC5.matches("[0-9]+") && Long.parseLong(NC5)>=0, "Input accepts alphabets");
         
        // NcDm5= Long.parseLong(N5.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 6)
    public void  NewCar_InDirectMP_QCE() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));
	
		    
    String NC6= N6.getAttribute("value");	
    Assert.assertTrue(NC6.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC6) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC6.matches("[0-9]+") && Long.parseLong(NC6)>=0, "Input accepts alphabets");
         
         //NcDm6= Long.parseLong(N6.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 7)
    public void  NewCar_InDirectMP_ServiceAd() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[7]")));
	
		    
    String NC7= N7.getAttribute("value");	
    Assert.assertTrue(NC7.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC7) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC7.matches("[0-9]+") && Long.parseLong(NC7)>=0, "Input accepts alphabets");
         
         //NcDm7= Long.parseLong(N7.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 8)
    public void  NewCar_InDirectMP_LobbyM() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));
	
		    
    String NC8= N8.getAttribute("value");	
    Assert.assertTrue(NC8.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC8) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC8.matches("[0-9]+") && Long.parseLong(NC8)>=0, "Input accepts alphabets");
         
         //NcDm8= Long.parseLong(N8.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 9)
    public void  NewCar_InDirectMP_Receptionist() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[9]")));
	
		    
    String NC9= N9.getAttribute("value");	
    Assert.assertTrue(NC9.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC9) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC9.matches("[0-9]+") && Long.parseLong(NC9)>=0, "Input accepts alphabets");
         
        // NcDm9= Long.parseLong(N9.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 10)
    public void  NewCar_InDirectMP_DeliveryCoordinator() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[10]")));
	
		    
    String NC10= N10.getAttribute("value");	
    Assert.assertTrue(NC10.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC10) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC10.matches("[0-9]+") && Long.parseLong(NC10)>=0, "Input accepts alphabets");
         
         //NcDm10= Long.parseLong(N10.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 11)
    public void  NewCar_InDirectMP_Autocard() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[11]")));
	
		    
    String NC11= N11.getAttribute("value");	
    Assert.assertTrue(NC11.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC11) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC11.matches("[0-9]+") && Long.parseLong(NC11)>=0, "Input accepts alphabets");
         
        // NcDm11= Long.parseLong(N11.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 12)
    public void  NewCar_InDirectMP_RegistrationRTO() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[12]")));
	
		    
    String NC12= N12.getAttribute("value");	
    Assert.assertTrue(NC12.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC12) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC12.matches("[0-9]+") && Long.parseLong(NC12)>=0, "Input accepts alphabets");
         
        // NcDm12= Long.parseLong(N12.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 13)
    public void  NewCar_InDirectMP_Telecallers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N13= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[13]")));
	
		    
    String NC13= N13.getAttribute("value");	
    Assert.assertTrue(NC13.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC13) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC13.matches("[0-9]+") && Long.parseLong(NC13)>=0, "Input accepts alphabets");
         
        // NcDm13= Long.parseLong(N13.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 14)
    public void  NewCar_InDirectMP_DataEntryOperator() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N14= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[14]")));
	
		    
    String NC14= N14.getAttribute("value");	
    Assert.assertTrue(NC14.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC14) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC14.matches("[0-9]+") && Long.parseLong(NC14)>=0, "Input accepts alphabets");
         
        // NcDm14= Long.parseLong(N14.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 15)
    public void  NewCar_InDirectMP_Anysupportstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[15]")));
	
		    
    String NC15= N15.getAttribute("value");	
    Assert.assertTrue(NC15.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC15) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC15.matches("[0-9]+") && Long.parseLong(NC15)>=0, "Input accepts alphabets");
         
        // NcDm15= Long.parseLong(N15.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 16)
    public void  NewCar_InDirectMP_Security() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N16= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[16]")));
	
		    
    String NC16= N16.getAttribute("value");	
    Assert.assertTrue(NC16.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC16) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC16.matches("[0-9]+") && Long.parseLong(NC16)>=0, "Input accepts alphabets");
         
        // NcDm16= Long.parseLong(N16.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 17)
    public void  NewCar_InDirectMP_Drivers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[17]")));
	
		    
    String NC17= N17.getAttribute("value");	
    Assert.assertTrue(NC17.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC17) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC17.matches("[0-9]+") && Long.parseLong(NC17)>=0, "Input accepts alphabets");
         
        // NcDm17= Long.parseLong(N17.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 18)
    public void  NewCar_InDirectMP_Peons() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[18]")));
	
		    
    String NC18= N18.getAttribute("value");	
    Assert.assertTrue(NC18.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC18) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC18.matches("[0-9]+") && Long.parseLong(NC18)>=0, "Input accepts alphabets");
         
        // NcDm18= Long.parseLong(N18.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 19)
    public void  NewCar_InDirectMP_Sweepers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N19= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[19]")));
	
		    
    String NC19= N19.getAttribute("value");	
    Assert.assertTrue(NC19.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC19) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC19.matches("[0-9]+") && Long.parseLong(NC19)>=0, "Input accepts alphabets");
         
        // NcDm19= Long.parseLong(N19.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 20)
    public void  NewCar_InDirectMP_Cleaners() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N20= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[20]")));		    
    String NC20= N20.getAttribute("value");	
    Assert.assertTrue(NC20.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC20) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC20.matches("[0-9]+") && Long.parseLong(NC20)>=0, "Input accepts alphabets");
         
       //  NcDm20= Long.parseLong(N20.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 21)
    public void  NewCar_InDirectMP_AnyOther() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N21= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[21]")));		    
    String NC21= N21.getAttribute("value");	
    Assert.assertTrue(NC21.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC21) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC21.matches("[0-9]+") && Long.parseLong(NC21)>=0, "Input accepts alphabets");
         
       //  NcDm21= Long.parseLong(N21.getAttribute("value"));
    }
  //..................................................................................
    @Test(priority = 22)
    public void  NewCar_DirectMP_Total() throws InterruptedException { 
         
    //long NcDm22= Long.parseLong(N22.getAttribute("value"));
    long exp1= nc1+nc2+nc3+nc4;
    Assert.assertEquals(exp1, nc22);
    }
  //..................................................................................
    @Test(priority = 23)
    public void  NewCar_InDirectMP_Total() throws InterruptedException { 
         
   // long NcDm23= Long.parseLong(N23.getAttribute("value"));
    long exp2= nc5+nc6+nc7+nc8+nc9+nc10+nc11+nc12+nc13+nc14+nc15+nc16+nc17+nc18+nc19+nc20+nc21;
    Assert.assertEquals(exp2, nc23);
    
    }
  //..................................................................................
    @Test(priority = 24)
    public void ClickOn_MSGA() throws InterruptedException {
    //click on MSGA tab 
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[2]")).click();
	Thread.sleep(3000);
	
	WebElement m1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement m2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement m3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement m4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement m5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement m6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement m7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	
//	//send values
//	m1.sendKeys("-10+@.");
//	m2.sendKeys("-qw20.");
//	m3.sendKeys("-50&&a.");
//	m4.sendKeys("-12#dr.");
//	m5.sendKeys("-012$w.");
	
	//convert into integers
	ms1= Long.parseLong(m1.getAttribute("value"));
	ms2= Long.parseLong(m2.getAttribute("value"));
	ms3= Long.parseLong(m3.getAttribute("value"));
	ms4= Long.parseLong(m4.getAttribute("value"));
	ms5= Long.parseLong(m5.getAttribute("value"));
	ms6= Long.parseLong(m6.getAttribute("value"));
	ms7= Long.parseLong(m7.getAttribute("value"));	
  }
//.........................................................................................
        
    @Test(priority=25)
    public void  MSGA_DirectMP_Manager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MS1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));
		    
    String MSG1= MS1.getAttribute("value");	
    Assert.assertTrue(MSG1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MSG1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MSG1.matches("[0-9]+") && Long.parseLong(MSG1)>=0, "Input accepts alphabets");        
    }
  //..................................................................................
    @Test(priority=26)
    public void  MSGA_DirectMP_Executives() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MS2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));
	    
    String MSG2= MS2.getAttribute("value");	
    Assert.assertTrue(MSG2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MSG2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MSG2.matches("[0-9]+") && Long.parseLong(MSG2)>=0, "Input accepts alphabets");
    }
  //..................................................................................
    @Test(priority=27)
    public void  MSGA_DirectMP_Fitter() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MS3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));
			    
    String MSG3= MS3.getAttribute("value");	
    Assert.assertTrue(MSG3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MSG3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MSG3.matches("[0-9]+") && Long.parseLong(MSG3)>=0, "Input accepts alphabets");
    }
  //..................................................................................
    @Test(priority=28)
    public void  MSGA_InDirectMP_Anysupportstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MS4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));
			    
    String MSG4= MS4.getAttribute("value");	
    Assert.assertTrue(MSG4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MSG4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MSG4.matches("[0-9]+") && Long.parseLong(MSG4)>=0, "Input accepts alphabets");
    }
  //..................................................................................
    @Test(priority=29)
    public void  MSGA_InDirectMP_Anyotherstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MS5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));			    
    String MSG5= MS5.getAttribute("value");	
    Assert.assertTrue(MSG5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MSG5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MSG5.matches("[0-9]+") && Long.parseLong(MSG5)>=0, "Input accepts alphabets");
    }
  //..................................................................................
    @Test(priority=30)
    public void  MSGA_DirectMP_Total() throws InterruptedException { 
  
    long exp3=ms1+ms2+ms3;
    Assert.assertEquals(exp3, ms6);
   }
  //..................................................................................
    @Test (priority=31)
    public void  MSGA_InDirectMP_Total() throws InterruptedException { 
  	
    long exp4= ms4+ms5;
    Assert.assertEquals(exp4, ms7);
    }
//..................................................................................
    @Test(priority = 32)
    public void ClickOn_WBSP() throws InterruptedException {
    //click on WBSP tab 
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[3]")).click();
	Thread.sleep(4000);
    
	WebElement w1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement w2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement w3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement w4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement w5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement w6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement w7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement w8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	WebElement w9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	WebElement w10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	WebElement w11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	WebElement w12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	WebElement w13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	WebElement w14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	WebElement w15= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	WebElement w16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	WebElement w17= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	WebElement w18= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	WebElement w19= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	WebElement w20= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	WebElement w21= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
	WebElement w22= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	WebElement w23= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	WebElement w24= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
	WebElement w25= driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
	WebElement w26= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
	WebElement w27= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
	WebElement w28= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
	WebElement w29= driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
	WebElement w30= driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
	WebElement w31= driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
	WebElement w32= driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
	WebElement w33= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
	WebElement w34= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
	WebElement w35= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
	WebElement w36= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
	WebElement w37= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
	WebElement w38= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
	WebElement w39= driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
	WebElement w40= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
	WebElement w41= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
	WebElement w42= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
	WebElement w43= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
	WebElement w44= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
	WebElement w45= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
	
//	//send values
//	w1.sendKeys("--10+@.");
//	w2.sendKeys("-qw20.");
//	w3.sendKeys("-50&&a.");
//	w4.sendKeys("-12#dr.");
//	w5.sendKeys("-012$w.");
//	w6.sendKeys("-012$w.");
//	w7.sendKeys("-012$w.");
//	w8.sendKeys("-012$w.");
//	w9.sendKeys("-012$w.");
//	w10.sendKeys("-012$.w");
//	w11.sendKeys("-012$w.");
//	w12.sendKeys("-012$w.");
//	w13.sendKeys("-012$w.");
//	w14.sendKeys("-012$w.");
//	w15.sendKeys("-012$w.");
//	w16.sendKeys("-012$w.");
//	w17.sendKeys("-012$w.");
//	w18.sendKeys("-012$w.");
//	w19.sendKeys("-012$w.");
//	w20.sendKeys("-12$w.");
//	w21.sendKeys("-012$w.");
//	w22.sendKeys("-012$w.");
//	w23.sendKeys("-012$w.");
//	w24.sendKeys("-012$w.");
//	w25.sendKeys("-012$w.");
//	w26.sendKeys("-012$w.");
//	w27.sendKeys("-012$w.");
//	w28.sendKeys("-012$w.");
//	w29.sendKeys("-012$w.");
//	w30.sendKeys("-012$w.");
//	w31.sendKeys("-012$w.");
//	w32.sendKeys("-012$w.");
//	w33.sendKeys("-012$w.");
//	w34.sendKeys("-012$w.");
//	w35.sendKeys("-012$w.");
//	w36.sendKeys("-01$w.");
//	w37.sendKeys("-012$w.");
//	w38.sendKeys("-012$w.");
//	w39.sendKeys("-012$w.");
//	w40.sendKeys("-012$w.");
//	w41.sendKeys("-012$w.");
//	w42.sendKeys("-012$w.");
//	w43.sendKeys("-012$w.");
	
	//convert into integers
	ws1= Long.parseLong(w1.getAttribute("value"));
  	ws2= Long.parseLong(w2.getAttribute("value"));
  	ws3= Long.parseLong(w3.getAttribute("value"));
  	ws4= Long.parseLong(w4.getAttribute("value"));
  	ws5= Long.parseLong(w5.getAttribute("value"));
  	ws6= Long.parseLong(w6.getAttribute("value"));
  	ws7= Long.parseLong(w7.getAttribute("value"));
  	ws8= Long.parseLong(w8.getAttribute("value"));
  	ws9= Long.parseLong(w9.getAttribute("value"));
  	ws10= Long.parseLong(w10.getAttribute("value"));
  	ws11= Long.parseLong(w11.getAttribute("value"));
 	ws12= Long.parseLong(w12.getAttribute("value"));
 	ws13= Long.parseLong(w13.getAttribute("value"));
 	ws14= Long.parseLong(w14.getAttribute("value"));
 	ws15= Long.parseLong(w15.getAttribute("value"));
 	ws16= Long.parseLong(w16.getAttribute("value"));
 	ws17= Long.parseLong(w17.getAttribute("value"));
 	ws18= Long.parseLong(w18.getAttribute("value"));
 	ws19= Long.parseLong(w19.getAttribute("value"));
 	ws20= Long.parseLong(w20.getAttribute("value"));
 	ws21= Long.parseLong(w21.getAttribute("value"));
 	ws22= Long.parseLong(w22.getAttribute("value"));
 	ws23= Long.parseLong(w23.getAttribute("value"));
 	ws24= Long.parseLong(w24.getAttribute("value"));
 	ws25= Long.parseLong(w25.getAttribute("value"));
 	ws26= Long.parseLong(w26.getAttribute("value"));
 	ws27= Long.parseLong(w27.getAttribute("value"));
 	ws28= Long.parseLong(w28.getAttribute("value"));
 	ws29= Long.parseLong(w29.getAttribute("value"));
 	ws30= Long.parseLong(w30.getAttribute("value"));
 	ws31= Long.parseLong(w31.getAttribute("value"));
 	ws32= Long.parseLong(w32.getAttribute("value"));
 	ws33= Long.parseLong(w33.getAttribute("value"));
 	ws34= Long.parseLong(w34.getAttribute("value"));
 	ws35= Long.parseLong(w35.getAttribute("value"));
 	ws36= Long.parseLong(w36.getAttribute("value"));
 	ws37= Long.parseLong(w37.getAttribute("value"));
 	ws38= Long.parseLong(w38.getAttribute("value"));
 	ws39= Long.parseLong(w39.getAttribute("value"));
 	ws40= Long.parseLong(w40.getAttribute("value"));
 	ws41= Long.parseLong(w41.getAttribute("value"));
 	ws42= Long.parseLong(w42.getAttribute("value"));
 	ws43= Long.parseLong(w43.getAttribute("value"));
 	ws44= Long.parseLong(w44.getAttribute("value"));
 	ws45= Long.parseLong(w45.getAttribute("value")); 	 
  }
//....................................................................................
    @Test(priority=33)
    public void  WBSP_DirectMP_VicePresident() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));		    
    String WSB1= WS1.getAttribute("value");	
    Assert.assertTrue(WSB1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB1.matches("[0-9]+") && Long.parseLong(WSB1)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=34)
    public void  WBSP_DirectMP_GeneralManager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		    
    String WSB2= WS2.getAttribute("value");	
    Assert.assertTrue(WSB2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB2.matches("[0-9]+") && Long.parseLong(WSB2)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=35)
    public void  WBSP_DirectMP_WorksManager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));		    
    String WSB3= WS3.getAttribute("value");	
    Assert.assertTrue(WSB3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB3.matches("[0-9]+") && Long.parseLong(WSB3)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=36)
    public void  WBSP_DirectMP_FloorController() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));		    
    String WSB4= WS4.getAttribute("value");	
    Assert.assertTrue(WSB4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB4.matches("[0-9]+") && Long.parseLong(WSB4)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=37)
    public void  WBSP_DirectMP_ServiceAdvisor() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));		    
    String WSB5= WS5.getAttribute("value");	
    Assert.assertTrue(WSB5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB5.matches("[0-9]+") && Long.parseLong(WSB5)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=38)
    public void  WBSP_DirectMP_TechnicalAdvisor() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));		    
    String WSB6= WS6.getAttribute("value");	
    Assert.assertTrue(WSB6.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB6) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB6.matches("[0-9]+") && Long.parseLong(WSB6)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=39)
    public void  WBSP_DirectMP_MechanicsTechnicians() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[7]")));		    
    String WSB7= WS7.getAttribute("value");	
    Assert.assertTrue(WSB7.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB7) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB7.matches("[0-9]+") && Long.parseLong(WSB7)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=40)
    public void  WBSP_DirectMP_FinalInspector() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));		    
    String WSB8= WS8.getAttribute("value");	
    Assert.assertTrue(WSB8.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB8) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB8.matches("[0-9]+") && Long.parseLong(WSB8)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=41)
    public void  WBSP_DirectMP_WashingManpower() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[9]")));		    
    String WSB9= WS9.getAttribute("value");	
    Assert.assertTrue(WSB9.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB9) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB9.matches("[0-9]+") && Long.parseLong(WSB9)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=42)
    public void  WBSP_DirectMP_WashingSupervisor() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[10]")));		    
    String WSB10= WS10.getAttribute("value");	
    Assert.assertTrue(WSB10.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB10) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB10.matches("[0-9]+") && Long.parseLong(WSB10)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=43)
    public void  WBSP_DirectMP_Denter() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[11]")));		    
    String WSB11= WS11.getAttribute("value");	
    Assert.assertTrue(WSB11.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB11) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB11.matches("[0-9]+") && Long.parseLong(WSB11)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=44)
    public void  WBSP_DirectMP_Electricians() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[12]")));		    
    String WSB12= WS12.getAttribute("value");	
    Assert.assertTrue(WSB12.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB12) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB12.matches("[0-9]+") && Long.parseLong(WSB12)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=45)
    public void  WBSP_DirectMP_AssistantWorksManager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS13= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[13]")));		    
    String WSB13= WS13.getAttribute("value");	
    Assert.assertTrue(WSB13.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB13) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB13.matches("[0-9]+") && Long.parseLong(WSB13)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=46)
    public void  WBSP_DirectMP_PDISupervisor() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS14= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[14]")));		    
    String WSB14= WS14.getAttribute("value");	
    Assert.assertTrue(WSB14.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB14) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB14.matches("[0-9]+") && Long.parseLong(WSB14)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=47)
    public void  WBSP_DirectMP_PDITechnicians() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[15]")));		    
    String WSB15= WS15.getAttribute("value");	
    Assert.assertTrue(WSB15.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB15) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB15.matches("[0-9]+") && Long.parseLong(WSB15)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=48)
    public void  WBSP_DirectMP_Others() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS16= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[16]")));		    
    String WSB16= WS16.getAttribute("value");	
    Assert.assertTrue(WSB16.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB16) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB16.matches("[0-9]+") && Long.parseLong(WSB16)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=49)
    public void  WBSP_DirectMP_BodyshopManager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[17]")));		    
    String WSB17= WS17.getAttribute("value");	
    Assert.assertTrue(WSB17.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB17) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB17.matches("[0-9]+") && Long.parseLong(WSB17)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=50)
    public void  WBSP_DirectMP_BodyShop_ServiceAdvisor() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[18]")));		    
    String WSB18= WS18.getAttribute("value");	
    Assert.assertTrue(WSB18.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB18) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB18.matches("[0-9]+") && Long.parseLong(WSB18)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=51)
    public void  WBSP_DirectMP_BodyShop_Supervisor() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS19= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[19]")));		    
    String WSB19= WS19.getAttribute("value");	
    Assert.assertTrue(WSB19.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB19) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB19.matches("[0-9]+") && Long.parseLong(WSB19)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=52)
    public void  WBSP_DirectMP_BodyShop_MechanicsTechnicians() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS20= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[20]")));		    
    String WSB20= WS20.getAttribute("value");	
    Assert.assertTrue(WSB20.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB20) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB20.matches("[0-9]+") && Long.parseLong(WSB20)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=53)
    public void  WBSP_DirectMP_BodyShop_Denter() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS21= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[21]")));		    
    String WSB21= WS21.getAttribute("value");	
    Assert.assertTrue(WSB21.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB21) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB21.matches("[0-9]+") && Long.parseLong(WSB21)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=54)
    public void  WBSP_DirectMP_BodyShop_Painter() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS22= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[22]")));		    
    String WSB22= WS22.getAttribute("value");	
    Assert.assertTrue(WSB22.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB22) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB22.matches("[0-9]+") && Long.parseLong(WSB22)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=55)
    public void  WBSP_DirectMP_BodyShop_FinalInspector() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS23= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[23]")));		    
    String WSB23= WS23.getAttribute("value");	
    Assert.assertTrue(WSB23.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB23) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB23.matches("[0-9]+") && Long.parseLong(WSB23)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=56)
    public void  WBSP_DirectMP_BodyShop_Electricians() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS24= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[24]")));		    
    String WSB24= WS24.getAttribute("value");	
    Assert.assertTrue(WSB24.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB24) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB24.matches("[0-9]+") && Long.parseLong(WSB24)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=57)
    public void  WBSP_InDirectMP_CustomerCareManager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS25= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[25]")));		    
    String WSB25= WS25.getAttribute("value");	
    Assert.assertTrue(WSB25.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB25) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB25.matches("[0-9]+") && Long.parseLong(WSB25)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=58)
    public void  WBSP_InDirectMP_CustomerCareExecutives() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS26= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[26]")));		    
    String WSB26= WS26.getAttribute("value");	
    Assert.assertTrue(WSB26.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB26) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB26.matches("[0-9]+") && Long.parseLong(WSB26)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=59)
    public void  WBSP_InDirectMP_CrackTeams() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS27= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[27]")));		    
    String WSB27= WS27.getAttribute("value");	
    Assert.assertTrue(WSB27.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB27) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB27.matches("[0-9]+") && Long.parseLong(WSB27)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=60)
    public void  WBSP_InDirectMP_ReceptionHostess() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS28= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[28]")));		    
    String WSB28= WS28.getAttribute("value");	
    Assert.assertTrue(WSB28.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB28) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB28.matches("[0-9]+") && Long.parseLong(WSB28)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=61)
    public void  WBSP_InDirectMP_TrainingCordinator() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS29= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[29]")));		    
    String WSB29= WS29.getAttribute("value");	
    Assert.assertTrue(WSB29.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB29) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB29.matches("[0-9]+") && Long.parseLong(WSB29)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=62)
    public void  WBSP_InDirectMP_Maintenance() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS30= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[30]")));		    
    String WSB30= WS30.getAttribute("value");	
    Assert.assertTrue(WSB30.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB30) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB30.matches("[0-9]+") && Long.parseLong(WSB30)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=63)
    public void  WBSP_InDirectMP_Marketingteam() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS31= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[31]")));		    
    String WSB31= WS31.getAttribute("value");	
    Assert.assertTrue(WSB31.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB31) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB31.matches("[0-9]+") && Long.parseLong(WSB31)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=64)
    public void  WBSP_InDirectMP_Telecallers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS32= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[32]")));		    
    String WSB32= WS32.getAttribute("value");	
    Assert.assertTrue(WSB32.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB32) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB32.matches("[0-9]+") && Long.parseLong(WSB32)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=65)
    public void  WBSP_InDirectMP_FrontOffice() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS33= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[33]")));		    
    String WSB33= WS33.getAttribute("value");	
    Assert.assertTrue(WSB33.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB33) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB33.matches("[0-9]+") && Long.parseLong(WSB33)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=66)
    public void  WBSP_InDirectMP_Cashier() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS34= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[34]")));		    
    String WSB34= WS34.getAttribute("value");	
    Assert.assertTrue(WSB34.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB34) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB34.matches("[0-9]+") && Long.parseLong(WSB34)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=67)
    public void  WBSP_InDirectMP_Autocard() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS35= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[35]")));		    
    String WSB35= WS35.getAttribute("value");	
    Assert.assertTrue(WSB35.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB35) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB35.matches("[0-9]+") && Long.parseLong(WSB35)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=68)
    public void  WBSP_InDirectMP_Anyothersupportstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS36= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[36]")));		    
    String WSB36= WS36.getAttribute("value");	
    Assert.assertTrue(WSB36.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB36) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB36.matches("[0-9]+") && Long.parseLong(WSB36)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=69)
    public void  WBSP_InDirectMP_Security() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS37= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[37]")));		    
    String WSB37= WS37.getAttribute("value");	
    Assert.assertTrue(WSB37.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB37) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB37.matches("[0-9]+") && Long.parseLong(WSB37)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=70)
    public void  WBSP_InDirectMP_Drivers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS38= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[38]")));		    
    String WSB38= WS38.getAttribute("value");	
    Assert.assertTrue(WSB38.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB38) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB38.matches("[0-9]+") && Long.parseLong(WSB38)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=71)
    public void  WBSP_InDirectMP_Peons() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS39= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[39]")));		    
    String WSB39= WS39.getAttribute("value");	
    Assert.assertTrue(WSB39.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB39) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB39.matches("[0-9]+") && Long.parseLong(WSB39)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=72)
    public void  WBSP_InDirectMP_Sweepers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS40= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[40]")));		    
    String WSB40= WS40.getAttribute("value");	
    Assert.assertTrue(WSB40.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB40) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB40.matches("[0-9]+") && Long.parseLong(WSB40)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=73)
    public void  WBSP_InDirectMP_Cleaners() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS41= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[41]")));		    
    String WSB41= WS41.getAttribute("value");	
    Assert.assertTrue(WSB41.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB41) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB41.matches("[0-9]+") && Long.parseLong(WSB41)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=74)
    public void  WBSP_InDirectMP_LiftHandler() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS42= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[42]")));		    
    String WSB42= WS42.getAttribute("value");	
    Assert.assertTrue(WSB42.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB42) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB42.matches("[0-9]+") && Long.parseLong(WSB42)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=75)
    public void  WBSP_InDirectMP_AnyOther() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement WS43= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[43]")));		    
    String WSB43= WS43.getAttribute("value");	
    Assert.assertTrue(WSB43.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(WSB43) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(WSB43.matches("[0-9]+") && Long.parseLong(WSB43)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=76)
    public void  WBSP_DirectMP_Total() throws InterruptedException { 
    long exp5=ws1+ws2+ws3+ws4+ws5+ws6+ws7+ws8+ws9+ws10+ws11+ws12+ws13
    		      +ws14+ws15+ws16+ws17+ws18+ws19+ws20+ws21+ws22+ws23+ws24;
    Assert.assertEquals(exp5, ws44);
   }
//..................................................................................
    @Test(priority=77)
    public void  WBSP_InDirectMP_Total() throws InterruptedException { 
  	
    long exp6=ws25+ws26+ws27+ws28+ws29+ws30+ws31+ws32+ws33+ws34+ws35+ws36+ws37
    		      +ws38+ws39+ws40+ws41+ws42+ws43;
    Assert.assertEquals(exp6, ws45);
   }
//..................................................................................
    @Test(priority = 78)
    public void ClickOn_Spares() throws InterruptedException {
    //Scroll up & click on Spares tab 
    	Thread.sleep(3000);
	Actions S= new Actions(driver);
	S.sendKeys(Keys.PAGE_UP).perform();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[4]")).click();
	Thread.sleep(4000);
    
	WebElement s1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement s2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement s3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement s4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement s5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement s6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement s7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement s8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	
//	//send values
//	s1.sendKeys("-10+@.");
//	s2.sendKeys("-qw20.");
//	s3.sendKeys("-50&&a.");
//	s4.sendKeys("-18#dr.");
//	s5.sendKeys("-022$w.");
//	s6.sendKeys("-o%31$wp.");
		
	//convert into integers
	sp1= Long.parseLong(s1.getAttribute("value"));
	sp2= Long.parseLong(s2.getAttribute("value"));
	sp3= Long.parseLong(s3.getAttribute("value"));
	sp4= Long.parseLong(s4.getAttribute("value"));
	sp5= Long.parseLong(s5.getAttribute("value"));
	sp6= Long.parseLong(s6.getAttribute("value"));
	sp7= Long.parseLong(s7.getAttribute("value"));
	sp8= Long.parseLong(s8.getAttribute("value"));
} 
//..........................................................................................
    @Test(priority=79)
    public void  Spares_DirectMP_Manager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement S1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));		    
    String SP1= S1.getAttribute("value");	
    Assert.assertTrue(SP1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP1.matches("[0-9]+") && Long.parseLong(SP1)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=80)
    public void  Spares_DirectMP_AsstManager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement S2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		    
    String SP2= S2.getAttribute("value");	
    Assert.assertTrue(SP2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP2.matches("[0-9]+") && Long.parseLong(SP2)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=81)
    public void  Spares_DirectMP_Storekeepers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement S3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));		    
    String SP3= S3.getAttribute("value");	
    Assert.assertTrue(SP3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP3.matches("[0-9]+") && Long.parseLong(SP3)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=82)
    public void  Spares_DirectMP_Pickers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement S4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));		    
    String SP4= S4.getAttribute("value");	
    Assert.assertTrue(SP4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP4.matches("[0-9]+") && Long.parseLong(SP4)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=83)
    public void  Spares_InDirectMP_Anysupportstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement S5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));		    
    String SP5= S5.getAttribute("value");	
    Assert.assertTrue(SP5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP5.matches("[0-9]+") && Long.parseLong(SP5)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=84)
    public void  Spares_InDirectMP_Anyotherstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement S6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));		    
    String SP6= S6.getAttribute("value");	
    Assert.assertTrue(SP6.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP6) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP6.matches("[0-9]+") && Long.parseLong(SP6)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=85)
    public void  Spares_DirectMP_Total() throws InterruptedException { 
    long exp7=sp1+sp2+sp3+sp4;
    Assert.assertEquals(exp7, sp7);
   }
//..................................................................................
    @Test(priority=86)
    public void  Spares_InDirectMP_Total() throws InterruptedException { 
    long exp8=sp5+sp6;
    Assert.assertEquals(exp8, sp8);
   }
//..................................................................................
    @Test(priority = 87)
    public void ClickOn_TrueValue() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[5]")).click();
	Thread.sleep(3000);
    
	WebElement t1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement t2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement t3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement t4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement t5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement t6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement t7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement t8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	WebElement t9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	WebElement t10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	WebElement t11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	WebElement t12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	WebElement t13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	WebElement t14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	WebElement t15= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	WebElement t16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	WebElement t17= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	WebElement t18= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	WebElement t19= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	WebElement t20= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	
//	//send values
//	t1.sendKeys("-10+@.");
//	t2.sendKeys("-qw20.");
//	t3.sendKeys("-50&&a.");
//	t4.sendKeys("-18#dr.");
//	t5.sendKeys("-022$w.");
//	t6.sendKeys("-o%31$wp.");
//	t7.sendKeys("-10+@.");
//	t8.sendKeys("-qw20.");
//	t9.sendKeys("-50&&a.");
//	t10.sendKeys("-1-8#dr.");
//	t11.sendKeys("-022$w.");
//	t12.sendKeys("-o%31$wp.");
//	t13.sendKeys("-10+@.");
//	t14.sendKeys("-qw20.");
//	t15.sendKeys("-50&&a.");
//	t16.sendKeys("-18#dr.");
//	t17.sendKeys("-022$w.");
//	t18.sendKeys("-o%31$wp.");
	
	//convert into integers
	tv1= Long.parseLong(t1.getAttribute("value"));
	tv2= Long.parseLong(t2.getAttribute("value"));
	tv3= Long.parseLong(t3.getAttribute("value"));
	tv4= Long.parseLong(t4.getAttribute("value"));
	tv5= Long.parseLong(t5.getAttribute("value"));
	tv6= Long.parseLong(t6.getAttribute("value"));
	tv7= Long.parseLong(t7.getAttribute("value"));
	tv8= Long.parseLong(t8.getAttribute("value"));
	tv9= Long.parseLong(t9.getAttribute("value"));
	tv10= Long.parseLong(t10.getAttribute("value"));
	tv11= Long.parseLong(t11.getAttribute("value"));
	tv12= Long.parseLong(t12.getAttribute("value"));
	tv13= Long.parseLong(t13.getAttribute("value"));
	tv14= Long.parseLong(t14.getAttribute("value"));
	tv15= Long.parseLong(t15.getAttribute("value"));
	tv16= Long.parseLong(t16.getAttribute("value"));
	tv17= Long.parseLong(t17.getAttribute("value"));
	tv18= Long.parseLong(t18.getAttribute("value"));
	tv19= Long.parseLong(t19.getAttribute("value"));
	tv20= Long.parseLong(t20.getAttribute("value"));
} 
//..........................................................................................
    @Test(priority=88)
    public void  TrueValue_DirectMP_Manager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));		    
    String TV1= T1.getAttribute("value");	
    Assert.assertTrue(TV1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV1.matches("[0-9]+") && Long.parseLong(TV1)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=89)
    public void  TrueValue_DirectMP_TLSales() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		    
    String TV2= T2.getAttribute("value");	
    Assert.assertTrue(TV2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV2.matches("[0-9]+") && Long.parseLong(TV2)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=90)
    public void  TrueValue_DirectMP_DSESales() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));		    
    String TV3= T3.getAttribute("value");	
    Assert.assertTrue(TV3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV3.matches("[0-9]+") && Long.parseLong(TV3)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=91)
    public void  TrueValue_DirectMP_Marketing() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));		    
    String TV4= T4.getAttribute("value");	
    Assert.assertTrue(TV4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV4.matches("[0-9]+") && Long.parseLong(TV4)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=92)
    public void  TrueValue_DirectMP_SourcingExecutive() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));		    
    String TV5= T5.getAttribute("value");	
    Assert.assertTrue(TV5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV5.matches("[0-9]+") && Long.parseLong(TV5)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=93)
    public void  TrueValue_DirectMP_TLSourcing() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));		    
    String TV6= T6.getAttribute("value");	
    Assert.assertTrue(TV6.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV6) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV6.matches("[0-9]+") && Long.parseLong(TV6)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=94)
    public void  TrueValue_DirectMP_RefurbishmentSupervisor() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[7]")));		    
    String TV7= T7.getAttribute("value");	
    Assert.assertTrue(TV7.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV7) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV7.matches("[0-9]+") && Long.parseLong(TV7)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=95)
    public void  TrueValue_InDirectMP_CCM() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));		    
    String TV8= T8.getAttribute("value");	
    Assert.assertTrue(TV8.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV8) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV8.matches("[0-9]+") && Long.parseLong(TV8)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=96)
    public void  TrueValue_InDirectMP_Telecaller() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[9]")));		    
    String TV9= T9.getAttribute("value");	
    Assert.assertTrue(TV9.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV9) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV9.matches("[0-9]+") && Long.parseLong(TV9)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=97)
    public void  TrueValue_InDirectMP_Receptionist() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[10]")));		    
    String TV10= T10.getAttribute("value");	
    Assert.assertTrue(TV10.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV10) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV10.matches("[0-9]+") && Long.parseLong(TV10)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=98)
    public void  TrueValue_InDirectMP_DataEntryOperator() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[11]")));		    
    String TV11= T11.getAttribute("value");	
    Assert.assertTrue(TV11.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV11) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV11.matches("[0-9]+") && Long.parseLong(TV11)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=99)
    public void  TrueValue_InDirectMP_Anyothersupportstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[12]")));		    
    String TV12= T12.getAttribute("value");	
    Assert.assertTrue(TV12.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV12) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV12.matches("[0-9]+") && Long.parseLong(TV12)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=100)
    public void  TrueValue_InDirectMP_Security() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T13= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[13]")));		    
    String TV13= T13.getAttribute("value");	
    Assert.assertTrue(TV13.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV13) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV13.matches("[0-9]+") && Long.parseLong(TV13)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=101)
    public void  TrueValue_InDirectMP_Drivers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T14= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[14]")));		    
    String TV14= T14.getAttribute("value");	
    Assert.assertTrue(TV14.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV14) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV14.matches("[0-9]+") && Long.parseLong(TV14)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=102)
    public void  TrueValue_InDirectMP_Peons() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[15]")));		    
    String TV15= T15.getAttribute("value");	
    Assert.assertTrue(TV15.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV15) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV15.matches("[0-9]+") && Long.parseLong(TV15)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=103)
    public void  TrueValue_InDirectMP_Sweepers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T16= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[16]")));		    
    String TV16= T16.getAttribute("value");	
    Assert.assertTrue(TV16.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV16) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV16.matches("[0-9]+") && Long.parseLong(TV16)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=104)
    public void  TrueValue_InDirectMP_Cleaners() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[17]")));		    
    String TV17= T17.getAttribute("value");	
    Assert.assertTrue(TV17.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV17) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV17.matches("[0-9]+") && Long.parseLong(TV17)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=105)
    public void  TrueValue_InDirectMP_Anyother() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement T18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[18]")));		    
    String TV18= T18.getAttribute("value");	
    Assert.assertTrue(TV18.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(TV18) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(TV18.matches("[0-9]+") && Long.parseLong(TV18)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=106)
    public void  TrueValue_DirectMP_Total() throws InterruptedException { 
    long exp9=tv1+tv2+tv3+tv4+tv5+tv6+tv7;
    Assert.assertEquals(exp9, tv19);
   }
//..................................................................................
    @Test(priority=107)
    public void  TrueValue_InDirectMP_Total() throws InterruptedException { 
    long exp10=tv8+tv9+tv10+tv11+tv12+tv13+tv14+tv15+tv16+tv17+tv18;
    Assert.assertEquals(exp10, tv20);
   }
//..................................................................................
    @Test(priority = 108)
    public void ClickOn_MIRenewal() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[6]")).click();
	Thread.sleep(3000);
    
	WebElement mi1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement mi2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement mi3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement mi4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement mi5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement mi6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement mi7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement mi8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	
//	//send values
//	mi1.sendKeys("-10+@.");
//	mi2.sendKeys("-qw20.");
//	mi3.sendKeys("-50&&a.");
//	mi4.sendKeys("-18#dr.");
//	mi5.sendKeys("-022$w.");
//	mi6.sendKeys("-o%31$w.p");
	
	//convert into integers
	mir1= Long.parseLong(mi1.getAttribute("value"));
	mir2= Long.parseLong(mi2.getAttribute("value"));
	mir3= Long.parseLong(mi3.getAttribute("value"));
	mir4= Long.parseLong(mi4.getAttribute("value"));
	mir5= Long.parseLong(mi5.getAttribute("value"));
	mir6= Long.parseLong(mi6.getAttribute("value"));
	mir7= Long.parseLong(mi7.getAttribute("value"));
	mir8= Long.parseLong(mi8.getAttribute("value"));
}  
//..........................................................................................................    
    @Test(priority=109)
    public void  MIRenewal_DirectMP_Manager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MI1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));		    
    String MIR1= MI1.getAttribute("value");	
    Assert.assertTrue(MIR1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MIR1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MIR1.matches("[0-9]+") && Long.parseLong(MIR1)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=110)
    public void  MIRenewal_DirectMP_TeleCaller() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MI2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		    
    String MIR2= MI2.getAttribute("value");	
    Assert.assertTrue(MIR2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MIR2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MIR2.matches("[0-9]+") && Long.parseLong(MIR2)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=111)
    public void  MIRenewal_DirectMP_FieldPersonnel() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MI3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));		    
    String MIR3= MI3.getAttribute("value");	
    Assert.assertTrue(MIR3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MIR3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MIR3.matches("[0-9]+") && Long.parseLong(MIR3)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=112)
    public void  MIRenewal_DirectMP_Executives() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MI4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));		    
    String MIR4= MI4.getAttribute("value");	
    Assert.assertTrue(MIR4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MIR4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MIR4.matches("[0-9]+") && Long.parseLong(MIR4)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=113)
    public void  MIRenewal_InDirectMP_Anysupportstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MI5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));		    
    String MIR5= MI5.getAttribute("value");	
    Assert.assertTrue(MIR5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MIR5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MIR5.matches("[0-9]+") && Long.parseLong(MIR5)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=114)
    public void  MIRenewal_InDirectMP_Anyotherstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MI6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));		    
    String MIR6= MI6.getAttribute("value");	
    Assert.assertTrue(MIR6.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MIR6) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MIR6.matches("[0-9]+") && Long.parseLong(MIR6)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=115)
    public void  MIRenewal_DirectMP_Total() throws InterruptedException { 
    long exp11=mir1+mir2+mir3+mir4;
    Assert.assertEquals(exp11, mir7);
   }
//..................................................................................
    @Test(priority=116)
    public void  MIRenewal_InDirectMP_Total() throws InterruptedException { 
    long exp12=mir5+mir6;
    Assert.assertEquals(exp12, mir8);
   }
//..................................................................................
    @Test(priority = 117)
    public void ClickOn_MDS() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[7]")).click();
	Thread.sleep(3000);
    
	WebElement md1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement md2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement md3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement md4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement md5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement md6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	
//	//send values
//	md1.sendKeys("-10abc.");
//	md2.sendKeys("-@e16ic.");
//	md3.sendKeys("-&18bc.");
//	md4.sendKeys("-*10aec.");
//	
	//convert into integers	
	mds1= Long.parseLong(md1.getAttribute("value"));
	mds2= Long.parseLong(md2.getAttribute("value"));
	mds3= Long.parseLong(md3.getAttribute("value"));
	mds4= Long.parseLong(md4.getAttribute("value"));
	mds5= Long.parseLong(md5.getAttribute("value"));
	mds6= Long.parseLong(md6.getAttribute("value"));	  
  }
//...............................................................................................    
    @Test(priority=118)
    public void  MDS_DirectMP_Manager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MD1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));		    
    String MDS1= MD1.getAttribute("value");	
    Assert.assertTrue(MDS1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MDS1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MDS1.matches("[0-9]+") && Long.parseLong(MDS1)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=119)
    public void  MDS_DirectMP_Trainer() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MD2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		    
    String MDS2= MD2.getAttribute("value");	
    Assert.assertTrue(MDS2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MDS2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MDS2.matches("[0-9]+") && Long.parseLong(MDS2)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=120)
    public void  MDS_InDirectMP_Anysupportstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MD3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));		    
    String MDS3= MD3.getAttribute("value");	
    Assert.assertTrue(MDS3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MDS3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MDS3.matches("[0-9]+") && Long.parseLong(MDS3)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=121)
    public void  MDS_InDirectMP_Anyotherstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement MD4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));		    
    String MDS4= MD4.getAttribute("value");	
    Assert.assertTrue(MDS4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(MDS4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(MDS4.matches("[0-9]+") && Long.parseLong(MDS4)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=122)
    public void  MDS_DirectMP_Total() throws InterruptedException { 
    long exp13=mds1+mds2;
    Assert.assertEquals(exp13, mds5);
   }
//..................................................................................
    @Test(priority=123)
    public void  MDS_InDirectMP_Total() throws InterruptedException { 
    long exp14=mds3+mds4;
    Assert.assertEquals(exp14, mds6);
   }
//..................................................................................
    @Test(priority = 124)
    public void ClickOn_CommonMP() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[8]")).click();
	Thread.sleep(3000);
    
	WebElement c1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	WebElement c2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement c3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement c4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement c5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement c6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement c7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement c8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	WebElement c9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	WebElement c10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	WebElement c11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	WebElement c12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	WebElement c13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	WebElement c14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	WebElement c15= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	WebElement c16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	WebElement c17= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	WebElement c18= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	WebElement c19= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	WebElement c20= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	
//	//send values
//	c1.sendKeys("-10+@.");
//	c2.sendKeys("-qw20.");
//	c3.sendKeys("-50&&a.");
//	c4.sendKeys("-18#dr.");
//	c5.sendKeys("-022$w.");
//	c6.sendKeys("-o%31$wp..");
//	c7.sendKeys("-10+@..");
//	c8.sendKeys("-qw20.");
//	c9.sendKeys("-50&&a.");
//	c10.sendKeys("-18#d..r.");
//	c11.sendKeys("-022$w.");
//	c12.sendKeys("-o%31$wp.");
//	c13.sendKeys("-10+@.");
//	c14.sendKeys("-qw20.");
//	c15.sendKeys("-50&&a.");
//	c16.sendKeys("-18#dr.");
//	c17.sendKeys("-022$w.");
//	c18.sendKeys("-o%31$wp.");

	//convert into integers
	cm1= Long.parseLong(c1.getAttribute("value"));
	cm2= Long.parseLong(c2.getAttribute("value"));
	cm3= Long.parseLong(c3.getAttribute("value"));
	cm4= Long.parseLong(c4.getAttribute("value"));
	cm5= Long.parseLong(c5.getAttribute("value"));
	cm6= Long.parseLong(c6.getAttribute("value"));
	cm7= Long.parseLong(c7.getAttribute("value"));
	cm8= Long.parseLong(c8.getAttribute("value"));
	cm9= Long.parseLong(c9.getAttribute("value"));
	cm10= Long.parseLong(c10.getAttribute("value"));
	cm11= Long.parseLong(c11.getAttribute("value"));
	cm12= Long.parseLong(c12.getAttribute("value"));
	cm13= Long.parseLong(c13.getAttribute("value"));
	cm14= Long.parseLong(c14.getAttribute("value"));
	cm15= Long.parseLong(c15.getAttribute("value"));
	cm16= Long.parseLong(c16.getAttribute("value"));
	cm17= Long.parseLong(c17.getAttribute("value"));
	cm18= Long.parseLong(c18.getAttribute("value"));
	cm19= Long.parseLong(c19.getAttribute("value"));
	cm20= Long.parseLong(c20.getAttribute("value"));
 
} 
 //...........................................................................................   
    @Test(priority=125)
    public void  CommonMP_DirectMP_Manager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));		    
    String CM1= C1.getAttribute("value");	
    Assert.assertTrue(CM1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM1.matches("[0-9]+") && Long.parseLong(CM1)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=126)
    public void  CommonMP_DirectMP_Executives() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));		    
    String CM2= C2.getAttribute("value");	
    Assert.assertTrue(CM2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM2.matches("[0-9]+") && Long.parseLong(CM2)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=127)
    public void  CommonMP_DirectMP_FieldPersonnel() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));		    
    String CM3= C3.getAttribute("value");	
    Assert.assertTrue(CM3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM3.matches("[0-9]+") && Long.parseLong(CM3)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=128)
    public void  CommonMP_DirectMP_Cashiers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));		    
    String CM4= C4.getAttribute("value");	
    Assert.assertTrue(CM4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM4.matches("[0-9]+") && Long.parseLong(CM4)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=129)
    public void  CommonMP_DirectMP_Finance_Manager() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));		    
    String CM5= C5.getAttribute("value");	
    Assert.assertTrue(CM5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM5.matches("[0-9]+") && Long.parseLong(CM5)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=130)
    public void  CommonMP_InDirectMP_EDP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));		    
    String CM6= C6.getAttribute("value");	
    Assert.assertTrue(CM6.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM6) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM6.matches("[0-9]+") && Long.parseLong(CM6)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=131)
    public void  CommonMP_InDirectMP_HR() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[7]")));		    
    String CM7= C7.getAttribute("value");	
    Assert.assertTrue(CM7.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM7) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM7.matches("[0-9]+") && Long.parseLong(CM7)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=132)
    public void  CommonMP_InDirectMP_Admin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));		    
    String CM8= C8.getAttribute("value");	
    Assert.assertTrue(CM8.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM8) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM8.matches("[0-9]+") && Long.parseLong(CM8)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=133)
    public void  CommonMP_InDirectMP_Auditors() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[9]")));		    
    String CM9= C9.getAttribute("value");	
    Assert.assertTrue(CM9.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM9) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM9.matches("[0-9]+") && Long.parseLong(CM9)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=134)
    public void  CommonMP_InDirectMP_Anyothersupportstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[10]")));		    
    String CM10= C10.getAttribute("value");	
    Assert.assertTrue(CM10.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM10) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM10.matches("[0-9]+") && Long.parseLong(CM10)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=135)
    public void  CommonMP_InDirectMP_CEO() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[11]")));		    
    String CM11= C11.getAttribute("value");	
    Assert.assertTrue(CM11.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM11) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM11.matches("[0-9]+") && Long.parseLong(CM11)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=136)
    public void  CommonMP_InDirectMP_Director() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[12]")));		    
    String CM12= C12.getAttribute("value");	
    Assert.assertTrue(CM12.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM12) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM12.matches("[0-9]+") && Long.parseLong(CM12)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=137)
    public void  CommonMP_InDirectMP_ExecutiveDirector() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C13= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[13]")));		    
    String CM13= C13.getAttribute("value");	
    Assert.assertTrue(CM13.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM13) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM13.matches("[0-9]+") && Long.parseLong(CM13)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=138)
    public void  CommonMP_InDirectMP_HRHead() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C14= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[14]")));		    
    String CM14= C14.getAttribute("value");	
    Assert.assertTrue(CM14.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM14) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM14.matches("[0-9]+") && Long.parseLong(CM14)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=139)
    public void  CommonMP_InDirectMP_Promoters() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[15]")));		    
    String CM15= C15.getAttribute("value");	
    Assert.assertTrue(CM15.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM15) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM15.matches("[0-9]+") && Long.parseLong(CM15)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=140)
    public void  CommonMP_InDirectMP_Owner() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C16= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[16]")));		    
    String CM16= C16.getAttribute("value");	
    Assert.assertTrue(CM16.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM16) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM16.matches("[0-9]+") && Long.parseLong(CM16)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=141)
    public void  CommonMP_InDirectMP_AnyOtherTelecallers() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[17]")));		    
    String CM17= C17.getAttribute("value");	
    Assert.assertTrue(CM17.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM17) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM17.matches("[0-9]+") && Long.parseLong(CM17)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=142)
    public void  CommonMP_InDirectMP_Anyotherstaff() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement C18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[18]")));		    
    String CM18= C18.getAttribute("value");	
    Assert.assertTrue(CM18.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CM18) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CM18.matches("[0-9]+") && Long.parseLong(CM18)>=0, "Input accepts alphabets");        
    }
//..............................................................................................    
    @Test(priority=143)
    public void  CommonMP_DirectMP_Total() throws InterruptedException { 
    long exp15=cm1+cm2+cm3+cm4+cm5;
    Assert.assertEquals(exp15, cm19);
   }
//..................................................................................
    @Test(priority=144)
    public void  CommonMP_InDirectMP_Total() throws InterruptedException { 
    long exp16=cm6+cm7+cm8+cm9+cm10+cm11+cm12+cm13+cm14+cm15+cm16+cm17+cm18;
    Assert.assertEquals(exp16, cm20);
    Thread.sleep(3000);
   }
//..................................................................................
//    @Test(priority=145)
//    public void  ManpowerCount_Save() throws InterruptedException { 
//  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//   }
//..................................................................................
//    @Test (priority=145)
//    public void Save_the_Data() throws InterruptedException {
//     //  save data
//      Thread.sleep(2000);	           
//      driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//      
//      wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
//	   String actualMessage = Validationmessage.getText();
//	   
//	  // System.out.println("actualMessage  =" +actualMessage);
//	   String expectedMessage = "Saved Successfully";
//	   Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid"); 
//     
//    } 
    //.....................................................................................
    @AfterClass
    public void tearDown () {	
  		 driver.quit();
    }
    
}	
