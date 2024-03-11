package org.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jscriptexecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

driver.get("http://toolsqa.com/");

WebElement seltrain=driver.findElement(By.xpath("//a[@href='/selenium-training?q=banner#enroll-form']"));

JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click()",seltrain);

// ===== set the values=======
WebElement Firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
jse.executeScript("arguments[0].click()", Firstname);
jse.executeScript("arguments[0].setAttribute('value','SASIKA')", Firstname);

//======get the given values=======

Object fsn=jse.executeScript("return arguments[0].getAttribute('value')",Firstname);
System.out.println("First name is " +fsn);

WebElement Lastname=driver.findElement(By.id("last-name"));
jse.executeScript("arguments[0].click()",Lastname);
jse.executeScript("arguments[0].setAttribute('value','Lingam')", Lastname);

Object Lsn=jse.executeScript("return arguments[0].getAttribute('value')",Lastname);
System.out.println("Last name is "+Lsn);

WebElement mail=driver.findElement(By.xpath("//input[@type='email']"));
jse.executeScript("arguments[0].click()",mail);
jse.executeScript("arguments[0].setAttribute('value','SASIKA@mail.com')", mail);

//====another way to conversion of string
String mil= (String)jse.executeScript("return arguments[0].getAttribute('value')",mail);
System.out.println("mail is "+mil);

WebElement mobile=driver.findElement(By.id("mobile"));
jse.executeScript("arguments[0].click()",mobile);
jse.executeScript("arguments[0].setAttribute('value','9874561230')", mobile);

//====another way to conversion of string
Object oo=jse.executeScript("return arguments[0].getAttribute('value')",mobile);
String mobl=oo.toString();
System.out.println("mobile number is "+mobl);

Long take=System.currentTimeMillis();

TakesScreenshot tcs=(TakesScreenshot)driver;
File src=tcs.getScreenshotAs(OutputType.FILE);
System.out.println(src);
File des=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\"+take +".png");
FileUtils.copyFile(src, des);

WebElement Country=driver.findElement(By.name("country"));
jse.executeScript("arguments[0].click()",Country);
Select ss=new Select(Country);
ss.selectByIndex(26);

//====to get all the options and size
List<WebElement> cnt=ss.getOptions();
//System.out.println(cnt.size());
//for (WebElement ss1 : cnt) 
//{
//	System.out.println(ss1.getText());
//	
//}
//to select the particular one====

WebElement cnt1=cnt.get(26);
String cnt2=cnt1.getText();
System.out.println("Country name is "+cnt2);
Thread.sleep(2000);
//=======to take screenshot========

Long take2=System.currentTimeMillis();

TakesScreenshot tcs2=(TakesScreenshot)driver;
File src2=tcs2.getScreenshotAs(OutputType.FILE);
System.out.println(src);
File des2=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\"+take2 +".png");
FileUtils.copyFile(src2, des2);

//====Scroll up==== these comments only in javascript

WebElement scrlup=driver.findElement(By.xpath("//div[text()='What is included']"));
jse.executeScript("arguments[0].scrollIntoView(true)", scrlup); //====scroll up
Long take1=System.currentTimeMillis();

TakesScreenshot tcs1=(TakesScreenshot)driver;
File src1=tcs1.getScreenshotAs(OutputType.FILE);
System.out.println(src1);
File des1=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\"+take1 +".png");
FileUtils.copyFile(src1, des1);
Thread.sleep(2000);
//====Scroll down====
WebElement scrldown=driver.findElement(By.xpath("//div[text()='Selenium Certification – Curriculum']"));
jse.executeScript("arguments[0].scrollIntoView(false)",scrldown);//====Scroll down====


	}

}
