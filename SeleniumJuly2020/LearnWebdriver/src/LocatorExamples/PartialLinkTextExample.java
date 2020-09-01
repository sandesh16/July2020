package LocatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:100/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Outlook")).click();


	}

}
