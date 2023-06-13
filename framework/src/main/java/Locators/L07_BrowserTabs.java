package Locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_BrowserTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\software\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/browserTabs.html");
		
		for(int i=0;i<3;i++) {
			driver.findElement(By.xpath("//input[@value='Open Tab']")).click();
		}
		
		ArrayList<String> windowsHandles = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("There are " + windowsHandles.size() + " tabs open");

//		for(String item:windowsHandles) {
//			Thread.sleep(1500);
//			driver.switchTo().window(item);
//
//		}
		Thread.sleep(2000);
		System.out.println(driver.switchTo().window(windowsHandles.get(0)));
		
		
	}

}
