package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Spares {
	public static void spares(WebDriver driver) throws InterruptedException {
		
		// Then click on the SPARES on the left side....
				driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[12]")).click();
				Thread.sleep(3000);

				// Spares - Sales
				driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")).sendKeys("310000000");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")).sendKeys("244950000");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[6]")).sendKeys("40000000");
				
				//Spares - COGS
				driver.findElement(By.xpath("(//*[@type=\"text\"])[8]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[9]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[10]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[11]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[12]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[13]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[14]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[15]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[16]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[17]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[18]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[19]")).sendKeys("0");
				
				//Income
				driver.findElement(By.xpath("(//*[@type=\"text\"])[23]")).sendKeys("6045843");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[25]")).sendKeys("300000");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[27]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[29]")).sendKeys("0");

				// Expense
				driver.findElement(By.xpath("(//*[@type=\"text\"])[35]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[37]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[39]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"text\"])[41]")).sendKeys("0");
				
				// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
				System.out.println("all the data has been saved succesfully in Spares");
				Thread.sleep(3000);
		
		
		
	}

}
