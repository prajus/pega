package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
// Personal token: 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

public class WebFormTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			//driver.get("https://www.selenium.dev/selenium/web/web-form.html");
			/*
			 * WebElement textinput = driver.findElement(By.id("my-text-id")); WebElement
			 * passwordinput = driver.findElement(By.name("my-password")); WebElement
			 * textarea = driver.findElement(By.name("my-textarea")); WebElement
			 * selectdropdown = driver.findElement(By.name("my-select")); WebElement
			 * dropdown = driver.findElement(By.name("my-datalist")); WebElement
			 * dropdownvalue =
			 * driver.findElement(By.cssSelector("#my-options>option[value='New York']"));
			 * Select select = new Select(selectdropdown);
			 */

			/*
			 * Actions action1 = new Actions(driver); Action actiondropdowna = action1
			 * .click(dropdown) .moveToElement(dropdown) .build();
			 * textinput.sendKeys("Prakash"); passwordinput.sendKeys("Password");
			 * textarea.sendKeys("Chennai"); System.out.println(select.getOptions().size());
			 * select.selectByVisibleText("One");
			 * System.out.println(dropdown.isDisplayed()); dropdown.click();
			 * 
			 * try { Thread.sleep(5000);
			 * 
			 * }catch(InterruptedException e) { e.printStackTrace(); }
			 */
			 /* System.out.println(dropdownvalue.isDisplayed()); dropdownvalue.click();
			  * 
			 */
				/*
				 * WebElement browsefile = driver.findElement(By.name("my-file"));
				 * browsefile.click(); Thread.sleep(5000);
				 */
				/*
				 * System.out.println(browsefile.getTagName());
				 * System.out.println(browsefile.getText());
				 */
			    
			  driver.get("https://the-internet.herokuapp.com/upload");
			  File uploadFile = new File("C:\\temp\\test.txt");
			  WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
				
				  fileInput.sendKeys(uploadFile.getAbsolutePath());
				  System.out.println(fileInput);
				  System.out.println(uploadFile.getAbsolutePath());
				 
			    //fileInput.
			    //WebElement fileName = driver.findElement(By.id("uploaded-files"));
			    //Assertions.assertEquals("selenium-snapshot.png", fileName.getText());
			    Thread.sleep(5000);
				/*
				 * System.out.println(fileInput.getTagName());
				 * System.out.println(fileInput.getText());
				 */
			    System.out.println(fileInput.getAttribute("value"));
		} finally {
			driver.quit();

		}
	}

}
