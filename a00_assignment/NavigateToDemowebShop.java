package a00_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateToDemowebShop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books\r\n"+ "        ")).click();
		
		
		
		WebElement ref = driver.findElement(By.id("products-orderby"));
		
		Select f = new Select(ref);
		
		f.selectByVisibleText("Name: A to Z");
	
		
	}
}
