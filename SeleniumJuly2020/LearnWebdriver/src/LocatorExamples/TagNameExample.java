package LocatorExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameExample {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

	//	driver.findElement(By.name("q")).sendKeys("selenium tutorial");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	//	 Thread.sleep(3000);
		// driver.findElement(By.name("btnK")).click();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

	//	for (int i = 0; i < links.size(); i = i ++) {
			//System.out.println(links.get(i).getText());
			//System.out.println(getText());
			for(WebElement link : links)
			{
				System.out.println(link.getText());
			
		}
	}

}
