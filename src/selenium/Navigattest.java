package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigattest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		//same using navigate 
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
