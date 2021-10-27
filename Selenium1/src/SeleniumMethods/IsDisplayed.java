package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(3000);
		WebElement signup = driver.findElement(By.xpath("(//a[contains(@class,'_42ft ')])[3]"));
	    signup.click();
	    Thread.sleep(3000);
	    WebElement Male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	    Male.click();
//	    WebElement Custom = driver.findElement(By.xpath("(//input[@class='_8esa'])[3]"));
//	    Custom.click();
	    WebElement hiddenElement = driver.findElement(By.xpath("//select[@class='_7-16 _9hk6 _5dba']"));
	   // hiddenElement.click();
	    boolean result = hiddenElement.isDisplayed();
	    if(result)
	    {
	    	System.out.println("It is present");
	    }
	    else
	    {
	    	System.out.println("It is absent");
	    }
	}

}
//https://www.facebook.com/
//select[@class='_7-16 _9hk6 _5dba']