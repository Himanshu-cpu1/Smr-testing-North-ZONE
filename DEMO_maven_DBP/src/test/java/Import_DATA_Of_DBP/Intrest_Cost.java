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

public class Intrest_Cost extends Login_Page {
	public WebDriver driver;
	public WebDriverWait wait;
	
	long ic1;
	long ic2;
	long ic3;
	long ic4;
	long ic5;
	long ic6;
	long ic7;
	long ic8;
	long ic9;
	long ic10;
	long ic11;
	long ic12;
	long ic13;
	long ic14;
	long ic15;
	long ic16;
	long ic17;
	long ic18;
	long ic19;
	long ic20;
	long ic21;
	long ic22;
	long ic23;
	long ic24;
	
	long ic25;
	long ic26;
	long ic27;
	long ic28;
	long ic29;
	long ic30;
	long ic31;
	long ic32;
	long ic33;
	long ic34;
	long ic35;
	long ic36;
	
	
	long ic37;
	long ic38;
	long ic39;
	long ic40;
	long ic41;
	long ic42;
	long ic43;
	long ic44;
	long ic45;
	
	long ic46;
	long ic47;
	long ic48;
	long ic49;
	long ic50;
	long ic51;
	long ic52;
	long ic53;
	long ic54;
	
	long ic55;
	long ic56;
	long ic57;
	long ic58;
	long ic59;
	long ic60;
	long ic61;
	long ic62;
	long ic63;
	
	long ic64;
	long ic65;
	long ic66;
	long ic67;
	long ic68;
	long ic69;
	long ic70;
	long ic71;
	long ic72;
	
	long ic73;
	long ic74;
	long ic75;
	long ic76;
	long ic77;
	long ic78;
	long ic79;
	long ic80;
	long ic81;
	long ic82;
	long ic83;
	long ic84;
	long ic85;
	long ic86;
	long ic87;
	long ic88;
	long ic89;
	
	long ic90;
	long ic91;
	long ic92;
	long ic93;
	long ic94;
	long ic95;
	long ic96;
	long ic97;
	long ic98;
	long ic99;
	
	double N1;
	double NC;
	double NC1;
	

	@BeforeClass
		public void begin() throws InterruptedException {
//....................................................................................................
		
		this.driver=Login_Page.driver; // call the login paage 
		
//............................................................................................		
 //....................................Click on the Intrest Costt........................................................
		       
	    
	           Thread.sleep(2000);
		       driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[4]")).click();        
		       Thread.sleep(3000);
//.......................................................................................................
//	}
//	        @Test(priority=0)   // clear the data
//	          	public void clearData() throws InterruptedException {
//			    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//			    Thread.sleep(1000);
//			    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//			    Thread.sleep(2000);
//			    
//			       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//				   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Cleared Successfully')]")));
//				   String actualMessage = Validationmessage.getText();
//				   
//				   System.out.println("clear data Message  =" +actualMessage);
//				   String expectedMessage = "Cleared Successfully";
//				   Assert.assertEquals(actualMessage, expectedMessage, " Clear Data  is Invalid");
//				   		
	//.................................................................................................		    
			    WebElement i1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
			    WebElement i2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
			    WebElement i3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
			    WebElement i4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
			    WebElement i5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
			    WebElement i6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
			    WebElement i7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
			    WebElement i8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
			    WebElement i9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
			    WebElement i10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
			    WebElement i11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
			    WebElement i12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
			    WebElement i13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
			    WebElement i14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
			    WebElement i15= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
			    WebElement i16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
			    WebElement i17= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
			    WebElement i18= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
			    WebElement i19= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
			    WebElement i20= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
			    WebElement i21= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
			    WebElement i22= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
			    WebElement i23= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
			    WebElement i24= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
			    WebElement i25= driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
			    WebElement i26= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
			    WebElement i27= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
			    WebElement i28= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
			    WebElement i29= driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
			    WebElement i30= driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
			    WebElement i31= driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
			    WebElement i32= driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
			    WebElement i33= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
			    WebElement i34= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
			    WebElement i35= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
			    WebElement i36= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
			    WebElement i37= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
			    WebElement i38= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
			    WebElement i39= driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
			    WebElement i40= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
			    WebElement i41= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
			    WebElement i42= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
			    WebElement i43= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
			    WebElement i44= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
			    WebElement i45= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
			    WebElement i46= driver.findElement(By.xpath("(//*[@type=\"number\"])[46]"));
			    WebElement i47= driver.findElement(By.xpath("(//*[@type=\"number\"])[47]"));
			    WebElement i48= driver.findElement(By.xpath("(//*[@type=\"number\"])[48]"));
			    WebElement i49= driver.findElement(By.xpath("(//*[@type=\"number\"])[49]"));
			    WebElement i50= driver.findElement(By.xpath("(//*[@type=\"number\"])[50]"));
			    WebElement i51= driver.findElement(By.xpath("(//*[@type=\"number\"])[51]"));
			    WebElement i52= driver.findElement(By.xpath("(//*[@type=\"number\"])[52]"));
			    WebElement i53= driver.findElement(By.xpath("(//*[@type=\"number\"])[53]"));
			    WebElement i54= driver.findElement(By.xpath("(//*[@type=\"number\"])[54]"));
			    WebElement i55= driver.findElement(By.xpath("(//*[@type=\"number\"])[55]"));
			    WebElement i56= driver.findElement(By.xpath("(//*[@type=\"number\"])[56]"));
			    WebElement i57= driver.findElement(By.xpath("(//*[@type=\"number\"])[57]"));
			    WebElement i58= driver.findElement(By.xpath("(//*[@type=\"number\"])[58]"));
			    WebElement i59= driver.findElement(By.xpath("(//*[@type=\"number\"])[59]"));
			    WebElement i60= driver.findElement(By.xpath("(//*[@type=\"number\"])[60]"));
			    WebElement i61= driver.findElement(By.xpath("(//*[@type=\"number\"])[61]"));
			    WebElement i62= driver.findElement(By.xpath("(//*[@type=\"number\"])[62]"));
			    WebElement i63= driver.findElement(By.xpath("(//*[@type=\"number\"])[63]"));
			    WebElement i64= driver.findElement(By.xpath("(//*[@type=\"number\"])[64]"));
			    WebElement i65= driver.findElement(By.xpath("(//*[@type=\"number\"])[65]"));
			    WebElement i66= driver.findElement(By.xpath("(//*[@type=\"number\"])[66]"));
			    WebElement i67= driver.findElement(By.xpath("(//*[@type=\"number\"])[67]"));
			    WebElement i68= driver.findElement(By.xpath("(//*[@type=\"number\"])[68]"));
			    WebElement i69= driver.findElement(By.xpath("(//*[@type=\"number\"])[69]"));
			    WebElement i70= driver.findElement(By.xpath("(//*[@type=\"number\"])[70]"));
			    WebElement i71= driver.findElement(By.xpath("(//*[@type=\"number\"])[71]"));
			    WebElement i72= driver.findElement(By.xpath("(//*[@type=\"number\"])[72]"));
			    WebElement i73= driver.findElement(By.xpath("(//*[@type=\"number\"])[73]"));
			    WebElement i74= driver.findElement(By.xpath("(//*[@type=\"number\"])[74]"));
			    WebElement i75= driver.findElement(By.xpath("(//*[@type=\"number\"])[75]"));
			    WebElement i76= driver.findElement(By.xpath("(//*[@type=\"number\"])[76]"));
			    WebElement i77= driver.findElement(By.xpath("(//*[@type=\"number\"])[77]"));
			    WebElement i78= driver.findElement(By.xpath("(//*[@type=\"number\"])[78]"));
			    WebElement i79= driver.findElement(By.xpath("(//*[@type=\"number\"])[79]"));
			    WebElement i80= driver.findElement(By.xpath("(//*[@type=\"number\"])[80]"));
			    WebElement i81= driver.findElement(By.xpath("(//*[@type=\"number\"])[81]"));
			    WebElement i82= driver.findElement(By.xpath("(//*[@type=\"number\"])[82]"));
			    WebElement i83= driver.findElement(By.xpath("(//*[@type=\"number\"])[83]"));
			    WebElement i84= driver.findElement(By.xpath("(//*[@type=\"number\"])[84]"));
			    WebElement i85= driver.findElement(By.xpath("(//*[@type=\"number\"])[85]"));
			    WebElement i86= driver.findElement(By.xpath("(//*[@type=\"number\"])[86]"));
			    WebElement i87= driver.findElement(By.xpath("(//*[@type=\"number\"])[87]"));
			    WebElement i88= driver.findElement(By.xpath("(//*[@type=\"number\"])[88]"));
			    WebElement i89= driver.findElement(By.xpath("(//*[@type=\"number\"])[89]"));
			    WebElement i90= driver.findElement(By.xpath("(//*[@type=\"number\"])[90]"));
			    WebElement i91= driver.findElement(By.xpath("(//*[@type=\"number\"])[91]"));
			    WebElement i92= driver.findElement(By.xpath("(//*[@type=\"number\"])[92]"));
			    WebElement i93= driver.findElement(By.xpath("(//*[@type=\"number\"])[93]"));
			    WebElement i94= driver.findElement(By.xpath("(//*[@type=\"number\"])[94]"));
			    WebElement i95= driver.findElement(By.xpath("(//*[@type=\"number\"])[95]"));
			    WebElement i96= driver.findElement(By.xpath("(//*[@type=\"number\"])[96]"));
			    WebElement i97= driver.findElement(By.xpath("(//*[@type=\"number\"])[97]"));
			    WebElement i98= driver.findElement(By.xpath("(//*[@type=\"number\"])[98]"));
			    WebElement i99= driver.findElement(By.xpath("(//*[@type=\"number\"])[99]"));
			    	    
//			    //send the values
//			    i1.sendKeys("-jk.10670.");
//			    i2.sendKeys(".kh200987.");
//			    i3.sendKeys(".h300765.");
//			    i4.sendKeys("-Ds400875.");
//			    i5.sendKeys("-Sd50096.");
//			    i6.sendKeys("600647");
//			    i7.sendKeys("-Ds400875-.");	    
//			    i9.sendKeys("-G800486.");
//			    i10.sendKeys("-KH900846.");
//			    i11.sendKeys("-kL100064.");
//			    i12.sendKeys("-Hg100567.");
//			    i13.sendKeys("-K200987.");
//			    i14.sendKeys("-G30098.");
//			    i15.sendKeys("-D40008.");	   
//			    i25.sendKeys("-O50076.");
//			    i26.sendKeys("-JH60087.");
//			    i27.sendKeys("-LGGF70098.");
//			    i28.sendKeys("-PO80098.");
//			    i29.sendKeys("-9M0067.");
//			    i30.sendKeys("-S100780.");
//			    i31.sendKeys("-LG10078.");	    
//			    i33.sendKeys("-M20098.");
//			    i34.sendKeys("-DE30065.");
//			    i35.sendKeys("-H40089.");
//			    i36.sendKeys("-()JG500.");
//			    i37.sendKeys("-DE30065.");
//			    i38.sendKeys("-M20098.");
//			    i39.sendKeys("-9M0067.");	 
//			    i50.sendKeys("-M20098.");
//			    i51.sendKeys("-DE30065.");
//			    i52.sendKeys("-LGGF70098.");
//			    i53.sendKeys("-ka^&&*(&&*978686.8");
//			    i54.sendKeys("-ka^&&*(&&*978686.8");
//			    i55.sendKeys("jh^&_*&*87878.7");
//			    i56.sendKeys("-ka^&&*(&&*9786868.");	 
//			    i58.sendKeys("-9M0067.");
//			    i59.sendKeys("-ka^&&*(&&*96868.");
//			    i60.sendKeys("-ui7H79978");
//			    i61.sendKeys("-ka^&&*(&&*9786868.");
//			    i62.sendKeys("-ka^&&*(&&*9786868.");
//			    i63.sendKeys("-ka^&&*(&&*9786868.");
//			    i64.sendKeys("-()JG500.");	   
//			    i74.sendKeys("-()JG500.");
//			    i75.sendKeys("-D40008.");
//			    i76.sendKeys("-D40008.");
//			    i77.sendKeys("-D4540008.");
//			    i78.sendKeys("-hh40008.");
//			    i79.sendKeys("-z$D7770008.");
//			    i80.sendKeys("-SSD40008.");	   
//			    i82.sendKeys("-!!D40008.");
//			    i83.sendKeys("-D40008.");
//			    i84.sendKeys("-()JG500");
//			    i85.sendKeys("-ka^&&*(&&*1700868.");
//			    i86.sendKeys("-ka^&&*(&&*0106868.");
//			    i87.sendKeys("-()JG500.");
//			    i88.sendKeys("-ka^&&*(&&*9700868."); 
//			  	    
			    //convert longo longegers
			     ic1= Long.parseLong(i1.getAttribute("value"));
			     ic2= Long.parseLong(i2.getAttribute("value"));
			     ic3= Long.parseLong(i3.getAttribute("value"));
			     ic4= Long.parseLong(i4.getAttribute("value"));
			     ic5= Long.parseLong(i5.getAttribute("value"));
			     ic6= Long.parseLong(i6.getAttribute("value"));
			     ic7= Long.parseLong(i7.getAttribute("value"));
			     ic8= Long.parseLong(i8.getAttribute("value"));
			     ic9= Long.parseLong(i9.getAttribute("value"));
			     ic10= Long.parseLong(i10.getAttribute("value"));
			     ic11= Long.parseLong(i11.getAttribute("value"));
			     ic12= Long.parseLong(i12.getAttribute("value"));
			     ic13= Long.parseLong(i13.getAttribute("value"));
			     ic14= Long.parseLong(i14.getAttribute("value"));
			     ic15= Long.parseLong(i15.getAttribute("value"));
			     ic16= Long.parseLong(i16.getAttribute("value"));
			     ic17= Long.parseLong(i17.getAttribute("value"));
			     ic18= Long.parseLong(i18.getAttribute("value"));
			     ic19= Long.parseLong(i19.getAttribute("value"));
			     ic20= Long.parseLong(i20.getAttribute("value"));
			     ic21= Long.parseLong(i21.getAttribute("value"));
			     ic22= Long.parseLong(i22.getAttribute("value"));
			     ic23= Long.parseLong(i23.getAttribute("value"));
			     ic24= Long.parseLong(i24.getAttribute("value"));
			     ic25= Long.parseLong(i25.getAttribute("value"));
			     ic26= Long.parseLong(i26.getAttribute("value"));
			     ic27= Long.parseLong(i27.getAttribute("value"));
			     ic28= Long.parseLong(i28.getAttribute("value"));
			     ic29= Long.parseLong(i29.getAttribute("value"));
			     ic30= Long.parseLong(i30.getAttribute("value"));
			     ic31= Long.parseLong(i31.getAttribute("value"));
			     ic32= Long.parseLong(i32.getAttribute("value"));
			     ic33= Long.parseLong(i33.getAttribute("value"));	    	   
			     ic34= Long.parseLong(i34.getAttribute("value"));
			     ic35= Long.parseLong(i35.getAttribute("value"));
			     ic36= Long.parseLong(i36.getAttribute("value"));
			     ic37= Long.parseLong(i37.getAttribute("value"));
			     ic38= Long.parseLong(i38.getAttribute("value"));
			     ic39= Long.parseLong(i39.getAttribute("value"));
			     ic40= Long.parseLong(i40.getAttribute("value"));
			     ic41= Long.parseLong(i41.getAttribute("value"));
			     ic42= Long.parseLong(i42.getAttribute("value"));
			     ic43= Long.parseLong(i43.getAttribute("value"));
			     ic44= Long.parseLong(i44.getAttribute("value"));
			     ic45= Long.parseLong(i45.getAttribute("value"));
			     ic46= Long.parseLong(i46.getAttribute("value"));
			     ic47= Long.parseLong(i47.getAttribute("value"));
			     ic48= Long.parseLong(i48.getAttribute("value"));
			     ic49= Long.parseLong(i49.getAttribute("value"));	    
			     ic50= Long.parseLong(i50.getAttribute("value"));
			     ic51= Long.parseLong(i51.getAttribute("value"));
			     ic52= Long.parseLong(i52.getAttribute("value"));
			     ic53= Long.parseLong(i53.getAttribute("value"));
			     ic54= Long.parseLong(i54.getAttribute("value"));
			     ic55= Long.parseLong(i55.getAttribute("value"));
			     ic56= Long.parseLong(i56.getAttribute("value"));
			     ic57= Long.parseLong(i57.getAttribute("value"));
			     ic58= Long.parseLong(i58.getAttribute("value"));
			     ic59= Long.parseLong(i59.getAttribute("value"));
			     ic60= Long.parseLong(i60.getAttribute("value"));
			     ic61= Long.parseLong(i61.getAttribute("value"));
			     ic62= Long.parseLong(i62.getAttribute("value"));
			     ic63= Long.parseLong(i63.getAttribute("value"));
			     ic64= Long.parseLong(i64.getAttribute("value"));
			     ic65= Long.parseLong(i65.getAttribute("value"));	
			     ic66= Long.parseLong(i66.getAttribute("value"));
			     ic67= Long.parseLong(i67.getAttribute("value"));
			     ic68= Long.parseLong(i68.getAttribute("value"));
			     ic69= Long.parseLong(i69.getAttribute("value"));
			     ic70= Long.parseLong(i70.getAttribute("value"));
			     ic71= Long.parseLong(i71.getAttribute("value"));
			     ic72= Long.parseLong(i72.getAttribute("value"));
			     ic73= Long.parseLong(i73.getAttribute("value"));
			     ic74= Long.parseLong(i74.getAttribute("value"));
			     ic75= Long.parseLong(i75.getAttribute("value"));
			     ic76= Long.parseLong(i76.getAttribute("value"));
			     
			     ic77= Long.parseLong(i77.getAttribute("value"));
			     ic78= Long.parseLong(i78.getAttribute("value"));
			     ic79= Long.parseLong(i79.getAttribute("value"));
			     ic80= Long.parseLong(i80.getAttribute("value"));
			     ic81= Long.parseLong(i81.getAttribute("value"));
			     ic82= Long.parseLong(i82.getAttribute("value"));
			     ic83= Long.parseLong(i83.getAttribute("value"));
			     ic84= Long.parseLong(i84.getAttribute("value"));
			     ic85= Long.parseLong(i85.getAttribute("value"));
			     ic86= Long.parseLong(i86.getAttribute("value"));
			     ic87= Long.parseLong(i87.getAttribute("value"));
			     ic88= Long.parseLong(i88.getAttribute("value"));
			     ic89= Long.parseLong(i89.getAttribute("value"));
			     
			     ic90= Long.parseLong(i90.getAttribute("value"));
			     ic91= Long.parseLong(i91.getAttribute("value"));
			     ic92= Long.parseLong(i92.getAttribute("value"));
			     ic93= Long.parseLong(i93.getAttribute("value"));
			     ic94= Long.parseLong(i94.getAttribute("value"));
			     ic95= Long.parseLong(i95.getAttribute("value"));
			     ic96= Long.parseLong(i96.getAttribute("value"));
			     ic97= Long.parseLong(i97.getAttribute("value"));
			     ic98= Long.parseLong(i98.getAttribute("value"));
			     ic99= Long.parseLong(i99.getAttribute("value"));
			     
			     
			     NC= Double.parseDouble(i48.getAttribute("value"));
			     NC1= Long.parseLong(i97.getAttribute("value"));
	        }	        
	     

//	 // Save the Data
//     @Test (priority=1)
//     public void Save_the_Data() throws InterruptedException {
//      //  save data
//       Thread.sleep(1000);	           
//       driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click(); 
//       driver.findElement(By.cssSelector("[class=\"save\"]")).click();
//       
//       wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	   WebElement Validationmessage= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Saved Successfully')]")));
//	   String actualMessage = Validationmessage.getText();
//	   
//	  // System.out.println("actualMessage  =" +actualMessage);
//	   String expectedMessage = "Saved Successfully";
//	   Assert.assertEquals(actualMessage, expectedMessage, " Message is Invalid");
//	   
//	   
//      
//}
	 //..................................................................................
          @Test(priority=2)
          public void  Short_Term_Loan_From_Banks_Financial_Institutions_In_NEW_Cars() throws InterruptedException {  
        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));
     				  			    
      	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
          }             
          
      //..................................................................................
          @Test(priority=3)
          public void Short_Term_Loan_From_Banks_Financial_Institutions_in_MSGA() throws InterruptedException {         	  
        	  wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));
      	       			    
      	       String Intrest2= i2.getAttribute("value");	
			   Assert.assertTrue(Intrest2.length() <= 12, "Input accepts more than 12 characters  ");
	           Assert.assertTrue(Long.parseLong(Intrest2) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest2.matches("[0-9]+") && Long.parseLong(Intrest2)>=0, "Input accepts alphabet ");
	           
          }
    //..................................................................................................
             @Test(priority=4)
              public void Short_Term_Loan_From_Banks_Financial_Institutions_in_Service() throws InterruptedException {  
        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));
			   
			   String Intrest3= i3.getAttribute("value");	
			   Assert.assertTrue(Intrest3.length() <= 12, "Input accepts more than 12 characters  ");
	           Assert.assertTrue(Long.parseLong(Intrest3) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest3.matches("[0-9]+") && Long.parseLong(Intrest3)>=0, "Input accepts alphabet ");
			   
			   ic3= Long.parseLong(i3.getAttribute("value"));
             }
     
//     //......................................................................................................
             @Test(priority=5)
              public void Short_Term_Loan_From_Banks_Financial_Institutions_in_Spares() throws InterruptedException {  
        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));
			//   i4.sendKeys("-340006D.d");
			   
			   String Intrest4= i4.getAttribute("value");	
			   Assert.assertTrue(Intrest4.length() <= 12, "Input accepts more than 12 characters  ");
	           Assert.assertTrue(Long.parseLong(Intrest4) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest4.matches("[0-9]+") && Long.parseLong(Intrest4)>=0, "Input accepts alphabet ");
			   
			   ic4= Long.parseLong(i4.getAttribute("value"));
             }
////.....................................................................................................................
	             @Test(priority=6)
	              public void Short_Term_Loan_From_Banks_Financial_Institutions_in_POC() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));
								   
				   String Intrest5= i5.getAttribute("value");	
				   Assert.assertTrue(Intrest5.length() <= 12, "Input accepts more than 12 characters  ");
		           Assert.assertTrue(Long.parseLong(Intrest5) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest5.matches("[0-9]+") && Long.parseLong(Intrest5)>=0, "Input accepts alphabet ");
				   
				   ic5= Long.parseLong(i5.getAttribute("value"));
	             }
////...........................................................................................................................
	             @Test(priority=7)
	              public void Short_Term_Loan_From_Banks_Financial_Institutions_in_MI() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));
				//   i6.sendKeys("-A70060.d");
				   
				   String Intrest6= i6.getAttribute("value");	
				   Assert.assertTrue(Intrest6.length() <= 12, "Input accepts more than 12 characters  ");
		           Assert.assertTrue(Long.parseLong(Intrest6) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest6.matches("[0-9]+") && Long.parseLong(Intrest6)>=0, "Input accepts alphabet ");
				   
				   ic6= Long.parseLong(i6.getAttribute("value"));
	             }
////........................................................................................................................
	             @Test(priority=8)
	              public void Short_Term_Loan_From_Banks_Financial_Institutions_in_MDS() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[7]")));
				 //  i7.sendKeys("-A70060.d");
				   
				   String Intrest7= i7.getAttribute("value");	
				   Assert.assertTrue(Intrest7.length() <= 12, "Input accepts more than 12 characters  ");
		           Assert.assertTrue(Long.parseLong(Intrest7) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest7.matches("[0-9]+") && Long.parseLong(Intrest7)>=0, "Input accepts alphabet ");
				   
		            ic7= Long.parseLong(i7.getAttribute("value"));
	             }
//	  //........................................................................................................................
	             @Test(priority=9)
	              public void Short_Term_Loan_From_Banks_Financial_Institutions_in_Totals() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));
				 			   
				   long ic8= Long.parseLong(i8.getAttribute("value"));
				   
				   long expects9=ic1+ic2+ic3+ic4+ic5+ic6+ic7;  // Add all values to match Totals values
				   Assert.assertEquals(expects9, ic8);					   
	             }
	 //............................................................................................................
	  //............................................................................................................. 
	             @Test(priority=10)
	             public void  Short_Term_Loan_From_Directors_Related_Parties_In_NEW_Cars() throws InterruptedException {  
	           	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   			   WebElement i9= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[9]")));
	         	       
	   			 //  i9.sendKeys("-kd*70000.");
	   			    
	         	       String Intrest9= i9.getAttribute("value");	
	   			   Assert.assertTrue(Intrest9.length() <= 12, "Input accepts more than 12 characters");
	   	           Assert.assertTrue(Long.parseLong(Intrest9) >= 0, "Input accepts negative value");	        
	   	           Assert.assertTrue(Intrest9.matches("[0-9]+") && Long.parseLong(Intrest9)>=0, "Input accepts alphabet ");
	   	           
	   	           ic9= Long.parseLong(i9.getAttribute("value"));
	             }
	           //..................................................................................
	             @Test(priority=11)
	             public void Short_Term_Loan_From_Directors_Related_Parties_in_MSGA() throws InterruptedException {         	  
	           	  wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   			   WebElement i10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[10]")));
	         	       
	   			 //  i10.sendKeys("-gSd*870004");
	   			    
	         	       String Intrest10= i10.getAttribute("value");	
	   			   Assert.assertTrue(Intrest10.length() <= 12, "Input accepts more than 12 characters  ");
	   	           Assert.assertTrue(Long.parseLong(Intrest10) >= 0, "Input accepts negative value");	        
	   	           Assert.assertTrue(Intrest10.matches("[0-9]+") && Long.parseLong(Intrest10)>=0, "Input accepts alphabet ");
	   	           
	   	           ic10= Long.parseLong(i10.getAttribute("value"));
	             }
	       //..................................................................................
	                @Test(priority=12)
	                 public void Short_Term_Loan_From_Directors_Related_Parties_in_Service() throws InterruptedException {  
	           	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   			   WebElement i11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[11]")));
	   			  // i11.sendKeys("-8739002s.d");
	   			   
	   			   String Intrest11= i11.getAttribute("value");	
	   			   Assert.assertTrue(Intrest11.length() <= 12, "Input accepts more than 12 characters  ");
	   	           Assert.assertTrue(Long.parseLong(Intrest11) >= 0, "Input accepts negative value");	        
	   	           Assert.assertTrue(Intrest11.matches("[0-9]+") && Long.parseLong(Intrest11)>=0, "Input accepts alphabet ");
	   			   
	   			   ic11= Long.parseLong(i11.getAttribute("value"));
	                }
	   	                 
	        //......................................................................................................
	                @Test(priority=13)
	                 public void Short_Term_Loan_From_Directors_Related_Parties_in_Spares() throws InterruptedException {  
	           	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   			   WebElement i12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[12]")));
	   			 //  i12.sendKeys("-304306D.d");
	   			   
	   			   String Intrest12= i12.getAttribute("value");	
	   			   Assert.assertTrue(Intrest12.length() <= 12, "Input accepts more than 12 characters  ");
	   	           Assert.assertTrue(Long.parseLong(Intrest12) >= 0, "Input accepts negative value");	        
	   	           Assert.assertTrue(Intrest12.matches("[0-9]+") && Long.parseLong(Intrest12)>=0, "Input accepts alphabet ");
	   			   
	   			   ic12= Long.parseLong(i12.getAttribute("value"));
	                }
	   //.....................................................................................................................
	   	             @Test(priority=14)
	   	              public void Short_Term_Loan_From_Directors_Related_Parties_in_POC() throws InterruptedException {  
	   	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   				   WebElement i13= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[13]")));
	   				//   i13.sendKeys("-4067099.d");
	   				   
	   				   String Intrest13= i13.getAttribute("value");	
	   				   Assert.assertTrue(Intrest13.length() <= 12, "Input accepts more than 12 characters  ");
	   		           Assert.assertTrue(Long.parseLong(Intrest13) >= 0, "Input accepts negative value");	        
	   		           Assert.assertTrue(Intrest13.matches("[0-9]+") && Long.parseLong(Intrest13)>=0, "Input accepts alphabet ");
	   				   
	   				   ic13= Long.parseLong(i13.getAttribute("value"));
	   	             }
	   //...........................................................................................................................
	   	             @Test(priority=15)
	   	              public void Short_Term_Loan_From_Directors_Related_Parties_in_MI() throws InterruptedException {  
	   	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   				   WebElement i14= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[14]")));
	   				 //  i14.sendKeys("-A7007360.d");
	   				   
	   				   String Intrest14= i14.getAttribute("value");	
	   				   Assert.assertTrue(Intrest14.length() <= 12, "Input accepts more than 12 characters  ");
	   		           Assert.assertTrue(Long.parseLong(Intrest14) >= 0, "Input accepts negative value");	        
	   		           Assert.assertTrue(Intrest14.matches("[0-9]+") && Long.parseLong(Intrest14)>=0, "Input accepts alphabet ");
	   				   
	   				   ic14= Long.parseLong(i14.getAttribute("value"));
	   	             }
	   //........................................................................................................................
	   	             @Test(priority=16)
	   	              public void Short_Term_Loan_From_Directors_Related_Parties_in_MDS() throws InterruptedException {  
	   	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   				   WebElement i15= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[15]")));
	   				  // i15.sendKeys("-A10007.d");
	   				   
	   				   String Intrest15= i15.getAttribute("value");	
	   				   Assert.assertTrue(Intrest15.length() <= 12, "Input accepts more than 12 characters  ");
	   		           Assert.assertTrue(Long.parseLong(Intrest15) >= 0, "Input accepts negative value");	        
	   		           Assert.assertTrue(Intrest15.matches("[0-9]+") && Long.parseLong(Intrest15)>=0, "Input accepts alphabet ");
	   				   
	   		            ic15= Long.parseLong(i15.getAttribute("value"));
	   	             }
	  //........................................................................................................................
	   	             @Test(priority=17)
	   	              public void Short_Term_Loan_From_Directors_Related_Parties_in_Totals() throws InterruptedException {  
	   	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   				   WebElement i16= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[16]")));
	   				 			   
	   				   long ic16= Long.parseLong(i16.getAttribute("value"));
	   				   
	   				   long expects16=ic9+ic10+ic11+ic12+ic13+ic14+ic15;  // Add all values to match Totals values
	   				   Assert.assertEquals(expects16, ic16);					   
	   	             }
	   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	   	    //............................Total Short Term Loans	............................................................................................
	   	          
	   	         @Test(priority=18)
	   	        public void Total_Short_Term_Loans_In_New_Cars() throws InterruptedException {  
	   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   		    WebElement i17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[17]")));
	   				 			   
	   		    long ic17= Long.parseLong(i17.getAttribute("value"));
	   				   
	   		    long expects17=ic1+ic9;  // Add all values to match Totals values
	   			Assert.assertEquals(expects17, ic17);					   
	   	             } 

	  //...................................................................................................................
		   	      @Test(priority=19)
		   	        public void Total_Short_Term_Loans_In_MSGA() throws InterruptedException {  
		   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		   		    WebElement i18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[18]")));
		   				 			   
		   		    long ic18= Long.parseLong(i18.getAttribute("value"));
		   				   
		   		    long expects18=ic2+ic10;  // Add all values to match Totals values
		   			Assert.assertEquals(expects18, ic18);
		   	      }
//............................................................................................
		   	 
		   	   @Test(priority=20)
	   	        public void Total_Short_Term_Loans_In_Service() throws InterruptedException {  
	   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   		    WebElement i19= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[19]")));
	   				 			   
	   		    long ic19= Long.parseLong(i19.getAttribute("value"));
	   				   
	   		    long expects19=ic3+ic11;  // Add all values to match Totals values
	   			Assert.assertEquals(expects19, ic19);
	   	      }
	//............................................................................................
			   	 
		   	   @Test(priority=21)
	   	        public void Total_Short_Term_Loans_In_Spares() throws InterruptedException {  
	   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   		    WebElement i20= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[20]")));
	   				 			   
	   		    long ic20= Long.parseLong(i20.getAttribute("value"));
	   				   
	   		    long expects20=ic4+ic12;  // Add all values to match Totals values
	   			Assert.assertEquals(expects20, ic20);
	   	      }   	         
//............................................................................................
			   	 
		   	   @Test(priority=22)
	   	        public void Total_Short_Term_Loans_In_POC() throws InterruptedException {  
	   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   		    WebElement i21= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[21]")));
	   				 			   
	   		    long ic21= Long.parseLong(i21.getAttribute("value"));
	   				   
	   		    long expects21=ic5+ic13;  // Add all values to match Totals values
	   			Assert.assertEquals(expects21, ic21);
	   	      } 
	//............................................................................................			   	 
		   	   @Test(priority=23)
	   	        public void Total_Short_Term_Loans_In_MI() throws InterruptedException {  
	   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   		    WebElement i22= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[22]")));
	   				 			   
	   		    long ic22= Long.parseLong(i22.getAttribute("value"));
	   				   
	   		    long expects22=ic6+ic14;  // Add all values to match Totals values
	   			Assert.assertEquals(expects22, ic22);
	   	      } 
//............................................................................................			   	 
		   	   @Test(priority=24)
	   	        public void Total_Short_Term_Loans_In_MDS() throws InterruptedException {  
	   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   		    WebElement i23= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[23]")));
	   				 			   
	   		    long ic23= Long.parseLong(i23.getAttribute("value"));
	   				   
	   		    long expects23=ic7+ic15;  // Add all values to match Totals values
	   			Assert.assertEquals(expects23, ic23);
	   	      } 
//............................................................................................			   	 
		   	   @Test(priority=25)
	   	        public void Total_Short_Term_Loans_In_Totals() throws InterruptedException {  
	   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   		    WebElement i24= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[24]")));
	   		    
	   		    WebElement i8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));
	   		    WebElement i16= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[16]")));	 			   
	   		   
	   		    long ic24= Long.parseLong(i24.getAttribute("value"));
	   		    long Ic8= Long.parseLong(i8.getAttribute("value"));
	   		    long Ic16= Long.parseLong(i16.getAttribute("value"));
	   				   
	   		    long expects24=Ic8+Ic16;  // Add all values to match Totals values
	   			Assert.assertEquals(expects24, ic24);
	   	      }
//...................................................................................................
		   	 @Test(priority=26)
	   	        public void Total_Short_Term_Loans() throws InterruptedException {  
	   	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   		    WebElement I24= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[24]")));
	   		    
	   		    WebElement I1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[17]")));
	   		    WebElement I2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[18]")));
	   		    WebElement I3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[19]")));
	   		    WebElement I4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[20]")));	 			   	   		   
	   		    WebElement I5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[21]")));
	   		    WebElement I6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[22]")));	 			   
	   		    WebElement I7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[23]")));	 			   

	   		    long Ic24= Long.parseLong(I24.getAttribute("value"));
	   		    long Ic1= Long.parseLong(I1.getAttribute("value"));
	   		    long Ic2= Long.parseLong(I2.getAttribute("value"));
	   		    long Ic3= Long.parseLong(I3.getAttribute("value"));
	   		    long Ic4= Long.parseLong(I4.getAttribute("value"));
	   		    long Ic5= Long.parseLong(I5.getAttribute("value"));
	   		    long Ic6= Long.parseLong(I6.getAttribute("value"));
	   		    long Ic7= Long.parseLong(I7.getAttribute("value"));

	   				   
	   		    long expects1=Ic1+Ic2+Ic3+Ic4+Ic5+Ic6+Ic7;  // Add all values to match Totals values
	   			Assert.assertEquals(expects1, Ic24);
	   	      }
		   	   
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		   	   
		          @Test(priority=27)
		          public void  Short_Term_Loan_Interest_Cost_Banks_And_Financial_In_NEW_Cars() throws InterruptedException {  
		        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement i25= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[25]")));
					 //  i25.sendKeys("-Kd*790854");
					    
		      	       String Intrest25= i25.getAttribute("value");	
					   Assert.assertTrue(Intrest25.length() <= 12, "Input accepts more than 12 characters");
			           Assert.assertTrue(Long.parseLong(Intrest25) >= 0, "Input accepts negative value");	        
			           Assert.assertTrue(Intrest25.matches("[0-9]+") && Long.parseLong(Intrest25)>=0, "Input accepts alphabet ");
			           
			            ic25= Long.parseLong(i25.getAttribute("value"));
		          }   
//......................................................................................................
		          @Test(priority=28)
		          public void  Short_Term_Loan_Interest_Cost_Banks_And_Financial_In_MSGA() throws InterruptedException {  
		        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement i26= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[26]")));
					//   i26.sendKeys("-Kd*790854");
					    
		      	       String Intrest26= i26.getAttribute("value");	
					   Assert.assertTrue(Intrest26.length() <= 12, "Input accepts more than 12 characters");
			           Assert.assertTrue(Long.parseLong(Intrest26) >= 0, "Input accepts negative value");	        
			           Assert.assertTrue(Intrest26.matches("[0-9]+") && Long.parseLong(Intrest26)>=0, "Input accepts alphabet ");
			           
			            ic26= Long.parseLong(i26.getAttribute("value"));
		          }  
 //......................................................................................................
		          @Test(priority=29)
		          public void  Short_Term_Loan_Interest_Cost_Banks_And_Financial_In_Service() throws InterruptedException {  
		        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement i27= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[27]")));
					 //  i27.sendKeys("-Kd*99055");
					    
		      	       String Intrest27= i27.getAttribute("value");	
					   Assert.assertTrue(Intrest27.length() <= 12, "Input accepts more than 12 characters");
			           Assert.assertTrue(Long.parseLong(Intrest27) >= 0, "Input accepts negative value");	        
			           Assert.assertTrue(Intrest27.matches("[0-9]+") && Long.parseLong(Intrest27)>=0, "Input accepts alphabet ");
			           
			            ic27= Long.parseLong(i27.getAttribute("value"));
		          }
//.......................................................................................................		          
		          @Test(priority=30)
		          public void  Short_Term_Loan_Interest_Cost_Banks_And_Financial_In_Spares() throws InterruptedException {  
		        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement i28= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[28]")));
					 //  i28.sendKeys("-Kd*50088");
					    
		      	       String Intrest28= i28.getAttribute("value");	
					   Assert.assertTrue(Intrest28.length() <= 12, "Input accepts more than 12 characters");
			           Assert.assertTrue(Long.parseLong(Intrest28) >= 0, "Input accepts negative value");	        
			           Assert.assertTrue(Intrest28.matches("[0-9]+") && Long.parseLong(Intrest28)>=0, "Input accepts alphabet ");
			           
			            ic28= Long.parseLong(i28.getAttribute("value"));
		          }
//.....................................................................................................
		          @Test(priority=31)
		          public void  Short_Term_Loan_Interest_Cost_Banks_And_Financial_In_POC() throws InterruptedException {  
		        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement i29= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[29]")));
					 //  i29.sendKeys("-Kd*70000");
					    
		      	       String Intrest29= i29.getAttribute("value");	
					   Assert.assertTrue(Intrest29.length() <= 12, "Input accepts more than 12 characters");
			           Assert.assertTrue(Long.parseLong(Intrest29) >= 0, "Input accepts negative value");	        
			           Assert.assertTrue(Intrest29.matches("[0-9]+") && Long.parseLong(Intrest29)>=0, "Input accepts alphabet ");
			           
			            ic29= Long.parseLong(i29.getAttribute("value"));
		          }
//........................................................................................................
		          @Test(priority=32)
		          public void  Short_Term_Loan_Interest_Cost_Banks_And_Financial_In_MI() throws InterruptedException {  
		        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					   WebElement i30= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[30]")));
					  // i30.sendKeys("-Sd*60000");
					    
		      	       String Intrest30= i30.getAttribute("value");	
					   Assert.assertTrue(Intrest30.length() <= 12, "Input accepts more than 12 characters");
			           Assert.assertTrue(Long.parseLong(Intrest30) >= 0, "Input accepts negative value");	        
			           Assert.assertTrue(Intrest30.matches("[0-9]+") && Long.parseLong(Intrest30)>=0, "Input accepts alphabet ");
			           
			            ic30= Long.parseLong(i30.getAttribute("value"));
		          } 
//........................................................................................................
		 @Test(priority=33)
		  public void  Short_Term_Loan_____Interest_Cost_Banks_And_Financial_In_MDS() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i31= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[31]")));
			// i31.sendKeys("-Sd*98000");
					    
		     String Intrest31= i31.getAttribute("value");	
			 Assert.assertTrue(Intrest31.length() <= 12, "Input accepts more than 12 characters");
			 Assert.assertTrue(Long.parseLong(Intrest31) >= 0, "Input accepts negative value");	        
			 Assert.assertTrue(Intrest31.matches("[0-9]+") && Long.parseLong(Intrest31)>=0, "Input accepts alphabet ");
			           
		     ic31= Long.parseLong(i31.getAttribute("value"));
		          }
//........................................................................................................
		 @Test(priority=34)
		  public void  Short_Term_Loan____Interest_Cost_Banks_And_Financial_In_Totals() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i32= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[32]")));				    
		     ic32= Long.parseLong(i32.getAttribute("value"));
		     
		     long expectedValues1=ic25+ic26+ic27+ic28+ic29+ic30+ic31;
		     Assert.assertEquals(expectedValues1, ic32);
		     
		          }
//..............................................................................................
//......................................................................................................
		   @Test(priority=35)
	          public void  Short_Term_Loan____Interest_Cost_Directors_Related_Parties____In_NEW_Cars() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i33= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[33]")));
			//	   i33.sendKeys("-Kd*790854");
				    
	      	       String Intrest33= i33.getAttribute("value");	
				   Assert.assertTrue(Intrest33.length() <= 12, "Input accepts more than 12 characters");
		           Assert.assertTrue(Long.parseLong(Intrest33) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest33.matches("[0-9]+") && Long.parseLong(Intrest33)>=0, "Input accepts alphabet ");
		           
		            ic33= Long.parseLong(i33.getAttribute("value"));
	          }   
//......................................................................................................
	          @Test(priority=36)
	          public void  Short_Term_Loan_____Interest_Cost_Directors_Related_Parties_____In_MSGA() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i34= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[34]")));
				//   i34.sendKeys("-Kd*7900854");
				    
	      	       String Intrest34= i34.getAttribute("value");	
				   Assert.assertTrue(Intrest34.length() <= 12, "Input accepts more than 12 characters");
		           Assert.assertTrue(Long.parseLong(Intrest34) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest34.matches("[0-9]+") && Long.parseLong(Intrest34)>=0, "Input accepts alphabet ");
		           
		            ic34= Long.parseLong(i34.getAttribute("value"));
	          }  
//......................................................................................................
	          @Test(priority=37)
	          public void  Short_Term_Loan______Interest_Cost_Directors_Related_Parties______In_Service() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i35= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[35]")));
				//   i35.sendKeys("-Kd*0160055");
				    
	      	       String Intrest35= i35.getAttribute("value");	
				   Assert.assertTrue(Intrest35.length() <= 12, "Input accepts more than 12 characters");
		           Assert.assertTrue(Long.parseLong(Intrest35) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest35.matches("[0-9]+") && Long.parseLong(Intrest35)>=0, "Input accepts alphabet ");
		           
		            ic35= Long.parseLong(i35.getAttribute("value"));
	          }
//.......................................................................................................		          
	          @Test(priority=38)
	          public void  Short_Term_Loan______Interest_Cost_Directors_Related_Parties______In_Spares() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i36= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[36]")));
				//   i36.sendKeys("-Kd*50088");
				    
	      	       String Intrest36= i36.getAttribute("value");	
				   Assert.assertTrue(Intrest36.length() <= 12, "Input accepts more than 12 characters");
		           Assert.assertTrue(Long.parseLong(Intrest36) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest36.matches("[0-9]+") && Long.parseLong(Intrest36)>=0, "Input accepts alphabet ");
		           
		            ic36= Long.parseLong(i36.getAttribute("value"));
	          }
//.....................................................................................................
	          @Test(priority=39)
	          public void  Short_Term_Loan______Interest_Cost_Directors_Related_Parties______In_POC() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i37= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[37]")));
				//   i37.sendKeys("-Kd*70000");
				    
	      	       String Intrest37= i37.getAttribute("value");	
				   Assert.assertTrue(Intrest37.length() <= 12, "Input accepts more than 12 characters");
		           Assert.assertTrue(Long.parseLong(Intrest37) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest37.matches("[0-9]+") && Long.parseLong(Intrest37)>=0, "Input accepts alphabet ");
		           
		            ic37= Long.parseLong(i37.getAttribute("value"));
	          }
//........................................................................................................
	          @Test(priority=40)
	          public void  Short_Term_Loan______Interest_Cost_Directors_Related_Parties______In_MI() throws InterruptedException {  
	        	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				   WebElement i38= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[38]")));
				//   i38.sendKeys("-Sd*110000");
				    
	      	       String Intrest38= i38.getAttribute("value");	
				   Assert.assertTrue(Intrest38.length() <= 12, "Input accepts more than 12 characters");
		           Assert.assertTrue(Long.parseLong(Intrest38) >= 0, "Input accepts negative value");	        
		           Assert.assertTrue(Intrest38.matches("[0-9]+") && Long.parseLong(Intrest38)>=0, "Input accepts alphabet ");
		           
		            ic38= Long.parseLong(i38.getAttribute("value"));
	          } 
//........................................................................................................
	 @Test(priority=41)
	  public void  Short_Term_Loan______Interest_Cost_Directors_Related_Parties______In_MDS() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement i39= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[39]")));
		// i39.sendKeys("-Sd*98000");
				    
	     String Intrest39= i39.getAttribute("value");	
		 Assert.assertTrue(Intrest39.length() <= 12, "Input accepts more than 12 characters");
		 Assert.assertTrue(Long.parseLong(Intrest39) >= 0, "Input accepts negative value");	        
		 Assert.assertTrue(Intrest39.matches("[0-9]+") && Long.parseLong(Intrest39)>=0, "Input accepts alphabet ");
		           
	     ic39= Long.parseLong(i39.getAttribute("value"));
	          }
//........................................................................................................
	 @Test(priority=42)
	  public void  Short_Term_Loan__Interest_Cost_Directors_Related_Parties_In_Totals() throws InterruptedException {  
	     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement i40= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[40]")));				    
	     ic40= Long.parseLong(i40.getAttribute("value"));
	     
	     long expectedValues1=ic33+ic34+ic35+ic36+ic37+ic38+ic39;
	     Assert.assertEquals(expectedValues1, ic40);
	     
	          }

	 
//  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Total Interest Paid on ST Loans>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 @Test(priority=43)
		  public void  Total_Interest_Paid_on_ST_Loans___OF_New_cars() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i41= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[41]")));				    
		     ic41= Long.parseLong(i41.getAttribute("value"));
		     
		     long expectedValues1=ic25+ic33;
		     Assert.assertEquals(expectedValues1, ic41);
		     
		          }
//........................................................................................................
		 @Test(priority=44)
		  public void  Total_Interest_Paid_on_ST_Loans_OF_MSGA() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i42= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[42]")));				    
		     ic42= Long.parseLong(i42.getAttribute("value"));
		     
		     long expectedValues2=ic26+ic34;
		     Assert.assertEquals(expectedValues2, ic42);
		     
		          }
//.......................................................................................................
		 @Test(priority=45)
		  public void  Total_Interest_Paid_on_ST_Loans_OF_SERVICES() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i43= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[43]")));				    
		     ic43= Long.parseLong(i43.getAttribute("value"));
		     
		     long expectedValues3=ic27+ic35;
		     Assert.assertEquals(expectedValues3, ic43);
		     
		          }
//.......................................................................................................
		 @Test(priority=46)
		  public void  Total_Interest_Paid_on_ST_Loans_OF_SPARES() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i44= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[44]")));				    
		     ic44= Long.parseLong(i44.getAttribute("value"));
		     
		     long expectedValues4=ic28+ic36;
		     Assert.assertEquals(expectedValues4, ic44);
		     
		          }
//.......................................................................................................
		 @Test(priority=47)
		  public void  Total_Interest_Paid_on_ST_Loans_OF_POc() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i45= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[45]")));				    
		     ic45= Long.parseLong(i45.getAttribute("value"));
		     
		     long expectedValues5=ic29+ic37;
		     Assert.assertEquals(expectedValues5, ic45);
		     
		          }
//	//.......................................................................................................
		 @Test(priority=48)
		  public void  Total_Interest_Paid_on_ST_Loans_OF_MI() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i46= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[46]")));				    
		     ic46= Long.parseLong(i46.getAttribute("value"));
		     
		     long expectedValues6=ic30+ic38;
		     Assert.assertEquals(expectedValues6, ic46);
		     
		          }
	//.......................................................................................................
		 @Test(priority=49)
		  public void  Total_Interest_Paid_on_ST_Loans_OF_MDS() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i47= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[47]")));				    
		     ic47= Long.parseLong(i47.getAttribute("value"));
		     
		     long expectedValues7=ic31+ic39;
		     Assert.assertEquals(expectedValues7, ic47);
		     
		          }
//.......................................................................................................
		 @Test(priority=50)
		  public void  Total_Interest_Paid_on_ST_Loans_OF_Totals() throws InterruptedException {  
		     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 WebElement i48= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[48]")));				    
		     ic47= Long.parseLong(i48.getAttribute("value"));
		     
		     long expectedValues8=ic32+ic40;
		     Assert.assertEquals(expectedValues8, ic48);
		     
		          }
//.......................................................................................................
		 @Test(priority=0)
		  public void  Total_Interest_Paid_on_ST_LOANS() throws InterruptedException {  
		       //System.out.println("IC      ="+ic49);
		     long expectedValues1=ic41+ic42+ic43+ic44+ic45+ic46+ic47;
		    // System.out.println("expectedValues9      =   "+   expectedValues9);
		     Assert.assertEquals(expectedValues1, ic48);
		     
		          }
////////////////////////////////////////////////////////////////////////////////////////////////////////
 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		               //  Long Term Loan
////////////////////////////////////////////////////////////////////////////////////////////////////////
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 //..................................................................................
         @Test(priority=52)
         public void  Long_Term_Loan_From_Banks_Financial_Institutions_In_NEW_Cars() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[50]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }    
    //..................................................................................
         @Test(priority=53)
         public void  Long_Term_Loan_From_Banks_Financial_Institutions_In_M_S_G_A() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[51]")));
    				  			    
     	       String Intrest2= i2.getAttribute("value");	
			   Assert.assertTrue(Intrest2.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest2) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest2.matches("[0-9]+") && Long.parseLong(Intrest2)>=0, "Input accepts alphabet ");
         }
     //..................................................................................
         @Test(priority=54)
         public void  Long_Term_Loan_From_Banks_Financial_Institutions_In_SERVICESS() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[52]")));
    				  			    
     	       String Intrest3= i3.getAttribute("value");	
			   Assert.assertTrue(Intrest3.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest3) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest3.matches("[0-9]+") && Long.parseLong(Intrest3)>=0, "Input accepts alphabet ");
         }
    //..................................................................................
         @Test(priority=55)
         public void  Long_Term_Loan_From_Banks_Financial_Institutions_In_SPARES() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[53]")));
    				  			    
     	       String Intrest4= i4.getAttribute("value");	
			   Assert.assertTrue(Intrest4.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest4) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest4.matches("[0-9]+") && Long.parseLong(Intrest4)>=0, "Input accepts alphabet ");
         }
   //..................................................................................
         @Test(priority=56)
         public void  Long_Term_Loan_From_Banks_Financial_Institutions_In_POC() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[54]")));
    				  			    
     	       String Intrest5= i5.getAttribute("value");	
			   Assert.assertTrue(Intrest5.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest5) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest5.matches("[0-9]+") && Long.parseLong(Intrest5)>=0, "Input accepts alphabet ");
         }
    //..................................................................................
         @Test(priority=57)
         public void  Long_Term_Loan_From_Banks_Financial_Institutions_In_M_I() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[55]")));
    				  			    
     	       String Intrest6= i6.getAttribute("value");	
			   Assert.assertTrue(Intrest6.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest6) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest6.matches("[0-9]+") && Long.parseLong(Intrest6)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=58)
         public void  Long_Term_Loan_From_Banks_Financial_Institutions_In_MDS() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[56]")));
    				  			    
     	       String Intrest7= i7.getAttribute("value");	
			   Assert.assertTrue(Intrest7.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest7) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest7.matches("[0-9]+") && Long.parseLong(Intrest7)>=0, "Input accepts alphabet ");
         }
      //..................................................................................
         @Test(priority=59)
         public void  Long_Term_Loan_From_Banks_Financial_Institutions_of_Totals() throws InterruptedException {  	        
    				
        	        long Expected1=ic50+ic51+ic52+ic53+ic54+ic55+ic56; 
    				Assert.assertEquals(Expected1, ic57);
     	     
         }
     //....................>>>>>>>>>>>>>>>>>>>>>>>>>>..............................................................
         @Test(priority=60)
         public void  Long_Term_Loan_From_Directors_Related_Parties_In_NEW_Cars() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[58]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }    
    //..................................................................................
         @Test(priority=61)
         public void  Long_Term_Loan_From_Directors_Related_Parties_In_M_S_G_A() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[59]")));
    				  			    
     	       String Intrest2= i2.getAttribute("value");	
			   Assert.assertTrue(Intrest2.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest2) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest2.matches("[0-9]+") && Long.parseLong(Intrest2)>=0, "Input accepts alphabet ");
         }
     //..................................................................................
         @Test(priority=62)
         public void  Long_Term_Loan_From_Directors_Related_Parties_In_SERVICESS() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[60]")));
    				  			    
     	       String Intrest3= i3.getAttribute("value");	
			   Assert.assertTrue(Intrest3.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest3) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest3.matches("[0-9]+") && Long.parseLong(Intrest3)>=0, "Input accepts alphabet ");
         }
    //..................................................................................
         @Test(priority=63)
         public void  Long_Term_Loan_From_Directors_Related_Parties_In_SPARES() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[61]")));
    				  			    
     	       String Intrest4= i4.getAttribute("value");	
			   Assert.assertTrue(Intrest4.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest4) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest4.matches("[0-9]+") && Long.parseLong(Intrest4)>=0, "Input accepts alphabet ");
         }
   //..................................................................................
         @Test(priority=64)
         public void  Long_Term_Loan_From_Directors_Related_Parties_In_POC() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[62]")));
    				  			    
     	       String Intrest5= i5.getAttribute("value");	
			   Assert.assertTrue(Intrest5.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest5) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest5.matches("[0-9]+") && Long.parseLong(Intrest5)>=0, "Input accepts alphabet ");
         }
    //..................................................................................
         @Test(priority=65)
         public void  Long_Term_Loan_From_Directors_Related_Parties_In_M_I() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[63]")));
    				  			    
     	       String Intrest6= i6.getAttribute("value");	
			   Assert.assertTrue(Intrest6.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest6) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest6.matches("[0-9]+") && Long.parseLong(Intrest6)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=66)
         public void  Long_Term_Loan_From_Directors_Related_Parties_In_MDS() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i7= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[64]")));
    				  			    
     	       String Intrest7= i7.getAttribute("value");	
			   Assert.assertTrue(Intrest7.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest7) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest7.matches("[0-9]+") && Long.parseLong(Intrest7)>=0, "Input accepts alphabet ");
         }
      //..................................................................................
         @Test(priority=67)
         public void  Long_Term_Loan_From_Directors_Related_Parties_of_Totals() throws InterruptedException {  	        
    				
        	        long Expected2=ic58+ic59+ic60+ic61+ic62+ic63+ic64; 
    				Assert.assertEquals(Expected2, ic65);   	     
         }
   //....................................................................................................
    //..................................................................................
         @Test(priority=68)
         public void  Total_Long_Term_Loans_of_NEw_Cars() throws InterruptedException {  	        
    				
        	        long Expected2=ic50+ic58; 
    				Assert.assertEquals(Expected2, ic66);   	     
         }
    //..................................................................................
         @Test(priority=69)
         public void  Total_Long_Term_Loans_of_MSGA() throws InterruptedException {  	        
    				
        	        long Expected2=ic51+ic59; 
    				Assert.assertEquals(Expected2, ic67);   	     
         }   
    //..................................................................................
         @Test(priority=70)
         public void  Total_Long_Term_Loans_of_Servicee() throws InterruptedException {  	        
    				
        	        long Expected2=ic52+ic60; 
    				Assert.assertEquals(Expected2, ic68);   	     
         }   
     //..................................................................................
         @Test(priority=71)
         public void  Total_Long_Term_Loans_of_Spares() throws InterruptedException {  	        
    				
        	        long Expected2=ic53+ic61; 
    				Assert.assertEquals(Expected2, ic69);   	     
         }   
     //..................................................................................
         @Test(priority=72)
         public void  Total_Long_Term_Loans_of_POC() throws InterruptedException {  	        
    				
        	        long Expected2=ic54+ic62; 
    				Assert.assertEquals(Expected2, ic70);   	     
         } 
     //..................................................................................
         @Test(priority=73)
         public void  Total_Long_Term_Loans_of_MI() throws InterruptedException {  	        
    				
        	        long Expected2=ic55+ic63; 
    				Assert.assertEquals(Expected2, ic71);   	     
         } 
      //..................................................................................
         @Test(priority=74)
         public void  Total_Long_Term_Loans_of_MDS() throws InterruptedException {  	        
    				
        	        long Expected2=ic56+ic64; 
    				Assert.assertEquals(Expected2, ic72);   	     
         } 
     //..................................................................................
         @Test(priority=75)
         public void  Total_Long_Term_Loans_of_TOTALS_Rs() throws InterruptedException {  	        
    				
        	        long Expected2=ic57+ic65; 
    				Assert.assertEquals(Expected2, ic73);   	     
         } 
     //..................................................................................
         @Test(priority=76)
         public void  Total_Long_Term_Loans() throws InterruptedException {  	        
    				
        	        long Expected2=ic66+ic67+ic68+ic69+ic70+ic71+ic72; 
    				Assert.assertEquals(Expected2, ic73);   	     
         }
   //////////////////////////////////////////////////////////////////////////////////////////////////
    //..................................................................................
         @Test(priority=77)
         public void  Long_Term_Loan_Interest_Cost_Bank_and_Financial_In_NEW_Cars() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[74]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=78)
         public void  Long_Term_Loan_Interest_Cost_Bank_and_Financial_In_MSGA() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[75]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=79)
         public void  Long_Term_Loan_Interest_Cost_Bank_and_Financial_In_SERVICE() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[76]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=80)
         public void  Long_Term_Loan_Interest_Cost_Bank_and_Financial_In_Spares() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[77]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=81)
         public void  Long_Term_Loan_Interest_Cost_Bank_and_Financial_In_Poc() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[78]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=82)
         public void  Long_Term_Loan_Interest_Cost_Bank_and_Financial_In_MI() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[79]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
   //..................................................................................
         @Test(priority=83)
         public void  Long_Term_Loan_Interest_Cost_Bank_and_Financial_In_MDS() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[80]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
    //..................................................................................
         @Test(priority=84)
         public void  Long_Term_Loan_Interest_Cost_Bank_and_Financial_In_TOtals() throws InterruptedException {  	        
    				
        	        long Expected2=ic74+ic75+ic76+ic77+ic78+ic79+ic80; 
    				Assert.assertEquals(Expected2, ic81);   	     
         }
     //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
         //..................................................................................
         @Test(priority=85)
         public void  Long_Term_Loan_Interest_Cost_Directors_Related_Parties_In_NEW_Cars() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[82]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=86)
         public void  Long_Term_Interest_Cost_Directors_Related_Parties_In_MSGA() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[83]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=87)
         public void  Long_Term_Loan_Interest_Cost_Directors_Related_Parties_In_SERVICE() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[84]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=88)
         public void  Long_Term_Loan_Interest_Cost_Directors_Related_Parties_In_Spares() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[85]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=89)
         public void  Long_Term_Loan_Interest_Cost_Directors_Related_Parties_In_Poc() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[86]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
       //..................................................................................
         @Test(priority=90)
         public void  Long_Term_Loan_Interest_Cost_Directors_Related_Parties_In_MI() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[87]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
   //..................................................................................
         @Test(priority=91)
         public void  Long_Term_Loan_Interest_Cost_Directors_Related_Parties_In_MDS() throws InterruptedException {  
       	   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			   WebElement i1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[88]")));
    				  			    
     	       String Intrest1= i1.getAttribute("value");	
			   Assert.assertTrue(Intrest1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(Intrest1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(Intrest1.matches("[0-9]+") && Long.parseLong(Intrest1)>=0, "Input accepts alphabet ");
         }
    //..................................................................................
         @Test(priority=92)
         public void  Long_Term_Loan_Interest_Cost_Directors_Related_Parties_Of_TOtals() throws InterruptedException {  	        
    				
        	        long Expected2=ic82+ic83+ic84+ic85+ic86+ic87+ic88; 
    				Assert.assertEquals(Expected2, ic89);   	     
         }
     //................................................................................................
     //...............................................................................................
         @Test(priority=93)
         public void Total_Interest_Cost_on_LT_Loans_Of_NEW_Cars() throws InterruptedException {  	        
    				
        	        long Expected2=ic74+ic82; 
    				Assert.assertEquals(Expected2, ic90);   	     
         }
     //...............................................................................................
         @Test(priority=94)
         public void Total_Interest_Cost_on_LT_Loans_Of_MSGA() throws InterruptedException {  	        
    				
        	        long Expected2=ic75+ic83; 
    				Assert.assertEquals(Expected2, ic91);   	     
         }
       //...............................................................................................
         @Test(priority=95)
         public void Total_Interest_Cost_on_LT_Loans_Of_service() throws InterruptedException {  	        
    				
        	        long Expected2=ic76+ic84; 
    				Assert.assertEquals(Expected2, ic92);   	     
         }
      //...............................................................................................
         @Test(priority=96)
         public void Total_Interest_Cost_on_LT_Loans_Of_Spares() throws InterruptedException {  	        
    				
        	        long Expected2=ic77+ic85; 
    				Assert.assertEquals(Expected2, ic93);   	     
         }
       //...............................................................................................
         @Test(priority=97)
         public void Total_Interest_Cost_on_LT_Loans_Of_PoC() throws InterruptedException {  	        
    				
        	        long Expected2=ic78+ic86; 
    				Assert.assertEquals(Expected2, ic94);   	     
         }
      //...............................................................................................
         @Test(priority=98)
         public void Total_Interest_Cost_on_LT_Loans_Of_MI() throws InterruptedException {  	        
    				
        	        long Expected2=ic79+ic87; 
    				Assert.assertEquals(Expected2, ic95);   	     
         }
       //...............................................................................................
         @Test(priority=99)
         public void Total_Interest_Cost_on_LT_Loans_Of_MDS() throws InterruptedException {  	        
    				
        	        long Expected2=ic80+ic88; 
    				Assert.assertEquals(Expected2, ic96);   	     
         }
      //...............................................................................................
         @Test(priority=100)
         public void Total_Interest_Cost_on_LT_Loans_Of_Totals() throws InterruptedException {  	        
    				
        	        long Expected2=ic81+ic89; 
    				Assert.assertEquals(Expected2, ic97);   	     
         }
       //...............................................................................................
         @Test(priority=101)
         public void Total_Interest_Cost_on_LT_Loans() throws InterruptedException {  	        
    				
        	        long Expected2=ic90+ic91+ic92+ic93+ic94+ic95+ic96; 
    				Assert.assertEquals(Expected2, ic97);   	     
         }
         
    ////////////////////////////////////////////////////////////////////////////////////////////////
     //...............................................................................................
         @Test(priority=102)
         public void Click_on_New_Cars() throws InterruptedException {  	        
		       WebElement NewCArs = driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]"));  
		       NewCArs.click();	       
		        Thread.sleep(2000);
		       String ActualUrl=driver.getCurrentUrl();
		    //   System.out.println("new cars url ="   +ActualUrl);
		       	      
		       String ExpectedUrl="https://dev-dbp.msilfintrac.co.in/Dashboard/New-car";
		       Assert.assertEquals(ExpectedUrl, ActualUrl);
		       
		       WebElement New = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
               N1= Double.parseDouble(New.getAttribute("value"));
              // System.out.println("N1    =   "  +N1);
               
               Thread.sleep(2000);
		       driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[4]")).click();        
		       Thread.sleep(2000);      	          	     
         }
    //.............................................................................................
         @Test(priority=103)
         public void ST_Interest_Cost_Per_Car() throws InterruptedException { 
        	double Expectedvalue1= NC/N1;
        //	System.out.println("Expectedvalue1   = "+Expectedvalue1);
        	long roundedResults3 = Math.round(Expectedvalue1);
       // 	System.out.println("roundedResults3   = "+roundedResults3);
        	Assert.assertEquals(roundedResults3, ic49,"ST_Interest_Cost_Per_Car VAlues Are INVALID");
         }	
    //..................................................................................................
     //.............................................................................................
         @Test(priority=104)
         public void LT_Interest_Cost_Per_Car	() throws InterruptedException { 
        	double Expectedvalue1= NC1/N1;
       //System.out.println("Expectedvalue1   = "+Expectedvalue1);
        	long roundedResults3 = Math.round(Expectedvalue1);
        //	System.out.println("roundedResults3   = "+roundedResults3);
        	Assert.assertEquals(roundedResults3, ic98,"LT Interest Cost Per_Car VAlues Are INVALID");
         }	
    //..................................................................................................     
     //.............................................................................................
         @Test(priority=105)
         public void Total_Interest_Cost_Per_Car() throws InterruptedException { 
        	    long Expected2=ic49+ic98; 
				Assert.assertEquals(Expected2, ic99,"Total_Interest_Cost_Per_Car is INVALID");  
        	
         }	
    //..................................................................................................     
         @AfterClass
         public void tearDown () {	
       		 driver.quit();
         }
}  
