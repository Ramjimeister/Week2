package Week2Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		//Click on Find Accounts button
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'accountlimit100')]")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Retreive Account Name
		String str = driver.findElement(By.id("accountName")).getAttribute("value");
		System.out.println(str);
		String str2=driver.findElement(By.xpath("//textarea[@name='description']")).getText();
		System.out.println(str2);
		String str3=driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
		System.out.println(str3);
		driver.close();
	}

}
