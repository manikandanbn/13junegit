import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass3 {

	private static final WindowType Url2 = null;
	public static WebDriver driver;
	public static Actions b;
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

	public static void getCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void fill(WebElement ele,String value) {
        ele.sendKeys(value);
		
	}
	
	public static void fill(WebElement ele) {
        ele.click();
		
		
	}
	
	public static void rightClick(WebElement ele) {

		b = new Actions(driver);
	    b.contextClick(ele).perform();
	    
	}   
	 
	
	





















}

