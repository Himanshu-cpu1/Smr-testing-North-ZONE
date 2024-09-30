package dBP_Login_ALL;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Import_DATA_Of_DBP.Login_Page;

public class Common_Expense_TestNG  {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	long ce1;
	long ce2;
	long ce3;
	long ce4;
	long ce5;
	long ce6;
	long ce7;
	long ce8;
	long ce9;
	long ce10;
	long ce11;
	long ce12;
	long ce13;
	long ce14;
	long ce15;
	long ce16;
	long ce17;
	long ce18;
	long ce19;
	long ce20;
	long ce21;
	long ce22;
	long ce23;
	long ce24;
	long ce25;
	long ce26;
	long ce27;
	long ce28;
	long ce29;
	long ce30;
	long ce31;
	long ce32;
	long ce33;
	long ce34;
	long ce35;
	long ce36;
	long ce37;
	long ce38;
	long ce39;
	long ce40;
	long ce41;
	long ce42;
	long ce43;
	long ce44;
	long ce45;
	long ce46;
	long ce47;
	long ce48;
	long ce49;
	long ce50;
	long ce51;
	long ce52;
	long ce53;
	long ce54;
	long ce55;
	long ce56;
	long ce57;
	long ce58;
	long ce59;
	long ce60;
	long ce61;
	long ce62;
	long ce63;
	long ce64;
	long ce65;
	long ce66;
	long ce67;
	long ce68;
	long ce69;
	long ce70;
	long ce71;
	long ce72;
	long ce73;
	long ce74;
	long ce75;
	long ce76;
	long ce77;
	long ce78;
	long ce79;
	long ce80;
	long ce81;
	long ce82;
	long ce83;
	long ce84;
	long ce85;
	long ce86;
	long ce87;
	long ce88;
	long ce89;
	long ce90;
	long ce91;
	long ce92;
	long ce93;
	long ce94;
	long ce95;
	long ce96;
	long ce97;
	long ce98;
	long ce99;
	long ce100;
	long ce101;
	long ce102;
	long ce103;
	long ce104;
	long ce105;
	long ce106;
	long ce107;
	long ce108;
	long ce109;
	long ce110;
	long ce111;
	long ce112;
	long ce113;
	long ce114;
	long ce115;
	long ce116;
	long ce117;
	long ce118;
	long ce119;
	long ce120;
	long ce121;
	long ce122;
	long ce123;
	double nc1;
	long mp1;
	long ic1;

	@SuppressWarnings({ "static-access" })
	@BeforeClass
	public void ManpowerCount() throws InterruptedException {		
		Thread.sleep(3000);	
		
		//...................................................................................    	
				   this.driver=SERVICE.driver;   // call the login page 
	  //................................................................................................		
//...................................................................................................................................................	
	//click on Common Expense option
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[13]")).click();        
	Thread.sleep(2000);
	}
//....................................................................................................................
	@Test(priority=0)     // clear the data
	public void Clear_Data() throws InterruptedException {
	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	Thread.sleep(2000);
	    
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
	String actualMessage = Validationmessage.getText();
		   
	System.out.println("Clear data Message  =" +actualMessage);
	String expectedMessage = "Cleared Successfully";
	Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
//..................................................................................................................	
    //Elements of Common Expense- Depreciation & Rent
	WebElement c1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
    WebElement c2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
    WebElement c3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
    WebElement c4= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
    WebElement c5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
    WebElement c6= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
    WebElement c7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
    WebElement c8= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
    WebElement c9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
    WebElement c10= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
    WebElement c11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
    WebElement c12= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
    WebElement c13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
    WebElement c14= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
    WebElement c15= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
    WebElement c16= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
    WebElement c17= driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
    WebElement c18= driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
    WebElement c19= driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
    WebElement c20= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
    WebElement c21= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
    WebElement c22= driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
    WebElement c23= driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
    WebElement c24= driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
    WebElement c25= driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
    WebElement c26= driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
    WebElement c27= driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
    WebElement c28= driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));	    
    WebElement c29= driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
    WebElement c30= driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
    WebElement c31= driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
    WebElement c32= driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
    WebElement c33= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
    WebElement c34= driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
    WebElement c35= driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
    WebElement c36= driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
    WebElement c37= driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
    WebElement c38= driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
    WebElement c39= driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
    WebElement c40= driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
    WebElement c41= driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
    WebElement c42= driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
    WebElement c43= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
    WebElement c44= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
    WebElement c45= driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
    WebElement c46= driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
    WebElement c47= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
    WebElement c48= driver.findElement(By.xpath("(//*[@type=\"text\"])[48]"));
    WebElement c49= driver.findElement(By.xpath("(//*[@type=\"text\"])[49]"));
    WebElement c50= driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
    WebElement c51= driver.findElement(By.xpath("(//*[@type=\"text\"])[51]"));
    WebElement c52= driver.findElement(By.xpath("(//*[@type=\"text\"])[52]"));
    WebElement c53= driver.findElement(By.xpath("(//*[@type=\"text\"])[53]"));
    WebElement c54= driver.findElement(By.xpath("(//*[@type=\"text\"])[54]"));
    WebElement c55= driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
    WebElement c56= driver.findElement(By.xpath("(//*[@type=\"text\"])[56]"));
    WebElement c57= driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
    WebElement c58= driver.findElement(By.xpath("(//*[@type=\"text\"])[58]"));
    WebElement c59= driver.findElement(By.xpath("(//*[@type=\"text\"])[59]"));
    WebElement c60= driver.findElement(By.xpath("(//*[@type=\"text\"])[60]"));
    WebElement c61= driver.findElement(By.xpath("(//*[@type=\"text\"])[61]"));
    WebElement c62= driver.findElement(By.xpath("(//*[@type=\"text\"])[62]"));
    WebElement c63= driver.findElement(By.xpath("(//*[@type=\"text\"])[63]"));
    WebElement c64= driver.findElement(By.xpath("(//*[@type=\"text\"])[64]"));
    WebElement c65= driver.findElement(By.xpath("(//*[@type=\"text\"])[65]"));
    WebElement c66= driver.findElement(By.xpath("(//*[@type=\"text\"])[66]"));
    WebElement c67= driver.findElement(By.xpath("(//*[@type=\"text\"])[67]"));
//..................................................................................................    
    //send values 
    Thread.sleep(2000);
    c1.sendKeys("-dsa866567.");
    c2.sendKeys("-d166567.");
    c3.sendKeys("-gf198567.");
    c4.sendKeys("-jh866567.");
    c5.sendKeys("-j864567.");
    c6.sendKeys("-jgh196567.");
    c7.sendKeys("-hg198667.");	     
    c9.sendKeys("-gf198667.");
    c10.sendKeys("-gf198665.");
    c11.sendKeys("-gf198667.");
    c12.sendKeys("-jg198665.");
    c13.sendKeys("-re198667.");
    c14.sendKeys("-gf66567.");
    c15.sendKeys("-h866567.");   
    c17.sendKeys("-hg866567.");
    c18.sendKeys("-hg6657667.");
    c19.sendKeys("-w198567.");
    c20.sendKeys("-r866567.");
    c21.sendKeys("-r866567.");
    c22.sendKeys("-re198667.");
    c23.sendKeys("-td198667.");	     
    c25.sendKeys("-df166567.");
    c26.sendKeys("--gd866567.");
    c27.sendKeys("-d9866567.");
    c28.sendKeys("-gdd196567.");
    c29.sendKeys("-dd196567.");
    c30.sendKeys("-dfd866567.");
    c31.sendKeys("--dfd66567.");	     
    c41.sendKeys("-dfd866567.");
    c42.sendKeys("-d196567.");
    c43.sendKeys("-d198667.");
    c44.sendKeys("-d198667.");
    c45.sendKeys("-dd19867.");
    c46.sendKeys("-dgd298567.");
    c47.sendKeys("-ddf866567.");
    c48.sendKeys("-dfd7866567.");	    
    c50.sendKeys("-dffd89866.");
    c51.sendKeys("-dffd486567.");
    c52.sendKeys("-dff586567.");
    c53.sendKeys("-dff786567.");
    c54.sendKeys("-fd966567.");
    c55.sendKeys("-fd3f86656..7");
    c56.sendKeys("-df298667.");
    c57.sendKeys("-d432567.");
   	 //............................................................................................................................    	     
    //convert into integers
    Thread.sleep(2000);
     ce1= Long.parseLong(c1.getAttribute("value"));
     ce2= Long.parseLong(c2.getAttribute("value"));
     ce3= Long.parseLong(c3.getAttribute("value"));
     ce4= Long.parseLong(c4.getAttribute("value"));
     ce5= Long.parseLong(c5.getAttribute("value"));
     ce6= Long.parseLong(c6.getAttribute("value"));
     ce7= Long.parseLong(c7.getAttribute("value"));
     ce8= Long.parseLong(c8.getAttribute("value"));
     ce9= Long.parseLong(c9.getAttribute("value"));
     ce10= Long.parseLong(c10.getAttribute("value"));
     ce11= Long.parseLong(c11.getAttribute("value"));
     ce12= Long.parseLong(c12.getAttribute("value"));
     ce13= Long.parseLong(c13.getAttribute("value"));
     ce14= Long.parseLong(c14.getAttribute("value"));
     ce15= Long.parseLong(c15.getAttribute("value"));
     ce16= Long.parseLong(c16.getAttribute("value"));
     ce17= Long.parseLong(c17.getAttribute("value"));
     ce18= Long.parseLong(c18.getAttribute("value"));
     ce19= Long.parseLong(c19.getAttribute("value"));
     ce20= Long.parseLong(c20.getAttribute("value"));
     ce21= Long.parseLong(c21.getAttribute("value"));
     ce22= Long.parseLong(c22.getAttribute("value"));
     ce23= Long.parseLong(c23.getAttribute("value"));
     ce24= Long.parseLong(c24.getAttribute("value"));
     ce25= Long.parseLong(c25.getAttribute("value"));
     ce26= Long.parseLong(c26.getAttribute("value"));
     ce27= Long.parseLong(c27.getAttribute("value"));
     ce28= Long.parseLong(c28.getAttribute("value"));
     ce29= Long.parseLong(c29.getAttribute("value"));
     ce30= Long.parseLong(c30.getAttribute("value"));
     ce31= Long.parseLong(c31.getAttribute("value"));
     ce32= Long.parseLong(c32.getAttribute("value"));
     ce33= Long.parseLong(c33.getAttribute("value"));
     ce34= Long.parseLong(c34.getAttribute("value"));
     ce35= Long.parseLong(c35.getAttribute("value"));
     ce36= Long.parseLong(c36.getAttribute("value"));
     ce37= Long.parseLong(c37.getAttribute("value"));
     ce38= Long.parseLong(c38.getAttribute("value"));
     ce39= Long.parseLong(c39.getAttribute("value"));
     ce40= Long.parseLong(c40.getAttribute("value"));
     ce41= Long.parseLong(c41.getAttribute("value"));
     ce42= Long.parseLong(c42.getAttribute("value"));
     ce43= Long.parseLong(c43.getAttribute("value"));
     ce44= Long.parseLong(c44.getAttribute("value"));
     ce45= Long.parseLong(c45.getAttribute("value"));
     ce46= Long.parseLong(c46.getAttribute("value"));
     ce47= Long.parseLong(c47.getAttribute("value"));
     ce48= Long.parseLong(c48.getAttribute("value"));
     ce49= Long.parseLong(c49.getAttribute("value"));
     ce50= Long.parseLong(c50.getAttribute("value"));
     ce51= Long.parseLong(c51.getAttribute("value"));
     ce52= Long.parseLong(c52.getAttribute("value"));
     ce53= Long.parseLong(c53.getAttribute("value"));
     ce54= Long.parseLong(c54.getAttribute("value"));
     ce55= Long.parseLong(c55.getAttribute("value"));
     ce56= Long.parseLong(c56.getAttribute("value"));
     ce57= Long.parseLong(c57.getAttribute("value"));
     ce58= Long.parseLong(c58.getAttribute("value"));
     ce59= Long.parseLong(c59.getAttribute("value"));
     ce60= Long.parseLong(c60.getAttribute("value"));
     ce61= Long.parseLong(c61.getAttribute("value"));
     ce62= Long.parseLong(c62.getAttribute("value"));
     ce63= Long.parseLong(c63.getAttribute("value"));
     ce64= Long.parseLong(c64.getAttribute("value"));
     ce65= Long.parseLong(c65.getAttribute("value"));
     ce66= Long.parseLong(c66.getAttribute("value"));
     ce67= Long.parseLong(c67.getAttribute("value"));
	}
//................................................................................................
	@Test (priority=1) //save data
    public void Save_Data_Depreciation_Rent() throws InterruptedException {
	Thread.sleep(3000);
	Actions A= new Actions(driver);
	A.sendKeys(Keys.PAGE_DOWN).perform(); //scroll up	
    Thread.sleep(2000);	           
    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();     
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    Thread.sleep(2000);
	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
	Thread.sleep(2000);
	String actualMessage = Validationmessage.getText();  
    System.out.println("Save Data Message  =" +actualMessage);
	String expectedMessage = "Saved Successfully";
	Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
	Thread.sleep(3000);
    }   
//.................................................................................................................    	
	@Test(priority = 2)
    public void ClickOn_NewCar() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
}
//..............................................................................................................		
	@Test(priority = 3)
    public void ClickOn_Manpower_Cost() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
	
	WebElement m1= driver.findElement(By.xpath("(//*[@type=\"text\"])[80]"));    //Common Expense- Manpower Cost
	
	//convert into integers
	mp1= Long.parseLong(m1.getAttribute("value"));
	
	}
//.........................................................................................................................	
	@Test(priority = 4)
    public void ClickOn_Interest_Cost() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
    
    WebElement i1= driver.findElement(By.xpath("(//*[@type=\"number\"])[97]"));    //Common Expense- Long Term Interest Cost
	
	//convert into integers
	ic1= Long.parseLong(i1.getAttribute("value"));	
	}	
//.........................................................................................................................
	@Test(priority = 5)
    public void ClickOn_Common_Expense() throws InterruptedException {
    Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement SP= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[13]")));
    SP.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/common-expense";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String CommonExpenseCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("Common Expense Current URL = " + CommonExpenseCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, CommonExpenseCurrentURL);
    Thread.sleep(2000);
	}
//............................................................................................................................	
	@Test(priority = 6) //Depreciation>Building>New Car  
    public void  Depreciation_Building_NewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	Thread.sleep(3000);
    WebElement C1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[1]")));	    
    String CE1= C1.getAttribute("value");	
    Assert.assertTrue(CE1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE1.matches("[0-9]+") && Long.parseLong(CE1)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 7) //Depreciation>Building>MSGA
    public void  Depreciation_Building_MSGA() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[2]")));	    
    String CE2= C2.getAttribute("value");	
    Assert.assertTrue(CE2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE2.matches("[0-9]+") && Long.parseLong(CE2)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 8) //Depreciation>Building>Service
    public void  Depreciation_Building_Service() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[3]")));	    
    String CE3= C3.getAttribute("value");	
    Assert.assertTrue(CE3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE3.matches("[0-9]+") && Long.parseLong(CE3)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 9) //Depreciation>Building>Spares
    public void  Depreciation_Building_Spares() throws InterruptedException { 
    WebElement C4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[4]")));	    
    String CE4= C4.getAttribute("value");	
    Assert.assertTrue(CE4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE4.matches("[0-9]+") && Long.parseLong(CE4)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 10) //Depreciation>Building>True Value
    public void  Depreciation_Building_TrueValue() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[5]")));	    
    String CE5= C5.getAttribute("value");	
    Assert.assertTrue(CE5.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE5) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE5.matches("[0-9]+") && Long.parseLong(CE5)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 11) //Depreciation>Building>MI
    public void  Depreciation_Building_MI() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[6]")));	    
    String CE6= C6.getAttribute("value");	
    Assert.assertTrue(CE6.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE6) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE6.matches("[0-9]+") && Long.parseLong(CE6)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 12) //Depreciation>Building>MDS
    public void  Depreciation_Building_MDS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[7]")));	    
    String CE7= C7.getAttribute("value");	
    Assert.assertTrue(CE7.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE7) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE7.matches("[0-9]+") && Long.parseLong(CE7)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 13) //Depreciation>Building>Total
    public void Depreciation_Building_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp1= ce1+ce2+ce3+ce4+ce5+ce6+ce7;
    Assert.assertEquals(exp1,ce8);         
    }
//..................................................................................
	@Test(priority = 14) //Depreciation>Plant & Machinery>New Car  
    public void  Depreciation_Plant_Machinery_NewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[9]")));	    
    String CE9= C9.getAttribute("value");	
    Assert.assertTrue(CE9.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE9) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE9.matches("[0-9]+") && Long.parseLong(CE9)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 15) //Depreciation>Plant_Machinery>MSGA
    public void  Depreciation_Plant_Machinery_MSGA() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[10]")));	    
    String CE10= C10.getAttribute("value");	
    Assert.assertTrue(CE10.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE10) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE10.matches("[0-9]+") && Long.parseLong(CE10)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 16) //Depreciation>Plant_Machinery>Service
    public void  Depreciation_Plant_Machinery_Service() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[11]")));	    
    String CE11= C11.getAttribute("value");	
    Assert.assertTrue(CE11.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE11) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE11.matches("[0-9]+") && Long.parseLong(CE11)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 17) //Depreciation>Plant_Machinery>Spares
    public void  Depreciation_Plant_Machinery_Spares() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[12]")));	    
    String CE12= C12.getAttribute("value");	
    Assert.assertTrue(CE12.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE12) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE12.matches("[0-9]+") && Long.parseLong(CE12)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 18) //Depreciation>Plant_Machinery>True Value
    public void  Depreciation_Plant_Machinery_TrueValue() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C13= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[13]")));	    
    String CE13= C13.getAttribute("value");	
    Assert.assertTrue(CE13.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE13) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE13.matches("[0-9]+") && Long.parseLong(CE13)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 19) //Depreciation>Plant_Machinery>MI
    public void  Depreciation_Plant_Machinery_MI() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C14= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[14]")));	    
    String CE14= C14.getAttribute("value");	
    Assert.assertTrue(CE14.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE14) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE14.matches("[0-9]+") && Long.parseLong(CE14)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 20) //Depreciation>Plant_Machinery>MDS
    public void  Depreciation_Plant_Machinery_MDS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[15]")));	    
    String CE15= C15.getAttribute("value");	
    Assert.assertTrue(CE15.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE15) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE15.matches("[0-9]+") && Long.parseLong(CE15)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 21) //Depreciation>Plant_Machinery>Total
    public void Depreciation_Plant_Machinery_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp2= ce9+ce10+ce11+ce12+ce13+ce14+ce15;
    Assert.assertEquals(exp2,ce16);         
    }
//..................................................................................
	@Test(priority = 22) //Depreciation>Demo Vehicles>New Car  
    public void  Depreciation_Demo_Vehicles_NewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[17]")));	    
    String CE17= C17.getAttribute("value");	
    Assert.assertTrue(CE17.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE17) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE17.matches("[0-9]+") && Long.parseLong(CE17)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 23) //Depreciation>Demo Vehicles>MSGA
    public void  Depreciation_Demo_Vehicles_MSGA() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[18]")));	    
    String CE18= C18.getAttribute("value");	
    Assert.assertTrue(CE18.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE18) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE18.matches("[0-9]+") && Long.parseLong(CE18)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 24) //Depreciation>Demo Vehicles>Service
    public void  Depreciation_Demo_Vehicles_Service() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C19= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[19]")));	    
    String CE19= C19.getAttribute("value");	
    Assert.assertTrue(CE19.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE19) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE19.matches("[0-9]+") && Long.parseLong(CE19)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 25) //Depreciation>Demo Vehicles>Spares
    public void  Depreciation_Demo_Vehicles_Spares() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C20= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[20]")));	    
    String CE20= C20.getAttribute("value");	
    Assert.assertTrue(CE20.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE20) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE20.matches("[0-9]+") && Long.parseLong(CE20)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 26) //Depreciation>Demo Vehicles>True Value
    public void  Depreciation_Demo_Vehicles_TrueValue() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C21= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[21]")));	    
    String CE21= C21.getAttribute("value");	
    Assert.assertTrue(CE21.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE21) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE21.matches("[0-9]+") && Long.parseLong(CE21)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 27) //Depreciation>Demo Vehicles>MI
    public void  Depreciation_Demo_Vehicles_MI() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C22= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[22]")));	    
    String CE22= C22.getAttribute("value");	
    Assert.assertTrue(CE22.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE22) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE22.matches("[0-9]+") && Long.parseLong(CE22)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 28) //Depreciation>Demo Vehicles>MDS
    public void  Depreciation_Demo_Vehicles_MDS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C23= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[23]")));	    
    String CE23= C23.getAttribute("value");	
    Assert.assertTrue(CE23.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE23) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE23.matches("[0-9]+") && Long.parseLong(CE23)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 29) //Depreciation>Demo Vehicles>Total
    public void Depreciation_Demo_Vehicles_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp3= ce17+ce18+ce19+ce20+ce21+ce22+ce23;
    Assert.assertEquals(exp3,ce24);         
    }
//..................................................................................
	@Test(priority = 30) //Depreciation>Others>New Car  
    public void  Depreciation_Others_NewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C25= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[25]")));	    
    String CE25= C25.getAttribute("value");	
    Assert.assertTrue(CE25.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE25) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE25.matches("[0-9]+") && Long.parseLong(CE25)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 31) //Depreciation>Others>MSGA
    public void  Depreciation_Others_MSGA() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C26= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[26]")));	    
    String CE26= C26.getAttribute("value");	
    Assert.assertTrue(CE26.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE26) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE26.matches("[0-9]+") && Long.parseLong(CE26)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 32) //Depreciation>Others>Service
    public void  Depreciation_Others_Service() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C27= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[27]")));	    
    String CE27= C27.getAttribute("value");	
    Assert.assertTrue(CE27.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE27) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE27.matches("[0-9]+") && Long.parseLong(CE27)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 33) //Depreciation>Others>Spares
    public void  Depreciation_Others_Spares() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C28= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[28]")));	    
    String CE28= C28.getAttribute("value");	
    Assert.assertTrue(CE28.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE28) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE28.matches("[0-9]+") && Long.parseLong(CE28)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 34) //Depreciation>Others>True Value
    public void  Depreciation_Others_TrueValue() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C29= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[29]")));	    
    String CE29= C29.getAttribute("value");	
    Assert.assertTrue(CE29.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE29) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE29.matches("[0-9]+") && Long.parseLong(CE29)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 35) //Depreciation>Others>MI
    public void  Depreciation_Others_MI() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C30= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[30]")));	    
    String CE30= C30.getAttribute("value");	
    Assert.assertTrue(CE30.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE30) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE30.matches("[0-9]+") && Long.parseLong(CE30)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 36) //Depreciation>Others>MDS
    public void  Depreciation_Others_MDS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C31= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[31]")));	    
    String CE31= C31.getAttribute("value");	
    Assert.assertTrue(CE31.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE31) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE31.matches("[0-9]+") && Long.parseLong(CE31)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 37) //Depreciation>Others>Total
    public void Depreciation_Others_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp4= ce25+ce26+ce27+ce28+ce29+ce30+ce31;
    Assert.assertEquals(exp4,ce32);         
    }
//..................................................................................
	@Test(priority = 38) //Depreciation>New Car>Total
    public void NewCar_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp5= ce1+ce9+ce17+ce25;
    Assert.assertEquals(exp5,ce33);         
    }
//..................................................................................
	@Test(priority = 39) //Depreciation>MSGA>Total
    public void MSGA_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp6= ce2+ce10+ce18+ce26;
    Assert.assertEquals(exp6,ce34);         
    }
//..................................................................................
	@Test(priority = 40) //Depreciation>Service>Total
    public void Service_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp7= ce3+ce11+ce19+ce27;
    Assert.assertEquals(exp7,ce35);         
    }
//..................................................................................
	@Test(priority = 41) //Depreciation>Spares>Total
    public void Spares_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp8= ce4+ce12+ce20+ce28;
    Assert.assertEquals(exp8,ce36);         
    }
//..................................................................................
	@Test(priority = 42) //Depreciation>True Value>Total
    public void True_Value_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp9= ce5+ce13+ce21+ce29;
    Assert.assertEquals(exp9,ce37);         
    }
//..................................................................................
	@Test(priority = 43) //Depreciation>MI>Total
    public void MI_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp10= ce6+ce14+ce22+ce30;
    Assert.assertEquals(exp10,ce38);         
    }
//..................................................................................
	@Test(priority = 44) //Depreciation>MDS>Total
    public void MDS_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp11= ce7+ce15+ce23+ce31;
    Assert.assertEquals(exp11,ce39);         
    }
//..................................................................................
	@Test(priority = 45) //Depreciation>Total>Total
    public void Total_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp12= ce8+ce16+ce24+ce32;
    Assert.assertEquals(exp12,ce40);         
    }
//..................................................................................
	@Test(priority = 46) //Rent>Paid To Self> New Car
    public void  Rent_PaidToSelf_NewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C41= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[41]")));	    
    String CE41= C41.getAttribute("value");	
    Assert.assertTrue(CE41.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE41) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE41.matches("[0-9]+") && Long.parseLong(CE41)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 47) //Rent>Paid To Self> MSGA
    public void  Rent_PaidToSelf_MSGA() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C42= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[42]")));	    
    String CE42= C42.getAttribute("value");	
    Assert.assertTrue(CE42.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE42) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE42.matches("[0-9]+") && Long.parseLong(CE42)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 48) //Rent>Paid To Self> Service
    public void  Rent_PaidToSelf_Service() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C43= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[43]")));	    
    String CE43= C43.getAttribute("value");	
    Assert.assertTrue(CE43.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE43) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE43.matches("[0-9]+") && Long.parseLong(CE43)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 49) //Rent>Paid To Self> Spares
    public void  Rent_PaidToSelf_Spares() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C44= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[44]")));	    
    String CE44= C44.getAttribute("value");	
    Assert.assertTrue(CE44.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE44) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE44.matches("[0-9]+") && Long.parseLong(CE44)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 50) //Rent>Paid To Self> True Value
    public void  Rent_PaidToSelf_True_Value() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C45= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[45]")));	    
    String CE45= C45.getAttribute("value");	
    Assert.assertTrue(CE45.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE45) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE45.matches("[0-9]+") && Long.parseLong(CE45)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 51) //Rent>Paid To Self> MI
    public void  Rent_PaidToSelf_MI() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C46= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[46]")));	    
    String CE46= C46.getAttribute("value");	
    Assert.assertTrue(CE46.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE46) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE46.matches("[0-9]+") && Long.parseLong(CE46)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 52) //Rent>Paid To Self> MDS
    public void  Rent_PaidToSelf_MDS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C47= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[47]")));	    
    String CE47= C47.getAttribute("value");	
    Assert.assertTrue(CE47.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE47) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE47.matches("[0-9]+") && Long.parseLong(CE47)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 53) //Rent>Paid To Self> Others
    public void  Rent_PaidToSelf_Others() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C48= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[48]")));	    
    String CE48= C48.getAttribute("value");	
    Assert.assertTrue(CE48.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE48) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE48.matches("[0-9]+") && Long.parseLong(CE48)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 54) //Rent>Paid To Self>Total
    public void Rent_PaidToSelf_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp13= ce41+ce42+ce43+ce44+ce45+ce46+ce47+ce48;
    Assert.assertEquals(exp13,ce49);         
    }
//..................................................................................
	@Test(priority = 55) //Rent>Paid To Others> New Car
    public void  Rent_PaidToOthers_NewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C50= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[50]")));	    
    String CE50= C50.getAttribute("value");	
    Assert.assertTrue(CE50.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE50) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE50.matches("[0-9]+") && Long.parseLong(CE50)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 56) //Rent>Paid To Others> MSGA
    public void  Rent_PaidToOthers_MSGA() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C51= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[51]")));	    
    String CE51= C51.getAttribute("value");	
    Assert.assertTrue(CE51.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE51) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE51.matches("[0-9]+") && Long.parseLong(CE51)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 57) //Rent>Paid To Others> Service
    public void  Rent_PaidToOthers_Service() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C52= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[52]")));	    
    String CE52= C52.getAttribute("value");	
    Assert.assertTrue(CE52.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE52) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE52.matches("[0-9]+") && Long.parseLong(CE52)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 58) //Rent>Paid To Others> Spares
    public void  Rent_PaidToOthers_Spares() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C53= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[53]")));	    
    String CE53= C53.getAttribute("value");	
    Assert.assertTrue(CE53.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE53) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE53.matches("[0-9]+") && Long.parseLong(CE53)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 59) //Rent>Paid To Others> True Value
    public void  Rent_PaidToOthers_True_Value() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C54= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[54]")));	    
    String CE54= C54.getAttribute("value");	
    Assert.assertTrue(CE54.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE54) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE54.matches("[0-9]+") && Long.parseLong(CE54)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 60) //Rent>Paid To Others> MI
    public void  Rent_PaidToOthers_MI() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C55= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[55]")));	    
    String CE55= C55.getAttribute("value");	
    Assert.assertTrue(CE55.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE55) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE55.matches("[0-9]+") && Long.parseLong(CE55)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 61) //Rent>Paid To Others> MDS
    public void  Rent_PaidToOthers_MDS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C56= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[56]")));	    
    String CE56= C56.getAttribute("value");	
    Assert.assertTrue(CE56.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE56) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE56.matches("[0-9]+") && Long.parseLong(CE56)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 62) //Rent>Paid To Others> Others
    public void  Rent_PaidToOthers_Others() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C57= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[57]")));	    
    String CE57= C57.getAttribute("value");	
    Assert.assertTrue(CE57.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE57) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE57.matches("[0-9]+") && Long.parseLong(CE57)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 63) //Rent>Paid To Others>Total
    public void Rent_PaidToOthers_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp14= ce50+ce51+ce52+ce53+ce54+ce55+ce56+ce57;
    Assert.assertEquals(exp14,ce58);         
    }
//..................................................................................
	@Test(priority = 64) //Rent>New Car>Total
    public void Rent_New_Car_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp15= ce41+ce50;
    Assert.assertEquals(exp15,ce59);         
    }
//..................................................................................
	@Test(priority = 65) //Rent>MSGA>Total
    public void Rent_MSGA_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp16= ce42+ce51;
    Assert.assertEquals(exp16,ce60);         
    }
//..................................................................................
	@Test(priority = 66) //Rent>Service>Total
    public void Rent_Service_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp17= ce43+ce52;
    Assert.assertEquals(exp17,ce61);         
    }
//..................................................................................
	@Test(priority = 67) //Rent>Spares>Total
    public void Rent_Spares_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp18= ce44+ce53;
    Assert.assertEquals(exp18,ce62);         
    }
//..................................................................................
	@Test(priority = 68) //Rent>True Value>Total
    public void Rent_TrueValue_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp19= ce45+ce54;
    Assert.assertEquals(exp19,ce63);         
    }
//..................................................................................
	@Test(priority = 69) //Rent>MI>Total
    public void Rent_MI_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp20= ce46+ce55;
    Assert.assertEquals(exp20,ce64);         
    }
//..................................................................................
	@Test(priority = 70) //Rent>MDS>Total
    public void Rent_MDS_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp21= ce47+ce56;
    Assert.assertEquals(exp21,ce65);         
    }
//..................................................................................
	@Test(priority = 71) //Rent>Others>Total
    public void Rent_Others_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp22= ce48+ce57;
    Assert.assertEquals(exp22,ce66);         
    }
//..................................................................................
	@Test(priority = 72) //Rent>Total>Total
    public void Rent_Total_Total() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp23= ce49+ce58;
    Assert.assertEquals(exp23,ce67);         
    }
//..................................................................................
    @Test(priority = 73)
    public void ClickOn_OtherExpense_Tab() throws InterruptedException {
    Thread.sleep(1000);
    Actions A= new Actions(driver);
    A.sendKeys(Keys.PAGE_UP).perform(); //scroll up
    Thread.sleep(1000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement CE= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"button\"])[2]")));
    CE.click();
    Thread.sleep(4000);
    
    //Elements of Other Expense
    WebElement c68= driver.findElement(By.xpath("(//*[@type=\"text\"])[68]"));
    WebElement c69= driver.findElement(By.xpath("(//*[@type=\"text\"])[69]"));
    WebElement c70= driver.findElement(By.xpath("(//*[@type=\"text\"])[70]"));
    WebElement c71= driver.findElement(By.xpath("(//*[@type=\"text\"])[71]"));
    WebElement c72= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));
    WebElement c73= driver.findElement(By.xpath("(//*[@type=\"text\"])[73]"));
    WebElement c74= driver.findElement(By.xpath("(//*[@type=\"text\"])[74]"));
    WebElement c75= driver.findElement(By.xpath("(//*[@type=\"text\"])[75]"));
    WebElement c76= driver.findElement(By.xpath("(//*[@type=\"text\"])[76]"));
    WebElement c77= driver.findElement(By.xpath("(//*[@type=\"text\"])[77]"));
    WebElement c78= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]"));
    WebElement c79= driver.findElement(By.xpath("(//*[@type=\"text\"])[79]"));
    WebElement c80= driver.findElement(By.xpath("(//*[@type=\"text\"])[80]"));
    WebElement c81= driver.findElement(By.xpath("(//*[@type=\"text\"])[81]"));
    WebElement c82= driver.findElement(By.xpath("(//*[@type=\"text\"])[82]"));
    WebElement c83= driver.findElement(By.xpath("(//*[@type=\"text\"])[83]"));
    WebElement c84= driver.findElement(By.xpath("(//*[@type=\"text\"])[84]"));
    WebElement c85= driver.findElement(By.xpath("(//*[@type=\"text\"])[85]"));
    WebElement c86= driver.findElement(By.xpath("(//*[@type=\"text\"])[86]"));
    WebElement c87= driver.findElement(By.xpath("(//*[@type=\"text\"])[87]"));
    WebElement c88= driver.findElement(By.xpath("(//*[@type=\"text\"])[88]"));
    WebElement c89= driver.findElement(By.xpath("(//*[@type=\"text\"])[89]"));
    WebElement c90= driver.findElement(By.xpath("(//*[@type=\"text\"])[90]"));
    WebElement c91= driver.findElement(By.xpath("(//*[@type=\"text\"])[91]"));
    WebElement c92= driver.findElement(By.xpath("(//*[@type=\"text\"])[92]"));
    WebElement c93= driver.findElement(By.xpath("(//*[@type=\"text\"])[93]"));
    WebElement c94= driver.findElement(By.xpath("(//*[@type=\"text\"])[94]"));
    WebElement c95= driver.findElement(By.xpath("(//*[@type=\"text\"])[95]"));
    WebElement c96= driver.findElement(By.xpath("(//*[@type=\"text\"])[96]"));
    WebElement c97= driver.findElement(By.xpath("(//*[@type=\"text\"])[97]"));
    WebElement c98= driver.findElement(By.xpath("(//*[@type=\"text\"])[98]"));
    WebElement c99= driver.findElement(By.xpath("(//*[@type=\"text\"])[99]"));
    WebElement c100= driver.findElement(By.xpath("(//*[@type=\"text\"])[100]"));
    WebElement c101= driver.findElement(By.xpath("(//*[@type=\"text\"])[101]"));
    WebElement c102= driver.findElement(By.xpath("(//*[@type=\"text\"])[102]"));
    WebElement c103= driver.findElement(By.xpath("(//*[@type=\"text\"])[103]"));
    WebElement c104= driver.findElement(By.xpath("(//*[@type=\"text\"])[104]"));
    WebElement c105= driver.findElement(By.xpath("(//*[@type=\"text\"])[105]"));
    WebElement c106= driver.findElement(By.xpath("(//*[@type=\"text\"])[106]"));
    WebElement c107= driver.findElement(By.xpath("(//*[@type=\"text\"])[107]"));
    WebElement c108= driver.findElement(By.xpath("(//*[@type=\"text\"])[108]"));
    WebElement c109= driver.findElement(By.xpath("(//*[@type=\"text\"])[109]"));
    WebElement c110= driver.findElement(By.xpath("(//*[@type=\"text\"])[110]"));
    WebElement c111= driver.findElement(By.xpath("(//*[@type=\"text\"])[111]"));
    WebElement c112= driver.findElement(By.xpath("(//*[@type=\"text\"])[112]"));
    WebElement c113= driver.findElement(By.xpath("(//*[@type=\"text\"])[113]"));
    WebElement c114= driver.findElement(By.xpath("(//*[@type=\"text\"])[114]"));
    WebElement c115= driver.findElement(By.xpath("(//*[@type=\"text\"])[115]"));
    WebElement c116= driver.findElement(By.xpath("(//*[@type=\"text\"])[116]"));
    WebElement c117= driver.findElement(By.xpath("(//*[@type=\"text\"])[117]"));	     
    WebElement c120= driver.findElement(By.xpath("(//*[@type=\"text\"])[120]"));
    WebElement c121= driver.findElement(By.xpath("(//*[@type=\"text\"])[121]"));
    WebElement c122= driver.findElement(By.xpath("(//*[@type=\"text\"])[122]"));
    WebElement c123= driver.findElement(By.xpath("(//*[@type=\"text\"])[123]"));
    
    //send values for depreciation and rent
    Thread.sleep(2000);
    c82.sendKeys("-M8665367.");
    c84.sendKeys("-Z5166567.");
    c86.sendKeys("-D1198567.");
    c88.sendKeys("-S6866567.");
    c90.sendKeys("-d9864567.");
    c92.sendKeys("-f2196567.");
    c94.sendKeys("-y5198667.");	     
    c96.sendKeys("-t6198667.");
    c98.sendKeys("-y7198665.");
    c100.sendKeys("-i8198667.");
    c102.sendKeys("-q9198665.");
    c104.sendKeys("-o3198667.");
    c106.sendKeys("-g3198667.");
    c108.sendKeys("-d4198667.");
    c110.sendKeys("-h5198667.");
    c112.sendKeys("-j6198667.");
    c114.sendKeys("-h7198667.");
    c116.sendKeys("-d1298667.");     
//.........................................................................................................................................	
	//convert to long
    Thread.sleep(2000);
     ce68= Long.parseLong(c68.getAttribute("value"));
     ce69= Long.parseLong(c69.getAttribute("value"));
     ce70= Long.parseLong(c70.getAttribute("value"));
     ce71= Long.parseLong(c71.getAttribute("value"));
     ce72= Long.parseLong(c72.getAttribute("value"));
     ce73= Long.parseLong(c73.getAttribute("value"));
     ce74= Long.parseLong(c74.getAttribute("value"));
     ce75= Long.parseLong(c75.getAttribute("value"));
     ce76= Long.parseLong(c76.getAttribute("value"));
     ce77= Long.parseLong(c77.getAttribute("value"));
     ce78= Long.parseLong(c78.getAttribute("value"));
     ce79= Long.parseLong(c79.getAttribute("value"));
     ce80= Long.parseLong(c80.getAttribute("value"));
     ce81= Long.parseLong(c81.getAttribute("value"));
     ce82= Long.parseLong(c82.getAttribute("value"));
     ce83= Long.parseLong(c83.getAttribute("value"));
     ce84= Long.parseLong(c84.getAttribute("value"));
     ce85= Long.parseLong(c85.getAttribute("value"));
     ce86= Long.parseLong(c86.getAttribute("value"));
     ce87= Long.parseLong(c87.getAttribute("value"));
     ce88= Long.parseLong(c88.getAttribute("value"));
     ce89= Long.parseLong(c89.getAttribute("value"));
     ce90= Long.parseLong(c90.getAttribute("value"));
     ce91= Long.parseLong(c91.getAttribute("value"));
     ce92= Long.parseLong(c92.getAttribute("value"));
     ce93= Long.parseLong(c93.getAttribute("value"));
     ce94= Long.parseLong(c94.getAttribute("value"));
     ce95= Long.parseLong(c95.getAttribute("value"));
     ce96= Long.parseLong(c96.getAttribute("value"));
     ce97= Long.parseLong(c97.getAttribute("value"));
     ce98= Long.parseLong(c98.getAttribute("value"));
     ce99= Long.parseLong(c99.getAttribute("value"));
     ce100= Long.parseLong(c100.getAttribute("value"));
     ce101= Long.parseLong(c101.getAttribute("value"));
     ce102= Long.parseLong(c102.getAttribute("value"));
     ce103= Long.parseLong(c103.getAttribute("value"));
     ce104= Long.parseLong(c104.getAttribute("value"));
     ce105= Long.parseLong(c105.getAttribute("value"));
     ce106= Long.parseLong(c106.getAttribute("value"));
     ce107= Long.parseLong(c107.getAttribute("value"));
     ce108= Long.parseLong(c108.getAttribute("value"));
     ce109= Long.parseLong(c109.getAttribute("value"));
     ce110= Long.parseLong(c110.getAttribute("value"));
     ce111= Long.parseLong(c111.getAttribute("value"));
     ce112= Long.parseLong(c112.getAttribute("value"));
     ce113= Long.parseLong(c113.getAttribute("value"));
     ce114= Long.parseLong(c114.getAttribute("value"));
     ce115= Long.parseLong(c115.getAttribute("value"));
     ce116= Long.parseLong(c116.getAttribute("value"));
     ce117= Long.parseLong(c117.getAttribute("value"));
     ce120= Long.parseLong(c120.getAttribute("value"));
     ce121= Long.parseLong(c121.getAttribute("value"));
     ce122= Long.parseLong(c122.getAttribute("value"));
     ce123= Long.parseLong(c123.getAttribute("value"));
	}   
//......................................................................................................................................................
    @Test (priority=74) //save data
    public void Save_Data_Other_Expense() throws InterruptedException {
	Thread.sleep(2000);
	Actions A= new Actions(driver);
	A.sendKeys(Keys.PAGE_DOWN).perform(); //scroll up	
    Thread.sleep(1000);	           
    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();     
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    Thread.sleep(2000);
    
	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
	Thread.sleep(2000);
	String actualMessage = Validationmessage.getText();  
    System.out.println("Save Data Message  =" +actualMessage);
	String expectedMessage = "Saved Successfully";
	Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
	Thread.sleep(2000);
    }   
//.................................................................................................................    	
	
	@Test(priority = 75) //Other Expense- Back Office Salary
    public void  OtherExpense_Back_Office_Salary() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(ce68, mp1);            
    }
//..................................................................................
	@Test(priority = 76) //Back Office Salary>Per New Car
    public void Back_Office_Salary_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp24= ce68/nc1;
  	long roundexp24= Math.round(exp24);
    Assert.assertEquals(roundexp24,ce69);         
    }
//..................................................................................
	@Test(priority = 77) //Other Expense- Long term Interest Cost
    public void  OtherExpense_Long_term_InterestCost() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(ce70, ic1);            
    }
//..................................................................................
	@Test(priority = 78) //Long term Interest Cost>Per New Car
    public void Long_term_InterestCost_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp25= ce70/nc1;
  	long roundexp25= Math.round(exp25);
    Assert.assertEquals(roundexp25,ce71);         
    }
//..................................................................................
	@Test(priority = 79) //Other Expense- Building (Depreciation)
    public void  OtherExpense_Building_Depreciation() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(ce8, ce72);            
    }
//..................................................................................
	@Test(priority = 80) //Building (Depreciation)>Per New Car
    public void OtherExpense_BuildingDepreciation_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp26= ce72/nc1;
  	long roundexp26= Math.round(exp26);
    Assert.assertEquals(roundexp26,ce73);         
    }
//..................................................................................
	@Test(priority = 81) //Other Expense- Plant & Machinery (Depreciation)
    public void  OtherExpense_PlantMachinery_Depreciation() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(ce16, ce74);            
    }
//..................................................................................
	@Test(priority = 82) //Plant & Machinery (Depreciation)>Per New Car
    public void OtherExpense_PlantMachinery_Depreciation_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp27= ce74/nc1;
  	long roundexp27= Math.round(exp27);
    Assert.assertEquals(roundexp27,ce75);         
    }
//..................................................................................
	@Test(priority = 83) //Other Expense- Demo Vehicles (Depreciation)
    public void  OtherExpense_DemoVehicles_Depreciation() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(ce24, ce76);            
    }
//..................................................................................
	@Test(priority = 84) //Demo Vehicles (Depreciation)>Per New Car
    public void OtherExpense_DemoVehicles_Depreciation_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp28= ce76/nc1;
  	long roundexp28= Math.round(exp28);
    Assert.assertEquals(roundexp28,ce77);         
    }
//..................................................................................
	@Test(priority = 85) //Others Expense- Others (Depreciation)
    public void  OtherExpense_Others_Depreciation() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(ce32, ce78);            
    }
//..................................................................................
	@Test(priority = 86) //Others (Depreciation)>Per New Car
    public void OtherExpense_Others_Depreciation_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp29= ce78/nc1;
  	long roundexp29= Math.round(exp29);
    Assert.assertEquals(roundexp29,ce79);         
    }
//..................................................................................
	@Test(priority = 87) //Others Expense- Rent
    public void  OtherExpense_Rent() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(ce67, ce80);            
    }
//..................................................................................
	@Test(priority = 88) //Rent>Per New Car
    public void OtherExpense_Rent_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp30= ce80/nc1;
  	long roundexp30= Math.round(exp30);
    Assert.assertEquals(roundexp30,ce81);         
    }
//..................................................................................
	@Test(priority = 89) //Other Expense> Repair Maintenance
    public void  OtherExpense_Repair_Maintenance() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C82= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[82]")));	    
    String CE82= C82.getAttribute("value");	
    Assert.assertTrue(CE82.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE82) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE82.matches("[0-9]+") && Long.parseLong(CE82)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 90) //Repair Maintenance>Per New Car
    public void OtherExpense_RepairMaintenance_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp31= ce82/nc1;
  	long roundexp31= Math.round(exp31);
    Assert.assertEquals(roundexp31,ce83);         
    }
//..................................................................................
	@Test(priority = 91) //Other Expense> Director Promoter Renumeration
    public void  OtherExpense_Director_Promoter_Renumeration() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C84= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[84]")));	    
    String CE84= C84.getAttribute("value");	
    Assert.assertTrue(CE84.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE84) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE84.matches("[0-9]+") && Long.parseLong(CE84)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 92) //Director Promoter Renumeration >Per New Car
    public void OtherExpense_Director_Promoter_Renumeration_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp32= ce84/nc1;
  	long roundexp32= Math.round(exp32);
    Assert.assertEquals(roundexp32,ce85);         
    }
//..................................................................................
	@Test(priority = 93) //Other Expense> Staff Welfare Expenses 
    public void  OtherExpense_Staff_Welfare_Expenses () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C86= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[86]")));	    
    String CE86= C86.getAttribute("value");	
    Assert.assertTrue(CE86.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE86) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE86.matches("[0-9]+") && Long.parseLong(CE86)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 94) //Staff Welfare Expenses >Per New Car
    public void OtherExpense_Staff_Welfare_Expenses_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp33= ce86/nc1;
  	long roundexp33= Math.round(exp33);
    Assert.assertEquals(roundexp33,ce87);         
    }
//..................................................................................
	@Test(priority = 95) //Other Expense> Utilities  
    public void  OtherExpense_Utilities  () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C88= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[88]")));	    
    String CE88= C88.getAttribute("value");	
    Assert.assertTrue(CE88.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE88) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE88.matches("[0-9]+") && Long.parseLong(CE88)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 96) //Utilities >Per New Car
    public void OtherExpense_Utilities_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp34= ce88/nc1;
  	long roundexp34= Math.round(exp34);
    Assert.assertEquals(roundexp34,ce89);         
    }
//..................................................................................
	@Test(priority = 97) //Other Expense> Securities & Guards  
    public void  OtherExpense_Securities_Guards  () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C90= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[90]")));	    
    String CE90= C90.getAttribute("value");	
    Assert.assertTrue(CE90.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE90) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE90.matches("[0-9]+") && Long.parseLong(CE90)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 98) //Securities & Guards >Per New Car
    public void OtherExpense_Securities_Guards_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp35= ce90/nc1;
  	long roundexp35= Math.round(exp35);
    Assert.assertEquals(roundexp35,ce91);         
    }
//..................................................................................
	@Test(priority = 99) //Other Expense> Housekeeping & Pantry  
    public void  OtherExpense_Housekeeping_Pantry  () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C92= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[92]")));	    
    String CE92= C92.getAttribute("value");	
    Assert.assertTrue(CE92.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE92) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE92.matches("[0-9]+") && Long.parseLong(CE92)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 100) //Housekeeping & Pantry >Per New Car
    public void OtherExpense_Housekeeping_Pantry_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp36= ce92/nc1;
  	long roundexp36= Math.round(exp36);
    Assert.assertEquals(roundexp36,ce93);         
    }
//..................................................................................
	@Test(priority = 101) //Other Expense> Conveyance/Travelling expense  
    public void  OtherExpense_Conveyance_Travelling_expense  () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C94= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[94]")));	    
    String CE94= C94.getAttribute("value");	
    Assert.assertTrue(CE94.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE94) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE94.matches("[0-9]+") && Long.parseLong(CE94)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 102) //Conveyance/Travelling expense >Per New Car
    public void OtherExpense_Conveyance_Travelling_expense_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp37= ce94/nc1;
  	long roundexp37= Math.round(exp37);
    Assert.assertEquals(roundexp37,ce95);         
    }
//..................................................................................
	@Test(priority = 103) //Other Expense> Fuel Expense  
    public void  OtherExpense_Fuel_Expense  () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C96= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[96]")));	    
    String CE96= C96.getAttribute("value");	
    Assert.assertTrue(CE96.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE96) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE96.matches("[0-9]+") && Long.parseLong(CE96)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 104) //Fuel Expense >Per New Car
    public void OtherExpense_Fuel_Expense_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp38= ce96/nc1;
  	long roundexp38= Math.round(exp38);
    Assert.assertEquals(roundexp38,ce97);         
    }
//..................................................................................
	@Test(priority = 105) //Other Expense> Professional Charge   
    public void  OtherExpense_Professional_Charge   () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C98= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[98]")));	    
    String CE98= C98.getAttribute("value");	
    Assert.assertTrue(CE98.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE98) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE98.matches("[0-9]+") && Long.parseLong(CE98)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 106) //Professional Charge >Per New Car
    public void OtherExpense_Professional_Charge_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp39= ce98/nc1;
  	long roundexp39= Math.round(exp39);
    Assert.assertEquals(roundexp39,ce99);         
    }
//..................................................................................
	@Test(priority = 107) //Other Expense>Insurance   
    public void  OtherExpense_Insurance   () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C100= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[100]")));	    
    String CE100= C100.getAttribute("value");	
    Assert.assertTrue(CE100.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE100) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE100.matches("[0-9]+") && Long.parseLong(CE100)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 108) //Insurance >Per New Car
    public void OtherExpense_Insurance_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp40= ce100/nc1;
  	long roundexp40= Math.round(exp40);
    Assert.assertEquals(roundexp40,ce101);         
    }
//..................................................................................
	@Test(priority = 109) //Other Expense>Printing & Stationary   
    public void  OtherExpense_Printing_Stationary   () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C102= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[102]")));	    
    String CE102= C102.getAttribute("value");	
    Assert.assertTrue(CE102.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE102) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE102.matches("[0-9]+") && Long.parseLong(CE102)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 110) //Printing & Stationary >Per New Car
    public void OtherExpense_Printing_Stationary_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp41= ce102/nc1;
  	long roundexp41= Math.round(exp41);
    Assert.assertEquals(roundexp41,ce103);         
    }
//..................................................................................
	@Test(priority = 111) //Other Expense>Telephone/Mobile  
    public void  OtherExpense_Telephone_Mobile() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C104= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[104]")));	    
    String CE104= C104.getAttribute("value");	
    Assert.assertTrue(CE104.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE104) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE104.matches("[0-9]+") && Long.parseLong(CE104)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 112) //Telephone/Mobile >Per New Car
    public void OtherExpense_Telephone_Mobile_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp42= ce104/nc1;
  	long roundexp42= Math.round(exp42);
    Assert.assertEquals(roundexp42,ce105);         
    }
//..................................................................................
	@Test(priority = 113) //Other Expense>Local/Municipal Taxes  
    public void  OtherExpense_Local_Municipal_Taxes() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C106= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[106]")));	    
    String CE106= C106.getAttribute("value");	
    Assert.assertTrue(CE106.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE106) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE106.matches("[0-9]+") && Long.parseLong(CE106)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 114) //Local/Municipal Taxes >Per New Car
    public void OtherExpense_Local_Municipal_Taxes_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp43= ce106/nc1;
  	long roundexp43= Math.round(exp43);
    Assert.assertEquals(roundexp43,ce107);         
    }
//..................................................................................
	@Test(priority = 115) //Other Expense>Training  
    public void  OtherExpense_Training() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C108= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[108]")));	    
    String CE108= C108.getAttribute("value");	
    Assert.assertTrue(CE108.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE108) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE108.matches("[0-9]+") && Long.parseLong(CE108)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 116) //Training>Per New Car
    public void OtherExpense_Training_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp44= ce108/nc1;
  	long roundexp44= Math.round(exp44);
    Assert.assertEquals(roundexp44,ce109);         
    }
//..................................................................................
	@Test(priority = 117) //Other Expense>EDP Charges  
    public void  OtherExpense_EDP_Charges() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C110= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[110]")));	    
    String CE110= C110.getAttribute("value");	
    Assert.assertTrue(CE110.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE110) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE110.matches("[0-9]+") && Long.parseLong(CE110)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 118) //EDP Charges>Per New Car
    public void OtherExpense_EDP_Charges_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp45= ce110/nc1;
  	long roundexp45= Math.round(exp45);
    Assert.assertEquals(roundexp45,ce111);         
    }
//..................................................................................
	@Test(priority = 119) //Other Expense>Freight & Cartage  
    public void  OtherExpense_Freight_Cartage() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C112= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[112]")));	    
    String CE112= C112.getAttribute("value");	
    Assert.assertTrue(CE112.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE112) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE112.matches("[0-9]+") && Long.parseLong(CE112)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 120) //Freight & Cartage>Per New Car
    public void OtherExpense_Freight_Cartage_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp46= ce112/nc1;
  	long roundexp46= Math.round(exp46);
    Assert.assertEquals(roundexp46,ce113);         
    }
//..................................................................................
	@Test(priority = 121) //Other Expense>Internet/Connectivity Charges/Lease Line/Wifi  
    public void  OtherExpense_Internet_Connectivity_Charges_Lease_Line_Wifi() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C114= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[114]")));	    
    String CE114= C114.getAttribute("value");	
    Assert.assertTrue(CE114.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE114) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE114.matches("[0-9]+") && Long.parseLong(CE114)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 122) //Internet/Connectivity Charges/Lease Line/Wifi>Per New Car
    public void OtherExpense_Internet_Connectivity_Charges_Lease_Line_Wifi_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp47= ce114/nc1;
  	long roundexp47= Math.round(exp47);
    Assert.assertEquals(roundexp47,ce115);         
    }
//..................................................................................
	@Test(priority = 123) //Other Expense>Others  
    public void  OtherExpense_Others() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement C116= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[116]")));	    
    String CE116= C116.getAttribute("value");	
    Assert.assertTrue(CE116.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(CE116) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(CE116.matches("[0-9]+") && Long.parseLong(CE116)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 124) //Others>Per New Car
    public void OtherExpense_Others_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp48= ce116/nc1;
  	long roundexp48= Math.round(exp48);
    Assert.assertEquals(roundexp48,ce117);         
    }
//..................................................................................
	@Test(priority = 125) //Others Expense>Total Common Expenses
    public void OtherExpense_Total_Common_Expenses() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp49= ce68+ce70+ce72+ce74+ce76+ce78+ce80+ce82+ce84+ce86
		    +ce88+ce90+ce92+ce94+ce96+ce98+ce100+ce102+ce104+
		    ce106+ce108+ce110+ce112+ce114+ce116;
    Assert.assertEquals(exp49,ce120);         
    }
//..................................................................................
	@Test(priority = 126) //Total Common Expenses>Per New Car
    public void OtherExpense_Total_Common_Expenses_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp50= ce120/nc1;
  	long roundexp50= Math.round(exp50);
    Assert.assertEquals(roundexp50,ce121);         
    }
//..................................................................................
	@Test(priority = 127) //Others Expense>Total Overheads
    public void OtherExpense_Total_Overheads() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	long exp51= ce82+ce84+ce86+ce88+ce90+ce92+ce94+ce96+ce98+ce100+ce102+ce104+
		    ce106+ce108+ce110+ce112+ce114+ce116;
    Assert.assertEquals(exp51,ce122);         
    }
//..................................................................................
	@Test(priority = 128) //Total Overheads>Per New Car
    public void OtherExpense_Total_Overheads_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp52= ce122/nc1;
  	long roundexp52= Math.round(exp52);
    Assert.assertEquals(roundexp52,ce123);         
    }
//..................................................................................
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	
	
}
