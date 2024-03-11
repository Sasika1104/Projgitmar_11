package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstech {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
System.setProperty("webDriver.Chrome.driver","./\\Drivers.chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

WebElement rpa=driver.findElement(By.xpath("//a[@title='RPA Training in chennai']"));
Actions a=new Actions(driver);
a.moveToElement(rpa).perform();

Robot r=new Robot();

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_I);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_SHIFT);
r.keyRelease(KeyEvent.VK_I);
Thread.sleep(5000);

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_T);

WebDriver driver1=new ChromeDriver();
driver1.get("http://greenstech.in/selenium-course-content.html");
driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver1.manage().window().maximize();

WebElement ModelResume=driver1.findElement(By.id("heading201"));

TakesScreenshot tk=(TakesScreenshot)driver1;
File src=tk.getScreenshotAs(OutputType.FILE);
System.out.println(src);
System.out.println(src.getParentFile());

File des=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\sample.png");
FileUtils.copyFile(src, des);
ModelResume.click();

//Takescreenshot



Actions a1=new Actions(driver1);
WebElement modelresume4=driver1.findElement(By.xpath("//*[@id=\"collapse201\"]//div//div//ul//li[4]//a"));
a1.contextClick(modelresume4).perform();
Robot r1=new Robot();


for(int i=0;i<=3;i++) {
r1.keyPress(KeyEvent.VK_DOWN);
r1.keyRelease(KeyEvent.VK_DOWN);
}

TakesScreenshot tk1=(TakesScreenshot)driver1;
File src1=tk1.getScreenshotAs(OutputType.FILE);
System.out.println(src1);
//System.out.println(src.getParentFile());

File des1=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\sample1.png");
FileUtils.copyFile(src1, des1);
//r1.keyPress(KeyEvent.VK_DOWN);
//r1.keyRelease(KeyEvent.VK_DOWN);
//r1.keyPress(KeyEvent.VK_DOWN);
//r1.keyRelease(KeyEvent.VK_DOWN);
//r1.keyPress(KeyEvent.VK_DOWN);
//r1.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(2000);
r1.keyPress(KeyEvent.VK_ENTER);
r1.keyRelease(KeyEvent.VK_ENTER);

	}	
	
	}



