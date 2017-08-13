package DoctorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This testcase examines the login,Prescriptions including New prescription, Alter prescription and logout in the shasthonet web app using Chrome

public class DoctorPrescription4thCase {

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
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("UserCode")).submit();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[4]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[4]/ul/li[1]/a/span")).click();
		Thread.sleep(5000);
		
		// searching Patient access using the following xpath
		driver.findElement(By.id("search-patient")).sendKeys("n");
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id='page-container']/section/div/div[1]/div[1]/div[2]/ul/li[5]/a/span/span[2]")).click();
		Thread.sleep(5000);
		System.out.println("The search box finds and selects the desired patient successfully");
		
		//Searching symptom
		driver.findElement(By.id("search-symptom")).sendKeys("fe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[1]/div[1]/div/div/ul/li[3]/a/span/span")).click();
		Thread.sleep(5000);
		System.out.println("Searching symptom working successfully");
		
		// Writing note access using the following xpath
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[1]/div[3]/textarea")).sendKeys("Bad Headeche");
		Thread.sleep(5000);
		System.out.println("The Text box writing note works well ");
		
		// Seaching medicine
		driver.findElement(By.id("search-medicine")).sendKeys("napa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[2]/div[1]/div/div/ul/li[3]/a/span/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("search-medicine")).sendKeys("filmet");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[2]/div[1]/div/div/ul/li[2]/a/span/span")).click();
		Thread.sleep(5000);
		System.out.println("The desired medicines are coming from automatic serch box successfuly");
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[3]/textarea")).sendKeys("Additional Notes should be here");
		Thread.sleep(5000);
		System.out.println("Additional notes have been written successfully");
		driver.findElement(By.xpath("//*[@id='search-disease']")).sendKeys("a");
		Thread.sleep(5000);
		System.out.println("Searching disease dropping from box... ");
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[4]/div[1]/div/div/ul/li[2]/a/span/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[4]/div[3]/textarea")).sendKeys("Other Provisional Disease Notes should be here");
		Thread.sleep(5000);

		//Selecting Advice using check box by clicking on it
		driver.findElement(By.xpath("//*[@id='advice']/label[1]/div/ins")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='advice']/label[2]/div/ins")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='advice']/label[3]/div/ins")).click();
		Thread.sleep(5000);
		System.out.println("The check boxes are working fine and selecting the Advices successfully ");	
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[5]/div[3]/textarea")).sendKeys("Other Advice Note(s) should be here");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[5]/div[4]/div/div[1]/input")).sendKeys("15");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='medicine']/div/div[5]/div[4]/div/div[2]/label/div/ins")).click();
		Thread.sleep(5000);
		System.out.println("Prescription done and saved it to patients record successfully ");
		driver.findElement(By.xpath("/html/body/div/footer/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/footer/div/button/span[1]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		//Prescription access
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[4]/a/span")).click();
		Thread.sleep(10000);
		
		// Alter prescription
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[4]/ul/li[2]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("search-prescription")).sendKeys("n");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='page-container']/section/div/div[2]/div/div[1]/div[2]/ul/li[4]/a/span/span[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/footer/button")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[4]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userlogout")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}

