package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		// to launch empty driver
		ChromeDriver driver = new ChromeDriver();
		
		// to open web appln
		driver.get("https://www.facebook.com/");
		
		// to cpture current url
		String urlOfTheWebPage = driver.getCurrentUrl();
		System.out.println(urlOfTheWebPage);
	}

}
