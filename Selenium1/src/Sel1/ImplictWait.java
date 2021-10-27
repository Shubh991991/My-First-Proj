package Sel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\New\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://en-gb.facebook.com/");
	
	WebElement CreatAC = driver.findElement(By.xpath("//a[text()='Create New']"));
}
}