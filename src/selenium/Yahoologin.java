package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoologin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.id("login-username")).sendKeys("abcdfeftfserc23@yahoo.in");
		
		Thread.sleep(2000);
		driver.findElement(By.name("signin")).click();
		String Errormsg= driver.findElement(By.id("username-error")).getText();
		String actualmsg="Sorry, we don't recognize this email.";
		
		if(actualmsg.equals(Errormsg))
		{
			System.out.println(Errormsg);
			System.out.println("Message is verified");
		
		}
		else
		{
			System.out.println("Message is not verified");
		}
		
	}

}
