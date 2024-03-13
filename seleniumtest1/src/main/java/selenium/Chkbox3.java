package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chkbox3 {
	WebDriver driver;
	WebElement chkbox;
	
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
@Test
//Run | Debug
public void testcase1() {
	driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	String title = driver.getTitle();
	String exptitle = "Selenium Easy - Checkbox demo for automation using selenium";
	Assert.assertEquals(title, exptitle);
}
@Test
public void testcase2() {
	chkbox = driver.findElement(By.cssSelector("#isAgeSelected"));
	chkbox.click();
	System.out.println("After Select: "+chkbox.isSelected());
	Assert.assertTrue(chkbox.isSelected());
}
@Test
public void testcase3() {
	
	chkbox.click();
	System.out.println("After UnSelect: "+chkbox.isSelected());
	Assert.assertTrue(chkbox.isSelected());
}

@AfterClass
public void teardown() {
	driver.quit();
}
}
