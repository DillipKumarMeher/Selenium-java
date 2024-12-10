package a00_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegister {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Dahibara");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Babu");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("Dahibara126@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Dahibara@123");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Dahibara@123");
		Thread.sleep(3000);
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		}

}
