import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		// For printing all radio buttons with "group1" as name
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		// Storing the count in a variable
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		Thread.sleep(2000L);
		// For clicking in every radiobuttons
		for (int i = 0; i < count; i++) {
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

		}

	}
}
