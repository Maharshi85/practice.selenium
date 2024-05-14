package MavenPractice.com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarPopUP {
	
	@Test
	public void calendarPop()
	{
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("https://jqueryui.com/datepicker/");
		dri.switchTo().frame(0);
		dri.findElement(By.xpath("//input[@id='datepicker']")).click();
		String s="may";
		String s1="1999";
		String s2=dri.findElement(By.className("ui-datepicker-month")).getText();
		String s3=dri.findElement(By.className("ui-datepicker-year")).getText();
		while(!(s.equalsIgnoreCase(s2)&&s1.equalsIgnoreCase(s3)))
		{
			dri.findElement(By.linkText("Prev")).click();
			s2=dri.findElement(By.className("ui-datepicker-month")).getText();
			s3=dri.findElement(By.className("ui-datepicker-year")).getText();
		}
		dri.findElement(By.linkText("22")).click();
	}
}
