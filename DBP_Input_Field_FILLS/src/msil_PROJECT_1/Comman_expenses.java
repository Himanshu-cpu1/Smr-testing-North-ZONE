package msil_PROJECT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Comman_expenses {
	public static void commanexpenses(WebDriver driver) throws InterruptedException {
		

		// Then click on the comman expenses option on the left side....
		
		driver.findElement(By.xpath("(//*[@class=\"mat-list-text\"])[14]")).click();
		Thread.sleep(4000);
		
		// Depreciation & Rent
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("4");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")).sendKeys("5");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[6]")).sendKeys("6");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[7]")).sendKeys("7");
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[9]")).sendKeys("9");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[10]")).sendKeys("10");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[11]")).sendKeys("11");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[12]")).sendKeys("12");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[13]")).sendKeys("13");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[14]")).sendKeys("14");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[15]")).sendKeys("15");

		driver.findElement(By.xpath("(//*[@type=\"text\"])[17]")).sendKeys("17");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[18]")).sendKeys("18");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[19]")).sendKeys("19");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[20]")).sendKeys("20");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[21]")).sendKeys("21");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[22]")).sendKeys("22");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[23]")).sendKeys("23");

		driver.findElement(By.xpath("(//*[@type=\"text\"])[25]")).sendKeys("25");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[26]")).sendKeys("26");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[27]")).sendKeys("27");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[28]")).sendKeys("28");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[29]")).sendKeys("29");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[30]")).sendKeys("30");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[31]")).sendKeys("31");
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[41]")).sendKeys("41");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[42]")).sendKeys("42");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[43]")).sendKeys("43");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[44]")).sendKeys("44");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[45]")).sendKeys("45");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[46]")).sendKeys("46");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[47]")).sendKeys("47");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[48]")).sendKeys("48");

		driver.findElement(By.xpath("(//*[@type=\"text\"])[50]")).sendKeys("50");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[51]")).sendKeys("51");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[52]")).sendKeys("52");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[53]")).sendKeys("53");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[54]")).sendKeys("54");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[55]")).sendKeys("55");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[56]")).sendKeys("56");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[57]")).sendKeys("57");
		
		
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved succesfully in OTHER EXPENSES");
		
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
	     actions.sendKeys(Keys.PAGE_UP).perform();
	     
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		Thread.sleep(3000);
		
		// Click  On the 	OTHER EXPENSES and fill all the required fields
		
		driver.findElement(By.cssSelector("[id=\"nav-Expense-tab\"]")).click();
		
		Thread.sleep(3000);
		
		// Comman expenses Amount
		driver.findElement(By.xpath("(//*[@type=\"text\"])[82]")).sendKeys("34222");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[84]")).sendKeys("52111");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[86]")).sendKeys("62776");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[88]")).sendKeys("32244");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[90]")).sendKeys("4311243");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[92]")).sendKeys("521125");
		
		
		driver.findElement(By.xpath("(//*[@type=\"text\"])[94]")).sendKeys("34111");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[96]")).sendKeys("44553");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[98]")).sendKeys("44223");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[100]")).sendKeys("765432");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[102]")).sendKeys("443321");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[104]")).sendKeys("2352325");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[106]")).sendKeys("234111");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[108]")).sendKeys("413414");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[110]")).sendKeys("67635");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[112]")).sendKeys("132331");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[114]")).sendKeys("1111312");
		driver.findElement(By.xpath("(//*[@type=\"text\"])[116]")).sendKeys("13312112");
		
		/* Then we see that Total Common Expenses
		(Inc. Rent + BO Sal + Dep + LT Int + Overheads) and 
		  Total Overheads
         (Wo. Rent + BO Sal + Dep + LT Int)  is adding single or not......
		
		*
		*/
		// then we will save the all data 
		driver.findElement(By.xpath("(//*[@type=\"buttton\"])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"save\"]")).click();
		
		System.out.println("all the data has been saved succesfully in comman expenses");

		Thread.sleep(3000);
		
		
	}

}
