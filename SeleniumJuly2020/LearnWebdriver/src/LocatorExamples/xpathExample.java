package LocatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();
		
		
		//Absolute Xpath
		//driver.findElement(By.xpath("/html/body/div/button[1]")).click();

		//Relative xpath
		driver.findElement(By.xpath("//*[@id=\"pancakes\"]/button[1]")).click();
	}

}
