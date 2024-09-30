package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ManpowerCount {
	static void ManpowerCount_Page(WebDriver driver) throws InterruptedException  {
		//click on Manpower Count option
		 Thread.sleep(3000);	     
	     driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[5]")).click();
	     Thread.sleep(2000);
	     
	     System.out.println("..........................ManPower count.......................................");
	     
//	     //clear data first
//	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	     Thread.sleep(3000);
	     
	     //new car>direct manpower>sales        
	     WebElement m1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	     WebElement m2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	     WebElement m3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	     WebElement m4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));	     
	     //new car>indirect> back office
	     WebElement m5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	     WebElement m6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	     WebElement m7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	     WebElement m8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	     WebElement m9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	     WebElement m10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	     WebElement m11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	     WebElement m12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	     WebElement m13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	     WebElement m14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	     WebElement m15= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));     
	     //new car>indirect>Housekeeping staff
	     WebElement m16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	     WebElement m17= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	     WebElement m18= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	     WebElement m19= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	     WebElement m20= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	     WebElement m21= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
	     WebElement m22= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	     WebElement m23= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	                                            
	     Thread.sleep(3000);
//	     m1.sendKeys("10");
//	     m2.sendKeys("15");
//	     m3.sendKeys("16");
//	     m4.sendKeys("20");
//	     m5.sendKeys("14");
//	     m6.sendKeys("13");
//	     m7.sendKeys("10");
//	     m8.sendKeys("11");
//	     m9.sendKeys("12");
//	     m10.sendKeys("10");
//	     m11.sendKeys("15");
//	     m12.sendKeys("16");
//	     m13.sendKeys("17");
//	     m14.sendKeys("18");
//	     m15.sendKeys("19");
//	     m16.sendKeys("10");
//	     m17.sendKeys("20");
//	     m18.sendKeys("10");
//	     m19.sendKeys("21");
//	     m20.sendKeys("13");
//	     m21.sendKeys("14");
	     
	     //convert longo longegers
	    long mc1= Long.parseLong(m1.getAttribute("value"));
	  	long mc2= Long.parseLong(m2.getAttribute("value"));
	  	long mc3= Long.parseLong(m3.getAttribute("value"));
	  	long mc4= Long.parseLong(m4.getAttribute("value"));
	  	long mc5= Long.parseLong(m5.getAttribute("value"));
	  	long mc6= Long.parseLong(m6.getAttribute("value"));
	  	long mc7= Long.parseLong(m7.getAttribute("value"));
	  	long mc8= Long.parseLong(m8.getAttribute("value"));
	  	long mc9= Long.parseLong(m9.getAttribute("value"));
	  	long mc10= Long.parseLong(m10.getAttribute("value"));
	  	long mc11= Long.parseLong(m11.getAttribute("value"));
	  	long mc12= Long.parseLong(m12.getAttribute("value"));
	  	long mc13= Long.parseLong(m13.getAttribute("value"));
	  	long mc14= Long.parseLong(m14.getAttribute("value"));
	  	long mc15= Long.parseLong(m15.getAttribute("value"));
	  	long mc16= Long.parseLong(m16.getAttribute("value"));
	  	long mc17= Long.parseLong(m17.getAttribute("value"));
	  	long mc18= Long.parseLong(m18.getAttribute("value"));
	  	long mc19= Long.parseLong(m19.getAttribute("value"));
	  	long mc20= Long.parseLong(m20.getAttribute("value"));
	  	long mc21= Long.parseLong(m21.getAttribute("value"));  	         
	    Thread.sleep(2000);
//	    //save data
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	     
	    //scroll Up
	    Thread.sleep(2000);
	    Actions A= new Actions(driver);
	    A.sendKeys(Keys.PAGE_UP).perform();
	     
	    //calculation New Car>Total Direct Manpower
	  	long expresult1= mc1+mc2+mc3+mc4;
	  	
	  	//get the value from automated cell
	  	long actresult1= Long.parseLong(m22.getAttribute("value"));
	  	
	  	//Verify if result is as expected
	 	if(actresult1==expresult1) 
	 	  {
	 		System.out.println("New Car-Total Direct Manpower formula cell displays expected value- PASS=  " +expresult1);  
	 	  }
	 	else
	 	  {
	 		System.out.println("New Car-Total Direct Manpower formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +expresult1);
	 	  }
	 	
	 	//calculation New Car>Total Indirect Manpower
	 	long expresult2= mc5+mc6+mc7+mc8+mc9+mc10+mc11+mc12+mc13+mc14+mc15+mc16+mc17+mc18+mc19+mc20+mc21;
	 	 	
	 	//get the value from automated cell
	 	long actresult2= Long.parseLong(m23.getAttribute("value"));
	 	 	 	
	 	//Verify if result is as expected
	 	if(actresult2==expresult2) 
	 	  {
	 	    System.out.println("New Car-Total Indirect Manpower formula cell displays expected value- PASS=  " +expresult2);  
	 	  }
	 	else
	 	  {
	 	 	System.out.println("New Car-Total Indirect Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +expresult2);
	 	  }
	     
	    Thread.sleep(2000);
	    //click on MSGA
	    driver.findElement(By.xpath("(//*[@id=\"mat-tab-label-0-1\"])")).click();
	    Thread.sleep(1000);
	     
	    //MSGA>direct manpower>accessory
	    WebElement m24= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	    WebElement m25= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	    WebElement m26= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	     
	    //MSGA>indirect>back office
	    WebElement m27= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	    WebElement m28= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	    WebElement m29= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	    WebElement m30= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	             
	    Thread.sleep(2000);
//	    m24.sendKeys("11");
//	    m25.sendKeys("12"); 
//	    m26.sendKeys("13"); 
//	    m27.sendKeys("14"); 
//	    m28.sendKeys("15"); 
	    Thread.sleep(2000);
	     
	    long mc24= Long.parseLong(m24.getAttribute("value"));
	  	long mc25= Long.parseLong(m25.getAttribute("value"));
	  	long mc26= Long.parseLong(m26.getAttribute("value"));
	  	long mc27= Long.parseLong(m27.getAttribute("value"));
	  	long mc28= Long.parseLong(m28.getAttribute("value"));
	  	
//	    //save data
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	          
	    //scroll Up
	    Thread.sleep(2000);
	    Actions MS= new Actions(driver);
	    MS.sendKeys(Keys.PAGE_UP).perform();
	     
	    //calculation MSGA>Total direct Manpower
	    long expresult3= mc24+mc25+mc26;
		 	
		//get the value from automated cell
	    long actresult3= Long.parseLong(m29.getAttribute("value"));
		 	 	
		//Verify if result is as expected
		if(actresult3==expresult3) 
		  {
		 	System.out.println("MSGA-Total Direct Manpower formula cell displays expected value- PASS=  " +actresult3);  
		  }
		 else
		  {
		 	 System.out.println("MSGA-Total Direct Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult3);
		  }
		     
		 //calculation MSGA>Total Indirect Manpower
		long expresult4= mc27+mc28;
			 	
		 //get the value from automated cell
		long actresult4= Long.parseLong(m30.getAttribute("value"));
			 	 	
		 //Verify if result is as expected
		 if(actresult4==expresult4) 
		   {
			 System.out.println("MSGA-Total Indirect Manpower formula cell displays expected value- PASS=  " +actresult4);  
		   }
		 else
		   {
			 System.out.println("MSGA-Total Indirect Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult4);
		   }
	         
	     //Click on Workshop/Bodyshop
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("(//*[@id=\"mat-tab-label-0-2\"])")).click();
	     Thread.sleep(1000);
	     
	     //direct manpower>Operation Head
	     WebElement m31= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	     WebElement m32= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));	     
	     //direct manpower>workshop
	     WebElement m33= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	     WebElement m34= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	     WebElement m35= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	     WebElement m36= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	     WebElement m37= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	     WebElement m38= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	     WebElement m39= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	     WebElement m40= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	     WebElement m41= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	     WebElement m42= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));	     
	     //direct manpower>PDI
	     WebElement m43= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	     WebElement m44= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	     WebElement m45= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	     WebElement m46= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));	     
	     //direct manpower>Bodyshop
	     WebElement m47= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	     WebElement m48= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	     WebElement m49= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	     WebElement m50= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	     WebElement m51= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
	     WebElement m52= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	     WebElement m53= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	     WebElement m54= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));	     
	     //indirect>back office
	     WebElement m55= driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
	     WebElement m56= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
	     WebElement m57= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
	     WebElement m58= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
	     WebElement m59= driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
	     WebElement m60= driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
	     WebElement m61= driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
	     WebElement m62= driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
	     WebElement m63= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
	     WebElement m64= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
	     WebElement m65= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
	     WebElement m66= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));	     
	     //indirect>housekeeping
	     WebElement m67= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
	     WebElement m68= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
	     WebElement m69= driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
	     WebElement m70= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
	     WebElement m71= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
	     WebElement m72= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
	     WebElement m73= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
	     WebElement m74= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
	     WebElement m75= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
	     
	     Thread.sleep(1000);
//	     m31.sendKeys("10");
//	     m32.sendKeys("16");
//	     m33.sendKeys("17");
//	     m34.sendKeys("13");
//	     m35.sendKeys("12");
//	     m36.sendKeys("15");
//	     m37.sendKeys("11");
//	     m38.sendKeys("15");
//	     m39.sendKeys("12");
//	     m40.sendKeys("15");
//	     m41.sendKeys("16");
//	     m42.sendKeys("18");
//	     m43.sendKeys("10");
//	     m44.sendKeys("19");
//	     m45.sendKeys("14");
//	     m46.sendKeys("17");
//	     m47.sendKeys("10");
//	     m48.sendKeys("13");
//	     m49.sendKeys("15");
//	     m50.sendKeys("17");
//	     m51.sendKeys("10");
//	     m52.sendKeys("18");
//	     m53.sendKeys("10");
//	     m54.sendKeys("12");
//	     m55.sendKeys("11");
//	     m56.sendKeys("11");
//	     m57.sendKeys("16");
//	     m58.sendKeys("17");
//	     m59.sendKeys("17");
//	     m60.sendKeys("18");
//	     m61.sendKeys("10");
//	     m62.sendKeys("13");
//	     m63.sendKeys("12");
//	     m64.sendKeys("18");
//	     m65.sendKeys("11");
//	     m66.sendKeys("12");
//	     m67.sendKeys("14");
//	     m68.sendKeys("10");
//	     m69.sendKeys("10");
//	     m70.sendKeys("16");
//	     m71.sendKeys("19");
//	     m72.sendKeys("14");
//	     m73.sendKeys("16");
	     
	    long mc31= Long.parseLong(m31.getAttribute("value"));
	  	long mc32= Long.parseLong(m32.getAttribute("value"));
	  	long mc33= Long.parseLong(m33.getAttribute("value"));
	  	long mc34= Long.parseLong(m34.getAttribute("value"));
	  	long mc35= Long.parseLong(m35.getAttribute("value"));
	  	long mc36= Long.parseLong(m36.getAttribute("value"));
	  	long mc37= Long.parseLong(m37.getAttribute("value"));
	  	long mc38= Long.parseLong(m38.getAttribute("value"));
	  	long mc39= Long.parseLong(m39.getAttribute("value"));
	  	long mc40= Long.parseLong(m40.getAttribute("value"));
	  	long mc41= Long.parseLong(m41.getAttribute("value"));
	  	long mc42= Long.parseLong(m42.getAttribute("value"));
	  	long mc43= Long.parseLong(m43.getAttribute("value"));
	  	long mc44= Long.parseLong(m44.getAttribute("value"));
	  	long mc45= Long.parseLong(m45.getAttribute("value"));
	  	long mc46= Long.parseLong(m46.getAttribute("value"));
	  	long mc47= Long.parseLong(m47.getAttribute("value"));
	  	long mc48= Long.parseLong(m48.getAttribute("value"));
	  	long mc49= Long.parseLong(m49.getAttribute("value"));
	  	long mc50= Long.parseLong(m50.getAttribute("value"));
	  	long mc51= Long.parseLong(m51.getAttribute("value"));
	  	long mc52= Long.parseLong(m52.getAttribute("value"));
	  	long mc53= Long.parseLong(m53.getAttribute("value"));
	  	long mc54= Long.parseLong(m54.getAttribute("value"));
	  	long mc55= Long.parseLong(m55.getAttribute("value"));
	  	long mc56= Long.parseLong(m56.getAttribute("value"));
	  	long mc57= Long.parseLong(m57.getAttribute("value"));
	  	long mc58= Long.parseLong(m58.getAttribute("value"));
	  	long mc59= Long.parseLong(m59.getAttribute("value"));
	  	long mc60= Long.parseLong(m60.getAttribute("value"));
	  	long mc61= Long.parseLong(m61.getAttribute("value"));
	  	long mc62= Long.parseLong(m62.getAttribute("value"));
	  	long mc63= Long.parseLong(m63.getAttribute("value"));
	  	long mc64= Long.parseLong(m64.getAttribute("value"));
	  	long mc65= Long.parseLong(m65.getAttribute("value"));
	  	long mc66= Long.parseLong(m66.getAttribute("value"));
	  	long mc67= Long.parseLong(m67.getAttribute("value"));
	  	long mc68= Long.parseLong(m68.getAttribute("value"));
	  	long mc69= Long.parseLong(m69.getAttribute("value"));
	  	long mc70= Long.parseLong(m70.getAttribute("value"));
	  	long mc71= Long.parseLong(m71.getAttribute("value"));
	  	long mc72= Long.parseLong(m72.getAttribute("value"));
	  	long mc73= Long.parseLong(m73.getAttribute("value"));  	     
	    Thread.sleep(2000);
	     
//	     //save data
//	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	          
	     //scroll Up
	     Thread.sleep(2000);
	     Actions W= new Actions(driver);
	     W.sendKeys(Keys.PAGE_UP).perform();
	     
	     Thread.sleep(1000);
	     Actions B = new Actions(driver);
	     B.sendKeys(Keys.PAGE_UP).perform();
	     
	     Thread.sleep(1000);
	     Actions P= new Actions(driver);
	     P.sendKeys(Keys.PAGE_UP).perform();
	     
	     //calculation Service>Total direct Manpower
	     long expresult5= mc31+mc32+mc33+mc34+mc35+mc36+mc37+mc38+mc39+mc40
		 			        +mc41+mc42+mc43+mc44+mc45+mc46+mc47+mc48+mc49+mc50+
		 			        mc51+mc52+mc53+mc54;
		 	
		 //get the value from automated cell
	     long actresult5= Long.parseLong(m74.getAttribute("value"));
		 	 	
		 //Verify if result is as expected
		 if(actresult5==expresult5) 
		 	{
		 	  System.out.println("Service-Total Direct Manpower formula cell displays expected value- PASS=  " +actresult5);  
		 	}
		 else
		 	{
		 	  System.out.println("Service-Total Direct Manpower formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +actresult5);
		 	}
		     
		  //calculation Service>Total Indirect Manpower
		 long expresult6= mc55+mc56+mc57+mc58+mc59+mc60+mc61+mc62+mc63+mc64
					         +mc65+mc66+mc67+mc68+mc69+mc70+mc71+mc72+mc73;
			 	
		 //get the value from automated cell
		 long actresult6= Long.parseLong(m75.getAttribute("value"));
			 	 	
		 //Verify if result is as expected
		 if(actresult6==expresult6) 
		   {
			 System.out.println("Service-Total Indirect Manpower formula cell displays expected value- PASS=  " +actresult6);  
		   }
	     else
		   {
			 System.out.println("Service-Total Indirect Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult6);
		   }
	     
	     //click on Spares
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@id=\"mat-tab-label-0-3\"])")).click();
	     Thread.sleep(2000);
	     
	     //Spares>direct manpower>spares
	     WebElement m76= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	     WebElement m77= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	     WebElement m78= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	     WebElement m79= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	     
	     //Spare>Indirect>Back office
	     WebElement m80= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	     WebElement m81= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	     WebElement m82= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	     WebElement m83= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	     
	     Thread.sleep(2000);
//	     m76.sendKeys("10");
//	     m77.sendKeys("20");
//	     m78.sendKeys("15");
//	     m79.sendKeys("18");
//	     m80.sendKeys("19");
//	     m81.sendKeys("14");
	     Thread.sleep(2000);
	     
	    long mc76= Long.parseLong(m76.getAttribute("value"));
	  	long mc77= Long.parseLong(m77.getAttribute("value"));
	  	long mc78= Long.parseLong(m78.getAttribute("value"));
	  	long mc79= Long.parseLong(m79.getAttribute("value"));
	  	long mc80= Long.parseLong(m80.getAttribute("value"));
	  	long mc81= Long.parseLong(m81.getAttribute("value"));
	       
//	     //save data
//	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	          
	     //scroll
	     Thread.sleep(2000);
	     Actions S= new Actions(driver);
	     S.sendKeys(Keys.PAGE_UP).perform();
	     Thread.sleep(1000);
	     
	     //calculation Spares>Total direct Manpower
	     long expresult7= mc76+mc77+mc78+mc79;
		 	
		 //get the value from automated cell
	     long actresult7= Long.parseLong(m82.getAttribute("value"));
		 	 	
		 //Verify if result is as expected
		 if(actresult7==expresult7) 
		 	{
		 	  System.out.println("Spares-Total Direct Manpower formula cell displays expected value- PASS=  " +actresult7);  
		 	}
		 else
		 	{
		 	  System.out.println("Spares-Total Direct Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>. FAIL= " +actresult7);
		 	}
		     
		 //calculation Spares>Total Indirect Manpower
		 long expresult8= mc80+mc81;
			 	
	     //get the value from automated cell
		 long actresult8= Long.parseLong(m83.getAttribute("value"));
			 	 	
	     //Verify if result is as expected
		 if(actresult8==expresult8) 
			{
			  System.out.println("Spares-Total Indirect Manpower formula cell displays expected value- PASS=  " +actresult8);  
			}
		else
			{
			  System.out.println("Spares-Total Indirect Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult8);
			}
	     
	     //click on True Value
	     driver.findElement(By.xpath("(//*[@id=\"mat-tab-label-0-4\"])")).click();
	     Thread.sleep(1000);
	     
	     //True Value>direct manpower>sales
	     WebElement m84= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	     WebElement m85= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	     WebElement m86= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	     WebElement m87= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	     
	     //True Value>direct manpower>Sourcing Executive
	     WebElement m88= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	     WebElement m89= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	     WebElement m90= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	     
	     //True Value>indirect>Back office
	     WebElement m91= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	     WebElement m92= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	     WebElement m93= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	     WebElement m94= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	     WebElement m95= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	     
	     //True Value>indirect>House Keeping
	     WebElement m96= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	     WebElement m97= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	     WebElement m98= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	     WebElement m99= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	     WebElement m100= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	     WebElement m101= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	     WebElement m102= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	     WebElement m103= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	     
	     Thread.sleep(2000);
//	     m84.sendKeys("10");
//	     m85.sendKeys("11");
//	     m86.sendKeys("12");
//	     m87.sendKeys("13");
//	     m88.sendKeys("14");
//	     m89.sendKeys("15");
//	     m90.sendKeys("16");
//	     m91.sendKeys("17");
//	     m92.sendKeys("18");
//	     m93.sendKeys("19");
//	     m94.sendKeys("20");
//	     m95.sendKeys("21");
//	     m96.sendKeys("22");
//	     m97.sendKeys("10");
//	     m98.sendKeys("11");
//	     m99.sendKeys("12");
//	     m100.sendKeys("13");
//	     m101.sendKeys("14");
	     
	    long mc84= Long.parseLong(m84.getAttribute("value"));
	  	long mc85= Long.parseLong(m85.getAttribute("value"));
	  	long mc86= Long.parseLong(m86.getAttribute("value"));
	  	long mc87= Long.parseLong(m87.getAttribute("value"));
	  	long mc88= Long.parseLong(m88.getAttribute("value"));
	  	long mc89= Long.parseLong(m89.getAttribute("value"));
	  	long mc90= Long.parseLong(m90.getAttribute("value"));
	  	long mc91= Long.parseLong(m91.getAttribute("value"));
	  	long mc92= Long.parseLong(m92.getAttribute("value"));
	  	long mc93= Long.parseLong(m93.getAttribute("value"));
	  	long mc94= Long.parseLong(m94.getAttribute("value"));
	  	long mc95= Long.parseLong(m95.getAttribute("value"));
	  	long mc96= Long.parseLong(m96.getAttribute("value"));
	  	long mc97= Long.parseLong(m97.getAttribute("value"));
	  	long mc98= Long.parseLong(m98.getAttribute("value"));
	  	long mc99= Long.parseLong(m99.getAttribute("value"));
	  	long mc100= Long.parseLong(m100.getAttribute("value"));
	  	long mc101= Long.parseLong(m101.getAttribute("value"));
	  	Thread.sleep(2000);
	     
//	     //save data
//	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	     Thread.sleep(2000);
	     
	     //scroll
	     Thread.sleep(2000);
	     Actions T= new Actions(driver);
	     T.sendKeys(Keys.PAGE_UP).perform();
	     Thread.sleep(1000);
	     
	     //calculation True Value>Total direct Manpower
	     long expresult9= mc84+mc85+mc86+mc87+mc88+mc89+mc90;
		 	
		 //get the value from automated cell
	     long actresult9= Long.parseLong(m102.getAttribute("value"));
		 	 	
		 //Verify if result is as expected
		 if(actresult9==expresult9) 
		   {
		 	 System.out.println("True Value-Total Direct Manpower formula cell displays expected value- PASS=  " +actresult9);  
		   }
		 else
		   {
		 	 System.out.println("True Value-Total Direct Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult9);
		   }
		     
		 //calculation True Value>Total Indirect Manpower
		 long expresult10= mc91+mc92+mc93+mc94+mc95+mc96+mc97+mc98+mc99+mc100
					     +mc101;
			 	
		//get the value from automated cell
		 long actresult10= Long.parseLong(m103.getAttribute("value"));
			 	 	
		//Verify if result is as expected
	    if(actresult10==expresult10) 
		  {
			System.out.println("True Value-Total Indirect Manpower formula cell displays expected value- PASS=  " +actresult10);  
		  }
		else
		  {
			 System.out.println("True Value-Total Indirect Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult10);
		  }
	     
	     //click on MI Renewal
	     driver.findElement(By.xpath("(//*[@id=\"mat-tab-label-0-5\"])")).click();
	     Thread.sleep(1000);
	     
	     //MIR>direct manpower>Insurance Renewal
	     WebElement m104= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	     WebElement m105= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	     WebElement m106= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	     WebElement m107= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	     WebElement m108= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	     WebElement m109= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	     WebElement m110= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	     WebElement m111= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	     
	     Thread.sleep(2000);
//	     m104.sendKeys("12");
//	     m105.sendKeys("15");
//	     m106.sendKeys("18");
//	     m107.sendKeys("19");
//	     m108.sendKeys("14");
//	     m109.sendKeys("16");
	     
	    long mc104= Long.parseLong(m104.getAttribute("value"));
	  	long mc105= Long.parseLong(m105.getAttribute("value"));
	  	long mc106= Long.parseLong(m106.getAttribute("value"));
	  	long mc107= Long.parseLong(m107.getAttribute("value"));
	  	long mc108= Long.parseLong(m108.getAttribute("value"));
	  	long mc109= Long.parseLong(m109.getAttribute("value"));
	    Thread.sleep(2000);
	     
//	     //save data
//	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	     Thread.sleep(2000);
	     
	     //scroll        
	     Actions MI= new Actions(driver);
	     MI.sendKeys(Keys.PAGE_UP).perform();
	     Thread.sleep(2000);
	     
	     //calculation MI Renewal>Total direct Manpower
	     long expresult11= mc104+mc105+mc106+mc107;
		 	
		 //get the value from automated cell
	     long actresult11= Long.parseLong(m110.getAttribute("value"));
		 	 	
		 //Verify if result is as expected
		 if(actresult11==expresult11) 
		   {
		 	 System.out.println("MI Renewal-Total Direct Manpower formula cell displays expected value- PASS=  " +actresult11);  
		   }
		 else
		   {
		 	 System.out.println("MI Renewal-Total Direct Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult11);
		   }
		     
		 //calculation MI Renewal>Total Indirect Manpower
		 long expresult12= mc108+mc109;
			 	
		 //get the value from automated cell
		 long actresult12= Long.parseLong(m111.getAttribute("value"));
			 	 	
		 //Verify if result is as expected
		 if(actresult12==expresult12) 
		   {
			 System.out.println("MI Renewal-Total Indirect Manpower formula cell displays expected value- PASS=  " +actresult12);  
		   }
		 else
		   {
			 System.out.println("MI Renewal-Total Indirect Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult12);
		   }
	     
	     //click on MDS
	     driver.findElement(By.xpath("(//*[@id=\"mat-tab-label-0-6\"])")).click();
	     Thread.sleep(1000);
	     
	     //MDS>direct manpower>MDS
	     WebElement m112= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	     WebElement m113= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	     WebElement m114= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	     WebElement m115= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	     WebElement m116= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	     WebElement m117= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	     
	     Thread.sleep(2000);
//	     m112.sendKeys("10");
//	     m113.sendKeys("15");
//	     m114.sendKeys("18");
//	     m115.sendKeys("20");
	     
	    long mc112= Long.parseLong(m112.getAttribute("value"));
	  	long mc113= Long.parseLong(m113.getAttribute("value"));
	  	long mc114= Long.parseLong(m114.getAttribute("value"));
	  	long mc115= Long.parseLong(m115.getAttribute("value"));
	    Thread.sleep(2000);
	     
//	    //save data
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	          
	    //scroll
	    Thread.sleep(2000);
	    Actions D= new Actions(driver);
	    D.sendKeys(Keys.PAGE_UP).perform();
	    Thread.sleep(1000);  
	     
	    //calculation MDS>Total direct Manpower
	    long expresult13= mc112+mc113;
		 	
		//get the value from automated cell
	    long actresult13= Long.parseLong(m116.getAttribute("value"));
		 	 	
		//Verify if result is as expected
		if(actresult13==expresult13) 
		 {
		   System.out.println("MDS-Total Direct Manpower formula cell displays expected value- PASS=  " +actresult13);  
		 }
		else
		 {
		   System.out.println("MDS-Total Direct Manpower formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult13);
		 }
		     
		//calculation MDS>Total Indirect Manpower
		long expresult14= mc114+mc115;
			 	
		//get the value from automated cell
		long actresult14= Long.parseLong(m117.getAttribute("value"));
			 	 	
	    //Verify if result is as expected
		if(actresult14==expresult14) 
		  {
			System.out.println("MDS-Total Indirect Manpower formula cell displays expected value- PASS=  " +actresult14);  
		  } 
	    else
		  {
			 System.out.println("MDS-Total Indirect Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult14);
		  }
	     
	     //click on Corporate office
	     driver.findElement(By.xpath("(//*[@id=\"mat-tab-label-0-7\"])")).click();
	     Thread.sleep(1000);
	     
	     //CO>direct manpower>accounts
	     WebElement m118= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	     WebElement m119= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	     WebElement m120= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	     WebElement m121= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	     
	     //CO>direct manpower>finance
	     WebElement m122= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	     
	     //CO>indirect>accounts
	     WebElement m123= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	     WebElement m124= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	     WebElement m125= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	     WebElement m126= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	     WebElement m127= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	     
	     //CO>indirect>coorporate professional
	     WebElement m128= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	     WebElement m129= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	     WebElement m130= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	     WebElement m131= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	     WebElement m132= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	     WebElement m133= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	     WebElement m134= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	     
	     //CO>indirect>housekeeping
	     WebElement m135= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	     WebElement m136= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	     WebElement m137= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	     
	     Thread.sleep(2000);
//	     m118.sendKeys("12");
//	     m119.sendKeys("12");
//	     m120.sendKeys("13");
//	     m121.sendKeys("14");
//	     m122.sendKeys("15");
//	     m123.sendKeys("16");
//	     m124.sendKeys("17");
//	     m125.sendKeys("18");
//	     m126.sendKeys("19");
//	     m127.sendKeys("13");
//	     m128.sendKeys("15");
//	     m129.sendKeys("17");
//	     m130.sendKeys("19");
//	     m131.sendKeys("11");
//	     m132.sendKeys("12");
//	     m133.sendKeys("13");
//	     m134.sendKeys("10");
//	     m135.sendKeys("16");
	     
	    long mc118= Long.parseLong(m118.getAttribute("value"));
	  	long mc119= Long.parseLong(m119.getAttribute("value"));
	  	long mc120= Long.parseLong(m120.getAttribute("value"));
	  	long mc121= Long.parseLong(m121.getAttribute("value"));
	  	long mc122= Long.parseLong(m122.getAttribute("value"));
	  	long mc123= Long.parseLong(m123.getAttribute("value"));
	  	long mc124= Long.parseLong(m124.getAttribute("value"));
	  	long mc125= Long.parseLong(m125.getAttribute("value"));
	  	long mc126= Long.parseLong(m126.getAttribute("value"));
	  	long mc127= Long.parseLong(m127.getAttribute("value"));
	  	long mc128= Long.parseLong(m128.getAttribute("value"));
	  	long mc129= Long.parseLong(m129.getAttribute("value"));
	  	long mc130= Long.parseLong(m130.getAttribute("value"));
	  	long mc131= Long.parseLong(m131.getAttribute("value"));
	  	long mc132= Long.parseLong(m132.getAttribute("value"));
	  	long mc133= Long.parseLong(m133.getAttribute("value"));
	  	long mc134= Long.parseLong(m134.getAttribute("value"));
	  	long mc135= Long.parseLong(m135.getAttribute("value"));  	
	    Thread.sleep(2000);
	                  
//	     //save data
//	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	     Thread.sleep(2000);
//	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
//	     
	     //scroll
	     Thread.sleep(2000);
	     Actions C= new Actions(driver);
	     C.sendKeys(Keys.PAGE_UP).perform();
	     
	     Thread.sleep(2000);
	     Actions CM= new Actions(driver);
	     CM.sendKeys(Keys.PAGE_UP).perform();
	     
	     //calculation Co-Office>Total direct Manpower
	     long expresult15=mc118+mc119+mc120+mc121+mc122;
		 	
		 //get the value from automated cell
	     long actresult15= Long.parseLong(m136.getAttribute("value"));
		 	 	
		 //Verify if result is as expected
		 if(actresult15==expresult15) 
		 	{
		 	  System.out.println("Co-Office-Total Direct Manpower formula cell displays expected value- PASS=  " +actresult15);  
		 	}
		 	else
		 	{
		 	  System.out.println("Co-Office-Total Direct Manpower formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +actresult15);
		 	}
		     
		  //calculation Co-Office>Total Indirect Manpower
		 long expresult16= mc123+mc124+mc125+mc126+mc127+mc128+mc129+mc130
					      +mc131+mc132+mc133+mc134+mc135;
			 	
		  //get the value from automated cell
		 long actresult16= Long.parseLong(m137.getAttribute("value"));
			 	 	
		  //Verify if result is as expected
		  if(actresult16==expresult16) 
			{
			  System.out.println("Co-Office-Total Indirect Manpower formula cell displays expected value- PASS=  " +actresult16);  
			}
		  else
			{
			  System.out.println("Co-Office-Total Indirect Manpower formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  FAIL= " +actresult16);
			}
	     
	          System.out.println("....................................................E..N..D.....................................................................");
	        
		    }


	
}
