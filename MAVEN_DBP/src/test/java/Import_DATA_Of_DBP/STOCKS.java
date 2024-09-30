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

public class STOCKS extends LOGIN {
	public static WebDriver driver;
	public WebDriverWait wait;
	
	 long alto1;
	 long alto2;
	 long alto3;
	 long alto4;
	 long alto5;
	 long alto6;
	 long alto7;
	 long alto8;
	 long alto9;
	 long alto10;
	 long alto11;
	 long alto12;
	 long alto13;
	 long alto14;
	 long alto15;
	 long alto16;	
	    double Alto1;
//.........................................................
		 long spresso1;
		 long spresso2;
		 long spresso3;
		 long spresso4;
		 long spresso5;
		 long spresso6;
		 long spresso7;
		 long spresso8;
		 long spresso9;
		 long spresso10;
		 long spresso11;
		 long spresso12;
		 long spresso13;
		 long spresso14;
		 long spresso15;
		 long spresso16;
		   double SPRESSO1;
//........................................................
		   long CELERIO1;
		   long CELERIO2;
		   long CELERIO3;
		   long CELERIO4;
		   long CELERIO5;
		   long CELERIO6;
		   long CELERIO7;
		   long CELERIO8;
		   long CELERIO9;
		   long CELERIO10;
		   long CELERIO11;
		   long CELERIO12;
		   long CELERIO13;
		   long CELERIO14;
		   long CELERIO15;
		   long CELERIO16;
		    double Celerio1;
//............................................
		    long WAGONR1;
		    long WAGONR2;
		    long WAGONR3;
		    long WAGONR4;
		    long WAGONR5;
		    long WAGONR6;
		    long WAGONR7;
		    long WAGONR8;
		    long WAGONR9;
		    long WAGONR10;
		    long WAGONR11;
		    long WAGONR12;
		    long WAGONR13;
		    long WAGONR14;
		    long WAGONR15;
		    long WAGONR16;
		     double wagonar1;
//.....................................................................
		     long SWIFT1;
		     long SWIFT2;
		     long SWIFT3;
		     long SWIFT4;
		     long SWIFT5;
		     long SWIFT6;
		     long SWIFT7;
		     long SWIFT8;
		     long SWIFT9;
		     long SWIFT10;
		     long SWIFT11;
		     long SWIFT12;
		     long SWIFT13;
		     long SWIFT14;
		     long SWIFT15;
		     long SWIFT16;
		      double swift1;
	//........................................
		      long DZIRE1;
		      long DZIRE2;
		      long DZIRE3;
		      long DZIRE4;
		      long DZIRE5;
		      long DZIRE6;
		      long DZIRE7;
		      long DZIRE8;
		      long DZIRE9;
		      long DZIRE10;
		      long DZIRE11;
		      long DZIRE12;
		      long DZIRE13;
		      long DZIRE14;
		      long DZIRE15;
		      long DZIRE16;
		        double dzire1;
//..............................................................
		        long BREZZA1;
		        long BREZZA2;
		        long BREZZA3;
		        long BREZZA4;
		        long BREZZA5;
		        long BREZZA6;
		        long BREZZA7;
		        long BREZZA8;
		        long BREZZA9;
		        long BREZZA10;
		        long BREZZA11;
		        long BREZZA12;
		        long BREZZA13;
		        long BREZZA14;
		        long BREZZA15;
		        long BREZZA16;
		        double brezza1;
//...........................................................................
		        long ERTIGA1;
		        long ERTIGA2;
		        long ERTIGA3;
		        long ERTIGA4;
		        long ERTIGA5;
		        long ERTIGA6;
		        long ERTIGA7;
		        long ERTIGA8;
		        long ERTIGA9;
		        long ERTIGA10;
		        long ERTIGA11;
		        long ERTIGA12;
		        long ERTIGA13;
		        long ERTIGA14;
		        long ERTIGA15;
		        long ERTIGA16;
		        double Ertiga1;
//..................................................................
		        long ECO1;
		        long ECO2;
		        long ECO3;
		        long ECO4;
		        long ECO5;
		        long ECO6;
		        long ECO7;
		        long ECO8;
		        long ECO9;
		        long ECO10;
		        long ECO11;
		        long ECO12;
		        long ECO13;
		        long ECO14;
		        long ECO15;
		        long ECO16;
		          double Eco1;
	//................................................................
		          long CARRY1;
		          long CARRY2;
		          long CARRY3;
		          long CARRY4;
		          long CARRY5;
		          long CARRY6;
		          long CARRY7;
		          long CARRY8;
		          long CARRY9;
		          long CARRY10;
		          long CARRY11;
		          long CARRY12;
		          long CARRY13;
		          long CARRY14;
		          long CARRY15;
		          long CARRY16;
		           double Carry1;
//....................................................................................
		           long openingQty1;
		           long  a1;
		           long  WW1;
		           long  WHOLESALES_amount1;
		           long  closingSTOCK_qty1;
		           long  closingSTOCK_amt1;
		           long  Reatil1;
		           long  ReatilSS1;
		           long  marginAmount1 ;
		           long  DRFAmount1;
		           long  DISCOUNT_CONSUMER1;
		           long  DC1 ;
		           long  TS1 ;
		           
		           long  margin_cars14;
		           long  drf_cars;
		           long  TOTAL_Discount_cars;
		           
		           double MarginAmt;
		           double RETAIL1;    // retail sales
		           double  DRFAmountss1;
		          double  totalDiscount1;
		          
		          
////////////////////////////////////////////////////////////////////////////////////////////
		           
	@SuppressWarnings({ "static-access" })
	
   @BeforeClass
	public void begin() throws InterruptedException {
		Thread.sleep(3000);
	//...................................................................................    	
		   this.driver=LOGIN.driver;   // call the login page 	
	//...................................................................................................................................................
	
  //....................................Click on the stock sheet........................................................
	   Thread.sleep(1000);
	       driver.findElement(By.xpath("//*[contains(text(),'Stock Sheet ')]")).click();        
	       Thread.sleep(1000);	       
	
//	       // clear the data 
//		    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();
//		    Thread.sleep(1000);
//		    driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//		    Thread.sleep(1000);
//............................ Xpath of Alto........................................................	
	
		   WebElement A1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	       WebElement A2= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	       WebElement A3= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	       WebElement A4= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
	       WebElement A5= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
	       WebElement A6= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
	       WebElement A7= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
	       WebElement A8= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
	       WebElement A9= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
	       WebElement A10= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
	       WebElement A11= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
	       WebElement A12= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
	       WebElement A13= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
	       WebElement A14= driver.findElement(By.xpath("(//*[@type=\"number\"])[14]"));
	       WebElement A15= driver.findElement(By.xpath("(//*[@type=\"number\"])[15]"));
	       WebElement A16= driver.findElement(By.xpath("(//*[@type=\"number\"])[16]"));
	              
		    //    SEND THE VALUES 	
//	           A1.sendKeys("-4aW43488.");
//		      
//		       A2.sendKeys("4aKD4998.");
//		       A3.sendKeys("-4aGf4988.");    // values of Alto
//		       A4.sendKeys("-4aWL488.");
//		       A5.sendKeys("-4aWI488.");
//		       A6.sendKeys("-4aW439988.");
//		       
//		       A8.sendKeys("-4aWI4988.");
//		       A10.sendKeys("-4azA4388.");
//		       A11.sendKeys("-4aF43488.");
//		       A12.sendKeys("-4aWU43488.");
		       
		       
			  // Convert longo longegers
			       alto1 = Long.parseLong(A1.getAttribute("value"));
			       alto2 = Long.parseLong(A2.getAttribute("value"));
			       alto3 = Long.parseLong(A3.getAttribute("value"));
			       alto4 = Long.parseLong(A4.getAttribute("value"));
			       alto5 = Long.parseLong(A5.getAttribute("value"));   // Alto 
			       alto6 = Long.parseLong(A6.getAttribute("value"));
			       alto7 = Long.parseLong(A7.getAttribute("value"));
			       alto8 = Long.parseLong(A8.getAttribute("value"));
			       alto9 = Long.parseLong(A9.getAttribute("value"));
			       alto10 = Long.parseLong(A10.getAttribute("value"));
			       alto11 = Long.parseLong(A11.getAttribute("value"));
			       alto12 = Long.parseLong(A12.getAttribute("value"));
			       alto13 = Long.parseLong(A13.getAttribute("value"));
			       alto14 = Long.parseLong(A14.getAttribute("value"));
			       alto15 = Long.parseLong(A15.getAttribute("value"));
			       alto16 = Long.parseLong(A16.getAttribute("value"));

			       Alto1 = Double.parseDouble(A7.getAttribute("value"));
			            
		       
	//............................X path Spresso................................................
	       WebElement S1= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	       WebElement S2= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	       WebElement S3= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	       WebElement S4= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
	       WebElement S5= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
	       WebElement S6= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
	       WebElement S7= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
	       WebElement S8= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
	       WebElement S9= driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
	       WebElement S10= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
	       WebElement S11= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
	       WebElement S12= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
	       WebElement S13= driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
	       WebElement S14= driver.findElement(By.xpath("(//*[@type=\"number\"])[30]"));
	       WebElement S15= driver.findElement(By.xpath("(//*[@type=\"number\"])[31]"));
	       WebElement S16= driver.findElement(By.xpath("(//*[@type=\"number\"])[32]"));
	       
	       //.....................................................
	       // SEND THE VALUES 
	       
//	       S1.sendKeys("-9aW43008.");
//	       S2.sendKeys("-01aW4388.");
//	       S3.sendKeys("-2aW43498.");
//	       S4.sendKeys("-89jjH890.");
//	       S5.sendKeys("-40aW434998.");//  values of spresso
//	       S6.sendKeys("-9aW43430000.");
//	       
//	       S8.sendKeys("-fG6234403.");
//	       S10.sendKeys("-gr988039.");
//	       S11.sendKeys("-jhU98880.");
//	       S12.sendKeys(".820043jh99jhj");
	   
	//...........................................................................................
	       //  Convert longo longegers
	         spresso1 = Long.parseLong(S1.getAttribute("value"));
	         spresso2 = Long.parseLong(S2.getAttribute("value"));
		     spresso3 = Long.parseLong(S3.getAttribute("value"));
		     spresso4 = Long.parseLong(S4.getAttribute("value"));
		     spresso5 = Long.parseLong(S5.getAttribute("value"));  //  Spresso
		     spresso6 = Long.parseLong(S6.getAttribute("value"));
		     spresso7 = Long.parseLong(S7.getAttribute("value"));
		     spresso8 = Long.parseLong(S8.getAttribute("value"));
		     spresso9 = Long.parseLong(S9.getAttribute("value"));
		     spresso10 = Long.parseLong(S10.getAttribute("value"));
		     spresso11 = Long.parseLong(S11.getAttribute("value"));
		     spresso12 = Long.parseLong(S12.getAttribute("value"));
		     spresso13 = Long.parseLong(S13.getAttribute("value"));
		     spresso14 = Long.parseLong(S14.getAttribute("value"));
		     spresso15 = Long.parseLong(S15.getAttribute("value"));
		     spresso16 = Long.parseLong(S16.getAttribute("value"));
		    
		     SPRESSO1 = Double.parseDouble(S7.getAttribute("value"));// convert longo double for division
//.........................Path of Celerio..................................................................
		       
		       WebElement C1= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
		       WebElement C2= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
		       WebElement C3= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
		       WebElement C4= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
		       WebElement C5= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
		       WebElement C6= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
		       WebElement C7= driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
		       WebElement C8= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
		       WebElement C9= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
		       WebElement C10= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
		       WebElement C11= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
		       WebElement C12= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
		       WebElement C13= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
		       WebElement C14= driver.findElement(By.xpath("(//*[@type=\"number\"])[46]"));
		       WebElement C15= driver.findElement(By.xpath("(//*[@type=\"number\"])[47]"));
		       WebElement C16= driver.findElement(By.xpath("(//*[@type=\"number\"])[48]"));
		       
		    // SEND THE VALUES 
//		       
//		       C1.sendKeys("-32896jha.");
//		       C2.sendKeys("-3300As0232,.");
//		       C3.sendKeys("-627kj883.");
//		       C4.sendKeys("-20938998.jh788");
//		       C5.sendKeys("-2829909.jhkj.jj");
//		       C6.sendKeys("-8239008kjjkj");
//		      
//		       C8.sendKeys(".-lkL09962.");
//		       C10.sendKeys(".kjL205989");
//		       C11.sendKeys(".-200007jSD");
//		       C12.sendKeys("-j&*@A08898");
		      
		       ///////////////////////////////////////////////////////////////////////////////////////////////////
		       
		     //  Convert longo longegers
		         CELERIO1 = Long.parseLong(C1.getAttribute("value"));
		         CELERIO2 = Long.parseLong(C2.getAttribute("value"));
			     CELERIO3 = Long.parseLong(C3.getAttribute("value"));
			     CELERIO4 = Long.parseLong(C4.getAttribute("value"));
			     CELERIO5 = Long.parseLong(C5.getAttribute("value"));
			     CELERIO6 = Long.parseLong(C6.getAttribute("value"));
			     CELERIO7 = Long.parseLong(C7.getAttribute("value"));
			     CELERIO8 = Long.parseLong(C8.getAttribute("value"));
			     CELERIO9 = Long.parseLong(C9.getAttribute("value"));
			     CELERIO10 = Long.parseLong(C10.getAttribute("value"));
			     CELERIO11 = Long.parseLong(C11.getAttribute("value"));
			     CELERIO12 = Long.parseLong(C12.getAttribute("value"));
			     CELERIO13 = Long.parseLong(C13.getAttribute("value"));
			     CELERIO14 = Long.parseLong(C14.getAttribute("value"));
			     CELERIO15 = Long.parseLong(C15.getAttribute("value"));
			     CELERIO16 = Long.parseLong(C16.getAttribute("value"));
			    
			    Celerio1 = Double.parseDouble(C7.getAttribute("value")); // convert Double for division
//...........................................path WAGONR_R.............................................................
			       
			       WebElement W1= driver.findElement(By.xpath("(//*[@type=\"number\"])[49]"));
			       WebElement W2= driver.findElement(By.xpath("(//*[@type=\"number\"])[50]"));
			       WebElement W3= driver.findElement(By.xpath("(//*[@type=\"number\"])[51]"));
			       WebElement W4= driver.findElement(By.xpath("(//*[@type=\"number\"])[52]"));
			       WebElement W5= driver.findElement(By.xpath("(//*[@type=\"number\"])[53]"));
			       WebElement W6= driver.findElement(By.xpath("(//*[@type=\"number\"])[54]"));
			       WebElement W7= driver.findElement(By.xpath("(//*[@type=\"number\"])[55]"));
			       WebElement W8= driver.findElement(By.xpath("(//*[@type=\"number\"])[56]"));
			       WebElement W9= driver.findElement(By.xpath("(//*[@type=\"number\"])[57]"));
			       WebElement W10= driver.findElement(By.xpath("(//*[@type=\"number\"])[58]"));
			       WebElement W11= driver.findElement(By.xpath("(//*[@type=\"number\"])[59]"));
			       WebElement W12= driver.findElement(By.xpath("(//*[@type=\"number\"])[60]"));
			       WebElement W13= driver.findElement(By.xpath("(//*[@type=\"number\"])[61]"));
			       WebElement W14= driver.findElement(By.xpath("(//*[@type=\"number\"])[62]"));
			       WebElement W15= driver.findElement(By.xpath("(//*[@type=\"number\"])[63]"));
			       WebElement W16= driver.findElement(By.xpath("(//*[@type=\"number\"])[64]"));
			       
			       // SEND THE VALUES 			       
//			       W1.sendKeys("-sd328666.");
//			       W2.sendKeys("-Dd33232.");
//			       W3.sendKeys("-F6273.");
//			       W4.sendKeys("-EW209389.");
//			       W5.sendKeys("-W282.");
//			       W6.sendKeys("-F829800.");
//			      
//			       W8.sendKeys("-EW62732.");
//			       W10.sendKeys("-U209389.");
//			       W11.sendKeys("-D-287732.");
//			       W12.sendKeys("-DS8200.");
			      
///////////////////////////////////////////////////////////////////////////////////////////////////
			       
			     //  Convert  long
			         WAGONR1 = Long.parseLong(W1.getAttribute("value"));
			         WAGONR2 = Long.parseLong(W2.getAttribute("value"));
				     WAGONR3 = Long.parseLong(W3.getAttribute("value"));
				     WAGONR4 = Long.parseLong(W4.getAttribute("value"));
				     WAGONR5 = Long.parseLong(W5.getAttribute("value"));
				     WAGONR6 = Long.parseLong(W6.getAttribute("value"));
				     WAGONR7 = Long.parseLong(W7.getAttribute("value"));
				     WAGONR8 = Long.parseLong(W8.getAttribute("value"));
				     WAGONR9 = Long.parseLong(W9.getAttribute("value"));
				     WAGONR10 = Long.parseLong(W10.getAttribute("value"));
				     WAGONR11 = Long.parseLong(W11.getAttribute("value"));
				     WAGONR12 = Long.parseLong(W12.getAttribute("value"));
				     WAGONR13 = Long.parseLong(W13.getAttribute("value"));
				     WAGONR14 = Long.parseLong(W14.getAttribute("value"));
				     WAGONR15 = Long.parseLong(W15.getAttribute("value"));
				     WAGONR16 = Long.parseLong(W16.getAttribute("value"));
				    
				     wagonar1 = Double.parseDouble(W7.getAttribute("value")); // convert longo double for Division
				     
//........................................Path of.Swift......................................................				   
				     
				       WebElement Sw1= driver.findElement(By.xpath("(//*[@type=\"number\"])[65]"));
				       WebElement Sw2= driver.findElement(By.xpath("(//*[@type=\"number\"])[66]"));
				       WebElement Sw3= driver.findElement(By.xpath("(//*[@type=\"number\"])[67]"));
				       WebElement Sw4= driver.findElement(By.xpath("(//*[@type=\"number\"])[68]"));
				       WebElement Sw5= driver.findElement(By.xpath("(//*[@type=\"number\"])[69]"));
				       WebElement Sw6= driver.findElement(By.xpath("(//*[@type=\"number\"])[70]"));
				       WebElement Sw7= driver.findElement(By.xpath("(//*[@type=\"number\"])[71]"));
				       WebElement Sw8= driver.findElement(By.xpath("(//*[@type=\"number\"])[72]"));
				       WebElement Sw9= driver.findElement(By.xpath("(//*[@type=\"number\"])[73]"));
				       WebElement Sw10= driver.findElement(By.xpath("(//*[@type=\"number\"])[74]"));
				       WebElement Sw11= driver.findElement(By.xpath("(//*[@type=\"number\"])[75]"));
				       WebElement Sw12= driver.findElement(By.xpath("(//*[@type=\"number\"])[76]"));
				       WebElement Sw13= driver.findElement(By.xpath("(//*[@type=\"number\"])[77]"));
				       WebElement Sw14= driver.findElement(By.xpath("(//*[@type=\"number\"])[78]"));
				       WebElement Sw15= driver.findElement(By.xpath("(//*[@type=\"number\"])[79]"));
				       WebElement Sw16= driver.findElement(By.xpath("(//*[@type=\"number\"])[80]"));
				       
				       // SEND THE VALUES 
//				       
//				       Sw1.sendKeys("-sf3286.");
//				       Sw2.sendKeys("-fs3232.");
//				       Sw3.sendKeys("-sf-6273.");
//				       Sw4.sendKeys("-fs2089.");
//				       Sw5.sendKeys("-fd282.");
//				       Sw6.sendKeys("-hg8800.");
//				      
//				       Sw8.sendKeys("-f62732.");
//				       Sw10.sendKeys("-fds209389.");
//				       Sw11.sendKeys("-fds287732.");
//				       Sw12.sendKeys("-fs8200.");
				      
				       ///////////////////////////////////////////////////////////////////////////////////////////////////
				       
				     //  Convert longo longegers
				         SWIFT1 = Long.parseLong(Sw1.getAttribute("value"));
				         SWIFT2 = Long.parseLong(Sw2.getAttribute("value"));
					     SWIFT3 = Long.parseLong(Sw3.getAttribute("value"));
					     SWIFT4 = Long.parseLong(Sw4.getAttribute("value"));
					     SWIFT5 = Long.parseLong(Sw5.getAttribute("value"));
					     SWIFT6 = Long.parseLong(Sw6.getAttribute("value"));
					     SWIFT7 = Long.parseLong(Sw7.getAttribute("value"));
					     SWIFT8 = Long.parseLong(Sw8.getAttribute("value"));
					     SWIFT9 = Long.parseLong(Sw9.getAttribute("value"));
					     SWIFT10 = Long.parseLong(Sw10.getAttribute("value"));
					     SWIFT11 = Long.parseLong(Sw11.getAttribute("value"));
					     SWIFT12 = Long.parseLong(Sw12.getAttribute("value"));
					     SWIFT13 = Long.parseLong(Sw13.getAttribute("value"));
					     SWIFT14 = Long.parseLong(Sw14.getAttribute("value"));
					     SWIFT15 = Long.parseLong(Sw15.getAttribute("value"));
					     SWIFT16 = Long.parseLong(Sw16.getAttribute("value"));
					    
					     swift1 = Double.parseDouble(Sw7.getAttribute("value"));// convert longo double for Division				   
//............................................DZIRE................................................
					     WebElement D1= driver.findElement(By.xpath("(//*[@type=\"number\"])[81]"));
					       WebElement D2= driver.findElement(By.xpath("(//*[@type=\"number\"])[82]"));
					       WebElement D3= driver.findElement(By.xpath("(//*[@type=\"number\"])[83]"));
					       WebElement D4= driver.findElement(By.xpath("(//*[@type=\"number\"])[84]"));
					       WebElement D5= driver.findElement(By.xpath("(//*[@type=\"number\"])[85]"));
					       WebElement D6= driver.findElement(By.xpath("(//*[@type=\"number\"])[86]"));
					       WebElement D7= driver.findElement(By.xpath("(//*[@type=\"number\"])[87]"));
					       WebElement D8= driver.findElement(By.xpath("(//*[@type=\"number\"])[88]"));
					       WebElement D9= driver.findElement(By.xpath("(//*[@type=\"number\"])[89]"));
					       WebElement D10= driver.findElement(By.xpath("(//*[@type=\"number\"])[90]"));
					       WebElement D11= driver.findElement(By.xpath("(//*[@type=\"number\"])[91]"));
					       WebElement D12= driver.findElement(By.xpath("(//*[@type=\"number\"])[92]"));
					       WebElement D13= driver.findElement(By.xpath("(//*[@type=\"number\"])[93]"));
					       WebElement D14= driver.findElement(By.xpath("(//*[@type=\"number\"])[94]"));
					       WebElement D15= driver.findElement(By.xpath("(//*[@type=\"number\"])[95]"));
					       WebElement D16= driver.findElement(By.xpath("(//*[@type=\"number\"])[96]"));
					      
					       // SEND THE VALUES 
					       
//					       D1.sendKeys("-d40550.");
//					       D2.sendKeys("-ds3000.");
//					       D3.sendKeys("-d6257.3");
//					       D4.sendKeys("-fd205589.");
//					       D5.sendKeys("-dfs5555.");
//					       D6.sendKeys("-dfs6700.");
//					      
//					       D8.sendKeys("-h10000.");
//					       D10.sendKeys("-gf774888.");
//					       D11.sendKeys("-dfs90044.");
//					       D12.sendKeys("-dsf8200.");
///////////////////////////////////////////////////////////////////////////////////////////////////
					       
					     //  Convert longo longegers
					         DZIRE1 = Long.parseLong(D1.getAttribute("value"));
					         DZIRE2 = Long.parseLong(D2.getAttribute("value"));
						     DZIRE3 = Long.parseLong(D3.getAttribute("value"));
						     DZIRE4 = Long.parseLong(D4.getAttribute("value"));
						     DZIRE5 = Long.parseLong(D5.getAttribute("value"));
						     DZIRE6 = Long.parseLong(D6.getAttribute("value"));
						     DZIRE7 = Long.parseLong(D7.getAttribute("value"));
						     DZIRE8 = Long.parseLong(D8.getAttribute("value"));
						     DZIRE9 = Long.parseLong(D9.getAttribute("value"));
						     DZIRE10 = Long.parseLong(D10.getAttribute("value"));
						     DZIRE11 = Long.parseLong(D11.getAttribute("value"));
						     DZIRE12 = Long.parseLong(D12.getAttribute("value"));
						     DZIRE13 = Long.parseLong(D13.getAttribute("value"));
						     DZIRE14 = Long.parseLong(D14.getAttribute("value"));
						     DZIRE15 = Long.parseLong(D15.getAttribute("value"));
						     DZIRE16 = Long.parseLong(D16.getAttribute("value"));						    
						     dzire1 = Double.parseDouble(D7.getAttribute("value")); // convert longo double for division
						     
	//....................................BREZZA.............................................................
						      WebElement B1= driver.findElement(By.xpath("(//*[@type=\"number\"])[97]"));
						       WebElement B2= driver.findElement(By.xpath("(//*[@type=\"number\"])[98]"));
						       WebElement B3= driver.findElement(By.xpath("(//*[@type=\"number\"])[99]"));
						       WebElement B4= driver.findElement(By.xpath("(//*[@type=\"number\"])[100]"));
						       WebElement B5= driver.findElement(By.xpath("(//*[@type=\"number\"])[101]"));
						       WebElement B6= driver.findElement(By.xpath("(//*[@type=\"number\"])[102]"));
						       WebElement B7= driver.findElement(By.xpath("(//*[@type=\"number\"])[103]"));
						       WebElement B8= driver.findElement(By.xpath("(//*[@type=\"number\"])[104]"));
						       WebElement B9= driver.findElement(By.xpath("(//*[@type=\"number\"])[105]"));
						       WebElement B10= driver.findElement(By.xpath("(//*[@type=\"number\"])[106]"));
						       WebElement B11= driver.findElement(By.xpath("(//*[@type=\"number\"])[107]"));
						       WebElement B12= driver.findElement(By.xpath("(//*[@type=\"number\"])[108]"));
						       WebElement B13= driver.findElement(By.xpath("(//*[@type=\"number\"])[109]"));
						       WebElement B14= driver.findElement(By.xpath("(//*[@type=\"number\"])[110]"));
						       WebElement B15= driver.findElement(By.xpath("(//*[@type=\"number\"])[111]"));
						       WebElement B16= driver.findElement(By.xpath("(//*[@type=\"number\"])[112]"));
						      
						       // SEND THE VALUES 
						       
//						       B1.sendKeys("-u328456.");
//						       B2.sendKeys("-gd239583.");
//						       B3.sendKeys("-df62743.");
//						       B4.sendKeys("-gd208965.");
//						       B5.sendKeys("-gd18383.");
//						       B6.sendKeys("-hh88500.");
//						     
//						       B8.sendKeys("-j10000.");
//						       B10.sendKeys("-jg200000.");
//						       B11.sendKeys("-gf229000.");
//						       B12.sendKeys("-fd8200.");
						    
	///////////////////////////////////////////////////////////////////////////////////////////////////
						       
						     //  Convert longo longegers
						         BREZZA1 = Long.parseLong(B1.getAttribute("value"));
						         BREZZA2 = Long.parseLong(B2.getAttribute("value"));
							     BREZZA3 = Long.parseLong(B3.getAttribute("value"));
							     BREZZA4 = Long.parseLong(B4.getAttribute("value"));
							     BREZZA5 = Long.parseLong(B5.getAttribute("value"));
							     BREZZA6 = Long.parseLong(B6.getAttribute("value"));
							     BREZZA7 = Long.parseLong(B7.getAttribute("value"));
							     BREZZA8 = Long.parseLong(B8.getAttribute("value"));
							     BREZZA9 = Long.parseLong(B9.getAttribute("value"));
							     BREZZA10 = Long.parseLong(B10.getAttribute("value"));
							     BREZZA11 = Long.parseLong(B11.getAttribute("value"));
							     BREZZA12 = Long.parseLong(B12.getAttribute("value"));
							     BREZZA13 = Long.parseLong(B13.getAttribute("value"));
							     BREZZA14 = Long.parseLong(B14.getAttribute("value"));
							     BREZZA15 = Long.parseLong(B15.getAttribute("value"));
							     BREZZA16 = Long.parseLong(B16.getAttribute("value"));							   
							   brezza1 = Double.parseDouble(B7.getAttribute("value"));
	//........................................ERTIGA........................................................						   

						       WebElement E1= driver.findElement(By.xpath("(//*[@type=\"number\"])[113]"));
						       WebElement E2= driver.findElement(By.xpath("(//*[@type=\"number\"])[114]"));
						       WebElement E3= driver.findElement(By.xpath("(//*[@type=\"number\"])[115]"));
						       WebElement E4= driver.findElement(By.xpath("(//*[@type=\"number\"])[116]"));
						       WebElement E5= driver.findElement(By.xpath("(//*[@type=\"number\"])[117]"));
						       WebElement E6= driver.findElement(By.xpath("(//*[@type=\"number\"])[118]"));
						       WebElement E7= driver.findElement(By.xpath("(//*[@type=\"number\"])[119]"));
						       WebElement E8= driver.findElement(By.xpath("(//*[@type=\"number\"])[120]"));
						       WebElement E9= driver.findElement(By.xpath("(//*[@type=\"number\"])[121]"));
						       WebElement E10= driver.findElement(By.xpath("(//*[@type=\"number\"])[122]"));
						       WebElement E11= driver.findElement(By.xpath("(//*[@type=\"number\"])[123]"));
						       WebElement E12= driver.findElement(By.xpath("(//*[@type=\"number\"])[124]"));
						       WebElement E13= driver.findElement(By.xpath("(//*[@type=\"number\"])[125]"));
						       WebElement E14= driver.findElement(By.xpath("(//*[@type=\"number\"])[126]"));
						       WebElement E15= driver.findElement(By.xpath("(//*[@type=\"number\"])[127]"));
						       WebElement E16= driver.findElement(By.xpath("(//*[@type=\"number\"])[128]"));
						      
						       // SEND THE VALUES 
						       
//						       E1.sendKeys("-hgf32856.");
//						       E2.sendKeys("-jh23958.3");
//						       E3.sendKeys("-jh62743.");
//						       E4.sendKeys("-hg20896.5");
//						       E5.sendKeys("-fd18383.");
//						       E6.sendKeys("-g88500.");
//						     
//						       E8.sendKeys("-1f0000.");
//						       E10.sendKeys("-gf20000.0");
//						       E11.sendKeys("-fd22900.");
//						       E12.sendKeys("-f8200.");
						    
///////////////////////////////////////////////////////////////////////////////////////////////////
						       
						     //  Convert longo longegers
						         ERTIGA1 = Long.parseLong(E1.getAttribute("value"));
						         ERTIGA2 = Long.parseLong(E2.getAttribute("value"));
							     ERTIGA3 = Long.parseLong(E3.getAttribute("value"));
							     ERTIGA4 = Long.parseLong(E4.getAttribute("value"));
							     ERTIGA5 = Long.parseLong(E5.getAttribute("value"));
							     ERTIGA6 = Long.parseLong(E6.getAttribute("value"));
							     ERTIGA7 = Long.parseLong(E7.getAttribute("value"));
							     ERTIGA8 = Long.parseLong(E8.getAttribute("value"));
							     ERTIGA9 = Long.parseLong(E9.getAttribute("value"));
							     ERTIGA10 = Long.parseLong(E10.getAttribute("value"));
							     ERTIGA11 = Long.parseLong(E11.getAttribute("value"));
							     ERTIGA12 = Long.parseLong(E12.getAttribute("value"));
							     ERTIGA13 = Long.parseLong(E13.getAttribute("value"));
							     ERTIGA14 = Long.parseLong(E14.getAttribute("value"));
							     ERTIGA15 = Long.parseLong(E15.getAttribute("value"));
							     ERTIGA16 = Long.parseLong(E16.getAttribute("value"));
							   
							     Ertiga1 = Double.parseDouble(E7.getAttribute("value"));  // CONVERT longO double FOR DIVISION
							     
		//..............................................ECO...................................................					     
							       WebElement Ec1= driver.findElement(By.xpath("(//*[@type=\"number\"])[129]"));
							       WebElement Ec2= driver.findElement(By.xpath("(//*[@type=\"number\"])[130]"));
							       WebElement Ec3= driver.findElement(By.xpath("(//*[@type=\"number\"])[131]"));
							       WebElement Ec4= driver.findElement(By.xpath("(//*[@type=\"number\"])[132]"));
							       WebElement Ec5= driver.findElement(By.xpath("(//*[@type=\"number\"])[133]"));
							       WebElement Ec6= driver.findElement(By.xpath("(//*[@type=\"number\"])[134]"));
							       WebElement Ec7= driver.findElement(By.xpath("(//*[@type=\"number\"])[135]"));
							       WebElement Ec8= driver.findElement(By.xpath("(//*[@type=\"number\"])[136]"));
							       WebElement Ec9= driver.findElement(By.xpath("(//*[@type=\"number\"])[137]"));
							       WebElement Ec10= driver.findElement(By.xpath("(//*[@type=\"number\"])[138]"));
							       WebElement Ec11= driver.findElement(By.xpath("(//*[@type=\"number\"])[139]"));
							       WebElement Ec12= driver.findElement(By.xpath("(//*[@type=\"number\"])[140]"));
							       WebElement Ec13= driver.findElement(By.xpath("(//*[@type=\"number\"])[141]"));
							       WebElement Ec14= driver.findElement(By.xpath("(//*[@type=\"number\"])[142]"));
							       WebElement Ec15= driver.findElement(By.xpath("(//*[@type=\"number\"])[143]"));
							       WebElement Ec16= driver.findElement(By.xpath("(//*[@type=\"number\"])[144]"));
							      
							       // SEND THE VALUES 
//							       
//							       Ec1.sendKeys("-g10000.");
//							       Ec2.sendKeys("-ds6000.");
//							       Ec3.sendKeys("-f5009.9");
//							       Ec4.sendKeys("-fds3000.0");
//							       Ec5.sendKeys("-s1300.0");
//							       Ec6.sendKeys("-fs0866.5");
//							     
//							       Ec8.sendKeys("-fs10000.");
//							       Ec10.sendKeys("-j3000.");
//							       Ec11.sendKeys("-df54223.");
//							       Ec12.sendKeys("-gf8200.");
							    
						///////////////////////////////////////////////////////////////////////////////////////////////////
							       
							     //  Convert longo longegers
							         ECO1 = Long.parseLong(Ec1.getAttribute("value"));
							         ECO2 = Long.parseLong(Ec2.getAttribute("value"));
								     ECO3 = Long.parseLong(Ec3.getAttribute("value"));
								     ECO4 = Long.parseLong(Ec4.getAttribute("value"));
								     ECO5 = Long.parseLong(Ec5.getAttribute("value"));
								     ECO6 = Long.parseLong(Ec6.getAttribute("value"));
								     ECO7 = Long.parseLong(Ec7.getAttribute("value"));
								     ECO8 = Long.parseLong(Ec8.getAttribute("value"));
								     ECO9 = Long.parseLong(Ec9.getAttribute("value"));
								     ECO10 = Long.parseLong(Ec10.getAttribute("value"));
								     ECO11 = Long.parseLong(Ec11.getAttribute("value"));
								     ECO12 = Long.parseLong(Ec12.getAttribute("value"));
								     ECO13 = Long.parseLong(Ec13.getAttribute("value"));
								     ECO14 = Long.parseLong(Ec14.getAttribute("value"));
								     ECO15 = Long.parseLong(Ec15.getAttribute("value"));
								     ECO16 = Long.parseLong(Ec16.getAttribute("value"));
								    
								     Eco1 = Double.parseDouble(Ec7.getAttribute("value"));  // convert longo double FOR the Division
//.........................SUPER CARRY........................................................................								       
								     
								       WebElement super1= driver.findElement(By.xpath("(//*[@type=\"number\"])[145]"));
								       WebElement super2= driver.findElement(By.xpath("(//*[@type=\"number\"])[146]"));
								       WebElement super3= driver.findElement(By.xpath("(//*[@type=\"number\"])[147]"));
								       WebElement super4= driver.findElement(By.xpath("(//*[@type=\"number\"])[148]"));
								       WebElement super5= driver.findElement(By.xpath("(//*[@type=\"number\"])[149]"));
								       WebElement super6= driver.findElement(By.xpath("(//*[@type=\"number\"])[150]"));
								       WebElement super7= driver.findElement(By.xpath("(//*[@type=\"number\"])[151]"));
								       WebElement super8= driver.findElement(By.xpath("(//*[@type=\"number\"])[152]"));
								       WebElement super9= driver.findElement(By.xpath("(//*[@type=\"number\"])[153]"));
								       WebElement super10= driver.findElement(By.xpath("(//*[@type=\"number\"])[154]"));
								       WebElement super11= driver.findElement(By.xpath("(//*[@type=\"number\"])[155]"));
								       WebElement super12= driver.findElement(By.xpath("(//*[@type=\"number\"])[156]"));
								       WebElement super13= driver.findElement(By.xpath("(//*[@type=\"number\"])[157]"));
								       WebElement super14= driver.findElement(By.xpath("(//*[@type=\"number\"])[158]"));
								       WebElement super15= driver.findElement(By.xpath("(//*[@type=\"number\"])[159]"));
								       WebElement super16= driver.findElement(By.xpath("(//*[@type=\"number\"])[160]"));
								      
								       // SEND THE VALUES 
								       
//								       super1.sendKeys("-tr10000.");
//								       super2.sendKeys("-tr60000.");
//								       super3.sendKeys("-tr400088.");
//								       super4.sendKeys("-rtuy30320.");
//								       super5.sendKeys("-l2000.");
//								       super6.sendKeys("-re10000.");
//								    
//								       super8.sendKeys("-j100000.");
//								       super10.sendKeys("-jh308700.");
//								       super11.sendKeys("-f80080.");
//								       super12.sendKeys("-we820870.");
								    
				///////////////////////////////////////////////////////////////////////////////////////////////////
								       
								     //  Convert longo longegers
								         CARRY1 = Long.parseLong(super1.getAttribute("value"));
								         CARRY2 = Long.parseLong(super2.getAttribute("value"));
									     CARRY3 = Long.parseLong(super3.getAttribute("value"));
									     CARRY4 = Long.parseLong(super4.getAttribute("value"));
									     CARRY5 = Long.parseLong(super5.getAttribute("value"));
									     CARRY6 = Long.parseLong(super6.getAttribute("value"));
									     CARRY7 = Long.parseLong(super7.getAttribute("value"));
									     CARRY8 = Long.parseLong(super8.getAttribute("value"));
									     CARRY9 = Long.parseLong(super9.getAttribute("value"));
									     CARRY10 = Long.parseLong(super10.getAttribute("value"));
									     CARRY11 = Long.parseLong(super11.getAttribute("value"));
									     CARRY12 = Long.parseLong(super12.getAttribute("value"));
									     CARRY13 = Long.parseLong(super13.getAttribute("value"));
									     CARRY14 = Long.parseLong(super14.getAttribute("value"));
									     CARRY15 = Long.parseLong(super15.getAttribute("value"));
									     CARRY16 = Long.parseLong(super16.getAttribute("value"));
									    
									     Carry1 = Double.parseDouble(super7.getAttribute("value"));// convert longo double FOR the Division
//............................Totals......................................................................	
		WebElement QUANTITY1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // Quantity (No.s)						     
	    WebElement AMOUNT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")); // Quantity (No.s)
	    WebElement wholesaleQTY12= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")); // WHOLESALE Quantity (No.s)
        WebElement wholesaleAMT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")); // WHOLESALE Quantity (No.s)
        WebElement CLOSINGstock_Qty1= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")); // WHOLESALE Quantity (No.s)
        WebElement CLOSINGstock_AMOUNTS1= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]")); // CLOSING STOCK AMOUNT 
        WebElement RetailSales_Qty1= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")); // CLOSING STOCK AMOUNT 
        WebElement RetailSales_AMOUNT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]")); // TOTAL RETAIL SALES AMOUNT 
        WebElement MARGIN_AMOUNT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]")); // TOTAL MARGIN AMOUNT
        WebElement  DRF_AMOUNT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));   // TOTAL DRF ~ AMOUNT
        WebElement  Discount1= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));   // TOTAL  DISCOUNT ^  [Consumer Offer +ISL/RMK]
        WebElement  Compulsion_discount1= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));   // TOTAL  Dealer Compulsion Discount (Rs.)
        WebElement  TD1= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));   // TOTAL [ Total Discount (Rs.)]
        WebElement  marginsCars1= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));  // path of Total Margin/Car (Rs.)	
        WebElement  DRFCARS2= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));  // path of Discount/Car (Rs.	
        WebElement  discountCARS1= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));  // path of Discount/Car (Rs.	
      
        WebElement MA1= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]")); // TOTAL MARGIN AMOUNT
        WebElement RS1= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")); // 
        WebElement  dAmt= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
        WebElement  TD11= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));
        
	    
//......................................................................................................
	    
		openingQty1 = Long.parseLong(QUANTITY1.getAttribute("value")); // Quantity (No.s)
                 a1 = Long.parseLong(AMOUNT1.getAttribute("value"));
                   WW1 = Long.parseLong(wholesaleQTY12.getAttribute("value"));
      WHOLESALES_amount1 = Long.parseLong(wholesaleAMT1.getAttribute("value"));
        closingSTOCK_qty1 = Long.parseLong(CLOSINGstock_Qty1.getAttribute("value"));
          closingSTOCK_amt1 = Long.parseLong(CLOSINGstock_AMOUNTS1.getAttribute("value"));
            Reatil1 = Long.parseLong(RetailSales_Qty1.getAttribute("value"));
              ReatilSS1 = Long.parseLong(RetailSales_AMOUNT1.getAttribute("value"));
             marginAmount1 = Long.parseLong(MARGIN_AMOUNT1.getAttribute("value"));
               DRFAmount1 = Long.parseLong(DRF_AMOUNT1.getAttribute("value"));
                 DISCOUNT_CONSUMER1 = Long.parseLong(Discount1.getAttribute("value"));
                   DC1 = Long.parseLong(Compulsion_discount1.getAttribute("value")); // Total Dealer Compulsion Discount (Rs.) 
                     TS1 = Long.parseLong(TD1.getAttribute("value")); // TOTAL [ Total Discount (Rs.)]
                      
                     margin_cars14 = Long.parseLong( marginsCars1.getAttribute("value"));  // convert longo longegers
                     drf_cars = Long.parseLong( DRFCARS2.getAttribute("value"));
                       TOTAL_Discount_cars = Long.parseLong( discountCARS1.getAttribute("value"));
                     
                      MarginAmt = Double.parseDouble(MA1.getAttribute("value"));
                      RETAIL1 = Long.parseLong(RS1.getAttribute("value"));
                        DRFAmountss1 = Long.parseLong(dAmt.getAttribute("value"));
                       totalDiscount1 = Long.parseLong(TD11.getAttribute("value"));
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////	
	
				 // Save the Data
//	      @Test
//	       public void Save_the_Data() throws InterruptedException {
////		       save data
//	           Thread.sleep(1000);	           
//	   	    driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
//	   	    
//	   	    driver.findElement(By.cssSelector("[class=\"save\"]")).click();
//	           	   	   	    	   
//	   }
 //..............................................................................................      
	  	@Test
	  	public  void Opening_Stock__Qty_Of_AltoK10() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22)); 
	  	       WebElement A1=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[1]")));			  
	  	      
	  	       String RS1= A1.getAttribute("value");			   
			   Assert.assertTrue(RS1.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS1) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS1.matches("[0-9]+") && Long.parseLong(RS1)>=0, "Input accepts alphabet ");
	             	}
//...............................................................................................
	  	@Test
	  	public  void Opening_Stock_Amount_Of_AltoK10() throws InterruptedException {
	  		  wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
	  	       WebElement A2=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[2]")));
			  
	  	       String RS2= A2.getAttribute("value");			   
			   Assert.assertTrue(RS2.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS2) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS2.matches("[0-9]+") && Long.parseLong(RS2)>=0, "Input accepts alphabet ");
	             	}
 //...............................................................................................
	  	@Test
	  	public  void WholeSale_Qty_Of_AltoK10() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A3= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[3]")));
			  
			   String RS3= A3.getAttribute("value");	
			   Assert.assertTrue(RS3.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS3) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS3.matches("[0-9]+") && Long.parseLong(RS3)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void WholeSale_Amount_Of_AltoK10() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A4= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[4]")));
			   
			   String RS4= A4.getAttribute("value");	
			   Assert.assertTrue(RS4.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS4) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS4.matches("[0-9]+") && Long.parseLong(RS4)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void Closing_stock_Qty_Of_AltoK10() {
	  		 wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A5= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[5]")));
			  
			   String RS5= A5.getAttribute("value");	
			   Assert.assertTrue(RS5.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS5) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS5.matches("[0-9]+") && Long.parseLong(RS5)>=0, "Input accepts alphabet ");
	             	}
	//..........................................................................................
	  	@Test
	  	public  void Closing_stock_Amount_Of_AltoK10() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A6= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[6]")));
			 
			   String RS6= A6.getAttribute("value");	
			   Assert.assertTrue(RS6.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS6) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS6.matches("[0-9]+") && Long.parseLong(RS6)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void Retail_sales_Amount_Of_AltoK10() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A8= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[8]")));
			  
			   String RS8= A8.getAttribute("value");	
			   Assert.assertTrue(RS8.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS8) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS8.matches("[0-9]+") && Long.parseLong(RS8)>=0, "Input accepts alphabet ");
	             	}
	 //..........................................................................................
	  	@Test
	  	public  void DRF_Of_AltoK10() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A10= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[10]")));
			   
			   String RS10= A10.getAttribute("value");	
			   Assert.assertTrue(RS10.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS10) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS10.matches("[0-9]+") && Long.parseLong(RS10)>=0, "Input accepts alphabet ");
	             	}
	 //..........................................................................................
	  	@Test
	  	public  void Consumer_Offer_Exchange_Bonus_Of_AltoK10() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A11= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[11]")));
			  
			   String RS11= A11.getAttribute("value");	
			   Assert.assertTrue(RS11.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS11) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS11.matches("[0-9]+") && Long.parseLong(RS11)>=0, "Input accepts alphabet ");
	             	}
	//..........................................................................................
	  	@Test
	  	public  void Dealer_Compulsion_Discount_Of_AltoK10() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A12= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[12]")));
			  
			   String RS12= A12.getAttribute("value");	
			   Assert.assertTrue(RS12.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS12) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS12.matches("[0-9]+") && Long.parseLong(RS12)>=0, "Input accepts alphabet ");
	             	}
//...............................................................................................
//..............................................................................................      
	  	@Test
	  	public  void Opening_Stock__Qty_Of_Spresso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A17= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[17]")));
			  
			   String RS17= A17.getAttribute("value");	
			   Assert.assertTrue(RS17.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS17) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS17.matches("[0-9]+") && Long.parseLong(RS17)>=0, "Input accepts alphabet ");
	             	}
//...............................................................................................
	  	@Test
	  	public  void Opening_Stock_Amount_Of_S_presso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A18= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[18]")));
			   
			   String RS18= A18.getAttribute("value");	
			   Assert.assertTrue(RS18.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS18) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS18.matches("[0-9]+") && Long.parseLong(RS18)>=0, "Input accepts alphabet ");
	             	}
 //...............................................................................................
	  	@Test
	  	public  void WholeSale_Qty_Of_S_presso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A19= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[19]")));
			  
			   String RS19= A19.getAttribute("value");	
			   Assert.assertTrue(RS19.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS19) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS19.matches("[0-9]+") && Long.parseLong(RS19)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void WholeSale_Amount_Of_S_presso() throws InterruptedException {
	  		
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A20= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[20]")));
			  
			   String RS20= A20.getAttribute("value");	
			   Assert.assertTrue(RS20.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS20) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS20.matches("[0-9]+") && Long.parseLong(RS20)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void Closing_stock_Qty_Of_S_presso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A21= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[21]")));
			 
			   String RS21= A21.getAttribute("value");	
			   Assert.assertTrue(RS21.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS21) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS21.matches("[0-9]+") && Long.parseLong(RS21)>=0, "Input accepts alphabet ");
	             	}
	//..........................................................................................
	  	@Test
	  	public  void Closing_stock_Amount_Of_S_presso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A22= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[22]")));
			  
			   String RS22= A22.getAttribute("value");	
			   Assert.assertTrue(RS22.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS22) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS22.matches("[0-9]+") && Long.parseLong(RS22)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void Retail_sales_Amount_Of_S_presso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A24= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[24]")));
			  
			   String RS24= A24.getAttribute("value");	
			   Assert.assertTrue(RS24.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS24) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS24.matches("[0-9]+") && Long.parseLong(RS24)>=0, "Input accepts alphabet ");
	             	}
	 //..........................................................................................
	  	@Test
	  	public  void DRF_Of_S_presso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A26= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[26]")));
			   
			   String RS26= A26.getAttribute("value");	
			   Assert.assertTrue(RS26.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS26) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS26.matches("[0-9]+") && Long.parseLong(RS26)>=0, "Input accepts alphabet ");
	             	}
	 //..........................................................................................
	  	@Test
	  	public  void Consumer_Offer_Exchange_Bonus_Of_S_presso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A27= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[27]")));
			   
			   String RS27= A27.getAttribute("value");	
			   Assert.assertTrue(RS27.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS27) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS27.matches("[0-9]+") && Long.parseLong(RS27)>=0, "Input accepts alphabet ");
	             	}
	//..........................................................................................
	  	@Test
	  	public  void Dealer_Compulsion_Discount_Of_S_presso() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A28= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[28]")));
			   
			   String RS28= A28.getAttribute("value");	
			   Assert.assertTrue(RS28.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS28) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS28.matches("[0-9]+") && Long.parseLong(RS28)>=0, "Input accepts alphabet ");
	             	}	  
 //..............................................................................................
//..............................................................................................
	  	
	  	@Test
	  	public  void Opening_Stock__Qty_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A33= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[33]")));
			   
			   String RS33= A33.getAttribute("value");	
			   Assert.assertTrue(RS33.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS33) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS33.matches("[0-9]+") && Long.parseLong(RS33)>=0, "Input accepts alphabet ");
	             	}
//...............................................................................................
	  	@Test
	  	public  void Opening_Stock_Amount_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A34= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[34]")));
			   
			   String RS34= A34.getAttribute("value");	
			   Assert.assertTrue(RS34.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS34) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS34.matches("[0-9]+") && Long.parseLong(RS34)>=0, "Input accepts alphabet ");
	             	}
 //...............................................................................................
	  	@Test
	  	public  void WholeSale_Qty_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A35= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[35]")));
			   
			   String RS35= A35.getAttribute("value");	
			   Assert.assertTrue(RS35.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS35) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS35.matches("[0-9]+") && Long.parseLong(RS35)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void WholeSale_Amount_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver, Duration.ofSeconds(11));
			   WebElement A36= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[36]")));
			   
			   String RS36= A36.getAttribute("value");	
			   Assert.assertTrue(RS36.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS36) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS36.matches("[0-9]+") && Long.parseLong(RS36)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void Closing_stock_Qty_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A37= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[37]")));
			   
			   String RS37= A37.getAttribute("value");	
			   Assert.assertTrue(RS37.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS37) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS37.matches("[0-9]+") && Long.parseLong(RS37)>=0, "Input accepts alphabet ");
	             	}
	//..........................................................................................
	  	@Test
	  	public  void Closing_stock_Amount_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A38= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[38]")));
			   
			   String RS38= A38.getAttribute("value");	
			   Assert.assertTrue(RS38.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS38) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS38.matches("[0-9]+") && Long.parseLong(RS38)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void Retail_sales_Amount_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A40= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[40]")));
			   
			   String RS40= A40.getAttribute("value");	
			   Assert.assertTrue(RS40.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS40) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS40.matches("[0-9]+") && Long.parseLong(RS40)>=0, "Input accepts alphabet ");
	             	}
	 //..........................................................................................
	  	@Test
	  	public  void DRF_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A42= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[42]")));
			  
			   String RS42= A42.getAttribute("value");	
			   Assert.assertTrue(RS42.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS42) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS42.matches("[0-9]+") && Long.parseLong(RS42)>=0, "Input accepts alphabet ");
	             	}
	 //..........................................................................................
	  	@Test
	  	public  void Consumer_Offer_Exchange_Bonus_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A43= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[43]")));
			 
			   String RS43= A43.getAttribute("value");	
			   Assert.assertTrue(RS43.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS43) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS43.matches("[0-9]+") && Long.parseLong(RS43)>=0, "Input accepts alphabet ");
	             	}
//..........................................................................................
	  	@Test
	  	public  void Dealer_Compulsion_Discount_Of_CELERIO() {
	  		   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A44= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[44]")));
			  
			   String RS44= A44.getAttribute("value");	
			   Assert.assertTrue(RS44.length() <= 12, "Input accepts more than 12 characters");
	           Assert.assertTrue(Long.parseLong(RS44) >= 0, "Input accepts negative value");	        
	           Assert.assertTrue(RS44.matches("[0-9]+") && Long.parseLong(RS44)>=0, "Input accepts alphabet ");
	             	}	
	  //..............................................................................................
	  //..............................................................................................
	  	  	
	  	  	@Test
	  	  	public  void Opening_Stock__Qty_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A49= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[49]")));
	  			   
	  			   String RS49= A49.getAttribute("value");	
	  			   Assert.assertTrue(RS49.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS49) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS49.matches("[0-9]+") && Long.parseLong(RS49)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................
	  	  	@Test
	  	  	public  void Opening_Stock_Amount_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A50= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[50]")));
	  			  
	  			   String RS50= A50.getAttribute("value");	
	  			   Assert.assertTrue(RS50.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS50) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS50.matches("[0-9]+") && Long.parseLong(RS50)>=0, "Input accepts alphabet ");
	  	             	}
	   //...............................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Qty_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A51= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[51]")));
	  			   
	  			   String RS51= A51.getAttribute("value");	
	  			   Assert.assertTrue(RS51.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS51) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS51.matches("[0-9]+") && Long.parseLong(RS51)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Amount_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A52= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[52]")));
	  			  
	  			   String RS52= A52.getAttribute("value");	
	  			   Assert.assertTrue(RS52.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS52) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS52.matches("[0-9]+") && Long.parseLong(RS52)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Qty_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A53= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[53]")));
	  			   
	  			   String RS53= A53.getAttribute("value");	
	  			   Assert.assertTrue(RS53.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS53) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS53.matches("[0-9]+") && Long.parseLong(RS53)>=0, "Input accepts alphabet ");
	  	             	}
	  	//..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Amount_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A54= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[54]")));
	  			   
	  			   String RS54= A54.getAttribute("value");	
	  			   Assert.assertTrue(RS54.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS54) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS54.matches("[0-9]+") && Long.parseLong(RS54)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Retail_sales_Amount_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A56= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[56]")));
	  			  
	  			   String RS56= A56.getAttribute("value");	
	  			   Assert.assertTrue(RS56.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS56) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS56.matches("[0-9]+") && Long.parseLong(RS56)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void DRF_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A58= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[58]")));
	  			   
	  			   String RS58= A58.getAttribute("value");	
	  			   Assert.assertTrue(RS58.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS58) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS58.matches("[0-9]+") && Long.parseLong(RS58)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void Consumer_Offer_Exchange_Bonus_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A59= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[59]")));
	  			   
	  			   String RS59= A59.getAttribute("value");	
	  			   Assert.assertTrue(RS59.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS59) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS59.matches("[0-9]+") && Long.parseLong(RS59)>=0, "Input accepts alphabet ");
	  	             	}
 //..........................................................................................
	  	  	@Test
	  	  	public  void Dealer_Compulsion_Discount_Of_Wagon_R() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A60= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[60]")));
	  			  
	  			   String RS60= A60.getAttribute("value");	
	  			   Assert.assertTrue(RS60.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS60) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS60.matches("[0-9]+") && Long.parseLong(RS60)>=0, "Input accepts alphabet ");
	  	             	}	
//..............................................................................................
//.....................................................................................................	  	  	
	  	  	@Test
	  	  	public  void Opening_Stock__Qty_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A65= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[65]")));
	  			   
	  			   String RS65= A65.getAttribute("value");	
	  			   Assert.assertTrue(RS65.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS65) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS65.matches("[0-9]+") && Long.parseLong(RS65)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................
	  	  	@Test
	  	  	public  void Opening_Stock_Amount_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A66= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[66]")));
	  			  
	  			   String RS66= A66.getAttribute("value");	
	  			   Assert.assertTrue(RS66.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS66) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS66.matches("[0-9]+") && Long.parseLong(RS66)>=0, "Input accepts alphabet ");
	  	             	}
	   //...............................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Qty_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A67= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[67]")));
	  			   
	  			   String RS67= A67.getAttribute("value");	
	  			   Assert.assertTrue(RS67.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS67) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS67.matches("[0-9]+") && Long.parseLong(RS67)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Amount_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A68= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[68]")));
	  			  
	  			   String RS68= A68.getAttribute("value");	
	  			   Assert.assertTrue(RS68.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS68) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS68.matches("[0-9]+") && Long.parseLong(RS68)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Qty_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A69= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[69]")));
	  			   
	  			   String RS69= A69.getAttribute("value");	
	  			   Assert.assertTrue(RS69.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS69) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS69.matches("[0-9]+") && Long.parseLong(RS69)>=0, "Input accepts alphabet ");
	  	             	}
	  	//..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Amount_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A70= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[70]")));
	  			   
	  			   String RS70= A70.getAttribute("value");	
	  			   Assert.assertTrue(RS70.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS70) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS70.matches("[0-9]+") && Long.parseLong(RS70)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Retail_sales_Amount_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A72= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[72]")));
	  			  
	  			   String RS72= A72.getAttribute("value");	
	  			   Assert.assertTrue(RS72.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS72) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS72.matches("[0-9]+") && Long.parseLong(RS72)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void DRF_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A74= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[74]")));
	  			   
	  			   String RS74= A74.getAttribute("value");	
	  			   Assert.assertTrue(RS74.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS74) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS74.matches("[0-9]+") && Long.parseLong(RS74)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void Consumer_Offer_Exchange_Bonus_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A75= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[75]")));
	  			   
	  			   String RS75= A75.getAttribute("value");	
	  			   Assert.assertTrue(RS75.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS75) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS75.matches("[0-9]+") && Long.parseLong(RS75)>=0, "Input accepts alphabet ");
	  	             	}
 //..........................................................................................
	  	  	@Test
	  	  	public  void Dealer_Compulsion_Discount_Of_Swift() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A76= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[76]")));
	  			  
	  			   String RS76= A76.getAttribute("value");	
	  			   Assert.assertTrue(RS76.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS76) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS76.matches("[0-9]+") && Long.parseLong(RS76)>=0, "Input accepts alphabet ");
	  	             	}
//.................................................................................................
//...............................................................................................
	  	  		  	 	
	  	  	@Test
	  	  	public  void Opening_Stock__Qty_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A81= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[81]")));
	  			   
	  			   String RS81= A81.getAttribute("value");	
	  			   Assert.assertTrue(RS81.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS81) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS81.matches("[0-9]+") && Long.parseLong(RS81)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................
	  	  	@Test
	  	  	public  void Opening_Stock_Amount_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A82= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[82]")));
	  			  
	  			   String RS82= A82.getAttribute("value");	
	  			   Assert.assertTrue(RS82.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS82) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS82.matches("[0-9]+") && Long.parseLong(RS82)>=0, "Input accepts alphabet ");
	  	             	}
	   //...............................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Qty_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A83= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[83]")));
	  			   
	  			   String RS83= A83.getAttribute("value");	
	  			   Assert.assertTrue(RS83.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS83) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS83.matches("[0-9]+") && Long.parseLong(RS83)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Amount_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A84= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[84]")));
	  			  
	  			   String RS84= A84.getAttribute("value");	
	  			   Assert.assertTrue(RS84.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS84) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS84.matches("[0-9]+") && Long.parseLong(RS84)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Qty_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A85= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[85]")));
	  			   
	  			   String RS85= A85.getAttribute("value");	
	  			   Assert.assertTrue(RS85.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS85) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS85.matches("[0-9]+") && Long.parseLong(RS85)>=0, "Input accepts alphabet ");
	  	             	}
	  	//..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Amount_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A86= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[86]")));
	  			   
	  			   String RS86= A86.getAttribute("value");	
	  			   Assert.assertTrue(RS86.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS86) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS86.matches("[0-9]+") && Long.parseLong(RS86)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Retail_sales_Amount_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A88= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[88]")));
	  			  
	  			   String RS88= A88.getAttribute("value");	
	  			   Assert.assertTrue(RS88.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS88) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS88.matches("[0-9]+") && Long.parseLong(RS88)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void DRF_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A90= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[90]")));
	  			   
	  			   String RS90= A90.getAttribute("value");	
	  			   Assert.assertTrue(RS90.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS90) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS90.matches("[0-9]+") && Long.parseLong(RS90)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void Consumer_Offer_Exchange_Bonus_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A91= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[91]")));
	  			   
	  			   String RS91= A91.getAttribute("value");	
	  			   Assert.assertTrue(RS91.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS91) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS91.matches("[0-9]+") && Long.parseLong(RS91)>=0, "Input accepts alphabet ");
	  	             	}
 //..........................................................................................
	  	  	@Test
	  	  	public  void Dealer_Compulsion_Discount_Of_Dzire() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A92= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[92]")));
	  			  
	  			   String RS92= A92.getAttribute("value");	
	  			   Assert.assertTrue(RS92.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS92) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS92.matches("[0-9]+") && Long.parseLong(RS92)>=0, "Input accepts alphabet ");
	  	             	}
	  	  	
//.......................................................................................................
//...............................................................................................
		  	 	
	  	  	@Test
	  	  	public  void Opening_Stock__Qty_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A97= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[97]")));
	  			   
	  			   String RS97= A97.getAttribute("value");	
	  			   Assert.assertTrue(RS97.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS97) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS97.matches("[0-9]+") && Long.parseLong(RS97)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................
	  	  	@Test
	  	  	public  void Opening_Stock_Amount_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A98= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[98]")));
	  			  
	  			   String RS98= A98.getAttribute("value");	
	  			   Assert.assertTrue(RS98.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS98) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS98.matches("[0-9]+") && Long.parseLong(RS98)>=0, "Input accepts alphabet ");
	  	             	}
	   //...............................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Qty_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A99= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[99]")));
	  			   
	  			   String RS99= A99.getAttribute("value");	
	  			   Assert.assertTrue(RS99.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS99) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS99.matches("[0-9]+") && Long.parseLong(RS99)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Amount_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A100= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[100]")));
	  			  
	  			   String RS100= A100.getAttribute("value");	
	  			   Assert.assertTrue(RS100.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS100) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS100.matches("[0-9]+") && Long.parseLong(RS100)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Qty_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A101= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[101]")));
	  			   
	  			   String RS101= A101.getAttribute("value");	
	  			   Assert.assertTrue(RS101.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS101) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS101.matches("[0-9]+") && Long.parseLong(RS101)>=0, "Input accepts alphabet ");
	  	             	}
	  	//..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Amount_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A102= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[102]")));
	  			   
	  			   String RS102= A102.getAttribute("value");	
	  			   Assert.assertTrue(RS102.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS102) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS102.matches("[0-9]+") && Long.parseLong(RS102)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Retail_sales_Amount_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A104= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[104]")));
	  			  
	  			   String RS104= A104.getAttribute("value");	
	  			   Assert.assertTrue(RS104.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS104) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS104.matches("[0-9]+") && Long.parseLong(RS104)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void DRF_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A106= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[106]")));
	  			   
	  			   String RS106= A106.getAttribute("value");	
	  			   Assert.assertTrue(RS106.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS106) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS106.matches("[0-9]+") && Long.parseLong(RS106)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void Consumer_Offer_Exchange_Bonus_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A107= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[107]")));
	  			   
	  			   String RS107= A107.getAttribute("value");	
	  			   Assert.assertTrue(RS107.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS107) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS107.matches("[0-9]+") && Long.parseLong(RS107)>=0, "Input accepts alphabet ");
	  	             	}
 //..........................................................................................
	  	  	@Test
	  	  	public  void Dealer_Compulsion_Discount_Of_Brezza() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A108= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[108]")));
	  			  
	  			   String RS108= A108.getAttribute("value");	
	  			   Assert.assertTrue(RS108.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS108) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS108.matches("[0-9]+") && Long.parseLong(RS108)>=0, "Input accepts alphabet ");
	  	             	}
//........................................................................................................................
//...............................................................................................
	  	 	
	  	  	@Test
	  	  	public  void Opening_Stock__Qty_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A113= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[113]")));
	  			   
	  			   String RS113= A113.getAttribute("value");	
	  			   Assert.assertTrue(RS113.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS113) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS113.matches("[0-9]+") && Long.parseLong(RS113)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................
	  	  	@Test
	  	  	public  void Opening_Stock_Amount_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A114= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[114]")));
	  			  
	  			   String RS114= A114.getAttribute("value");	
	  			   Assert.assertTrue(RS114.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS114) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS114.matches("[0-9]+") && Long.parseLong(RS114)>=0, "Input accepts alphabet ");
	  	             	}
	   //...............................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Qty_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A115= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[115]")));
	  			   
	  			   String RS115= A115.getAttribute("value");	
	  			   Assert.assertTrue(RS115.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS115) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS115.matches("[0-9]+") && Long.parseLong(RS115)>=0, "Input accepts alphabet ");
	  	             	}
	  //..............................................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Amount_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver, Duration.ofSeconds(11));
			   WebElement A116= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[116]")));
	  			  
	  			   String RS116= A116.getAttribute("value");	
	  			   Assert.assertTrue(RS116.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS116) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS116.matches("[0-9]+") && Long.parseLong(RS116)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Qty_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A117= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[117]")));
	  			   
	  			   String RS117= A117.getAttribute("value");	
	  			   Assert.assertTrue(RS117.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS117) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS117.matches("[0-9]+") && Long.parseLong(RS117)>=0, "Input accepts alphabet ");
	  	             	}
	  	//..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Amount_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A118= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[118]")));
	  			   
	  			   String RS118= A118.getAttribute("value");	
	  			   Assert.assertTrue(RS118.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS118) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS118.matches("[0-9]+") && Long.parseLong(RS118)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Retail_sales_Amount_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A120= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[120]")));
	  			  
	  			   String RS120= A120.getAttribute("value");	
	  			   Assert.assertTrue(RS120.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS120) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS120.matches("[0-9]+") && Long.parseLong(RS120)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void DRF_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A122= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[122]")));
	  			   
	  			   String RS122= A122.getAttribute("value");	
	  			   Assert.assertTrue(RS122.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS122) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS122.matches("[0-9]+") && Long.parseLong(RS122)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void Consumer_Offer_Exchange_Bonus_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A123= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[123]")));
	  			   
	  			   String RS123= A123.getAttribute("value");	
	  			   Assert.assertTrue(RS123.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS123) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS123.matches("[0-9]+") && Long.parseLong(RS123)>=0, "Input accepts alphabet ");
	  	             	}
 //..........................................................................................
	  	  	@Test
	  	  	public  void Dealer_Compulsion_Discount_Of_ERTIGA() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A124= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[124]")));
	  			  
	  			   String RS124= A124.getAttribute("value");	
	  			   Assert.assertTrue(RS124.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS124) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS124.matches("[0-9]+") && Long.parseLong(RS124)>=0, "Input accepts alphabet ");
	  	             	}
//........................................................................................................................
//...............................................................................................
	  	 	
	  	  	@Test
	  	  	public  void Opening_Stock__Qty_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A129= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[129]")));
	  			   
	  			   String RS129= A129.getAttribute("value");	
	  			   Assert.assertTrue(RS129.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS129) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS129.matches("[0-9]+") && Long.parseLong(RS129)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................
	  	  	@Test
	  	  	public  void Opening_Stock_Amount_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A130= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[130]")));
	  			  
	  			   String RS130= A130.getAttribute("value");	
	  			   Assert.assertTrue(RS130.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS130) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS130.matches("[0-9]+") && Long.parseLong(RS130)>=0, "Input accepts alphabet ");
	  	             	}
	   //...............................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Qty_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A131= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[131]")));
	  			   
	  			   String RS131= A131.getAttribute("value");	
	  			   Assert.assertTrue(RS131.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS131) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS131.matches("[0-9]+") && Long.parseLong(RS131)>=0, "Input accepts alphabet ");
	  	             	}
	  //..............................................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Amount_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A132= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[132]")));
	  			  
	  			   String RS132= A132.getAttribute("value");	
	  			   Assert.assertTrue(RS132.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS132) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS132.matches("[0-9]+") && Long.parseLong(RS132)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Qty_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A133= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[133]")));
	  			   
	  			   String RS133= A133.getAttribute("value");	
	  			   Assert.assertTrue(RS133.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS133) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS133.matches("[0-9]+") && Long.parseLong(RS133)>=0, "Input accepts alphabet ");
	  	             	}
	  	//..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Amount_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A134= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[134]")));
	  			   
	  			   String RS134= A134.getAttribute("value");	
	  			   Assert.assertTrue(RS134.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS134) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS134.matches("[0-9]+") && Long.parseLong(RS134)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Retail_sales_Amount_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A136= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[136]")));
	  			  
	  			   String RS136= A136.getAttribute("value");	
	  			   Assert.assertTrue(RS136.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS136) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS136.matches("[0-9]+") && Long.parseLong(RS136)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void DRF_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A138= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[138]")));
	  			   
	  			   String RS138= A138.getAttribute("value");	
	  			   Assert.assertTrue(RS138.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS138) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS138.matches("[0-9]+") && Long.parseLong(RS138)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void Consumer_Offer_Exchange_Bonus_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A139= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[139]")));
	  			   
	  			   String RS139= A139.getAttribute("value");	
	  			   Assert.assertTrue(RS139.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS139) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS139.matches("[0-9]+") && Long.parseLong(RS139)>=0, "Input accepts alphabet ");
	  	             	}
 //..........................................................................................
	  	  	@Test
	  	  	public  void Dealer_Compulsion_Discount_Of_ECO() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A140= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[140]")));
	  			  
	  			   String RS140= A140.getAttribute("value");	
	  			   Assert.assertTrue(RS140.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS140) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS140.matches("[0-9]+") && Long.parseLong(RS140)>=0, "Input accepts alphabet ");
	  	             	}
//..........................................................................................................
//...............................................................................................
	  	 	
	  	  	@Test
	  	  	public  void Opening_Stock__Qty_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A145= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[145]")));
	  			   
	  			   String RS145= A145.getAttribute("value");	
	  			   Assert.assertTrue(RS145.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS145) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS145.matches("[0-9]+") && Long.parseLong(RS145)>=0, "Input accepts alphabet ");
	  	             	}
	 //...............................................................................................
	  	  	@Test
	  	  	public  void Opening_Stock_Amount_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A146= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[146]")));
	  			  
	  			   String RS146= A146.getAttribute("value");	
	  			   Assert.assertTrue(RS146.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS146) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS146.matches("[0-9]+") && Long.parseLong(RS146)>=0, "Input accepts alphabet ");
	  	             	}
	   //...............................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Qty_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A147= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[147]")));
	  			   
	  			   String RS147= A147.getAttribute("value");	
	  			   Assert.assertTrue(RS147.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS147) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS147.matches("[0-9]+") && Long.parseLong(RS147)>=0, "Input accepts alphabet ");
	  	             	}
	  //..............................................................................................................
	  	  	@Test
	  	  	public  void WholeSale_Amount_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver, Duration.ofSeconds(11));
			   WebElement A148= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[148]")));
	  			  
	  			   String RS148= A148.getAttribute("value");	
	  			   Assert.assertTrue(RS148.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS148) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS148.matches("[0-9]+") && Long.parseLong(RS148)>=0, "Input accepts alphabet ");
	  	             	}
	  //...............................................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Qty_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A149= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[149]")));
	  			   
	  			   String RS149= A149.getAttribute("value");	
	  			   Assert.assertTrue(RS149.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS149) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS149.matches("[0-9]+") && Long.parseLong(RS149)>=0, "Input accepts alphabet ");
	  	             	}
	  	//..........................................................................................
	  	  	@Test
	  	  	public  void Closing_stock_Amount_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A150= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[150]")));
	  			   
	  			   String RS150= A150.getAttribute("value");	
	  			   Assert.assertTrue(RS150.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS150) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS150.matches("[0-9]+") && Long.parseLong(RS150)>=0, "Input accepts alphabet ");
	  	             	}
	  //..........................................................................................
	  	  	@Test
	  	  	public  void Retail_sales_Amount_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A152= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[152]")));
	  			  
	  			   String RS152= A152.getAttribute("value");	
	  			   Assert.assertTrue(RS152.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS152) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS152.matches("[0-9]+") && Long.parseLong(RS152)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void DRF_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A154= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[154]")));
	  			   
	  			   String RS154= A154.getAttribute("value");	
	  			   Assert.assertTrue(RS154.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS154) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS154.matches("[0-9]+") && Long.parseLong(RS154)>=0, "Input accepts alphabet ");
	  	             	}
	  	 //..........................................................................................
	  	  	@Test
	  	  	public  void Consumer_Offer_Exchange_Bonus_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A155= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[155]")));
	  			   
	  			   String RS155= A155.getAttribute("value");	
	  			   Assert.assertTrue(RS155.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS155) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS155.matches("[0-9]+") && Long.parseLong(RS155)>=0, "Input accepts alphabet ");
	  	             	}
 //..........................................................................................
	  	  	@Test
	  	  	public  void Dealer_Compulsion_Discount_Of_SuperCarry() {
	  	  	   wait = new WebDriverWait(driver,  Duration.ofSeconds(22));
			   WebElement A156= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type=\"number\"])[156]")));
	  			  
	  			   String RS156= A156.getAttribute("value");	
	  			   Assert.assertTrue(RS156.length() <= 12, "Input accepts more than 12 characters");
	  	           Assert.assertTrue(Long.parseLong(RS156) >= 0, "Input accepts negative value");	        
	  	           Assert.assertTrue(RS156.matches("[0-9]+") && Long.parseLong(RS156)>=0, "Input accepts alphabet ");
	  	             	}
//........................................................................................................................  		      	      	      
	@Test
	public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of_ALTO() throws InterruptedException {
		
		long expectedValue1 = (alto1 + alto3) - alto5; // RETAIL SALES # QTY
		Assert.assertEquals(expectedValue1, alto7);
//.........................................................................................			
		}
	@Test
	public  void CAlCULATION_OF_margin_Amount_In_ALTO() throws InterruptedException {
		
	long expectedValue2 = alto8 - (alto2 + alto4 - alto6); // MARGIN
	Assert.assertEquals(expectedValue2, alto9);
//...........................................................................................
		}
		@Test
		public  void CAlCULATION_OF_Total_Discount_In_ALTO() throws InterruptedException {
			
			long expectedValue3= alto11+alto12; //Total Discount
		Assert.assertEquals(expectedValue3, alto13);

		}
//...........................................................................................
			
			@Test
			public  void CAlCULATION_OF_Margin_per_Cars_In_ALTO() throws InterruptedException  {
				
				double expectedValue4 =alto9/Alto1 ;	// Margin/Car (Rs.)
				long roundedResults1 = Math.round(expectedValue4);
	            Assert.assertEquals(roundedResults1, alto14);	
	}
//...........................................................................................
			
			@Test
			public  void CAlCULATION_OF_DRF_per_Cars_In_ALTO() throws InterruptedException {
				
		 double expectedValue5 =alto10/Alto1 ;	// DRF/Car (Rs.)					 
			long roundedResults2 = Math.round(expectedValue5);
			Assert.assertEquals(roundedResults2, alto15);
					}
//...........................................................................................
				
			@Test
			public  void CAlCULATION_OF_Discount_Per_Cars_ALTO() throws InterruptedException {
				
			   double expectedValue6 =alto13/Alto1 ;	// Discount/Car (Rs.)
		  long roundedResults3 = Math.round(expectedValue6);
	     Assert.assertEquals(roundedResults3, alto16);
					        }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					      // Spresso
//............................................................................................
			@Test
			public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of__SPresso() throws InterruptedException {
				
				long SP1= (spresso1+spresso3)-spresso5;  // RETAIL SALES # QTY
				Assert.assertEquals(SP1, spresso7);
				}
//.............................................................................................
			//.............................................................................................
			@Test
			public  void CAlCULATION_OF_margin_Amount_In_Spresso() throws InterruptedException {
				
			long SP2= spresso8-(spresso2+spresso4-spresso6);  // MARGIN 
			Assert.assertEquals(SP2, spresso9);
			}
//...........................................................................................
			@Test
			public  void  CAlCULATION_OF_Total_Discount_In__Spresso() throws InterruptedException {
				
			long SP3= spresso11+spresso12;  //Total Discount 
			Assert.assertEquals(SP3, spresso13);
			}
//...........................................................................................
			@Test
			public  void  CAlCULATION_OF_Margin_Per_Cars_In__Spresso() throws InterruptedException {
				
		 double SP4 =spresso9/SPRESSO1 ;	// Margin/Car (Rs.)
		 
		 long roundedResults190 = Math.round(SP4);
		Assert.assertEquals(roundedResults190, spresso14);
		
		 }
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_DRF_Per_Cars_In__Spresso() throws InterruptedException {
				
		    double SP5 =spresso10/SPRESSO1 ;	// DRF/Car (Rs.)
			long roundedResults191 = Math.round(SP5);
            Assert.assertEquals(roundedResults191, spresso15);
		 }
//.....................................................................			
			@Test
			public  void  CAlCULATION_OF_discount_Per_Cars_In__Spresso() throws InterruptedException {
				
		    double SP6 =spresso13/SPRESSO1 ;	// Discount/Car (Rs.)
		   long roundedResults192 = Math.round(SP6);

            Assert.assertEquals(roundedResults192, spresso16);		   
			 }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			//           CELERIO
//...........................................................................................			
			@Test
			public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of__Celerio() throws InterruptedException {
				
				long expectedValue1= (CELERIO1+CELERIO3)-CELERIO5;  // RETAIL SALES # QTY
             Assert.assertEquals(expectedValue1, CELERIO7);			        	
			}
//...................................................................................
			@Test
			public  void CAlCULATION_OF_margin_Amount_In_Celerio() throws InterruptedException {
				
				 long expectedValue2= CELERIO8-(CELERIO2+CELERIO4-CELERIO6);  // MARGIN 
				 Assert.assertEquals(expectedValue2, CELERIO9);	    
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_Total_Discount_In__Celerio() throws InterruptedException {
				
			    long expectedValue3= CELERIO11+CELERIO12;  //Total Discount
                Assert.assertEquals(expectedValue3, CELERIO13);
			}
//...........................................................................................
			@Test
			public  void  CAlCULATION_OF_Margin_Per_Cars_In__Celerio() throws InterruptedException {
				
				double expectedValue4 =CELERIO9/Celerio1 ;	// Margin/Car (Rs.)
				long roundedResults1 = Math.round(expectedValue4);
				Assert.assertEquals(roundedResults1, CELERIO14);
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_DRF_Per_Cars_In__Celerio() throws InterruptedException {
				
				double expectedValue5 =CELERIO10/Celerio1 ;	// DRF/Car (Rs.)	        
				long roundedResults2 = Math.round(expectedValue5);
				Assert.assertEquals(roundedResults2, CELERIO15);
			}
//.....................................................................			
			@Test
			public  void  CAlCULATION_OF_discount_Per_Cars_In__Celerio() throws InterruptedException {
				
				  double expectedValue6 =CELERIO13/Celerio1 ;	// Discount/Car (Rs.)			        
					long roundedResults3 = Math.round(expectedValue6);
					Assert.assertEquals(roundedResults3, CELERIO16);			
			}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			                    // WAGON-R
//......................................................................................
			@Test
			public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of__WAGON_R() throws InterruptedException {
				
			    long expectedValues1= (WAGONR1+WAGONR3)-WAGONR5;  // RETAIL SALES # QTY
             Assert.assertEquals(expectedValues1, WAGONR7);			        	
			}
//...................................................................................
			@Test
			public  void CAlCULATION_OF_margin_Amount_In_WAGON_R() throws InterruptedException {
				
			    long expectedValues2= WAGONR8-(WAGONR2+WAGONR4-WAGONR6);  // MARGIN 
				 Assert.assertEquals(expectedValues2, WAGONR9);	    
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_Total_Discount_In__WAGON_R() throws InterruptedException {
				
				long expectedValues3= WAGONR11+WAGONR12;  //Total Discount
                Assert.assertEquals(expectedValues3, WAGONR13);
			}
//...........................................................................................
			@Test
			public  void  CAlCULATION_OF_Margin_Per_Cars_In__WAGON_R() throws InterruptedException {
				
				double expectedValues4 =WAGONR9/wagonar1 ;	// Margin/Car (Rs.)
				long roundedResultss1 = Math.round(expectedValues4);					
				Assert.assertEquals(roundedResultss1, WAGONR14);
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_DRF_Per_Cars_In__WAGON_R() throws InterruptedException {
				
				  double expectedValues5 =WAGONR10/wagonar1 ;	// DRF/Car (Rs.)			        
				  long roundedResultsss2 = Math.round(expectedValues5);							
				Assert.assertEquals(roundedResultsss2, WAGONR15);
			}
//.....................................................................			
			@Test
			public  void  CAlCULATION_OF_discount_Per_Cars_In__WAGON_R() throws InterruptedException {	
				
		        double expectedValues6 =WAGONR13/wagonar1 ;	// Discount/Car (Rs.)		        
				long roundedResultssss3 = Math.round(expectedValues6);
					Assert.assertEquals(roundedResultssss3, WAGONR16);			
			}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                              //    SWIFT			
//.............................................................................................
			@Test
			public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of__SWIFT() throws InterruptedException {
				
				long expectedValue1= (SWIFT1+SWIFT3)-SWIFT5;  // RETAIL SALES # QTY
             Assert.assertEquals(expectedValue1, SWIFT7);			        	
			}
//...................................................................................
			@Test
			public  void CAlCULATION_OF_margin_Amount_In_SWIFT() throws InterruptedException {
				
				 long expectedValue2= SWIFT8-(SWIFT2+SWIFT4-SWIFT6);  // MARGIN  
				 Assert.assertEquals(expectedValue2, SWIFT9);	    
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_Total_Discount_In__SWIFT() throws InterruptedException {
				
				long expectedValue3= SWIFT11+SWIFT12;  //Total Discount
                Assert.assertEquals(expectedValue3, SWIFT13);
			}
//...........................................................................................
			@Test
			public  void  CAlCULATION_OF_Margin_Per_Cars_In__SWIFT() throws InterruptedException {
				
				double expectedValue4 =SWIFT9/swift1 ;	// Margin/Car (Rs.)
				long roundedResults1 = Math.round(expectedValue4);					
				Assert.assertEquals(roundedResults1, SWIFT14);
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_DRF_Per_Cars_In__SWIFT() throws InterruptedException {
				
				double expectedValue5 =SWIFT10/swift1 ;	// DRF/Car (Rs.)		        
				long roundedResults2 = Math.round(expectedValue5);						
				Assert.assertEquals(roundedResults2, SWIFT15);
			}
//.....................................................................			
			@Test
			public  void  CAlCULATION_OF_discount_Per_Cars_In__SWIFT() throws InterruptedException {	
				
				double expectedValue6 =SWIFT13/swift1 ;	// Discount/Car (Rs.)	        
				long roundedResults3 = Math.round(expectedValue6);
					Assert.assertEquals(roundedResults3, SWIFT16);			
			}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			            // DZIRE
	//............................................................................
			@Test
			public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of__DZIRE() throws InterruptedException {
				
				long expectedValue1= (DZIRE1+DZIRE3)-DZIRE5;  // RETAIL SALES # QTY
             Assert.assertEquals(expectedValue1, DZIRE7);			        	
			}
//...................................................................................
			@Test
			public  void CAlCULATION_OF_margin_Amount_In_DZIRE() throws InterruptedException {
				
				long expectedValue2= DZIRE8-(DZIRE2+DZIRE4-DZIRE6);  // MARGIN 
				 Assert.assertEquals(expectedValue2, DZIRE9);	    
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_Total_Discount_In__DZIRE() throws InterruptedException {
				
				 long expectedValue3= DZIRE11+DZIRE12;  //Total Discount
                Assert.assertEquals(expectedValue3, DZIRE13);
			}
//...........................................................................................
			@Test
			public  void  CAlCULATION_OF_Margin_Per_Cars_In__DZIRE() throws InterruptedException {
				
				  double expectedValue4 =DZIRE9/dzire1 ;	// Margin/Car (Rs.)
					long roundedResults1 = Math.round(expectedValue4);					
				Assert.assertEquals(roundedResults1, DZIRE14);
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_DRF_Per_Cars_In__DZIRE() throws InterruptedException {
				
				 double expectedValue5 =DZIRE10/dzire1 ;	// DRF/Car (Rs.)			        
				long roundedResults2 = Math.round(expectedValue5);					
				Assert.assertEquals(roundedResults2, DZIRE15);
			}
//.....................................................................			
			@Test
			public  void  CAlCULATION_OF_discount_Per_Cars_In__DZIRE() throws InterruptedException {
				
				 double expectedValue6 =DZIRE13/dzire1 ;	// Discount/Car (Rs.)			        
				long roundedResults3 = Math.round(expectedValue6);
					Assert.assertEquals(roundedResults3, DZIRE16);			
			}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			            // BREZZA
//............................................................................
			@Test
			public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of__BREZZA() throws InterruptedException {
				
				long expectedValue1= (BREZZA1+BREZZA3)-BREZZA5;  // RETAIL SALES # QTY
             Assert.assertEquals(expectedValue1, BREZZA7);			        	
			}
//...................................................................................
			@Test
			public  void CAlCULATION_OF_margin_Amount_In_BREZZA() throws InterruptedException {
				
				 long expectedValue2= BREZZA8-(BREZZA2+BREZZA4-BREZZA6);  // MARGIN  
				 Assert.assertEquals(expectedValue2, BREZZA9);	    
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_Total_Discount_In__BREZZA() throws InterruptedException {
				
				long expectedValue3= BREZZA11+BREZZA12;  //Total Discount
                Assert.assertEquals(expectedValue3, BREZZA13);
			}
//...........................................................................................
			@Test
			public  void  CAlCULATION_OF_Margin_Per_Cars_In__BREZZA() throws InterruptedException {
				
				    double expectedValue4 =BREZZA9/brezza1 ;	// Margin/Car (Rs.)
					long roundedResults1 = Math.round(expectedValue4);					
				Assert.assertEquals(roundedResults1, BREZZA14);
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_DRF_Per_Cars_In__BREZZA() throws InterruptedException {
				
				  double expectedValue5 =BREZZA10/brezza1 ;	// DRF/Car (Rs.)			        
				  long roundedResults2 = Math.round(expectedValue5);				
				Assert.assertEquals(roundedResults2, BREZZA15);
			}
//.....................................................................			
			@Test
			public  void  CAlCULATION_OF_discount_Per_Cars_In__BREZZA() throws InterruptedException {
				
				double expectedValue6 = BREZZA13/brezza1 ;	// Discount/Car (Rs.)		        
				long roundedResults3 = Math.round(expectedValue6);
					Assert.assertEquals(roundedResults3, BREZZA16);			
			}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			            // ERTIGA
	//...........................................................................................
			@Test
			public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of__ERTIGA() throws InterruptedException {
				
				 long expectedValue1= (ERTIGA1+ERTIGA3)-ERTIGA5;  // RETAIL SALES # QTY
             Assert.assertEquals(expectedValue1, ERTIGA7);			        	
			}
//...................................................................................
			@Test
			public  void CAlCULATION_OF_margin_Amount_In_ERTIGA() throws InterruptedException {
				
				long expectedValue2= ERTIGA8-(ERTIGA2+ERTIGA4-ERTIGA6);  // MARGIN  
				 Assert.assertEquals(expectedValue2, ERTIGA9);	    
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_Total_Discount_In__ERTIGA() throws InterruptedException {
				
				 long expectedValue3= ERTIGA11+ERTIGA12;  //Total Discount
                Assert.assertEquals(expectedValue3, ERTIGA13);
			}
//...........................................................................................
			@Test
			public  void  CAlCULATION_OF_Margin_Per_Cars_In__ERTIGA() throws InterruptedException {
				
				 double expectedValue4 =ERTIGA9/Ertiga1 ;	// Margin/Car (Rs.)
					long roundedResults1 = Math.round(expectedValue4);					
				Assert.assertEquals(roundedResults1, ERTIGA14);
			}
//..............................................................................................
			@Test
			public  void  CAlCULATION_OF_DRF_Per_Cars_In__ERTIGA() throws InterruptedException {
				
				double expectedValue5 =ERTIGA10/Ertiga1 ;	// DRF/Car (Rs.)	        
				long roundedResults2 = Math.round(expectedValue5);				
				Assert.assertEquals(roundedResults2, ERTIGA15);
			}
//.....................................................................			
			@Test
			public  void  CAlCULATION_OF_discount_Per_Cars_In__ERTIGA() throws InterruptedException {	
				
				  double expectedValue6 = ERTIGA13/Ertiga1 ;	// Discount/Car (Rs.)	        
					long roundedResults3 = Math.round(expectedValue6);
					Assert.assertEquals(roundedResults3, ERTIGA16);			
			}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			            // EECO
//...........................................................................................
			
@Test
public  void CAlCULATION_OF_RETAIL_SALES_QTY_Of__EECO() throws InterruptedException {
	
	long expectedValue1= (ECO1+ECO3)-ECO5;  // RETAIL SALES # QTY
 Assert.assertEquals(expectedValue1, ECO7);			        	
}
//...................................................................................
@Test
public  void CAlCULATION_OF_margin_Amount_In_EECO() throws InterruptedException {
	
	long expectedValue2= ECO8-(ECO2+ECO4-ECO6);  // MARGIN  
	 Assert.assertEquals(expectedValue2, ECO9);	    
}
//..............................................................................................
@Test
public  void  CAlCULATION_OF_Total_Discount_In__EECO() throws InterruptedException {
	
	long expectedValue3= ECO11+ECO12;  //Total Discount
    Assert.assertEquals(expectedValue3, ECO13);
}
//...........................................................................................
@Test
public  void  CAlCULATION_OF_Margin_Per_Cars_In__EECO() throws InterruptedException {
	
	  double expectedValue4 =ECO9/Eco1 ;	// Margin/Car (Rs.)
		long roundedResults1 = Math.round(expectedValue4);				
	Assert.assertEquals(roundedResults1, ECO14);
}
//..............................................................................................
@Test
public  void  CAlCULATION_OF_DRF_Per_Cars_In__EECO() throws InterruptedException {
	
	double expectedValue5 = ECO10/Eco1 ;	// DRF/Car (Rs.)	        
	long roundedResults2 = Math.round(expectedValue5);			
	Assert.assertEquals(roundedResults2, ECO15);
}
//.....................................................................			
@Test
public  void  CAlCULATION_OF_discount_Per_Cars_In__EECO() throws InterruptedException {	
	
	double expectedValue6 = ECO13/Eco1 ;	// Discount/Car (Rs.)	        
	long roundedResults3 = Math.round(expectedValue6);				
		Assert.assertEquals(roundedResults3, ECO16);			
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                         // SUPER_CARRY
//..........................................................................................
@Test
public  void CAlCULATION_OF_RETAIL_SALES_QTY_In__SUPER_CARRY() throws InterruptedException {
	
	 long expectedValue1= (CARRY1+CARRY3)-CARRY5;  // RETAIL SALES # QTY
Assert.assertEquals(expectedValue1, CARRY7);			        	
}
//...................................................................................
@Test
public  void CAlCULATION_OF_margin_Amount_In_SUPER_CARRY() throws InterruptedException {
	
	long expectedValue2= CARRY8-(CARRY2+CARRY4-CARRY6);  // MARGIN  
	 Assert.assertEquals(expectedValue2, CARRY9);	    
}
//..............................................................................................
@Test
public  void  CAlCULATION_OF_Total_Discount_In__SUPER_CARRY() throws InterruptedException {
	
	long expectedValue3= CARRY11+CARRY12;  //Total Discount
  Assert.assertEquals(expectedValue3, CARRY13);
}
//...........................................................................................
@Test
public  void  CAlCULATION_OF_Margin_Per_Cars_In__SUPER_CARRY() throws InterruptedException {
	
	double expectedValue4 =CARRY9/Carry1 ;	// Margin/Car (Rs.) 
	long roundedResults1 = Math.round(expectedValue4);				
	Assert.assertEquals(roundedResults1, CARRY14);
}
//..............................................................................................
@Test
public  void  CAlCULATION_OF_DRF_Per_Cars_In__SUPER_CARRY() throws InterruptedException {
	
	double expectedValue5 = CARRY10/Carry1 ;	// DRF/Car (Rs.	        
	long roundedResults2 = Math.round(expectedValue5);			
	Assert.assertEquals(roundedResults2, CARRY15);
}
//.....................................................................			
@Test
public  void  CAlCULATION_OF_discount_Per_Cars_In__SUPER_CARRY() throws InterruptedException {
	
	 double expectedValue6 = CARRY13/Carry1 ;	// Discount/Car (Rs.)	        
		long roundedResults3 = Math.round(expectedValue6);				
		Assert.assertEquals(roundedResults3, CARRY16);			
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                         // Totals 
//..............................................................................................
    @Test
      public  void  TOTAL_Opening_stock_QTY() throws InterruptedException {	
    	
    	 long expected1=alto1+spresso1+CELERIO1+WAGONR1+SWIFT1+DZIRE1+BREZZA1+ERTIGA1+ECO1+CARRY1 ;  // OPENEING STOCKS
    	Assert.assertEquals(expected1,  openingQty1);
    }
//......................................................................................................
    @Test
    public  void  TOTAL_Opening_stock_amount() throws InterruptedException {	
    	
  	 long expect1=alto2+spresso2+CELERIO2+WAGONR2+SWIFT2+DZIRE2+BREZZA2+ERTIGA2+ECO2+CARRY2 ;
  	Assert.assertEquals(expect1,  a1);
    }
 //..............................................................................................
  	 @Test
     public  void  TOTAL_WholeSale_Qty() throws InterruptedException {	
  		
   	 long expect1=alto3+spresso3+CELERIO3+WAGONR3+SWIFT3+DZIRE3+BREZZA3+ERTIGA3+ECO3+CARRY3 ;
   	Assert.assertEquals(expect1,  WW1);
  	 }
 //..............................................................................................
 	 @Test
    public  void  TOTAL_WholeSale_Amount() throws InterruptedException {	
 		
  	 long expects1=alto4+spresso4+CELERIO4+WAGONR4+SWIFT4+DZIRE4+BREZZA4+ERTIGA4+ECO4+CARRY4 ;
  	Assert.assertEquals(expects1,  WHOLESALES_amount1);
 	 }
 //..............................................................................................
  	@Test
    public  void  TOTAL_Closing_Stock_Qty() throws InterruptedException {
  		
  	 long expects2=alto5+spresso5+CELERIO5+WAGONR5+SWIFT5+DZIRE5+BREZZA5+ERTIGA5+ECO5+CARRY5 ;
   	Assert.assertEquals(expects2,    closingSTOCK_qty1);
  	}
//.............................................................................................
	@Test
    public  void  TOTAL_Closing_Stock_amount() throws InterruptedException {
		
  	 long expects3=alto6+spresso6+CELERIO6+WAGONR6+SWIFT6+DZIRE6+BREZZA6+ERTIGA6+ECO6+CARRY6 ;
   	Assert.assertEquals(expects3,      closingSTOCK_amt1);
    }
//.............................................................................................
		@Test
	    public  void  TOTAL_Retail_sales_Qty() throws InterruptedException {	
			
	  	 long expects4=alto7+spresso7+CELERIO7+WAGONR7+SWIFT7+DZIRE7+BREZZA7+ERTIGA7+ECO7+CARRY7 ;
	   	Assert.assertEquals(expects4, Reatil1);
	  }
//.............................................................................................
				@Test
			    public  void  TOTAL_Retail_sales_Amount() throws InterruptedException {
					
			  	 long expects5=alto8+spresso8+CELERIO8+WAGONR8+SWIFT8+DZIRE8+BREZZA8+ERTIGA8+ECO8+CARRY8 ;
			   	Assert.assertEquals(expects5, ReatilSS1);
			  }	
//.............................................................................................
				@Test
			    public  void  TOTAL_Margin_Amount() throws InterruptedException {	
					
			  	 long expects6=alto9+spresso9+CELERIO9+WAGONR9+SWIFT9+DZIRE9+BREZZA9+ERTIGA9+ECO9+CARRY9 ;
			   	Assert.assertEquals(expects6, marginAmount1 );
			  }	
//......................................................................................................
		@Test
		 public  void  TOTAL_DRF() throws InterruptedException{	
			
		 long expects7=alto10+spresso10+CELERIO10+WAGONR10+SWIFT10+DZIRE10+BREZZA10+ERTIGA10+ECO10+CARRY10 ;
	     Assert.assertEquals(expects7, DRFAmount1 );
			  }	
//.......................................................................................................		
		@Test
		 public  void  TOTAL_Consumer_Offer_ISL_RMK() throws InterruptedException{	
			
		 long expects8=alto11+spresso11+CELERIO11+WAGONR11+SWIFT11+DZIRE11+BREZZA11+ERTIGA11+ECO11+CARRY11 ;
	     Assert.assertEquals(expects8, DISCOUNT_CONSUMER1 );
			  }	
	//.......................................................................................................		
		@Test
		 public  void  TOTAL_Dealer_Compulsion_Discount() throws InterruptedException{
			
		 long expects9=alto12+spresso12+CELERIO12+WAGONR12+SWIFT12+DZIRE12+BREZZA12+ERTIGA12+ECO12+CARRY12 ;
		 Assert.assertEquals(expects9,  DC1  );
		  }
	//.......................................................................................................		
		@Test
		 public  void  TOTAL_Discount() throws InterruptedException{
			
		 long expects9=alto13+spresso13+CELERIO13+WAGONR13+SWIFT13+DZIRE13+BREZZA13+ERTIGA13+ECO13+CARRY13 ;
		 Assert.assertEquals(expects9,  TS1   );
		 
		 }
//.......................................................................................................		
			@Test
		 public  void  Margin_Per_Cars () throws InterruptedException{
				
				double expectedValue222 = MarginAmt/ RETAIL1; ;	// Margin/cars
				long roundedResults_MARGIN = Math.round(expectedValue222);
				Assert.assertEquals(roundedResults_MARGIN,  margin_cars14);				
		 }
//..............................................................................................
			@Test
			 public  void  DRF_Per_Cars () throws InterruptedException{	
				
					double expectedValue223 = DRFAmountss1/ RETAIL1; ;	// DRF/CArs
					long roundedResults_DRF = Math.round(expectedValue223);
					Assert.assertEquals(roundedResults_DRF,    drf_cars);				
			 }	
	//..............................................................................................
			@Test
			 public  void  Discount_Per_Cars () throws InterruptedException{
				
					double expectedValue224 = totalDiscount1/ RETAIL1; ;	// DRF/CArs
					long roundedResults_DRF = Math.round(expectedValue224);
					Assert.assertEquals(roundedResults_DRF,    TOTAL_Discount_cars);	
					
			
			
			
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
}	
			@AfterClass
		    public void tearDown () {	
		  		 driver.quit();
		    }		
}
			
			
		   
		
		
			
			
			
		
		
		
	
	
