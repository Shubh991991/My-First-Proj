package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Playsong {
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
        
    }
   
    
}
//WebElement Search = Driver.findElement(By.xpath("//input[@id='search']"));
//Search.sendKeys("GOLD");
//(//a[@id="video-title"])[1]
////div[@id='ad-text:1p']