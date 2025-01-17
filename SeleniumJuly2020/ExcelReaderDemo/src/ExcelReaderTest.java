import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExcelReaderTest {

	public static void main(String[] args) throws IOException {
	
		//created excel file & keep on your computer location
		FileInputStream fis=new FileInputStream ("C:\\Driver\\ExcelPractice\\test.xlsx");
		
		
		//create Object of workbook
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//create Object of sheet
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//in excel keep data at row 1 & cell 1
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		
		System.out.println(cell);
		
		System.out.println(sheet.getRow(1).getCell(0));

		String cellvalue=cell.getStringCellValue();
		System.out.println(cellvalue);
		
		//workbook.close();
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(cellvalue);

	}

}
