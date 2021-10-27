package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face1 {
 
   public static void main(String[] args) throws InterruptedException {
   
   System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement signup = driver.findElement(By.xpath("(//a[contains(@class,'_42ft ')])[3]"));
      signup.click();
}
   
}
