package Sel1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	    
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		                      .withTimeout(Duration.ofSeconds(20))
		                      .pollingEvery(Duration.ofMillis(100))
		                      .ignoring(NoSuchElementException.class);
		WebElement CreateAc = wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.xpath("//a[text()='Create New Account']"));
				}
		});
				CreateAc.click();
	}
}
