package positive_script_By_different_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Submit {
	static void SUBMIT(WebDriver driver) throws InterruptedException {
		
		//driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[16]")).click();
		
		
		// 1.THEN CLICK ON THE INTEREST COST QUANTITY....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[16]")).click();
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("(//*[@class=\"mat-button-wrapper\"])[2]")).click();
		 
	
	}}