import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonContinuation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		// For printing no of radio buttons with "group1" as name
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		// Storing count in a variable
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i = 0; i < count; i++) {
			// Printing 'value' attributes
			System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
            // Storing the names
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			//Checking for Cheese values
			if (text.equals("Cheese")) {
				//Clicking in Cheese
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
	}
}