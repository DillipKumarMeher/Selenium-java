package a00_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateToVtigerCopyNo_1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.vtiger.com/about/");
				
		Actions action = new Actions(driver);
		action.moveByOffset(733, 34).perform();
		
		driver.findElement(By.xpath("(//li[@class='list-item'])[32]")).click();
		
		 WebElement print = driver.findElement(By.xpath("(//p[@class='font-size-sm mb-0'])[2]"));
		System.out.println(print.getText());
	}

}
