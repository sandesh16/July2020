package listCollection;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtabs {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		
		obj.get("http://localhost:100/");
		
		obj.manage().window().maximize();
			
		obj.findElement(By.partialLinkText("Outlook")).click();
		Thread.sleep(3000);
		 ArrayList<String> tabs = new ArrayList<String> (obj.getWindowHandles());
		 obj.switchTo().window(tabs.get(1));
		 
	
		 obj.close();
		 
		 obj.switchTo().window(tabs.get(0));



	}

}
