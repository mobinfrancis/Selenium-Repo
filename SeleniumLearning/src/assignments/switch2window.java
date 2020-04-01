package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch2window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> winids= driver.getWindowHandles();
		System.out.println(winids);
		Iterator<String> it = winids.iterator();
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		while(it.hasNext())
		{
			String child=it.next();
			driver.switchTo().window(child);
			
		}
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		//Frames
		
	

	}

}
