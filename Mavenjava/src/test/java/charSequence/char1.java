package charSequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class char1 {
	
	@Test
	public void charSq() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		
		String s = "Hi";
		
		StringBuilder sb = new StringBuilder();
		sb.append(" ");
		sb.append("Hello");
		
		StringBuffer sbb = new StringBuffer();
		
		sbb.append(" ");
		sbb.append("Bye");
		sbb.append("Bye");
		
		
		search.sendKeys(s,sb.append(" "),sb.append("Hello"),sbb.append(" "),sbb.append("Bye"),sbb.append("Bye"));
	}

}
