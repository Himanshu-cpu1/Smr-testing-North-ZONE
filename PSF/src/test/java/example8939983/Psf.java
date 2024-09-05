package example8939983;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Psf {

	public ChromeDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://psfcrm.dealercrm.co.in/psf/psf-calling-list?callingTab=0&page=5&pageIndex=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//,...........................................................................
		
	}
     @Test(priority=1)
	public void username() throws InterruptedException  {
    	Thread.sleep(2000);
    	WebElement Username = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
    	Username.sendKeys("khsjhds");
    	 
     
	}
 //......................................................................................    
     @Test(priority=2)
	 public void password() throws InterruptedException {
    	 Thread.sleep(3000);
    	  WebElement password = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
     	  password.sendKeys("87438r7");
     	    	 
	}

    }
