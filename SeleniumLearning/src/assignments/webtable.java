package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		
		//Row Count
		int rowcount = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println("ROW COUNT IS :  "+rowcount);
		
		//Col count
		int colcount = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println("COL COUNT IS :  "+colcount);
		
		//Printing the text
		
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());

	}

}
