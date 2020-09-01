package CalenderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.linkText("Calendar")).click();
		driver.findElement(By.linkText("test")).click();
		
		driver.findElement(By.name("Edit")).click();
		
		
		//Cliking on calender control
		driver.findElement(By.id("jscal_trigger_date_start")).click();
		driver.findElement(By.id("jscal_trigger_date_start")).sendKeys("2020-08-17");
		
		driver.findElement(By.xpath("//div[@class='calendar'][1]/table//tr[4]/td[3]")).click();
	}

}
