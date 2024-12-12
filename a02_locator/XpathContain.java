package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContain {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
		//String ErrorMsg = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		//System.out.println(ErrorMsg);
		
		String errormsg = driver.findElement(By.xpath("//span[contains(text(),'Please ')]")).getText();
		System.out.println(errormsg);
	}

}
