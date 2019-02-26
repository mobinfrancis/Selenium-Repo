import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderContinued {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		
		System.out.println(driver.findElements(By.className("day")).size());
		//List<WebElement> totdates=
		int daycount=driver.findElements(By.className("day")).size();
		for(int i=0;i<daycount;i++)
		{
			String date= driver.findElements(By.className("day")).get(i).getText();
			if(date.equals("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
