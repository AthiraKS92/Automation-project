package test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.Alazharpage;

public class Alazhartest extends Basealazhar{
	
@Test
public void test() throws Exception
{
	Alazharpage page=new Alazharpage(driver);

	String actual=driver.getTitle();
	String expd="Al-Azhar College of Arts & Science | Best Arts College in Thodupuzha, Kerala";
    Assert.assertEquals(actual,expd);
	System.out.println("Actual title is "+actual);
    
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	page.alsubject("b.com");
	page.alcoop();
	page.alcont();
	page.alabout();
	
}
	

}
