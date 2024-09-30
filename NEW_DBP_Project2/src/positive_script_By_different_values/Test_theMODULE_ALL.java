package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test_theMODULE_ALL {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
				  
			  // 1 ..Navigate to the main page or perform login once
			  driver.get("https://dev-dbp.msilfintrac.co.in/");
			  Thread.sleep(2000);
			//  2.. Then put The MSIL 
			  WebElement MSIL = driver.findElement(By.cssSelector("[placeholder=\"MSPIN\"]"));
				MSIL.sendKeys("41380");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				// 3..click on the send otp
				  
				driver.findElement(By.cssSelector("[class=\"btn\"]")).click();
				
				Thread.sleep(3000);	
				
				// 4.(1st condtion for MSIL)
				String MSIL1 = MSIL.getAttribute("value");
				
				
		        if (MSIL1.matches("41380")){
		            System.out.println("valid msil ID : " + MSIL1);
		            
		              
		           
		        } else {
		            System.out.println("PLEASE ENTER VALID MSPIN: " +  "WRONG MSIL ID   ="+  MSIL1);
		            System.out.println("IT WILL ACCEPT ONLY NUMBERIC CHARACTER");
		           
		            
		            driver.quit();
		        }
				
		     
				// 5.then click on the OTP option
				WebElement OTP = driver.findElement(By.cssSelector("[placeholder=\"OTP\"]"));
				OTP.sendKeys("5555");
				
				  
				// 6..click on the login page ...
				
				
				Thread.sleep(3000);
				
				WebElement Login = driver.findElement(By.xpath("(//*[@type=\"button\"])[2]"));
				Login.click();
				
        
				String OTP1 = OTP.getAttribute("value");
				
        // 7..( 2nd conditions)
        if (OTP1.matches("5555")){
            System.out.println("Valid  otp : " + OTP1);
            
  
        } else {
            System.out.println("please Enter valid OTP :"+"   WRONG OTP    =" + OTP1);
            driver.quit();
        }
		
				
        Thread.sleep(6000);
        

		//7.Then we will click on  dealer option
		WebElement  s2 = driver.findElement(By.cssSelector("[class=\"dealer-business px-0 py-4\"]"));
		s2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
		
		Thread.sleep(3000);
				
				// then we put the 3rd condition
				
				//  expected Url.......
				 String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/network-details";
				
				//  Expected result is equals to actual result.....
				 String actual_class = driver.getCurrentUrl();
				
				if(expected_class.equals(actual_class)) {
					System.out.println("login succesfull    = ( valid Url ) >>>>   "        + actual_class );
					
				}
				else {
					System.out.println("login fail   =  Invalid Url   >>>>>>    "    + actual_class);
					
				}
				Thread.sleep(3000);
////////////////////////////////////////////////<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>///////////////////////////////		
	        
		    // Click on each Module and perform actions
				

//				Networkdetails.networkDetails(driver);
				STOCKS.stOcks(driver);
				 DISCOUNTS.discount(driver);
				module1_INTREST_COST.Intrest_cost(driver);
				Manpower_Count.manPOWER(driver);   
				 Manpower_cost.manpowercost(driver);
				New_CARS.newCars(driver);
			    MDS.mds(driver);
				Maruti_INSURANCE.MARUTI_INSURANCE(driver);
				MSGA.msga(driver);
				True_VALUE.truevalue(driver);
				SPARES.spares(driver);
				SERVICE.service(driver);
				COMMAN_expenses.commanEXPENSE(driver);
				KEY_financialss.keyfinancials(driver);
				Import_data.IMPORT(driver);
				//Submit.SUBMIT(driver);
			
			 
				
/////////////////////////////////////<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>////////////////////////////////////////					 
				 
				Thread.sleep(3000);
				
	       
		  }
	}

	