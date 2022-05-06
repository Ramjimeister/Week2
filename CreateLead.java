package Week2Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		
		//Click on Lead Tab
		driver.findElement(By.xpath("//ul[1]//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium Test Factory");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramji");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Periyasamy");
		
		//Click Create Lead Button in the form
		driver.findElement(By.xpath("//div[6]//tr[24]//input[@name='submitButton']")).click();
		String str=driver.findElement(By.xpath("//div[6]//div[@id='sectionHeaderTitle_leads']")).getText();
		System.out.println(str);
		driver.close();
	}

}
