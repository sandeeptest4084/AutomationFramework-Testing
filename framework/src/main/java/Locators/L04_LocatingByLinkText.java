package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_LocatingByLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");;
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Toggle']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Actions']")).click();
		
	}

} 
