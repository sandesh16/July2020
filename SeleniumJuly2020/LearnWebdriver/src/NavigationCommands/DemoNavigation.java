package NavigationCommands;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DemoNavigation {

	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.borland.com/gmopost/");
	
	//driver.navigate().to("http://demo.borland.com/gmopost/");
	driver.manage().window().maximize();
	
	WebElement wb= driver.findElement(By.name("bSubmit"));
	wb.click();
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	

	
	WebElement we1=	driver.findElement(By.name("QTY_TENTS"));
	we1.clear();
	we1.sendKeys("10");
	
	WebElement we2=	driver.findElement(By.name("QTY_BACKPACKS"));
	we2.clear();
	we2.sendKeys("20");
	
	driver.findElement(By.name("bSubmit")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("bSubmit")).click();
	
	Select drp=new Select(driver.findElement(By.name("CardType")));
	//drp.selectByVisibleText("American Express");
	//drp.selectByValue("MasterCard");
	//drp.selectByIndex(2);
	
	WebElement option1=  driver.findElement(By.name("shipSameAsBill"));
	option1.click();
	if(option1.isSelected())
	{
		System.out.println("Checkbox is toggle on");
	}
	
	else
	{
		System.out.println("Checkbox is toggle off");
	}
	
	option1.click();
	
	if(!option1.isSelected())
	{
		System.out.println("Checkbox is toggle off");
	}
	
	
	
	}

}
