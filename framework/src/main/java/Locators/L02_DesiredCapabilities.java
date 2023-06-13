package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class L02_DesiredCapabilities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");
		/*
		 * DesiredCapabilities cap = DesiredCapabilities.chrome();
		 * 
		 * cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 * cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 * 
		 * 
		 * ChromeOptions option = new ChromeOptions(); option.merge(cap);
		 */

		WebDriver driver = new ChromeDriver();

		driver.get("https://expired.badssl.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("details-button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(1000);

	}

}
