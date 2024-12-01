package T1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FileReader {
  
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filepath = "D:\\\\POCDemo.xls";
		
		FileInputStream fi = new FileInputStream(filepath);
		XSSFWorkbook S = new XSSFWorkbook(fi);     
        XSSFSheet sourceSheet = S.getSheetAt(0);
        
        
         System.setProperty("webdriver.chrome.drive", "D:\\Selenium Webdriver\\Chrome driver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://demoqa.com/automation-practice-form");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Maximize window 
		d.manage().window().maximize();
		//Enter Firstname
		//d.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys(sourceSheet.G);
		// Enter lastname
	    //d.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("lastname");
        
		
		
		
		
		
		
		
		
		
	}

}
