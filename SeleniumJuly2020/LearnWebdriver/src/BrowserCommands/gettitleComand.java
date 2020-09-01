package BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitleComand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Loads URL in the browser
		driver.get("http://google.com/");
		//Fetches the Title of the currently loaded URL
		String Title = driver.getTitle();
		System.out.println(Title);

	}

}
