package assignment_day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Bus Ticket Booking Online made Easy, Secure with Top Bus Operators - redBus")) {
			System.out.println("Home Page is displayed");
		} else {
			System.out.println("Home page is not displayed");
		}
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		driver.quit();

	}

}
