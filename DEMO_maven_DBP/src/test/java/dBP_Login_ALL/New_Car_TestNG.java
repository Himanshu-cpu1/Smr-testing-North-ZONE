package dBP_Login_ALL;

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

public class New_Car_TestNG  {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	double nc1;
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
	long nc24;
	long nc25;
	long nc26;
	long nc27;
	long nc28;
	long nc29;
	long nc30;
	long nc31;
	long nc32;
	long nc33;
	long nc34;
	long nc35;
	long nc36;
	long nc37;
	long nc38;
	long nc39;
	long nc40;
	long nc41;
	long nc42;
	long nc43;
	long nc44;
	long nc45;
	long nc46;
	long nc47;
	long nc49;
	long nc50;
	long nc51;
	long nc52;
	long nc53;
	long nc54;
	long nc55;
	long nc56;
	long nc57;
	long nc58;
	long nc59;
	long nc60;
	long nc61;
	long nc62;
	long nc63;
	long nc64;
	long nc65;
	long nc66;
	long nc67;
	long nc68;
	long nc69;
	long nc70;	
	long nc72;
	long nc73;	
	long nc75;
	long nc76;	
	long nc78;
	long nc79;
	long st1;
	long st2;
	long st3;
	long st4;
	long st5;
	long mp1;
	long ic1;

	@SuppressWarnings({ "static-access" })
	@BeforeClass
	public void ManpowerCount() throws InterruptedException {
	Thread.sleep(3000);
	//...................................................................................    	
	   this.driver=ManpowerCost_TestNG.driver;   // call the login page 	
//...................................................................................................................................................	
	//click on New Car option
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();        
	Thread.sleep(3000);
	}
//............................................................................................
	@Test(priority=0)     // clear the data
	public void Clear_Data() throws InterruptedException {
	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
	Thread.sleep(2000);
	    
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
	String actualMessage = Validationmessage.getText();
		   
	System.out.println("Clear data Message  =" +actualMessage);
	String expectedMessage = "Cleared Successfully";
	Thread.sleep(3000);
	Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
//..................................................................................................................	
    //Elements of New Car- Income
	WebElement n1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); //Quantity auto populate from stock		
	WebElement n2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")); //amount auto populate from stock
	WebElement n3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")); //amount auto populate from stock
	WebElement n4= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")); 
	WebElement n5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")); //amount auto populate from stock
	WebElement n6= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
	WebElement n7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
	WebElement n8= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
	WebElement n9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
	WebElement n10= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
	WebElement n11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
	WebElement n12= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
	WebElement n13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
	WebElement n14= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
	WebElement n15= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
	WebElement n16= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
	WebElement n17= driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
	WebElement n18= driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
	WebElement n19= driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
	WebElement n20= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
	WebElement n21= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
	WebElement n22= driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
	WebElement n23= driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
	WebElement n24= driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
	WebElement n25= driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
	WebElement n26= driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
	WebElement n27= driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
	WebElement n28= driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
	WebElement n29= driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
	WebElement n30= driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
	WebElement n31= driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
	WebElement n32= driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
	WebElement n33= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
	WebElement n34= driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
	WebElement n35= driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
	WebElement n36= driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
	WebElement n37= driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
	WebElement n38= driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
	WebElement n39= driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
	WebElement n40= driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
	WebElement n41= driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
	WebElement n42= driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
	WebElement n43= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
	WebElement n44= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
	WebElement n45= driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
	WebElement n46= driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
	WebElement n47= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));		
	//Elements of New Car- Expense
	WebElement n49= driver.findElement(By.xpath("(//*[@type=\"text\"])[49]"));
	WebElement n50= driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
	WebElement n51= driver.findElement(By.xpath("(//*[@type=\"text\"])[51]"));
	WebElement n52= driver.findElement(By.xpath("(//*[@type=\"text\"])[52]"));
	WebElement n53= driver.findElement(By.xpath("(//*[@type=\"text\"])[53]"));
	WebElement n54= driver.findElement(By.xpath("(//*[@type=\"text\"])[54]"));
	WebElement n55= driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
	WebElement n56= driver.findElement(By.xpath("(//*[@type=\"text\"])[56]"));
	WebElement n57= driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
	WebElement n58= driver.findElement(By.xpath("(//*[@type=\"text\"])[58]"));
	WebElement n59= driver.findElement(By.xpath("(//*[@type=\"text\"])[59]"));
	WebElement n60= driver.findElement(By.xpath("(//*[@type=\"text\"])[60]"));
	WebElement n61= driver.findElement(By.xpath("(//*[@type=\"text\"])[61]"));
	WebElement n62= driver.findElement(By.xpath("(//*[@type=\"text\"])[62]"));
	WebElement n63= driver.findElement(By.xpath("(//*[@type=\"text\"])[63]"));
	WebElement n64= driver.findElement(By.xpath("(//*[@type=\"text\"])[64]"));
	WebElement n65= driver.findElement(By.xpath("(//*[@type=\"text\"])[65]"));
	WebElement n66= driver.findElement(By.xpath("(//*[@type=\"text\"])[66]"));
	WebElement n67= driver.findElement(By.xpath("(//*[@type=\"text\"])[67]"));
	WebElement n68= driver.findElement(By.xpath("(//*[@type=\"text\"])[68]"));
	WebElement n69= driver.findElement(By.xpath("(//*[@type=\"text\"])[69]"));
	WebElement n70= driver.findElement(By.xpath("(//*[@type=\"text\"])[70]"));
	//Elements of New Car- Total Tab.
	WebElement n72= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));  //total new car income
	WebElement n73= driver.findElement(By.xpath("(//*[@type=\"text\"])[73]")); //per new car of [72]	
	WebElement n75= driver.findElement(By.xpath("(//*[@type=\"text\"])[75]"));
	WebElement n76= driver.findElement(By.xpath("(//*[@type=\"text\"])[76]"));
	WebElement n78= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]")); //total new car expense
	WebElement n79= driver.findElement(By.xpath("(//*[@type=\"text\"])[79]")); //per new car of [78]	
//.............................................................................................................			
	//send values
	Thread.sleep(3000);
	n7.sendKeys("-R5000909.");
	n9.sendKeys("-U4009894.");
	n11.sendKeys("-Op4008797.");
	n13.sendKeys("-Op4007897.");
	n15.sendKeys("-Op4009897.");
	n17.sendKeys("-Op4004564.");
	n19.sendKeys("-f4004567.");
	n21.sendKeys("-f4007659.");
	n23.sendKeys("-f4009866.");
	n25.sendKeys("-f4007654.");
	n26.sendKeys("-f4007467.");
	n28.sendKeys("-f4006487.");
	n29.sendKeys("-f9008965.");
	n31.sendKeys("-f40037864.");
	n32.sendKeys("-f4008856.");
	n34.sendKeys("-f9006786.");
	n35.sendKeys("-f40038787.");
	n37.sendKeys("-f4007777.");
	n38.sendKeys("-f90039999.");
	n40.sendKeys("-f4004343.");
	n42.sendKeys("-f4003333.");
	n44.sendKeys("-f3233232.");
	n46.sendKeys("-f4001313.");
	n55.sendKeys("-f500789.");
	n57.sendKeys("-f-f400987.");
	n59.sendKeys("z-400877.");
	n61.sendKeys("-f400878.");
	n63.sendKeys("-f400765.");
	n65.sendKeys("-f400675.");
	n67.sendKeys("-f700786.");
	n69.sendKeys("-f400333.");
//...........................................................................................................	
	Thread.sleep(3000);
	//convert into integers
	nc1= Double.parseDouble(n1.getAttribute("value"));	
	nc2= Long.parseLong(n2.getAttribute("value"));
	nc3= Long.parseLong(n3.getAttribute("value"));
	nc4= Long.parseLong(n4.getAttribute("value"));
	nc5= Long.parseLong(n5.getAttribute("value"));	
	nc6= Long.parseLong(n6.getAttribute("value"));
	nc7= Long.parseLong(n7.getAttribute("value"));
	nc8= Long.parseLong(n8.getAttribute("value"));
	nc9= Long.parseLong(n9.getAttribute("value"));	
	nc10= Long.parseLong(n10.getAttribute("value"));
	nc11= Long.parseLong(n11.getAttribute("value"));
	nc12= Long.parseLong(n12.getAttribute("value"));
	nc13= Long.parseLong(n13.getAttribute("value"));
	nc14= Long.parseLong(n14.getAttribute("value"));
	nc15= Long.parseLong(n15.getAttribute("value"));
	nc16= Long.parseLong(n16.getAttribute("value"));
	nc17= Long.parseLong(n17.getAttribute("value"));
	nc18= Long.parseLong(n18.getAttribute("value"));
	nc19= Long.parseLong(n19.getAttribute("value"));
	nc20= Long.parseLong(n20.getAttribute("value"));
	nc21= Long.parseLong(n21.getAttribute("value"));
	nc22= Long.parseLong(n22.getAttribute("value"));
	nc23= Long.parseLong(n23.getAttribute("value"));
	nc24= Long.parseLong(n24.getAttribute("value"));
	nc25= Long.parseLong(n25.getAttribute("value"));
	nc26= Long.parseLong(n26.getAttribute("value"));
	nc27= Long.parseLong(n27.getAttribute("value"));
	nc28= Long.parseLong(n28.getAttribute("value"));
	nc29= Long.parseLong(n29.getAttribute("value"));
	nc30= Long.parseLong(n30.getAttribute("value"));
	nc31= Long.parseLong(n31.getAttribute("value"));
	nc32= Long.parseLong(n32.getAttribute("value"));
	nc33= Long.parseLong(n33.getAttribute("value"));
	nc34= Long.parseLong(n34.getAttribute("value"));
	nc35= Long.parseLong(n35.getAttribute("value"));
	nc36= Long.parseLong(n36.getAttribute("value"));
	nc37= Long.parseLong(n37.getAttribute("value"));
	nc38= Long.parseLong(n38.getAttribute("value"));
	nc39= Long.parseLong(n39.getAttribute("value"));
	nc40= Long.parseLong(n40.getAttribute("value"));
	nc41= Long.parseLong(n41.getAttribute("value"));
	nc42= Long.parseLong(n42.getAttribute("value"));
	nc43= Long.parseLong(n43.getAttribute("value"));
	nc44= Long.parseLong(n44.getAttribute("value"));
	nc45= Long.parseLong(n45.getAttribute("value"));
	nc46= Long.parseLong(n46.getAttribute("value"));
	nc47= Long.parseLong(n47.getAttribute("value"));
	nc49= Long.parseLong(n49.getAttribute("value"));
	nc50= Long.parseLong(n50.getAttribute("value"));	 		
	nc51= Long.parseLong(n51.getAttribute("value"));
	nc52= Long.parseLong(n52.getAttribute("value"));
	nc53= Long.parseLong(n53.getAttribute("value"));
	nc54= Long.parseLong(n54.getAttribute("value"));
	nc55= Long.parseLong(n55.getAttribute("value"));
	nc56= Long.parseLong(n56.getAttribute("value"));
	nc57= Long.parseLong(n57.getAttribute("value"));
	nc58= Long.parseLong(n58.getAttribute("value"));
	nc59= Long.parseLong(n59.getAttribute("value"));
	nc60= Long.parseLong(n60.getAttribute("value"));
	nc61= Long.parseLong(n61.getAttribute("value"));
	nc62= Long.parseLong(n62.getAttribute("value"));
	nc63= Long.parseLong(n63.getAttribute("value"));
	nc64= Long.parseLong(n64.getAttribute("value"));
	nc65= Long.parseLong(n65.getAttribute("value"));
	nc66= Long.parseLong(n66.getAttribute("value"));
	nc67= Long.parseLong(n67.getAttribute("value"));
	nc68= Long.parseLong(n68.getAttribute("value"));
	nc69= Long.parseLong(n69.getAttribute("value"));
	nc70= Long.parseLong(n70.getAttribute("value"));	 
	nc72= Long.parseLong(n72.getAttribute("value"));
	nc73= Long.parseLong(n73.getAttribute("value"));
	nc75= Long.parseLong(n75.getAttribute("value"));
	nc76= Long.parseLong(n76.getAttribute("value"));
    nc78= Long.parseLong(n78.getAttribute("value"));	
    nc79= Long.parseLong(n79.getAttribute("value"));	    
}
//.................................................................................................................	
	@Test (priority=1) //save data
    public void Save_Data() throws InterruptedException {
    Thread.sleep(2000);	           
    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();     
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    Thread.sleep(2000);
	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
	Thread.sleep(2000);
	String actualMessage = Validationmessage.getText();  
    System.out.println("Save Data Message  =" +actualMessage);
	String expectedMessage = "Saved Successfully";
	Thread.sleep(2000);
	Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
	Thread.sleep(2000);
    }
//.................................................................................................................    
	@Test(priority = 2)
    public void ClickOn_StockSheet() throws InterruptedException {
    Thread.sleep(3000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement ST= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[2]")));
    ST.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/stock";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String StockSheetCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("Stock Sheet Current URL = " + StockSheetCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, StockSheetCurrentURL);
 	
	WebElement s1= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));    //Quantity
	WebElement s2= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));    //New Car Retail Sales Amount
	WebElement s3= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));    //New Car Margin
	WebElement s4= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));   //DRF Amount
	WebElement s5= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));   //Total Discount
	
	//convert into integers
	st1= Long.parseLong(s1.getAttribute("value"));
	st2= Long.parseLong(s2.getAttribute("value"));
	st3= Long.parseLong(s3.getAttribute("value"));
	st4= Long.parseLong(s4.getAttribute("value"));
	st5= Long.parseLong(s5.getAttribute("value"));
	
	Thread.sleep(3000);
		
	}
//...................................................................................................................	
	@Test(priority = 3)
    public void ClickOn_Manpower_Cost() throws InterruptedException {
	Thread.sleep(3000);
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
	
	WebElement m1= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));    //New Car- Manpower Cost
	
	//convert into integers
	mp1= Long.parseLong(m1.getAttribute("value"));
	Thread.sleep(3000);
	}
//.........................................................................................................................	
	@Test(priority = 4)
    public void ClickOn_Interest_Cost() throws InterruptedException {
	Thread.sleep(3000);
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
    
    WebElement i1= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));    //New Car- Short Term Interest Cost
	
	//convert into integers
	ic1= Long.parseLong(i1.getAttribute("value"));
	Thread.sleep(3000);
	}	
//.........................................................................................................................	
	@Test(priority = 5)
    public void ClickOn_NewCar() throws InterruptedException {
	Thread.sleep(3000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement NewCar1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"New Car \")])[1]")));
    NewCar1.click();
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
	}
//..............................................................................................................		
	@Test(priority = 6) //New Car- Retail Sales Quantity
    public void  NewCar_RetailSales_Quantity() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	    	
    Assert.assertEquals(nc1, st1);            
    }
//..................................................................................
	@Test(priority = 7) //New Car- Retail Sales Amount
    public void  NewCar_RetailSales_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	    	
    Assert.assertEquals(nc2, st2);            
    }
//..................................................................................
	@Test(priority = 8) //New Car- Margin
    public void  NewCar_Margin_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	    	
    Assert.assertEquals(nc3, st3);            
    }
//..................................................................................
	@Test(priority = 9) //New Car Margin- Per New Car
    public void  NewCar_Margin_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp1= nc3/nc1;
  	long roundexp1= Math.round(exp1);
    Assert.assertEquals(roundexp1, nc4);            
    }
//..................................................................................
	@Test(priority = 10) //New Car- Total DRF Amount
    public void  TotalDRF_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    Assert.assertEquals(nc5,st4);            
    }
//..................................................................................
	@Test(priority = 11) //New Car- Total DRF Amount- Per New Car
    public void  Total_DRFAmount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp2= nc5/nc1;
  	long roundexp2= Math.round(exp2);
    Assert.assertEquals(roundexp2,nc6);            
    }
//..................................................................................
	@Test(priority = 12) //New Car- SPOT Value
    public void  SPOT_Value_On_MSILInvoice() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	Thread.sleep(2000);
    WebElement N7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[7]")));	    
    String NC7= N7.getAttribute("value");	
    Assert.assertTrue(NC7.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC7) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC7.matches("[0-9]+") && Long.parseLong(NC7)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 13) //New Car- SPOT Value- Per New Car
    public void  SPOT_Value_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp3= nc7/nc1;
  	long roundexp3= Math.round(exp3);
    Assert.assertEquals(roundexp3,nc8);            
    }
//..................................................................................
	@Test(priority = 14) //New Car- RIPS Support
    public void  RIPS_Support_ISL_RMK() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[9]")));	    
    String NC9= N9.getAttribute("value");	
    Assert.assertTrue(NC9.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC9) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC9.matches("[0-9]+") && Long.parseLong(NC9)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 15) //New Car- RIPS Support- Per New Car
    public void  RIPS_Support_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp4= nc9/nc1;
  	long roundexp4= Math.round(exp4);
    Assert.assertEquals(roundexp4,nc10);            
    }
//..................................................................................
	@Test(priority = 16) //New Car- Wholesale Incentives : MAC/NAC
    public void  Wholesale_Incentives_MACNAC() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[11]")));	    
    String NC11= N11.getAttribute("value");	
    Assert.assertTrue(NC11.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC11) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC11.matches("[0-9]+") && Long.parseLong(NC11)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 17) //Wholesale Incentives:MAC/NAC- Per New Car
    public void  Wholesale_Incentives_MAC_NAC_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp5= nc11/nc1;
  	long roundexp5= Math.round(exp5);
    Assert.assertEquals(roundexp5,nc12);            
    }
//..................................................................................
	@Test(priority = 18) //New Car- Wholesale Incentives : Trade Discount
    public void  Wholesale_Incentives_Trade_Discount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N13= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[13]")));	    
    String NC13= N13.getAttribute("value");	
    Assert.assertTrue(NC13.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC13) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC13.matches("[0-9]+") && Long.parseLong(NC13)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 19) //Wholesale Incentives:Trade Discount- Per New Car
    public void  Wholesale_Incentives_TradeDiscount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp6= nc13/nc1;
  	long roundexp6= Math.round(exp6);
    Assert.assertEquals(roundexp6,nc14);            
    }
//..................................................................................
	@Test(priority = 20) //New Car- BSC/NSC Payout
    public void  BSC_NSC_Payout() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[15]")));	    
    String NC15= N15.getAttribute("value");	
    Assert.assertTrue(NC15.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC15) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC15.matches("[0-9]+") && Long.parseLong(NC15)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 21) //BSC/NSC Payout- Per New Car
    public void  BSC_NSC_Payout_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp7= nc15/nc1;
  	long roundexp7= Math.round(exp7);
    Assert.assertEquals(roundexp7,nc16);            
    }
//..................................................................................
	@Test(priority = 22) //New Car- RO/ZO/HO Incentive Scheme
    public void  RO_ZO_HO_Incentive_Scheme() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[17]")));	    
    String NC17= N17.getAttribute("value");	
    Assert.assertTrue(NC17.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC17) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC17.matches("[0-9]+") && Long.parseLong(NC17)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 23) //RO/ZO/HO Incentive Scheme- Per New Car
    public void  RO_ZO_HO_Incentive_Scheme_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp8= nc17/nc1;
  	long roundexp8= Math.round(exp8);
    Assert.assertEquals(roundexp8,nc18);            
    }
//..................................................................................
	@Test(priority = 24) //New Car- Demo Vehicle Claims
    public void  Demo_Vehicle_Claims() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N19= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[19]")));	    
    String NC19= N19.getAttribute("value");	
    Assert.assertTrue(NC19.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC19) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC19.matches("[0-9]+") && Long.parseLong(NC19)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 25) //Demo Vehicle Claims- Per New Car
    public void  Demo_Vehicle_Claims_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp9= nc19/nc1;
  	long roundexp9= Math.round(exp9);
    Assert.assertEquals(roundexp9,nc20);            
    }
//..................................................................................
	@Test(priority = 26) //New Car- DGS&D Payout & Incentive
    public void  DGS_D_Payout_Incentive() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N21= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[21]")));	    
    String NC21= N21.getAttribute("value");	
    Assert.assertTrue(NC21.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC21) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC21.matches("[0-9]+") && Long.parseLong(NC21)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 27) //DGS&D Payout & Incentive- Per New Car
    public void  DGS_D_Payout_Incentive_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp10= nc21/nc1;
  	long roundexp10= Math.round(exp10);
    Assert.assertEquals(roundexp10,nc22);            
    }
//..................................................................................
	@Test(priority = 28) //New Car- JASP Claims
    public void  JASP_Claims() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N23= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[23]")));	    
    String NC23= N23.getAttribute("value");	
    Assert.assertTrue(NC23.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC23) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC23.matches("[0-9]+") && Long.parseLong(NC23)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 29) //JASP Claims- Per New Car
    public void  JASP_Claims_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp11= nc23/nc1;
  	long roundexp11= Math.round(exp11);
    Assert.assertEquals(roundexp11,nc24);            
    }
//..................................................................................
	@Test(priority = 30) //New Car- Finance Commission Quantity
    public void  Finance_Commission_Quantity() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N25= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[25]")));	    
    String NC25= N25.getAttribute("value");	
    Assert.assertTrue(NC25.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC25) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC25.matches("[0-9]+") && Long.parseLong(NC25)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 31) //New Car- Finance Commission Amount
    public void  Finance_Commission_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N26= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[26]")));	    
    String NC26= N26.getAttribute("value");	
    Assert.assertTrue(NC26.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC26) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC26.matches("[0-9]+") && Long.parseLong(NC26)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 32) //Finance Commission Amount- Per New Car
    public void  Finance_Commission_Amount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp12= nc26/nc1;
  	long roundexp12= Math.round(exp12);
    Assert.assertEquals(roundexp12,nc27);            
    }
//..................................................................................
	@Test(priority = 33) //New Car- Insurance Commission Quantity
    public void  Insurance_Commission_Quantity() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N28= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[28]")));	    
    String NC28= N28.getAttribute("value");	
    Assert.assertTrue(NC28.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC28) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC28.matches("[0-9]+") && Long.parseLong(NC28)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 34) //New Car- Insurance Commission Amount
    public void  Insurance_Commission_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N29= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[29]")));	    
    String NC29= N29.getAttribute("value");	
    Assert.assertTrue(NC29.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC29) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC29.matches("[0-9]+") && Long.parseLong(NC29)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 35) //Insurance Commission Amount- Per New Car
    public void  Insurance_Commission_Amount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp13= nc29/nc1;
  	long roundexp13= Math.round(exp13);
    Assert.assertEquals(roundexp13,nc30);            
    }
//..................................................................................
	@Test(priority = 36) //New Car- MSR: Loyalty/Reward Card
    public void  MSR_Loyalty_Reward_Card_Quantity() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N31= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[31]")));	    
    String NC31= N31.getAttribute("value");	
    Assert.assertTrue(NC31.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC31) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC31.matches("[0-9]+") && Long.parseLong(NC31)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 37) //New Car- MSR: Loyalty/Reward Card Amount
    public void  MSR_Loyalty_Reward_Card_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N32= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[32]")));	    
    String NC32= N32.getAttribute("value");	
    Assert.assertTrue(NC32.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC32) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC32.matches("[0-9]+") && Long.parseLong(NC32)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 38) //MSR: Loyalty/Reward Card Amount- Per New Car
    public void  MSR_Loyalty_Reward_Card_Amount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp14= nc32/nc1;
  	long roundexp14= Math.round(exp14);
    Assert.assertEquals(roundexp14,nc33);            
    }
//..................................................................................
	@Test(priority = 39) //New Car- Extended Warranty Commission Quantity
    public void  Extended_Warranty_Commission_Quantity() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N34= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[34]")));	    
    String NC34= N34.getAttribute("value");	
    Assert.assertTrue(NC34.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC34) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC34.matches("[0-9]+") && Long.parseLong(NC34)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 40) //New Car- Extended Warranty Commission Amount
    public void  Extended_Warranty_Commission_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N35= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[35]")));	    
    String NC35= N35.getAttribute("value");	
    Assert.assertTrue(NC35.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC35) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC35.matches("[0-9]+") && Long.parseLong(NC35)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 41) //Extended Warranty Commission Amount- Per New Car
    public void  Extended_Warranty_Commission_Amount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp15= nc35/nc1;
  	long roundexp15= Math.round(exp15);
    Assert.assertEquals(roundexp15,nc36);            
    }
//..................................................................................
	@Test(priority = 42) //New Car- CCP Commission Quantity
    public void  CCP_Commission_Quantity() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N37= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[37]")));	    
    String NC37= N37.getAttribute("value");	
    Assert.assertTrue(NC37.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC37) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC37.matches("[0-9]+") && Long.parseLong(NC37)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 43) //New Car- CCP Commission Amount
    public void  CCP_Commission_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N38= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[38]")));	    
    String NC38= N38.getAttribute("value");	
    Assert.assertTrue(NC38.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC38) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC38.matches("[0-9]+") && Long.parseLong(NC38)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 44) //CCP Commission Amount- Per New Car
    public void  CCP_Commission_Amount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp16= nc38/nc1;
  	long roundexp16= Math.round(exp16);
    Assert.assertEquals(roundexp16,nc39);            
    }
//..................................................................................
	@Test(priority = 45) //New Car- Income from Issuance of Fitness certificate Amount
    public void  IncomeFromIssuanceOfFitnessCertificate_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N40= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[40]")));	    
    String NC40= N40.getAttribute("value");	
    Assert.assertTrue(NC40.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC40) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC40.matches("[0-9]+") && Long.parseLong(NC40)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 46) //Income from Issuance of Fitness certificate- Per New Car
    public void  IncomeFromIssuanceOfFitnessCertificate_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp17= nc40/nc1;
  	long roundexp17= Math.round(exp17);
    Assert.assertEquals(roundexp17,nc41);            
    }
//..................................................................................
	@Test(priority = 47) //New Car- Interest Receipt from MSIL
    public void  Interest_Receipt_from_MSIL_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N42= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[42]")));	    
    String NC42= N42.getAttribute("value");	
    Assert.assertTrue(NC42.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC42) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC42.matches("[0-9]+") && Long.parseLong(NC42)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 48) //Interest Receipt from MSIL- Per New Car
    public void  Interest_Receipt_from_MSIL_Amount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp18= nc42/nc1;
  	long roundexp18= Math.round(exp18);
    Assert.assertEquals(roundexp18,nc43);            
    }
//..................................................................................
	@Test(priority = 49) //New Car- Other income (Investments/FDR etc)
    public void  NewCar_Other_income_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N44= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[44]")));	    
    String NC44= N44.getAttribute("value");	
    Assert.assertTrue(NC44.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC44) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC44.matches("[0-9]+") && Long.parseLong(NC44)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 50) //Other income (Investments/FDR etc)- Per New Car
    public void  NewCar_Other_income_Amount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp19= nc44/nc1;
  	long roundexp19= Math.round(exp19);
    Assert.assertEquals(roundexp19,nc45);            
    }
//..................................................................................
	@Test(priority = 51) //New Car- Any other Income Amount
    public void  Any_other_Income_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N46= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[46]")));	    
    String NC46= N46.getAttribute("value");	
    Assert.assertTrue(NC46.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC46) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC46.matches("[0-9]+") && Long.parseLong(NC46)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 52) //Any other Income- Per New Car
    public void  Any_other_Income_Amount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp20= nc46/nc1;
  	long roundexp20= Math.round(exp20);
    Assert.assertEquals(roundexp20,nc47);            
    }
//..................................................................................
	@Test(priority = 53) //New Car- Manpower Cost
    public void  NewCar_Manpower_Cost() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	    	
    Assert.assertEquals(nc49, mp1);            
    }
//..................................................................................
	@Test(priority = 54) //Manpower Cost- Per New Car
    public void  Manpower_Cost_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp21= nc49/nc1;
  	long roundexp21= Math.round(exp21);
    Assert.assertEquals(roundexp21,nc50);            
    }
//..................................................................................
	@Test(priority = 55) //New Car- Total Discount
    public void  NewCar_Total_Discount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	    	
    Assert.assertEquals(nc51, st5);            
    }
//..................................................................................
	@Test(priority = 56) //Total Discount- Per New Car
    public void  Total_Discount_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp22= nc51/nc1;
  	long roundexp22= Math.round(exp22);
    Assert.assertEquals(roundexp22,nc52);            
    }
//..................................................................................
	@Test(priority = 57) //New Car- Short term Interest Cost 
    public void  NewCar_Short_term_Interest_Cost () throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	    	
    Assert.assertEquals(nc53, ic1);            
    }
//..................................................................................
	@Test(priority = 58) //Short term Interest Cost - Per New Car
    public void  Short_term_Interest_Cost_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp23= nc53/nc1;
  	long roundexp23= Math.round(exp23);
    Assert.assertEquals(roundexp23,nc54);            
    }
//..................................................................................
	@Test(priority = 59) //New Car- Delivery Expenses Amount
    public void  Delivery_Expenses_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N55= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[55]")));	    
    String NC55= N55.getAttribute("value");	
    Assert.assertTrue(NC55.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC55) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC55.matches("[0-9]+") && Long.parseLong(NC55)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 60) //Delivery Expenses - Per New Car
    public void  Delivery_Expenses_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp24= nc55/nc1;
  	long roundexp24= Math.round(exp24);
    Assert.assertEquals(roundexp24,nc56);            
    }
//..................................................................................
	@Test(priority = 61) //New Car- Fuel expenses Amount
    public void  Fuel_expenses_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N57= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[57]")));	    
    String NC57= N57.getAttribute("value");	
    Assert.assertTrue(NC57.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC57) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC57.matches("[0-9]+") && Long.parseLong(NC57)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 62) //Fuel expenses - Per New Car
    public void  Fuel_expenses_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp25= nc57/nc1;
  	long roundexp25= Math.round(exp25);
    Assert.assertEquals(roundexp25,nc58);            
    }
//..................................................................................
	@Test(priority = 63) //New Car- Advertisement_Marketing_Promotional_Expenses
    public void  Advertisement_Marketing_Promotional_Expenses_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N59= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[59]")));	    
    String NC59= N59.getAttribute("value");	
    Assert.assertTrue(NC59.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC59) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC59.matches("[0-9]+") && Long.parseLong(NC59)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 64) //Advertisement_Marketing_Promotional_Expenses - Per New Car
    public void  Advertisement_Marketing_Promotional_Expenses_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp26= nc59/nc1;
  	long roundexp26= Math.round(exp26);
    Assert.assertEquals(roundexp26,nc60);            
    }
//..................................................................................
	@Test(priority = 65) //New Car- Hyperlocal Expense
    public void  Hyperlocal_Expense_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N61= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[61]")));	    
    String NC61= N61.getAttribute("value");	
    Assert.assertTrue(NC61.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC61) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC61.matches("[0-9]+") && Long.parseLong(NC61)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 66) //Hyperlocal Expense - Per New Car
    public void  Hyperlocal_Expense_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp27= nc61/nc1;
  	long roundexp27= Math.round(exp27);
    Assert.assertEquals(roundexp27,nc62);            
    }
//..................................................................................
	@Test(priority = 67) //New Car- Pool Lifting Charges
    public void  Pool_Lifting_Charges_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N63= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[63]")));	    
    String NC63= N63.getAttribute("value");	
    Assert.assertTrue(NC63.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC63) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC63.matches("[0-9]+") && Long.parseLong(NC63)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 68) //Pool Lifting Charges - Per New Car
    public void  Pool_Lifting_Charges_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp28= nc63/nc1;
  	long roundexp28= Math.round(exp28);
    Assert.assertEquals(roundexp28,nc64);            
    }
//..................................................................................
	@Test(priority = 69) //New Car- DSA/DMA Commission
    public void  DSA_DMA_Commission_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N65= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[65]")));	    
    String NC65= N65.getAttribute("value");	
    Assert.assertTrue(NC65.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC65) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC65.matches("[0-9]+") && Long.parseLong(NC65)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 70) //DSA/DMA Commission - Per New Car
    public void  DSA_DMA_Commission_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp29= nc65/nc1;
  	long roundexp29= Math.round(exp29);
    Assert.assertEquals(roundexp29,nc66);            
    }
//..................................................................................
	@Test(priority = 71) //New Car- Lease Rental on Demo Vehicles
    public void  Lease_Rental_on_Demo_Vehicles_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N67= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[67]")));	    
    String NC67= N67.getAttribute("value");	
    Assert.assertTrue(NC67.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC67) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC67.matches("[0-9]+") && Long.parseLong(NC67)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 72) //Lease Rental on Demo Vehicles - Per New Car
    public void  Lease_Rental_on_Demo_Vehicles_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp30= nc67/nc1;
  	long roundexp30= Math.round(exp30);
    Assert.assertEquals(roundexp30,nc68);            
    }
//..................................................................................
	@Test(priority = 73) //New Car- Any other Expense
    public void  Any_other_Expense_Amount() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N69= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[69]")));	    
    String NC69= N69.getAttribute("value");	
    Assert.assertTrue(NC69.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC69) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC69.matches("[0-9]+") && Long.parseLong(NC69)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 74) //Any other Expense - Per New Car
    public void  Any_other_Expense_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp31= nc69/nc1;
  	long roundexp31= Math.round(exp31);
    Assert.assertEquals(roundexp31,nc70);            
    }
//..................................................................................
	@Test(priority = 75) //Total New Car Income [A]
    public void  Total_New_Car_Income() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long exp32=nc3+nc5+nc7+nc9+nc11+nc13+nc15+nc17+nc19+nc21+nc23+nc26+
  			   nc29+nc32+nc35+nc38+nc40+nc42+nc44+nc46 ;
    Assert.assertEquals(exp32,nc72);            
    }
//..................................................................................
	@Test(priority = 76) //Total New Car Income [A]- Per New Car
    public void  Total_New_Car_Income_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp33=nc72/nc1;
  	long roundexp33= Math.round(exp33);
    Assert.assertEquals(roundexp33,nc73);            
    }
//..................................................................................
	@Test(priority = 77) //Total New Car Direct Expense [B]
    public void  Total_New_Car_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long exp34=nc49+nc51+nc53+nc55+nc57+nc59+nc61+nc63+nc65+nc67+nc69;
    Assert.assertEquals(exp34,nc78);            
    }
//..................................................................................
	@Test(priority = 78) //Total New Car Direct Expense [B]- Per New Car
    public void  Total_New_Car_Direct_Expense_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp35=nc78/nc1;
  	long roundexp35= Math.round(exp35);
    Assert.assertEquals(roundexp35,nc79);            
    }
//..................................................................................
	@Test(priority = 79) //Net Earning New car = [A] - [B]
    public void  Net_Earning_New_car() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	long exp36= nc72-nc78;
    Assert.assertEquals(exp36,nc75);            
    }
//..................................................................................
	@Test(priority = 78) //Net Earning New car = [A] - [B]- Per New Car
    public void  Net_Earning_New_car_PerNewCar() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	double exp37=nc75/nc1;
  	long roundexp37= Math.round(exp37);
    Assert.assertEquals(roundexp37,nc76);            
    }
//..................................................................................
	@AfterClass
    public void tearDown () throws InterruptedException {	
		Thread.sleep(3000);
    }
	
	
}
