package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

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
//	        WebElement Anyclk2 = driver.findElement(By.xpath("//video[contains(@class,'video-stream html5-main-video')]"));
//	        Anyclk2.click(); 
	        WebElement ssasa = driver.findElement(By.xpath("//video"));
	        Actions acti = new Actions(driver);
	        acti.click(ssasa).build().perform();
	        
	        WebElement Skipadd = driver.findElement(By.xpath("//button[contains(@class,'ytp-ad-skip-button ytp-button')]"));
	        Skipadd.click(); 
	        
	        WebElement ssasaa = driver.findElement(By.xpath("//video"));
	        Actions act = new Actions(driver);
	        act.click(ssasaa).build().perform();
	}

}
