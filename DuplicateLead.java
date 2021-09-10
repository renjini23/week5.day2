package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.Details;
import week5.day1.ReadDuplicateLeadData;


public class DuplicateLead extends Details {
	
	@Test(dataProvider="sendData")
	public void runDuplicateLead(String phoneNum) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
//		driver.close();
}
	@DataProvider
	public String[][] sendData() throws IOException
	{
		return ReadDuplicateLeadData.readData();
	}
}






