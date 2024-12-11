package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;


public class ToCaptureTitle {

	public static void main(String[] args) {
		// to launch empty driver
		ChromeDriver driver = new ChromeDriver();
		
		//to open web browser
		driver.get("https://www.flipkart.com/");
		
		//to featch titel of broweser
		String titleOfWebPage = driver.getTitle();
		System.out.println(titleOfWebPage);
	}

}
