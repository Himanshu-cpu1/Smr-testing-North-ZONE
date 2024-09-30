package positive_script_By_different_values;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Import_data {
	
	static void IMPORT(WebDriver driver) throws InterruptedException, AWTException {
		
		

		Thread.sleep(1000);		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[17]")).click();
		Thread.sleep(3000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////

//We put the conditions of URL

       String expected_class = "https://dev-dbp.msilfintrac.co.in/Dashboard/uploud";


         String actual_class = driver.getCurrentUrl();

         if(expected_class.equals(actual_class)) {
          System.out.println("    Valid Url   =   "        + actual_class );

          
       }
           else {
       System.out.println("   Invalid Url    =  "   + actual_class);
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
Thread.sleep(1000);			
		
		// Then click on the choose file 
		
		driver.findElement(By.cssSelector("[class=\"btn browse-btn\"]")).click();
		
		Thread.sleep(3000);
	
		// Provide the path of the file to be uploaded
        StringSelection ss = new StringSelection("\"C:\\Users\\Thinkpad\\Downloads\\Upload data.xlsx\""); // Change to the actual path of your file
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

        // Add some delay to upload the file
        
        Thread.sleep(2000);
        
        // click on the submit file ..

        driver.findElement(By.cssSelector("[class=\"btn customup\"]")).click();
        
       	
		
	}

}
