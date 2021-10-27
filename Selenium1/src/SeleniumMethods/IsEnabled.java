package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
	    
	    Thread.sleep(3000);
		WebElement signup = driver.findElement(By.xpath("(//a[contains(@class,'_42ft ')])[3]"));
	    signup.click();
	    Thread.sleep(3000);
	    
	    boolean result = signup.isEnabled();
	    if (result)
	    {
	    	System.out.println("Element is enabled");
	    }
	    else
	    {
	    	System.out.println("Element is Disabled");
	    }
	}

}
