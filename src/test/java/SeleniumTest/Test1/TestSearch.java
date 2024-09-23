package SeleniumTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestSearch {

	public WebDriver driver =null;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	}
	
	@Test
  public void f() {
driver.manage().window().maximize();
POMSearch ss=new POMSearch(driver);
ss.SendFName("zzz");
ss.SendLName("aaa");
ss.ClickQA();
System.out.println("FIRST TEST");
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
