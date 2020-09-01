package BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitcommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Loads URL in the browser
		driver.get("http://google.com/");
		driver.quit();

	}

}
