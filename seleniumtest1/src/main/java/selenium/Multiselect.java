package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown= driver.findElement(By.name("cars"));
		Select s= new Select(dropdown);
		List<WebElement> optionlist = s.getOptions(); 
		System.out.println(optionlist);
		for(WebElement option : optionlist) {
			System.out.println(option.getText());
		}
		System.out.println("-----");
		s.selectByValue("volvo");
		s.selectByValue("opel");
		List<WebElement> seloptionlist = s.getAllSelectedOptions(); 
		for(WebElement option : seloptionlist) {
			System.out.println(option.getText());
		}
	}

}
