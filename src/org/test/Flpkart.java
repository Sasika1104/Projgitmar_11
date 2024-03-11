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

public class Flpkart {

	public static void main(String[] args) throws AWTException {
System.setProperty("webDriver.Chrome.driver", "./\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

WebElement login=driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
Actions a=new Actions(driver);
a.moveToElement(login).click().perform();

WebElement Email=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
Email.sendKeys("Sasika@mail");

a.doubleClick(Email).perform();
Robot robo=new Robot();
robo.keyPress(KeyEvent.VK_CONTROL);
robo.keyPress(KeyEvent.VK_C);
robo.keyRelease(KeyEvent.VK_CONTROL);
robo.keyRelease(KeyEvent.VK_C);

Email.clear();
a.moveToElement(Email).perform();
robo.keyPress(KeyEvent.VK_CONTROL);
robo.keyPress(KeyEvent.VK_V);
robo.keyRelease(KeyEvent.VK_CONTROL);
robo.keyRelease(KeyEvent.VK_V);

WebElement homefurni=driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[5]"));

a.moveToElement(homefurni).perform();

WebElement bathtowel=driver.findElement(By.xpath("(//a[@class='_3490ry'])[6]"));
a.moveToElement(bathtowel).click().perform();

WebElement searchtowel=driver.findElement(By.name("q"));
a.sendKeys(searchtowel, "Ladies bath towel").perform();

WebElement searchbtn=driver.findElement(By.className("L0Z3Pu"));
a.click(searchbtn).perform();

	}

}
