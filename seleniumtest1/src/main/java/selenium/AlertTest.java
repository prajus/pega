package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		 /* driver.findElement(By.linkText("See an example alert")).click(); Alert alert
		 * = wait.until(ExpectedConditions.alertIsPresent()); String text =
		 * alert.getText(); System.out.println(text); alert.accept();
		 */
		//Thread.sleep(3000);
		/*
		 * driver.findElement(By.linkText("See a sample confirm")).click();
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert =
		 * driver.switchTo().alert(); String text = alert.getText(); Thread.sleep(3000);
		 * alert.dismiss();
		 */
		//Click the link to activate the alert
		 Actions action = new Actions(driver);
		 driver.findElement(By.linkText("See a sample prompt")).click();
		 //Wait for the alert to be displayed and store it in a variable
		 
		 action.scrollToElement(driver.findElement(By.linkText("See a sample confirm"))).click();
		 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		 //Type your message
		 alert.sendKeys("Selenium");
		 Thread.sleep(3000);
		 //Press the OK button
		 alert.accept();
		
	}

}
