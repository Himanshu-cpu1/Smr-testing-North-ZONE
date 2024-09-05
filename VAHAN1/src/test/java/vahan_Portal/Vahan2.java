package vahan_Portal;


	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.testng.annotations.*;

	import java.io.File;
	import java.time.Duration;
	import java.util.*;
import java.util.concurrent.TimeUnit;

	public class Vahan2 {
		public static WebDriver driver;
	    public static WebDriverWait wait;

	    private static final List<String> states = Arrays.asList(
	        "All Vahan4 Running States (35/36)",
	        "Andaman & Nicobar Island(8)",
	        "Andhra Pradesh(80)",
	        "Arunachal Pradesh(27)",
	        "Assam(36)",
	        "Bihar(49)",
	        "Chhattisgarh(30)",
	        "Chandigarh(1)",
	        "UT of DNH and DD(3)",
	        "Delhi(23)",
	        "Goa(13)",
	        "Gujarat(37)",
	        "Himachal Pradesh(113)",
	        "Haryana(179)",
	        "Jharkhand(31)",
	        "Jammu and Kashmir(21)",
	        "Karnataka(68)",
	        "Kerala(87)",
	        "Ladakh(3)",
	        "Maharashtra(56)",
	        "Meghalaya(13)",
	        "Manipur(12)",
	        "Madhya Pradesh(53)",
	        "Mizoram(10)",
	        "Nagaland(9)",
	        "Odisha(39)",
	        "Punjab(95)",
	        "Puducherry(8)",
	        "Rajasthan(143)",
	        "Sikkim(9)",
	        "Tamil Nadu(148)",
	        "Tripura(9)",
	        "Uttarakhand(21)",
	        "Uttar Pradesh(78)",
	        "West Bengal(56)"
	    );

	    private static final String downloadFilepath = "C:\\Users\\AA\\Desktop\\VAHAN_Report";

	    @SuppressWarnings("deprecation")
	    @BeforeClass
	    public void setup() {
	        // Set Chrome options
	        File file = new File(downloadFilepath);
	        if (!file.exists()) {
	            file.mkdirs();
	        }

	        ChromeOptions options = new ChromeOptions();
	        Map<String, Object> prefs = new HashMap<>();
	        prefs.put("profile.default_content_settings.popups", 0);
	        prefs.put("download.default_directory", downloadFilepath);
	        options.setExperimentalOption("prefs", prefs);

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(options);

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    }

	    @Test
	    public void VAHAN() throws InterruptedException {
	        for (String state : states) {
	            boolean success = false;
	            int attempts = 0;
	            while (!success && attempts < 3) {
	                try {
	                    driver.get("https://vahan.parivahan.gov.in/vahan4dashboard/vahan/vahan/view/reportview.xhtml");
	                    Thread.sleep(4000);

	                    filterSelection(state);
	                    Thread.sleep(2000);
	                    parivahan();
	                    Thread.sleep(2000);

	                    if (isFileDownloaded()) {
	                        success = true;
	                    } else {
	                        attempts++;
	                        if (attempts == 3) {
	                            System.err.println("Failed to download file for state: " + state);
	                        } else {
	                            System.out.println("Retrying state: " + state + " (Attempt " + (attempts + 1) + ")");
	                        }
	                    }
	                } catch (Exception e) {
	                    attempts++;
	                    if (attempts == 3) {
	                        System.err.println("Failed to process state: " + state);
	                        e.printStackTrace();
	                    } else {
	                        System.out.println("Retrying state: " + state + " (Attempt " + (attempts + 1) + ")");
	                    }
	                }
	            }
	        }
	    }

	    public void filterSelection(String state) throws InterruptedException {
	        selectOption("(//*[@role=\"combobox\"])[1]", "(//*[text()=\"Actual Value\"])[3]");     // Actual Filter 
	        Thread.sleep(2000);
	        selectOption("(//*[@role=\"combobox\"])[2]", "(//*[text()=\"" + state + "\"])[2]");    // State Filter
	        Thread.sleep(2000);
	        selectOption("(//*[@role=\"combobox\"])[4]", "(//*[text()=\"Maker\"])[2]");             // Y-axis Filter
	        Thread.sleep(2000);
	        selectOption("(//*[@role=\"combobox\"])[5]", "(//*[contains(text(),\"Vehicle Category\")])[10]");  // X-Axis Filter
	        Thread.sleep(2000);
	        selectOption("(//*[@role=\"combobox\"])[6]", "(//*[text()=\"Calendar Year\"])[5]");     // Year type Filter
	        Thread.sleep(2000);
	        selectOption("(//*[@role=\"combobox\"])[7]", "(//*[text()=\"2024\"])[3]");              // Year Filter

	        WebElement refresh = driver.findElement(By.xpath("(//*[text()=\"Refresh\"])[1]"));
	        refresh.click();  // Refresh button
	        Thread.sleep(5000);
	    }

	    public void parivahan() throws InterruptedException {
	        WebElement side = driver.findElement(By.cssSelector("[class=\"ui-icon ui-icon-arrow-4-diag\"]"));
	        side.click();       // Click on the side button to open Filter options
	        Thread.sleep(3000);

	        List<String> optionsToClick = Arrays.asList(    // Options to select
	            "FOUR WHEELER (Invalid Carriage)",
	            "LIGHT MOTOR VEHICLE",
	            "LIGHT PASSENGER VEHICLE",
	            "ADAPTED VEHICLE",
	            "MOTOR CAR",
	            "MOTOR CAB"
	        );

	        clickOptions(driver, optionsToClick);

	        WebElement side1 = driver.findElement(By.cssSelector("[class=\"ui-icon ui-icon-triangle-1-w\"]"));
	        side1.click();          // Click on the side button to close the Filter Option
	        Thread.sleep(2000);

	        Actions scrollAction = new Actions(driver);
	        scrollAction.sendKeys(Keys.PAGE_UP).perform();  // Scroll Up the Button
	        Thread.sleep(3000);

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

	        WebElement download = driver.findElement(By.cssSelector("[title=\"Download EXCEL file\"]"));
	        download.click();  // Download the Excel file
	        Thread.sleep(2000);

	        WebElement refresh = driver.findElement(By.xpath("(//*[text()=\"Refresh\"])[1]"));
	        refresh.click();  // Refresh button
	        Thread.sleep(5000);
	    }

	    //...................................................................................................
	    //........................We have Created Methods ...........................................................................

	    public void selectOption(String comboboxXPath, String optionXPath) throws InterruptedException {
	        WebElement combobox = driver.findElement(By.xpath(comboboxXPath));
	        combobox.click();
	        Thread.sleep(3000);
	        WebElement option = driver.findElement(By.xpath(optionXPath));
	        option.click();
	        Thread.sleep(2000);
	    }

	    public static void clickOptions(WebDriver driver, List<String> optionsToClick) throws InterruptedException {
	        for (String optionText : optionsToClick) {
	            WebElement option = driver.findElement(By.xpath("//*[text()=\"" + optionText + "\"]"));
	            option.click();
	            Thread.sleep(3000);
	        }
	    }

	    public boolean isFileDownloaded() {
	        // Implement logic to check if the file is downloaded
	        File folder = new File(downloadFilepath);
	        File[] listOfFiles = folder.listFiles();
	        if (listOfFiles != null) {
	            for (File file : listOfFiles) {
	                if (file.isFile() && file.getName().endsWith(".xls") || file.getName().endsWith(".xlsx")) {
	                    long diff = System.currentTimeMillis() - file.lastModified();
	                    if (diff < 60000) { // check if the file is downloaded in the last 1 minute
	                        return true;
	                    }
	                }
	            }
	        }
	        return false;
	    }
//.................................................................................................................
	    
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}