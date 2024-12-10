package a00_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateToVtigerCopyNo {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.vtiger.com/about/");
		
		WebElement kk = driver.findElement(By.partialLinkText("Company"));
		Actions action = new Actions(driver);
		action.moveToElement(kk).perform();

		driver.findElement(By.partialLinkText("Contact Us")).click();
		WebElement print = driver.findElement(By.xpath("//p[contains(text(),'9243602352')]"));
		System.out.println(print.getText());
	}
}