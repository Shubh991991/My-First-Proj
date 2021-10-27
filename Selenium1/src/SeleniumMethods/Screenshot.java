package SeleniumMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://en-gb.facebook.com/"); 
		  driver.manage().window().maximize();
		  
	    File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File Test = new File("C:\\Users\\shubh\\Desktop\\Screenshot\\Test "+timestamp()+" .jpeg");
	   	FileHandler.copy(source,Test);
	
	}
	public static String timestamp() {
		return new SimpleDateFormat("YYYY-MM-dd HH-mm-ss").format( new Date());
	}
  
}
