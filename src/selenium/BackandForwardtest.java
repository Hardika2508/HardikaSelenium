package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackandForwardtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.google.com/");
				
				driver.findElement(By.linkText("About")).click();
				String s1=driver.getTitle();
				System.out.println(s1);
				
				Thread.sleep(2000);
				
				driver.navigate().back();
				String s2=driver.getTitle();
				System.out.println(s2);
			
				driver.navigate().forward();
				String s3=driver.getTitle();
				System.out.println(s3);
	}

}
