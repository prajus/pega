package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class MouseOverExample {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
	driver.get("https://www.selenium.dev/selenium/web/mouseOver.html");
	WebElement redbox= driver.findElement(By.id("redbox"));
	String color1 = redbox.getCssValue("background-color");
	Color redboxcolor = Color.fromString(color1);
	System.out.println(color1 + redboxcolor.toString());
	action.moveToElement(redbox).build().perform();
	color1 = redbox.getCssValue("background-color");
	System.out.println(color1 + redboxcolor.getClass());
	System.out.println(color1 + redboxcolor.toString());
	Thread.sleep(500);
	driver.close();
}
}
