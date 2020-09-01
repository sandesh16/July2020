package LocatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) {
		
		//JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		driver.get("http://localhost:100/");

		driver.manage().window().maximize();

		//Sendkey
		WebElement element = driver.findElement(By.name("user_name"));
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='admin';", element);
		
		//sendkey
		WebElement element1 = driver.findElement(By.name("user_password"));
		//JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='admin';", element1);
		
		
		//onclick
		WebElement element2 = driver.findElement(By.name("Login"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element2);
		
		

		

	}

}
