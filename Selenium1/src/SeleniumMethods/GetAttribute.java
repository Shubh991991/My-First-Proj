package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	
 	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
	    
	    Thread.sleep(3000);
		WebElement UserName= driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	  //  signup.click();
	   // Thread.sleep(3000);
	    
	    String attributeValue = UserName.getAttribute("aria-label");
	    if (attributeValue.equals("Email address or phone number"))
	    {
	    	System.out.println("Text is verified");
	    }
	    else
	    {
	    	System.out.println("Text is wrong");
        }
}
}
