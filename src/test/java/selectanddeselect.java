import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectanddeselect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//
//		WebElement findElement = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//		findElement.click();
//		Thread.sleep(3000);
//		WebElement ll = driver.findElement(By.xpath("//select[@title='Month']"));
//		ll.click();
//
//		Select s = new Select(ll);
//
////		s.selectByIndex(1);
////		s.selectByVisibleText("Mar");
////		s.selectByValue("11");
//		if (s.isMultiple()) {
//			System.out.println("select more options");
//			
//		} else {
//
//			System.out.println("select one option");
//		}
//
//		List<WebElement> alloptions = s.getOptions();
//
//		int size = alloptions.size();
//		System.out.println(size);
//
//		System.out.println("============for loop=======");
//		for (int i = 0; i < alloptions.size(); i++) {
//			WebElement eachopt = alloptions.get(i);
//			System.out.println(eachopt.getText());
//
//		}
//		System.out.println("=======enhanced for loop=====");
//
//		for (WebElement eachoptt : alloptions) {
//			System.out.println(eachoptt.getText());
//
//		}
//		System.out.println("=========allllllll============");

driver.get("https://output.jsbin.com/osebed/2");
WebElement findElement = driver.findElement(By.id("fruits"));

Select s = new Select(findElement);
s.selectByIndex(0);
s.selectByValue("apple");
s.selectByVisibleText("Orange");
WebElement firstSelectedOption = s.getFirstSelectedOption();
System.out.println(firstSelectedOption.getText());
s.deselectAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
