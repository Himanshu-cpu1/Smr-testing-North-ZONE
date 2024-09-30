package vahan_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import java.io.File;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class VAHAN_DATA {
	public static WebDriver driver;
    public WebDriverWait wait;

    
    // ALL state and RTO 
    
    private static final List<Map.Entry<String, String>> statesAndRTOs = Arrays.asList(
        new AbstractMap.SimpleEntry<>("All Vahan4 Running States (35/36)", "All Vahan4 Running Office(1361/1503)"),
        new AbstractMap.SimpleEntry<>("Andaman & Nicobar Island(8)", "All Vahan4 Running Office(3/3)"),
        new AbstractMap.SimpleEntry<>("Andhra Pradesh(80)", "All Vahan4 Running Office(80/80)"),
        new AbstractMap.SimpleEntry<>("Arunachal Pradesh(27)", "All Vahan4 Running Office(27/27)"),
        new AbstractMap.SimpleEntry<>("Assam(36)", "All Vahan4 Running Office(33/33)"),
        new AbstractMap.SimpleEntry<>("Bihar(49)", "All Vahan4 Running Office(48/48)"),
        new AbstractMap.SimpleEntry<>("Chhattisgarh(30)", "All Vahan4 Running Office(30/30)"),
        new AbstractMap.SimpleEntry<>("Chandigarh(1)", "All Vahan4 Running Office(1/1)"),
        new AbstractMap.SimpleEntry<>("UT of DNH and DD(3)", "All Vahan4 Running Office(3/3)"),
        new AbstractMap.SimpleEntry<>("Delhi(23)", "All Vahan4 Running Office(16/16)"),
        
        new AbstractMap.SimpleEntry<>("Goa(13)", "All Vahan4 Running Office(13/13)"),
        new AbstractMap.SimpleEntry<>("Gujarat(37)", "All Vahan4 Running Office(37/37)"),
        new AbstractMap.SimpleEntry<>("Himachal Pradesh(113)", "All Vahan4 Running Office(95/110)"),
        new AbstractMap.SimpleEntry<>("Haryana(179)", "All Vahan4 Running Office(98/98)"),
        new AbstractMap.SimpleEntry<>("Jharkhand(31)", "All Vahan4 Running Office(25/25)"),
        new AbstractMap.SimpleEntry<>("Jammu and Kashmir(21)", "All Vahan4 Running Office(21/21)"),
        new AbstractMap.SimpleEntry<>("Karnataka(68)", "All Vahan4 Running Office(68/72)"),
        new AbstractMap.SimpleEntry<>("Kerala(87)", "All Vahan4 Running Office(87/87)"),
        new AbstractMap.SimpleEntry<>("Ladakh(3)", "All Vahan4 Running Office(3/3)"),
        new AbstractMap.SimpleEntry<>("Maharashtra(56)", "All Vahan4 Running Office(54/54)"),
        
        new AbstractMap.SimpleEntry<>("Meghalaya(13)", "All Vahan4 Running Office(13/13)"),
        new AbstractMap.SimpleEntry<>("Manipur(12)", "All Vahan4 Running Office(12/12)"),
        new AbstractMap.SimpleEntry<>("Madhya Pradesh(53)", "All Vahan4 Running Office(53/53)"),
        new AbstractMap.SimpleEntry<>("Mizoram(10)", "All Vahan4 Running Office(10/10)"),
        new AbstractMap.SimpleEntry<>("Nagaland(9)", "All Vahan4 Running Office(9/9)"),
        new AbstractMap.SimpleEntry<>("Odisha(39)", "All Vahan4 Running Office(39/39)"),
        new AbstractMap.SimpleEntry<>("Punjab(95)", "All Vahan4 Running Office(95/95)"),
        new AbstractMap.SimpleEntry<>("Puducherry(8)", "All Vahan4 Running Office(8/8)"),
        new AbstractMap.SimpleEntry<>("Rajasthan(143)", "All Vahan4 Running Office(59/60)"),
        new AbstractMap.SimpleEntry<>("Sikkim(9)", "All Vahan4 Running Office(9/9)"),
        
        new AbstractMap.SimpleEntry<>("Tamil Nadu(148)", "All Vahan4 Running Office(148/148)"),
        new AbstractMap.SimpleEntry<>("Tripura(9)", "All Vahan4 Running Office(9/10)"),
        new AbstractMap.SimpleEntry<>("Uttarakhand(21)", "All Vahan4 Running Office(21/21)"),
        new AbstractMap.SimpleEntry<>("Uttar Pradesh(78)", "All Vahan4 Running Office(77/77)"),       
        new AbstractMap.SimpleEntry<>("West Bengal(56)", "All Vahan4 Running Office(56/57)")       
                                   
    );

    @SuppressWarnings("deprecation")
	@BeforeClass
    public void setup() throws InterruptedException {
        // Set Chrome options
        String downloadFilepath = "C:\\Users\\Thinkpad\\Desktop\\vahan_portal";   // path of the Desktop
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
        for (Map.Entry<String, String> entry : statesAndRTOs) {
            String state = entry.getKey();
            String rto = entry.getValue();

            driver.get("https://vahan.parivahan.gov.in/vahan4dashboard/vahan/vahan/view/reportview.xhtml");
            Thread.sleep(4000);

            filterSelection(state, rto);
            Thread.sleep(2000);
            parivahan();
        }
    }

    public void filterSelection(String state, String rto) throws InterruptedException {
        selectOption("(//*[@role=\"combobox\"])[1]", "(//*[text()=\"Actual Value\"])[3]");     // Actual Fillter 
        selectOption("(//*[@role=\"combobox\"])[2]", "(//*[text()=\"" + state + "\"])[2]");    // State Fillter
        Thread.sleep(4000);
        selectOption("(//*[@role=\"combobox\"])[3]", "(//*[text()=\"" + rto + "\"])[3]");       //  RTO Fillter
        selectOption("(//*[@role=\"combobox\"])[4]", "(//*[text()=\"Maker\"])[2]");             // Y-axis  Fillter
        selectOption("(//*[@role=\"combobox\"])[5]", "(//*[text()=\"Vehicle Category\"])[5]");  // X-Axis Fillter
        selectOption("(//*[@role=\"combobox\"])[6]", "(//*[text()=\"Calendar Year\"])[5]");     //  year type Fillter
        selectOption("(//*[@role=\"combobox\"])[7]", "(//*[text()=\"2024\"])[3]");              //  YEAR  Fillter

        WebElement refresh = driver.findElement(By.xpath("(//*[text()=\"Refresh\"])[1]"));
        refresh.click();  // refresh button
        Thread.sleep(5000);
    }

    public void parivahan() throws InterruptedException {
        WebElement side = driver.findElement(By.cssSelector("[class=\"ui-icon ui-icon-arrow-4-diag\"]"));
        side.click();       // click on the side button to open Fillter options
        Thread.sleep(3000);

        List<String> optionsToClick = Arrays.asList(    // Option to select
            "FOUR WHEELER (Invalid Carriage)",
            "LIGHT MOTOR VEHICLE",
            "LIGHT PASSENGER VEHICLE",
            "ADAPTED VEHICLE",
            "MOTOR CAR",
            "MOTOR CAB"
        );

        clickOptions(driver, optionsToClick);

        WebElement side1 = driver.findElement(By.cssSelector("[class=\"ui-icon ui-icon-triangle-1-w\"]"));
        side1.click();          // click on the side butoon to close the  Fillter Option
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
        download.click();  // download the excel file
        Thread.sleep(2000);

        WebElement refresh = driver.findElement(By.xpath("(//*[text()=\"Refresh\"])[1]"));
        refresh.click();  // refresh button
        Thread.sleep(3000);
        
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
            Thread.sleep(2000);
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



