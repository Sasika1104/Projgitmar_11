package org.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealwindow {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		WebElement searchtxt=driver.findElement(By.id("inputValEnter"));
		searchtxt.sendKeys("iphone7",Keys.ENTER);

		WebElement iphone=driver.findElement(By.xpath("(//a[@class='dp-widget-link noUdLine hashAdded'])[1]"));
		iphone.click();
		Thread.sleep(2000);

		//=====getting the parent window id=====
		String parentID=driver.getWindowHandle();// to get the current window id
		System.out.println(parentID);

		Thread.sleep(2000);
		//======need to switch the opened window now======
		Set<String> newwindows=driver.getWindowHandles();
		for (String Openedwindow : newwindows)
		{
			driver.switchTo().window(Openedwindow);
			if(Openedwindow.equals(parentID)) {
				driver.switchTo().window(parentID);
			}
		}

		WebElement addtocartbtn=driver.findElement(By.xpath("//span[text()='add to cart']"));
		addtocartbtn.click();
		
		WebElement secpaying=driver.findElement(By.xpath("//p[text()='100% Secure Payments']"));
		secpaying.click();
		
		String parentID2=driver.getWindowHandle();// to get the current window id
		System.out.println(parentID2+" showing the 2nd parent window id");

		Thread.sleep(2000);
		//======need to switch the opened window now======
		Set<String> newwindows2=driver.getWindowHandles();
		for (String Openedwindow2 : newwindows2)
		{
			driver.switchTo().window(Openedwindow2);
			if(!Openedwindow2.equals(parentID)) {
				driver.switchTo().window(parentID);
				Thread.sleep(2000);
			}
		}
			

		Long take1=System.currentTimeMillis();
		TakesScreenshot window1=(TakesScreenshot)driver;
		File src=window1.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\" +take1+".png");
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
	// ======going back to the previous window====

	int count=1;
	for (String Openedwindow2 : newwindows2)
	{
	if (count==2)
	{	
				driver.switchTo().window(Openedwindow2);
			}count++;
		
		}
	//=====using alternative method list to go to the windows====
	
	List<String>	li=new ArrayList<>();
	li.addAll(newwindows2);
	String  bactto=li.get(2);
	driver.switchTo().window(bactto);
	//ANother way===
	driver.switchTo().window(parentID);
	Thread.sleep(1000);
	driver.close();

	
	
	}










	}


