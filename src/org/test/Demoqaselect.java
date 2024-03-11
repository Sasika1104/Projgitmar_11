package org.test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoqaselect {

	public static void main(String[] args) throws InterruptedException  {
System.setProperty("webDriver.chrome.driver", "./\\Drivers.chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

WebElement multiselect=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]"));
Actions a=new Actions(driver);
a.click(multiselect).perform();
Thread.sleep(2000);
WebElement red=driver.findElement(By.xpath("(//div[@class='css-12jo7m5'])[2]"));
Actions a1=new Actions(driver);
a1.click(red).perform();

WebElement green=driver.findElement(By.xpath("(//div[@class='css-12jo7m5'])[1]"));
Actions a2=new Actions(driver);
a2.click(green).perform();


//WebElement Red=driver.findElement(By.xpath("//div[contains(text(),'Black')]"));
//a.click(Red).perform();







	}

}
