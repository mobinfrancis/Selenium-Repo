import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1550051342086/");
		Thread.sleep(4000L);
		
		//Explicit wait
		WebDriverWait d = new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Where do you need a hotel?']")));
		//WebElement source = driver.findElement(By.xpath("//input[@placeholder='Where do you need a hotel?']"));
		//source.click();
		//source.sendKeys("NYC");
		//source.sendKeys(Keys.ARROW_DOWN);
		//source.click();
	

	}

}
