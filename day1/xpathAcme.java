package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathAcme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String title =driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Log ')]")).click();
		driver.close();
		

	}

}
