package AlertsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestConfirmationAlert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		//click on new asccount link
		driver.findElement(By.linkText("New Account")).click();
		Thread.sleep(2000);
		//enter text
		driver.findElement(By.name("accountname")).sendKeys("testing");
		
//save text box
		driver.findElement(By.name("button")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("Delete")).click();
		
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		
		driver.switchTo().alert().dismiss();
		
	}

}
