package DoctorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This testcase examines Doctor's Prescriptions views, step by step process of creating New prescription,and print prescription of shasthonet.com in localhost

public class LocalhostPrescription{

	public static void main(String[] args) throws InterruptedException{
	
		//This Test will check the functionality of prescription 
		String[] username={"doctor1"};
		String[] password={"123456"};
		
		// Testcase verifies web browser commands for Chrome
		String exePath = "D:\\AutomationTesting\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.0.5");
		Thread.sleep(5000);		
		driver.findElement(By.name("UserCode")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("UserCode")).submit();
		Thread.sleep(5000);
		
		// Prescription access using the following xpath
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[4]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[4]/ul/li[1]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("search-patient")).sendKeys("R");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='page-container']/section/div/div[1]/div[1]/div[2]/ul/li[4]/a")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[1]/div[3]/textarea")).sendKeys("Bad Headeche");
		Thread.sleep(5000);
		driver.findElement(By.id("search-medicine")).sendKeys("napa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[2]/div[1]/div/div/ul/li[3]/a/span/span")).click();
		Thread.sleep(5000);		
		driver.findElement(By.id("search-medicine")).sendKeys("filmet");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[2]/div[1]/div/div/ul/li[2]/a/span/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[3]/textarea")).sendKeys("Additional Notes should be here");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='search-disease']")).sendKeys("a");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[4]/div[1]/div/div/ul/li[2]/a/span/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[4]/div[3]/textarea")).sendKeys("Other Provisional Disease Notes should be here");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='advice']/label[1]/div/ins")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='advice']/label[2]/div/ins")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='advice']/label[3]/div/ins")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[5]/div[3]/textarea")).sendKeys("Other Advice Note(s) should be here");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[5]/div[4]/div/div[1]/input")).sendKeys("15");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[5]/div[4]/div/div[2]/label/div/ins")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/footer/button[2]")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("/html/body/div/footer/div/button/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/footer/div/ul/li[1]/a")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[4]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userlogout")).click();
		Thread.sleep(5000);
		driver.close();
	}

}

