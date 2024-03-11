package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertoption {

	public static void main(String[] args) throws Exception {
System.setProperty("webDriver.Chrome.driver", "C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

WebElement switchto=driver.findElement(By.className("dropdown-toggle"));
Actions a=new Actions(driver);
a.moveToElement(switchto).perform();

WebElement alert=driver.findElement(By.xpath("//a[text()='Alerts']"));
a.click(alert).perform();

WebElement alertbx=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
String txt=alertbx.getText();
System.out.println(txt);
a.click(alertbx).perform();

Thread.sleep(2000);
Alert simplealert=driver.switchTo().alert();
String x=simplealert.getText();
System.out.println("======Simple alert====== " + x);
 simplealert.accept();

 //==========Confirm Alert==========
 
 WebElement Confirmalert=driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
 a.click(Confirmalert).perform();
 
 WebElement Confirmalertbx=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
 System.out.println(Confirmalertbx.getText());
 a.click(Confirmalertbx).perform();

 Alert cnfmalert=driver.switchTo().alert();
 System.out.println("==========Confirm Alert========== " + cnfmalert.getText());
 cnfmalert.dismiss();
 
//============Prompt Alert==========

 WebElement textprompt=driver.findElement(By.xpath("//a[@href='#Textbox']"));
 a.click(textprompt).perform();
 
 WebElement textpromptbx=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
 System.out.println(textpromptbx.getText());
 a.click(textpromptbx).perform();

 Alert promptbx=driver.switchTo().alert();
 System.out.println("============Prompt Alert========== " + promptbx.getText());
 promptbx.sendKeys("SASIKA");
 Thread.sleep(2000);
 cnfmalert.accept();

	}

}
