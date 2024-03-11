package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {

	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.Chrome.driver","./\\Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		driver.manage().window().maximize();
		
		WebElement multiplename=driver.findElement(By.id("cars"));
		Select s=new Select(multiplename);
		s.selectByIndex(3);
		s.selectByValue("opel");
		s.selectByVisibleText("Volvo");
		
	System.out.println(s.isMultiple());
	
	List<WebElement> options= s.getOptions(); //====get all options====
	//====get particular options=======
	WebElement	op1=options.get(2); //===using index=====
	String txt= op1.getText();
	System.out.println("particular options " + txt);
	
	
	System.out.println("========get all options using for loop========");
	for(int i=0; i<options.size(); i++) {
	  WebElement  alloption = options.get(i);
	  String txt1=alloption.getText();
	  
	  System.out.println(txt1);
	 
	}
	
	
	System.out.println("========get all options using enhanced for loop========");
	for (WebElement allopton : options) 
	{
		//String	text1=allopton.getText();
	System.out.println(allopton.getText());	
	}
	
	System.out.println("========get all selected options========");
	List<WebElement>allselected = s.getAllSelectedOptions();
	
	for (WebElement selected : allselected) 
	{
        System.out.println(selected.getText());
        
		
	}
	
	System.out.println("========get first selected options========");
	
WebElement firstslect= s.getFirstSelectedOption();
String firstslct=firstslect.getText();
	System.out.println(firstslct);
	
	System.out.println("========select by using id========");
	for(int i=0; i<options.size();i++)
	{
		s.selectByIndex(i);
	}
	s.deselectByIndex(3);
	
		Thread.sleep(2000);
		
	System.out.println("========select by using visibletext========");
	for (WebElement each : options) {
	String tt=each.getText();     //===== because this is visible text so converted element into txt
	s.selectByVisibleText(tt);
	}
	s.deselectByVisibleText("Opel");
	Thread.sleep(2000);
	System.out.println("========select by using value========");
	for(int i=0; i<options.size();i++)
	{
		WebElement val=options.get(i);
		String values=val.getAttribute("value");
		s.selectByValue(values);
	}
	s.deselectByValue("audi");
	
	Thread.sleep(2000);
	
	s.deselectAll();
	
	
	}

}
