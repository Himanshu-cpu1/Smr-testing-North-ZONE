package mSIL_loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGINPAGE {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		  // 1 ..Navigate to the main page or perform login once
		  driver.get("http://dev.dbp.autovyn.in/login");
		  
		  WebElement MSIL = driver.findElement(By.cssSelector("[type=\"radio\"]"));
        
		  MSIL.click();
		  
		  Thread.sleep(2000);
		  
		 WebElement Click = driver.findElement(By.cssSelector("[type=\"button\"]"));
		 Click.click();
		 
		 Thread.sleep(2000);
		 
		 
		  
		 // Call the method to test login scenarios
		 
	      //  testLogin(driver, "Maruti67597", "Bobo@673");  // invalid username and password
	      //  testLogin(driver, "Marutifg76687", "Bobo@1234"); // invalid username  and valid password
	        testLogin(driver, "Maruti\\267597", "Bobo@234567"); // valid username and valid password
	        

	        // Close the browser
	       
	    }

	    public static void testLogin(WebDriver driver, String username, String password) throws InterruptedException {
	        // Find the username and password fields
	        WebElement usernameField = driver.findElement(By.id("userNameInput"));  
	        WebElement passwordField = driver.findElement(By.id("passwordInput"));
	        WebElement loginButton = driver.findElement(By.id("submitButton"));

	        // Input username and password
	        usernameField.clear();
	        Thread.sleep(1000);
	        usernameField.sendKeys(username);
	        Thread.sleep(1000);
	        passwordField.clear();
	        Thread.sleep(1000);
	        passwordField.sendKeys(password);
	     

	        Thread.sleep(1000);
	        // Click the login button
	        loginButton.click();
	        

	        // Check if login was successful
	        String currentUrl = driver.getCurrentUrl();
	        if (currentUrl.equals("https://dev-dbp.msilfintrac.co.in/Dashboard/network-details")) {
	            System.out.println("Login successful for username: " + username + " and password: " + password);
	        } else {
	            System.out.println("Login failed for username: " + username + " and password: " + password);
	            Thread.sleep(3000);
	            
	        }
	    }
	
	}

