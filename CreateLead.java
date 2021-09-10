package testcase;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day1.BaseClass;
import week5.day1.Data;

public class CreateLead extends BaseClass {
    
	@Test(dataProvider="sendData")
	public void runCreateLead(String firstName,String lastName,String company,String phoneNo) {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNo);
		driver.findElement(By.name("submitButton")).click();
//		driver.close();
}
	@DataProvider
	public String[][] sendData() throws IOException{
		return Data.readData();
			}
}






