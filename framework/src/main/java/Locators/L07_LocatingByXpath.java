package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_LocatingByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/buttons.html");

		// ABSOLUTE X-PATH Example:
		// driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/button")).click();

		// RELATIVE X-PAth Example:
		driver.findElement(By.xpath("//button[@id='btn_one']")).click();
	}

}
