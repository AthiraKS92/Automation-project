package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alazharpage2 {
	
	WebDriver driver;
	 
    By aladmission=By.xpath("//*[@id=\"home\"]/div[1]/aside/div[1]/nav/ul/li[3]/a");
	 By alpg=By.xpath("//*[@id=\"pages\"]/section[2]/article/div[1]/section/ul/li[1]/a");
    By altravel=By.xpath("//*[@id=\"announcements\"]/article/ol[1]/li[1]/a");
    By alhome=By.xpath("/html/body/header/div[2]/nav/ul/li[1]/a");
    By alview=By.xpath("//*[@id=\"home\"]/div[1]/section/div/div[2]/div[1]/a");
    By alyoga=By.xpath("//*[@id=\"announcements\"]/article/ul/li[1]/div[2]/a");
    By algroup=By.xpath("/html/body/header/div[1]/nav[1]/ul/li[1]/a");
    By alenq=By.xpath("//*[@id=\"form\"]/div[1]/div[1]/div[3]/div/div/a");
    
      public Alazharpage2 (WebDriver driver)
    {
    	this.driver=driver;
    	
    }
      public void admisn()
      {
    	  driver.findElement(aladmission).click();
    	  driver.findElement(alpg).click();
    	  driver.findElement(altravel).click();
      }
      public void home()
      {
    	  driver.findElement(alhome).click();
    	  
      }
      public void announce()
      {
    	  driver.findElement(alview).click();
    	  driver.findElement(alyoga).click();
      }
    
    public void group()
    {
    	driver.findElement(algroup).click();
    	driver.findElement(alenq).click();
    	
    }
    
    

}
