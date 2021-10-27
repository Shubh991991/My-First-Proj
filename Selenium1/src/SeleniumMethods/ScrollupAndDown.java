package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupAndDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	
		driver.get("https://www.youtube.com/");
    	driver.manage().window().maximize();
    	WebElement Search = driver.findElement(By.xpath("//input[@id='search']"));
    	Search.sendKeys("Barsaat Ki Dhun Song");
    	WebElement Searchbutton = driver.findElement(By.xpath("//yt-icon[contains(@class,'style-scope ytd-searchbox')]"));
    	Searchbutton.click();
    	Thread.sleep(3000);
    	WebElement Firstsongclick = driver.findElement(By.xpath("(//a[@id=\"video-title\"])[1]"));
        Firstsongclick.click(); 
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1500)");//scroll down
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-500)");//scroll up
        Thread.sleep(7000);
//        js.executeScript("window.scrollBy(500,0)");//scroll right
//        Thread.sleep(3000);
//        js.executeScript("window.scrollBy(-500,-0)");//scroll left
        WebElement Skipadd = driver.findElement(By.xpath("//button[contains(@class,'ytp-ad-skip-button ytp-button')]"));
        Skipadd.click(); 
        
	}
}
