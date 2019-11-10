package mmt.makemytrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
    private static WebDriver driver = null;
    static String webSite = "https://www.makemytrip.com/"; 
    static String fromLocation = "hyderabad";   
    static String toLocation = "bangalore";
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
    	makemytripReviewTest();
        
    }
    public static void makemytripReviewTest() throws InterruptedException{
    	driver = new ChromeDriver();
        driver.get(webSite);
		driver.manage().window().maximize();
        WebElement fromCity = driver.findElement(By.id("fromCity"));							
        fromCity.sendKeys(fromLocation);
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("react-autowhatever-1-section-0-item-0")));
        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
        fromCity.sendKeys(Keys.ESCAPE);
        WebElement toCity = driver.findElement(By.id("toCity"));
        toCity.sendKeys(toLocation);
        Thread.sleep(2000);
        WebDriverWait waitAgain = new WebDriverWait(driver, 30);
        waitAgain.until(ExpectedConditions.elementToBeClickable(By.id("react-autowhatever-1-section-0-item-0")));
        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
        driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[3]")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBlack widgetSearchBtn ']")).click();
      
    }
}
