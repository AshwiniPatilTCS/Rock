package Selenium_section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args)throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
