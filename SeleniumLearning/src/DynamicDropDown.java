import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Clicking in Origin
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Selecting Bengaluru
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Clicking on Destination
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//Selecting MAA[2]
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	}

}
