package negative_AND_Positive_Script_DBP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Submit {
	static void SUBMIT(WebDriver driver) throws InterruptedException {
		
		//driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[16]")).click();
		
		
		// 1.THEN CLICK ON THE INTEREST COST QUANTITY....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[2]")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
        WebElement AltoK10_OS_Q= driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
        
        AltoK10_OS_Q.getAttribute("value");
       
        
	}}
        