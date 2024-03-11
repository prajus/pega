package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement dropdown= driver.findElement(By.name("my-select"));
		WebElement dropdown1= driver.findElement(By.name("my-disabled"));
		Select s= new Select(dropdown);
		Select s1= new Select(dropdown);
		s.selectByIndex(2);
		s.selectByValue("1");
		s.selectByVisibleText("Three");
		Boolean isenabled = dropdown.isEnabled();
		System.out.println(isenabled);
		isenabled = dropdown1.isEnabled();
		System.out.println("Dropdown is "+isenabled);
		WebElement textbox = driver.findElement(By.name("my-password"));
		Boolean isenabled1=textbox.isEnabled();
		System.out.println("Textbox is "+isenabled1);
		WebElement dropdown2= driver.findElement(By.name("my-select"));
				
	}

}
