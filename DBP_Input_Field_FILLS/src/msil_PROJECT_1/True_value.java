package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class True_value {
	public static void truevalue(WebDriver driver) throws InterruptedException {
		

		// Then click on the True Value option on the left side....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[11]")).click();
		Thread.sleep(2000);

		// POC Sales
		driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("5632");
		
		// POC Sales - COGS
		driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("3");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")).sendKeys("25223");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("23");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")).sendKeys("7523");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[8]")).sendKeys("5");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[9]")).sendKeys("25524");
		
		// Income
		driver.findElement(By.xpath("(//*[@type=\"number\"])[13]")).sendKeys("43252");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[15]")).sendKeys("235253");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[17]")).sendKeys("43224");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[19]")).sendKeys("253225");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[21]")).sendKeys("5");
		
		// Expense
		driver.findElement(By.xpath("(//*[@type=\"number\"])[27]")).sendKeys("5325245");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[29]")).sendKeys("765432");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[31]")).sendKeys("43463");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[33]")).sendKeys("245677");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[35]")).sendKeys("754333");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[37]")).sendKeys("360877");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[39]")).sendKeys("410552");
		
		// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
				System.out.println("all the data has been saved succesfully in True VALUE");
				Thread.sleep(3000);
		
	}

}
