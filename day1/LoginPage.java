package seleniumSample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	//To launch facebook login page
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
  driver.get(" http://www.Facebook.com");
  driver.manage().window().maximize();
  Thread.sleep(1000);
  driver.close();
	
	}
}
