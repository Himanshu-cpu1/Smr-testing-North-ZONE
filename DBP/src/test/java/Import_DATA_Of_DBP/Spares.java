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

public class Spares extends LOGIN {

	public static WebDriver driver;
	public WebDriverWait wait;
	
	long sp1;
	long sp2;
	long sp3;
	long sp4;
	long sp5;
	long sp6;
	long sp7;
	long sp8;
	long sp9;
	long sp10;
	long sp11;
	long sp12;
	long sp13;
	long sp14;
	long sp15;
	long sp16;
	long sp17;
	long sp18;
	long sp19;
	long sp20;
	long sp21;
	long sp22;
	long sp23;
	long sp24;
	long sp25;
	long sp26;
	long sp27;
	long sp28;
	long sp29;
	long sp30;
	long sp31;
	long sp32;
	long sp33;
	long sp34;
	long sp35;
	long sp36;
	long sp37;
	long sp38;
	long sp39;
	long sp40;
	long sp41;
	long sp42;
	long sp43;
	long sp44;
	long sp45;
	long sp46;
	long sp47;
	long sp48;
	
	double srv1;
	double srv2;
	double nc1;
	long mp1;
	long ic1;
	
	@SuppressWarnings({ "static-access" })
	@BeforeClass
	public void ManpowerCount() throws InterruptedException {
		Thread.sleep(3000);
//...................................................................................    	
		   this.driver=LOGIN.driver;   // call the login page 	
//...................................................................................................................................................	
	//click on Spares option
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),\"Spares \")])[1]")).click();        
	Thread.sleep(2000);
	}
//....................................................................................................................
	@Test(priority=0)     // clear the data
	public void Clear_Data() throws InterruptedException {
//	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	Thread.sleep(2000);
//	    
//	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
//	String actualMessage = Validationmessage.getText();
//		   
//	System.out.println("Clear data Message  =" +actualMessage);
//	String expectedMessage = "Cleared Successfully";
//	Thread.sleep(3000);
//	Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
////..................................................................................................................	
    //Elements of Spares 
	WebElement s1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
    WebElement s2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
    WebElement s3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
    WebElement s4= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
    WebElement s5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
    WebElement s6= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
    WebElement s7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
    WebElement s8= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
    WebElement s9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
    WebElement s10= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
    WebElement s11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
    WebElement s12= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
    WebElement s13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
    WebElement s14= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
    WebElement s15= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
    WebElement s16= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
    WebElement s17= driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
    WebElement s18= driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
    WebElement s19= driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
    WebElement s20= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
    WebElement s21= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
    WebElement s22= driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
    WebElement s23= driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
    WebElement s24= driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
    WebElement s25= driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
    WebElement s26= driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
    WebElement s27= driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
    WebElement s28= driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
    WebElement s29= driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
    WebElement s30= driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
    WebElement s31= driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
    WebElement s32= driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
    WebElement s33= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
    WebElement s34= driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
    WebElement s35= driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
    WebElement s36= driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
    WebElement s37= driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
    WebElement s38= driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
    WebElement s39= driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
    WebElement s40= driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
    WebElement s41= driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
    WebElement s42= driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
    WebElement s43= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
    WebElement s44= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
    WebElement s45= driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
    WebElement s46= driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
    WebElement s47= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
    WebElement s48= driver.findElement(By.xpath("(//*[@type=\"text\"])[48]"));
    
    //send values
//    s1.sendKeys("-$@230000089.");
//    s3.sendKeys("-*&4300065.");
//    s5.sendKeys("-+$7700008.9");
//    s6.sendKeys("-#@49000034.");
//    s8.sendKeys("-*&29945903.");
//    s9.sendKeys("-^%23000.");
//    s10.sendKeys("-!@43000.");
//    s11.sendKeys("-&*93000.");
//    s12.sendKeys("-*^93000.");
//    s13.sendKeys("-$#8300.");
//    s14.sendKeys("-^&1300.");
//    s15.sendKeys("-#*23000.");
//    s16.sendKeys("-$$2350.");
//    s17.sendKeys("-*&4367098.");
//    s18.sendKeys("-!@23076.");
//    s19.sendKeys("-%^73754.");
//    s23.sendKeys("-&*2308909.");
//    s25.sendKeys("-*&30654.");
//    s27.sendKeys("-@#6307860.");
//    s29.sendKeys("-%%43780$.");
//    s35.sendKeys("-&^1365078.*");
//    s37.sendKeys("-#@230876*.");
//    s39.sendKeys("-*&730987%.");
//    s41.sendKeys("-*&23564&.");
    	    
    //convert to Integers
    Thread.sleep(2000);
    sp1= Long.parseLong(s1.getAttribute("value"));
    sp2= Long.parseLong(s2.getAttribute("value"));
    sp3= Long.parseLong(s3.getAttribute("value"));
    sp4= Long.parseLong(s4.getAttribute("value"));
    sp5= Long.parseLong(s5.getAttribute("value"));
    sp6= Long.parseLong(s6.getAttribute("value"));
    sp7= Long.parseLong(s7.getAttribute("value"));
    sp8= Long.parseLong(s8.getAttribute("value"));
    sp9= Long.parseLong(s9.getAttribute("value"));
    sp10= Long.parseLong(s10.getAttribute("value"));
    sp11= Long.parseLong(s11.getAttribute("value"));
    sp12= Long.parseLong(s12.getAttribute("value"));
    sp13= Long.parseLong(s13.getAttribute("value"));
    sp14= Long.parseLong(s14.getAttribute("value"));
    sp15= Long.parseLong(s15.getAttribute("value"));
    sp16= Long.parseLong(s16.getAttribute("value"));
    sp17= Long.parseLong(s17.getAttribute("value"));
    sp18= Long.parseLong(s18.getAttribute("value"));
    sp19= Long.parseLong(s19.getAttribute("value"));
    sp20= Long.parseLong(s20.getAttribute("value"));
    sp21= Long.parseLong(s21.getAttribute("value"));
    sp22= Long.parseLong(s22.getAttribute("value"));
    sp23= Long.parseLong(s23.getAttribute("value"));
    sp24= Long.parseLong(s24.getAttribute("value"));
    sp25= Long.parseLong(s25.getAttribute("value"));
    sp26= Long.parseLong(s26.getAttribute("value"));
    sp27= Long.parseLong(s27.getAttribute("value"));
    sp28= Long.parseLong(s28.getAttribute("value"));
    sp29= Long.parseLong(s29.getAttribute("value"));
    sp30= Long.parseLong(s30.getAttribute("value"));
    sp31= Long.parseLong(s31.getAttribute("value"));
    sp32= Long.parseLong(s32.getAttribute("value"));
    sp33= Long.parseLong(s33.getAttribute("value"));
    sp34= Long.parseLong(s34.getAttribute("value"));
    sp35= Long.parseLong(s35.getAttribute("value"));
    sp36= Long.parseLong(s36.getAttribute("value"));
    sp37= Long.parseLong(s37.getAttribute("value"));
    sp38= Long.parseLong(s38.getAttribute("value"));
    sp39= Long.parseLong(s39.getAttribute("value"));
    sp40= Long.parseLong(s40.getAttribute("value"));
    sp41= Long.parseLong(s41.getAttribute("value"));
    sp42= Long.parseLong(s42.getAttribute("value"));
    sp43= Long.parseLong(s43.getAttribute("value"));
    sp44= Long.parseLong(s44.getAttribute("value"));
    sp45= Long.parseLong(s45.getAttribute("value"));
    sp46= Long.parseLong(s46.getAttribute("value"));
    sp47= Long.parseLong(s47.getAttribute("value"));
    sp48= Long.parseLong(s48.getAttribute("value"));
    	}
//....................................................................................................	
//	@Test (priority=1) //save data
//    public void Save_Data() throws InterruptedException {
//    Thread.sleep(2000);	           
//    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//    
//    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();     
//    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//  
//	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
//	
//	String actualMessage = Validationmessage.getText();  
//    System.out.println("Save Data Message  =" +actualMessage);
//	String expectedMessage = "Saved Successfully";
//	Thread.sleep(3000);
//	Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
//	
//    }
//.................................................................................................................    	
	@Test(priority = 2)
    public void ClickOn_Service() throws InterruptedException {
   
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement SR= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[12]")));
    SR.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/service";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String ServiceCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("Service Current URL = " + ServiceCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, ServiceCurrentURL);
 	
	WebElement sr1= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));    //Service- Paid & Running Repairs Load (Workshop)
	WebElement sr2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));    //Service- Bodyshop Load
	
	//convert into integers
	srv1= Long.parseLong(sr1.getAttribute("value"));
	srv2= Long.parseLong(sr2.getAttribute("value"));
	Thread.sleep(3000);
	}	
//......................................................................................................................................	
	@Test(priority = 3)
    public void ClickOn_NewCar() throws InterruptedException {
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement NC= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"New Car \")])[1]")));
    NC.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/New-car";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String NewCarCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("New Car Current URL = " + NewCarCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, NewCarCurrentURL);
    Thread.sleep(3000);
    WebElement n1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));    // New Car- Quantity
    
    //convert into integers
  	nc1= Long.parseLong(n1.getAttribute("value")); 
  	Thread.sleep(3000);
	}
//..............................................................................................................		
	@Test(priority = 4)
    public void ClickOn_Manpower_Cost() throws InterruptedException {
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement MP= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line f1\"])")));
    MP.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/Man-Power-Cost";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String ManpowerCostCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("Manpower Cost Current URL = " + ManpowerCostCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, ManpowerCostCurrentURL);
	
	WebElement m1= driver.findElement(By.xpath("(//*[@type=\"text\"])[60]"));    //Spares- Manpower Cost
	
	//convert into integers
	mp1= Long.parseLong(m1.getAttribute("value"));
	Thread.sleep(3000);
	}
//.........................................................................................................................	
	@Test(priority = 5)
    public void ClickOn_Interest_Cost() throws InterruptedException {
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement IC= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[4]")));
    IC.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/Interest-Cost";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String InterestCostCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("Interest Cost Current URL = " + InterestCostCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, InterestCostCurrentURL);
    
    WebElement i1= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));    //Spares- Short Term Interest Cost
	
	//convert into integers
	ic1= Long.parseLong(i1.getAttribute("value"));
	Thread.sleep(3000);
	}	
//.........................................................................................................................
	@Test(priority = 6)
    public void ClickOn_Spares() throws InterruptedException {
   
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement SP= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[11]")));
    SP.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/spare";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String SparesCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("Spares Current URL = " + SparesCurrentURL);
    Thread.sleep(3000);
    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, SparesCurrentURL);
	}
//............................................................................................................................	
	@Test(priority = 7) //Spares- Spares Sales :Workshop Amount
    public void  Spares_Sales_Workshop_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(18));
  	
    WebElement S1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[1]")));	    
    String SP1= S1.getAttribute("value");
    
    Assert.assertTrue(SP1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP1.matches("[0-9]+") && Long.parseLong(SP1)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 8) //Spares- Spares Sales :Workshop Sales Per Load
    public void  Spares_Sales_Workshop_SalesPerLoad() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp1= sp1/srv1;
  	long roundexp1= Math.round(exp1);
    Assert.assertEquals(roundexp1,sp2);         
    }
//..................................................................................
	@Test(priority = 9) //Spares- Spares Sales :Bodyshop Amount
    public void  Spares_Sales_Bodyshop_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[3]")));	    
    String SP3= S3.getAttribute("value");	
    Assert.assertTrue(SP3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP3.matches("[0-9]+") && Long.parseLong(SP3)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 10) //Spares- Spares Sales :Bodyshop Sales Per Load
    public void  Spares_Sales_Bodyshop_SalesPerLoad() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp2= sp3/srv2;
  	long roundexp2= Math.round(exp2);
    Assert.assertEquals(roundexp2,sp4);         
    }
//..................................................................................
	@Test(priority = 11) //Spares- Sales of Oil Amount
    public void  SparesSales_Sales_of_Oil_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[5]")));	    
    String SP5= S5.getAttribute("value");	
    Assert.assertTrue(SP5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP5.matches("[0-9]+") && Long.parseLong(SP5)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 12) //Spares- Other Sales Amount
    public void  SparesSales_Other_Sales_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[6]")));	    
    String SP6= S6.getAttribute("value");	
    Assert.assertTrue(SP6.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP6) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP6.matches("[0-9]+") && Long.parseLong(SP6)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 13) //Spares- Total Spares Sales
    public void  SpareSales_Total_Spares_Sales() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long exp3= sp1+sp3+sp5+sp6;
    Assert.assertEquals(exp3,sp7);         
    }
//..................................................................................
	@Test(priority = 14) //Spares-COGS>Spares Parts (MGP)>Opening Stock
    public void  SparesCOGS_Spares_Parts_Opening_Stock() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[8]")));	    
    String SP8= S8.getAttribute("value");	
    Assert.assertTrue(SP8.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP8) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP8.matches("[0-9]+") && Long.parseLong(SP8)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 15) //Spares-COGS>Spares Parts (MGP)>Purchase
    public void  SparesCOGS_Spares_Parts_Purchase() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[9]")));	    
    String SP9= S9.getAttribute("value");	
    Assert.assertTrue(SP9.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP9) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP9.matches("[0-9]+") && Long.parseLong(SP9)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 16) //Spares-COGS>Spares Parts (MGP)>Closing Stock
    public void  SparesCOGS_Spares_Parts_Closing_Stock() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[10]")));	    
    String SP10= S10.getAttribute("value");	
    Assert.assertTrue(SP10.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP10) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP10.matches("[0-9]+") && Long.parseLong(SP10)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 17) //Spares-COGS>Oil>Opening Stock
    public void  SparesCOGS_Oil_Opening_Stock() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[11]")));	    
    String SP11= S11.getAttribute("value");	
    Assert.assertTrue(SP11.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP11) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP11.matches("[0-9]+") && Long.parseLong(SP11)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 18) //Spares-COGS>Oil>Purchase
    public void  SparesCOGS_Oil_Purchase() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[12]")));	    
    String SP12= S12.getAttribute("value");	
    Assert.assertTrue(SP12.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP12) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP12.matches("[0-9]+") && Long.parseLong(SP12)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 19) //Spares-COGS>Oil >Closing Stock
    public void  SparesCOGS_Oil_Closing_Stock() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  
    WebElement S13= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[13]")));	    
    String SP13= S13.getAttribute("value");	
    Assert.assertTrue(SP13.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP13) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP13.matches("[0-9]+") && Long.parseLong(SP13)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 20) //Spares-COGS>Tyres/Battery/Polish>Opening Stock
    public void  SparesCOGS_Tyres_Battery_Polish_Opening_Stock() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S14= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[14]")));	    
    String SP14= S14.getAttribute("value");	
    Assert.assertTrue(SP14.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP14) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP14.matches("[0-9]+") && Long.parseLong(SP14)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 21) //Spares-COGS>Tyres/Battery/Polish> Purchase
    public void  SparesCOGS_Tyres_Battery_Polish_Purchase() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[15]")));	    
    String SP15= S15.getAttribute("value");	
    Assert.assertTrue(SP15.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP15) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP15.matches("[0-9]+") && Long.parseLong(SP15)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 22) //Spares-COGS>Tyres/Battery/Polish>Closing Stock
    public void  SparesCOGS_Tyres_Battery_Polish_Closing_Stock() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S16= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[16]")));	    
    String SP16= S16.getAttribute("value");	
    Assert.assertTrue(SP16.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP16) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP16.matches("[0-9]+") && Long.parseLong(SP16)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 23) //Spares-COGS>Consumables>Opening Stock
    public void  SparesCOGS_Consumables_Opening_Stock() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  
    WebElement S17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[17]")));	    
    String SP17= S17.getAttribute("value");	
    Assert.assertTrue(SP17.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP17) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP17.matches("[0-9]+") && Long.parseLong(SP17)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 24) //Spares-COGS>Consumables>Purchase
    public void  SparesCOGS_Consumables_Purchase() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	
    WebElement S18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[18]")));	    
    String SP18= S18.getAttribute("value");	
    Assert.assertTrue(SP18.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP18) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP18.matches("[0-9]+") && Long.parseLong(SP18)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 25) //Spares-COGS>Consumables>Closing Stock
    public void  SparesCOGS_Consumables_Closing_Stock() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  
    WebElement S19= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[19]")));	    
    String SP19= S19.getAttribute("value");	
    Assert.assertTrue(SP19.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP19) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP19.matches("[0-9]+") && Long.parseLong(SP19)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 26) //Spares- COGS> Cost of Goods Sold
    public void  Spares_COGS_Cost_Of_Goods_Sold() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long Add1= sp8+sp11+sp14+sp17;
	long Add2= sp9+sp12+sp15+sp18;
	long Sub3= sp10+sp13+sp16+sp19;
	long Add3= Add1+Add2;
	long exp4= Add3-Sub3;
    Assert.assertEquals(exp4,sp20);         
    }
//..................................................................................
	@Test(priority = 27) //Spares> Income> Spares Margin Amount
    public void  Spares_Income_Spares_Margin_Amount	() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long exp5= sp7-sp20;
    Assert.assertEquals(exp5,sp21);         
    }
//..................................................................................
	@Test(priority = 28) //Spares> Income> Spares Margin- Per New Car
    public void  Spares_Income_Spares_Margin_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp6= sp21/nc1;
  	long roundexp6= Math.round(exp6);
    Assert.assertEquals(roundexp6,sp22);         
    }
//..................................................................................
	@Test(priority = 29) //Spares-Income>Incentive from Spare parts sale
    public void  Spares_Income_Incentive_from_Spare_parts_sale() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	Thread.sleep(1000);
    WebElement S23= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[23]")));	    
    String SP23= S23.getAttribute("value");	
    Assert.assertTrue(SP23.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP23) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP23.matches("[0-9]+") && Long.parseLong(SP23)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 30) //Spares-Income>Incentive from Spare parts sale Per New Car
    public void  Spares_Income_Incentive_from_Spare_parts_sale_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp7= sp23/nc1;
  	long roundexp7= Math.round(exp7);
    Assert.assertEquals(roundexp7,sp24);
  	}
//..................................................................................
	@Test(priority = 31) //Spares-Income>Spare Parts Warranty Claims
    public void  Spares_Income_Spare_Parts_Warranty_Claims() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	Thread.sleep(1000);
    WebElement S25= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[25]")));	    
    String SP25= S25.getAttribute("value");	
    Assert.assertTrue(SP25.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP25) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP25.matches("[0-9]+") && Long.parseLong(SP25)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 32) //Spares-Income>Spare Parts Warranty Claims Per New Car
    public void  Spares_Income_Spare_Parts_Warranty_Claims_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp8= sp25/nc1;
  	long roundexp8= Math.round(exp8);
    Assert.assertEquals(roundexp8,sp26);
  	}
//..................................................................................
	@Test(priority = 33) //Spares-Income>Scrap Sales : Cardboard & Cartons
    public void  Spares_Income_Scrap_Sales_Cardboard_Cartons() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	Thread.sleep(1000);
    WebElement S27= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[27]")));	    
    String SP27= S27.getAttribute("value");	
    Assert.assertTrue(SP27.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP27) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP27.matches("[0-9]+") && Long.parseLong(SP27)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 34) //Spares-Income>Scrap Sales : Cardboard & Cartons Per New Car
    public void  Spares_Income_Scrap_Sales_Cardboard_Cartons_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp9= sp27/nc1;
  	long roundexp9= Math.round(exp9);
    Assert.assertEquals(roundexp9,sp28);
  	}
//..................................................................................
	@Test(priority = 35) //Spares-Income>Any other Spares Income
    public void  Spares_Income_Any_other_Spares_Income() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	Thread.sleep(1000);
    WebElement S29= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[29]")));	    
    String SP29= S29.getAttribute("value");	
    Assert.assertTrue(SP29.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP29) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP29.matches("[0-9]+") && Long.parseLong(SP29)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 36) //Spares-Income>Any other Spares Income Per New Car
    public void  Spares_Income_Any_other_Spares_Income_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp10= sp29/nc1;
  	long roundexp10= Math.round(exp10);
    Assert.assertEquals(roundexp10,sp30);
  	}
//..................................................................................
	@Test(priority = 37) //Spares- Manpower Cost
    public void  Spares_Expense_Manpower_Cost() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	    	
    Assert.assertEquals(sp31, mp1);            
    }
//..................................................................................
	@Test(priority = 38) //Spares- Manpower Cost- Per New Car
    public void  Spares_Expense_Manpower_Cost_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp11= sp31/nc1;
  	long roundexp11= Math.round(exp11);
    Assert.assertEquals(roundexp11,sp32);            
    }
//..................................................................................
	@Test(priority = 39) //Spares- Short term Interest Cost 
    public void  Spares_Expense_Short_term_Interest_Cost () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	    	
    Assert.assertEquals(sp33, ic1);            
    }
//..................................................................................
	@Test(priority = 40) //Short term Interest Cost - Per New Car
    public void  Spares_Expense_Short_term_Interest_Cost_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp12= sp33/nc1;
  	long roundexp12= Math.round(exp12);
    Assert.assertEquals(roundexp12,sp34);            
    }
//..................................................................................
	@Test(priority = 41) //Spares-Expense>Discount Bill discount
    public void  Spares_Expense_Discount_Bill_discount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	Thread.sleep(1000);
    WebElement S35= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[35]")));	    
    String SP35= S35.getAttribute("value");	
    Assert.assertTrue(SP35.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP35) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP35.matches("[0-9]+") && Long.parseLong(SP35)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 42) //Spares-Expense>Discount Bill discount Per New Car
    public void  Spares_Expense_Discount_Bill_discount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp13= sp35/nc1;
  	long roundexp13= Math.round(exp13);
    Assert.assertEquals(roundexp13,sp36);
  	}
//..................................................................................
	@Test(priority = 43) //Spares-Expense>Discount through Workshop
    public void  Spares_Expense_Discount_through_Workshop() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	Thread.sleep(1000);
    WebElement S37= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[37]")));	    
    String SP37= S37.getAttribute("value");	
    Assert.assertTrue(SP37.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP37) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP37.matches("[0-9]+") && Long.parseLong(SP37)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 44) //Spares-Expense>Discount through Workshop Per New Car
    public void  Spares_Expense_Discount_through_Workshop_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp14= sp37/nc1;
  	long roundexp14= Math.round(exp14);
    Assert.assertEquals(roundexp14,sp38);
  	}
//..................................................................................
	@Test(priority = 45) //Spares-Expense>Discount any others
    public void  Spares_Expense_Discount_any_others() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	Thread.sleep(1000);
    WebElement S39= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[39]")));	    
    String SP39= S39.getAttribute("value");	
    Assert.assertTrue(SP39.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP39) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP39.matches("[0-9]+") && Long.parseLong(SP39)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 46) //Spares-Expense>Discount any others Per New Car
    public void  Spares_Expense_Discount_any_others_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp15= sp39/nc1;
  	long roundexp15= Math.round(exp15);
    Assert.assertEquals(roundexp15,sp40);
  	}
//..................................................................................
	@Test(priority = 47) //Spares-Expense>Any other Expense
    public void  Spares_Expense_Any_other_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	Thread.sleep(1000);
    WebElement S41= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[41]")));	    
    String SP41= S41.getAttribute("value");	
    Assert.assertTrue(SP41.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(SP41) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(SP41.matches("[0-9]+") && Long.parseLong(SP41)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 48) //Spares-Expense>Any other Expense Per New Car
    public void  Spares_Expense_Any_other_Expense_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp16= sp41/nc1;
  	long roundexp16= Math.round(exp16);
    Assert.assertEquals(roundexp16,sp42);
  	}
//..................................................................................
	@Test(priority = 49) //Spares-Total> Total Spares Income
    public void  Total_Spares_Income() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long exp17= sp21+sp23+sp25+sp27+sp29;
    Assert.assertEquals(exp17,sp43);
  	}
//..................................................................................
	@Test(priority = 50) //Spares-Total> Total Spares Income Per New Car
    public void  Total_Spares_Income_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp18= sp43/nc1;
  	long roundexp18= Math.round(exp18);
    Assert.assertEquals(roundexp18,sp44);
  	}
//..................................................................................
	@Test(priority = 51) //Spares-Total> Total Spares Direct Expense
    public void  Total_Spares_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long exp19= sp31+sp33+sp35+sp37+sp39+sp41;
    Assert.assertEquals(exp19,sp47);
  	}
//..................................................................................
	@Test(priority = 52) //Spares-Total> Total Spares Direct Expense Per New Car
    public void  Total_Spares_Direct_Expense_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp20= sp47/nc1;
  	long roundexp20= Math.round(exp20);
    Assert.assertEquals(roundexp20,sp48);
  	}
//..................................................................................
	@Test(priority = 53) //Spares-Total> Net earning from Spares
    public void  Net_earning_from_Spares() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long exp21= sp43-sp47;
    Assert.assertEquals(exp21,sp45);
  	}
//..................................................................................
	@Test(priority = 54) //Spares-Total> Net earning from Spares Per New Car
    public void  Net_earning_from_Spares_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp22= sp45/nc1;
  	long roundexp22= Math.round(exp22);
    Assert.assertEquals(roundexp22,sp46);
  	}
//..................................................................................
	  @AfterClass
      public void tearDown () {	
    		 driver.quit();
      } 
	
}	
	
	
	
	
	
	
	



