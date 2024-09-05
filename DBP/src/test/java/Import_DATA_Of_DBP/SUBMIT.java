package Import_DATA_Of_DBP;

import java.text.DecimalFormat;
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

public class SUBMIT extends LOGIN {
	public  static WebDriver driver;
	public WebDriverWait wait;
	
	double nc1;
	double nc2;
	double nc3;
	double nc5;
	double nc7;
	double nc9;
	double nc11;
	double nc13;
	double nc72;
	double nc78;
	double st1;
	double st2;
	double st3;
	double md1;
	double md2;
	double md3;
	double mir1;
	double mir2;
	double mir3;
	double msg1;
	double msg2;
	double msg3;
	double msg4;
	double msg5;
	double tvr1;
	double tvr2;
	double tvr3;
	double tvr4;
	double tvr5;
	double tvr6;
	double spr1;
	double spr2;
	double spr3;
	double spr4;
	double spr5;
	double srv1;
	double srv2;
	double srv3;
	double srv4;
	double srv5;
	double cme1;
	double sd1;
	long sd2;
	long sd3;
	long sd4;
	long sd5;
	long sd6;
	long sd7;
	double sd8;
	double sd9;
	double sd10;
	double sd11;
	double sd12;
	double sd13;
	double sd14;
	double sd15;
	double sd16;
	double sd17;
	double sd18;
	double sd19;
	double sd20;
	double sd21;
	double sd22;
	double sd23;
	double sd24;
	double sd25;
	double sd26;
	double sd27;
	double sd28;
	double sd29;
	double sd30;
	double sd31;
	double sd32;
	double sd33;
	double sd34;
	double sd35;
	double sd36;
	double sd37;
	double sd38;
	double sd39;
	double sd40;
	double sd41;
	double sd42;
	double sd43;
	double sd44;
	double sd45;
	double sd46;
	double sd47;
	double sd48;
			
	@SuppressWarnings({"static-access" })
	@BeforeClass
	public void submit() throws InterruptedException {		
	
	//.............................................................
		   Thread.sleep(3000);		   
 //...................................................................................    	
		   this.driver=LOGIN.driver;   // call the login page 
//................................................................................................
	   }	         	                       		
//...................................................................................................................................................	
	//click on New Car option
	@Test(priority=0)    
	public void ClickOn_NewCar() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement NC= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[6]")));
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
	}
//........................................................................................................
	@Test(priority=1)    
	public void ElementsOf_NewCar() throws InterruptedException {
	Thread.sleep(3000);
	WebElement n1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); 
    nc1= Double.parseDouble(n1.getAttribute("value"));     //quantity in new car
			
	WebElement n2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));   //new retail sales
	nc2= Double.parseDouble(n2.getAttribute("value"));
	
    WebElement n3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));    //new car margin
	nc3= Double.parseDouble(n3.getAttribute("value"));
	
	WebElement n5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));      //total DRF Amount
	nc5= Double.parseDouble(n5.getAttribute("value"));
	
	WebElement n11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));     // Wholesale Incentives : MAC/NAC
	nc11= Double.parseDouble(n11.getAttribute("value"));	
	
	WebElement n13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));     // Wholesale Incentive : Trade Discount
	nc13= Double.parseDouble(n13.getAttribute("value"));
	
	WebElement n7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));     // Support received as Discount on MSIL Invoice
    nc7= Double.parseDouble(n7.getAttribute("value"));
	
	WebElement n9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));     // Support credited/To be credicted
	nc9= Double.parseDouble(n9.getAttribute("value"));
					
	WebElement n72= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));     //total new car income
	nc72= Double.parseDouble(n72.getAttribute("value"));
	
	WebElement n78= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]"));      //Total New Car Direct Expense
	nc78= Double.parseDouble(n78.getAttribute("value"));	
  }
//..................................................................................................................................	
	//click on Stock Sheet
	@Test(priority=2)    
	public void ClickOn_StockSheet() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
    Thread.sleep(3000);    
	}
//........................................................................................................
	@Test(priority=3)    
	public void ElementsOf_StockSheet() throws InterruptedException {
	Thread.sleep(3000);
	WebElement s1= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));  //opening stock total amt
	st1= Double.parseDouble(s1.getAttribute("value"));
	
	WebElement s2= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));  //wholesale stock total amt
	st2= Double.parseDouble(s2.getAttribute("value"));
	
	WebElement s3= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));  //closing stock total amt
	st3= Double.parseDouble(s3.getAttribute("value"));	
	}
//.............................................................................................................
	//click on MDS
	@Test(priority=4)    
	public void ClickOn_MDS() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement MD= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[7]")));
    MD.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/mds";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String MDSCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("MDS Current URL = " + MDSCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, MDSCurrentURL);
    Thread.sleep(3000);    
	}
//........................................................................................................
	@Test(priority=5)    
	public void ElementsOf_MDS() throws InterruptedException {
	Thread.sleep(3000);
	WebElement m1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));  //Quantity in MDS
	md1= Double.parseDouble(m1.getAttribute("value"));
	
    WebElement m2= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));   //Total MDS Income [A]
    md2= Double.parseDouble(m2.getAttribute("value"));
    
    WebElement m3= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));   //Total MDS Direct Expense [B]
    md3= Double.parseDouble(m3.getAttribute("value"));
  }
//......................................................................................................................................................................................
	//click on MI Renewal
	@Test(priority=6)    
	public void ClickOn_MI_Renewal() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement MI= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[8]")));
    MI.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/Maruti-Insurance-Renewal";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String MIRCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("MI Renewal Current URL = " + MIRCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, MIRCurrentURL);
    Thread.sleep(3000);    
	}
//........................................................................................................
	@Test(priority=7)    
	public void ElementsOf_MI_Renewal() throws InterruptedException {
	Thread.sleep(3000);
	WebElement mi1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));  // quantity in MI Renewal
	mir1= Double.parseDouble(mi1.getAttribute("value"));
	
	WebElement mi2= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]")); // Total MI Renewal Income[A]
    mir2= Double.parseDouble(mi2.getAttribute("value"));
    
	WebElement mi3= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]")); //Total MI Renewal Direct Expense [B]
	mir3= Double.parseDouble(mi3.getAttribute("value"));
 }
//......................................................................................................................................................................................
    //click on MSGA  
	@Test(priority=8)    
	public void ClickOn_MSGA() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement MS= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[9]")));
    MS.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/MSGA";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String MSGACurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("MSGA Current URL = " + MSGACurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, MSGACurrentURL);
    Thread.sleep(3000);    
	}
//........................................................................................................
	@Test(priority=9)    
	public void ElementsOf_MSGA() throws InterruptedException {
    Thread.sleep(2000);
    WebElement mg1= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]")); //total MSGA income [A]
    msg1= Double.parseDouble(mg1.getAttribute("value"));
    
    WebElement mg2= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")); //total MSGA Margin Sales
    msg2= Double.parseDouble(mg2.getAttribute("value"));
    
    WebElement mg3= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")); //total MSGA Sales
    msg3= Double.parseDouble(mg3.getAttribute("value"));
    
    WebElement mg4= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]")); //Cost of Goods sold
    msg4= Double.parseDouble(mg4.getAttribute("value"));
    
    WebElement mg5= driver.findElement(By.xpath("(//*[@type=\"number\"])[31]")); //Total MSGA direct Expense
    msg5= Double.parseDouble(mg5.getAttribute("value"));
 }
//.....................................................................................................................................................................................................    
    //click on True Value
	@Test(priority=10)    
	public void ClickOn_TrueValue() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement TV= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[10]")));
    TV.click();
    // Define the expected URL
    String expectedURL = "https://dev-dbp.msilfintrac.co.in/Dashboard/poc";

    // Wait until the URL is the expected URL
    wait.until(ExpectedConditions.urlToBe(expectedURL));

    // Get the current URL after the click
    String TrueValueCurrentURL = driver.getCurrentUrl();

    // Print the current URL for debugging purposes
    System.out.println("True Value Current URL = " + TrueValueCurrentURL);

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, TrueValueCurrentURL);
    Thread.sleep(3000);    
	}
//........................................................................................................
	@Test(priority=11)    
	public void ElementsOf_TrueValue() throws InterruptedException {
    Thread.sleep(2000);
    WebElement tv1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")); //quantity in True Value
	tvr1= Double.parseDouble(tv1.getAttribute("value"));
			
    WebElement tv2= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]")); //Total POC Sales Income [A]\
    tvr2= Double.parseDouble(tv2.getAttribute("value"));
    
    WebElement tv3= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")); //POC Sales Margin (Income)
    tvr3= Double.parseDouble(tv3.getAttribute("value"));
    
    WebElement tv4= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")); //POC Sales Amount
    tvr4= Double.parseDouble(tv4.getAttribute("value"));
    
    WebElement tv5= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]")); //Cost of Goods Sold
    tvr5= Double.parseDouble(tv5.getAttribute("value"));
    
    WebElement tv6= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]")); //Total POC Sales Direct Expense [B]
    tvr6= Double.parseDouble(tv6.getAttribute("value"));
  }
//......................................................................................................................................................................................................
	//click on Spares
	@Test(priority=12)    
	public void ClickOn_Spares() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

    // Compare the current URL with the expected URL
    Assert.assertEquals(expectedURL, SparesCurrentURL);
    Thread.sleep(3000);    
	}
//........................................................................................................
	@Test(priority=13)    
	public void ElementsOf_Spares() throws InterruptedException {
    Thread.sleep(2000);
    WebElement sp1= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]")); //Total Spares Income
    spr1= Double.parseDouble(sp1.getAttribute("value"));
    
    WebElement sp2= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]")); //Spares Margin (Sales - Cost of Goods Sold)
    spr2= Double.parseDouble(sp2.getAttribute("value"));
    
    WebElement sp3= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")); //Total Spares Sales
    spr3= Double.parseDouble(sp3.getAttribute("value"));
    
    WebElement sp4= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]")); //Cost of Goods Sold
    spr4= Double.parseDouble(sp4.getAttribute("value"));
    
    WebElement sp5= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]")); //Total Spares Direct Expense
    spr5= Double.parseDouble(sp5.getAttribute("value"));
  }
//.........................................................................................................................................................................................................................   
    //click on Service
	@Test(priority=14)    
	public void ClickOn_Service() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement SV= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[12]")));
    SV.click();
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
    Thread.sleep(3000);    
	}
//........................................................................................................
	@Test(priority=15)    
	public void ElementsOf_Service() throws InterruptedException {
    Thread.sleep(2000);
    WebElement sr1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); //Free Service Load 
    srv1= Double.parseDouble(sr1.getAttribute("value"));
     
    WebElement sr2= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));  //Paid & Running Repairs Load
    srv2= Double.parseDouble(sr2.getAttribute("value"));
    
    WebElement sr3= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")); //Bodyshop Load
    srv3= Double.parseDouble(sr3.getAttribute("value"));
    
    WebElement sr4= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]")); //Total Service Income [A]
    srv4= Double.parseDouble(sr4.getAttribute("value"));
    
    WebElement sr5= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")); //Total Service Direct Expense [B]
    srv5= Double.parseDouble(sr5.getAttribute("value"));
 }
//...............................................................................................................................................................................................................
	@Test(priority=16)    
	public void ClickOn_CommonExpense() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement CE= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=\"mat-line\"])[13]")));
    CE.click();
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
    Thread.sleep(3000);    
 }
//........................................................................................................
	@Test(priority=17)    
	public void ElementsOf_CommonExpense() throws InterruptedException {
    Thread.sleep(2000);
    //click on Other Expense tab
	driver.findElement(By.xpath("(//*[@type=\"button\"])[2]")).click();
	Thread.sleep(2000);
	
    WebElement cm1= driver.findElement(By.xpath("(//*[@type=\"text\"])[120]"));  //Total Common Expense
    cme1= Double.parseDouble(cm1.getAttribute("value"));
 }
//...............................................................................................................................................................................................................
	@Test(priority=18)    
	public void click_On_submit() throws InterruptedException {
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement V= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"Submit \")])[1]")));
    V.click();
   
    //....Clic on the Submit Button
    Thread.sleep(2000);
    
    WebElement S1 = driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[2]"));
    S1.click();
    
    Thread.sleep(3000);

    //..... After Click on the view P  & L report
    
    WebElement PL = driver.findElement(By.xpath("(//*[contains(text(),\"View P&L Summary \")])[1]"));
    PL.click();
 }
//........................................................................................................
	@Test(priority=19)    
	public void ElementsOf_View_P_L_Summary() throws InterruptedException {
    Thread.sleep(4000);	
	WebElement S1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")); //quantity in Submit DBP
	WebElement S2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	WebElement S3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	WebElement S4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	WebElement S5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement S6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement S7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));					    
	WebElement S8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	WebElement S9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	WebElement S10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	WebElement S11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	WebElement S12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	WebElement S13 = driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	WebElement S14 = driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	WebElement S15 = driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	WebElement S16 = driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	WebElement S17 = driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	WebElement S18 = driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	WebElement S19 = driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	WebElement S20 = driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	WebElement S21 = driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
	WebElement S22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	WebElement S23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	WebElement S24= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
	WebElement S25= driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
	WebElement S26= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
	WebElement S27= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));	
	WebElement S28= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));	
	WebElement S29= driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
	WebElement S30= driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
	WebElement S31= driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
	WebElement S32= driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
	WebElement S33= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
	WebElement S34= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
	WebElement S35= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
	WebElement S36= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
	WebElement S37= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
	WebElement S38= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
	WebElement S39= driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
	WebElement S40= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
	WebElement S41= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
	WebElement S42= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
	WebElement S43= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
	WebElement S44= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
	WebElement S45= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
	WebElement S46= driver.findElement(By.xpath("(//*[@type=\"number\"])[46]"));
	WebElement S47= driver.findElement(By.xpath("(//*[@type=\"number\"])[47]"));
	WebElement S48= driver.findElement(By.xpath("(//*[@type=\"number\"])[48]"));	
	//...........................................................................................................................................................................................						
	//convert to integers
	Thread.sleep(2000);
    sd1= Long.parseLong(S1.getAttribute("value"));
	sd2= Long.parseLong(S2.getAttribute("value"));	
	sd3= Long.parseLong(S3.getAttribute("value"));
	sd4= Long.parseLong(S4.getAttribute("value"));	
	sd5= Long.parseLong(S5.getAttribute("value"));	
	sd6= Long.parseLong(S6.getAttribute("value"));	
	sd7= Long.parseLong(S7.getAttribute("value"));		
	sd8= Double.parseDouble(S8.getAttribute("value"));
	sd9= Double.parseDouble(S9.getAttribute("value"));
	sd10= Double.parseDouble(S10.getAttribute("value"));
	sd11= Double.parseDouble(S11.getAttribute("value"));
	sd12= Double.parseDouble(S12.getAttribute("value"));
	sd13= Double.parseDouble(S13.getAttribute("value"));
	sd14= Double.parseDouble(S14.getAttribute("value"));
	sd15= Double.parseDouble(S15.getAttribute("value"));
	sd16= Double.parseDouble(S16.getAttribute("value"));
	sd17= Double.parseDouble(S17.getAttribute("value"));
	sd18= Double.parseDouble(S18.getAttribute("value"));
	sd19= Double.parseDouble(S19.getAttribute("value"));
	sd20= Double.parseDouble(S20.getAttribute("value"));
	sd21= Double.parseDouble(S21.getAttribute("value"));
	sd22= Double.parseDouble(S22.getAttribute("value"));
	sd23= Double.parseDouble(S23.getAttribute("value"));
	sd24= Double.parseDouble(S24.getAttribute("value"));
	sd25= Double.parseDouble(S25.getAttribute("value"));
	sd26= Double.parseDouble(S26.getAttribute("value"));
	sd27= Double.parseDouble(S27.getAttribute("value"));
	sd28= Double.parseDouble(S28.getAttribute("value"));
	sd29= Double.parseDouble(S29.getAttribute("value"));
	sd30= Double.parseDouble(S30.getAttribute("value"));
	sd31= Double.parseDouble(S31.getAttribute("value"));
	sd32= Double.parseDouble(S32.getAttribute("value"));
	sd33= Double.parseDouble(S33.getAttribute("value"));
	sd34= Double.parseDouble(S34.getAttribute("value"));
	sd35= Double.parseDouble(S35.getAttribute("value"));
	sd36= Double.parseDouble(S36.getAttribute("value"));
	sd37= Double.parseDouble(S37.getAttribute("value"));
	sd38= Double.parseDouble(S38.getAttribute("value"));
	sd39= Double.parseDouble(S39.getAttribute("value"));
	sd40= Double.parseDouble(S40.getAttribute("value"));
	sd41= Double.parseDouble(S41.getAttribute("value"));
	sd42= Double.parseDouble(S42.getAttribute("value"));
	sd43= Double.parseDouble(S43.getAttribute("value"));
	sd44= Double.parseDouble(S44.getAttribute("value"));
	sd45= Double.parseDouble(S45.getAttribute("value"));
	sd46= Double.parseDouble(S46.getAttribute("value"));
	sd47= Double.parseDouble(S47.getAttribute("value"));
	sd48= Double.parseDouble(S48.getAttribute("value"));
	Thread.sleep(3000); 
  }
//............................................................................................................................................................................						
	@Test(priority = 20) //verify New Car--> Volume in Submit DBP
    public void  New_Car_Volume() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(sd1, nc1);            
    }
//..................................................................................
	@Test(priority = 21) //verify MDS--> Volume in Submit DBP
    public void  MDS_Volume() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(sd2, md1);            
    }
//..................................................................................
	@Test(priority = 22) //verify MI Renewal--> Volume in Submit DBP
    public void  MI_Renewal_Volume() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(sd3, mir1);            
    }	
//............................................................................................................    
	@Test(priority = 23) //verify True Value--> Volume in Submit DBP
    public void  True_Value_Volume() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(sd4, tvr1);            
    }	
//............................................................................................................    
	@Test(priority = 24) //Verify Free Service Load in Submit DBP
    public void  Free_Service_Load_Volume() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(sd5, srv1);            
    }	
//............................................................................................................    
	@Test(priority = 25) //Verify Paid & Running Load in Submit DBP
    public void  Paid_And_Running_Load_Volume() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(sd6, srv2);            
    }	
//............................................................................................................    
	@Test(priority = 26) //Verify Bodyshop Load in Submit DBP
    public void  Bodyshop_Load_Volume() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    	
    Assert.assertEquals(sd7, srv3);            
    }	
//............................................................................................................    
	@Test(priority = 27) //New Car--> Turnover
    public void New_Car_Turnover() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double Sub1= nc72-nc3;
    double Sub2= Sub1-nc5;
    double Add3= Sub2+nc2;	    
    double exp1= Add3/100000;
    double actvalue= exp1;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp1= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp1,sd8);         
    }
//..................................................................................
	@Test(priority = 28) //MDS--> Turnover
    public void MDS_Turnover() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp2= md2/100000;
    double actvalue= exp2;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp2= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp2,sd9);         
    }
//..................................................................................
	@Test(priority = 29) //MI Renewal--> Turnover
    public void MI_Renewal_Turnover() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp3= mir2/100000;
    double actvalue= exp3;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp3= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp3,sd10);         
    }
//..................................................................................
	@Test(priority = 30) //MSGA--> Turnover
    public void MSGA_Turnover() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double SubM1= msg1-msg2;
	double AddM1= SubM1+ msg3;
	double exp4= AddM1/100000;
    double actvalue= exp4;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp4= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp4,sd11);         
    }
//..................................................................................
	@Test(priority = 31) //True Value--> Turnover
    public void True_Value_Turnover() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double SubT1= tvr2-tvr3;
	double AddT1= SubT1+tvr4;
    double exp5= AddT1/100000;
    double actvalue= exp5;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp5= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp5,sd12);         
    }
//..................................................................................
	@Test(priority = 32) //Spares--> Turnover
    public void Spares_Turnover() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double SubS1= spr1-spr2;
	double AddS2= SubS1+spr3;
	double exp6= AddS2/100000;
    double actvalue= exp6;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp6= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp6,sd13);         
    }
//..................................................................................
	@Test(priority = 33) //Service--> Turnover
    public void Service_Turnover() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp7= srv4/100000;
    double actvalue= exp7;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp7= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp7,sd14);         
    }
//..................................................................................
	@Test(priority = 34) //Total--> Turnover
    public void Total_Turnover() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp8= sd8+sd9+sd10+sd11+sd12+sd13+sd14;
    double actvalue= exp8;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp8= Double.parseDouble(roundedValue);
    Assert.assertEquals(sd15,roundexp8);         
    }
//..................................................................................
	@Test(priority = 35) //New Car--> COGS
    public void New_Car_COGS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double AddS1= st1+st2;
	double SubS2= AddS1-st3;
	double exp9= SubS2/100000;
    double actvalue= exp9;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp9= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp9,sd16);         
    }
//..................................................................................
	@Test(priority = 36) //MSGA--> COGS
    public void MSGA_COGS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp10= msg4/100000;
    double actvalue= exp10;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp10= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp10,sd17);         
    }
//..................................................................................
	@Test(priority = 37) //True Value--> COGS
    public void True_Value_COGS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp11= tvr5/100000;
    double actvalue= exp11;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp11= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp11,sd18);         
    }
//..................................................................................
	@Test(priority = 38) //Spares--> COGS
    public void Spares_COGS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp12= spr4/100000;
    double actvalue= exp12;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp12= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp12,sd19);         
    }
//..................................................................................
	@Test(priority = 39) //Total--> COGS
    public void Total_COGS() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double exp13= sd16+sd17+sd18+sd19;
    double actvalue= exp13;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp13= Double.parseDouble(roundedValue);
    Assert.assertEquals(sd20,roundexp13);         
    }
//..................................................................................
	@Test(priority = 40) //New Car--> Gross Margin
    public void New_Car_Gross_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double SubS3= sd8-sd16;
	double Div1 = nc5/100000;
	double exp14= SubS3+Div1;
    double actvalue= exp14;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp14= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp14,sd21);         
    }
//..................................................................................
	@Test(priority = 41) //MDS--> Gross Margin
    public void MDS_Gross_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Assert.assertEquals(sd22,sd9);         
    }
//..................................................................................
	@Test(priority = 42) //MI Renewal--> Gross Margin
    public void MI_Renewal_Gross_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Assert.assertEquals(sd23,sd10);         
    }
//..................................................................................
	@Test(priority = 43) //MSGA--> Gross Margin
    public void MSGA_Gross_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp15= sd11-sd17;
    double actvalue= exp15;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp15= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp15,sd24);         
    }
//..................................................................................
	@Test(priority = 44) //True Value--> Gross Margin
    public void True_Value_Gross_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp16= sd12-sd18;
    double actvalue= exp16;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp16= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp16,sd25);         
    }
//..................................................................................
	@Test(priority = 45) //Spares--> Gross Margin
    public void Spares_Gross_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp17= sd13-sd19;
    double actvalue= exp17;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp17= Double.parseDouble(roundedValue);
    Assert.assertEquals(sd26,roundexp17);         
    }
//..................................................................................
	@Test(priority = 46) //Service--> Gross Margin
    public void Service_Gross_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Assert.assertEquals(sd27,sd14);         
    }
//..................................................................................
	@Test(priority = 47) //Total--> Gross Margin
    public void Total_Gross_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp18= sd21+sd22+sd23+sd24+sd25+sd26+sd27;
    double actvalue= exp18;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp18= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp18,sd28);         
    }
//..................................................................................
	@Test(priority = 48) //New Car--> Direct Expense
    public void New_Car_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp19= nc78/100000;
    double actvalue= exp19;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp19= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp19,sd29);         
    }
//..................................................................................
	@Test(priority = 49) //MDS--> Direct Expense
    public void MDS_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp20= md3/100000;
    double actvalue= exp20;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp20= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp20,sd30);         
    }
//..................................................................................
	@Test(priority = 50) //MI Renewal--> Direct Expense
    public void MI_Renewal_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp21= mir3/100000;
    double actvalue= exp21;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp21= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp21,sd31);         
    }
//..................................................................................
	@Test(priority = 51) //MSGA--> Direct Expense
    public void MSGA_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp22= msg5/100000;
    double actvalue= exp22;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp22= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp22,sd32);         
    }
//..................................................................................
	@Test(priority = 52) //True Value--> Direct Expense
    public void True_Value_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp23= tvr6/100000;
    double actvalue= exp23;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp23= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp23,sd33);         
    }
//..................................................................................
	@Test(priority = 53) //Spares--> Direct Expense
    public void Spares_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp24= spr5/100000;
    double actvalue= exp24;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp24= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp24,sd34);         
    }
//..................................................................................
	@Test(priority = 54) //Service--> Direct Expense
    public void Service_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp25= srv5/100000;
    double actvalue= exp25;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp25= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp25,sd35);         
    }
//..................................................................................
	@Test(priority = 55) //Total--> Direct Expense
    public void Total_Direct_Expense() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp26= sd29+sd30+sd31+sd32+sd33+sd34+sd35;
    double actvalue= exp26;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp26= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp26,sd36);         
    }
//..................................................................................
	@Test(priority = 56) //New Car--> Contribution Margin
    public void New_Car_Contribution_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp27= sd21-sd29;
    double actvalue= exp27;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp27= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp27,sd37);         
    }
//..................................................................................
	@Test(priority = 57) //MDS--> Contribution Margin
    public void MDS_Contribution_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp28= sd22-sd30;
    double actvalue= exp28;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp28= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp28,sd38);         
    }
//..................................................................................
	@Test(priority = 58) //MI Renewal--> Contribution Margin
    public void MI_Renewal_Contribution_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp29= sd23-sd31;
    double actvalue= exp29;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp29= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp29,sd39);         
    }
//..................................................................................
	@Test(priority = 59) //MSGA--> Contribution Margin
    public void MSGA_Contribution_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp30= sd24-sd32;
    double actvalue= exp30;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp30= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp30,sd40);         
    }
//..................................................................................
	@Test(priority = 60) //True Value--> Contribution Margin
    public void True_Value_Contribution_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp31= sd25-sd33;
    double actvalue= exp31;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp31= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp31,sd41);         
    }
//..................................................................................
	@Test(priority = 61) //Spares--> Contribution Margin
    public void Spares_Contribution_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp32= sd26-sd34;
    double actvalue= exp32;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp32= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp32,sd42);         
    }
//..................................................................................
	@Test(priority = 62) //Service--> Contribution Margin
    public void Service_Contribution_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp33= sd27-sd35;
    double actvalue= exp33;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp33= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp33,sd43);         
    }
//..................................................................................
	@Test(priority = 63) //Total--> Contribution Margin
    public void Total_Contribution_Margin() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp34= sd37+sd38+sd39+sd40+sd41+sd42+sd43;
    double actvalue= exp34;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp34= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp34,sd44);         
    }
//..................................................................................
	@Test(priority = 64) //Total--> Common Expense & Overheads.
    public void Total_Common_Expense_And_Overheads() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp35= cme1/100000;
    double actvalue= exp35;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp35= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp35,sd45);         
    }
//..................................................................................
	@Test(priority = 65) //Total--> PBT.
    public void Total_PBT_In_Rs_Lacs() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	double exp36= sd44-sd45;
    double actvalue= exp36;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp36= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp36,sd46);         
    }
//..................................................................................
	@Test(priority = 66) //Total-->PBT/Car
    public void PBT_Per_Car() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	double Mul1= sd46*100000;
	double exp37= Mul1/sd1;
    double actvalue= exp37;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp37= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp37,sd47);         
    }
//..................................................................................
	@Test(priority = 67) //Absorption Ratio
    public void Absorption_Ratio() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	Thread.sleep(2000);
	double Mul2= sd28*100000; 			
	double Sub3= Mul2-nc3;			
    double Sub4= Sub3-nc5;		   
    double Sub5= Sub4-nc11;		    
	double Sub6= Sub5-nc13;		
	double Sub7= Sub6-nc7;			
	double Sub8= Sub7-nc9;			
	double Add1= sd36+sd45;			
	double Mul3= Add1*100000;			
	double Sub9= (Mul3-nc7);	
	Thread.sleep(1000);
	double exp38= Sub8/Sub9;
    double actvalue= exp38;
	DecimalFormat df = new DecimalFormat("0.00");
	String roundedValue = df.format(actvalue);  			
	double roundexp38= Double.parseDouble(roundedValue);
    Assert.assertEquals(roundexp38,sd48);         
    }
//..................................................................................
	
    
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
    
    
	
	
	
	
	
}


