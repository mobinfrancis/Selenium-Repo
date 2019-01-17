import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class salesforcetest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("mobinfrancis@live.com");
		driver.findElement(By.id("password")).sendKeys("wrongpass");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}

}
