package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
//Firefox driver//non static methods
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("affgchgdhg");
		driver.findElement(By.id("pass")).sendKeys("aaaasss");
		driver.findElement(By.name("login")).click();
	}

}
