package Sel1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td"));
		list.size();
		
		for(int i=0; i<18; i++)
		{
		String value = list.get(i).getText();
		System.out.println(" " + value + " ");
		}
}
}

