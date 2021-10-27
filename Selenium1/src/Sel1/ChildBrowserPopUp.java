package Sel1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alertBox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirmBox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement promtBox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement lineBox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	   
		alertBox.click();
		confirmBox.click();
		promtBox.click();
		lineBox.click();
		
		String mainPageAddr = driver.getWindowHandle();
		System.out.println(mainPageAddr);
		
	    ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		 
		for(int i=0; i<addr1.size(); i++)
		{
			String a = addr1.get(i);
			driver.switchTo().window(a);
			String url = driver.getCurrentUrl();
			System.out.println("index" + i + " " + a + " " + url);
		}	
	}
}
