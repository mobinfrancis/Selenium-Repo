package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		//Switching to frame-top
		
		driver.switchTo().frame("frame-top");
		
		//Switching to "frameset-middle"
		
		//driver.switchTo().frame("frameset-middle");
		
		//Switching to frame-middle
		
		driver.switchTo().frame("frame-middle");
		
		//fetching text 
		String fr=driver.findElement(By.xpath("//div[@id='content']")).getText();
		
		System.out.println(fr);
		

	}

}
