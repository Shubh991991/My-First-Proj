package Sel1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> listofRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int RowCount = listofRow.size();
		System.out.println("RowCount" + RowCount);
		System.out.println("====================");
		
		for(int i=0; i<RowCount; i++)
		{
			List<WebElement> listCell = listofRow.get(0).findElements(By.xpath("//table[@id='customers']//tr//td["+(i+1)+"]"));
			int cellCount = listCell.size();
			System.out.println("cellCount"+ cellCount);
			System.out.println("!----------------!");
			for(int j=0; j<cellCount; j++)
			{
				String value = listCell.get(j).getText();
				System.out.println(value);
			}
			System.out.println();
		}
	}		
}
