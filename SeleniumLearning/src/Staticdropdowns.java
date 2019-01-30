import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class Staticdropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		// Automating QAClick Academy Practice Page drop down
		d.get("http://qaclickacademy.com/practice.php");
		System.out.println(d.getCurrentUrl());
		Select s = new Select(d.findElement(By.id("dropdown-class-example")));
		s.selectByValue("option2");

	}

}
