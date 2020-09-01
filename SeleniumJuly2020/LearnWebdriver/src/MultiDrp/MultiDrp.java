package MultiDrp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDrp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Sandesh/Desktop/multiple.html");
		
		Select drp=new Select(driver.findElement(By.id("fruits")));
		//drp.selectByVisibleText("Banana");
		//drp.selectByVisibleText("Mango");
		
		//drp.selectByValue("apple");
		//drp.selectByValue("mango");
		
		drp.selectByIndex(0);
		drp.selectByIndex(2);
		
		Thread.sleep(3000);
		drp.deselectAll();
	}

}
