package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000L);
		//driver.switchTo().alert().dismiss();
		WebElement source=driver.findElement(By.id("FromTag"));
		source.clear();
		source.sendKeys("MAA");
		Thread.sleep(2000L);
		source.sendKeys(Keys.ENTER);
		driver.findElement(By.id("DepartDate")).click();

	}

}
