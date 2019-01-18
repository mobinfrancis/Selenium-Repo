
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customxpathcss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.office.com/");
		//XPATH METHOD  1:
		//driver.findElement(By.xpath("//a[@id='hero-banner-sign-in-to-office-365-link']")).click();
	    //XPATH METHOD 2:
		//driver.findElement(By.xpath("//a[contains(@id,'hero-banner-sign-in-to-office-365-link')]")).click();

	}

}
