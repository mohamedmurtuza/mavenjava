package staleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StatleElement {
	
	@Test
	public void stale() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/login.cfm");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("Hello");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("World");
		
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		try {
			
			username.sendKeys("Bolo");
		}catch(Exception e) {
			username = driver.findElement(By.name("username"));
			username.sendKeys("BOLOOOOOOOOOOO");
		}
	
}}
