package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://demo.opencart.com");
		Thread.sleep(4500);
		//js.executeScript("alert('testing')");
		WebElement macbook = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[1]/a/img"));
		//js.executeScript("arguments[0].scrollIntoView()",macbook);
		//js.executeScript("window.scrollBy(0,750)");
		js.executeScript("arguments[0].click()",macbook);
		Thread.sleep(1500);
		driver.close();
	}

}
