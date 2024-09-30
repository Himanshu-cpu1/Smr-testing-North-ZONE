package aLL_CALCULATION_MODULES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ManpowerCount {
	static void ManpowerCount_Page(WebDriver driver) throws InterruptedException {
		//click on Manpower Count option
		 Thread.sleep(3000);	     
	     driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[5]")).click();
	     Thread.sleep(2000);
	     
	     //clear data first
	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	     Thread.sleep(3000);
	     
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
	     m1.sendKeys("10");
	     m2.sendKeys("15");
	     m3.sendKeys("16");
	     m4.sendKeys("20");
	     m5.sendKeys("14");
	     m6.sendKeys("13");
	     m7.sendKeys("10");
	     m8.sendKeys("11");
	     m9.sendKeys("12");
	     m10.sendKeys("10");
	     m11.sendKeys("15");
	     m12.sendKeys("16");
	     m13.sendKeys("17");
	     m14.sendKeys("18");
	     m15.sendKeys("19");
	     m16.sendKeys("10");
	     m17.sendKeys("20");
	     m18.sendKeys("10");
	     m19.sendKeys("21");
	     m20.sendKeys("13");
	     m21.sendKeys("14");
	     
	     //convert into integers
	    int mc1= Integer.parseInt(m1.getAttribute("value"));
	  	int mc2= Integer.parseInt(m2.getAttribute("value"));
	  	int mc3= Integer.parseInt(m3.getAttribute("value"));
	  	int mc4= Integer.parseInt(m4.getAttribute("value"));
	  	int mc5= Integer.parseInt(m5.getAttribute("value"));
	  	int mc6= Integer.parseInt(m6.getAttribute("value"));
	  	int mc7= Integer.parseInt(m7.getAttribute("value"));
	  	int mc8= Integer.parseInt(m8.getAttribute("value"));
	  	int mc9= Integer.parseInt(m9.getAttribute("value"));
	  	int mc10= Integer.parseInt(m10.getAttribute("value"));
	  	int mc11= Integer.parseInt(m11.getAttribute("value"));
	  	int mc12= Integer.parseInt(m12.getAttribute("value"));
	  	int mc13= Integer.parseInt(m13.getAttribute("value"));
	  	int mc14= Integer.parseInt(m14.getAttribute("value"));
	  	int mc15= Integer.parseInt(m15.getAttribute("value"));
	  	int mc16= Integer.parseInt(m16.getAttribute("value"));
	  	int mc17= Integer.parseInt(m17.getAttribute("value"));
	  	int mc18= Integer.parseInt(m18.getAttribute("value"));
	  	int mc19= Integer.parseInt(m19.getAttribute("value"));
	  	int mc20= Integer.parseInt(m20.getAttribute("value"));
	  	int mc21= Integer.parseInt(m21.getAttribute("value"));  	         
	    Thread.sleep(2000);
	    //save data
	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	     
	    //scroll Up
	    Thread.sleep(2000);
	    Actions A= new Actions(driver);
	    A.sendKeys(Keys.PAGE_UP).perform();
	     
	    //calculation New Car>Total Direct Manpower
	  	int expresult1= mc1+mc2+mc3+mc4;
	  	
	  	//get the value from automated cell
	  	int actresult1= Integer.parseInt(m22.getAttribute("value"));
	  	
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
	 	int expresult2= mc5+mc6+mc7+mc8+mc9+mc10+mc11+mc12+mc13+mc14+mc15+mc16+mc17+mc18+mc19+mc20+mc21;
	 	 	
	 	//get the value from automated cell
	 	int actresult2= Integer.parseInt(m23.getAttribute("value"));
	 	 	 	
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
	    m24.sendKeys("11");
	    m25.sendKeys("12"); 
	    m26.sendKeys("13"); 
	    m27.sendKeys("14"); 
	    m28.sendKeys("15"); 
	    Thread.sleep(2000);
	     
	    int mc24= Integer.parseInt(m24.getAttribute("value"));
	  	int mc25= Integer.parseInt(m25.getAttribute("value"));
	  	int mc26= Integer.parseInt(m26.getAttribute("value"));
	  	int mc27= Integer.parseInt(m27.getAttribute("value"));
	  	int mc28= Integer.parseInt(m28.getAttribute("value"));
	  	
	    //save data
	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	          
	    //scroll Up
	    Thread.sleep(2000);
	    Actions MS= new Actions(driver);
	    MS.sendKeys(Keys.PAGE_UP).perform();
	     
	    //calculation MSGA>Total direct Manpower
		int expresult3= mc24+mc25+mc26;
		 	
		//get the value from automated cell
		int actresult3= Integer.parseInt(m29.getAttribute("value"));
		 	 	
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
		 int expresult4= mc27+mc28;
			 	
		 //get the value from automated cell
		 int actresult4= Integer.parseInt(m30.getAttribute("value"));
			 	 	
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
	     m31.sendKeys("10");
	     m32.sendKeys("16");
	     m33.sendKeys("17");
	     m34.sendKeys("13");
	     m35.sendKeys("12");
	     m36.sendKeys("15");
	     m37.sendKeys("11");
	     m38.sendKeys("15");
	     m39.sendKeys("12");
	     m40.sendKeys("15");
	     m41.sendKeys("16");
	     m42.sendKeys("18");
	     m43.sendKeys("10");
	     m44.sendKeys("19");
	     m45.sendKeys("14");
	     m46.sendKeys("17");
	     m47.sendKeys("10");
	     m48.sendKeys("13");
	     m49.sendKeys("15");
	     m50.sendKeys("17");
	     m51.sendKeys("10");
	     m52.sendKeys("18");
	     m53.sendKeys("10");
	     m54.sendKeys("12");
	     m55.sendKeys("11");
	     m56.sendKeys("11");
	     m57.sendKeys("16");
	     m58.sendKeys("17");
	     m59.sendKeys("17");
	     m60.sendKeys("18");
	     m61.sendKeys("10");
	     m62.sendKeys("13");
	     m63.sendKeys("12");
	     m64.sendKeys("18");
	     m65.sendKeys("11");
	     m66.sendKeys("12");
	     m67.sendKeys("14");
	     m68.sendKeys("10");
	     m69.sendKeys("10");
	     m70.sendKeys("16");
	     m71.sendKeys("19");
	     m72.sendKeys("14");
	     m73.sendKeys("16");
	     
	    int mc31= Integer.parseInt(m31.getAttribute("value"));
	  	int mc32= Integer.parseInt(m32.getAttribute("value"));
	  	int mc33= Integer.parseInt(m33.getAttribute("value"));
	  	int mc34= Integer.parseInt(m34.getAttribute("value"));
	  	int mc35= Integer.parseInt(m35.getAttribute("value"));
	  	int mc36= Integer.parseInt(m36.getAttribute("value"));
	  	int mc37= Integer.parseInt(m37.getAttribute("value"));
	  	int mc38= Integer.parseInt(m38.getAttribute("value"));
	  	int mc39= Integer.parseInt(m39.getAttribute("value"));
	  	int mc40= Integer.parseInt(m40.getAttribute("value"));
	  	int mc41= Integer.parseInt(m41.getAttribute("value"));
	  	int mc42= Integer.parseInt(m42.getAttribute("value"));
	  	int mc43= Integer.parseInt(m43.getAttribute("value"));
	  	int mc44= Integer.parseInt(m44.getAttribute("value"));
	  	int mc45= Integer.parseInt(m45.getAttribute("value"));
	  	int mc46= Integer.parseInt(m46.getAttribute("value"));
	  	int mc47= Integer.parseInt(m47.getAttribute("value"));
	  	int mc48= Integer.parseInt(m48.getAttribute("value"));
	  	int mc49= Integer.parseInt(m49.getAttribute("value"));
	  	int mc50= Integer.parseInt(m50.getAttribute("value"));
	  	int mc51= Integer.parseInt(m51.getAttribute("value"));
	  	int mc52= Integer.parseInt(m52.getAttribute("value"));
	  	int mc53= Integer.parseInt(m53.getAttribute("value"));
	  	int mc54= Integer.parseInt(m54.getAttribute("value"));
	  	int mc55= Integer.parseInt(m55.getAttribute("value"));
	  	int mc56= Integer.parseInt(m56.getAttribute("value"));
	  	int mc57= Integer.parseInt(m57.getAttribute("value"));
	  	int mc58= Integer.parseInt(m58.getAttribute("value"));
	  	int mc59= Integer.parseInt(m59.getAttribute("value"));
	  	int mc60= Integer.parseInt(m60.getAttribute("value"));
	  	int mc61= Integer.parseInt(m61.getAttribute("value"));
	  	int mc62= Integer.parseInt(m62.getAttribute("value"));
	  	int mc63= Integer.parseInt(m63.getAttribute("value"));
	  	int mc64= Integer.parseInt(m64.getAttribute("value"));
	  	int mc65= Integer.parseInt(m65.getAttribute("value"));
	  	int mc66= Integer.parseInt(m66.getAttribute("value"));
	  	int mc67= Integer.parseInt(m67.getAttribute("value"));
	  	int mc68= Integer.parseInt(m68.getAttribute("value"));
	  	int mc69= Integer.parseInt(m69.getAttribute("value"));
	  	int mc70= Integer.parseInt(m70.getAttribute("value"));
	  	int mc71= Integer.parseInt(m71.getAttribute("value"));
	  	int mc72= Integer.parseInt(m72.getAttribute("value"));
	  	int mc73= Integer.parseInt(m73.getAttribute("value"));  	     
	    Thread.sleep(2000);
	     
	     //save data
	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	          
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
		 int expresult5= mc31+mc32+mc33+mc34+mc35+mc36+mc37+mc38+mc39+mc40
		 			        +mc41+mc42+mc43+mc44+mc45+mc46+mc47+mc48+mc49+mc50+
		 			        mc51+mc52+mc53+mc54;
		 	
		 //get the value from automated cell
		 int actresult5= Integer.parseInt(m74.getAttribute("value"));
		 	 	
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
		 int expresult6= mc55+mc56+mc57+mc58+mc59+mc60+mc61+mc62+mc63+mc64
					         +mc65+mc66+mc67+mc68+mc69+mc70+mc71+mc72+mc73;
			 	
		 //get the value from automated cell
		 int actresult6= Integer.parseInt(m75.getAttribute("value"));
			 	 	
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
	     m76.sendKeys("10");
	     m77.sendKeys("20");
	     m78.sendKeys("15");
	     m79.sendKeys("18");
	     m80.sendKeys("19");
	     m81.sendKeys("14");
	     Thread.sleep(2000);
	     
	    int mc76= Integer.parseInt(m76.getAttribute("value"));
	  	int mc77= Integer.parseInt(m77.getAttribute("value"));
	  	int mc78= Integer.parseInt(m78.getAttribute("value"));
	  	int mc79= Integer.parseInt(m79.getAttribute("value"));
	  	int mc80= Integer.parseInt(m80.getAttribute("value"));
	  	int mc81= Integer.parseInt(m81.getAttribute("value"));
	       
	     //save data
	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	          
	     //scroll
	     Thread.sleep(2000);
	     Actions S= new Actions(driver);
	     S.sendKeys(Keys.PAGE_UP).perform();
	     Thread.sleep(1000);
	     
	     //calculation Spares>Total direct Manpower
		 int expresult7= mc76+mc77+mc78+mc79;
		 	
		 //get the value from automated cell
		 int actresult7= Integer.parseInt(m82.getAttribute("value"));
		 	 	
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
		 int expresult8= mc80+mc81;
			 	
	     //get the value from automated cell
		 int actresult8= Integer.parseInt(m83.getAttribute("value"));
			 	 	
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
	     m84.sendKeys("10");
	     m85.sendKeys("11");
	     m86.sendKeys("12");
	     m87.sendKeys("13");
	     m88.sendKeys("14");
	     m89.sendKeys("15");
	     m90.sendKeys("16");
	     m91.sendKeys("17");
	     m92.sendKeys("18");
	     m93.sendKeys("19");
	     m94.sendKeys("20");
	     m95.sendKeys("21");
	     m96.sendKeys("22");
	     m97.sendKeys("10");
	     m98.sendKeys("11");
	     m99.sendKeys("12");
	     m100.sendKeys("13");
	     m101.sendKeys("14");
	     
	    int mc84= Integer.parseInt(m84.getAttribute("value"));
	  	int mc85= Integer.parseInt(m85.getAttribute("value"));
	  	int mc86= Integer.parseInt(m86.getAttribute("value"));
	  	int mc87= Integer.parseInt(m87.getAttribute("value"));
	  	int mc88= Integer.parseInt(m88.getAttribute("value"));
	  	int mc89= Integer.parseInt(m89.getAttribute("value"));
	  	int mc90= Integer.parseInt(m90.getAttribute("value"));
	  	int mc91= Integer.parseInt(m91.getAttribute("value"));
	  	int mc92= Integer.parseInt(m92.getAttribute("value"));
	  	int mc93= Integer.parseInt(m93.getAttribute("value"));
	  	int mc94= Integer.parseInt(m94.getAttribute("value"));
	  	int mc95= Integer.parseInt(m95.getAttribute("value"));
	  	int mc96= Integer.parseInt(m96.getAttribute("value"));
	  	int mc97= Integer.parseInt(m97.getAttribute("value"));
	  	int mc98= Integer.parseInt(m98.getAttribute("value"));
	  	int mc99= Integer.parseInt(m99.getAttribute("value"));
	  	int mc100= Integer.parseInt(m100.getAttribute("value"));
	  	int mc101= Integer.parseInt(m101.getAttribute("value"));
	  	Thread.sleep(2000);
	     
	     //save data
	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	     Thread.sleep(2000);
	     
	     //scroll
	     Thread.sleep(2000);
	     Actions T= new Actions(driver);
	     T.sendKeys(Keys.PAGE_UP).perform();
	     Thread.sleep(1000);
	     
	     //calculation True Value>Total direct Manpower
		 	int expresult9= mc84+mc85+mc86+mc87+mc88+mc89+mc90;
		 	
		 //get the value from automated cell
		 int actresult9= Integer.parseInt(m102.getAttribute("value"));
		 	 	
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
		int expresult10= mc91+mc92+mc93+mc94+mc95+mc96+mc97+mc98+mc99+mc100
					     +mc101;
			 	
		//get the value from automated cell
	    int actresult10= Integer.parseInt(m103.getAttribute("value"));
			 	 	
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
	     m104.sendKeys("12");
	     m105.sendKeys("15");
	     m106.sendKeys("18");
	     m107.sendKeys("19");
	     m108.sendKeys("14");
	     m109.sendKeys("16");
	     
	    int mc104= Integer.parseInt(m104.getAttribute("value"));
	  	int mc105= Integer.parseInt(m105.getAttribute("value"));
	  	int mc106= Integer.parseInt(m106.getAttribute("value"));
	  	int mc107= Integer.parseInt(m107.getAttribute("value"));
	  	int mc108= Integer.parseInt(m108.getAttribute("value"));
	  	int mc109= Integer.parseInt(m109.getAttribute("value"));
	    Thread.sleep(2000);
	     
	     //save data
	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	     Thread.sleep(2000);
	     
	     //scroll        
	     Actions MI= new Actions(driver);
	     MI.sendKeys(Keys.PAGE_UP).perform();
	     Thread.sleep(2000);
	     
	     //calculation MI Renewal>Total direct Manpower
		 int expresult11= mc104+mc105+mc106+mc107;
		 	
		 //get the value from automated cell
		 int actresult11= Integer.parseInt(m110.getAttribute("value"));
		 	 	
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
		 int expresult12= mc108+mc109;
			 	
		 //get the value from automated cell
	     int actresult12= Integer.parseInt(m111.getAttribute("value"));
			 	 	
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
	     m112.sendKeys("10");
	     m113.sendKeys("15");
	     m114.sendKeys("18");
	     m115.sendKeys("20");
	     
	    int mc112= Integer.parseInt(m112.getAttribute("value"));
	  	int mc113= Integer.parseInt(m113.getAttribute("value"));
	  	int mc114= Integer.parseInt(m114.getAttribute("value"));
	  	int mc115= Integer.parseInt(m115.getAttribute("value"));
	    Thread.sleep(2000);
	     
	    //save data
	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	          
	    //scroll
	    Thread.sleep(2000);
	    Actions D= new Actions(driver);
	    D.sendKeys(Keys.PAGE_UP).perform();
	    Thread.sleep(1000);  
	     
	    //calculation MDS>Total direct Manpower
		int expresult13= mc112+mc113;
		 	
		//get the value from automated cell
		int actresult13= Integer.parseInt(m116.getAttribute("value"));
		 	 	
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
	    int expresult14= mc114+mc115;
			 	
		//get the value from automated cell
		int actresult14= Integer.parseInt(m117.getAttribute("value"));
			 	 	
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
	     m118.sendKeys("12");
	     m119.sendKeys("12");
	     m120.sendKeys("13");
	     m121.sendKeys("14");
	     m122.sendKeys("15");
	     m123.sendKeys("16");
	     m124.sendKeys("17");
	     m125.sendKeys("18");
	     m126.sendKeys("19");
	     m127.sendKeys("13");
	     m128.sendKeys("15");
	     m129.sendKeys("17");
	     m130.sendKeys("19");
	     m131.sendKeys("11");
	     m132.sendKeys("12");
	     m133.sendKeys("13");
	     m134.sendKeys("10");
	     m135.sendKeys("16");
	     
	    int mc118= Integer.parseInt(m118.getAttribute("value"));
	  	int mc119= Integer.parseInt(m119.getAttribute("value"));
	  	int mc120= Integer.parseInt(m120.getAttribute("value"));
	  	int mc121= Integer.parseInt(m121.getAttribute("value"));
	  	int mc122= Integer.parseInt(m122.getAttribute("value"));
	  	int mc123= Integer.parseInt(m123.getAttribute("value"));
	  	int mc124= Integer.parseInt(m124.getAttribute("value"));
	  	int mc125= Integer.parseInt(m125.getAttribute("value"));
	  	int mc126= Integer.parseInt(m126.getAttribute("value"));
	  	int mc127= Integer.parseInt(m127.getAttribute("value"));
	  	int mc128= Integer.parseInt(m128.getAttribute("value"));
	  	int mc129= Integer.parseInt(m129.getAttribute("value"));
	  	int mc130= Integer.parseInt(m130.getAttribute("value"));
	  	int mc131= Integer.parseInt(m131.getAttribute("value"));
	  	int mc132= Integer.parseInt(m132.getAttribute("value"));
	  	int mc133= Integer.parseInt(m133.getAttribute("value"));
	  	int mc134= Integer.parseInt(m134.getAttribute("value"));
	  	int mc135= Integer.parseInt(m135.getAttribute("value"));  	
	    Thread.sleep(2000);
	                  
	     //save data
	     driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();
	     
	     //scroll
	     Thread.sleep(2000);
	     Actions C= new Actions(driver);
	     C.sendKeys(Keys.PAGE_UP).perform();
	     
	     Thread.sleep(2000);
	     Actions CM= new Actions(driver);
	     CM.sendKeys(Keys.PAGE_UP).perform();
	     
	     //calculation Co-Office>Total direct Manpower
		 int expresult15=mc118+mc119+mc120+mc121+mc122;
		 	
		 //get the value from automated cell
		 int actresult15= Integer.parseInt(m136.getAttribute("value"));
		 	 	
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
		  int expresult16= mc123+mc124+mc125+mc126+mc127+mc128+mc129+mc130
					      +mc131+mc132+mc133+mc134+mc135;
			 	
		  //get the value from automated cell
		  int actresult16= Integer.parseInt(m137.getAttribute("value"));
			 	 	
		  //Verify if result is as expected
		  if(actresult16==expresult16) 
			{
			  System.out.println("Co-Office-Total Indirect Manpower formula cell displays expected value- PASS=  " +actresult16);  
			}
		  else
			{
			  System.out.println("Co-Office-Total Indirect Manpower formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  FAIL= " +actresult16);
			}
	     
	          System.out.println("The data is saved");
	        
		    }

}
