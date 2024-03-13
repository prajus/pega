package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement chkbox = driver.findElement(By.cssSelector("#isAgeSelected"));
		chkbox.click();
		System.out.println("Initial Click: "+chkbox.isSelected());
		chkbox.click();
		System.out.println("Final Click: "+chkbox.isSelected());
		List <WebElement> items = driver.findElements(By.cssSelector("li._3D0G9a"));
		//div[contains(@class,'_31YxMH')]
		System.out.println(items.size());
		for(WebElement item : items) {
			//System.out.println(item.getText());
			if(item.getText().contentEquals("iphone 14 plus")) {
				System.out.println("Iphone 14 +");
				item.click();
				break;
			}
	}
	}

}
