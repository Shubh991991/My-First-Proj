package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsofWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        WebElement UserId = driver.findElement(By.xpath("//input[@class='phone-no ']"));
        UserId.click();
        UserId.sendKeys("shubham.sodewad");
	    
        WebElement checkbox = driver.findElement(By.xpath("//span[@class='stay-signed-in checkbox-container']"));
        checkbox.isSelected();
        
        boolean result =checkbox.isSelected();
        if(result)
        {
        	checkbox.click();
        }
        else
        {
        	System.out.println("It is selected by default");
        }
	}


}
