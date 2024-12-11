package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		driver.quit();
	}

}
