package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		// Print number of links in the Entire Page
		System.out.println("The Total Number of Links in the Entire webpage is:");
		System.out.println(driver.findElements(By.tagName("a")).size());
		// Printing number of links only in the footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("The Total Number of Links in the Footer section is:");
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// Printing no of elements in the Discount Coupons section
		WebElement discoupen = driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println("The Total Number of Links in the Discount Coupen section is :");
		System.out.println(discoupen.findElements(By.tagName("a")).size());
		int count = discoupen.findElements(By.tagName("a")).size();
		for(int i=1;i<count;i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			discoupen.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}
		// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
