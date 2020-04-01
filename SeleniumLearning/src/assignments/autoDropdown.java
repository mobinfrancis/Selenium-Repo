package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.KeyDownAction;

public class autoDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(3000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
