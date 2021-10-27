package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {
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
//    WebElement Anyclk2 = driver.findElement(By.xpath("//video[contains(@class,'video-stream html5-main-video')]"));
//    Anyclk2.click(); 
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(1000);
    js.executeScript("window.scrollBy(0,-500)");
    
    WebElement Skipadd = driver.findElement(By.xpath("//button[contains(@class,'ytp-ad-skip-button ytp-button')]"));
    Skipadd.click(); 
//    WebElement Quality = driver.findElement(By.xpath("//button[contains(@class,'ytp-button ytp-settings-button')]"));
//    Quality.click(); 
//    WebElement Speed = driver.findElement(By.xpath(" (//div[@class='ytp-menuitem-content'])[2]"));
//    Speed.click(); 
//    WebElement Speed2 = driver.findElement(By.xpath("//div[text()='2']"));
//    Speed2.click(); 
//    Thread.sleep(2000);
//    WebElement Anyclk = driver.findElement(By.xpath("//video[contains(@class,'video-stream html5-main-video')]"));
//    Anyclk.click();
    
  
//    WebElement ssasa = driver.findElement(By.xpath("//video"));
//    Actions act = new Actions(driver);
//    act.doubleClick(ssasa).build().perform();
//    
    WebElement ssasaa = driver.findElement(By.xpath("(//span[@id='video-title'])[1]"));
    Actions act = new Actions(driver);
    act.moveToElement(ssasaa).click().build().perform();

}
}
