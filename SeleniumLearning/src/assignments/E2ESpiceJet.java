package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2ESpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		// Clicking in Origin
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// Selecting Bengaluru
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		// Clicking on Destination
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		// Selecting MAA[2]
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		//if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		//{

		//System.out.println("its enabled");

		//Assert.assertTrue(true);

		//}

		//else

		//{
//
		//Assert.assertTrue(false);

		//}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1;i<=5;i++)
		{
		//Incrementing the Adult
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		//Clicking on Done after incrementing the adult
		driver.findElement(By.id("btnclosepaxoption")).click();
		//Getting the count of adults finally
		System.out.println("Final Value:");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

	}

}
