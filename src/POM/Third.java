package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String expT="Amazon.com. Spend less.Smile more.";
       String actT=driver.getTitle();
       if(expT.equals(actT)){
    	   System.out.println("TC is pass");
       }
       else {
    	   System.out.println("TC is fail");
       }
	}

}

