package a00_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerCaptureUserName {

	public static void main(String[] args) {
		String actual = "Paaji";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");

		WebElement kk = driver.findElement(By.id("username"));
		kk.clear();
		kk.sendKeys(actual);

		String mm = kk.getAttribute("value");
		if (mm.equals(actual)) {
			System.out.println("it is curect");
		} else {
			System.out.println("it is not currect");
		}

	}

}
