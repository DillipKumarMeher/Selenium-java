package a00_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon\"]")).sendKeys("Oneplus");
		Thread.sleep(1000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
