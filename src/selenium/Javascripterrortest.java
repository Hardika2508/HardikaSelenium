package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascripterrortest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("http://www.echoecho.com/javascript4.htm");
				driver.findElement(By.xpath("//input[@value='confirm box']")).click();
				
				Thread.sleep(2000);
				Alert a= driver.switchTo().alert();
				System.out.println(a.getText());
				
				//a.accept(); // to click on select one
				a.dismiss(); // to cluck on non selected
	}

}
