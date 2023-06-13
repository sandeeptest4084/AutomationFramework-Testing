package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		
		driver.findElement(By.cssSelector("label[for='cb_red']")).click();

		// tests the first check box which is ticked on page load
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_red']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_red']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_red']")).isEnabled());
		System.out.println("                    ");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='cb_green']")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_green']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_green']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_green']")).isEnabled());
		Thread.sleep(5000);
		System.out.println("                    ");
		driver.findElement(By.cssSelector("label[for='cb_blue']")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_blue']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_blue']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("label[for='cb_blue']")).isEnabled());
	}

}
