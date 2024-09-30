package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Discount {
	public static void discount(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
		
		// 1. Then click on the Discount option On the left side of the Dashboard.
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[3]")).click();
		
		Thread.sleep(2000);

		// 2.Then click on the (Consumer Offer (SPOT+ RIPS) AMOUNT.......
		driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("15998927");
		
		// 3.Then click on the (ISL/RMK ) AMOUNT...........
		driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("13152150");
		
		// 4. Then click on the (Exchange Bonus)  AMOUNT......................
		driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("9470370");
		
		// 5. Then click  on the (Any Regional Office Scheme)  AMOUNT.................
		driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("20640720");
		
		//>>>>>>.....Dealer Compulsion Amount will comes from the stock DISCOUT Amount........<<<<<<<<
		
		// 6.Then click on the (Any Other) AMOUNT.......................
		driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("0");
		
		
		Thread.sleep(5000);
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved in Discount");
		Thread.sleep(3000);
		
		
	}

}
