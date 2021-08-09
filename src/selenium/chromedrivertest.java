package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromedrivertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA\\seleniumjars\\chromedriver.exe");
	
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
List<WebElement> alllinks=driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
				
				System.out.println(alllinks.size());
				
				for(int i=0; i<=alllinks.size(); i++)
				{
					System.out.println(alllinks.get(i).getText());
				}
	}

}
