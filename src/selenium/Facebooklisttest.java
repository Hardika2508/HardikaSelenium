package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.facebook.com/");
				
List<WebElement> alllinks=driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
				
				System.out.println(alllinks.size());
				
				for(int i=0; i<=alllinks.size(); i++)
				{
					System.out.println(alllinks.get(i).getText());
				}
	}

}
