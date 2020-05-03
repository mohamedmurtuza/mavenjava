package Qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromOptions {
	
	@Test
	public void sequence() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-infobars");
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

}}
