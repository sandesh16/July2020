package OpenBrowsersExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriveExample {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(300, 500));
		//driver.manage().window().setPosition(new Point(50, 200));
		
		driver.findElement(By.name("email")).sendKeys("testing");
		driver.findElement(By.name("pass")).sendKeys("webdriver");
		driver.findElement(By.id("loginbutton")).click();
		
		//Thread.sleep(7000);
		//driver.quit();
	

	}

}
