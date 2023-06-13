package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropdownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		
		WebElement element = driver.findElement(By.cssSelector("select#cars"));
		
		Select menuItem = new Select(element);
		
		//selecting by visible text as it appears on the web page:
		menuItem.selectByVisibleText("Honda");
		
		//selecting by option value (as it appears in the HTML):
	//	menuItem.selectByValue("jeep");
		
	//	menuItem.selectByIndex(2);
		
		
	}

}
