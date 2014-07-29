/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views.user.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author 212412051
 */

public class FounderProfileTest {
    
    //@Test
    public void groupOneTest() {
    System.out.println("Index Test Beginnning");
        
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "src/test/java/Webdrivers/chromedriver.exe");
    driver = new ChromeDriver();
    
    driver.get("http://localhost:8080/mentormarketplace/user/profile");
        
    if( driver.findElement(By.cssSelector("#mentorNavButton")).isDisplayed()){
        System.out.println("Logout Visible");
    }else{
        System.out.println("Logout Visible");
    }
    
    if( driver.findElement(By.cssSelector("#mfLinkOne")).isDisplayed()){
        System.out.println("Edit Button One Visible");
    }else{
        System.out.println("Edit Button One Visible");
    }
    
    if( driver.findElement(By.cssSelector("#mfLinkOne")).isEnabled()){
        System.out.println("Edit Button One Enabled");
    }else{
        System.out.println("Edit Button One Enabled");
    }
        
    driver.close();
    driver.quit();
    }
}
