package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MSGA {
	public static void msga(WebDriver driver) throws InterruptedException {
		
		// Then click on the MSGA option on the left ....
				driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[10]")).click();
				Thread.sleep(3000);
				
				// then we will fill the details of Income in Maruti Insurance
				
				// 1.MSGA-Sales
				driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("79869733");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("50420205");
				
				// 2.MSGA-COGS
				driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("20144002");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")).sendKeys("107075274");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[8]")).sendKeys("13873917");
				
				// 3.Income
				driver.findElement(By.xpath("(//*[@type=\"number\"])[12]")).sendKeys("0");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[13]")).sendKeys("9235775");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[14]")).sendKeys("0");
				
				//4.Expense
				driver.findElement(By.xpath("(//*[@type=\"number\"])[20]")).sendKeys("1000000");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[22]")).sendKeys("0");


				
				// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
				System.out.println("all the data has been saved succesfully inn MSGA");
				Thread.sleep(3000);
		
	}

}
