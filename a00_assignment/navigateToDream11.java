package a00_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class navigateToDream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.dream11.com/");
		
		//Switch to fram using index
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		
	}
}