package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/popups.html");

		driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();

		// slowing the test down for demonstration purposes
		Thread.sleep(3000);

		// switching to the alert and clicking the ok button
		driver.switchTo().alert().accept();

	}

}
