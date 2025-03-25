package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		// XPath with Single Attribute
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mobile");
		// XPath with Multiple Attribute
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Laptop");
		// XPath with 'AND' Operator
//		driver.findElement(By.xpath("//input[@name='search'and @placeholder='Search']")).sendKeys("Pen");
		// XPath with 'OR' Operator
//		driver.findElement(By.xpath("//input[@name='search'or @placeholder='Searches']")).sendKeys("Mobile");
		// XPath by text()
//		driver.findElement(By.xpath("//a[text()='Your Store']")).click();
		boolean status = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(status);
		String text = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(text);
		driver.close();

	}

}
