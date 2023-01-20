package Selenium_section2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/search/login-jobs");
		Dimension d=new Dimension(200,100);
		driver.manage().window().setSize(d);
	}

}
