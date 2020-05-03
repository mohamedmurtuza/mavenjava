package Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {

	@Test
	public void actionClass() throws InterruptedException, AWTException {
		
		ChromeOptions option = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://www.google.com");

		Actions a = new Actions(driver);
		
		Thread.sleep(1000);
		
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("Hello");
	driver.manage().window().maximize();
		Thread.sleep(2000);
		a.doubleClick(search);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_N);
	}
}
