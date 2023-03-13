package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mithra");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Handled the QA Team");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9234567890");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ram@gmail.com");
		
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(sourceDD);
		source.selectByValue("LEAD_COLDCALL");
		
		WebElement MCDD =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MC = new Select(MCDD);
		MC.selectByIndex(1);
		
		WebElement IndustryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select Industry = new Select(IndustryDD);
		Industry.selectByVisibleText("Insurance");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("updateLeadForm_firstName")).sendKeys("a");
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Designation will anounced later");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		String title= driver.getTitle();
		System.out.println(title);
		driver.close();
	
	}
}
