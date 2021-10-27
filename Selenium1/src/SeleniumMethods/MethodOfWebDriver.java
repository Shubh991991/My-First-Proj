package SeleniumMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWebDriver {
	public static void main(String[] args) throws InterruptedException {
		
	       System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(3000);
	       driver.navigate().to("https://www.google.com/");
	       Thread.sleep(3000);
           driver.navigate().back();
	       Thread.sleep(3000);
	       driver.navigate().forward();
	       Thread.sleep(3000);
	       driver.navigate().refresh();
	       String title =driver.getTitle();
	       System.out.println(title);
	       String url = driver.getCurrentUrl();
	       System.out.println(url);
	       driver.manage().window().maximize();
	       Dimension d = new Dimension(600,300);
	       driver.manage().window().setSize(d);
	       
	       Thread.sleep(5000);
	       Point p = new Point(300,600);
	       driver.manage().window().setPosition(p);
	}		     
}
