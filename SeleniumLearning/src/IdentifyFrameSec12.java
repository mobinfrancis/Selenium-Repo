import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyFrameSec12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int framecount=driver.findElements(By.tagName("iframe")).size();
		for(int i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			driver.findElement(By.id("recaptcha-anchor")).click();
			driver.findElement(By.)
		}
//		driver.switchTo().frame((WebElement) By.name("a-apnrexyzn43t"));
//		

	}

}
