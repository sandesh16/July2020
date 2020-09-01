package JavaScripsExecutorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:100/");
		
		//Sendkey syntax
		WebElement element=driver.findElement(By.name("user_name"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='admin';", element);
		
		
		WebElement element1=driver.findElement(By.name("user_password"));
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].value='admin';", element1);
		
		
		//on click 
		WebElement element3= driver.findElement(By.name("Login"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		//execute.executeScript("arguments[0].Click();", element3);
		executor.executeScript("arguments[0].click();", element3);
		
	}

}
