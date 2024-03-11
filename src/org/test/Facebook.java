package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws AWTException {
System.setProperty("webDriver.Chrome.driver", "./\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.manage().window().maximize();
 
 WebElement email=driver.findElement(By.name("email"));
 email.sendKeys("Sasika");
 Actions a=new Actions(driver);
 a.doubleClick(email).perform(); //====double click
 a.contextClick(email).perform(); //====right click
 
 Robot robo=new  Robot();
 robo.keyPress(KeyEvent.VK_DOWN);
 robo.keyRelease(KeyEvent.VK_DOWN);
 robo.keyPress(KeyEvent.VK_DOWN);
 robo.keyRelease(KeyEvent.VK_DOWN);
 robo.keyPress(KeyEvent.VK_DOWN);
 robo.keyRelease(KeyEvent.VK_DOWN);
 
 //===== to select through the key board using Enter
 
 robo.keyPress(KeyEvent.VK_ENTER);
 robo.keyRelease(KeyEvent.VK_ENTER);
 
WebElement Password= driver.findElement(By.id("pass"));
a.click(Password).perform();
a.contextClick(Password).perform();
for(int i=0; i<4; i++)
{
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
}
 
 robo.keyPress(KeyEvent.VK_ENTER);
 robo.keyRelease(KeyEvent.VK_ENTER);
 
	}
	

}
