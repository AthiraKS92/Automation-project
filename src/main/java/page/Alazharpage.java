package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alazharpage {

	WebDriver driver;
	
	By text=By.name("q");
	By search=By.name("submit");
	By cooperation=By.xpath("//*[@id=\"search\"]/div/div[2]/div[2]/a");
	By contact=By.xpath("/html/body/header/div[2]/nav/ul/li[6]/a");
    By about=By.xpath("//*[@id=\"pages\"]/section[2]/aside/ul/li[2]/a");
    
   
    public Alazharpage(WebDriver driver)
    {
    	this.driver=driver;
    	
    }
   
   
    public void alsubject(String sub)
    {
    	driver.findElement(text).sendKeys(sub);
    	driver.findElement(search).click();
    }
    public void alcoop()
    {
    	driver.findElement(cooperation).click();
    	
    }
    
    public void alcont()
    {
    	driver.findElement(contact).click();
    }
     public void alabout()
     {
    	 driver.findElement(about).click();
     }
}
