package SMR_Central_Zone;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserList_SMR_Report {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	//..................................................................................................
	 @SuppressWarnings("deprecation")
	    @BeforeClass
	    public void setup() {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://dealercrm.co.in/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);

	    }

	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	    @Test(priority = 1)
	    public void Username() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Username = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
	        Username.sendKeys("ZSHArenaC00001");

	        Thread.sleep(2000);
	    }

	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	    @Test(priority = 2)
	    public void Password() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
	        password.sendKeys("Aynjwjq@1");
	               
	          Thread.sleep(3000);
		    	    
	        WebElement login_Button = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
	        login_Button.click();
	        
	    }

	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	    @Test(priority = 3)
	    public void Captcha() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        
	      //.................Enter The Captcha ..................................................................
	        WebElement Image = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
			
			String S1 = Image.getAttribute("value");
			System.out.println("captcha ::"+S1);
						
		    Thread.sleep(3000);
		
	        WebElement captcha_field = driver.findElement(By.cssSelector("[placeholder=\"Enter the captcha..\"]"));
		    captcha_field.sendKeys(S1);
	      //......................................................................	   	    
	    }

	    // wait for 15 Second  and put the captcha code

	//.....................................................................................................

	    @Test(priority = 4)
	    public void SUBMIT_Button() throws InterruptedException {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Submit\"]")));
	        Submit.click();
	        Thread.sleep(20000);


	    }

//..................................................................................................
@Test(priority = 5)
public void Click_On_Report() throws InterruptedException {
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	 //close the pop up message first
	   WebElement PopUp= driver.findElement(By.xpath("(//*[@title=\"Close message\"])"));
	   PopUp.click();
	   Thread.sleep(3000);
	WebElement report = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Reports \"]")));
	report.click();
	Thread.sleep(7000);

}
	//..............................................................................................................
	//..................................................................................................
		   @Test(priority = 6)
		   public void Click_On_USER_LIST_REPORT() throws InterruptedException {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement UserList = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"User List \"]")));
		   UserList.click();
		   Thread.sleep(30000);					
	}
//................................................................................................................		   
//		   @Test(priority = 7)
//		   public void Select_WORKSHOP_NAME_Parameter() throws InterruptedException {
//		       //click on Workshop Name dropdown
//			   WebElement Workshop= driver.findElement(By.xpath("(//*[@role=\"combobox\"])[1]"));
//			   Actions actions1 = new Actions(driver);
//		       actions1.click(Workshop).perform();
//
//			   
//			   Thread.sleep(3000);
//			   
//			   //Select option
//			   
//			   WebElement option= driver.findElement(By.xpath("(//*[@role=\"option\"])[1]"));
//			   option.click();
//			   Thread.sleep(3000);	   
//		   }
//		 //.........................................................................................................................  
//		   @Test(priority = 8)
//		   public void Click_On_Generate_Button() throws InterruptedException {
//			   
//			 //click on Generate Button
//			   WebElement Generate= driver.findElement(By.xpath("(//*[text()=\"Generate\"])"));
//			   Actions actions1 = new Actions(driver);
//		       actions1.click(Generate).perform();
//
//			   
//			   Thread.sleep(8000);
//			    	   
//		   }
//		//.............................................................................................................   
		   @Test(priority = 9)
		   public void Data_Verification_User_List() throws InterruptedException {
		       // Verify if the report contains data
		       List<WebElement> reportRows = driver.findElements(By.xpath("(//*[@role=\"rowgroup\"][2]//tr)"));
		       
		       // Check if the report contains data
		       if (reportRows.size() > 1) {
		           System.out.println("The report contains data."); // Message when data is present
		       }
		       
		       // Assert to fail the method if data is not present
		       Assert.assertTrue(reportRows.size() > 1, "The report does not contain any data.");
		   }		   
 //...................................................................................  
//		   @Test(priority = 10)
//		   public void Download_User_List() throws InterruptedException {
//		   Thread.sleep(3000);
//		   WebElement Download= driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[2]"));
//		   Actions actions1 = new Actions(driver);
//           actions1.click(Download).perform();
//
//		   
//		   Thread.sleep(2000);
//		   
//		   WebElement Excel= driver.findElement(By.xpath("(//*[contains(text(),\"Excel\")])"));
//		   Excel.click();
//		   
//		   Thread.sleep(4000);
//		   
//   }
//..........................................................................................................		   
		   
}

		    
		   

