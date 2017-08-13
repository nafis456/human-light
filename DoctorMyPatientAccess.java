package DoctorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This testcase examines doctors using the patients feature in the shasthonet web app using Chrome
public class DoctorMyPatientAccess {

		public static void main(String[] args) throws InterruptedException{
		
		String[] username={"doctor1"};
		String[] password={"123456"};
		
		// Testcase verifies web browser commands for Chrome
		String exePath = "D:\\AutomationTesting\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.shasthonet.com");
		Thread.sleep(5000);
		driver.findElement(By.name("UserCode")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("UserCode")).submit();
		Thread.sleep(2000);
		
		// Patients access using the following xpath
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
		
		// My Health Records access using the following xpath
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[3]/ul/li/a/span")).click();
		Thread.sleep(2000);
		SearchContext element= driver.findElement(By.id("search-input"));
		((WebElement) element).sendKeys("r");
		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.xpath("//*[@id='page-container']/div[1]/div[2]/ul/li[6]/a/span/span"));
		clk.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='patientList']/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		
		//Writing msg to msg box
		driver.findElement(By.id("message")).sendKeys("Here is a Testing Message for you !!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='modal-message']/div/div/div[3]/button")).click();
		System.out.println("Message has been sent succesfully");
		Thread.sleep(2000);
		
		//Access appointment button
		driver.findElement(By.xpath("//*[@id='patientList']/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		//Taking appointment
		driver.findElement(By.xpath("//*[@id='SL-5-2']")).click();
		Thread.sleep(2000);
		
		// confirm Appointment
		driver.findElement(By.xpath("//*[@id='app-confirm']/div/div/div[3]/button[2]")).click();
		driver.navigate().back();
		
		// Presscription button access 
		driver.findElement(By.xpath("//*[@id='patientList']/div[1]/div/div[3]/button[3]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[4]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userlogout")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
