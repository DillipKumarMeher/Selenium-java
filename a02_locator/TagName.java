package a02_locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		//find how many images are there.
		//List<WebElement> image = driver.findElements(By.tagName("img"));
		//System.out.println(image.size());
		
		//How Many link are there
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		System.out.println(Link.size());
	}

	

}
