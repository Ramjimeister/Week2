package Week2Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[3]/input")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//ul/li[4]//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//div[6]//div[@id='left-content-column']//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account Ramji");
		driver.findElement(By.xpath("//div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[9]/td[2]/textarea")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//div[6]//input[@id='groupNameLocal']")).sendKeys("Ramji");
		driver.findElement(By.id("officeSiteName")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[6]//input[@id='annualRevenue']")).sendKeys("1500000");
		driver.findElement(By.xpath("//div[6]//form[@id='createAccountForm']//input[@value='Create Account']")).click();		
		driver.close();
	}

}
