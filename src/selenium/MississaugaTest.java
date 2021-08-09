package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
	
	 driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
		
		
		Thread.sleep(2000);
		
		List<WebElement> menu =driver.findElements(By.xpath("//a[@data-nav-category='Our organization']"));
		 
		System.out.println(menu.size());

		for(WebElement A:menu)
		{
			String s=A.getText();
			String s1="Jobs and volunteer";
			System.out.println(A.getText());
			if(s.equals(s1))
			{
				break;
			}
		}

		
		
		
	}

}
