package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) throws AWTException {
System.setProperty("webDriver.Chrome.driver","./\\Drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/webhp");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
driver.manage().window().maximize();

WebElement search=driver.findElement(By.id("APjFqb"));
search.sendKeys("Sasika");

Actions a=new Actions(driver);
a.doubleClick(search).perform();

Robot robo=new Robot();
robo.keyPress(KeyEvent.VK_CONTROL);
robo.keyPress(KeyEvent.VK_X);
robo.keyRelease(KeyEvent.VK_CONTROL);
robo.keyRelease(KeyEvent.VK_X);






	}

}
