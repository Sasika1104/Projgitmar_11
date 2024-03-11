package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99webtable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//===to get the how many table in the driver====
		List<WebElement> table=driver.findElements(By.tagName("table"));
		System.out.println(" there are"+ table.size() + " tables present in the driver ");
Thread.sleep(2000);
		//===to select the anyone table===

		//WebElement Tablevalue = table.get(1);
		//String codetable=Tablevalue.getText();//===== this will be considered as a single string
		//System.out.println(codetable);
		
		WebElement sectable=driver.findElement(By.xpath("//*[@id=\"main\"]/table"));
		String Sectable=sectable.getText();
		System.out.println("====Print the 2nd table values===" );
		System.out.println(Sectable);		
		System.out.println();
		
		//==== another way to select all the datas in the table	

		List<WebElement> secallvalues=sectable.findElements(By.tagName("tr"));	
		System.out.println("another way to select");
		for (WebElement Secallvalues : secallvalues)
		{
			String allval=Secallvalues.getText();
			
			System.out.println(allval);
				}
				System.out.println();
				
		System.out.println("total row size of the table"+secallvalues.size());
		System.out.println();
		
		//=====to get the particular row===
		WebElement singrowval=secallvalues.get(9);
		String Singrowval=singrowval.getText();
		System.out.println("Print the 9th index row value");
		System.out.println(Singrowval);
		System.out.println();
		
		WebElement Firstrw=secallvalues.get(1);
		String first=Firstrw.getText();
		System.out.println(first);
		
		//======to print the heading only in the table---> tr----> th====
		System.out.println("to print the heading only");
		for (WebElement trow : secallvalues) 
		{
			//String Headval=trow.getText();
			
		List<WebElement> headval=trow.findElements(By.tagName("th")); // this is the way for direct heading selection
		
		for (WebElement tabhead : headval) 
			
		 {	
			 String hval= tabhead.getText();
				System.out.println(hval);
		}
		}
		System.out.println();
		
		// ======to print the datas in the table --->tr--->td
		System.out.println("to print the datas only");
		for (WebElement trow1 : secallvalues) 
		{
			List<WebElement> td=trow1.findElements(By.tagName("td"));// this is the direct way of data selecting in the table
			for (WebElement tabledata : td) 
			{
				String tdata=tabledata.getText();	
				System.out.println(tdata);
			}
		}
		Thread.sleep(1000);
		System.out.println();	
		
		//===to print the particular data
		System.out.println("to print the particular datas only");
		for (WebElement trow1 : secallvalues) 
		{
			List<WebElement> td=trow1.findElements(By.tagName("td"));// this is the direct way of data selecting in the table
	
			for (WebElement tabledata : td) 
			{
				String tdata=tabledata.getText();	
				if(tdata.equals("<col>"))
				{
					System.out.println(tdata);
					//===print the entire row==
					String tdata1= trow1.getText();
					System.out.println(tdata1);
					//===========
				}
					
				}
		}
			
			//=====print the last row value======
					
		WebElement lstrw=secallvalues.get(5);
String Lstrw=lstrw.getText();
System.out.println("Lstrow values" +	Lstrw);

WebElement lstrw1=secallvalues.get(secallvalues.size()-1);
List<WebElement> tdata=lstrw1.findElements(By.tagName("td"));
for (WebElement Tdata : tdata) {
	String data=Tdata.getText();
	System.out.println(data);
}

// to get the middle row value

WebElement midrw2= secallvalues.get(secallvalues.size()/2);
List<WebElement> Midrw2=midrw2.findElements(By.tagName("td"));
for (WebElement Middrw : Midrw2) {
	String mirw=Middrw.getText();
	System.out.println("//=print the middle vale " + mirw);
}



	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


