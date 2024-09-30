package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Manpower_cost {
	public static void manpowercost(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[6]")).click();
		Thread.sleep(4000);
		
        // 1.New cars
		driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("49550325");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")).sendKeys("21458316");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[6]")).sendKeys("3308316");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")).sendKeys("2208294");
		// 2.Maruti Driving School
		driver.findElement(By.xpath("(//*[@type=\"text\"])[14]")).sendKeys("550000");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[15]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[16]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[17]")).sendKeys("0");
		// 3.Maruti Insurance Renewal
		driver.findElement(By.xpath("(//*[@type=\"text\"])[24]")).sendKeys("4958382");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[25]")).sendKeys("1655016");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[26]")).sendKeys("6920590.6");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[27]")).sendKeys("0");
		// 4.MSGA
		driver.findElement(By.xpath("(//*[@type=\"text\"])[34]")).sendKeys("3525049");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[35]")).sendKeys("2503171");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[36]")).sendKeys("2765983");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[37]")).sendKeys("902341");
		// 5.True Value	---NOT in sheet
		driver.findElement(By.xpath("(//*[@type=\"text\"])[44]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[45]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[46]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[47]")).sendKeys("0");
		// 6.Spares
		driver.findElement(By.xpath("(//*[@type=\"text\"])[54]")).sendKeys("8258679");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[55]")).sendKeys("2755016");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[56]")).sendKeys("2250556");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[57]")).sendKeys("775225");
		// 7.Corporate Office /Common Manpower	----not in thesheet
		driver.findElement(By.xpath("(//*[@type=\"text\"])[64]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[65]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[66]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[67]")).sendKeys("0");
		// 8.services----not in the sheet
		driver.findElement(By.xpath("(//*[@type=\"text\"])[74]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[75]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[76]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[77]")).sendKeys("0");
		
		// we will save the following numbers
		System.out.println("all the numbers has been filled succesfully");
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved in man power cost");
		Thread.sleep(3000);
		
		
	}

}
