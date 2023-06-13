package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L01_ChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.automationtesting.co.uk");

	}

}
