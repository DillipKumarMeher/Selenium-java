package a00_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatToInstagramEnterUnameAndPAssWithOutUsingThread {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		//Thread.sleep(1000);
		
		//it is not working 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dgdgd");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qqq1212");
	}
}
