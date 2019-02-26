package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class CheckboxAndTextVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//Clicking on Checkbox
		driver.findElement(By.id("checkBoxOption2")).click();
		//Grabbing the Value
		String cbValue=driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		//Implemeting Select Class
		Select s = new Select (driver.findElement(By.id("dropdown-class-example")));
		// Selecting Value from dropdown
		s.selectByValue(cbValue);
		//Entering the value to text box
		driver.findElement(By.id("name")).sendKeys(cbValue);
		//Clicking on Alert
		driver.findElement(By.id("alertbtn")).click();
		//Verification 
		String alertMsg=driver.switchTo().alert().getText();
		Assert.assertTrue(alertMsg.contains(cbValue));
		driver.close();
		
	}

}
