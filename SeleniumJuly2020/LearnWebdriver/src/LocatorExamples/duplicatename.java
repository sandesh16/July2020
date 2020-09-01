package LocatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class duplicatename {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/All%20Testing/All%20Selenium/Selenium%20Notes/Day%204/Locators/NameDuplicateExample.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("Pancake")).click();
		
		//driver.findElement(By.xpath("/html/body/div/button[1]")).click();
	
	}

}
