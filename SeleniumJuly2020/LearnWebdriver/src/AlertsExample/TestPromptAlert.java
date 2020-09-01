package AlertsExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPromptAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("file:///D:/All%20Testing/All%20Selenium/Selenium%20Notes/Day%206/Alerts/Prompts/Prompts1.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		//Swithc to alert
		Alert aler=driver.switchTo().alert();
		
		//enetring data
		driver.switchTo().alert().sendKeys("Sandesh");
		
		aler.accept();
		
		System.out.println(aler.getText());
	}

}
