package Week2Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount 
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
		
		//Click on Create Account
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		Select slt = new Select(driver.findElement(By.id("currencyUomId")));
		Thread.sleep(5000);
		slt.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Ramji");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Karur");
		driver.findElement(By.xpath("(//form[@id='createAccountForm']//input[@class='inputBox'])[5]")).sendKeys("5000000");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		String err = driver.findElement(By.xpath("//div[@class='errorMessageHeader']")).getText();
		System.out.println(err);
		String str = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println(str);		
		driver.close();
	}
}
