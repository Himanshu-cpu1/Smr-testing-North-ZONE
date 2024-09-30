package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MDS {
	public static void mds(WebDriver driver) throws InterruptedException {
		
		
	// Then click on the MDS option on the left ....
	driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[8]")).click();
	Thread.sleep(3000);
	
	// then we will fill the details of Income in maruti driving school
	driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("60");
	driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("120000");
	driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("0");
	driver.findElement(By.xpath("(//*[@type=\"number\"])[6]")).sendKeys("0");
	// then we will fill the expenses in particualr required field..
	
	driver.findElement(By.xpath("(//*[@type=\"number\"])[15]")).sendKeys("0");
	
	// then we will save the all data 
	driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
	driver.findElement(By.cssSelector("[class=\"save\"]")).click();
	
	System.out.println("all the data has been saved succesfully in MDS");
	Thread.sleep(3000);
	}
	
	//................>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


	
	
	}
