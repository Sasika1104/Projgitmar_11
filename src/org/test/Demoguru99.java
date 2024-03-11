package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoguru99 {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/newtours/register.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

WebElement country=driver.findElement(By.name("country"));
country.click();
//============by using get text()=========
Select s=new Select(country);
s.selectByIndex(36);
Thread.sleep(2000);
s.selectByVisibleText("BELGIUM");
Thread.sleep(2000);
s.selectByValue("BHUTAN");
Thread.sleep(2000);
	List<WebElement> option=s.getOptions();
	System.out.println(option.size());
	
//	for (WebElement txt : option)
//	{
//		String alltxts=txt.getText();
//		System.out.println(alltxts);
//	}
	//===========by using get Attribute()=========
	
	for (WebElement texts : option) {
		String	alltexts=texts.getAttribute("value");
		System.out.println(alltexts);
		
//=======		
		
	}
	}

}
