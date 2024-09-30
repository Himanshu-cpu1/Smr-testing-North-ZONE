package Import_DATA_Of_DBP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Import extends LOGIN {
	
	public static WebDriver driver;
	public WebDriverWait wait;

	//.......................................................................................................

			@SuppressWarnings({ "static-access" })
			@BeforeClass
			public void IMPORT_DATA () throws InterruptedException {
				
				 this.driver=LOGIN.driver;
			
		//.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			//...................................................................................................................................................	
			//click on Import  
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[contains(text(),\"Import Data \")])[1]")).click();        
			Thread.sleep(3000);
			
       }
			@Test(priority=0)
		 public void chooseFile() throws InterruptedException, AWTException {
			 
				// Then click on the choose file 
				
				driver.findElement(By.cssSelector("[class=\"btn browse-btn\"]")).click();
				
				Thread.sleep(3000);
			
				// Provide the path of the file to be uploaded
		        StringSelection ss = new StringSelection("C:\\Users\\Thinkpad\\Downloads\\C2 VIPUL ARENA MARCH 2024 dummy data 1.xlsx"); // Change to the actual path of your file
		        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		        // Use Robot class to handle system dialog and upload file
		        Robot robot = new Robot();
		        
		        // Press Enter to focus on the system dialog
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
		        
		        // Wait for 1 second
		        Thread.sleep(2000);
		        
		        // Press Ctrl + V to paste the file path into the dialog
		        
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        
		        // Wait for 1 second
		        Thread.sleep(1000);
		        
		        // Press Enter to confirm the file upload
		        
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
		       
		        Thread.sleep(3000);	        
		        
		     // click on the submit file ..

		        driver.findElement(By.cssSelector("[class=\"btn customup\"]")).click();
		        
		        Thread.sleep(6000);
		        
		        // click on the ok Button
		        driver.findElement(By.xpath("(//*[@type=\"button\"])[2]")).click();
		        //...................................................................................
		        
		        // Assuming the upload page shows a success message with an element having id 'upload-success'
		        boolean isUploadSuccessful = driver.findElement(By.xpath("(//*[@type=\"button\"])[2]")).isDisplayed();
		        Assert.assertTrue(isUploadSuccessful, "File upload failed!");
			 
		 }
			 @AfterClass
	         public void tearDown () {	
	       		 driver.quit();
	         }
			

}