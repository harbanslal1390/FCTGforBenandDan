package FCTG_HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class HomePage {
	public static WebDriver driver=new ChromeDriver();
	public String abc;
	@Test(priority = 1)
		
public void openBrowser()
{
	driver.get("https://secure.dc2.pageuppeople.com/apply/889/aw/applicationForm/default.asp?sData=UFUtVjMtQNgHEBGSrwozoQfMrYFnXkWfcuTYT03VUBJlYtC0Gu7Mh9dfDDv5b88QxW6TLTDIDAEhr0M9JQ%2BPYxz38lGxkVaATsRlsurZeYrOSZinWZB8eeYQD4zST%2FlT%2Bj8TasGvr1SwUUG%2F3kW%2BUlBwMkfQzA%3D%3D");
	driver.manage().window().maximize();
	abc= driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/div[4]/div[1]/label")).getText();

			
	}
	@Test (priority = 2)
	public void verifyLabelNamePositive()
	{
		System.out.println(abc);
		org.testng.Assert.assertEquals(abc, "Email address:");
	}
	@Test (priority = 3)
	public void verifyLabelNameNegative()
	{
		System.out.println(abc);
		org.testng.Assert.assertEquals(abc, "Email address:1");
	}
	
	
	
	@Test (priority = 3)
	public void closeBrowser()
	{
		driver.quit();
	}
}
