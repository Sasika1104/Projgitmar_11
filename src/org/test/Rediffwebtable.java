package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffwebtable {

	public static void main(String[] args) throws Exception {
System.setProperty("Webdriver.chrome.driver","./\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://money.rediff.com/indicators");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

WebElement frw= driver.findElement(By.xpath("(//table[@class='dataTable'])[1]/tbody/tr[1]/td[3]"));// short form of getting tr[1]td[3]

String Frw=frw.getText();
System.out.println(Frw);
Thread.sleep(1000);
			//=====to select the 2nd column========
List<WebElement> table=driver.findElements(By.xpath("(//table[@class='dataTable'])[1]//tbody//tr//td[2]"));
for (WebElement table1 : table) 
{

	System.out.println(table1.getText());
}

List<WebElement> tkelem=driver.findElements(By.xpath("(//table[@class='dataTable'])[1]/tbody/tr/td[1]"));
for(int i=0; i<tkelem.size();i++) 
{
	if(table.get(i).getText().equals("15,952.23"))
	{
		System.out.println(tkelem.get(i).getText());
	}
}

WebElement heading=driver.findElement(By.xpath("(//table[@class='dataTable'])[1]//tr/th"));
System.out.println(heading.getText());
System.out.println("------------");
List<WebElement> trow=driver.findElements(By.xpath("(//table[@class='dataTable'])[1]//tr[1]"));

for (WebElement Trow : trow)
{
	System.out.println(Trow.getText());
}






	}

}
