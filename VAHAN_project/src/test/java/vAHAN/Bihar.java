package vAHAN;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bihar {

	 public static WebDriver driver;
	    public WebDriverWait wait;

	    @SuppressWarnings("deprecation")
		@BeforeClass
	    public void setup() throws InterruptedException {
	        // Set the desired download directory path
	        String downloadFilepath = "C:\\Vahan Downloads";
	        File file = new File(downloadFilepath);
	        if (!file.exists()) {
	            file.mkdirs();  // Create the directory if it does not exist
	        }

	        // Set Chrome options
	        ChromeOptions options = new ChromeOptions();
	        Map<String, Object> prefs = new HashMap<>();
	        prefs.put("profile.default_content_settings.popups", 0);
	        prefs.put("download.default_directory", downloadFilepath);  // Set the download directory
	        options.setExperimentalOption("prefs", prefs);

	        // Initialize ChromeDriver with options
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(options);

	        driver.get("https://vahan.parivahan.gov.in/vahan4dashboard/vahan/vahan/view/reportview.xhtml");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        Thread.sleep(4000);
	    }

	    @Test(priority = 1)
	    public void filterSelection() throws InterruptedException {
	        selectOption("(//*[@role=\"combobox\"])[1]", "(//*[text()=\"Actual Value\"])[3]");
	        selectOption("(//*[@role=\"combobox\"])[2]", "(//*[text()=\"Bihar(49)\"])[2]");
	        Thread.sleep(4000);
	        selectOption("(//*[@role=\"combobox\"])[3]", "(//*[text()=\"All Vahan4 Running Office(48/48)\"])[3]");	        	        	        
	        selectOption("(//*[@role=\"combobox\"])[4]", "(//*[text()=\"Maker\"])[2]");
	        selectOption("(//*[@role=\"combobox\"])[5]", "(//*[text()=\"Vehicle Category\"])[5]");
	        selectOption("(//*[@role=\"combobox\"])[6]", "(//*[text()=\"Calendar Year\"])[5]");
	        selectOption("(//*[@role=\"combobox\"])[7]", "(//*[text()=\"2024\"])[3]");

	        // Click on the refresh button
	        WebElement refresh = driver.findElement(By.xpath("(//*[text()=\"Refresh\"])[1]"));
	        refresh.click();
	        Thread.sleep(5000);
	    }

	    @Test(priority = 2)
	    public void parivahan() throws InterruptedException {
	        WebElement side = driver.findElement(By.cssSelector("[class=\"ui-icon ui-icon-arrow-4-diag\"]"));
	        side.click();  // click on the side button to open

	        Thread.sleep(2000);
	        // Click on the list to be select
	        List<String> optionsToClick = Arrays.asList(
	                "FOUR WHEELER (Invalid Carriage)",
	                "LIGHT MOTOR VEHICLE",
	                "LIGHT PASSENGER VEHICLE",
	                "ADAPTED VEHICLE",
	                "MOTOR CAR",
	                "MOTOR CAB"
	        );

	        clickOptions(driver, optionsToClick);

	        // Click on the side button to close
	        WebElement side1 = driver.findElement(By.cssSelector("[class=\"ui-icon ui-icon-triangle-1-w\"]"));
	        side1.click();
	        Thread.sleep(2000);

	        // Scroll up the page
	        Actions scrollAction = new Actions(driver);
	        scrollAction.sendKeys(Keys.PAGE_UP).perform();
	        Thread.sleep(3000);

	        // Click on the filter and select June
	        WebElement filter = driver.findElement(By.cssSelector("[id=\"groupingTable:selectMonth_label\"]"));
	        filter.click();
	        Thread.sleep(2000);

	        List<WebElement> options = driver.findElements(By.xpath("//*[@id and contains(@id, 'groupingTable:selectMonth_')]"));
	        for (WebElement option : options) {
	            if (option.getText().equals("JUN")) {
	                option.click();
	                break;
	            }
	        }
	        Thread.sleep(6000);

	        // Download the Excel file
	        WebElement download = driver.findElement(By.cssSelector("[title=\"Download EXCEL file\"]"));
	        download.click();
	        Thread.sleep(2000);

	        // Close the refresh page
	        WebElement refresh = driver.findElement(By.xpath("(//*[text()=\"Refresh\"])[1]"));
	        refresh.click();
	        Thread.sleep(2000);
	    }

	    public void selectOption(String comboboxXPath, String optionXPath) throws InterruptedException {
	        WebElement combobox = driver.findElement(By.xpath(comboboxXPath));
	        combobox.click();
	        Thread.sleep(1000);
	        WebElement option = driver.findElement(By.xpath(optionXPath));
	        option.click();
	        Thread.sleep(1000);
	    }

	    public static void clickOptions(WebDriver driver, List<String> optionsToClick) throws InterruptedException {
	        for (String optionText : optionsToClick) {
	            WebElement option = driver.findElement(By.xpath("//*[text()=\"" + optionText + "\"]"));
	            option.click();
	            Thread.sleep(2000); // Optionally, add a wait to ensure the click is registered properly
	        }
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
