import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrometest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
//		driver.get("http://zerodha.com");
//		System.out.println(driver.getCurrentUrl());// Printing current url
////		System.out.println(driver.getPageSource());
//		driver.get("https://www.guru99.com/");
//		driver.navigate().back();
		driver.get("http://globaleducation.net.in/");
		driver.findElement(By.id("name")).sendKeys("mobin");
		

	}

}
