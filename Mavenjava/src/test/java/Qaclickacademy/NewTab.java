package Qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTab {
	
	@Test
	public void newTab() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
