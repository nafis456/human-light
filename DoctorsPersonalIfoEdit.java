package DoctorTest;

// This test will checks the functionality of personal information 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoctorsPersonalIfoEdit {

	public static void main(String[] args) throws InterruptedException{
		
		String[] username={"doctor1"};
		String[] password={"123456"};
		// Testcase verifies web browser commands for Chrome
		String exePath = "D:\\AutomationTesting\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		String url= ("http://www.shasthonet.com");
		driver.get (url);
		Thread.sleep(1000);

		// Storing Title name in the String variable
		String title = driver.getTitle();
 
		// Storing Title length in the Int variable
		int titleLength = driver.getTitle().length();
		 
		// Printing Title & Title length in the Console window
		System.out.println("Title of the page is : " + title );
		System.out.println("Length of the title is :" + titleLength );
        
		// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();
 
		if (actualUrl.equals(url)){
			//Print Verification successful message
			System.out.println("Verification Successful - The correct Url is opened.");
		}else{
			//Print Verification failed message
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + actualUrl);
			System.out.println("Expected URL is : " + url);
		}
 
		// Storing Page Source in String variable
		String pageSource = driver.getPageSource();
 
		// Storing Page Source length in Int variable
		int pageSourceLength = pageSource.length();
 
		// Printing length of the Page Source on console
		System.out.println("Total length of the Page Source is : " + pageSourceLength);		
		
		driver.findElement(By.name("UserCode")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("UserCode")).submit();
		Thread.sleep(1000);
		System.out.println("The Doctor has successfully logged in");		
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[2]/a/span")).click();
		Thread.sleep(5000);
		System.out.println("It shows the menus of Profile");
		
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/section/ul/li[2]/ul/li[1]/a/span")).click();
		Thread.sleep(5000);
		System.out.println ("Doctor's Profile Viewed Successfully");
		
		driver.findElement(By.xpath("//*[@id='edit-basic']/a")).click();
		Thread.sleep(1000);
		System.out.println("It opens the editing page of Profile");
		
		driver.findElement(By.xpath("//*[@id='basic-info']/div/div[2]/div/div/div[1]/div[1]/div/input")).clear();
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='basic-info']/div/div[2]/div/div/div[1]/div[1]/div/input")).sendKeys("Dr. Rifat");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='basic-info']/div/div[2]/div/div/div[1]/div[2]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='basic-info']/div/div[2]/div/div/div[1]/div[2]/div/input")).sendKeys("Luchi");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='basic-info']/div/div[2]/div/div/div[1]/div[3]/div/label[1]/div/ins")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='basic-info']/div/div[2]/div/div/div[1]/div[3]/div/label[2]/div/ins")).click();
		Thread.sleep(5000);
						
		driver.findElement(By.xpath("//*[@id='basic-info']/div/div[2]/div/div/div[1]/div[5]/div/span/span[1]/span/span/b")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='reg-info']/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='basic-info']/div/div[2]/div/div/div[1]/div[6]/div/button[1]")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[4]/a/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("userlogout")).click();
		Thread.sleep(10000);
		System.out.println ("The Doctor logged Out Succesfully"); 
		driver.close();
		
		
		
	}

}
