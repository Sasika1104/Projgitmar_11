package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicialert {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "./\\Drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
	WebElement userid=	driver.findElement(By.id("DUMMY1"));
	userid.sendKeys("Sasika123");
	userid.click();
	
	Thread.sleep(2000);
	
	WebElement pwd=	driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	pwd.sendKeys("Sasika123");
	
	WebElement login=driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
	login.click();
	
	Alert popup=driver.switchTo().alert();
	System.out.println(popup.getText());
	popup.accept();
	
	
	
		
	}

}
