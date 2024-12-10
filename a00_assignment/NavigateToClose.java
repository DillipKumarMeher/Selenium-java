package a00_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToClose {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/?srsltid=AfmBOorkX4pxcYqF_pwyEPUxM7-ezdrOYwSYDQsWDxzQ65BUshXbeg3c");

		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			} 
			catch (Exception e) {
				Thread.sleep(3000);
			}
		}
		List<WebElement> find = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
		for(WebElement x:find){
			System.out.println(x.getText());
		}
	}
}

