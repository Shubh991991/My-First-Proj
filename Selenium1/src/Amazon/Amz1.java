package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amz1 {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.gecko.driver", "E:\\Shubham\\Software Testing\\August\\Automation\\Selenium\\geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
 
      WebElement SignIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
      SignIn.click();
      WebElement EmailId = driver.findElement(By.xpath("//input[@id='ap_email']"));
      WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
      
      EmailId.sendKeys("shubham.sodewad@gmail.com");
      Continue.click();
      WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']"));
      Password.sendKeys("Shubham43");
      System.out.println("Hello");
      WebElement SignInSubmit = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
      SignInSubmit.click();
//       WebElement All = driver.findElement(By.xpath("(//span[text()='All'])[2]"));   
//      All.click();  
//     
//      WebElement Mobiles = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")); 
//      Mobiles.click();
//      WebElement Samsung = driver.findElement(By.xpath("//span[text()='Samsung']"));
//      Samsung.click();
       Thread.sleep(5000);
        WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
        Mobiles.click();
//      WebElement Mobile = driver.findElement(By.cssSelector("body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-t1.a-aui_launch_cardui_a11y_fix_346896-t1.a-aui_launch_expander_ally_fix_354901-t1.a-aui_markup_disabled_link_btn_351411-t1.a-aui_pci_risk_banner_210084-c.a-aui_popover_trigger_add_role_350993-t1.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c:nth-child(2) header.nav-opt-sprite.nav-flex.nav-locale-in.nav-lang-en.nav-ssl.nav-rec.nav-progressive-attribute:nth-child(23) div.nav-sprite-v1.celwidget.nav-bluebeacon.nav-a11y-t1.bold-focus-hover.layout2.nav-flex.layout3.layout3-alt.nav-packard-glow.hamburger.nav-progressive-attribute.using-mouse div.nav-sprite:nth-child(5) div.nav-fill div:nth-child(1) div.nav-progressive-content > a.nav-a:nth-child(3)"));
//      Mobile.click();
      
//      WebElement MyAccount = driver.findElement(By.xpath("//span[text()='Hello, Shubham']"));   
//      Actions act = new Actions(driver);
//      act.moveToElement(MyAccount).build().perform();
      
      
//      WebElement SignOut = driver.findElement(By.xpath("//span[text()='Sign Out']"));   
//      Actions act1 = new Actions(driver);
//      act1.moveToElement(SignOut).click().build().perform();
//
//      driver.close();
//      //driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a")).click();
//      WebElement logo =driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//      logo.click();
//      WebElement Search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//      Search.click();
//      Search.sendKeys("OPPO F17");
//      WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//	  SearchButton.click();
//	  Thread.sleep(3000);
//	  WebElement OPPO = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]"));
//	  OPPO.click();
	}
}
