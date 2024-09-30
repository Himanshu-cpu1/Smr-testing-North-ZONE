package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class New_car {
	public static void newcars(WebDriver driver) throws InterruptedException {
		

		// Then click on the new cars option on the left ....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[7]")).click();
		Thread.sleep(2000);
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		// then we will fill the details in the income in new cars
		driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")).sendKeys("11250000");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[9]")).sendKeys("22500000");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[11]")).sendKeys("15581250");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[13]")).sendKeys("18792951");
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[15]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[17]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[19]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[21]")).sendKeys("0");
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[23]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[25]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[26]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[28]")).sendKeys("0");
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[29]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[31]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[32]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[34]")).sendKeys("0");
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[35]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[37]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[38]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[40]")).sendKeys("0");
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[42]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[44]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[46]")).sendKeys("0");
		// Then we will se that all the deatils are filled correctly in Total New Car Income [A]
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// then we will fill the details in new cars Expense
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type=\"text\"])[55]")).sendKeys("3573794");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[57]")).sendKeys("2257978");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[59]")).sendKeys("1168548");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[61]")).sendKeys("0");
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[63]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[65]")).sendKeys("18792951");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[67]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[69]")).sendKeys("0");
		
		// then we will se that all the details are correctly added in Total New Car Direct Expense [B]
		// also check Net Earning New car = [A] - [B] is correct or not
		System.out.println("Net Earning New car = [A] - [B]  is correct");
		
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved in the new cars");
		
		Thread.sleep(3000);
		
		
	}

}
