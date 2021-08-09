package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.ebay.ca/");
				
				String s=driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("placeholder");
				
				
			System.out.println(s);
			driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone");
			String S1=driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("value");
			System.out.println(S1);
			
			
	}

}
