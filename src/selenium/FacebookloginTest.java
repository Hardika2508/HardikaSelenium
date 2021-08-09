package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookloginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
//Firefox driver//non static methods
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//EMAIL
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sdgkjaghfja"); If there is a space in class name it is not working
		//driver.findElement(By.cssSelector(null)) not now
		driver.findElement(By.id("email")).sendKeys("afsthhfgh");
		//driver.findElement(By.linkText(null)) only use for link tag
		//driver.findElement(By.name("email")).sendKeys("dfhjfdjaFDUYDRQYUGQD");
		//driver.findElement(By.partialLinkText(null)) only use for a link tag
		//driver.findElement(By.tagName("input")).sendKeys("fhdgsfajkgsjk");  not unique or not first in list
		//driver.findElement(By.xpath(null)) not now learn script fo xpath
		
		
		//PASSWORD
		//driver.findElement(By.id("pass")).sendKeys("aftyy566");
		driver.findElement(By.name("pass")).sendKeys("2334dfyhbj");
		
		
		//LOGIN BUTTON
		
		driver.findElement(By.name("login")).click();

	}

}
