package negative_AND_Positive_Script_DBP;


import org.openqa.selenium.WebElement;

public class Methods_of_conditions {
	

	public static void sendData1(WebElement element, String data) throws InterruptedException {
	   	// 1.We put the condition that only numeric value is acceptable and not accept more than 12 characters
	         		
	         		if(data.matches("[0-9]+") && (data.length()<=12))
	       
	         		   {
	         	         System.out.println("PASS [numberic value /less than 12 character] = "  + data);
	         	     
	         	        }
	         		else
	         	        {
	         	           System.out.println("data will be not numberic OR accepting more than 12 characters = " +data);
	         	           	
	         	        }	
	 
	            		 
	   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	              
	              //  2... If the element is Disable
	              
	              if (!element.isEnabled()) {
	              	System.out.println("element is disable : = fail    ");
	              
	              
	              	
	            	}else{
	            		
	            		System.out.println("element is enable  = pass  ");
	            	}
	            //..........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	              // 3. If any data will be send in through the sendkeys it will check that expected result = actual result 
	              
	              
	              String enteredText = element.getAttribute("value");
	              if (enteredText.equals(data)) {
	             	 
	                  System.out.println("Entered attribute value matches  =   PASS =" + data);
	                 
	              } else {
	                  System.out.println(" Attribute value not matches   =" + data);
	                  
	
	              }}     
	                

	            		

		
		
		
		 



}
