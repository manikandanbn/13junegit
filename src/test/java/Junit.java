
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit extends baseclasss{
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static  void online() {
            WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
		
	}

	@Before
	public  void browserLaunch() {

		launchChrome();
		loadUrl("https://www.facebook.com/");
	     winMax();
	}
	
	@Test
	public  void url() {

		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
	}
	@Test
	public void title() {

		System.out.println("connecting people");
	}
	
	@After
	public  void login() {

		System.out.println("greens@gmail.com");
	}
	
	@Ignore
	
	
	@After
	public  void loginpass() {

		System.out.println("techgreen");
		
	}
	
 
	
	
	 
	@AfterClass
	public static void automation() {

		System.out.println("automation");
	}
	
	
	
	
	
	
	
	
	
	
}
