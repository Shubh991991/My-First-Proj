package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolluptoSpecificElement {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	
		driver.get("https://jqueryui.com/");
 //   	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	WebElement addclass = driver.findElement(By.xpath("//a[text()='Add Class']"));
    	
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", addclass);
}
}
