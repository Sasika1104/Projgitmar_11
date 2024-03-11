package org.test;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\sandhiya\\eclipse-workspace\\Newseleniumcode\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().fullscreen();
		
		WebElement Register=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a"));
		Register.click();
	
		WebElement firstname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstname.sendKeys("SASIKA");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("VIVEK");
	
		WebElement address=driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("Chennai");
	
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sasika@mail.com");
	
		WebElement tel=driver.findElement(By.xpath("//input[@type='tel']"));
		tel.sendKeys("123789456");
		
		WebElement gender=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]//div[5]//div//label[2]//input"));
		gender.click();

		
		WebElement hobbies=driver.findElement(By.id("checkbox1"));
		hobbies.click();
		
		WebElement hobbies1=driver.findElement(By.id("checkbox2"));
		hobbies1.click();
		
		WebElement hobbies2=driver.findElement(By.id("checkbox3"));
		hobbies2.click();
		
		if(hobbies.isSelected()) {
			hobbies.click();
		}
		WebElement skilldrpdwn= driver.findElement(By.id("Skills"));
		Select slct=new Select(skilldrpdwn);
		slct.selectByValue("Client Server");
		Thread.sleep(2000);
		slct.selectByVisibleText("Backup Management");
		List<WebElement> listofoptions= slct.getOptions();//====>Total size of courses=====
		System.out.println(listofoptions.size()) ;
		
		
		//=========In select using for loop for select the items
	List<WebElement>	skills= driver.findElements(By.cssSelector("#Skills>option"));
		for(WebElement skill : skills)
		{
			if(skill.getText().equals("Java"))
			{
				skill.click();
				break;
			}
				
				
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
/*	WebElement languages=driver.findElement(By.id("msdd"));
	languages.click();
	
	List<WebElement> langageselect=driver.findElements(By.xpath("//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']//li/a"));
	for(WebElement Ls1 : langageselect)
	{
		System.out.println(Ls1.getText());
		
		if (Ls1.getText().equals("Czech"))
	{
			Ls1.click();
			break;
		}
	}
	
	WebElement randomclk=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]"));
	randomclk.click();*/
	
	
	 WebElement country=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
	 
	country.click();
	
	WebElement countrysearch=driver.findElement(By.xpath("//html//body//span//span//span[1]//input"));
	countrysearch.sendKeys("India");
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement Year=driver.findElement(By.xpath("//select[@id='yearbox']"));
	Year.click();
	Select sel=new Select(Year);
	sel.selectByValue("1994");
	System.out.println(sel.getAllSelectedOptions());
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement Month=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]//div[11]//div[2]//select"));
	Month.click();
	
	Select selmonth=new Select(Month);
	selmonth.selectByIndex(4);
	
	/*List<WebElement> Months=driver.findElements(By.xpath("//select[contains(@class,'form-control')][4]//option"));
	for(WebElement month : Months)
	{
		if(month.getText().equalsIgnoreCase("april"))
		{
			month.click();
			break;
		}
	}
	*/
	
	
	WebElement day=driver.findElement(By.id("daybox"));
	day.click();
	Select selday=new Select(day);
	selday.selectByValue("11");
	
	WebElement pwd=driver.findElement(By.id("firstpassword"));
	pwd.sendKeys("Sasika123");
	System.out.println(pwd.getAttribute("value"));
	
	
	WebElement cnfrmpwd=driver.findElement(By.id("secondpassword"));
	cnfrmpwd.sendKeys("Sasika123");
	System.out.println(cnfrmpwd.getAttribute("value"));   
		
	 

	
	

	 











	}

}
