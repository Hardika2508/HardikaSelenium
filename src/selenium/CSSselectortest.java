package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSselectortest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.cssSelector("#email")).sendKeys("afsthhfgh");
		driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("2334dfyhbj");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
