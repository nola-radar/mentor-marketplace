package com.abc.foo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class AppTest {
    @BeforeClass
    public void setUp() {
      // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "group 1" })
    public void groupOneTest() {
      System.out.println("group 1 test");
    }

    @Test(groups = { "group 2" })
    public void groupTwoTest() throws InterruptedException {
        //WebDriver driver = new FirefoxDriver();
        //driver.get("http://cmf-30f8gz1/VisitorBadgeUAT/Home/");
        
        System.out.println("group 2 test");
        /*
        WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:/Users/212412051/Desktop/chromedriver.exe");
        driver = new ChromeDriver();
       
        driver.get("http://localhost:8080/mentormarketplace/");
	
        // Proper way to "sleep" would be to do below
        // WebDriverWait.until(condition-that-finds-the-element)
        
        driver.findElement(By.cssSelector("a")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("body > a")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#linkedInId")).sendKeys("Marktest");
        driver.findElement(By.cssSelector("#industry")).sendKeys("Dopeness");
        driver.findElement(By.cssSelector("#entrepreneur > div:nth-child(3) > div > button")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit(); */
        /*
        driver.findElement(By.cssSelector("input#firstname.inputbox.indexInput")).sendKeys("Marcus");
        driver.findElement(By.cssSelector("input#lastname.inputbox.indexInput")).sendKeys("Bischof");
        driver.findElement(By.cssSelector("input#phone.inputbox.indexInput")).sendKeys("985 805 0682");
        driver.findElement(By.cssSelector("input#company.inputbox.indexInput")).sendKeys("GE");
        driver.findElement(By.cssSelector("input#email.inputbox.indexInput")).sendKeys("bischofmarcus@gmail.com");
        driver.findElement(By.cssSelector("input#host.inputbox.indexInput")).sendKeys("Jeff Serpas");
        driver.findElement(By.cssSelector("input#reason.inputbox.indexInput")).sendKeys("Contracting");
        driver.findElement(By.cssSelector("input#badgenumber.inputbox.indexInput")).sendKeys("80");
        */
	//driver.findElement(By.id("submit")).click();
		
        
        //driver.findElement(By.id("submit")).click();
		
	//Thread.sleep(5000);
        //driver.findElement(By.id("confirmbutton")).click();
       

    }
}