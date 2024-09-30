package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Intrest_cost {
	public static void Intrestcost(WebDriver driver) throws InterruptedException {
		

		
		//<>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		// 1.THEN CLICK ON THE INTEREST COST QUANTITY....
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[4]")).click();
		
		Thread.sleep(4000);
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//.................SHORT TERM LOAN..............................
		
		driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("240000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("5000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("5000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("10000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[5]")).sendKeys("10000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[7]")).sendKeys("0");
		// we will see that all the data is filling and adding according to the number or not......
		driver.findElement(By.xpath("(//*[@type=\"number\"])[9]")).sendKeys("10000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[10]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[11]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[12]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[13]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[14]")).sendKeys("5000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[15]")).sendKeys("0");
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		driver.findElement(By.xpath("(//*[@type=\"number\"])[25]")).sendKeys("7000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[26]")).sendKeys("500000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[27]")).sendKeys("500000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[28]")).sendKeys("500000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[29]")).sendKeys("500000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[30]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[31]")).sendKeys("0");
		// we will see that all the data is filling and adding according to the number or not......
		driver.findElement(By.xpath("(//*[@type=\"number\"])[33]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[34]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[35]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[36]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[37]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[38]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[39]")).sendKeys("0");
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		//.........................LONG TERM LOAN.............................
		driver.findElement(By.xpath("(//*[@type=\"number\"])[50]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[51]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[52]")).sendKeys("41399700");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[53]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[54]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[55]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[56]")).sendKeys("0");
		// we will see that all the data is filling and adding according to the number or not......
		driver.findElement(By.xpath("(//*[@type=\"number\"])[58]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[59]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[60]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[61]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[62]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[63]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[64]")).sendKeys("0");
		// we will see that all the data is filling and adding according to the number or not......
		driver.findElement(By.xpath("(//*[@type=\"number\"])[74]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[75]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[76]")).sendKeys("6000000");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[77]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[78]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[79]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[80]")).sendKeys("0");
		// we will see that all the data is filling and adding according to the number or not......
		driver.findElement(By.xpath("(//*[@type=\"number\"])[82]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[83]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[84]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[85]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[86]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[87]")).sendKeys("0");
		driver.findElement(By.xpath("(//*[@type=\"number\"])[88]")).sendKeys("0");
		
		
		// then we will save the all data 
				driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
				driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved sucessfully in the intrest cost");
		
		Thread.sleep(3000);
		
		
		
		
	}

}
