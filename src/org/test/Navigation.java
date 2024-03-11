package org.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webDriver.Chrome.driver","./\\Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		driver.manage().window().maximize();

	//driver.get("https://www.facebook.com/");
	
		
		//====navigate to====
		//Navigation nv= driver.navigate();
		driver.navigate().to("https://www.facebook.com/");
		
Long newsnap=System.currentTimeMillis();
		
		TakesScreenshot tk=(TakesScreenshot)driver;//======downcasting method to convert driver class into interface
		File src=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File des=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\"+newsnap +".png");
		FileUtils.copyFile(src, des);
	
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com/");
		
Long newsnap1=System.currentTimeMillis();
		TakesScreenshot tk1=(TakesScreenshot)driver;
	File src1=tk1.getScreenshotAs(OutputType.FILE);
	System.out.println(src1);
	
	File des1=new File("C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Screenshots\\"+newsnap1 +".png");
	FileUtils.copyFile(src1, des1);
		Thread.sleep(2000);
		
		//=======to go back====
		driver.navigate().back();
		Thread.sleep(2000);
				
		//=======to refresh the page===
		driver.navigate().refresh();
		
		//=======to forward ====
		driver.navigate().forward();
		Thread.sleep(2000);
				


		
		
		
		
	}

}
