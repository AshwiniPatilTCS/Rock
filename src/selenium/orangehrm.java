package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				WebElement username =driver.findElement(By.name("username"));
				username.sendKeys("admin");
				WebElement password =driver.findElement(By.name("password"));
				password.sendKeys("admin123");
				WebElement btn=driver.findElement(By.cssSelector(".oxd-form-actions.orangehrm-login-action button"));
				btn.click();
				
				

}
}
