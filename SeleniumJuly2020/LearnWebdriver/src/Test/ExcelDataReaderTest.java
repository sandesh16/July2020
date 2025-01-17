package Test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataReaderTest {

	public static void main(String[] args) throws Exception {
		// create Excel file and keep on your computer
		FileInputStream fis = new FileInputStream("C:\\Driver\\ExcelPractice\\test.xlsx");
		
		// create object of workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// create object of sheet
		XSSFSheet sheet = workbook.getSheetAt(0);

		//in excel keep data at row 1 and cell1
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		System.out.println(cell);
		System.out.println(sheet.getRow(0).getCell(0));

		String celllvalue = cell.getStringCellValue();
		System.out.println(celllvalue);
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(celllvalue);
		
		
	}

}
