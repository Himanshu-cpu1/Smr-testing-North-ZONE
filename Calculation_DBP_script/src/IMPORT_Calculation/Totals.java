package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Totals {
	static void total(WebDriver driver) {
		
		//  1. Find The Total path OF OPENING STOCK * QUANTITY
		
		   WebElement QUANTITY1= driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")); // Quantity (No.s)
		 		 
	       WebElement T1= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
	       WebElement T2= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
	       WebElement T3= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
	       WebElement T4= driver.findElement(By.xpath("(//*[@type=\"number\"])[49]"));
	       WebElement T5= driver.findElement(By.xpath("(//*[@type=\"number\"])[65]"));
	       WebElement T6= driver.findElement(By.xpath("(//*[@type=\"number\"])[81]"));
	       WebElement T7= driver.findElement(By.xpath("(//*[@type=\"number\"])[97]"));
	       WebElement T8= driver.findElement(By.xpath("(//*[@type=\"number\"])[113]"));
	       WebElement T9= driver.findElement(By.xpath("(//*[@type=\"number\"])[129]"));
	       WebElement T10= driver.findElement(By.xpath("(//*[@type=\"number\"])[145]"));
	   //...........................................................................................
	       // Convert longo longegers
	       
	       long openingQty1 = Long.parseLong(QUANTITY1.getAttribute("value")); // Quantity (No.s)
	       
	       long Q2 = Long.parseLong(T1.getAttribute("value"));
	       long Q3 = Long.parseLong(T2.getAttribute("value"));
	       long Q4 = Long.parseLong(T3.getAttribute("value"));
	       long Q5 = Long.parseLong(T4.getAttribute("value"));
	       long Q6 = Long.parseLong(T5.getAttribute("value"));
	       long Q7 = Long.parseLong(T6.getAttribute("value"));
	       long Q8 = Long.parseLong(T7.getAttribute("value"));
	       long Q9 = Long.parseLong(T8.getAttribute("value"));
	       long Q10 = Long.parseLong(T9.getAttribute("value"));
	       long Q11 = Long.parseLong(T10.getAttribute("value"));
	       
	       //  Find the all values of Openeing stocks QTY by putting conditions
	       
	       long expected1= Q2+Q3+Q4+Q5+Q6+Q7+Q8+Q9+Q10+Q11;  // OPENEING STOCKS
	        if (openingQty1 == expected1 ) {
		        	
				  System.out.println("CALCULATION of TOTAL Opening stock QTY is VALID  =" + openingQty1 );
											                            
			       } else {
		 	System.out.println("CALCULATION of TOTAL Opening stock QTY is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + openingQty1 );			        
					 }
	       		 
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	       //2.       Find The Total path OF OPENING STOCK * AMOUNT
	       
	       WebElement AMOUNT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")); // Quantity (No.s)
	 		 
	       WebElement A1= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
	       WebElement A2= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
	       WebElement A3= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
	       WebElement A4= driver.findElement(By.xpath("(//*[@type=\"number\"])[50]"));
	       WebElement A5= driver.findElement(By.xpath("(//*[@type=\"number\"])[66]"));
	       WebElement A6= driver.findElement(By.xpath("(//*[@type=\"number\"])[82]"));
	       WebElement A7= driver.findElement(By.xpath("(//*[@type=\"number\"])[98]"));
	       WebElement A8= driver.findElement(By.xpath("(//*[@type=\"number\"])[114]"));
	       WebElement A9= driver.findElement(By.xpath("(//*[@type=\"number\"])[130]"));
	       WebElement A10= driver.findElement(By.xpath("(//*[@type=\"number\"])[146]"));
	   //...........................................................................................
	       // Convert longo longegers
	       
	       long  a1 = Long.parseLong(AMOUNT1.getAttribute("value"));
	       
	       long Amount1 = Long.parseLong(A1.getAttribute("value"));  //  Amount (Rs.)	       
	       long Amount2 = Long.parseLong(A2.getAttribute("value"));
	       long Amount3 = Long.parseLong(A3.getAttribute("value"));
	       long Amount4 = Long.parseLong(A4.getAttribute("value"));
	       long Amount5 = Long.parseLong(A5.getAttribute("value"));
	       long Amount6 = Long.parseLong(A6.getAttribute("value"));
	       long Amount7 = Long.parseLong(A7.getAttribute("value"));
	       long Amount8 = Long.parseLong(A8.getAttribute("value"));
	       long Amount9 = Long.parseLong(A9.getAttribute("value"));
	       long Amount10 = Long.parseLong(A10.getAttribute("value"));
	       
	       //  //  Find the all values of Openeing stocks AMOUNT by putting conditions
	       long expected2=Amount1+Amount2+Amount3+Amount4+Amount5+Amount6+Amount7+Amount8+Amount9+Amount10 ;  // OPENING STOCKS
	        if (a1 == expected2 ) {
		        	
				  System.out.println("CALCULATION of TOTAL Opening stock AMOUNT is VALID  =" + a1 );
											                            
			       } else {
		 	System.out.println("CALCULATION of TOTAL Opening stock AMOUNT is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +       a1 );			        
					 }
	       
	      
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	        
	    // 3.     Find The Total path OF WHOLESALE * Quantity (No.s)
	       
	       WebElement wholesaleQTY1= driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")); // WHOLESALE Quantity (No.s)
	 		 
	       WebElement QTY1= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
	       WebElement QTY2= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
	       WebElement QTY3= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
	       WebElement QTY4= driver.findElement(By.xpath("(//*[@type=\"number\"])[51]"));
	       WebElement QTY5= driver.findElement(By.xpath("(//*[@type=\"number\"])[67]"));
	       WebElement QTY6= driver.findElement(By.xpath("(//*[@type=\"number\"])[83]"));
	       WebElement QTY7= driver.findElement(By.xpath("(//*[@type=\"number\"])[99]"));
	       WebElement QTY8= driver.findElement(By.xpath("(//*[@type=\"number\"])[115]"));
	       WebElement QTY9= driver.findElement(By.xpath("(//*[@type=\"number\"])[131]"));
	       WebElement QTY10= driver.findElement(By.xpath("(//*[@type=\"number\"])[147]"));
	  //...........................................................................................
	       // Convert longo longegers
	       
	       long  W1 = Long.parseLong(wholesaleQTY1.getAttribute("value"));
	       
	       long qty1 = Long.parseLong(QTY1.getAttribute("value"));  //  Amount (Rs.)	       
	       long qty2 = Long.parseLong(QTY2.getAttribute("value"));
	       long qty3 = Long.parseLong(QTY3.getAttribute("value"));
	       long qty4 = Long.parseLong(QTY4.getAttribute("value"));
	       long qty5 = Long.parseLong(QTY5.getAttribute("value"));
	       long qty6 = Long.parseLong(QTY6.getAttribute("value"));
	       long qty7 = Long.parseLong(QTY7.getAttribute("value"));
	       long qty8 = Long.parseLong(QTY8.getAttribute("value"));
	       long qty9 = Long.parseLong(QTY9.getAttribute("value"));
	       long qty10 = Long.parseLong(QTY10.getAttribute("value"));
	       
//  Find the all values of Openeing stocks AMOUNT by putting conditions
	       long expected3=qty1+qty2+qty3+qty4+qty5+qty6+qty7+qty8+qty9+qty10 ;  // OPENING STOCKS
	        if (W1 == expected3 ) {
		        	
				  System.out.println("CALCULATION of TOTAL WHOLESALE * Quantity (No.s) is VALID  =" + W1);
											                            
			       } else {
		 	System.out.println("CALCULATION of TOTAL WHOLESALE * Quantity (No.s) is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +       W1 );			        
					 }
	                                                      
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 4.                Find The Total path OF WHOLESALE * AMOUNT

         WebElement wholesaleAMT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")); // WHOLESALE Quantity (No.s)

           WebElement AMNT1= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
           WebElement AMNT2= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
           WebElement AMNT3= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
            WebElement AMNT4= driver.findElement(By.xpath("(//*[@type=\"number\"])[52]"));
            WebElement AMNT5= driver.findElement(By.xpath("(//*[@type=\"number\"])[68]"));
           WebElement AMNT6= driver.findElement(By.xpath("(//*[@type=\"number\"])[84]"));
           WebElement AMNT7= driver.findElement(By.xpath("(//*[@type=\"number\"])[100]"));
           WebElement AMNT8= driver.findElement(By.xpath("(//*[@type=\"number\"])[116]"));
           WebElement AMNT9= driver.findElement(By.xpath("(//*[@type=\"number\"])[132]"));
           WebElement AMNT10= driver.findElement(By.xpath("(//*[@type=\"number\"])[148]"));
//...........................................................................................
         // Convert longo longegers

      long WHOLESALES_amount1 = Long.parseLong(wholesaleAMT1.getAttribute("value"));

      long WA1 = Long.parseLong(AMNT1.getAttribute("value"));  //  Amount (Rs.)	       
      long WA2 = Long.parseLong(AMNT2.getAttribute("value"));
      long WA3 = Long.parseLong(AMNT3.getAttribute("value"));
      long WA4 = Long.parseLong(AMNT4.getAttribute("value"));
      long WA5 = Long.parseLong(AMNT5.getAttribute("value"));
      long WA6 = Long.parseLong(AMNT6.getAttribute("value"));
      long WA7 = Long.parseLong(AMNT7.getAttribute("value"));
      long WA8 = Long.parseLong(AMNT8.getAttribute("value"));
      long WA9 = Long.parseLong(AMNT9.getAttribute("value"));
      long WA10 = Long.parseLong(AMNT10.getAttribute("value"));

//  Find the all values of WHOLESALE AMOUNT by putting conditions
        long expected4=WA1+WA2+WA3+WA4+WA5+WA6+WA7+WA8+WA9+WA10 ;  // wholesale amount
       if (WHOLESALES_amount1 == expected4 ) {

         System.out.println("CALCULATION of TOTAL WHOLESALE * Amount (Rs.) is VALID  =" +  WHOLESALES_amount1);

            } else {
            System.out.println("CALCULATION of TOTAL WHOLESALE *Amount (Rs.) is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +       WHOLESALES_amount1 );			        
            }
       
///////////////////////////////////////////////////////////////////////////////////////////////////////////
                    // 5.   Find The Total path OF CLOSING STOCK * * QUANTITY

WebElement CLOSINGstock_Qty1= driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")); // WHOLESALE Quantity (No.s)

WebElement closing1= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
WebElement closing2= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
WebElement closing3= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
WebElement closing4= driver.findElement(By.xpath("(//*[@type=\"number\"])[53]"));
WebElement closing5= driver.findElement(By.xpath("(//*[@type=\"number\"])[69]"));
WebElement closing6= driver.findElement(By.xpath("(//*[@type=\"number\"])[85]"));
WebElement closing7= driver.findElement(By.xpath("(//*[@type=\"number\"])[101]"));
WebElement closing8= driver.findElement(By.xpath("(//*[@type=\"number\"])[117]"));
WebElement closing9= driver.findElement(By.xpath("(//*[@type=\"number\"])[133]"));
WebElement closing10= driver.findElement(By.xpath("(//*[@type=\"number\"])[149]"));
//...........................................................................................
//Convert longo longegers

long  closingSTOCK_qty1 = Long.parseLong(CLOSINGstock_Qty1.getAttribute("value"));

long CA1 = Long.parseLong(closing1.getAttribute("value"));  //  qty	       
long CA2 = Long.parseLong(closing2.getAttribute("value"));
long CA3 = Long.parseLong(closing3.getAttribute("value"));
long CA4 = Long.parseLong(closing4.getAttribute("value"));
long CA5 = Long.parseLong(closing5.getAttribute("value"));
long CA6 = Long.parseLong(closing6.getAttribute("value"));
long CA7 = Long.parseLong(closing7.getAttribute("value"));
long CA8 = Long.parseLong(closing8.getAttribute("value"));
long CA9 = Long.parseLong(closing9.getAttribute("value"));
long CA10 = Long.parseLong(closing10.getAttribute("value"));

//Find the all values of WHOLESALE AMOUNT by putting conditions
long expected5=CA1+CA2+CA3+CA4+CA5+CA6+CA7+CA8+CA9+CA10 ;  // ClosingStock qty
if (closingSTOCK_qty1 == expected5 ) {

System.out.println("CALCULATION of TOTAL ClosingStock * Qty (Rs.) is VALID  =" + closingSTOCK_qty1);

} else {
System.out.println("CALCULATION of TOTAL ClosingStock *Qty (Rs.) is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +       closingSTOCK_qty1 );			        
}
            
///////////////////////////////////////////////////////////////////////////////////////////////////////////
         // 6.          Find The Total path OF CLOSING STOCK * * AMOUNT

WebElement CLOSINGstock_AMOUNTS1= driver.findElement(By.xpath("(//*[@type=\"text\"])[6]")); // CLOSING STOCK AMOUNT 

WebElement closingamount1= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
WebElement closingamount2= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
WebElement closingamount3= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
WebElement closingamount4= driver.findElement(By.xpath("(//*[@type=\"number\"])[54]"));
WebElement closingamount5= driver.findElement(By.xpath("(//*[@type=\"number\"])[70]"));
WebElement closingamount6= driver.findElement(By.xpath("(//*[@type=\"number\"])[86]"));
WebElement closingamount7= driver.findElement(By.xpath("(//*[@type=\"number\"])[102]"));
WebElement closingamount8= driver.findElement(By.xpath("(//*[@type=\"number\"])[118]"));
WebElement closingamount9= driver.findElement(By.xpath("(//*[@type=\"number\"])[134]"));
WebElement closingamount10= driver.findElement(By.xpath("(//*[@type=\"number\"])[150]"));
//...........................................................................................
//Convert into long

long  closingSTOCK_amt1 = Long.parseLong(CLOSINGstock_AMOUNTS1.getAttribute("value"));

long CSA1 = Long.parseLong(closingamount1.getAttribute("value"));  // Closing Stock  sAMOUNT       
long CSA2 = Long.parseLong(closingamount2.getAttribute("value"));
long CSA3 = Long.parseLong(closingamount3.getAttribute("value"));
long CSA4 = Long.parseLong(closingamount4.getAttribute("value"));
long CSA5 = Long.parseLong(closingamount5.getAttribute("value"));
long CSA6 = Long.parseLong(closingamount6.getAttribute("value"));
long CSA7 = Long.parseLong(closingamount7.getAttribute("value"));
long CSA8 = Long.parseLong(closingamount8.getAttribute("value"));
long CSA9 = Long.parseLong(closingamount9.getAttribute("value"));
long CSA10 = Long.parseLong(closingamount10.getAttribute("value"));

//Find the all values of ClosingStock qty by putting conditions

long expected6=CSA1+CSA2+CSA3+CSA4+CSA5+CSA6+CSA7+CSA8+CSA9+CSA10 ;  // ClosingStock qty
if (closingSTOCK_amt1 == expected6 ) {

System.out.println("CALCULATION of TOTAL ClosingStock * AMOUNT is VALID  =" + closingSTOCK_amt1);

} else {
System.out.println("CALCULATION of TOTAL ClosingStock  AMOUNT (Rs.) is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +       closingSTOCK_amt1 );			        
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

                    // 7.     Find The Total path OF RETAIL SALES QTY

WebElement RetailSales_Qty1= driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")); // CLOSING STOCK AMOUNT 

WebElement Reatails1= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
WebElement Reatails2= driver.findElement(By.xpath("(//*[@type=\"number\"])[23]"));
WebElement Reatails3= driver.findElement(By.xpath("(//*[@type=\"number\"])[39]"));
WebElement Reatails4= driver.findElement(By.xpath("(//*[@type=\"number\"])[55]"));
WebElement Reatails5= driver.findElement(By.xpath("(//*[@type=\"number\"])[71]"));
WebElement Reatails6= driver.findElement(By.xpath("(//*[@type=\"number\"])[87]"));
WebElement Reatails7= driver.findElement(By.xpath("(//*[@type=\"number\"])[103]"));
WebElement Reatails8= driver.findElement(By.xpath("(//*[@type=\"number\"])[119]"));
WebElement Reatails9= driver.findElement(By.xpath("(//*[@type=\"number\"])[135]"));
WebElement Reatails10= driver.findElement(By.xpath("(//*[@type=\"number\"])[151]"));
//...........................................................................................
//Convert longo longegers

long  Reatil1 = Long.parseLong(RetailSales_Qty1.getAttribute("value"));

long RS1 = Long.parseLong(Reatails1.getAttribute("value"));  // ReatailSales Qty.      
long RS2 = Long.parseLong(Reatails2.getAttribute("value"));
long RS3 = Long.parseLong(Reatails3.getAttribute("value"));
long RS4 = Long.parseLong(Reatails4.getAttribute("value"));
long RS5 = Long.parseLong(Reatails5.getAttribute("value"));
long RS6 = Long.parseLong(Reatails6.getAttribute("value"));
long RS7 = Long.parseLong(Reatails7.getAttribute("value"));
long RS8 = Long.parseLong(Reatails8.getAttribute("value"));
long RS9 = Long.parseLong(Reatails9.getAttribute("value"));
long RS10 = Long.parseLong(Reatails10.getAttribute("value"));

//Find the all values of ReatailSales Qty. by putting conditions

long expected7=RS1+RS2+RS3+RS4+RS5+RS6+RS7+RS8+RS9+RS10;  // total calculations of ReatailSales Qty
if (Reatil1== expected7 ) {

System.out.println("CALCULATION of TOTAL ReatailSales Qty is VALID  =" +  Reatil1);

} else {
System.out.println("CALCULATION of TOTAL ReatailSales Qty is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +        Reatil1 );			        
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

// 8.     Find The Total path OF RETAIL SALES AMOUNT

WebElement RetailSales_AMOUNT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[8]")); // TOTAL RETAIL SALES AMOUNT 

WebElement ReatailsS1= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
WebElement ReatailsS2= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
WebElement ReatailsS3= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
WebElement ReatailsS4= driver.findElement(By.xpath("(//*[@type=\"number\"])[56]"));
WebElement ReatailsS5= driver.findElement(By.xpath("(//*[@type=\"number\"])[72]"));
WebElement ReatailsS6= driver.findElement(By.xpath("(//*[@type=\"number\"])[88]"));
WebElement ReatailsS7= driver.findElement(By.xpath("(//*[@type=\"number\"])[104]"));
WebElement ReatailsS8= driver.findElement(By.xpath("(//*[@type=\"number\"])[120]"));
WebElement ReatailsS9= driver.findElement(By.xpath("(//*[@type=\"number\"])[136]"));
WebElement ReatailsS10= driver.findElement(By.xpath("(//*[@type=\"number\"])[152]"));
//...........................................................................................
//Convert longo longegers

long  ReatilSS1 = Long.parseLong(RetailSales_AMOUNT1.getAttribute("value"));

long RSSS1 = Long.parseLong(ReatailsS1.getAttribute("value"));  // RETAIL SALES AMOUNT      
long RSSS2 = Long.parseLong(ReatailsS2.getAttribute("value"));
long RSSS3 = Long.parseLong(ReatailsS3.getAttribute("value"));
long RSSS4 = Long.parseLong(ReatailsS4.getAttribute("value"));
long RSSS5 = Long.parseLong(ReatailsS5.getAttribute("value"));
long RSSS6 = Long.parseLong(ReatailsS6.getAttribute("value"));
long RSSS7 = Long.parseLong(ReatailsS7.getAttribute("value"));
long RSSS8 = Long.parseLong(ReatailsS8.getAttribute("value"));
long RSSS9 = Long.parseLong(ReatailsS9.getAttribute("value"));
long RSSS10 = Long.parseLong(ReatailsS10.getAttribute("value"));

//Find the all values of RETAIL SALES AMOUNT  by putting conditions

long expected8=RSSS1+RSSS2+RSSS3+RSSS4+RSSS5+RSSS6+RSSS7+RSSS8+RSSS9+RSSS10;  // total calculations of RETAIL SALES AMOUNT
if (ReatilSS1== expected8 ) {

System.out.println("CALCULATION of TOTAL RETAIL SALES AMOUNT is VALID  =" +  ReatilSS1);

} else {
System.out.println("CALCULATION of TOTAL  RETAIL SALES AMOUNT is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +        ReatilSS1 );			        
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

//  9.     Find The Total path OF MARGIN AMOUNT

WebElement MARGIN_AMOUNT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[9]")); // TOTAL MARGIN AMOUNT

WebElement MARGIN1= driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
WebElement MARGIN2= driver.findElement(By.xpath("(//*[@type=\"number\"])[25]"));
WebElement MARGIN3= driver.findElement(By.xpath("(//*[@type=\"number\"])[41]"));
WebElement MARGIN4= driver.findElement(By.xpath("(//*[@type=\"number\"])[57]"));
WebElement MARGIN5= driver.findElement(By.xpath("(//*[@type=\"number\"])[73]"));
WebElement MARGIN6= driver.findElement(By.xpath("(//*[@type=\"number\"])[89]"));
WebElement MARGIN7= driver.findElement(By.xpath("(//*[@type=\"number\"])[105]"));
WebElement MARGIN8= driver.findElement(By.xpath("(//*[@type=\"number\"])[121]"));
WebElement MARGIN9= driver.findElement(By.xpath("(//*[@type=\"number\"])[137]"));
WebElement MARGIN10= driver.findElement(By.xpath("(//*[@type=\"number\"])[153]"));
//...........................................................................................
                //Convert longo longegers

long  marginAmount1 = Long.parseLong(MARGIN_AMOUNT1.getAttribute("value"));

long MAA1 = Long.parseLong(MARGIN1.getAttribute("value"));  // marginAmount      
long MAA2 = Long.parseLong(MARGIN2.getAttribute("value"));
long MAA3 = Long.parseLong(MARGIN3.getAttribute("value"));
long MAA4 = Long.parseLong(MARGIN4.getAttribute("value"));
long MAA5 = Long.parseLong(MARGIN5.getAttribute("value"));
long MAA6 = Long.parseLong(MARGIN6.getAttribute("value"));
long MAA7 = Long.parseLong(MARGIN7.getAttribute("value"));
long MAA8 = Long.parseLong(MARGIN8.getAttribute("value"));
long MAA9 = Long.parseLong(MARGIN9.getAttribute("value"));
long MAA10 = Long.parseLong(MARGIN10.getAttribute("value"));

//Find the all values of MARGIN AMOUNT  by putting conditions

long expected9=MAA1+MAA2+MAA3+MAA4+MAA5+MAA6+MAA7+MAA8+MAA9+MAA10;  // Total calculations of marginAmount
if (marginAmount1== expected9 ) {

System.out.println("CALCULATION of TOTAL MARGIN AMOUNT is VALID  =" +  marginAmount1);

} else {
System.out.println("CALCULATION of TOTAL  MARGIN AMOUNT is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +        marginAmount1 );			        
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

// 10.     Find The Total path OF DRF ~ AMOUNT

WebElement  DRF_AMOUNT1= driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));   // TOTAL DRF ~ AMOUNT

WebElement DRF_1= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
WebElement DRF_2= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
WebElement DRF_3= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
WebElement DRF_4= driver.findElement(By.xpath("(//*[@type=\"number\"])[58]"));
WebElement DRF_5= driver.findElement(By.xpath("(//*[@type=\"number\"])[74]"));
WebElement DRF_6= driver.findElement(By.xpath("(//*[@type=\"number\"])[90]"));
WebElement DRF_7= driver.findElement(By.xpath("(//*[@type=\"number\"])[106]"));
WebElement DRF_8= driver.findElement(By.xpath("(//*[@type=\"number\"])[122]"));
WebElement DRF_9= driver.findElement(By.xpath("(//*[@type=\"number\"])[138]"));
WebElement DRF_10= driver.findElement(By.xpath("(//*[@type=\"number\"])[154]"));
//...........................................................................................
//Convert longo longegers

long  DRFAmount1 = Long.parseLong(DRF_AMOUNT1.getAttribute("value"));

long D1 = Long.parseLong(DRF_1.getAttribute("value"));  // DRF Amount      
long D2 = Long.parseLong(DRF_2.getAttribute("value"));
long D3 = Long.parseLong(DRF_3.getAttribute("value"));
long D4 = Long.parseLong(DRF_4.getAttribute("value"));
long D5 = Long.parseLong(DRF_5.getAttribute("value"));
long D6 = Long.parseLong(DRF_6.getAttribute("value"));
long D7 = Long.parseLong(DRF_7.getAttribute("value"));
long D8 = Long.parseLong(DRF_8.getAttribute("value"));
long D9 = Long.parseLong(DRF_9.getAttribute("value"));
long D10 = Long.parseLong(DRF_10.getAttribute("value"));

//Find the all values of DRF ~ AMOUNT  by putting conditions

long expected10=D1+D2+D3+D4+D5+D6+D7+D8+D9+D10;  // Total DRF Amount
if (DRFAmount1== expected10 ) {

System.out.println("CALCULATION of TOTAL DRF ~ AMOUNT is VALID  =" +  DRFAmount1);

} else {
System.out.println("CALCULATION of TOTAL  DRF ~ AMOUNT is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +        DRFAmount1 );			        
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

// 11.     Find The  path OF DISCOUNT ^  [Consumer Offer +ISL/RMK]

WebElement  Discount1= driver.findElement(By.xpath("(//*[@type=\"text\"])[11]"));   // TOTAL  DISCOUNT ^  [Consumer Offer +ISL/RMK]

WebElement Consumer1= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
WebElement Consumer2= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
WebElement Consumer3= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
WebElement Consumer4= driver.findElement(By.xpath("(//*[@type=\"number\"])[59]"));
WebElement Consumer5= driver.findElement(By.xpath("(//*[@type=\"number\"])[75]"));
WebElement Consumer6= driver.findElement(By.xpath("(//*[@type=\"number\"])[91]"));
WebElement Consumer7= driver.findElement(By.xpath("(//*[@type=\"number\"])[107]"));
WebElement Consumer8= driver.findElement(By.xpath("(//*[@type=\"number\"])[123]"));
WebElement Consumer9= driver.findElement(By.xpath("(//*[@type=\"number\"])[139]"));
WebElement Consumer10= driver.findElement(By.xpath("(//*[@type=\"number\"])[155]"));
//...........................................................................................
//Convert longo longegers

long  DISCOUNT_CONSUMER1 = Long.parseLong(Discount1.getAttribute("value"));

long DIS1 = Long.parseLong(Consumer1.getAttribute("value"));  // DISCOUNT ^  [Consumer Offer +ISL/RMK]      
long DIS2 = Long.parseLong(Consumer2.getAttribute("value"));
long DIS3 = Long.parseLong(Consumer3.getAttribute("value"));
long DIS4 = Long.parseLong(Consumer4.getAttribute("value"));
long DIS5 = Long.parseLong(Consumer5.getAttribute("value"));
long DIS6 = Long.parseLong(Consumer6.getAttribute("value"));
long DIS7 = Long.parseLong(Consumer7.getAttribute("value"));
long DIS8 = Long.parseLong(Consumer8.getAttribute("value"));
long DIS9 = Long.parseLong(Consumer9.getAttribute("value"));
long DIS10 = Long.parseLong(Consumer10.getAttribute("value"));

//Find the all values of DRF ~ AMOUNT  by putting conditions

long expected11=DIS1+DIS2+DIS3+DIS4+DIS5+DIS6+DIS7+DIS8+DIS9+DIS10;  // Total DISCOUNT ^  [Consumer Offer /ISL/RMK]
if (DISCOUNT_CONSUMER1== expected11 ) {

System.out.println("CALCULATION of TOTAL DISCOUNT ^  [Consumer Offer /ISL/RMK]  is VALID  =" + DISCOUNT_CONSUMER1);

} else {
System.out.println("CALCULATION of TOTAL DISCOUNT ^  [Consumer Offer /ISL/RMK] is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +        DISCOUNT_CONSUMER1 );			        
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

//12.     Find The  path OF Dealer Compulsion Discount (Rs.)

WebElement  Compulsion_discount1= driver.findElement(By.xpath("(//*[@type=\"text\"])[12]"));   // TOTAL  Dealer Compulsion Discount (Rs.)

WebElement Cd1= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
WebElement Cd2= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
WebElement Cd3= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
WebElement Cd4= driver.findElement(By.xpath("(//*[@type=\"number\"])[60]"));
WebElement Cd5= driver.findElement(By.xpath("(//*[@type=\"number\"])[76]"));
WebElement Cd6= driver.findElement(By.xpath("(//*[@type=\"number\"])[92]"));
WebElement Cd7= driver.findElement(By.xpath("(//*[@type=\"number\"])[108]"));
WebElement Cd8= driver.findElement(By.xpath("(//*[@type=\"number\"])[124]"));
WebElement Cd9= driver.findElement(By.xpath("(//*[@type=\"number\"])[140]"));
WebElement Cd10= driver.findElement(By.xpath("(//*[@type=\"number\"])[156]"));

//...........................................................................................
//Convert longo longegers

long  DC1 = Long.parseLong(Compulsion_discount1.getAttribute("value")); // Total Dealer Compulsion Discount (Rs.) 

long DS1 = Long.parseLong(Cd1.getAttribute("value"));  //    
long DS2 = Long.parseLong(Cd2.getAttribute("value"));
long DS3 = Long.parseLong(Cd3.getAttribute("value"));
long DS4 = Long.parseLong(Cd4.getAttribute("value"));
long DS5 = Long.parseLong(Cd5.getAttribute("value"));
long DS6 = Long.parseLong(Cd6.getAttribute("value"));
long DS7 = Long.parseLong(Cd7.getAttribute("value"));
long DS8 = Long.parseLong(Cd8.getAttribute("value"));
long DS9 = Long.parseLong(Cd9.getAttribute("value"));
long DS10 = Long.parseLong(Cd10.getAttribute("value"));

//Find the all values of Dealer Compulsion Discount (Rs.)   by putting conditions

long expected12=DS1+DS2+DS3+DS4+DS5+DS6+DS7+DS8+DS9+DS10;  // Total Dealer Compulsion Discount (Rs.) 
if (DC1== expected12 ) {

System.out.println("CALCULATION of TOTAL Dealer Compulsion Discount (Rs.) is VALID  =" + DC1);

} else {
System.out.println("CALCULATION of TOTAL Dealer Compulsion Discount (Rs.) is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +        DC1 );			        
}         
	        

///////////////////////////////////////////////////////////////////////////////////////////////////////////

//13.     Find The  path OF Total Discount (Rs.)

WebElement  TD1= driver.findElement(By.xpath("(//*[@type=\"text\"])[13]"));   // TOTAL [ Total Discount (Rs.)]

WebElement TDS1= driver.findElement(By.xpath("(//*[@type=\"number\"])[13]"));
WebElement TDS2= driver.findElement(By.xpath("(//*[@type=\"number\"])[29]"));
WebElement TDS3= driver.findElement(By.xpath("(//*[@type=\"number\"])[45]"));
WebElement TDS4= driver.findElement(By.xpath("(//*[@type=\"number\"])[61]"));
WebElement TDS5= driver.findElement(By.xpath("(//*[@type=\"number\"])[77]"));
WebElement TDS6= driver.findElement(By.xpath("(//*[@type=\"number\"])[93]"));
WebElement TDS7= driver.findElement(By.xpath("(//*[@type=\"number\"])[109]"));
WebElement TDS8= driver.findElement(By.xpath("(//*[@type=\"number\"])[125]"));
WebElement TDS9= driver.findElement(By.xpath("(//*[@type=\"number\"])[141]"));
WebElement TDS10= driver.findElement(By.xpath("(//*[@type=\"number\"])[157]"));

//...........................................................................................
//Convert longo longegers

long  TS1 = Long.parseLong(TD1.getAttribute("value")); // TOTAL [ Total Discount (Rs.)]

long td1 = Long.parseLong(TDS1.getAttribute("value"));  //    
long td2 = Long.parseLong(TDS2.getAttribute("value"));
long td3 = Long.parseLong(TDS3.getAttribute("value"));
long td4 = Long.parseLong(TDS4.getAttribute("value"));
long td5 = Long.parseLong(TDS5.getAttribute("value"));
long td6 = Long.parseLong(TDS6.getAttribute("value"));
long td7 = Long.parseLong(TDS7.getAttribute("value"));
long td8 = Long.parseLong(TDS8.getAttribute("value"));
long td9 = Long.parseLong(TDS9.getAttribute("value"));
long td10 = Long.parseLong(TDS10.getAttribute("value"));

//Find the all values of [ Total Discount (Rs.)]   by putting conditions

long expected13=td1+td2+td3+td4+td5+td6+td7+td8+td9+td10;  //  TOTAL [ Total Discount (Rs.)] 
if (TS1== expected13 ) {

System.out.println("CALCULATION of TOTAL [ Total Discount (Rs.)] is VALID  =" + TS1);

} else {
System.out.println("CALCULATION of TOTAL [ Total Discount (Rs.)] is  >>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>       INVALID  = " +        TS1 );			        
}    

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 14.                           PATH OF MARGIN/CARS
WebElement  marginsCars1= driver.findElement(By.xpath("(//*[@type=\"text\"])[14]"));  // path of Total Margin/Car (Rs.)	
long  margin_cars14 = Long.parseLong( marginsCars1.getAttribute("value"));  // convert longo longegers

double  MARGINS_AMOUNT1 = Double.parseDouble(MARGIN_AMOUNT1.getAttribute("value")); // PATH OF MARGIN amount
double  Reatilss1 = Double.parseDouble(RetailSales_Qty1.getAttribute("value"));  // path of Reatails Qty


double expectedValue222 =MARGINS_AMOUNT1/Reatilss1 ;	// Total ( Margin amount / Retail sales (Rs.))
long roundedResults_MARGIN = Math.round(expectedValue222);
			
if ( margin_cars14== roundedResults_MARGIN ) {
	
  System.out.println("CALCULATION TOTAL Margin/Car (Rs.)is       VALID  =" + margin_cars14 );
							                            
   } else {
   System.out.println("CALCULATION TOTAL Margin/Car (Rs.)is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + margin_cars14 );			        
	 }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   15.                           PATH OF DRF/Car (Rs.)
WebElement  drfCARS1= driver.findElement(By.xpath("(//*[@type=\"text\"])[15]"));  // path of DRF/Car (Rs.)	
long  DRFS_cars = Long.parseLong( drfCARS1.getAttribute("value"));  // convert longo longegers
//..................................................................................................................
double  DRFAmountss1 = Double.parseDouble(DRF_AMOUNT1.getAttribute("value")); // Path of total DRF/cars and it will come from DRF/cars


double expectedValue223 =DRFAmountss1 /Reatilss1 ;	// TOTAL (DRF-amount/ Retail-sales)
long roundedResults_DRF = Math.round(expectedValue223);

if ( DRFS_cars== roundedResults_DRF ) {

System.out.println("CALCULATION TOTAL DRF/Car (Rs.)is       VALID  =" + DRFS_cars );

} else {
System.out.println("CALCULATION TOTAL DRF/Car (Rs.)is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + DRFS_cars );			        
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   16.                           PATH OF Discount/Car (Rs.)
WebElement  discountCARS1= driver.findElement(By.xpath("(//*[@type=\"text\"])[16]"));  // path of Discount/Car (Rs.	
long  TOTAL_Discount_cars = Long.parseLong( discountCARS1.getAttribute("value"));  // convert longo longegers
//..................................................................................................................
           
double  T_discount1 = Double.parseDouble(TD1.getAttribute("value")); // TOTAL [ Total Discount (Rs.)]

//...........................................................................................................
// Then we divide the (Total discount/ Retail-sales)
double expectedValue224 =T_discount1 /Reatilss1 ;	// TOTAL (Total discount/ Retail-sales)
long roundedResults_discount1 = Math.round(expectedValue224);

if ( TOTAL_Discount_cars== roundedResults_discount1 ) {

System.out.println("CALCULATION TOTAL Discount/Car (Rs.)       VALID  =" + TOTAL_Discount_cars );

} else {
System.out.println("CALCULATION TOTAL Discount/Car (Rs.) is   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  INVALID  = " + TOTAL_Discount_cars );			        
}

System.out.println(".............E..N..D....................................................");
	}

}
