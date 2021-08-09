package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scotiabanklogintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=KLckiVaVnz8&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJLTGNraVZhVm56OCIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjE3NTY3NDU3LCJpYXQiOjE2MTc1NjYyNTcsImp0aSI6IjMwZmQ5MTBkLTA1OGEtNDFlYS1iYjFiLTY2ZjNkM2U4M2M1MSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.qKqvUOLKaGyZZrvBTpVghkZYFFmmDnwIFEtkUmWikC6zbMSKGDjccprpn-pc1lTFGJtwNCsx9jUjAHWL32WQZU9lFfqaTE2QNaF2hRFfAcYsO4_HWg6YfBb89f2haGq6QeU2I74QX-d9cSHELzVQZZGoaTE6rZBLVk4oiaexCEzcOoUK7F-3eStg1a_rhCfmQPoMGls_NA7h8oCrMPtuYQzhqzk3Hb-BcPr448niS1urm3knjRAFzmKv_S1KijoeUvQyrwnfk9IVax3mz_MKvEKSoS1e-JxIPCUlC-eFf0k1FteHcBsyeK6w6DDhXKp1pIG8diIeCcHNkw4GfHDD_Q&preferred_environment=");
				
				driver.findElement(By.id("usernameInput-input")).sendKeys("hhjdhud@gmail.com");
				driver.findElement(By.id("password-input")).sendKeys("adfgdgd");
				driver.findElement(By.id("signIn")).click();
String ExpectedErr= "Please enter a username or card number without special characters.";
				
				String ActualErr= driver.findElement(By.xpath("//div[@class='Error__text']")).getText();
				
				if(ActualErr.equals(ExpectedErr)) {
					System.out.println("TestPass");
				}
				else {
					System.out.println("TestFail");
				}
				System.out.println(ActualErr);
	}
	}


