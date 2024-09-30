package IMPORT_Calculation;

import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Autopopulate_SubmitDBP {
	static void Submit_DBP_Page(WebDriver driver) throws InterruptedException {
		
		//click on New Car
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[6]")).click();
		Thread.sleep(3000);				  
		//............................................................................................................................			
		//Verify auto populated cells for New Car:			
	    //New Car Quantity
		
	    WebElement QN1 = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); 
	    Thread.sleep(2000);
	    long qn1= Long.parseLong(QN1.getAttribute("value"));     //quantity in new car
		System.out.println("Quantity- AUTO POPULATED CELL in New Car page displays: "+qn1);
				
		Thread.sleep(1000);
		WebElement n2= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));   //new retail sales
		Thread.sleep(1000);
		long nc2= Long.parseLong(n2.getAttribute("value"));
		
		Thread.sleep(1000);
	    WebElement n3= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));    //new car margin
		Thread.sleep(1000);
		long nc3= Long.parseLong(n3.getAttribute("value"));
		
		WebElement n5= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]"));      //total DRF Amount
		Thread.sleep(1000);
		long nc5= Long.parseLong(n5.getAttribute("value"));
		
		WebElement n11= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));     // Wholesale Incentives : MAC/NAC
		Thread.sleep(1000);
		long nc11= Long.parseLong(n11.getAttribute("value"));	
		
		WebElement n13= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));     // Wholesale Incentive : Trade Discount
		Thread.sleep(1000);
		long nc13= Long.parseLong(n13.getAttribute("value"));
		
		WebElement n7= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]"));     // Support received as Discount on MSIL Invoice
		Thread.sleep(1000);
	    long nc7= Long.parseLong(n7.getAttribute("value"));
		
		WebElement n9= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]"));     // Support credited/To be credicted
		Thread.sleep(1000);
		long nc9= Long.parseLong(n9.getAttribute("value"));
						
		WebElement n72= driver.findElement(By.xpath("(//*[@type=\"text\"])[72]"));     //total new car income
		Thread.sleep(1000);
		long nc72= Long.parseLong(n72.getAttribute("value"));
		
		WebElement n78= driver.findElement(By.xpath("(//*[@type=\"text\"])[78]"));      //Total New Car Direct Expense
		Thread.sleep(1000);
		double nc78= Double.parseDouble(n78.getAttribute("value"));
		//....................................................................................................................................................................		
		//navigate to Stock Sheet
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[2]")).click();
		Thread.sleep(2000);
		
		WebElement s1= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]"));  //opening stock total amt
		Thread.sleep(2000);
		long st1= Long.parseLong(s1.getAttribute("value"));
		
		WebElement s2= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));  //wholesale stock total amt
		Thread.sleep(2000);
		long st2= Long.parseLong(s2.getAttribute("value"));
		
		WebElement s3= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]"));  //closing stock total amt
		Thread.sleep(2000);
		long st3= Long.parseLong(s3.getAttribute("value"));
		//..............................................................................................................................................................
		//navigate to MDS
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[7]")).click();
		Thread.sleep(2000);
		
		WebElement QM2= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));  //Quantity in MDS
		Thread.sleep(2000);
		long qm2= Long.parseLong(QM2.getAttribute("value"));
		System.out.println("Quantity- AUTO POPULATED CELL in MDS page displays: "+qm2);
		
	    WebElement m1= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));   //Total MDS Income [A]
	    Thread.sleep(1000);
	    double md1= Double.parseDouble(m1.getAttribute("value"));
	    
	    WebElement m2= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));   //Total MDS Direct Expense [B]
	    Thread.sleep(1000);
	    double md2= Double.parseDouble(m2.getAttribute("value"));
		//......................................................................................................................................................................................
		//navigate to MI Renewal
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[8]")).click();
		Thread.sleep(2000);
	    
		WebElement QMI3= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));  // quantity in MI Renewal
		Thread.sleep(2000);
		long qmi3= Long.parseLong(QMI3.getAttribute("value"));
		System.out.println("Quantity- AUTO POPULATED CELL in MI Renewal page displays: "+qmi3);
				
		WebElement mi1= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]")); // Total MI Renewal Income[A]
		Thread.sleep(1000);
	   double mir1= Double.parseDouble(mi1.getAttribute("value"));
	    
		WebElement mi2= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]")); //Total MI Renewal Direct Expense [B]
		Thread.sleep(1000);
	    double mir2= Double.parseDouble(mi2.getAttribute("value"));
	    //......................................................................................................................................................................................
	    //navigate to MSGA
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[9]")).click();
		Thread.sleep(2000);
		
	    WebElement mg1= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]")); //total MSGA income [A]
	    Thread.sleep(1000);
	    double msg1= Double.parseDouble(mg1.getAttribute("value"));
	    
	    WebElement mg2= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")); //total MSGA Margin Sales
	    Thread.sleep(1000);
	    double msg2= Double.parseDouble(mg2.getAttribute("value"));
	    
	    WebElement mg3= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")); //total MSGA Sales
	    Thread.sleep(1000);
	    double msg3= Double.parseDouble(mg3.getAttribute("value"));
	    
	    WebElement mg4= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]")); //Cost of Goods sold
	    Thread.sleep(1000);
	    double msg4= Double.parseDouble(mg4.getAttribute("value"));
	    
	    WebElement mg5= driver.findElement(By.xpath("(//*[@type=\"number\"])[31]")); //Total MSGA direct Expense
	    Thread.sleep(1000);
	    double msg5= Double.parseDouble(mg5.getAttribute("value"));
	    	//.....................................................................................................................................................................................................    
	    //navigate to True Value
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[10]")).click();
		Thread.sleep(2000);
		
	    WebElement QT4= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")); //quantity in True Value
	    Thread.sleep(1000);
		long qt4= Long.parseLong(QT4.getAttribute("value"));
		System.out.println("Quantity- AUTO POPULATED CELL in True Value page displays: "+qt4);
				
	    WebElement tv1= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]")); //Total POC Sales Income [A]\
	    Thread.sleep(1000);
	    double tvr1= Double.parseDouble(tv1.getAttribute("value"));
	    
	    WebElement tv2= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")); //POC Sales Margin (Income)
	    Thread.sleep(1000);
	    double tvr2= Double.parseDouble(tv2.getAttribute("value"));
	    
	    WebElement tv3= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")); //POC Sales Amount
	    Thread.sleep(1000);
	    double tvr3= Double.parseDouble(tv3.getAttribute("value"));
	    
	    WebElement tv4= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]")); //Cost of Goods Sold
	    Thread.sleep(1000);
	    double tvr4= Double.parseDouble(tv4.getAttribute("value"));
	    
	    WebElement tv5= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]")); //Total POC Sales Direct Expense [B]
	    Thread.sleep(1000);
	    double tvr5= Double.parseDouble(tv5.getAttribute("value"));
	    //......................................................................................................................................................................................................
	    //navigate to Spares
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[11]")).click();
		Thread.sleep(2000);
	    
	    WebElement sp1= driver.findElement(By.xpath("(//*[@type=\"text\"])[43]")); //Total Spares Income
	    Thread.sleep(1000);
	    double spr1= Double.parseDouble(sp1.getAttribute("value"));
	    
	    WebElement sp2= driver.findElement(By.xpath("(//*[@type=\"text\"])[21]")); //Spares Margin (Sales - Cost of Goods Sold)
	    Thread.sleep(1000);
	    double spr2= Double.parseDouble(sp2.getAttribute("value"));
	    
	    WebElement sp3= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")); //Total Spares Sales
	    Thread.sleep(1000);
	    double spr3= Double.parseDouble(sp3.getAttribute("value"));
	    
	    WebElement sp4= driver.findElement(By.xpath("(//*[@type=\"text\"])[20]")); //Cost of Goods Sold
	    Thread.sleep(1000);
	    double spr4= Double.parseDouble(sp4.getAttribute("value"));
	    
	    WebElement sp5= driver.findElement(By.xpath("(//*[@type=\"text\"])[47]")); //Total Spares Direct Expense
	    Thread.sleep(1000);
	    double spr5= Double.parseDouble(sp5.getAttribute("value"));
	   	//.........................................................................................................................................................................................................................   
	    //navigate to Service
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[12]")).click();
		Thread.sleep(2000);
	    
	    WebElement sr1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); //Free Service Load 
	    Thread.sleep(1000);
	    long srv1= Long.parseLong(sr1.getAttribute("value"));
	    System.out.println("Free Service Load Quantity- AUTO POPULATED CELL in Service page displays: "+srv1);
	     
	    WebElement sr2= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));  //Paid & Running Repairs Load
	    Thread.sleep(1000);
	    long srv2= Long.parseLong(sr2.getAttribute("value"));
	    System.out.println("Paid & Running Repairs Load Quantity- AUTO POPULATED CELL in Service page displays: "+srv2);
	    
	    WebElement sr3= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")); //Bodyshop Load
	    Thread.sleep(1000);
	    long srv3= Long.parseLong(sr3.getAttribute("value"));
	    System.out.println("Bodyshop Load Quantity- AUTO POPULATED CELL in Service page displays: "+srv3);
	    
	    WebElement sr4= driver.findElement(By.xpath("(//*[@type=\"text\"])[44]")); //Total Service Income [A]
	    Thread.sleep(1000);
	    double srv4= Double.parseDouble(sr4.getAttribute("value"));
	    
	    WebElement sr5= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")); //Total Service Direct Expense [B]
	    Thread.sleep(1000);
	    double srv5= Double.parseDouble(sr5.getAttribute("value"));
	    //...............................................................................................................................................................................................................
	    //navigate to Common Expense page
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[13]")).click();
		Thread.sleep(2000);
		
		//click on Other Expense tab
		driver.findElement(By.xpath("(//*[@type=\"button\"])[2]")).click();
		Thread.sleep(2000);
		
	    WebElement cm1= driver.findElement(By.xpath("(//*[@type=\"text\"])[120]"));  //Total Common Expenses
	    Thread.sleep(2000);
	    double cme1= Double.parseDouble(cm1.getAttribute("value"));
	    //...............................................................................................................................................................................................................
		//navigate back to View P & L page
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[16]")).click();
		Thread.sleep(5000);
		//................................................................................................................................................................................................			
		//Paths of Submit DBP elements	
		WebElement S1 = driver.findElement(By.xpath("(//*[@class=\"green form-control ng-untouched ng-pristine\"])[1]")); //quantity in Submit DBP
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
		WebElement S21 = driver.findElement(By.xpath("(//*[@class=\"green form-control ng-untouched ng-pristine ng-star-inserted\"])[12]"));
		WebElement S22 = driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
		WebElement S23 = driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
		WebElement S24= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
		WebElement S25= driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
		WebElement S26= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
		WebElement S27= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));	
		WebElement S28= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));	
		WebElement S29= driver.findElement(By.xpath("(//*[@class=\"green form-control ng-untouched ng-pristine ng-star-inserted\"])[19]"));
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
		//convert to longegers
		Thread.sleep(2000);
	    double sd1= Double.parseDouble(S1.getAttribute("value"));
		long sd2= Long.parseLong(S2.getAttribute("value"));	
		long sd3= Long.parseLong(S3.getAttribute("value"));
		long sd4= Long.parseLong(S4.getAttribute("value"));	
		long sd5= Long.parseLong(S5.getAttribute("value"));	
		long sd6= Long.parseLong(S6.getAttribute("value"));	
		long sd7= Long.parseLong(S7.getAttribute("value"));		
		long sd8= Long.parseLong(S8.getAttribute("value"));
		long sd9= Long.parseLong(S9.getAttribute("value"));
		long sd10= Long.parseLong(S10.getAttribute("value"));
		long sd11= Long.parseLong(S11.getAttribute("value"));
		long sd12= Long.parseLong(S12.getAttribute("value"));
		long sd13= Long.parseLong(S13.getAttribute("value"));
		long sd14= Long.parseLong(S14.getAttribute("value"));
		long sd15= Long.parseLong(S15.getAttribute("value"));
		long sd16= Long.parseLong(S16.getAttribute("value"));
		long sd17= Long.parseLong(S17.getAttribute("value"));
		long sd18= Long.parseLong(S18.getAttribute("value"));
		long sd19= Long.parseLong(S19.getAttribute("value"));
		long sd20= Long.parseLong(S20.getAttribute("value"));
		long sd21= Long.parseLong(S21.getAttribute("value"));
		long sd22= Long.parseLong(S22.getAttribute("value"));
		long sd23= Long.parseLong(S23.getAttribute("value"));
		long sd24= Long.parseLong(S24.getAttribute("value"));
		long sd25= Long.parseLong(S25.getAttribute("value"));
		long sd26= Long.parseLong(S26.getAttribute("value"));
		long sd27= Long.parseLong(S27.getAttribute("value"));
		long sd28= Long.parseLong(S28.getAttribute("value"));
		long sd29= Long.parseLong(S29.getAttribute("value"));
		long sd30= Long.parseLong(S30.getAttribute("value"));
		long sd31= Long.parseLong(S31.getAttribute("value"));
		long sd32= Long.parseLong(S32.getAttribute("value"));
		long sd33= Long.parseLong(S33.getAttribute("value"));
		long sd34= Long.parseLong(S34.getAttribute("value"));
		long sd35= Long.parseLong(S35.getAttribute("value"));
		long sd36= Long.parseLong(S36.getAttribute("value"));
		long sd37= Long.parseLong(S37.getAttribute("value"));
		long sd38= Long.parseLong(S38.getAttribute("value"));
		long sd39= Long.parseLong(S39.getAttribute("value"));
		long sd40= Long.parseLong(S40.getAttribute("value"));
		long sd41= Long.parseLong(S41.getAttribute("value"));
		long sd42= Long.parseLong(S42.getAttribute("value"));
		long sd43= Long.parseLong(S43.getAttribute("value"));
		long sd44= Long.parseLong(S44.getAttribute("value"));
		long sd45= Long.parseLong(S45.getAttribute("value"));
		long sd46= Long.parseLong(S46.getAttribute("value"));
		long sd47= Long.parseLong(S47.getAttribute("value"));
		double sd48= Double.parseDouble(S48.getAttribute("value"));
		Thread.sleep(3000);             
		//............................................................................................................................................................................						
		//verify New Car--> Volume in Submit DBP
        System.out.println("Volume- Auto populated cell in Submit DBP: "+ sd1);          
        if(sd1==qn1) 
          {
            System.out.println("Valid: "+sd1);          	
          }
        else 
          {
          	System.out.println("Invalid: "+sd1);          	          	          	
          }
		//..............................................................................................................................	
		//verify New Car--> Turnover in Submit DBP
	    double Sub1= nc72-nc3;
	    double Sub2= Sub1-nc5;
	    double Add3= Sub2+nc2;	    
	    double exp1= Add3/100000;
	    long roundedexp1 = Math.round(exp1);  			    
		//Verify if result is as expected
		if(sd8==roundedexp1) 
		  {
			 System.out.println("New Car- Turnover AUTO POPULATED CELL displays correct value- PASS=  " +sd8);  
		  }
		else
		  {
			 System.out.println("New Car- Turnover AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd8);		   
		  }
		//............................................................................................................................................
		//verify New Car-->COGS in Submit DBP
		long AddS1= st1+st2;
		long SubS2= AddS1-st3;
		double exp2= SubS2/100000;
		long roundedexp2 = Math.round(exp2);  			    
		//Verify if result is as expected
		if(sd16==roundedexp2) 
		  {
			 System.out.println("New Car- COGS AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp2);  
		  }
		else
		  {
			 System.out.println("New Car- COGS AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp2);		   
		  }
		//...............................................................................................................................................
	    //verify New Car-->Gross Margin in Submit DBP
		long SubS3= sd8-sd16;
		double Div1 = nc5/100000;
		double exp3= SubS3+Div1;
		long roundedexp3 = Math.round(exp3);  			    
		//Verify if result is as expected
		if(sd21==roundedexp3) 
		  {
			 System.out.println("New Car- Gross Margin AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp3);  
		  }
		else
		  {
			 System.out.println("New Car- Gross Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp3);		   
		  }
		//.........................................................................................................................................................
		//verify New Car -->Direct Expense in Submit DBP
		double exp4= nc78/100000;
		long roundedexp4 = Math.round(exp4);  			    
		//Verify if result is as expected
		if(sd29==roundedexp4) 
		  {
			 System.out.println("New Car- Direct Expense AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp4);  
		  }
		else
		  {
			 System.out.println("New Car- Direct Expense AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp4);		   
		  }
		//..........................................................................................................................................................
		//verify New Car--> Contribution Margin in Submit DBP
		long exp5= sd21-sd29;
		if(sd37==exp5) 
		  {
			 System.out.println("New Car- Contribution Margin AUTO POPULATED CELL displays correct value- PASS=  " +exp5);  
		  }
		else
		  {
			 System.out.println("New Car- Contribution Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp5);		   
		  }
		//.............................................................................................................................................................
		//verify MDS--> Volume in Submit DBP
		System.out.println("Volume- MDS Auto populated cell in Submit DBP: "+ sd2);          
        if(sd2==qm2) 
          {
            System.out.println("Valid: "+sd2);          	
          }
        else 
          {
          	System.out.println("Invalid: "+sd2);          	          	          	
          }
        //................................................................................................................................................................
        //Verify MDS--> Turnover in Submit DBP
        double exp6= md1/100000;
        long roundedexp6 = Math.round(exp6);  			    
		//Verify if result is as expected
		if(sd9==roundedexp6) 
		  {
			 System.out.println("MDS- Turnover AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp6);  
		  }
		else
		  {
			 System.out.println("MDS- Turnover AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp6);		   
		  }
		//.............................................................................................................................................................
        //Verify MDS--> Gross Margin in Submit DBP
		if(sd22==sd9) 
		  {
			 System.out.println("MDS- Gross Margin AUTO POPULATED CELL displays correct value- PASS=  " +sd22);  
		  }
		else
		  {
			 System.out.println("MDS- Gross Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd22);		   
		  }
		//................................................................................................................................................................
        //Verify MDS--> Direct Expense
		double exp7= md2/100000;
        long roundedexp7 = Math.round(exp7);  			    
		//Verify if result is as expected
		if(sd30==roundedexp7) 
		  {
			 System.out.println("MDS- Direct Expense AUTO POPULATED CELL displays correct value- PASS=  " +sd30);  
		  }
		else
		  {
			 System.out.println("MDS- Direct Expense AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd30);		   
		  }
		//...........................................................................................................................................................................
		//verify MDS--> Contribution Margin in Submit DBP
		long exp8= sd22-sd30;
		if(sd38==exp8) 
		  {
			System.out.println("MDS- Contribution Margin AUTO POPULATED CELL displays correct value- PASS=  " +sd38);  
		  }
		else
		  {
			System.out.println("MDS- Contribution Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd38);		   
		  }
		//..................................................................................................................................................................
		//Verify MI Renewal--> Volume in Submit DBP
        System.out.println("Volume- Auto populated cell in MI Renewal Submit DBP: "+ sd3);          
        if(sd3==qmi3) 
          {
            System.out.println("Valid: "+sd3);          	
          }
        else 
          {
          	System.out.println("Invalid: "+sd3);          	          	          	
          }
        //................................................................................................................................................................
	    //Verify MI Renewal--> Turnover in Submit DBP
        double exp9= mir1/100000;
        long roundedexp9 = Math.round(exp9);  			    
		//Verify if result is as expected
		if(sd10==roundedexp9) 
		  {
			 System.out.println("MI Renewal- Turnover AUTO POPULATED CELL displays correct value- PASS=  " +sd10);  
		  }
		else
		  {
			 System.out.println("MI Renewal- Turnover AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd10);		   
		  }
		//..................................................................................................................................................................
		//Verify MI Renewal--> Gross Margin in Submit DBP
		if(sd23==sd10) 
		  {
			 System.out.println("MI Renewal- Gross Margin AUTO POPULATED CELL displays correct value- PASS=  " +sd23);  
		  }
		else
		  {
			 System.out.println("MI Renewal- Gross Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd23);		   
		  }
		//...................................................................................................................................................................
		//Verify MI Renewal--> Direct Expense in Submit DBP
		double exp10= mir2/100000;
        long roundedexp10 = Math.round(exp10);  			    
		//Verify if result is as expected
		if(sd31==roundedexp10) 
		  {
			 System.out.println("MI Renewal- Direct Expense AUTO POPULATED CELL displays correct value- PASS=  " +sd31);  
		  }
		else
		  {
			 System.out.println("MI Renewal- Direct Expense AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd31);		   
		  }
		//.....................................................................................................................................................................
		//verify MDS--> Contribution Margin in Submit DBP
		long exp11= sd23-sd31;
		if(sd39==exp11) 
		  {
			System.out.println("MI Renewal- Contribution Margin AUTO POPULATED CELL displays correct value- PASS=  " +sd39);  
		  }
		else
		  {
			System.out.println("MI Renewal- Contribution Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd39);		   
		  }
		//..........................................................................................................................................................................
		//verify MSGA--> Turnover
		double SubM1= msg1-msg2;
		double AddM1= SubM1+ msg3;
		double exp12= AddM1/100000;
        long roundedexp12 = Math.round(exp12);  			    
		//Verify if result is as expected
		if(sd11==roundedexp12) 
		  {
			 System.out.println("MSGA- Turnover AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp12);  
		  }
		else
		  {
			 System.out.println("MSGA- Turnover AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp12);		   
		  }
		//..........................................................................................................................................................................
		//Verify MSGA--> COGS in Submit DBP
		double exp13= msg4/100000;
		long roundedexp13 = Math.round(exp13);  			    
		//Verify if result is as expected
		if(sd17==roundedexp13) 
		  {
			 System.out.println("MSGA- COGS AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp13);  
		  }
		else
		  {
			 System.out.println("MSGA- COGS AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp13);		   
		  }
		//...........................................................................................................................................................................
		//Verify MSGA--> Gross Margin in Submit DBP
		long exp14= sd11-sd17;
		if(sd24==exp14) 
		  {
			System.out.println("MSGA- Gross Margin AUTO POPULATED CELL displays correct value- PASS=  " +exp14);  
		  }
		else
		  {
			System.out.println("MSGA- Gross Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp14);		   
		  }
		//......................................................................................................................................................................
		//Verify MSGA--> Direct Expense in Submit DBP
		double exp15= msg5/100000;
		long roundedexp15 = Math.round(exp15);  			    
		//Verify if result is as expected
		if(sd32==roundedexp15) 
		  {
			 System.out.println("MSGA- Direct Expense AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp15);  
		  }
		else
		  {
			 System.out.println("MSGA- Direct Expense AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp15);		   
		  }
		//.........................................................................................................................................................................
		//Verify Contribution Margin
		long exp16= sd24-sd32;
		if(sd40==exp16) 
		  {
			System.out.println("MSGA- Contribution Margin AUTO POPULATED CELL displays correct value- PASS=  " +exp16);  
		  }
		else
		  {
			System.out.println("MSGA- Contribution Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp16);		   
		  }
		//...........................................................................................................................................................................
		//verify True Value--> Volume in Submit DBP
		System.out.println("Volume- True Value Auto populated cell in Submit DBP: "+ sd4);          
        if(sd4==qt4) 
          {
            System.out.println("Valid: "+sd4);          	
          }
        else 
          {
          	System.out.println("Invalid: "+sd4);          	          	          	
          }
        //.............................................................................................................................................................................
		// Verify TRue Value--> Turnover in Submit DBP
        double SubT1= tvr1-tvr2;
        	double AddT1= SubT1+tvr3;
        double exp17= AddT1/100000;
        long roundedexp17 = Math.round(exp17);  			    
		//Verify if result is as expected
		if(sd12==roundedexp17) 
		  {
			 System.out.println("True Value- Turnover AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp17);  
		  }
		else
		  {
			 System.out.println("True Value- Turnover AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp17);		   
		  }
		//............................................................................................................................................................................
		//Verify TRue Value-->COGS in Submit DBP
		double exp18= tvr4/100000;
		long roundedexp18 = Math.round(exp18);  			    
		//Verify if result is as expected
		if(sd18==roundedexp18) 
		  {
			 System.out.println("True Value- COGS AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp18);  
		  }
		else
		  {
			 System.out.println("True Value- COGS AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp18);		   
		  }
		//...............................................................................................................................................................................
		//Verify True Value--> Gross Margin in submit DBP
		long exp19=sd12-sd18;
		if(sd25==exp19) 
		  {
			System.out.println("True Value- Gross Margin AUTO POPULATED CELL displays correct value- PASS=  " +exp19);  
		  }
		else
		  {
			System.out.println("True Value- Gross Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp19);		   
		  }
		//.................................................................................................................................................................................
		//Verify True Value--> Direct Expense in Submit DBP
		double exp20= tvr5/100000;
		long roundedexp20 = Math.round(exp20);  			    
		//Verify if result is as expected
		if(sd33==roundedexp20) 
		  {
			 System.out.println("True Value- Direct Expense AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp20);  
		  }
		else
		  {
			 System.out.println("True Value- Direct Expense AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp20);		   
		  }
		//...................................................................................................................................................................................
		//Verify Contribution Margin
		long exp21= sd25-sd33;
		if(sd41==exp21) 
		  {
			 System.out.println("True Value- Contribution Margin AUTO POPULATED CELL displays correct value- PASS=  " +exp21);  
		  }
		else
		  {
			 System.out.println("True Value- Contribution Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp21);		   
		  }
		//...................................................................................................................................................................................
		//Verify Spares--> Turnover in Submit DBP
		double SubS1= spr1-spr2;
		double AddS2= SubS1+spr3;
		double exp22= AddS2/100000;
		long roundedexp22 = Math.round(exp22);  			    
		//Verify if result is as expected
		if(sd13==roundedexp22) 
		  {
			 System.out.println("Spares- Turnover AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp22);  
		  }
		else
		  {
			 System.out.println("Spares- Turnover AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp22);		   
		  }
		//......................................................................................................................................................................................
		//Verify Spares-->COGS in Submit DBP
		double exp23= spr4/100000;
		long roundedexp23 = Math.round(exp23);  			    
		//Verify if result is as expected
		if(sd19==roundedexp23) 
		  {
			 System.out.println("Spares- COGS AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp23);  
		  }
		else
		  {
			 System.out.println("Spares- COGS AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp23);		   
		  }
		//............................................................................................................................................................................................
		//Verify Spares--> Gross Margin in Submit DBP
		long exp24= sd13-sd19;
		if(sd26==exp24) 
		  {
			 System.out.println("Spares- Gross Margin AUTO POPULATED CELL displays correct value- PASS=  " +exp24);  
		  }
		else
		  {
			 System.out.println("Spares- Gross Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp24);		   
		  }
		//................................................................................................................................................................................................
		//Verify Spares--> Direct Expense in Submit DBP
		double exp25= spr5/100000;
		long roundedexp25 = Math.round(exp25);  			    
		//Verify if result is as expected
		if(sd34==roundedexp25) 
		  {
			 System.out.println("Spares- Direct Expense AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp25);  
		  }
		else
		  {
			 System.out.println("Spares- Direct Expense AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp25);		   
		  }
		//................................................................................................................................................................................................
		//Verify Spares--> Contribution Margin in Submit DBP
		long exp26= sd26-sd34;
		if(sd42==exp26) 
		  {
			System.out.println("Spares- Contribution Margin AUTO POPULATED CELL displays correct value- PASS=  " +exp26);  
		  }
		else
		  {
			System.out.println("Spares- Contribution Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp26);		   
		  }
		//......................................................................................................................................................................................................
		//Verify Free Service Load in Submit DBP
		System.out.println("Volume- Free Service Load Auto populated cell in Submit DBP: "+ sd5);          
	    if(sd5==srv1) 
	      {
	         System.out.println("Valid: "+sd5);          	
	      }
	    else 
	      {
	         System.out.println("Invalid: "+sd5);          	          	          	
	      }
	    //..................................................................................................................................................................................................
	   //Verify Free Service Load in Submit DBP
	   System.out.println("Volume- Paid Running Repair Load Auto populated cell in Submit DBP: "+ sd6);          
	   if(sd6==srv2) 
	     {
	        System.out.println("Valid: "+sd6);          	
	     }
	   else 
	     {
	        System.out.println("Invalid: "+sd6);          	          	          	
	     }
	   //...........................................................................................................................................................................................
	   //Verify Free Service Load in Submit DBP
	   System.out.println("Volume- Bodyshop Load Auto populated cell in Submit DBP: "+ sd7);          
	   if(sd7==srv3) 
	     {
	      System.out.println("Valid: "+sd7);          	
	     }
	   else 
	     {
	      System.out.println("Invalid: "+sd7);          	          	          	
	     } 
	   //.......................................................................................................................................................................................... 
	   //Verify Service--> Turnover in Submit DBP
	   double exp27= srv4/100000;
	   long roundedexp27 = Math.round(exp27);  			    
       //Verify if result is as expected
	   if(sd14==roundedexp27) 
	     {
		   System.out.println("Service- Turnover AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp27);  
	     }
	   else
	     {
		   System.out.println("Service- Turnover AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp27);		   
	     }
	   //.........................................................................................................................................................................................
	   //Verify Service--> Gross Margin in Submit DBP
	   if(sd27==sd14) 
	     {
		     System.out.println("Service- Gross Margin AUTO POPULATED CELL displays correct value- PASS=  " +sd27);  
	     }
	   else
	     {
		     System.out.println("Service- Gross Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sd27);		   
	     }
	   //...........................................................................................................................................................................................
	   //Verify Service--> Direct Expense in Submit DBP
	   double exp28= srv5/100000;
	   long roundedexp28 = Math.round(exp28);  			    
	   //Verify if result is as expected
	  if(sd35==roundedexp28) 
	    {
		   System.out.println("Service- Direct Expense AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp28);  
	    }
      else
		{
		   System.out.println("Service- Direct Expense AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp28);		   
		}
	  //......................................................................................................................................................................................
	  //Verify Service--> Contribution Margin in Submit DBP
	  long exp29= sd27-sd35;
	  if(sd43==exp29) 
		{
		    System.out.println("Service- Contribution Margin AUTO POPULATED CELL displays correct value- PASS=  " +exp29);  
	    }
	  else
		{
			System.out.println("Service- Contribution Margin AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp29);		   
		}
	  //......................................................................................................................................................................................
	  //Verify Turnover Total in Submit DBP
	  long exp30= sd8+sd9+sd10+sd11+sd12+sd13+sd14;
	  if(sd15==exp30) 
		{
		   System.out.println("Turnover- Total AUTO POPULATED CELL displays correct value- PASS=  " +exp30);  
	    }
	  else
	    {
		    System.out.println("Turnover- Total AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp30);		   
		}
	  //.......................................................................................................................................................................................
	  //Verify COGS Total in Submit DBP
	  long exp31= sd16+sd17+sd18+sd19;
	  if(sd20==exp31) 
		{
			System.out.println("COGS- Total AUTO POPULATED CELL displays correct value- PASS=  " +exp31);  
		}
	  else
		{
			System.out.println("COGS- Total AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp31);		   
		}
	  //.......................................................................................................................................................................
	  //Verify GRoss Margin Total in Submit DBP
	  long exp32= sd21+sd22+sd23+sd24+sd25+sd26+sd27;
	  if(sd28==exp32) 
		{
		    System.out.println("Gross Margin- Total AUTO POPULATED CELL displays correct value- PASS=  " +exp32);  
		}
	  else
		{
			System.out.println("Gross Margin- Total AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp32);		   
	    }
	  //..........................................................................................................................................................................
	  //Verify Direct Expense Total in Submit DBP
	  long exp33= sd29+sd30+sd31+sd32+sd33+sd34+sd35;
	  if(sd36==exp33) 
	    {
		    System.out.println("Direct Expense- Total AUTO POPULATED CELL displays correct value- PASS=  " +exp33);  
	    }
	  else
	   {
			System.out.println("Direct Expense- Total AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp33);		   
	   }
	  //...............................................................................................................................................................................
	  //Verify Contribution Margin Total in Submit DBP
	  long exp34= sd37+sd38+sd39+sd40+sd41+sd42+sd43;
	  if(sd44==exp34) 
	    {
			System.out.println("Contribution Margin- Total AUTO POPULATED CELL displays correct value- PASS=  " +exp34);  
	    }
	  else
	    {
		    System.out.println("Contribution Margin- Total AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp34);		   
	    }
	  //................................................................................................................................................................................
	  //Verify Common Expense & Overheads in Submit DBP
	  double exp35= cme1/100000;
	  long roundedexp35 = Math.round(exp35);  			    
      //Verify if result is as expected
	  if(sd45==roundedexp35) 
	    {
			System.out.println("Common Expense  & Overheads- AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp35);  
	    }
      else
	    {
			System.out.println("Common Expense  & Overheads- AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp35);		   
	    }
	  //..................................................................................................................................................................................
	  //Verify PBT in Submit DBP
	  long exp36= sd44-sd45;
	  if(sd46==exp36) 
	    {
			System.out.println("PBT (in Rs. Lacs)- AUTO POPULATED CELL displays correct value- PASS=  " +exp36);  
	    }
	  else
	   {
			System.out.println("PBT (in Rs. Lacs)- AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +exp36);		   
	   }
	  //................................................................................................................................................................................
	  //Verify PBT Per Car in Submit DBP
	  long Mul1= sd46*100000;
	  double exp37= Mul1/sd1;
	  long roundedexp37 = Math.round(exp37);  			    
	  //Verify if result is as expected
	  if(sd47==roundedexp37) 
	    {
	     System.out.println("PBT/Car- AUTO POPULATED CELL displays correct value- PASS=  " +roundedexp37);  
	    }
      else
	   {
		System.out.println("PBT/Car- AUTO POPULATED CELL displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +roundedexp37);		   
	   }
	  //.................................................................................................................................................................................
     //Verify Absorption Ratio		
	  Thread.sleep(2000);
		long Mul2= sd28*100000; 			
		long Sub3= Mul2-nc3;			
	    long Sub4= Sub3-nc5;		   
	    long Sub5= Sub4-nc11;		    
		long Sub6= Sub5-nc13;		
		long Sub7= Sub6-nc7;			
		long Sub8= Sub7-nc9;			
		long Add1= sd36+sd45;			
		long Mul3= Add1*100000;			
		double Sub9= (Mul3-nc7);	
		Thread.sleep(1000);
		double exp38= Sub8/Sub9;
		double actvalue= exp38;
		DecimalFormat df = new DecimalFormat("0.00");
		String roundedValue = df.format(actvalue);  			
		double sdbp48= Double.parseDouble(roundedValue);
		//Verify if result is as expected			
		if(sd48==sdbp48) 
		  {
			 System.out.println("Absorption Ratio- AUTO POPULATED CELL in Submit DBP displays correct value- PASS=  " +sdbp48);  
		  }
		else
		  {
			 System.out.println("Absorption Ratio- AUTO POPULATED CELL in Submit DBP displays incorrect value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAIL= " +sdbp48);		   
		  }
						System.out.println(".........E...N...D...................");
					
			
	}

}
