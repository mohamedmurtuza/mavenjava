package charSequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CharString {

	@Test
	public void string () {
		
		ChromeOptions option = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	
		
		String s = "Murtuza";
		
		WebElement query= driver.findElement(By.name("q"));
		
		StringBuffer sb= new StringBuffer();
		StringBuffer a = sb.append("a");
		StringBuffer b= sb.append("b");
		StringBuffer sp=sb.append(" ");
		
	
		
		StringBuilder sbd= new StringBuilder();
		StringBuilder c= sbd.append("c");
	
		StringBuilder d = sbd.append("d");
		
		query.sendKeys(s,a,b,sp,c,sp,d);
	}
	

}
