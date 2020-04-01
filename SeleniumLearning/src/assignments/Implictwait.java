package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implictwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.reuters.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector(".tab-2")).click();
	WebDriverWait eweight = new WebDriverWait(driver,5);
	eweight.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".tab-2")));
	driver.findElement(By.cssSelector(".tab-2")).click(); 
	
	}

}
