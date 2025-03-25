package assignment_day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookApplication 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Log in to Facebook"))
		{
			System.out.println("Welcome page is displayed");

		} 
		else 
		{
			System.out.println("Welcome page is not displayed");
		}
		driver.close();

	}

}
