package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize3 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.close();
		driver.get("https://www.amazon.in/");
		Options opt=driver.manage();
		Window win=opt.window();
		win.maximize();
	}

}
