package SMR;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dealer_subscription {
	public static WebDriver driver;
	public WebDriverWait wait;

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
		WebElement Username = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-0\"]")));
		Username.sendKeys("North2RSM00001");

		Thread.sleep(2000);
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 2)
	public void Password() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=\"mat-input-1\"]")));
		password.sendKeys("MarutiCNM#@123");
		Thread.sleep(2000);
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@Test(priority = 3)
	public void Login_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));
		password.click();
		Thread.sleep(20000);
	}

	// wait for 15 Second and put the captcha code

	// .....................................................................................................

	@Test(priority = 4)
	public void SUBMIT_Button() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Submit\"]")));
		Submit.click();
		Thread.sleep(3000);

	}

	// ..................................................................................................
	@Test(priority = 5)
	public void Click_On_Report() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement report = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Reports \"]")));
		report.click();
		Thread.sleep(3000);

	}

	// ..............................................................................................................
	@Test(priority = 6)
	public void Click_On_The_Dealer_Subscription() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dealer = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Dealer Subscription \"]")));
		dealer.click();
		Thread.sleep(3000);

	}

//..................................................................
	@Test(priority = 7)
	public void Workshop_Wise() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Try to locate the Total_Lead_Recived element
	    WebElement Total_Workshop;
	    try {
	    	Total_Workshop = driver.findElement(By.xpath("(//tr[td[contains(., 'N2')]])[1]/td[2]"));
	    	
	    	String S1 = Total_Workshop.getText();
	    	
	    	System.out.println("Total_Workshop Sof workshop wise In-Dealer subscription    :: "+S1);

	        // Check if Total_Lead_Recived element is displayed
	        if (!Total_Workshop.isDisplayed()) {
	            System.out.println("No Data Found in Workshop Wise: Total_Workshop element is not visible on the page In-Dealer subscription  .");
	            Assert.fail("No Data Found in Workshop Wise: Total_Workshop element is not visible on the page In-Dealer subscription  .");
	            return; // Exit the test if the element is not visible
	        }
	    } catch (NoSuchElementException e) {
	        System.out.println("No Data Found in Workshop Wise: Total_Workshop element could not be found In-Dealer subscription  : " + e.getMessage());
	        Assert.fail("No Data Found in Workshop Wise: Total_Workshop element could not be found In-Dealer subscription  : " + e.getMessage());
	        return; // Exit the test if the element is not found
	    }
	}
	//..................................................................
		@Test(priority = 8)
		public void Dealer_Parent_group_Wise() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			 WebElement Dealer_Parent_Group_Wise = wait.until(
			            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Dealer Parent Group Wise\"]")));
			    Dealer_Parent_Group_Wise.click();
			    Thread.sleep(3000);
			    
			// Try to locate the Total_Lead_Recived element
		    WebElement Total_Workshop;
		    try {
		    	Total_Workshop = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-1\"]/div/div/table/tbody/tr[1]/td[2]"));
		    	
		    	String S1 = Total_Workshop.getText();
		    	
		    	System.out.println("Total_Workshop of Dealer parent group wise   In-Dealer subscription     :: "+S1);

		        // Check if Total_Lead_Recived element is displayed
		        if (!Total_Workshop.isDisplayed()) {
		            System.out.println("No Data Found in Dealer parent  group Wise: Total_Workshop element is not visible on the page  In-Dealer subscription  .");
		            Assert.fail("No Data Found in Dealer parent  group Wise: Total_Workshop element is not visible on the page In-Dealer subscription  .");
		            return; // Exit the test if the element is not visible
		        }
		    } catch (NoSuchElementException e) {
		        System.out.println("No Data Found in Dealer parent  group Wise: Total_Workshop element could not be found In-Dealer subscription  : " + e.getMessage());
		        Assert.fail("No Data Found in Dealer parent  group Wise: Total_Workshop element could not be found In-Dealer subscription  : " + e.getMessage());
		        return; // Exit the test if the element is not found
		    }
		}
}
