package DoctorTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This testcase validates Doctor's sigin and signout capabilities of the website http://shasthonet.com
public class DoctorLogin {

	public static void main(String[] args) throws InterruptedException{
		
		String[] username={"doctor1"};
		String[] password={"123456"};
		// Testcase verifies web browser commands for Chrome
		String exePath = "D:\\AutomationTesting\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.shasthonet.com");
		Thread.sleep(1000);
	
		driver.findElement(By.name("UserCode")).sendKeys(username);
		Thread.sleep(1000);
		//driver.findElement(By.name("Usercode")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.name("UserCode")).submit();	
 		
		//driver.findElement(By.name("Usercode")).submit();
		Thread.sleep(10000);
 
		//Closing browser
		driver.close();

	}

}



