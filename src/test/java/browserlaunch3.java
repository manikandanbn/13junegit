import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserlaunch3  {
	
	public static void main(String[] args) throws AWTException {
		
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();
//		driver.get("http://www.greenstechnologys.com/");
//
//		WebElement ll = driver.findElement(By.xpath("//a[text()='COURSES']"));
//
//		Actions a = new Actions(driver);
//
//		// movetoElement
//
//		a.moveToElement(ll).perform();
//		WebElement lll = driver.findElement(By.xpath("Oracle SQL and PLSQL Placement Training"));
//		a.moveToElement(lll).perform();
		
//		driver.get("https://www.facebook.com/");
//		WebElement findElement = driver.findElement(By.id("email"));
//		//keydown keyup
//		Actions a = new Actions(driver);
//		a.keyDown(Keys.SHIFT).sendKeys(findElement,"greens").keyUp(Keys.SHIFT).perform();
//		
//		//doublecvlick
//		a.doubleClick(findElement);
////rightclick or contxt click
//		a.contextClick(findElement).perform();
//		
//		
//		//now using robo class
//		
//		Robot r = new Robot();
//		
////		r.keyPress(KeyEvent.VK_DOWN);
////		r.keyRelease(KeyEvent.VK_DOWN);
//	// we need to use 3 times so using loop
//		
//		for (int i = 0; i < 3; i++) {
//			
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		
//		//dragand drop
//		
//		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
//		
//		WebElement findElement2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//		
//		WebElement findElement3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//		
//		Actions b = new Actions(driver);
//		b.dragAndDrop(findElement2, findElement3).perform();
//		
	
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//simple alert // confrim // prompt
//		
//		WebElement findElement = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
//		findElement.click();
//		
//		WebElement findElement2 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		findElement2.click();
//		
//		Alert w = driver.switchTo().alert();
//		
//		String text = w.getText();
//		System.out.println(text);
//		
//		w.accept();
//		
		//prom pt
		

		WebElement findElement = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		findElement.click();
		
		WebElement findElement2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		findElement2.click();
		
		Alert w = driver.switchTo().alert();
		
		String text = w.getText();
		System.out.println(text);
		w.sendKeys("nagaaaaaa");
		
		w.accept();
		driver.manage().window().maximize();
		
		driver.switchTo().toString();
		driver.close();

		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
