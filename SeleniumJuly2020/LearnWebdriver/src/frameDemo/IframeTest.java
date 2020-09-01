package frameDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("C:\\Users\\Sandesh\\Desktop\\Frame.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
				
		/*
		 * WebElement iframeElement=driver.findElement(By.id("IF1"));
		 * driver.switchTo().frame(iframeElement);
		 */
		driver.switchTo().frame("iframe1");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.className("button")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("IF1");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.className("button")).click();

	}

}
