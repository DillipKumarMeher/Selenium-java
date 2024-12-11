package a01_webDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//To MAximize
		//driver.manage().window().maximize();
		Thread.sleep(2000); //Pause my script for 2sec
		
		//To minimize
		//driver.manage().window().minimize();
		
		//To Full Screen
		//driver.manage().window().fullscreen();
		
		//To get size
		//Dimension sizeOftheBrowser = driver.manage().window().getSize();
		//System.out.println(sizeOftheBrowser);
		
		//To set size
		//Dimension d = new Dimension(800,500);
		//driver.manage().window().setSize(d);
		
		//driver.manage().window().setSize(new Dimension(500,600));
		
		//To get position
		//Point pos = driver.manage().window().getPosition();
		//System.out.println(pos);
		
		//To set position
		//Point p = new Point(150,100);
		//driver.manage().window().setPosition(p);
		
		driver.manage().window().setPosition(new Point(100,200));
		
	}
	
}
