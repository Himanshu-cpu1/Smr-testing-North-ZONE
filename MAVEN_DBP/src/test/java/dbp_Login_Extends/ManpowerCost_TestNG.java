package dbp_Login_Extends;

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

public class ManpowerCost_TestNG extends Login_Page {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	long mc1;
	long mc2;
	long mc3;
	long mc4;
	long mc5;
	long mc6;
	long mc7;
	long mc8;
	long mc9;
	long mc10;
	long mc11;
	long mc12;
	long mc13;
	long mc14;
	long mc15;
	long mc16;
	long mc17;
	long mc18;
	long mc19;
	long mc20;
	long mc21;
	long mc22;
	long mc23;
	long mc24;
	long mc25;
	long mc26;
	long mc27;
	long mc28;
	long mc29;
	long mc30;
	long mc31;
	long mc32;
	long mc33;
	long mc34;
	long mc35;
	long mc36;
	long mc37;
	long mc38;
	long mc39;
	long mc40;
	long mc41;
	long mc42;
	long mc43;
	long mc44;
	long mc45;
	long mc46;
	long mc47;
	long mc48;
	long mc49;
	long mc50;
	long mc51;
	long mc52;
	long mc53;
	long mc54;
	long mc55;
	long mc56;
	long mc57;
	long mc58;
	long mc59;
	long mc60;
	long mc61;
	long mc62;
	long mc63;
	long mc64;
	long mc65;
	long mc66;
	long mc67;
	long mc68;
	long mc69;
	long mc70;
	long mc71;
	long mc72;
	long mc73;
	long mc74;
	long mc75;
	long mc76;
	long mc77;
	long mc78;
	long mc79;
	long mc80;
	long mc81;
	long mc82;
	long mc83;
	long mc84;
	long mc85;
	long mc86;
	long mc87;
	long mc88;
	long mc89;
	long mc90;
	long mc91;
	long mpc1;
	long mpc2;
	long mpc3;
	long mpc4;
	long mpc5;
	long mpc6;
	long mpc7;
	long mpc8;
	long mpc9;
	long mpc10;
	long mpc11;
	long mpc12;
	long mpc13;
	long mpc14;
	long mpc15;
	long mpc16;
	double nc1;
	
	@SuppressWarnings("static-access")
	@BeforeClass
	public void ManpowerCount() throws InterruptedException {	
	//......................................................................	
		Thread.sleep(3000);	
		this.driver=Login_Page.driver;	
//...................................................................................................................................................	
		//click on Manpower Cost
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")).click();        
		Thread.sleep(3000);
	}
//............................................................................................
	@Test(priority=0)   // clear the data
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
	Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
//............................................................................................................
	//Manpower Cost- New Car
	WebElement m1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
	WebElement m2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));
	WebElement m3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
	WebElement m4= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
	WebElement m5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));
	WebElement m6= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));
	WebElement m7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));
	WebElement m8= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]"));
	WebElement m9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));
	WebElement m10= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
	//Manpower Cost- MDS
	WebElement m11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));
	WebElement m12= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));
	WebElement m13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
	WebElement m14= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));
	WebElement m15= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));
	WebElement m16= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));
	WebElement m17= driver.findElement(By.xpath("(//*[@type=\"text\"])[17]"));
	WebElement m18= driver.findElement(By.xpath("(//*[@type=\"text\"])[18]"));
	WebElement m19= driver.findElement(By.xpath("(//*[@type=\"text\"])[19]"));
	WebElement m20= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]"));
	//Manpower Cost- MIR
	WebElement m21= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]"));
	WebElement m22= driver.findElement(By.xpath("(//*[@type=\"text\"])[22]"));
	WebElement m23= driver.findElement(By.xpath("(//*[@type=\"text\"])[23]"));
	WebElement m24= driver.findElement(By.xpath("(//*[@type=\"text\"])[24]"));
	WebElement m25= driver.findElement(By.xpath("(//*[@type=\"text\"])[25]"));
	WebElement m26= driver.findElement(By.xpath("(//*[@type=\"text\"])[26]"));
	WebElement m27= driver.findElement(By.xpath("(//*[@type=\"text\"])[27]"));
	WebElement m28= driver.findElement(By.xpath("(//*[@type=\"text\"])[28]"));
	WebElement m29= driver.findElement(By.xpath("(//*[@type=\"text\"])[29]"));
	WebElement m30= driver.findElement(By.xpath("(//*[@type=\"text\"])[30]"));
	//Manpower Cost- MSGA
	WebElement m31= driver.findElement(By.xpath("(//*[@type=\"text\"])[31]"));
	WebElement m32= driver.findElement(By.xpath("(//*[@type=\"text\"])[32]"));
	WebElement m33= driver.findElement(By.xpath("(//*[@type=\"text\"])[33]"));
	WebElement m34= driver.findElement(By.xpath("(//*[@type=\"text\"])[34]"));
	WebElement m35= driver.findElement(By.xpath("(//*[@type=\"text\"])[35]"));
	WebElement m36= driver.findElement(By.xpath("(//*[@type=\"text\"])[36]"));
	WebElement m37= driver.findElement(By.xpath("(//*[@type=\"text\"])[37]"));
	WebElement m38= driver.findElement(By.xpath("(//*[@type=\"text\"])[38]"));
	WebElement m39= driver.findElement(By.xpath("(//*[@type=\"text\"])[39]"));
	WebElement m40= driver.findElement(By.xpath("(//*[@type=\"text\"])[40]"));
	//Manpower Cost- True Value
	WebElement m41= driver.findElement(By.xpath("(//*[@type=\"text\"])[41]"));
	WebElement m42= driver.findElement(By.xpath("(//*[@type=\"text\"])[42]"));
	WebElement m43= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]"));
	WebElement m44= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]"));
	WebElement m45= driver.findElement(By.xpath("(//*[@type=\"text\"])[45]"));
	WebElement m46= driver.findElement(By.xpath("(//*[@type=\"text\"])[46]"));
	WebElement m47= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]"));
	WebElement m48= driver.findElement(By.xpath("(//*[@type=\"text\"])[48]"));
	WebElement m49= driver.findElement(By.xpath("(//*[@type=\"text\"])[49]"));
	WebElement m50= driver.findElement(By.xpath("(//*[@type=\"text\"])[50]"));
	//Manpower Cost- Spares
	WebElement m51= driver.findElement(By.xpath("(//*[@type=\"text\"])[51]"));
	WebElement m52= driver.findElement(By.xpath("(//*[@type=\"text\"])[52]"));
	WebElement m53= driver.findElement(By.xpath("(//*[@type=\"text\"])[53]"));
	WebElement m54= driver.findElement(By.xpath("(//*[@type=\"text\"])[54]"));
	WebElement m55= driver.findElement(By.xpath("(//*[@type=\"text\"])[55]"));
	WebElement m56= driver.findElement(By.xpath("(//*[@type=\"text\"])[56]"));
	WebElement m57= driver.findElement(By.xpath("(//*[@type=\"text\"])[57]"));
	WebElement m58= driver.findElement(By.xpath("(//*[@type=\"text\"])[58]"));
	WebElement m59= driver.findElement(By.xpath("(//*[@type=\"text\"])[59]"));
	WebElement m60= driver.findElement(By.xpath("(//*[@type=\"text\"])[60]"));
	//Manpower Cost- Service
	WebElement m61= driver.findElement(By.xpath("(//*[@type=\"text\"])[61]"));
	WebElement m62= driver.findElement(By.xpath("(//*[@type=\"text\"])[62]"));
	WebElement m63= driver.findElement(By.xpath("(//*[@type=\"text\"])[63]"));
	WebElement m64= driver.findElement(By.xpath("(//*[@type=\"text\"])[64]"));
	WebElement m65= driver.findElement(By.xpath("(//*[@type=\"text\"])[65]"));
	WebElement m66= driver.findElement(By.xpath("(//*[@type=\"text\"])[66]"));
	WebElement m67= driver.findElement(By.xpath("(//*[@type=\"text\"])[67]"));
	WebElement m68= driver.findElement(By.xpath("(//*[@type=\"text\"])[68]"));
	WebElement m69= driver.findElement(By.xpath("(//*[@type=\"text\"])[69]"));
	WebElement m70= driver.findElement(By.xpath("(//*[@type=\"text\"])[70]"));
	//Manpower Cost- Common Manpower
	WebElement m71= driver.findElement(By.xpath("(//*[@type=\"text\"])[71]"));
	WebElement m72= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));
	WebElement m73= driver.findElement(By.xpath("(//*[@type=\"text\"])[73]"));
	WebElement m74= driver.findElement(By.xpath("(//*[@type=\"text\"])[74]"));
	WebElement m75= driver.findElement(By.xpath("(//*[@type=\"text\"])[75]"));
	WebElement m76= driver.findElement(By.xpath("(//*[@type=\"text\"])[76]"));
	WebElement m77= driver.findElement(By.xpath("(//*[@type=\"text\"])[77]"));
	WebElement m78= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]"));
	WebElement m79= driver.findElement(By.xpath("(//*[@type=\"text\"])[79]"));
	WebElement m80= driver.findElement(By.xpath("(//*[@type=\"text\"])[80]"));
	//Manpower Cost- Total
	WebElement m81= driver.findElement(By.xpath("(//*[@type=\"text\"])[81]"));
	WebElement m82= driver.findElement(By.xpath("(//*[@type=\"text\"])[82]"));
	WebElement m83= driver.findElement(By.xpath("(//*[@type=\"text\"])[83]"));
	WebElement m84= driver.findElement(By.xpath("(//*[@type=\"text\"])[84]"));
	WebElement m85= driver.findElement(By.xpath("(//*[@type=\"text\"])[85]"));
	WebElement m86= driver.findElement(By.xpath("(//*[@type=\"text\"])[86]"));
	WebElement m87= driver.findElement(By.xpath("(//*[@type=\"text\"])[87]"));
	WebElement m88= driver.findElement(By.xpath("(//*[@type=\"text\"])[88]"));
	WebElement m89= driver.findElement(By.xpath("(//*[@type=\"text\"])[89]"));
	WebElement m90= driver.findElement(By.xpath("(//*[@type=\"text\"])[90]"));
	//Manpower Cost- Total Manpower Cost Per Car
	WebElement m91= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
//.................................................................................................................	
	Thread.sleep(3000);	
	
	//send values
	m4.sendKeys("-a10000.");
	m5.sendKeys("-S1000.");
	m6.sendKeys("-s20000.");
	m7.sendKeys("-f3000.");
	m14.sendKeys("-d30000.");
	m15.sendKeys("-f2000.");
	m16.sendKeys("-4e0000.");
	m17.sendKeys("-e5000.");
	m24.sendKeys("--r10000.");
	m25.sendKeys("-t4000.");
	m26.sendKeys("-S20000.");
	m27.sendKeys("-re4000.");
	m34.sendKeys("-tr10000.");
	m35.sendKeys("-ce1000..");
	m36.sendKeys("-uy40000..");
	m37.sendKeys("-fd1000.");
	m44.sendKeys("-tt50000.");
	m45.sendKeys("-t2000.");
	m46.sendKeys("-rt10000.");
	m47.sendKeys("-tre1000.");
	m54.sendKeys("-r60000.");
	m55.sendKeys("-trtr1000.");
	m56.sendKeys("-tr30000.");
	m57.sendKeys("-sd10000.");
	m64.sendKeys("-sd10000.");
	m65.sendKeys("-sd10000.");
	m66.sendKeys("-e5000.");
	m67.sendKeys("-ew50000.");
	m74.sendKeys("-ew2000.");
	m75.sendKeys("-w10000.");
	m76.sendKeys("-iu3000.");
	m77.sendKeys("-yt10000.");
	
	Thread.sleep(3000);	
	//convert into integers
	mc1=Long.parseLong(m1.getAttribute("value"));
	mc2=Long.parseLong(m2.getAttribute("value"));
	mc3=Long.parseLong(m3.getAttribute("value"));
	mc4=Long.parseLong(m4.getAttribute("value"));
	mc5=Long.parseLong(m5.getAttribute("value"));
	mc6=Long.parseLong(m6.getAttribute("value"));
	mc7=Long.parseLong(m7.getAttribute("value"));
	mc8=Long.parseLong(m8.getAttribute("value"));
	mc9=Long.parseLong(m9.getAttribute("value"));
	mc10=Long.parseLong(m10.getAttribute("value"));
	mc11=Long.parseLong(m11.getAttribute("value"));
	mc12=Long.parseLong(m12.getAttribute("value"));
	mc13=Long.parseLong(m13.getAttribute("value"));
	mc14=Long.parseLong(m14.getAttribute("value"));
	mc15=Long.parseLong(m15.getAttribute("value"));
	mc16=Long.parseLong(m16.getAttribute("value"));
	mc17=Long.parseLong(m17.getAttribute("value"));
	mc18=Long.parseLong(m18.getAttribute("value"));
	mc19=Long.parseLong(m19.getAttribute("value"));
	mc20=Long.parseLong(m20.getAttribute("value"));
	mc21=Long.parseLong(m21.getAttribute("value"));
	mc22=Long.parseLong(m22.getAttribute("value"));
	mc23=Long.parseLong(m23.getAttribute("value"));
	mc24=Long.parseLong(m24.getAttribute("value"));
	mc25=Long.parseLong(m25.getAttribute("value"));
	mc26=Long.parseLong(m26.getAttribute("value"));
	mc27=Long.parseLong(m27.getAttribute("value"));
	mc28=Long.parseLong(m28.getAttribute("value"));
	mc29=Long.parseLong(m29.getAttribute("value"));
	mc30=Long.parseLong(m30.getAttribute("value"));
	mc31=Long.parseLong(m31.getAttribute("value"));
	mc32=Long.parseLong(m32.getAttribute("value"));
	mc33=Long.parseLong(m33.getAttribute("value"));
	mc34=Long.parseLong(m34.getAttribute("value"));
	mc35=Long.parseLong(m35.getAttribute("value"));
	mc36=Long.parseLong(m36.getAttribute("value"));
	mc37=Long.parseLong(m37.getAttribute("value"));
	mc38=Long.parseLong(m38.getAttribute("value"));
	mc39=Long.parseLong(m39.getAttribute("value"));
	mc40=Long.parseLong(m40.getAttribute("value"));
	mc41=Long.parseLong(m41.getAttribute("value"));
	mc42=Long.parseLong(m42.getAttribute("value"));
	mc43=Long.parseLong(m43.getAttribute("value"));
	mc44=Long.parseLong(m44.getAttribute("value"));
	mc45=Long.parseLong(m45.getAttribute("value"));
	mc46=Long.parseLong(m46.getAttribute("value"));
	mc47=Long.parseLong(m47.getAttribute("value"));
	mc48=Long.parseLong(m48.getAttribute("value"));
	mc49=Long.parseLong(m49.getAttribute("value"));
	mc50=Long.parseLong(m50.getAttribute("value"));
	mc51=Long.parseLong(m51.getAttribute("value"));
	mc52=Long.parseLong(m52.getAttribute("value"));
	mc53=Long.parseLong(m53.getAttribute("value"));
	mc54=Long.parseLong(m54.getAttribute("value"));
	mc55=Long.parseLong(m55.getAttribute("value"));
	mc56=Long.parseLong(m56.getAttribute("value"));
	mc57=Long.parseLong(m57.getAttribute("value"));
	mc58=Long.parseLong(m58.getAttribute("value"));
	mc59=Long.parseLong(m59.getAttribute("value"));
	mc60=Long.parseLong(m60.getAttribute("value"));
	mc61=Long.parseLong(m61.getAttribute("value"));
	mc62=Long.parseLong(m62.getAttribute("value"));
	mc63=Long.parseLong(m63.getAttribute("value"));
	mc64=Long.parseLong(m64.getAttribute("value"));
	mc65=Long.parseLong(m65.getAttribute("value"));
	mc66=Long.parseLong(m66.getAttribute("value"));
	mc67=Long.parseLong(m67.getAttribute("value"));
	mc68=Long.parseLong(m68.getAttribute("value"));
	mc69=Long.parseLong(m69.getAttribute("value"));
	mc70=Long.parseLong(m70.getAttribute("value"));
	mc71=Long.parseLong(m71.getAttribute("value"));
	mc72=Long.parseLong(m72.getAttribute("value"));
	mc73=Long.parseLong(m73.getAttribute("value"));
	mc74=Long.parseLong(m74.getAttribute("value"));
	mc75=Long.parseLong(m75.getAttribute("value"));
	mc76=Long.parseLong(m76.getAttribute("value"));
	mc77=Long.parseLong(m77.getAttribute("value"));
	mc78=Long.parseLong(m78.getAttribute("value"));
	mc79=Long.parseLong(m79.getAttribute("value"));
	mc80=Long.parseLong(m80.getAttribute("value"));
	mc81=Long.parseLong(m81.getAttribute("value"));
	mc82=Long.parseLong(m82.getAttribute("value"));
	mc83=Long.parseLong(m83.getAttribute("value"));
	mc84=Long.parseLong(m84.getAttribute("value"));
	mc85=Long.parseLong(m85.getAttribute("value"));
	mc86=Long.parseLong(m86.getAttribute("value"));
	mc87=Long.parseLong(m87.getAttribute("value"));
	mc88=Long.parseLong(m88.getAttribute("value"));
	mc89=Long.parseLong(m89.getAttribute("value"));
	mc90=Long.parseLong(m90.getAttribute("value"));
	mc91=Long.parseLong(m91.getAttribute("value"));
	
	Thread.sleep(3000);	
}
//...............................................................................................................
	@Test (priority=1)
    public void Save_Data() throws InterruptedException {
    //Save data
    Thread.sleep(2000);	           
    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();     
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
	String actualMessage = Validationmessage.getText();  
    // System.out.println("actualMessage  =" +actualMessage);
	String expectedMessage = "Saved Successfully";
	Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid"); 
	
	Thread.sleep(2000);	
    }
//.................................................................................................................    
	@Test(priority = 1) //Salary Direct Manpower- New Car
    public void  NewCar_Salary_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[4]")));	    
    String NC1= N1.getAttribute("value");	
    Assert.assertTrue(NC1.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC1) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC1.matches("[0-9]+") && Long.parseLong(NC1)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 2) //Incentive Direct Manpower- New Car
    public void  NewCar_Incentive_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[5]")));	    
    String NC2= N2.getAttribute("value");	
    Assert.assertTrue(NC2.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC2) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC2.matches("[0-9]+") && Long.parseLong(NC2)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 3) //Salary InDirect Manpower- New Car
    public void  NewCar_Salary_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[6]")));	    
    String NC3= N3.getAttribute("value");	
    Assert.assertTrue(NC3.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC3) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC3.matches("[0-9]+") && Long.parseLong(NC3)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 4) //Incentive InDirect Manpower- New Car
    public void  NewCar_Incentive_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[7]")));	    
    String NC4= N4.getAttribute("value");	
    Assert.assertTrue(NC4.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC4) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC4.matches("[0-9]+") && Long.parseLong(NC4)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 5) //Total Salary- New Car
    public void  NewCar_Total_Salary() throws InterruptedException { 
    long exp1= mc4+mc6;
	Assert.assertEquals(exp1, mc8);         
    }
//..................................................................................
	@Test(priority = 6) //Total Incentive- New Car
    public void  NewCar_Total_Incentive() throws InterruptedException { 
		long exp2= mc5+mc7;
	Assert.assertEquals(exp2, mc9);         
    }
//..................................................................................
	@Test(priority = 7) //Total Manpower Cost- New Car
    public void  NewCar_Total_ManpowerCost() throws InterruptedException { 
		long exp3= mc8+mc9;
	Assert.assertEquals(exp3, mc10);         
    }
//..................................................................................
	@Test(priority = 8) //Salary Direct Manpower- MDS
    public void  MDS_Salary_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[14]")));	    
    String NC8= N8.getAttribute("value");	
    Assert.assertTrue(NC8.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC8) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC8.matches("[0-9]+") && Long.parseLong(NC8)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 9) //Incentive Direct Manpower- MDS
    public void  MDS_Incentive_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[15]")));	    
    String NC9= N9.getAttribute("value");	
    Assert.assertTrue(NC9.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC9) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC9.matches("[0-9]+") && Long.parseLong(NC9)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 10) //Salary InDirect Manpower- MDS
    public void  MDS_Salary_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[16]")));	    
    String NC10= N10.getAttribute("value");	
    Assert.assertTrue(NC10.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC10) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC10.matches("[0-9]+") && Long.parseLong(NC10)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 11) //Incentive InDirect Manpower- MDS
    public void  MDS_Incentive_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[17]")));	    
    String NC11= N11.getAttribute("value");	
    Assert.assertTrue(NC11.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC11) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC11.matches("[0-9]+") && Long.parseLong(NC11)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 12) //Total Salary- MDS
    public void  MDS_Total_Salary() throws InterruptedException { 
  	    long exp4= mc14+mc16;
	Assert.assertEquals(exp4, mc18);         
    }
//..................................................................................
	@Test(priority = 13) //Total Incentive- MDS
    public void  MDS_Total_Incentive() throws InterruptedException { 
  	    long exp5= mc15+mc17;
	Assert.assertEquals(exp5, mc19);         
    }
//..................................................................................
	@Test(priority = 14) //Total Manpower Cost- MDS
    public void  MDS_Total_ManpowerCost() throws InterruptedException { 
    long exp6= mc18+mc19;
	Assert.assertEquals(exp6, mc20);         
    }
//..................................................................................
	@Test(priority = 15) //Salary Direct Manpower- MI Renewal
    public void  MIRenewal_Salary_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[24]")));	    
    String NC15= N15.getAttribute("value");	
    Assert.assertTrue(NC15.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC15) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC15.matches("[0-9]+") && Long.parseLong(NC15)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 16) //Incentive Direct Manpower- MI Renewal
    public void  MIRenewal_Incentive_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N16= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[25]")));	    
    String NC16= N16.getAttribute("value");	
    Assert.assertTrue(NC16.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC16) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC16.matches("[0-9]+") && Long.parseLong(NC16)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 17) //Salary InDirect Manpower- MI Renewal
    public void  MIRenewal_Salary_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[26]")));	    
    String NC17= N17.getAttribute("value");	
    Assert.assertTrue(NC17.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC17) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC17.matches("[0-9]+") && Long.parseLong(NC17)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 18) //Incentive InDirect Manpower- MI Renewal
    public void  MIRenewal_Incentive_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[27]")));	    
    String NC18= N18.getAttribute("value");	
    Assert.assertTrue(NC18.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC18) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC18.matches("[0-9]+") && Long.parseLong(NC18)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 19) //Total Salary- MI Renewal
    public void  MIRenewal_Total_Salary() throws InterruptedException { 
  	    long exp7= mc24+mc26;
	Assert.assertEquals(exp7, mc28);         
    }
//..................................................................................
	@Test(priority = 20) //Total Incentive- MI Renewal
    public void  MIRenewal_Total_Incentive() throws InterruptedException { 
  	    long exp8= mc25+mc27;
	Assert.assertEquals(exp8, mc29);         
    }
//..................................................................................
	@Test(priority = 21) //Total Manpower Cost- MI Renewal
    public void  MIRenewal_Total_ManpowerCost() throws InterruptedException { 
  	    long exp9= mc28+mc29;
	Assert.assertEquals(exp9, mc30);         
    }
//..................................................................................
	@Test(priority = 22) //Salary Direct Manpower- MSGA
    public void  MSGA_Salary_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N22= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[34]")));	    
    String NC22= N22.getAttribute("value");	
    Assert.assertTrue(NC22.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC22) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC22.matches("[0-9]+") && Long.parseLong(NC22)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 23) //Incentive Direct Manpower- MSGA
    public void  MSGA_Incentive_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N23= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[35]")));	    
    String NC23= N23.getAttribute("value");	
    Assert.assertTrue(NC23.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC23) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC23.matches("[0-9]+") && Long.parseLong(NC23)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 24) //Salary InDirect Manpower- MSGA
    public void  MSGA_Salary_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N24= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[36]")));	    
    String NC24= N24.getAttribute("value");	
    Assert.assertTrue(NC24.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC24) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC24.matches("[0-9]+") && Long.parseLong(NC24)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 25) //Incentive InDirect Manpower- MSGA
    public void  MSGA_Incentive_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N25= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[37]")));	    
    String NC25= N25.getAttribute("value");	
    Assert.assertTrue(NC25.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC25) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC25.matches("[0-9]+") && Long.parseLong(NC25)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 26) //Total Salary- MSGA
    public void  MSGA_Total_Salary() throws InterruptedException { 
  	    long exp10= mc34+mc36;
	Assert.assertEquals(exp10, mc38);         
    }
//..................................................................................
	@Test(priority = 27) //Total Incentive- MSGA
    public void  MSGA_Total_Incentive() throws InterruptedException { 
  	    long exp11= mc35+mc37;
	Assert.assertEquals(exp11, mc39);         
    }
//..................................................................................
	@Test(priority = 28) //Total Manpower Cost- MSGA
    public void  MSGA_Total_ManpowerCost() throws InterruptedException { 
  	   long exp12= mc38+mc39;
	Assert.assertEquals(exp12, mc40);         
    }
//..................................................................................
	@Test(priority = 29) //Salary Direct Manpower- True Value
    public void  True_Value_Salary_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N29= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[44]")));	    
    String NC29= N29.getAttribute("value");	
    Assert.assertTrue(NC29.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC29) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC29.matches("[0-9]+") && Long.parseLong(NC29)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 30) //Incentive Direct Manpower- True Value
    public void  True_Value_Incentive_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N30= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[45]")));	    
    String NC30= N30.getAttribute("value");	
    Assert.assertTrue(NC30.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC30) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC30.matches("[0-9]+") && Long.parseLong(NC30)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 31) //Salary InDirect Manpower- True Value
    public void  True_Value_Salary_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N31= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[46]")));	    
    String NC31= N31.getAttribute("value");	
    Assert.assertTrue(NC31.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC31) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC31.matches("[0-9]+") && Long.parseLong(NC31)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 32) //Incentive InDirect Manpower- True Value
    public void  True_Value_Incentive_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N32= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[47]")));	    
    String NC32= N32.getAttribute("value");	
    Assert.assertTrue(NC32.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC32) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC32.matches("[0-9]+") && Long.parseLong(NC32)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 33) //Total Salary- True Value
    public void  True_Value_Total_Salary() throws InterruptedException { 
  	   long exp13= mc44+mc46;
	Assert.assertEquals(exp13, mc48);         
    }
//..................................................................................
	@Test(priority = 34) //Total Incentive- True Value
    public void  True_Value_Total_Incentive() throws InterruptedException { 
  	  long exp14= mc45+mc47;
	Assert.assertEquals(exp14, mc49);         
    }
//..................................................................................
	@Test(priority = 35) //Total Manpower Cost- True Value
    public void  True_Value_Total_ManpowerCost() throws InterruptedException { 
  	    long exp15= mc48+mc49;
	Assert.assertEquals(exp15, mc50);         
    }
//..................................................................................
	@Test(priority = 36) //Salary Direct Manpower- Spares
    public void  Spares_Salary_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N36= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[54]")));	    
    String NC36= N36.getAttribute("value");	
    Assert.assertTrue(NC36.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC36) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC36.matches("[0-9]+") && Long.parseLong(NC36)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 37) //Incentive Direct Manpower- Spares
    public void  Spares_Incentive_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N37= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[55]")));	    
    String NC37= N37.getAttribute("value");	
    Assert.assertTrue(NC37.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC37) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC37.matches("[0-9]+") && Long.parseLong(NC37)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 38) //Salary InDirect Manpower- Spares
    public void  Spares_Salary_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N38= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[56]")));	    
    String NC38= N38.getAttribute("value");	
    Assert.assertTrue(NC38.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC38) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC38.matches("[0-9]+") && Long.parseLong(NC38)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 39) //Incentive InDirect Manpower- Spares
    public void  Spares_Incentive_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N39= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[57]")));	    
    String NC39= N39.getAttribute("value");	
    Assert.assertTrue(NC39.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC39) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC39.matches("[0-9]+") && Long.parseLong(NC39)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 40) //Total Salary- Spares
    public void  Spares_Total_Salary() throws InterruptedException { 
  	  long exp16= mc54+mc56;
	Assert.assertEquals(exp16, mc58);         
    }
//..................................................................................
	@Test(priority = 41 ) //Total Incentive- Spares
    public void  Spares_Total_Incentive() throws InterruptedException { 
  	   long exp17= mc55+mc57;
	Assert.assertEquals(exp17, mc59);         
    }
//..................................................................................
	@Test(priority = 42) //Total Manpower Cost- Spares
    public void  Spares_Total_ManpowerCost() throws InterruptedException { 
  	  long exp18= mc58+mc59;
	Assert.assertEquals(exp18, mc60);         
    }
//..................................................................................
	@Test(priority = 43) //Salary Direct Manpower- Service
    public void  Service_Salary_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N43= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[64]")));	    
    String NC43= N43.getAttribute("value");	
    Assert.assertTrue(NC43.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC43) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC43.matches("[0-9]+") && Long.parseLong(NC43)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 44) //Incentive Direct Manpower- Service
    public void  Service_Incentive_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N44= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[65]")));	    
    String NC44= N44.getAttribute("value");	
    Assert.assertTrue(NC44.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC44) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC44.matches("[0-9]+") && Long.parseLong(NC44)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 45) //Salary InDirect Manpower- Service
    public void  Service_Salary_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N45= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[66]")));	    
    String NC45= N45.getAttribute("value");	
    Assert.assertTrue(NC45.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC45) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC45.matches("[0-9]+") && Long.parseLong(NC45)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 46) //Incentive InDirect Manpower- Service
    public void  Service_Incentive_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N46= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[67]")));	    
    String NC46= N46.getAttribute("value");	
    Assert.assertTrue(NC46.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC46) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC46.matches("[0-9]+") && Long.parseLong(NC46)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 47) //Total Salary- Service
    public void  Service_Total_Salary() throws InterruptedException { 
  	   long exp19= mc64+mc66;
	Assert.assertEquals(exp19, mc68);         
    }
//..................................................................................
	@Test(priority = 48 ) //Total Incentive- Service
    public void  Service_Total_Incentive() throws InterruptedException { 
  	 long exp20= mc65+mc67;
	Assert.assertEquals(exp20, mc69);         
    }
//..................................................................................
	@Test(priority = 49) //Total Manpower Cost- Service
    public void  Service_Total_ManpowerCost() throws InterruptedException { 
  	    long exp21= mc68+mc69;
	Assert.assertEquals(exp21, mc70);         
    }
//..................................................................................
	@Test(priority = 50) //Salary Direct Manpower- Corporate_Office
    public void  Corporate_Office_Salary_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N50= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[74]")));	    
    String NC50= N50.getAttribute("value");	
    Assert.assertTrue(NC50.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC50) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC50.matches("[0-9]+") && Long.parseLong(NC50)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 51) //Incentive Direct Manpower- Corporate_Office
    public void  Corporate_Office_Incentive_DirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N51= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[75]")));	    
    String NC51= N51.getAttribute("value");	
    Assert.assertTrue(NC51.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC51) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC51.matches("[0-9]+") && Long.parseLong(NC51)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 52) //Salary InDirect Manpower- Corporate_Office
    public void  Corporate_Office_Salary_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N52= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[76]")));	    
    String NC52= N52.getAttribute("value");	
    Assert.assertTrue(NC52.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC52) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC52.matches("[0-9]+") && Long.parseLong(NC52)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 53) //Incentive InDirect Manpower- Corporate_Office
    public void  Corporate_Office_Incentive_InDirectMP() throws InterruptedException { 
  	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement N53= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"text\"])[77]")));	    
    String NC53= N53.getAttribute("value");	
    Assert.assertTrue(NC53.length() <= 12, "Input accepts more than 12 characters");
    Assert.assertTrue(Long.parseLong(NC53) >= 0, "Input accepts negative value");	        
    Assert.assertTrue(NC53.matches("[0-9]+") && Long.parseLong(NC53)>=0, "Input accepts alphabets");         
    }
//..................................................................................
	@Test(priority = 54) //Total Salary- Corporate_Office
    public void  Corporate_Office_Total_Salary() throws InterruptedException { 
  	    long exp22= mc74+mc76;
	Assert.assertEquals(exp22, mc78);         
    }
//..................................................................................
	@Test(priority = 55 ) //Total Incentive- Corporate_Office
    public void  Corporate_Office_Total_Incentive() throws InterruptedException { 
  	  long exp23= mc75+mc77;
	Assert.assertEquals(exp23, mc79);         
    }
//..................................................................................
	@Test(priority = 56) //Total Manpower Cost- Corporate_Office
    public void  Corporate_Office_Total_ManpowerCost() throws InterruptedException { 
  	    long exp24= mc78+mc79;
	Assert.assertEquals(exp24, mc80);         
    }
//..................................................................................
	@Test(priority = 57) //Salary Direct Manpower- Total
    public void  Total_Salary_DirectMP() throws InterruptedException { 
  	    long exp25= mc4+mc14+mc24+mc34+mc44+mc54+mc64+mc74;  
    Assert.assertEquals(exp25, mc84);
    }
//..................................................................................
	@Test(priority = 58) //Incentive Direct Manpower- Total
    public void  Total_Incentive_DirectMP() throws InterruptedException { 
  	    long exp26= mc5+mc15+mc25+mc35+mc45+mc55+mc65+mc75;  
    Assert.assertEquals(exp26, mc85);
    }
//..................................................................................
	@Test(priority = 59) //Salary InDirect Manpower- Total
    public void  Total_Salary_InDirectMP() throws InterruptedException { 
  	  long exp27= mc6+mc16+mc26+mc36+mc46+mc56+mc66+mc76;  
    Assert.assertEquals(exp27, mc86);         
    }
//..................................................................................
	@Test(priority = 60) //Incentive InDirect Manpower- Total
    public void  Total_Incentive_InDirectMP() throws InterruptedException { 
  	  long exp28= mc7+mc17+mc27+mc37+mc47+mc57+mc67+mc77;  
    Assert.assertEquals(exp28, mc87);
    }
//..................................................................................
	@Test(priority = 61) //Total Salary- Total
    public void  Total_Total_Salary() throws InterruptedException { 
  	   long exp29= mc8+mc18+mc28+mc38+mc48+mc58+mc68+mc78;
	Assert.assertEquals(exp29, mc88);         
    }
//..................................................................................
	@Test(priority = 62 ) //Total Incentive- Total
    public void  Total_Total_Incentive() throws InterruptedException { 
  	  long exp30= mc9+mc19+mc29+mc39+mc49+mc59+mc69+mc79;
	Assert.assertEquals(exp30, mc89);         
    }
//..................................................................................
	@Test(priority = 63) //Total Manpower Cost- Total
    public void  Total_Total_ManpowerCost() throws InterruptedException { 
  	  long exp31= mc10+mc20+mc30+mc40+mc50+mc60+mc70+mc80;
	Assert.assertEquals(exp31, mc90);         
    }
//..................................................................................
	@Test(priority = 64)
    public void ClickOn_ManpowerCount_NewCar() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[5]")).click();
	Thread.sleep(3000);
	
	WebElement mp1= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	WebElement mp2= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	
	//convert into integers
	mpc1= Long.parseLong(mp1.getAttribute("value"));
	mpc2= Long.parseLong(mp2.getAttribute("value"));
	
	}
//..........................................................................................................................	
	@Test(priority = 65) //New Car- Total Direct MP
    public void  NewCar_Total_Direct_ManpowerCount() throws InterruptedException { 
  	  Assert.assertEquals(mc1, mpc1);            
    }
//..................................................................................
	@Test(priority = 66) //New Car- Total InDirect MP
    public void  NewCar_Total_InDirect_ManpowerCount() throws InterruptedException { 
    Assert.assertEquals(mc2, mpc2);            
    }
//..................................................................................
	@Test(priority = 67)
    public void ClickOn_ManpowerCount_MSGA() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[2]")).click();
	Thread.sleep(3000);
	
	WebElement mp3= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	WebElement mp4= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	
	//convert into integers
	mpc3= Long.parseLong(mp3.getAttribute("value"));
	mpc4= Long.parseLong(mp4.getAttribute("value"));
	
	}
//..........................................................................................................................	
	@Test(priority = 68) //MSGA- Total Direct MP
    public void  MSGA_Total_Direct_ManpowerCount() throws InterruptedException { 
  	  Assert.assertEquals(mc31, mpc3);            
    }
//..................................................................................
	@Test(priority = 69) //MSGA- Total InDirect MP
    public void  MSGA_Total_InDirect_ManpowerCount() throws InterruptedException { 
  	  Assert.assertEquals(mc32, mpc4);            
    }
//..................................................................................
	@Test(priority = 70)
    public void ClickOn_ManpowerCount_WBSP() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[3]")).click();
	Thread.sleep(3000);
	
	WebElement mp5= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
	WebElement mp6= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
	
	//convert into integers
	mpc5= Long.parseLong(mp5.getAttribute("value"));
	mpc6= Long.parseLong(mp6.getAttribute("value"));
	
	}
//..........................................................................................................................	
	@Test(priority = 71) //Service- Total Direct MP
    public void  WSBP_Total_Direct_ManpowerCount() throws InterruptedException { 
  	 Assert.assertEquals(mc61, mpc5);            
    }
//..................................................................................
	@Test(priority = 72) //Service- Total InDirect MP
    public void  WSBP_Total_InDirect_ManpowerCount() throws InterruptedException { 
     Assert.assertEquals(mc62, mpc6);            
    }
//..................................................................................
	@Test(priority = 73)
    public void ClickOn_ManpowerCount_Spares() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[4]")).click();
	Thread.sleep(3000);
	
	WebElement mp7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement mp8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	
	//convert into integers
	mpc7= Long.parseLong(mp7.getAttribute("value"));
	mpc8= Long.parseLong(mp8.getAttribute("value"));
	
	}
//..........................................................................................................................	
	@Test(priority = 74) //Spares- Total Direct MP
    public void  Spares_Total_Direct_ManpowerCount() throws InterruptedException { 
  	  Assert.assertEquals(mc51, mpc7);            
    }
//..........................................................................................................................
	@Test(priority = 75) //Spares- Total InDirect MP
    public void  Spares_Total_InDirect_ManpowerCount() throws InterruptedException { 
  	  Assert.assertEquals(mc52, mpc8);            
    }
//..........................................................................................................................
	@Test(priority = 76)
    public void ClickOn_ManpowerCount_True_Value() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[5]")).click();
	Thread.sleep(3000);
	
	WebElement mp9= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	WebElement mp10= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	
	//convert into integers
	mpc9= Long.parseLong(mp9.getAttribute("value"));
	mpc10= Long.parseLong(mp10.getAttribute("value"));
	
	}
//..........................................................................................................................	
	@Test(priority = 77) //True Value- Total Direct MP
    public void  TrueValue_Total_Direct_ManpowerCount() throws InterruptedException { 
  	 Assert.assertEquals(mc41, mpc9);            
    }
//..........................................................................................................................
	@Test(priority = 78) //True Value- Total InDirect MP
    public void  TrueValue_Total_InDirect_ManpowerCount() throws InterruptedException { 
  	 Assert.assertEquals(mc42, mpc10);            
    }
//..........................................................................................................................
	@Test(priority = 79)
    public void ClickOn_ManpowerCount_MIRenewal() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[6]")).click();
	Thread.sleep(3000);
	
	WebElement mp11= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	WebElement mp12= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	
	//convert into integers
	mpc11= Long.parseLong(mp11.getAttribute("value"));
	mpc12= Long.parseLong(mp12.getAttribute("value"));
	
	}
//..........................................................................................................................	
	@Test(priority = 80) //MI Renewal- Total Direct MP
    public void  MIRenewal_Total_Direct_ManpowerCount() throws InterruptedException { 
  	 Assert.assertEquals(mc21, mpc11);            
    }
//..........................................................................................................................
	@Test(priority = 81) //MI Renewal- Total InDirect MP
    public void  MIRenewal_Total_InDirect_ManpowerCount() throws InterruptedException { 
  	Assert.assertEquals(mc22, mpc12);            
    }
//..........................................................................................................................
	@Test(priority = 82)
    public void ClickOn_ManpowerCount_MDS() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[7]")).click();
	Thread.sleep(3000);
	
	WebElement mp13= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	WebElement mp14= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	
	//convert into integers
	mpc13= Long.parseLong(mp13.getAttribute("value"));
	mpc14= Long.parseLong(mp14.getAttribute("value"));
	
	}
//..........................................................................................................................	
	@Test(priority = 83) //MDS- Total Direct MP
    public void  MDS_Total_Direct_ManpowerCount() throws InterruptedException { 
  	 Assert.assertEquals(mc11, mpc13);            
    }
//..........................................................................................................................
	@Test(priority = 84) //MDS- Total InDirect MP
    public void  MDS_Total_InDirect_ManpowerCount() throws InterruptedException { 
  	 Assert.assertEquals(mc12, mpc14);            
    }
//..........................................................................................................................
	@Test(priority = 85)
    public void ClickOn_ManpowerCount_CommonManpower() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-tab-label-content\"])[8]")).click();
	Thread.sleep(3000);
	
	WebElement mp15= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	WebElement mp16= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	
	//convert into integers
	mpc15= Long.parseLong(mp15.getAttribute("value"));
	mpc16= Long.parseLong(mp16.getAttribute("value"));
	
	}
//..........................................................................................................................	
	@Test(priority = 86) //Common Manpower- Total Direct MP
    public void  CommonManpower_Total_Direct_ManpowerCount() throws InterruptedException { 
     Assert.assertEquals(mc71, mpc15);            
    }
//..........................................................................................................................
	@Test(priority = 87) //MDS- Total InDirect MP
    public void  CommonManpower_Total_InDirect_ManpowerCount() throws InterruptedException { 
  	 Assert.assertEquals(mc72, mpc16);            
    }
//..........................................................................................................................
	//navigate to New Car
	@Test(priority = 88)
    public void ClickOn_New_Car() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();
	Thread.sleep(3000);	
	
	WebElement n1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
	//convert into integer
	nc1= Long.parseLong(n1.getAttribute("value"));
	}
//....................................................................................................................	
	@Test(priority = 89) //calculate Total Manpower Cost Per Car
    public void  Total_Manpower_Cost_Per_Car() throws InterruptedException { 
  	double exp32= mc90/nc1;
    long roundexp32= Math.round(exp32);
    Assert.assertEquals(roundexp32, mc91);            
    }
//..........................................................................................................................
	//navigate back to Manpower Cost
	@Test(priority = 90)
    public void ClickOn_ManpowerCost_Again() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class=\"mat-line f1\"])")).click();
	Thread.sleep(3000);
	}
 //......................................................................................................................... 
	@Test(priority = 91 ) //New Car- Total Manpower
    public void  New_Car_Total_ManpowerCount() throws InterruptedException { 
  	long exp33= mc1+mc2;
	Assert.assertEquals(exp33, mc3);         
    }
//..................................................................................
	@Test(priority = 92 ) //MDS- Total Manpower
    public void  MDS_Total_ManpowerCount() throws InterruptedException { 
  	   long exp34= mc11+mc12;
	Assert.assertEquals(exp34, mc13);         
    }
//..................................................................................
	@Test(priority = 93 ) //MI Renewal- Total Manpower
    public void  MI_Renewal_Total_ManpowerCount() throws InterruptedException { 
  	  long exp35= mc21+mc22;
	Assert.assertEquals(exp35, mc23);         
    }
//..................................................................................
	@Test(priority = 94 ) //MSGA- Total Manpower
    public void  MSGA_Total_ManpowerCount() throws InterruptedException { 
    long exp36= mc31+mc32;
	Assert.assertEquals(exp36, mc33);         
    }
//..................................................................................
	@Test(priority = 95 ) //True Value- Total Manpower
    public void  True_Value_Total_ManpowerCount() throws InterruptedException { 
  	  long exp37= mc41+mc42;
	Assert.assertEquals(exp37, mc43);         
    }
//..................................................................................
	@Test(priority = 96 ) //Spares- Total Manpower
    public void  Spares_Total_ManpowerCount() throws InterruptedException { 
  	 long exp38= mc51+mc52;
	Assert.assertEquals(exp38, mc53);         
    }
//..................................................................................
	@Test(priority = 97 ) //Service- Total Manpower
    public void  Service_Total_ManpowerCount() throws InterruptedException { 
  	  long exp39= mc61+mc62;
	Assert.assertEquals(exp39, mc63);         
    }
//..................................................................................
	@Test(priority = 98 ) //Common Manpower- Total Manpower
    public void  Common_Manpower_Total_ManpowerCount() throws InterruptedException { 
  	   long exp40= mc71+mc72;
	Assert.assertEquals(exp40, mc73);         
    }
//..................................................................................
	@Test(priority = 99 ) //Total- Total Manpower
    public void  Total_Total_ManpowerCount() throws InterruptedException { 
  	  long exp41= mc81+mc82;
	Assert.assertEquals(exp41, mc83);         
    }
//..................................................................................
	@Test(priority = 100 ) //Total Direct Manpower
    public void  Total_Direct_ManpowerCount() throws InterruptedException { 
  	 long exp42= mc1+mc11+mc21+mc31+mc41+mc51+mc61+mc71;
	Assert.assertEquals(exp42, mc81);         
    }
//..................................................................................
	@Test(priority = 101 ) //Total InDirect Manpower
    public void  Total_InDirect_ManpowerCount() throws InterruptedException { 
  	  long exp43= mc2+mc12+mc22+mc32+mc42+mc52+mc62+mc72;
	Assert.assertEquals(exp43, mc82);         
    }
//..................................................................................
	
	@AfterClass
    public void tearDown () {	
  		 driver.quit();
    }
	
	
			
}		


