package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
				//Firefox driver//non static methods
				
				//classname Objname= new classname
						//FirefoxDriver driver=new FirefoxDriver();
						
						//Parentclassname objname= newclassname
						WebDriver driver=new FirefoxDriver();
						
						driver.get("https://www.facebook.com/");
						
	}

}
