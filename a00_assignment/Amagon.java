package a00_assignment;

import org.openqa.selenium.chrome.ChromeDriver;

// Q. WAS to navigate to Amazon to capture the title 2capture the url to print it.

public class Amagon {

	public static void main(String[] args) {
		//to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		
		// to open web appln
		driver.get("https://www.amazon.in/");
		
		// to capture titel 
		String TitleOfwebpage = driver.getTitle();
		System.out.println("The title of amazon: "+TitleOfwebpage);
		
		// to featch current url
		Object UrlOfwebpage = driver.getCurrentUrl();
		System.out.println("The Url of amazon: "+UrlOfwebpage);
		
	}
}
