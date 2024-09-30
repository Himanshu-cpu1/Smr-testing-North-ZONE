package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class STOCKS {
	
	static void stOcks(WebDriver driver) throws InterruptedException {
		
		
		
		//Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[2]")).click();        
				Thread.sleep(3000);
				
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/stock";


String actual_class = driver.getCurrentUrl();

if(expected_class.equals(actual_class)) {
	System.out.println("login succesfull  =    (valid URL)  "        + actual_class );

	}
	else {
	System.out.println("login fail   =    ( InValid  URL  )   >>>  "   + actual_class);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);	
// clear the data 

		        
		        Thread.sleep(3000);        
		        driver.findElement(By.xpath("(//*[@type=\"buttton\"])[1]")).click();        
		        Thread.sleep(2000);        
		        driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();        
		        Thread.sleep(2000);
		        
		        WebElement AltoK10_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		        WebElement AltoK10_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		        WebElement AltoK10_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		        WebElement AltoK10_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		        WebElement AltoK10_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		        WebElement AltoK10_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		        
		        WebElement AltoK10_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		        
		        WebElement AltoK10_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		        WebElement AltoK10_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
		        WebElement AltoK10_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
//...........................................................................................................		        
		        WebElement SPresso_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[17]"));
		        WebElement SPresso_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[18]"));
		        WebElement SPresso_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[19]"));
		        WebElement SPresso_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[20]"));
		        WebElement SPresso_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[21]"));
		        WebElement SPresso_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[22]"));
		        
		        WebElement SPresso_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[24]"));
		        
		        WebElement SPresso_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[26]"));
		        WebElement SPresso_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[27]"));
		        WebElement SPresso_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[28]"));
//...........................................................................................................		        
		        WebElement Celerio_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[33]"));
		        WebElement Celerio_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[34]"));
		        WebElement Celerio_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[35]"));
		        WebElement Celerio_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[36]"));
		        WebElement Celerio_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[37]"));
		        WebElement Celerio_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[38]"));
		        
		        WebElement Celerio_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[40]"));
		        
		        WebElement Celerio_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[42]"));
		        WebElement Celerio_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[43]"));
		        WebElement Celerio_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[44]"));
//..........................................................................................................		        
		        WebElement WagonR_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[49]"));
		        WebElement WagonR_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[50]"));
		        WebElement WagonR_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[51]"));
		        WebElement WagonR_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[52]"));
		        WebElement WagonR_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[53]"));
		        WebElement WagonR_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[54]"));
		        
		        WebElement WagonR_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[56]"));
		        
		        WebElement WagonR_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[58]"));
		        WebElement WagonR_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[59]"));
		        WebElement WagonR_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[60]"));
//.........,..................................................,,,,,,,,,,,,,................................		        
		        WebElement Swift_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[65]"));
		        WebElement Swift_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[66]"));
		        WebElement Swift_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[67]"));
		        WebElement Swift_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[68]"));
		        WebElement Swift_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[69]"));
		        WebElement Swift_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[70]"));
		        
		        WebElement Swift_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[72]"));
		        
		        WebElement Swift_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[74]"));
		        WebElement Swift_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[75]"));
		        WebElement Swift_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[76]"));
//.........................................................................................................		        
		        WebElement Dzire_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[81]"));
		        WebElement Dzire_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[82]"));
		        WebElement Dzire_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[83]"));
		        WebElement Dzire_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[84]"));
		        WebElement Dzire_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[85]"));
		        WebElement Dzire_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[86]"));
		        
		        WebElement Dzire_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[88]"));
		        
		        WebElement Dzire_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[90]"));
		        WebElement Dzire_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[91]"));
		        WebElement Dzire_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[92]"));
//............................................................................................................		        
		        WebElement Brezza_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[97]"));
		        WebElement Brezza_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[98]"));
		        WebElement Brezza_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[99]"));
		        WebElement Brezza_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[100]"));
		        WebElement Brezza_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[101]"));
		        WebElement Brezza_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[102]"));
		        
		        WebElement Brezza_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[104]"));
		        
		        WebElement Brezza_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[106]"));
		        WebElement Brezza_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[107]"));
		        WebElement Brezza_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[108]"));
//............................................................................................................		        
		        WebElement Ertiga_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[113]"));
		        WebElement Ertiga_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[114]"));
		        WebElement Ertiga_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[115]"));
		        WebElement Ertiga_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[116]"));
		        WebElement Ertiga_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[117]"));
		        WebElement Ertiga_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[118]"));
		        
		        WebElement Ertiga_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[120]"));
		        
		        WebElement Ertiga_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[122]"));
		        WebElement Ertiga_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[123]"));
		        WebElement Ertiga_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[124]"));
//......................................................................................................		        
		        WebElement Eeco_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[129]"));
		        WebElement Eeco_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[130]"));
		        WebElement Eeco_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[131]"));
		        WebElement Eeco_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[132]"));
		        WebElement Eeco_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[133]"));
		        WebElement Eeco_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[134]"));
		        
		        WebElement Eeco_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[136]"));
		        
		        WebElement Eeco_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[138]"));
		        WebElement Eeco_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[139]"));
		        WebElement Eeco_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[140]"));
//.........................................................................................................		        
		        WebElement SCarry_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[145]"));
		        WebElement SCarry_OS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[146]"));
		        WebElement SCarry_WS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[147]"));
		        WebElement SCarry_WS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[148]"));
		        WebElement SCarry_CS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[149]"));
		        WebElement SCarry_CS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[150]"));
		        
		        WebElement SCarry_RS_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[152]"));
		        
		        WebElement SCarry_DRF_A= driver.findElement(By.xpath("(//*[@type=\"number\"])[154]"));
		        WebElement SCarry_Dis_Offer= driver.findElement(By.xpath("(//*[@type=\"number\"])[155]"));
		        WebElement SCarry_Dealer_Com= driver.findElement(By.xpath("(//*[@type=\"number\"])[156]"));
		        
		        
		        
		        
		        sendnumericvalue(AltoK10_OS_Q,"42");
		        sendnumericvalue(AltoK10_OS_A,"42442");
		        sendnumericvalue(AltoK10_WS_Q,"4224");
		        sendnumericvalue(AltoK10_WS_A,"10340");
		        sendnumericvalue(AltoK10_CS_Q,"4224");
		        sendnumericvalue(AltoK10_CS_A,"4242");
		        sendnumericvalue(AltoK10_RS_A,"4422");
		        sendnumericvalue(AltoK10_DRF_A,"5433");
		        sendnumericvalue(AltoK10_Dis_Offer,"3222");
		        sendnumericvalue(AltoK10_Dealer_Com,"4543");
		        sendnumericvalue(SPresso_OS_Q,"435");
		        sendnumericvalue(SPresso_OS_A,"435");
		        sendnumericvalue(SPresso_WS_Q,"534");
		        sendnumericvalue(SPresso_WS_A,"53");
		        sendnumericvalue(SPresso_CS_Q,"63346");
		        sendnumericvalue(SPresso_CS_A,"636");
		        sendnumericvalue(SPresso_RS_A,"5636");
		        sendnumericvalue(SPresso_DRF_A,"6363");
		        sendnumericvalue(SPresso_Dis_Offer,"3663");
		        sendnumericvalue(SPresso_Dealer_Com,"3636");
		        sendnumericvalue(Celerio_OS_Q,"6363");
		        sendnumericvalue(Celerio_OS_A,"36536");
		        sendnumericvalue(Celerio_WS_Q,"6533");
		        sendnumericvalue(Celerio_WS_A,"653343");
		        sendnumericvalue(Celerio_CS_Q,"6353");
		        sendnumericvalue(Celerio_CS_A,"6453");
		        sendnumericvalue(Celerio_RS_A,"6535");
		        sendnumericvalue(Celerio_DRF_A,"7575");
		        sendnumericvalue(Celerio_Dis_Offer,"7475");
		        sendnumericvalue(Celerio_Dealer_Com,"877");
		        sendnumericvalue(WagonR_OS_Q,"9878");
		        sendnumericvalue(WagonR_OS_A,"88787");
		        sendnumericvalue(WagonR_WS_Q,"988");
		        sendnumericvalue(WagonR_WS_A,"100000");
		        sendnumericvalue(WagonR_CS_Q,"10");
		        sendnumericvalue(WagonR_CS_A,"1000000");
		        sendnumericvalue(WagonR_RS_A,"100000");
		        sendnumericvalue(WagonR_DRF_A,"10000");
		        sendnumericvalue(WagonR_Dis_Offer,"1000");
		        sendnumericvalue(WagonR_Dealer_Com,"1000");
		        sendnumericvalue(Swift_OS_Q,"10");
		        sendnumericvalue(Swift_OS_A,"9888");
		        sendnumericvalue(Swift_WS_Q,"896768");
		        sendnumericvalue(Swift_WS_A,"988");
		        sendnumericvalue(Swift_CS_Q,"10");
		        sendnumericvalue(Swift_CS_A,"879");
		        sendnumericvalue(Swift_RS_A,"100000");
		        sendnumericvalue(Swift_DRF_A,"10000");
		        sendnumericvalue(Swift_Dis_Offer,"1000");
		        sendnumericvalue(Swift_Dealer_Com,"1000");
		        sendnumericvalue(Dzire_OS_Q,"10");
		        sendnumericvalue(Dzire_OS_A,"100000");
		        sendnumericvalue(Dzire_WS_Q,"10");
		        sendnumericvalue(Dzire_WS_A,"7898");
		        sendnumericvalue(Dzire_CS_Q,"10");
		        sendnumericvalue(Dzire_CS_A,"798");
		        sendnumericvalue(Dzire_RS_A,"898");
		        sendnumericvalue(Dzire_DRF_A,"10000");
		        sendnumericvalue(Dzire_Dis_Offer,"897");
		        sendnumericvalue(Dzire_Dealer_Com,"1000");
		        sendnumericvalue(Brezza_OS_Q,"10");
		        sendnumericvalue(Brezza_OS_A,"655");
		        sendnumericvalue(Brezza_WS_Q,"10");
		        sendnumericvalue(Brezza_WS_A,"6554");
		        sendnumericvalue(Brezza_CS_Q,"10");
		        sendnumericvalue(Brezza_CS_A,"54345");
		        sendnumericvalue(Brezza_RS_A,"5546");
		        sendnumericvalue(Brezza_DRF_A,"10000");
		        sendnumericvalue(Brezza_Dis_Offer,"1000");
		        sendnumericvalue(Brezza_Dealer_Com,"1000");
		        sendnumericvalue(Ertiga_OS_Q,"10");
		        sendnumericvalue(Ertiga_OS_A,"978");
		        sendnumericvalue(Ertiga_WS_Q,"10");
		        sendnumericvalue(Ertiga_WS_A,"100000");
		        sendnumericvalue(Ertiga_CS_Q,"10");
		        sendnumericvalue(Ertiga_CS_A,"4343");
		        sendnumericvalue(Ertiga_RS_A,"100000");
		        sendnumericvalue(Ertiga_DRF_A,"10000");
		        sendnumericvalue(Ertiga_Dis_Offer,"1000");
		        sendnumericvalue(Ertiga_Dealer_Com,"1000");
		        sendnumericvalue(Eeco_OS_Q,"10");
		        sendnumericvalue(Eeco_OS_A,"53455");
		        sendnumericvalue(Eeco_WS_Q,"10");
		        sendnumericvalue(Eeco_WS_A,"100000");
		        sendnumericvalue(Eeco_CS_Q,"10");
		        sendnumericvalue(Eeco_CS_A,"432");
		        sendnumericvalue(Eeco_RS_A,"345");
		        sendnumericvalue(Eeco_DRF_A,"5454");
		        sendnumericvalue(Eeco_Dis_Offer,"1000");
		        sendnumericvalue(Eeco_Dealer_Com,"1000");
		        sendnumericvalue(SCarry_OS_Q,"10");
		        sendnumericvalue(SCarry_OS_A,"100000");
		        sendnumericvalue(SCarry_WS_Q,"10");
		        sendnumericvalue(SCarry_WS_A,"100000");
		        sendnumericvalue(SCarry_CS_Q,"10");
		        sendnumericvalue(SCarry_CS_A,"5445");
		        sendnumericvalue(SCarry_RS_A,"554");
		        sendnumericvalue(SCarry_DRF_A,"553");
		        sendnumericvalue(SCarry_Dis_Offer,"1000");
		        sendnumericvalue(SCarry_Dealer_Com,"5455");	
		        
		        
		        //Save Data
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
		        
		        

			}

			private static void sendnumericvalue(WebElement element, String value) throws InterruptedException {
				

				   // 1.We put the condition that only numeric value is acceptable from (0-9+)....
				
				if(value.matches("[0-9]+"))
				   {
			         element.sendKeys(value); // Send the numeric value
			         System.out.println("value is numeric = pass   = "  +value);
			       
			        }
				else
			        {
			           System.out.println("Input value is not numeric =   fail = " +value);
			           //Thread.sleep(1000);	
			        }
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//2. If the valye length is not more than 12 characters	
				
				if((value.length()> 12))
					
			   {	
			
					System.out.println("value length is more than 12 character  =  fail = " +value);
		}
				else           
		{
					System.out.println("value is not more than 12 character =  pass ="   +value);
					//Thread.sleep(1000);
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
		//wait for some time to catch the exceptions

		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<
		   
		//3. Verify if the element is not null
		     
		     if (element != null) {
		         // Perform action (e.g., sending keys) on the element
		         
		         System.out.println("Element  is not NULL : =   pass    ");
		     } else {
		         System.out.println("Element is null. Cannot perform action: =   pass     ");
		         // Handle the situation where the element is null
		}
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		     
		     //  4.... If the element is Disable
		     
		     if (!element.isEnabled()) {
		     	System.out.println("element is disable : = fail    ");
		     
		     
			}else{
				
				System.out.println("element is enable  = pass  ");
			}
		//..........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		   
		     // 5. If any data will be send in through the sendkeys it will check that expected result = actual result 
		     
		     
		     String enteredText = element.getAttribute("value");
		     if (enteredText.matches(value)) {
		    	 
		         System.out.println("value will be matches .=   pass =" + value);
		         System.out.println("Expected value = Actual value" + value);
		     } else {
		         System.out.println("Value will not matches = fail  =");
		         // Handle the situation where keys were not sent or entered correctly
		     }
		     
				
		}}