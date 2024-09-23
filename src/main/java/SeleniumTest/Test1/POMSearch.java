package SeleniumTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//10:30 10:42 - 12
//10.:50 10:59 - 09
//11:24 11:30 - 06 >> 27 min
//My Satish - 14:33 pm //My Main - 14:32 pm

public class POMSearch {
	
	public WebDriver driver=null;
	public String f="fname";
	public String l="lname";
	public String q="//a[@name='QA']";
	
public POMSearch(WebDriver driver)
{
	this.driver=driver;
}
	
	public WebElement getF()
	{
		WebElement wf=null;
		try
		{
			wf=driver.findElement(By.id(f));
			return wf;
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		return wf;
	}
	
	public WebElement getL()
	{
		WebElement wl=null;
		try
		{
			wl=driver.findElement(By.id(l));
			return wl;
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		return wl;
	}
	
	public WebElement getQ()
	{
		WebElement wq=null;
		try
		{
			wq=driver.findElement(By.xpath(q));
			return wq;
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		return wq;
	}
	
	public void SendFName(String data1)
	{
try {
		getF().sendKeys(data1);
	}
	catch(Exception e)
{
		System.out.println( e.getMessage());
}
	}

public void SendLName(String data1)
{
try {
	getL().sendKeys(data1);
	Thread.sleep(2000);
}
catch(Exception e)
{
	System.out.println( e.getMessage());
}

	}
	
public void ClickQA()
{
try {
getQ().click();
Thread.sleep(2000);
System.out.println("CLICKED");
}
catch(Exception e)
{
	System.out.println( e.getMessage());
}

	}


}
