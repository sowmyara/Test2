package T1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drive", "D:\\Selenium Webdriver\\Chrome driver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://demoqa.com/automation-practice-form");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Maximize window 
		d.manage().window().maximize();
		//Enter Firstname
		d.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("test");
		// Enter lastname
	    d.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("lastname");
	    //Enter email
		d.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("test@demo.com");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Scroll page
		JavascriptExecutor js = (JavascriptExecutor) d;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    //wait
	    d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
		 d.findElement(By.xpath("//label[@class=\"custom-control-label\" and contains(text(),\"Male\")]")).click();
		 
		 //Enter mobile number 
		 d.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("123456789");
		 
		//Selecting date from date picker
		 d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 d.findElement(By.xpath("//*[@id=\"subjectsInput\"]")).sendKeys("QA Demo");
		 
		 JavascriptExecutor js1 = (JavascriptExecutor) d;
		   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 d.findElement(By.xpath("//div[@class=\"text-right col-md-2 col-sm-12\"]/button[@id=\"submit\"]")).click();
		d.quit();
	}

}
