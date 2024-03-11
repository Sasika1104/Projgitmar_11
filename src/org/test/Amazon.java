package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon {

	public static void main(String[] args) {
System.setProperty("WebDriver.Chrome.driver","C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));
Actions act=new Actions(driver);

act.moveToElement(prime).perform();


WebElement freefast=driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
act.moveToElement(freefast).click().perform();

	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	
	
	}

}
