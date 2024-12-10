package a00_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Dahibara");
		Thread.sleep(1000);
		
		driver.findElement(By.id("LastName")).sendKeys("Babu");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("Dahibara@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Company")).sendKeys("Jannat.Ltd");
		
	}

}
