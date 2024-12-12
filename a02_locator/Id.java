package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.qspiders.com/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("8303516167");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("Sameer@1234");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div/section[2]/article/div/main/form/main/button")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("/html/body/div/section[1]/article/nav/ul/li/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")).click();
		
	}

}
