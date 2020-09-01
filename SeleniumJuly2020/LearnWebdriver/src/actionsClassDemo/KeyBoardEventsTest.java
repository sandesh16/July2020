package actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("C:\\Users\\Sandesh\\Desktop\\test.HTML");
		
		driver.manage().window().maximize();
		
		 WebElement username= driver.findElement(By.id("Username"));
		 WebElement CurrentAddress= driver.findElement(By.id("CurrentAddress"));
		 WebElement PermanentAddress= driver.findElement(By.id("PerAddress"));
		 WebElement SubmitButton= driver.findElement(By.id("Submit"));
		 
		 Actions action=new Actions(driver);
		 action.sendKeys(username, "Sandesh").perform();
		 
		 //Enter Current Addess
		 action.click(CurrentAddress).sendKeys("Davbindu Society Pune").perform();
		 
		 
		 //copy current  addess
		 action.keyDown(CurrentAddress,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		 action.keyDown(CurrentAddress,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		 
		// action.keyDown(Keys.CONTROL.
		 
		 //Paste
		// action.keyDown(PermanentAddress,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		 
		 SubmitButton.click();
	
	}

}
