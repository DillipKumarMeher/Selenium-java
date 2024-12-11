package a01_webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Uers/GANGA/Desktop/Selenium_Kiran/MultipleWindow%20(1).html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value'Open Food Sites']")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
	}
}
