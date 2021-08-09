package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWiattest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.facebook.com/");
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				//Absolute Xpath
				//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
				
				//Attribute xpath
				
				driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
				
				 
				 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pgdhjvj");
				 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("6474516188"); 
				 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("p5555");
				 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
					

					
							
							WebElement month=driver.findElement(By.name("birthday_month"));
							Select M=new Select(month);
									
							M.selectByValue("7");	
							
							WebElement day=driver.findElement(By.name("birthday_day"));
							Select D=new Select (day);
							D.selectByVisibleText("10");		
							
							
							WebElement year=driver.findElement(By.name("birthday_year"));
							Select Y=new Select (year);
									
							Y.selectByVisibleText("2000");
							driver.findElement(By.xpath("//input[@value='1']")).click();
							driver.findElement(By.xpath("//button[@name='websubmit']")).click();
							
				String S=driver.findElement(By.xpath("//input[@name='reg_passwd__']")).getAttribute("value");
				 System.out.println(S);
				

				 
				 String Expectederror= "What’s your name?";
					String Actualerror= driver.findElement(By.xpath("//*[text()='What’s your name?']")).getText();
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
