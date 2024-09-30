package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Network_Details {
	public static void networkdetails(WebDriver driver) throws InterruptedException {
		
		
		Thread.sleep(3000);
		WebElement N1 = driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		N1.sendKeys("7798");
		WebElement N2 = driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
		N2.sendKeys("78");
		WebElement N3 = driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		N3.sendKeys("98");
		WebElement N4 = driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		N4.sendKeys("698");
		
		// 3.Then fil the fill the value in the services...........
		
		WebElement N5 = driver.findElement(By.xpath("(//*[@type=\"number\"])[5]"));
		N5.sendKeys("798");
		WebElement N6 = driver.findElement(By.xpath("(//*[@type=\"number\"])[6]"));
		N6.sendKeys("7748");
		WebElement N7 = driver.findElement(By.xpath("(//*[@type=\"number\"])[7]"));
		N7.sendKeys("778");
		WebElement N8 = driver.findElement(By.xpath("(//*[@type=\"number\"])[8]"));
		N8.sendKeys("778");
		WebElement N9 = driver.findElement(By.xpath("(//*[@type=\"number\"])[9]"));
		N9.sendKeys("778");
		WebElement N10 = driver.findElement(By.xpath("(//*[@type=\"number\"])[10]"));
		N10.sendKeys("778");
		WebElement N11 = driver.findElement(By.xpath("(//*[@type=\"number\"])[11]"));
		N11.sendKeys("778");
		WebElement N12 = driver.findElement(By.xpath("(//*[@type=\"number\"])[12]"));
		N12.sendKeys("778");

		//4. Then we have to click on the save button 
		
		WebElement Save_button = driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]"));
		Save_button.click();
		
		// 5.Then again the save Popup button will show again we have to click .
		
		WebElement Popup_save_button = driver.findElement(By.cssSelector("[class=\"save\"]"));
		Popup_save_button.click();
	
	
		System.out.println("All the data has been saved succesfully in network details");
		Thread.sleep(3000);

		
		
		 
		 

	}

}