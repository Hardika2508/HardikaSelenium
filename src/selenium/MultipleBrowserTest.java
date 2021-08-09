package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {
	
	MultipleBrowserTest driv=new MultipleBrowserTest();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("D:\\QA\\Testing\\abc.properties");
		Properties prop= new Properties();
		prop.load(f);
		
		prop.setProperty("browser", "chrome");
		String browser=prop.getProperty("browser");
		
		
		FileOutputStream fo=new FileOutputStream("D:\\QA\\Testing\\abc.properties");
		prop.store(fo, "Adding to Properties File");
		
		WebDriver driver; // null or empty
		
		if(browser.equals("Firefox"))
		{
		        System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
				driver=new FirefoxDriver();
		}
		
		else
		{
				System.setProperty("webdriver.chrome.driver", "D:\\QA\\seleniumjars\\chromedriver.exe");
				driver=new ChromeDriver();
		}
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("afsthhfgh");
		driver.findElement(By.name("pass")).sendKeys("2334dfyhbj");
		driver.findElement(By.name("login")).click();
			
	}

}
