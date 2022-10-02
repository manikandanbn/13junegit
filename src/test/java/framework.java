import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class framework {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("email"));
		WebElement findElement2 = driver.findElement(By.id("pass"));
		WebElement findElement3 = driver.findElement(By.name("login"));

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		// give script bar A type executer
//		// give same like this
//		js.executeScript("arguments[0].setAttribute('value','greens')", findElement, findElement2);
//		js.executeScript("arguments[1].setAttribute('value','eeee')", findElement, findElement2);
//		js.executeScript("arguments[0].click()", findElement3);
//
//		
//		//retrive data we entered already
//		Object l = js.executeScript("return arguments[0].getAttribute('value')", findElement);
//		System.out.println(l);
//		
////		downcasting
//		System.out.println("===DOWNCASTING====");
//		String s = (String)l;
//		System.out.println(s);
//		
//		
//		Object l2 = js.executeScript("return arguments[0].get Attribute('placeholder')", findElement2);
//		System.out.println(l2);
//		String s2 = (String)l2;
//		System.out.println(s2);
//		
//		//scrolldown
//		js.executeScript("arguments[0].scrollIntoView(true)", findElement);
//		
		TakesScreenshot t = (TakesScreenshot)driver;
		
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		
		File f = new File("E:\\New folder\\Framework\\screensht\\g.png");
		
		FileUtils.copyFile(screenshotAs, f);
		
		
		
	}
}
