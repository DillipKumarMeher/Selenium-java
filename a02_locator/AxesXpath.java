package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Desktop/Xpath.html");
		
		driver.findElement(By.xpath("Stree2"))		
	}

}
