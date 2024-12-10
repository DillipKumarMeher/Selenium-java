package a00_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToYoutube {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("search_query")).sendKeys("Mor jaanu sange mor mulakat karei de");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//button[@id='search-icon-legacy' and @aria-label='Search']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("video-title")).click();
	}

}
