package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Linktexttest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.google.com/");
				
				driver.findElement(By.linkText("Gmail")).click(); 
				
				//Thread.sleep(3000); // for slow down the process
				
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.titleContains("Gmail - Email from Google"));
				
				String expectedTitle ="Gmail - Email from Google";
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				
				String expectedUrl="https://www.google.com/intl/en-GB/gmail/about/";
				String actualUrl=driver.getCurrentUrl();
				System.out.println(actualUrl);
				
				if(expectedTitle.equals(actualTitle) & expectedUrl.equals(actualUrl))
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				}
						
	}


