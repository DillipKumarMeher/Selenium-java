package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClose {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);  //Pause my script for 2sec
		
		driver.close();
		//driver.quit();  //close server
		
		

	}

}
