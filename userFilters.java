package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class userFilters {
	
	WebDriver driver; 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/habdugo/Desktop/EclipseIDEWorkSpace/merchantEsolutions/src/Drivers/chromedriver 2");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://qainterview.merchante-solutions.com:8080/admin/users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		Select filter= new Select (driver.findElement(By.xpath("//*[@id='q_username_input']/select")));
		
		       filter.selectByValue("username_equals");
		 driver.findElement(By.xpath("//*[@id='q_username']")).sendKeys("Johnson");
		 
		 Select e= new Select (driver.findElement(By.xpath("//*[@id='q_email_input']/select")));
		        e.selectByValue("email_equals");
		 
		 driver.findElement(By.xpath("//*[@id='q_email']")).sendKeys("johnsonm@visa.com");
		 
		 //Dynamic Drop Down YYMMDD
		 
		  driver.findElement(By.xpath("//*[@id='q_created_at_gteq_datetime']")).click();
		
		  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id='q_created_at_lteq_datetime']")).click();
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a")).click();
		 driver.findElement(By.xpath("// *[@class='buttons']/input")).submit();
		
		
		
		

	}

}
