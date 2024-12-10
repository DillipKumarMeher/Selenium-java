package a00_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckReg {
	
public static void main(String[]args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Register")).click();
	
	
}
}
