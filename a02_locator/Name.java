package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("789456123");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Dahibara@gmail.com");
	}
	
}
