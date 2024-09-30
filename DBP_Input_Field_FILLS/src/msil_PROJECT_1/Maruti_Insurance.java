package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Maruti_Insurance {
	public static void marutiInsurance(WebDriver driver) throws InterruptedException {
		
		// Then click on the maruti Renewal option on the left ....
				driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[9]")).click();
				Thread.sleep(3000);
				
				// then we will fill the details of Income in Maruti Insurance
				driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("3");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("456783");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("3556565");
				driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("0");
				// then we will fill the expenses in particualr required field..
				
				driver.findElement(By.xpath("(//*[@type=\"number\"])[13]")).sendKeys("312212");
				
				// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
				
				System.out.println("all the data has been saved succesfully in maruti Insurance");
				Thread.sleep(4000);
	}

}
