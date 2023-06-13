package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L04_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/loader.html");

		// creating a WebDriverWait object and assigning the driver instance and a max wait time
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// setting an expected condition to check visibility of the element and parsing the locator
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#loaderBtn")));

		driver.findElement(By.cssSelector("button#loaderBtn")).click();

	}

}
