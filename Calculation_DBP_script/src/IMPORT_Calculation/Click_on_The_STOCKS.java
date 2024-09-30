package IMPORT_Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click_on_The_STOCKS {
	static void click(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);


		//7.Then we will click on  dealer option
		 driver.findElement(By.xpath("(//*[@class=\"mat-line\"])[2]")).click();        
		Thread.sleep(2000);
		
	}

}
