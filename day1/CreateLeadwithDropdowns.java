package seleniumSample;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadwithDropdowns {

	public static void main(String[] args) {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//To Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//To Maximize windows
		driver.manage().window().maximize();
		//Enter Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mithra");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Welcome to Test Leaf");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality analyst");
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
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title= driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
	}

	}


