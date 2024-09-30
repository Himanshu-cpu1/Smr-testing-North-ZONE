package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InterestCost {
	
static void IC_Calculations(WebDriver driver) throws InterruptedException  {
		
		//click on longerest Cost
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[4]")).click();
	    
	    System.out.println(".......................longerest Cost.........................................");
	    System.out.println(".............................................................................");

	    //longerest Cost Page
	    Thread.sleep(2000);        
	    String expICURL= "https://dev-dbp.msilfintrac.co.in/Dashboard/Interest-Cost";        
	    String actICURL= driver.getCurrentUrl();       	    
	    if(expICURL.equals(actICURL))
	    {
	 	   System.out.println("longerest Cost page is displayed successfully with expected url: " +actICURL);
	    }    
	    else
	    {
	 	   System.out.println("Incorrect URL! longerest Cost page will not display: " +actICURL);
	 	
	    }  
	    	   
//	    //clear data first
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
	    Thread.sleep(2000);
//	    
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
	    	    
//	    //send the values
//	    i1.sendKeys("10670");
//	    i2.sendKeys("200987");
//	    i3.sendKeys("300765");
//	    i4.sendKeys("400875");
//	    i5.sendKeys("50096");
//	    i6.sendKeys("600647");
//	    i7.sendKeys("700478");	    
//	    i9.sendKeys("800486");
//	    i10.sendKeys("900846");
//	    i11.sendKeys("100064");
//	    i12.sendKeys("100567");
//	    i13.sendKeys("200987");
//	    i14.sendKeys("30098");
//	    i15.sendKeys("40008");	   
//	    i25.sendKeys("50076");
//	    i26.sendKeys("60087");
//	    i27.sendKeys("70098");
//	    i28.sendKeys("80098");
//	    i29.sendKeys("90067");
//	    i30.sendKeys("100780");
//	    i31.sendKeys("10078");	    
//	    i33.sendKeys("20098");
//	    i34.sendKeys("30065");
//	    i35.sendKeys("40089");
//	    i36.sendKeys("500");
//	    i37.sendKeys("600");
//	    i38.sendKeys("700");
//	    i39.sendKeys("800");	 
//	    i50.sendKeys("900");
//	    i51.sendKeys("1000");
//	    i52.sendKeys("100");
//	    i53.sendKeys("200");
//	    i54.sendKeys("300");
//	    i55.sendKeys("400");
//	    i56.sendKeys("500");	 
//	    i58.sendKeys("600");
//	    i59.sendKeys("700");
//	    i60.sendKeys("800");
//	    i61.sendKeys("900");
//	    i62.sendKeys("1000");
//	    i63.sendKeys("100");
//	    i64.sendKeys("200");	   
//	    i74.sendKeys("300");
//	    i75.sendKeys("400");
//	    i76.sendKeys("500");
//	    i77.sendKeys("600");
//	    i78.sendKeys("700");
//	    i79.sendKeys("800987");
//	    i80.sendKeys("90087");	   
//	    i82.sendKeys("100098");
//	    i83.sendKeys("10076");
//	    i84.sendKeys("20067");
//	    i85.sendKeys("30078");
//	    i86.sendKeys("40078");
//	    i87.sendKeys("50098");
//	    i88.sendKeys("60055"); 
	  	    
	    //convert longo longegers
	    long ic1= Long.parseLong(i1.getAttribute("value"));
	    long ic2= Long.parseLong(i2.getAttribute("value"));
	    long ic3= Long.parseLong(i3.getAttribute("value"));
	    long ic4= Long.parseLong(i4.getAttribute("value"));
	    long ic5= Long.parseLong(i5.getAttribute("value"));
	    long ic6= Long.parseLong(i6.getAttribute("value"));
	    long ic7= Long.parseLong(i7.getAttribute("value"));
	    long ic8= Long.parseLong(i8.getAttribute("value"));
	    long ic9= Long.parseLong(i9.getAttribute("value"));
	    long ic10= Long.parseLong(i10.getAttribute("value"));
	    long ic11= Long.parseLong(i11.getAttribute("value"));
	    long ic12= Long.parseLong(i12.getAttribute("value"));
	    long ic13= Long.parseLong(i13.getAttribute("value"));
	    long ic14= Long.parseLong(i14.getAttribute("value"));
	    long ic15= Long.parseLong(i15.getAttribute("value"));
	    long ic16= Long.parseLong(i16.getAttribute("value"));
	    long ic25= Long.parseLong(i25.getAttribute("value"));
	    long ic26= Long.parseLong(i26.getAttribute("value"));
	    long ic27= Long.parseLong(i27.getAttribute("value"));
	    long ic28= Long.parseLong(i28.getAttribute("value"));
	    long ic29= Long.parseLong(i29.getAttribute("value"));
	    long ic30= Long.parseLong(i30.getAttribute("value"));
	    long ic31= Long.parseLong(i31.getAttribute("value"));
	    long ic32= Long.parseLong(i32.getAttribute("value"));
	    long ic33= Long.parseLong(i33.getAttribute("value"));
	    long ic34= Long.parseLong(i34.getAttribute("value"));
	    long ic35= Long.parseLong(i35.getAttribute("value"));
	    long ic36= Long.parseLong(i36.getAttribute("value"));
	    long ic37= Long.parseLong(i37.getAttribute("value"));
	    long ic38= Long.parseLong(i38.getAttribute("value"));
	    long ic39= Long.parseLong(i39.getAttribute("value"));
	    long ic40= Long.parseLong(i40.getAttribute("value"));
	    long ic48= Long.parseLong(i48.getAttribute("value"));	    	   
	    long ic50= Long.parseLong(i50.getAttribute("value"));
	    long ic51= Long.parseLong(i51.getAttribute("value"));
	    long ic52= Long.parseLong(i52.getAttribute("value"));
	    long ic53= Long.parseLong(i53.getAttribute("value"));
	    long ic54= Long.parseLong(i54.getAttribute("value"));
	    long ic55= Long.parseLong(i55.getAttribute("value"));
	    long ic56= Long.parseLong(i56.getAttribute("value"));
	    long ic57= Long.parseLong(i57.getAttribute("value"));
	    long ic58= Long.parseLong(i58.getAttribute("value"));
	    long ic59= Long.parseLong(i59.getAttribute("value"));
	    long ic60= Long.parseLong(i60.getAttribute("value"));
	    long ic61= Long.parseLong(i61.getAttribute("value"));
	    long ic62= Long.parseLong(i62.getAttribute("value"));
	    long ic63= Long.parseLong(i63.getAttribute("value"));
	    long ic64= Long.parseLong(i64.getAttribute("value"));
	    long ic65= Long.parseLong(i65.getAttribute("value"));	    
	    long ic74= Long.parseLong(i74.getAttribute("value"));
	    long ic75= Long.parseLong(i75.getAttribute("value"));
	    long ic76= Long.parseLong(i76.getAttribute("value"));
	    long ic77= Long.parseLong(i77.getAttribute("value"));
	    long ic78= Long.parseLong(i78.getAttribute("value"));
	    long ic79= Long.parseLong(i79.getAttribute("value"));
	    long ic80= Long.parseLong(i80.getAttribute("value"));
	    long ic81= Long.parseLong(i81.getAttribute("value"));
	    long ic82= Long.parseLong(i82.getAttribute("value"));
	    long ic83= Long.parseLong(i83.getAttribute("value"));
	    long ic84= Long.parseLong(i84.getAttribute("value"));
	    long ic85= Long.parseLong(i85.getAttribute("value"));
	    long ic86= Long.parseLong(i86.getAttribute("value"));
	    long ic87= Long.parseLong(i87.getAttribute("value"));
	    long ic88= Long.parseLong(i88.getAttribute("value"));
	    long ic89= Long.parseLong(i89.getAttribute("value"));	    
	    	    	    
	    //calculation of Short term IC
	    //calculation of elements as per requirement	    
	    long expST1= ic1+ic9;
	    
	    //get the value from automated cell
	    long result1= Long.parseLong(i17.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result1==expST1) 
	   {
		 System.out.println("ST New Car formula cell displays correct value- PASS=  " +result1);  
	   }
	   else
	   {
		   System.out.println("ST New Car formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result1);
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST2= ic2+ic10;
	    
	    //get the value from automated cell
	   long result2= Long.parseLong(i18.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result2==expST2) 
	   {
		 System.out.println("ST MSGA formula cell displays correct value- PASS=  " +result2);  
	   }
	   else
	   {
		   System.out.println(" ST MSGA formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result2);
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST3= ic3+ic11;
	    
	    //get the value from automated cell
	   long result3= Long.parseLong(i19.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result3==expST3) 
	   {
		 System.out.println("ST Service formula cell displays correct value- PASS=  " +result3);  
	   }
	   else
	   {
		   System.out.println("ST Service formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result3);
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST4= ic4+ic12;
	    
	    //get the value from automated cell
	   long result4= Long.parseLong(i20.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result4==expST4) 
	   {
		 System.out.println("ST Spares formula cell displays correct value- PASS=  " +result4);  
	   }
	   else
	   {
		   System.out.println("ST Spares formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result4);
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST5= ic5+ic13;
	    
	    //get the value from automated cell
	   long result5= Long.parseLong(i21.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result5==expST5) 
	   {
		 System.out.println("ST POC formula cell displays correct value- PASS=  " +result5);  
	   }
	   else
	   {
		   System.out.println("ST POC formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result5);
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST6= ic6+ic14;
	    
	    //get the value from automated cell
	   long result6= Long.parseLong(i22.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result6==expST6) 
	   {
		 System.out.println("ST MI formula cell displays correct value- PASS=  " +result6);  
	   }
	   else
	   {
		   System.out.println("ST MI formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.>> FAIL= " +result6);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST7= ic7+ic15;
	    
	    //get the value from automated cell
	   long result7= Long.parseLong(i23.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result7==expST7) 
	   {
		 System.out.println("ST MDS formula cell displays correct value- PASS=  " +result7);  
	   }
	   else
	   {
		   System.out.println("ST MDS formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result7);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST8= ic8+ic16;
	    
	    //get the value from automated cell
	   long result8= Long.parseLong(i24.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result8==expST8) 
	   {
		 System.out.println("ST Total formula cell displays correct value- PASS=  " +result8);  
	   }
	   else
	   {
		   System.out.println("ST Total formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result8);		   
	   }
	   
	   //calculation of elements as per requirement	    
	   long expST9= ic1+ic2+ic3+ic4+ic5+ic6+ic7;
	    
	    //get the value from automated cell
	   long result9= Long.parseLong(i8.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result9==expST9) 
	   {
		 System.out.println("ST BFI Total formula cell displays correct value- PASS=  " +result9);  
	   }
	   else
	   {
		   System.out.println("ST BFI Total formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result9);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST10= ic9+ic10+ic11+ic12+ic13+ic14+ic15;
	    
	    //get the value from automated cell
	   long result10= Long.parseLong(i16.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result10==expST10) 
	   {
		 System.out.println("Total ST DRP formula cell displays correct value- PASS =  " +result10);  
	   }
	   else
	   {
		   System.out.println("Total ST DRP formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result10);		   
	   }
	   
	   //calculation of elements as per requirement	    
	   long expST11= ic25+ic33;
	    
	    //get the value from automated cell
	   long result11= Long.parseLong(i41.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result11==expST11) 
	   {
		 System.out.println("ST IC New Car formula cell displays correct value- PASS =  " +result11);  
	   }
	   else
	   {
		   System.out.println("IC New Car formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result11);		   
	   }
	   
	   //calculation of elements as per requirement	    
	   long expST12= ic26+ic34;
	    
	    //get the value from automated cell
	   long result12= Long.parseLong(i42.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result12==expST12) 
	   {
		 System.out.println("ST IC MSGA formula cell displays correct value- PASS =  " +result12);  
	   }
	   else
	   {
		   System.out.println("IC MSGA formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result12);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST13= ic27+ic35;
	    
	    //get the value from automated cell
	   long result13= Long.parseLong(i43.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result13==expST13) 
	   {
		 System.out.println("ST IC Service formula cell displays correct value- PASS =  " +result13);  
	   }
	   else
	   {
		   System.out.println("IC Service formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result13);		   
	   }
	   
	   //calculation of elements as per requirement	    
	   long expST14= ic28+ic36;
	    
	    //get the value from automated cell
	   long result14= Long.parseLong(i44.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result14==expST14) 
	   {
		 System.out.println("ST IC Spares formula cell displays correct value- PASS  =  " +result14);  
	   }
	   else
	   {
		   System.out.println("IC Spares formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result14);		   
	   }
	   
	   //calculation of elements as per requirement	    
	   long expST15= ic29+ic37;
	    
	    //get the value from automated cell
	   long result15= Long.parseLong(i45.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result15==expST15) 
	   {
		 System.out.println("ST IC POC formula cell displays correct value- PASS =  " +result15);  
	   }
	   else
	   {
		  System.out.println("IC POC formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result15);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST16= ic30+ic38;
	    
	    //get the value from automated cell
	   long result16= Long.parseLong(i46.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result16==expST16) 
	   {
		 System.out.println("ST IC MI formula cell displays correct value- PASS =  " +result16);  
	   }
	   else
	   {
		 System.out.println("IC MI formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result16);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST17= ic31+ic39;
	    
	    //get the value from automated cell
	   long result17= Long.parseLong(i47.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result17==expST17) 
	   {
		 System.out.println("ST IC MDS formula cell displays correct value- PASS =  " +result17);  
	   }
	   else
	   {
		 System.out.println("IC MDS formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result17);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST18= ic32+ic40;
	    
	    //get the value from automated cell
	   long result18= Long.parseLong(i48.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result18==expST18) 
	   {
		 System.out.println("ST IC Total formula cell displays correct value- PASS =  " +result18);  
	   }
	   else
	   {
		 System.out.println("ST IC Total formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result18);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expST19= ic25+ic26+ic27+ic28+ic29+ic30+ic31;
	    
	    //get the value from automated cell
	   long result19= Long.parseLong(i32.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result19==expST19) 
	   {
		 System.out.println("ST IC BF formula cell displays correct value- PASS  =  " +result19);  
	   }
	   else
	   {
		 System.out.println("ST IC BF formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result19);		   
	   }
	   
	 //calculation of elements as per requirement	    
	   long expST20= ic33+ic34+ic35+ic36+ic37+ic38+ic39;
	    
	    //get the value from automated cell
	   long result20= Long.parseLong(i40.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result20==expST20) 
	   {
		 System.out.println("ST IC DRP formula cell displays correct value- PASS  =  " +result20);  
	   }
	   else
	   {
		 System.out.println("ST IC DRP formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result20);		   
	   }
	   	   
	    //calculation of Long term IC
	    //calculation of elements as per requirement	    
	   long expLT1= ic50+ic58;
	    
	    //get the value from automated cell
	   long result21= Long.parseLong(i66.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result21==expLT1) 
	   {
		 System.out.println("LT New Car formula cell displays correct value- PASS=  " +result21);  
	   }
	   else
	   {
		 System.out.println("LT New Car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result21);		   
	   }
	   
	   //calculation of elements as per requirement	    
	   long expLT2= ic51+ic59;
	    
	    //get the value from automated cell
	   long result22= Long.parseLong(i67.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result22==expLT2) 
	   {
		 System.out.println("LT MSGA formula cell displays correct value- PASS=  " +result22);  
	   }
	   else
	   {
		 System.out.println("LT MSGA formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result22);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expLT3= ic52+ic60;
	    
	    //get the value from automated cell
	   long result23= Long.parseLong(i68.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result23==expLT3) 
	   {
		 System.out.println("LT Service formula cell displays correct value- PASS=  " +result23);  
	   }
	   else
	   {
		 System.out.println("LT Service formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result23);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expLT4= ic53+ic61;
	    
	    //get the value from automated cell
	   long result24= Long.parseLong(i69.getAttribute("value"));
	    
	    //Verify if result is as expected
	   if(result24==expLT4) 
	   {
		 System.out.println("LT Spares formula cell displays correct value- PASS=  " +result24);  
	   }
	   else
	   {
		 System.out.println("LT Spares formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result24);		   
	   }
	   
	    //calculation of elements as per requirement	    
	   long expLT5= ic54+ic62;
	    
	    //get the value from automated cell
	   long result25= Long.parseLong(i70.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result25==expLT5) 
	   {
		 System.out.println("LT POC formula cell displays correct value- PASS=  " +result25);  
	   }
	   else
	   {
		 System.out.println("LT POC formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result25);		   
	   }
	    
	    //calculation of elements as per requirement	    
	    long expLT6= ic55+ic63;
	    
	    //get the value from automated cell
	    long result26= Long.parseLong(i71.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result26==expLT6) 
	   {
		 System.out.println("LT MI formula cell displays correct value- PASS=  " +result26);  
	   }
	   else
	   {
		 System.out.println("LT MI formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FAIL= " +result26);		   
	   }
	    
	    //calculation of elements as per requirement	    
	    long expLT7= ic56+ic64;
	    
	    //get the value from automated cell
	    long result27= Long.parseLong(i72.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result27==expLT7) 
	   {
		 System.out.println("LT MDS formula cell displays correct value- PASS=  " +result27);  
	   }
	   else
	   {
		 System.out.println("LT MDS formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result27);		   
	   }
	    
	   //calculation of elements as per requirement	    
	    long expLT8= ic57+ic65;
	    
	    //get the value from automated cell
	    long result28= Long.parseLong(i73.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result28==expLT8) 
	   {
		 System.out.println("LT Total formula cell displays correct value- PASS=  " +result28);  
	   }
	   else
	   {
		 System.out.println("LT Total formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result28);		   
	   }

	  //calculation of elements as per requirement	    
	    long expLT9= ic50+ic51+ic52+ic53+ic54+ic55+ic56;
	    
	    //get the value from automated cell
	    long result29= Long.parseLong(i57.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result29==expLT9) 
	   {
		 System.out.println("LT BF formula cell displays correct value- PASS=  " +result29);  
	   }
	   else
	   {
		 System.out.println("LT BF formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result29);		   
	   }
	    
	    //calculation of elements as per requirement	    
	    long expLT10= ic58+ic59+ic60+ic61+ic62+ic63+ic64;
	    
	    //get the value from automated cell
	    long result30= Long.parseLong(i65.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result30==expLT10) 
	   {
		 System.out.println("LT DRP formula cell displays correct value- PASS=  " +result30);  
	   }
	   else
	   {
		 System.out.println("LT DRP formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result30);		   
	   }
	    
	    //calculation of elements as per requirement	    
	    long expLT11= ic74+ic82;
	    
	    //get the value from automated cell
	    long result31= Long.parseLong(i90.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result31==expLT11) 
	   {
		 System.out.println("LT IC New Car formula cell displays correct value- PASS=  " +result31);  
	   }
	   else
	   {
		 System.out.println("LT IC New Car formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result31);		   
	   }
	    
	    //calculation of elements as per requirement	    
	    long expLT12= ic75+ic83;
	    
	    //get the value from automated cell
	    long result32= Long.parseLong(i91.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result32==expLT12) 
	   {
		 System.out.println("LT IC MSGA formula cell displays correct value- PASS=  " +result32);  
	   }
	   else
	   {
		 System.out.println("LT IC MSGA formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result32);		   
	   }
	    
	  //calculation of elements as per requirement	    
	    long expLT13= ic76+ic84;
	    
	    //get the value from automated cell
	    long result33= Long.parseLong(i92.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result33==expLT13) 
	   {
		 System.out.println("LT IC Service formula cell displays correct value- PASS=  " +result33);  
	   }
	   else
	   {
		 System.out.println("LT IC Service formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result33);		   
	   }
	    
	  //calculation of elements as per requirement	    
	    long expLT14= ic77+ic85;
	    
	    //get the value from automated cell
	    long result34= Long.parseLong(i93.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result34==expLT14) 
	   {
		 System.out.println("LT IC Spares formula cell displays correct value- PASS=  " +result34);  
	   }
	   else
	   {
		 System.out.println("LT IC Spares formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL  = " +result34);		   
	   }
	  //calculation of elements as per requirement	    
	    long expLT15= ic78+ic86;
	    
	    //get the value from automated cell
	    long result35= Long.parseLong(i94.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result35==expLT15) 
	   {
		 System.out.println("LT IC POC formula cell displays correct value- PASS=  " +result35);  
	   }
	   else
	   {
		 System.out.println("LT IC POC formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +result35);		   
	   }
	    
	   //calculation of elements as per requirement	    
	    long expLT16= ic79+ic87;
	    
	    //get the value from automated cell
	    long result36= Long.parseLong(i95.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result36==expLT16) 
	   {
		 System.out.println("LT IC MI formula cell displays correct value- PASS=  " +result36);  
	   }
	   else
	   {
		 System.out.println("LT IC MI formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL  = " +result36);		   
	   }
	    
	   //calculation of elements as per requirement	    
	    long expLT17= ic80+ic88;
	    
	    //get the value from automated cell
	    long result37= Long.parseLong(i96.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result37==expLT17) 
	   {
		 System.out.println("LT IC MDS formula cell displays correct value- PASS=  " +result37);  
	   }
	   else
	   {
		 System.out.println("LT IC MDS formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +result37);		   
	   }
	    
	   //calculation of elements as per requirement	    
	    long expLT18= ic81+ic89;
	    
	    //get the value from automated cell
	    long result38= Long.parseLong(i97.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result38==expLT18) 
	   {
		 System.out.println("Total LT IC formula cell displays correct value- PASS=  " +result38);  
	   }
	   else
	   {
		 System.out.println("Total LT IC formula cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +result38);		   
	   }
	    
	   //calculation of elements as per requirement	    
	    long expLT19= ic74+ic75+ic76+ic77+ic78+ic79+ic80;
	    
	    //get the value from automated cell
	    long result39= Long.parseLong(i81.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result39==expLT19) 
	    {
		 System.out.println("Total LT BF formula cell displays correct value- PASS=  " +result39);  
	    }
	   else
	    {
		 System.out.println("Total LT BF formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +result39);		   
	    }
	    
	    //calculation of elements as per requirement	    
	    long expLT20= ic82+ic83+ic84+ic85+ic86+ic87+ic88;
	    
	    //get the value from automated cell
	    long result40= Long.parseLong(i89.getAttribute("value"));
	    
	    //Verify if result is as expected
	    if(result40==expLT20) 
	    {
		 System.out.println("Total LT DRP formula cell displays correct value- PASS=  " +result40);  
	    }
	   else
	    {
		 System.out.println("Total LT DRP formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +result40);		   
	    }
	    
	  
//	    	 	    	    	   	   	   	   	   	   	   	   	   	    	    	    	    
//	   	//Save data
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//	    Thread.sleep(3000);
	    
	    //To check auto populated cells
		//Navigate to New Car
	    driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();
		Thread.sleep(2000);
	    WebElement QN1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // New Car Quantity
		Thread.sleep(2000);
		String quantity1 = QN1.getAttribute("value"); // Or another attribute name   
		System.out.println("Quantity- Auto populated cell in New Car page: "+ quantity1);
		double Q1= Double.parseDouble(QN1.getAttribute("value"));
		   
		   
		 //Navigate back to longerest Cost 
		 driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[4]")).click();	
		 WebElement i49= driver.findElement(By.xpath("(//*[@type=\"number\"])[49]"));
		 WebElement i98= driver.findElement(By.xpath("(//*[@type=\"number\"])[98]"));
		 WebElement is97= driver.findElement(By.xpath("(//*[@type=\"number\"])[97]"));
		 WebElement i99= driver.findElement(By.xpath("(//*[@type=\"number\"])[99]"));
		 long ic49= Long.parseLong(i49.getAttribute("value"));
		 long ic98= Long.parseLong(i98.getAttribute("value"));
		 long isc97= Long.parseLong(is97.getAttribute("value"));
		 //calculate ST longerest Cost Per Car
		 double expSTIC= ic48/Q1 ;
		 long roundexpST= Math.round(expSTIC);
		    
		 //get the value from automated cell
		 long result41= Long.parseLong(i49.getAttribute("value"));
		    
		 //Verify if result is as expected
		 if(result41==roundexpST) 
		  {
			 System.out.println("Short Term longerest Cost Per Car- auto populated cell displays correct value- PASS=  " +roundexpST);  
		  }
		 else
		  {
			 System.out.println("Short Term longerest Cost Per Car- auto populated cell displays incorrect value->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +roundexpST);		   
		  }
		 
		//calculate LT longerest Cost Per Car
		 double expLTIC= isc97/Q1 ;
		 long roundexpLT= Math.round(expLTIC);
		 		    
		 //get the value from automated cell
		 long result42= Long.parseLong(i98.getAttribute("value"));
		    
		 //Verify if result is as expected
		 if(result42==roundexpLT) 
		  {
			 System.out.println("Long Term longerest Cost Per Car- auto populated cell displays correct value- PASS=  " +roundexpLT);  
		  }
		 else
		  {
			 System.out.println("Long Term longerest Cost Per Car- auto populated cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +roundexpLT);		   
		  }
		 
		 
		//calculation of elements as per requirement	    
		long expTIC21= ic49+ic98;
		    
		//get the value from automated cell
		long result43= Long.parseLong(i99.getAttribute("value"));
		    
	     //Verify if result is as expected
		 if(result43==expTIC21) 
		   {
			 System.out.println("Total IC/Car formula cell displays correct value- PASS=  " +expTIC21);  
		   }
		 else
		   {
			 System.out.println("Total IC/Car formula cell displays incorrect value- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL = " +expTIC21);		   
		   }
		 
		 System.out.println("................................E...N...D....................................");
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		   
}
}
