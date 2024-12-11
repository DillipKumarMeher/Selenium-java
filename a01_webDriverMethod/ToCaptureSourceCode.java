package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		
		//Capture the source code
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
	}
}
