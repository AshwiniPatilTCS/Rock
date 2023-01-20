package ash;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\abc\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		
	}

}
