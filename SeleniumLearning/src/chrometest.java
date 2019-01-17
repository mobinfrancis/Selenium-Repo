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
		driver.get("https://gitlab.com/users/sign_in");
		driver.findElement(By.id("user_login")).sendKeys("mobinfrancis");
		driver.findElement(By.id("user_password")).sendKeys("Kristujayanti1");
		//driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("//*[@id=\'new_user\']/div[5]/input"));

	}

}
