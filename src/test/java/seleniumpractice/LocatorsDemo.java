package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		// name
		driver.findElement(By.name("search")).sendKeys("Mac");
		// id
		boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayStatus);
		// linkText & partialLinkText
//		driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Tab")).click();
	}

}
