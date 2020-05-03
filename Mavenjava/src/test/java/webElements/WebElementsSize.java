package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebElementsSize {

	@Test
	public void findSize() {

		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.qaclickacademy.com");
		driver.manage().window().maximize();

		List<WebElement> web = driver.findElements(By.tagName("a"));

		System.out.println(web.size());

		for (int i = 0; i < web.size(); i++) {

			System.out.println(web);
		}

	}

}
