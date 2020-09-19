package AlertsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSimpleAlerts {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//test		
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		//click on new lead link
		driver.findElement(By.linkText("New Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
