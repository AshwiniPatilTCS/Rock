package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize1 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.close();
	}

}
