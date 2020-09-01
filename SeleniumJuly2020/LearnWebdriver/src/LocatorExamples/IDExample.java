package LocatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("testing");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.id("loginbutton")).click();

	}

}
