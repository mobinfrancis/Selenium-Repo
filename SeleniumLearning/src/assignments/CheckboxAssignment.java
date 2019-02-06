package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		// Clicking the First Checkbox
		driver.findElement(By.id("checkBoxOption1")).click();
		// Verifying the Checkbox is selected .
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// Unchecking the First Checkbox
		driver.findElement(By.id("checkBoxOption1")).click();
		// Verifying the Checkbox is unchecked.
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
         // Counting the number of Checkboxes in the Page
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
		;

	}

}
