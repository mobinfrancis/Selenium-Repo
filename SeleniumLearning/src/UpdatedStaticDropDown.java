import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.spicejet.com/");
		
		System.out.println(d.findElement(By.id("divpaxinfo")).getText());
		d.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1;i<=5;i++)
		{
		//Incrementing the Adult
		d.findElement(By.id("hrefIncAdt")).click();
		}
		//Clicking on Done after incrementing the adult
		d.findElement(By.id("btnclosepaxoption")).click();
		//Getting the count of adults finally
		System.out.println("Final Value:");
		System.out.println(d.findElement(By.id("divpaxinfo")).getText());
		

	}

}
