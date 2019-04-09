package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogMeIntoCitrix {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://archway.riotinto.org/vpn/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id='Enter user name']	")).sendKeys("mobin.francis");
		driver.findElement(By.xpath("//input[@title='Enter password']")).sendKeys("Spicegarden2019@");
		driver.findElement(By.cssSelector("#Log_On")).click();
		Thread.sleep(5000L);
		driver.findElement(By.id("skipWizardLink")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//div[@id='desktopSpinner_idCitrix.MPS.Desktop.APAC.Desktop_0020Windowed_0020-_0020APAC1']")).click();
	}

}
