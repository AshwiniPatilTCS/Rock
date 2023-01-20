package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

		public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement username =driver.findElement(By.id("email"));
			username.sendKeys("raku");
			WebElement password =driver.findElement(By.id("passContainer"));
			password.sendKeys("raku12345");
			WebElement clickLogin=driver.findElement(By.name("login"));
			clickLogin.click();
			
			
			
		}

}
