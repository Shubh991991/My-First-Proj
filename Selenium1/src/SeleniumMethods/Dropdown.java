package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
	    
	  
		WebElement CreateAccount= driver.findElement(By.xpath("(//a[contains(@class,'_42ft ')])[3]"));
		CreateAccount.click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		
	    Select s = new Select(day);
	    Thread.sleep(3000);
//	    s.selectByIndex(0);
	    s.selectByVisibleText("13");
}
}