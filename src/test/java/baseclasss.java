import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclasss {
    public static Actions a;
	static WebDriver driver;
	
	public static void launchChrome() {
 
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		
	}
	public static void loadUrl(String Url) {
 
		driver.get(Url);
	}
	
	public static void winMax() {
	driver.manage().window().maximize();

	}
	
	public static void printTitle() {
	 String title = driver.getTitle();
	 System.out.println(title);

	}
	
	public static void printCurrentUrl() {
	 String currentUrl = driver.getCurrentUrl();
	 System.out.println(currentUrl);
		
	}
	
	public static void fill(WebElement ele ,String value) {
		ele.sendKeys("greens");
		
	}
	
	public void btnclick(WebElement ele) {
		 ele.click();

	}
	
	public void rightClick(WebElement ele) {
    a = new Actions(driver);
    a.contextClick(ele).perform();
	}
	
	public void doubleClick(WebElement ele) {
	    a = new Actions(driver);
	    a.doubleClick(ele).perform();
		}
		
	public void dateandtime() {

		Date d = new Date();
		System.out.println(d);
	}
	
	
	
	
	
	
	
	
	
	

}
