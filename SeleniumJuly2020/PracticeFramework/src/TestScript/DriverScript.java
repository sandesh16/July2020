package TestScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverScript {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/Utilities/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://localhost:100");
		driver.manage().window().maximize();
		
		Xls_Reader xr = new Xls_Reader(System.getProperty("user.dir")+"/src/TestCases/TestCases.xlsx");
		int rowcount = xr.getRowCount("TC");
		System.out.println(rowcount);
		for(int i=2;i<=rowcount;i++)
		{
			String vRun = xr.getCellData("TC", "Run", i).trim();
			if(vRun.equalsIgnoreCase("ON"))
			{
				String vTCName= xr.getCellData("TC", "TCName", i).trim();
				//System.out.println(vTCName);
				switch(vTCName)
				{
				case "vTiger_login_verifyAppUrl_TC001":
					String expectedTitle= "vtiger CRM - Commercial Open Source CRM";
					String actualTitle = driver.getTitle().trim();
					if(expectedTitle.equals(actualTitle))
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
					
				case "vTiger_login_verifyAppLogo_TC003":	
					
					if(driver.findElement(By.xpath("//img[@src='include/images/vtiger-crm.gif']")).isDisplayed())
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
					
				case "vTiger_login_verifyText_KeyModule_TC004":	
					int count = driver.findElements(By.xpath("//font[text()='Key Modules']")).size();
					if(count==1)
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				case "Vtiger_login_verifyLink_vtigerCustomerPortal_TC05":						
					if(driver.findElements(By.linkText("vtiger Customer Portal")).size()==1)
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				case "vTiger_login_verifyTextBoxEditble_TC006":	
					driver.findElement(By.name("user_name")).sendKeys("hello");
					String val = driver.findElement(By.name("user_name")).getAttribute("value");
					if(val.equals("hello"))
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				case "vTiger_login_verifywithInvalidCredentials_TC007":	
					driver.findElement(By.name("user_name")).sendKeys("hello");
					driver.findElement(By.name("user_password")).sendKeys("hello123");
					driver.findElement(By.name("Login")).click();
					if(driver.findElement(By.xpath("//td[contains(text(),'You must specify a valid username and password.')]")).isDisplayed())
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				case "vTiger_login_verifywithValidCredentials_TC008":	
					driver.findElement(By.name("user_name")).clear();
					driver.findElement(By.name("user_name")).sendKeys("admin");
					driver.findElement(By.name("user_password")).clear();
					driver.findElement(By.name("user_password")).sendKeys("admin");
					driver.findElement(By.name("Login")).click();
					if(driver.findElement(By.linkText("Logout")).isDisplayed())
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				case "vTiger_verifyLead_manadatoryFields_TC0010":						
					driver.findElement(By.linkText("New Lead")).click();
					driver.findElements(By.name("button")).get(0).click();
					
					//Last Name cannot be empty
					String lnamemsg = driver.switchTo().alert().getText();
					System.out.println(lnamemsg);
					driver.switchTo().alert().accept();
					driver.findElement(By.name("lastname")).sendKeys("kuch bhi");
					driver.findElements(By.name("button")).get(0).click();
					//Company cannot be empty
					
					String compmsg = driver.switchTo().alert().getText();
					System.out.println(compmsg);
					driver.switchTo().alert().accept();
					driver.findElement(By.name("company")).sendKeys("TCS");
					driver.findElements(By.name("button")).get(0).click();					
					if((lnamemsg.equals("Last Name cannot be empty")) && (compmsg.equals("Company cannot be empty")) && (driver.findElement(By.xpath("//td[text()='Lead:   kuch bhi']")).isDisplayed()))
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				case "vTiger_verifyLead_MouseMovement_TC0013":					
					Actions act = new Actions(driver);
					act.moveToElement(driver.findElement(By.id("showSubMenu"))).build().perform();
					Thread.sleep(2000);					
					driver.findElement(By.linkText("New Vendor")).click();									
					if((driver.findElement(By.xpath("//td[text()='Vendor Name:']")).isDisplayed()))
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				case "vTiger_verifyLead_dragDrop_TC0014":	
					driver.findElement(By.linkText("My Account")).click();		
					driver.findElement(By.name("Customise")).click();					
					Actions act1 = new Actions(driver);
					act1.dragAndDrop(driver.findElement(By.id("cl1")), driver.findElement(By.id("cl4"))).build().perform();
					Thread.sleep(5000);												
					if(driver.findElement(By.id("cl4")).getText().equals("Home"))
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				case "vTiger_verify_PopUp_Window_TC0015":	
					driver.findElement(By.linkText("New Account")).click();		
					driver.findElement(By.name("btn1")).click();	
					
					Set<String> wnd = driver.getWindowHandles();
					Iterator<String> iter = wnd.iterator();
					String firstwindow = iter.next();
					System.out.println(firstwindow);
					String secondwindow = iter.next();
					System.out.println(secondwindow);
					
					driver.switchTo().window(secondwindow);
					driver.findElement(By.linkText("vtiger")).click();
					driver.switchTo().window(firstwindow);
					driver.findElement(By.name("accountname")).sendKeys("account");
														
					if(driver.findElement(By.name("account_name")).getAttribute("value").equals("vtiger"))
					{
						System.out.println(vTCName + "      = PASSED");
						xr.setCellData("TC", "Status", i, "PASSED");
					}
					else
					{
						System.out.println(vTCName + "      = FAILED");
						xr.setCellData("TC", "Status", i, "FAILED");
					}					
					break;
				}
			}
		}
		
		
		
		

	}

}
