package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		// getTitle() - returns the title of the Page
		System.out.println(driver.getTitle());
		// getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl());
		// getPageSource() - returns sourceCode of the page
//		System.out.println(driver.getPageSource());
		// getWindowHandle() - returns ID of the single Browser Window
//		String windowHandle = driver.getWindowHandle();
//		System.out.println("Window ID:" + windowHandle);
		// getWindowHandles() - returns ID's of multiple browser windows
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowHanldes = driver.getWindowHandles();
		System.out.println(windowHanldes);
		driver.quit();

	}

}
