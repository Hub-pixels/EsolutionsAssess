package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "/Users/habdugo/Desktop/EclipseIDEWorkSpace/merchantEsolutions/src/Drivers/chromedriver 2");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://qainterview.merchante-solutions.com:8080/admin/users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.linkText("New User")).click();
		driver.findElement(By.xpath("//*[@id='user_username']")).sendKeys("Johnson");
		driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("marsrover1");
		driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("johnsonm@visa.com");
		driver.findElement(By.xpath("//*[@value='Create User']")).click();
		
		 
		              
		
		

	}

}
