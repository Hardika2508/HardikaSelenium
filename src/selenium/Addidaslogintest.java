package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addidaslogintest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.adidas.ca/en/account-login");
				 driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("pgdhjvj@gmail.com");
				 driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("6474516188");
				 driver.findElement(By.xpath("//button[@type='submit']")).click();

				 Thread.sleep(2000);
				 
				 String Expectederror= "Incorrect email/password – please check and retry";
					String Actualerror= driver.findElement(By.xpath("//*[text()='Incorrect email/password – please check and retry']")).getText();
			System.out.println(Actualerror);
			
			if(Expectederror.equals(Actualerror))
			{
				System.out.println("Test Pass");
			}
			else
			{
				System.out.println("Test Fail");
			}
				
	}

}
