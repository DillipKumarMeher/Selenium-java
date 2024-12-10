package a00_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbUserNameAndPassAlignOrNot {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		Point ll = driver.findElement(By.xpath("//div[@class='_6lux']")).getLocation();
		System.out.println(ll);
//		System.out.println(loc.getX());
	
	}
}
