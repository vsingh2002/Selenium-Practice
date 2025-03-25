package assignment_day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("Welcome page is displayed");
		} else {
			System.out.println("Welcome page is not displayed");
		}
		// driver.manage().window().setPosition(new Point(600, 300));
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println(height);
		System.out.println(width);
		driver.manage().window().setSize(new Dimension(400, 400));
		Thread.sleep(2000);
		driver.quit();
	}

}
