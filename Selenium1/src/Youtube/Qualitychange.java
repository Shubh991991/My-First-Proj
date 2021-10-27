package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qualitychange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	
		driver.get("https://www.youtube.com/");
    	driver.manage().window().maximize();
    	WebElement Search = driver.findElement(By.xpath("//input[@id='search']"));
    	Search.sendKeys("Barsaat Ki Dhun Song");
    	Thread.sleep(3000);
    	WebElement Searchbutton = driver.findElement(By.xpath("//yt-icon[contains(@class,'style-scope ytd-searchbox')]"));
    	Searchbutton.click();
    	Thread.sleep(3000);
    	WebElement Firstsongclick = driver.findElement(By.xpath("(//a[@id=\"video-title\"])[1]"));
        Firstsongclick.click();  
        Thread.sleep(8000);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-500)");
        
        WebElement Skipadd = driver.findElement(By.xpath("//button[contains(@class,'ytp-ad-skip-button ytp-button')]"));
        Skipadd.click(); 
      
        WebElement Quality = driver.findElement(By.xpath("//button[contains(@class,'ytp-button ytp-settings-button')]"));
        Quality.click(); 
       
        WebElement qchange = driver.findElement(By.xpath("(//div[@class='ytp-menuitem-content'])[3]"));
        qchange.click(); 
       
        WebElement qchange2 = driver.findElement(By.xpath("//span[text()='360p']"));
        qchange2.click(); 
        
        
	}
}


//div[@id='columns']
//  (//div[@class='ytp-menuitem-content'])[3] Quality change

//(//div[@class='ytp-menuitem-label'])[5]