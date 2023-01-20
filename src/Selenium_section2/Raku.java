package Selenium_section2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raku {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-1000)");
		
	}

}
