package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Services {
	public static void service(WebDriver driver) throws InterruptedException {
		

		// Then click on the Service Modules option on the left side....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[13]")).click();
		Thread.sleep(3000);

		// Service
		driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("80582");
		
		//Income
		driver.findElement(By.xpath("(//*[@type=\"text\"])[6]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[8]")).sendKeys("151584833");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[10]")).sendKeys("310000");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[11]")).sendKeys("1550000");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[12]")).sendKeys("1550000");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[13]")).sendKeys("155000");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[14]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[15]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[16]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[17]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[18]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[19]")).sendKeys("0");
		
		//Expense
		driver.findElement(By.xpath("(//*[@type=\"text\"])[24]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[26]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[28]")).sendKeys("5339308");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[30]")).sendKeys("154980");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[32]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[34]")).sendKeys("3930122");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[36]")).sendKeys("4845495");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[38]")).sendKeys("1530191");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[40]")).sendKeys("25352738");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[42]")).sendKeys("132286304");
		
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved succesfully");
		Thread.sleep(3000);
		
		
	}

}
