package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		//action.doubleClick(driver.findElement(By.xpath("//button[contains(text(),\"Click\")]"))).perform();
		driver.findElement(By.xpath("//button[contains(text(),\"Click\")]")).click();
		action.doubleClick().pause(Duration.ofSeconds(2)).perform();
		
	}

}
