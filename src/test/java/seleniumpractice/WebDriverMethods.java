package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {

		// Launch a Browser
		WebDriver driver = new ChromeDriver();
		// Open URL
		driver.get("https://demo.opencart.com/");
		// Validate Title should be "Your Store"
		String actual_title = driver.getTitle();
		if (actual_title.equals("Your Store")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Fail");
		}
		Thread.sleep(3000);

		driver.close();

	}
}
