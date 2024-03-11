package org.test;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru {

	public static void main(String[] args) {

		System.setProperty("webDriver.Chrome.driver.", "./\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		
		WebElement srcbank=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement destbank=driver.findElement(By.id("bank"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(srcbank, destbank).perform();
		
		
		WebElement srcdebamnt= driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
		WebElement desdebamnt= driver.findElement(By.id("amt7"));

		
		act.clickAndHold(srcdebamnt).moveToElement(desdebamnt).release().perform();
		
		
		WebElement srccredacc= driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
		WebElement descredacc= driver.findElement(By.id("loan"));
		act.clickAndHold(srccredacc).release(descredacc).perform();
		
	}

}
