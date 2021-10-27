package Flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip1 {


	public static void main(String[] args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\New\\chromedriver.exe");
      
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
      
  //    WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
  //    Login.click();
      Thread.sleep(5000);
      WebElement UserName = driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]"));
      UserName.sendKeys("9175790371");
      Thread.sleep(5000);
      WebElement Password = driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]"));
      Password.sendKeys("Shubham43");
      Thread.sleep(5000);
      
      WebElement Submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
      Submit.click();

	}
}
