package test;

import org.testng.annotations.Test;

import page.Alazharpage2;

public class Alazhartest2 extends Basealazhar{

@Test
public void test1() throws Exception
{
	Alazharpage2 ap=new Alazharpage2(driver);
	
	ap.admisn();
	ap.home();
	ap.announce();
	ap.group();

	
}
	
	
	
}
