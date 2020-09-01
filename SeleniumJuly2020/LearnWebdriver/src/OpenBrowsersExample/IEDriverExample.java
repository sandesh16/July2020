package OpenBrowsersExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		
		
	}

}
