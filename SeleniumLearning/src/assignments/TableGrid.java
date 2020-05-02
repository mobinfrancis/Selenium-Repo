package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22455/rcb-vs-dc-20th-match-indian-premier-league-2019");
		WebElement table = driver.findElement(By.cssSelector("div[@class="cb-col cb-col-100 cb-ltst-wgt-hdr"]));
	System.out.println(table.findElements(By.cssSelector("cb-col cb-col-8 text-right text-bold")).size());

	}

}
