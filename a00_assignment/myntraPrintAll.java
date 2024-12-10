package a00_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraPrintAll {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		//Thread.sleep(2000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
		for(WebElement x: ele){
			System.out.println(x.getText());
		}
	}
}
