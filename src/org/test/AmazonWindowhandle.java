package org.test;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWindowhandle {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

WebElement searchtxt=driver.findElement(By.id("twotabsearchtextbox"));
searchtxt.sendKeys("iphone 13 case",Keys.ENTER);

//===Taking window1 screenshot for ref====
//Long tkwnd1=System.currentTimeMillis();
//TakesScreenshot tcs=(TakesScreenshot)driver;
//File src1=tcs.getScreenshotAs(OutputType.FILE);
//System.out.println(src1);
//File des1=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\" +tkwnd1+".png");
//FileUtils.copyFile(src1, des1);

WebElement iphoneclick=driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[2]"));
Actions a=new Actions(driver);
a.contextClick(iphoneclick); //===for right click====
Thread.sleep(2000);


//getting the parent window id========
String Parentid= driver.getWindowHandle();
System.out.println(Parentid);
Thread.sleep(2000);
//======need to switch the opened window now======
Set<String> newwindows=driver.getWindowHandles();
for (String Openedwindow : newwindows)
{
	driver.switchTo().window(Openedwindow);
}


	}

}
