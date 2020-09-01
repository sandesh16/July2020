package OpenBrowsersExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExample {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com/");

	}

}
