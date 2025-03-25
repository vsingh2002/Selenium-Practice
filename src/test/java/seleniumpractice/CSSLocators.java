package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();// maximize the browser window
		// tag Id
		// driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Books");
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Vishal");
		// tag class
		// driver.findElement(By.cssSelector("input.search-box-text
		// ")).sendKeys("Mobiles");

		// tag Attribute - We can also remove tag name if we want Syntax.
		// tag[attribute='value']
		// driver.findElement(By.cssSelector("input[placeholder='Search
		// store']")).sendKeys("Dell");
		// driver.findElement(By.cssSelector("[placeholder=\"Search
		// store\"]")).sendKeys("Phone");
		// tag class attribute - tag name is optional 
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");

	}

}
