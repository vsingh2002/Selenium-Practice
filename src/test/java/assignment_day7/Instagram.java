package assignment_day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();

		List<WebElement> headings = driver.findElements(By.xpath("//h1 | //h2 | //h3 | //h4 | //h5 | //h6"));
		int count = headings.size();
		System.out.println(count);
		driver.findElement(By.tagName("span")).click();

	}

}
