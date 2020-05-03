package fileUploadUsingRobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUpload {

	@Test
	public void upload() throws AWTException, InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.freepdfconvert.com/word-to-pdf");
		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".btn.btn-success.icon-left-large.img-plus-white.upload-btn")).click();
		Thread.sleep(1000);

		StringSelection ss = new StringSelection("D:\\Resumes\\Cover Letter.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		
		Robot r = new Robot();
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
