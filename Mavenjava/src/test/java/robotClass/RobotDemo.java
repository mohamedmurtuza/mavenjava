package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class RobotDemo {

	public void robot() throws AWTException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://www.google.com");
		WebElement query = driver.findElement(By.name("q"));
		driver.manage().window().maximize();
		Robot robot = new Robot();
		Thread.sleep(2000);

		query.sendKeys("Hello");

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_X);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_Z);

		Thread.sleep(1000);
	
	

	}

}
