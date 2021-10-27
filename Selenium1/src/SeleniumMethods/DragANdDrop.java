package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANdDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
       driver.get("https://demoqa.com/droppable");
   //  driver.manage().window().maximize();
       
       
       WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement distination = driver.findElement(By.xpath("//div[@id='droppable']"));
       
       Actions abc = new Actions(driver);
       abc.dragAndDrop(Source, distination).build().perform();
       
}
}
//https://demoqa.com/droppable