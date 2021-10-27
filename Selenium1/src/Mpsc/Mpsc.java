package Mpsc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mpsc {

	 public static void main(String[] args) throws InterruptedException {
		    	
		    	System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
		    	WebDriver driver = new ChromeDriver();
		    	
		    	
				driver.get("https://mpsc.gov.in/");
		    	driver.manage().window().maximize();
		    	Thread.sleep(5000);
		    	
		    	WebElement Online = driver.findElement(By.xpath("//a[text()='Online facilities']"));
                Online.click();
                
                Thread.sleep(5000);
                
                WebElement Application = driver.findElement(By.xpath("//a[text()='Online Application System']"));
                Application.click();
                
//                Alert alt = driver.switchTo().alert();
//                
//                Thread.sleep(5000);
//                WebElement registeration = driver.findElement(By.xpath("//a[text()='User Registration']"));
//                registeration.click();
	}

}
