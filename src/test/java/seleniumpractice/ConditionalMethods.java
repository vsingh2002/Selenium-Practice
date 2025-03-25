package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods

{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		// isDisplayed
//		WebElement element = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println(element.isDisplayed());

//		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//		System.out.println(status);
		// isEnabled
//		boolean enabled = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println(enabled);
		// isSelected
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(male.isSelected());
		System.out.println("After selecting");
		male.click();
		System.out.println(male.isSelected());

		boolean femaleRadioButton = driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
		System.out.println(femaleRadioButton);
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Before Selecting :" + checkBox.isSelected());
		checkBox.click();
		System.out.println("After selecting :" + checkBox.isSelected());
		
	}

}
