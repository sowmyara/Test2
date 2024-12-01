package P;

import org.testng.annotations.Test;

  import java.io.IOException;
  import java.util.concurrent.TimeUnit;

  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.testng.annotations.DataProvider;

  import junit.framework.Test;

  public class ExcelReader {

  	
  		public void setup() {
  			
  			System.setProperty("webdriver.chrome.drive", "D:\\Selenium Webdriver\\Chrome driver.exe");
  			
  			WebDriver d = new ChromeDriver();
  			
  			d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  			d.manage().window().maximize();
  		
  		}
  		
  		@Test(@dataProvider="Test")
  		public void  hardCode(String Fname, String Lname) {
  			
  			System.out.println(Fname+" "+Lname);
  			
  		}
  		
  	
  		
  		
  		@DataProvider(name ="Test")
  		  public String [][] getData() throws IOException   
  		  {
  		
  			String data[][] = {
  					
  					{"Sowmya","R"},
  					{"Emids","Bangalore"}
  			};
  			return data;		    
  		  }	
  			}
  		
  		
  		
  	
  		
  		
  				
  				
  	}



}


