import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class weeebtablee {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement tabledate = driver.findElement(By.id("customers"));
		Thread.sleep(3000);
		List<WebElement> allrowvalue = tabledate.findElements(By.tagName("tr"));

		for (int i = 0; i < allrowvalue.size(); i++) {

			WebElement row = allrowvalue.get(i);

			String text = row.getText();
			System.out.println(text);
		}

	}

}
