package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillogintest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
				
				driver.findElement(By.name("identifier")).sendKeys("hhfffdfxgbc");
				driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
				
				Thread.sleep(3000);
				String ExpectedErr= "Couldn't find your Google Account";
				
				String ActualErr= driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
				
				if(ActualErr.equals(ExpectedErr)) {
					System.out.println("TestPass");
				}
				else {
					System.out.println("TestFail");
				}
				System.out.println(ActualErr);
	}

}
