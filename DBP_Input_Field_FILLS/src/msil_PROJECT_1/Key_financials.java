package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Key_financials {
	public static void keyfinancials (WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[15]")).click();
		Thread.sleep(3000);

		// Key Financials
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")).sendKeys("53097890");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")).sendKeys("278109929");
		//...................................
		driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[6]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[8]")).sendKeys("0");
		//........................................
		driver.findElement(By.xpath("(//*[@type=\"text\"])[9]")).sendKeys("97137046");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[10]")).sendKeys("144122661");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[11]")).sendKeys("5075711");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[12]")).sendKeys("23056890");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[13]")).sendKeys("130364");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[14]")).sendKeys("250422748");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[15]")).sendKeys("4798560");
		
		
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved succesfully in the Key Financials");
		
		Thread.sleep(3000);
	}

}
