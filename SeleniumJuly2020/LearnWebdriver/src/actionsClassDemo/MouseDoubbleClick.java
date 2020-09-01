package actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubbleClick {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:100/index.php");

		Actions act = new Actions(driver);
		// Double click on element

		WebElement trialaction = driver.findElement(By.name("Login"));
	
		act.doubleClick(trialaction).perform();
		

		System.out.println("Mouse doubble click performed");
	}

}
