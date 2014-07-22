package com.abc.foo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
    @BeforeClass
    public void setUp() {
      // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "group 1" })
    public void groupOneTest() {
      System.out.println("group 1 test");
    }
    
    /* This is the Mentor Create Test
     * Uncomment Test and right click on 'groupTwoTest'
     * Then click 'test file'
     * Remember to adjust location of the chrome.exe path
     * according to where it is on your local machine
     * Author: Marcus Bischof
    */
    //@Test(groups = { "group 2" })
    public void groupTwoTest() throws InterruptedException {
        
        System.out.println("Mentor Create Test Beginnning");
        
        WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:/Users/212412051/Desktop/chromedriver.exe");
        driver = new ChromeDriver();
       
        driver.get("http://localhost:8080/mentormarketplace/");
        
        if( driver.findElement(By.cssSelector("#indexButton2")).isDisplayed()){
            System.out.println("Mentor Register Visible");
        }else{
            System.out.println("Mentor Register Not Visible");
        }
        
        driver.get("http://localhost:8080/mentormarketplace/mentors/");
        
        System.out.println("Now on mentors/ page");
        
        if ( (driver.findElement(By.cssSelector("#firstFluid > div:nth-child(1) > a > img")).isDisplayed()) && (driver.findElement(By.cssSelector("#firstFluid > div:nth-child(2) > a > img")).isDisplayed()) && (driver.findElement(By.cssSelector("#firstFluid > div:nth-child(1) > a > img")).isDisplayed())) {
            System.out.println("Edits Buttons Visible");
        }else{
            System.out.println("Edit Buttons Not Visible");
        }
        
        if ( (driver.findElement(By.cssSelector("#firstFluid > div:nth-child(1) > a > img")).isEnabled()) && (driver.findElement(By.cssSelector("#firstFluid > div:nth-child(2) > a > img")).isEnabled()) && (driver.findElement(By.cssSelector("#firstFluid > div:nth-child(1) > a > img")).isEnabled())) {
            System.out.println("Edits Buttons Enabled");
        }else{
            System.out.println("Edit Buttons Not Enabled");
        }
        
        if ( driver.findElement(By.cssSelector("#indexButton3")).isDisplayed() ) 
        {
            System.out.println("Log Out Button is Displayed");
        } else {
            System.out.println("Log Out Button is not Displayed");
        }
        
        if ( driver.findElement(By.cssSelector("#indexButton3")).isEnabled() ) 
        {
            System.out.println("Log Out Button is Enabled");
        } else {
            System.out.println("Log Out Button is not Enabled");
        }
        
        if ( driver.findElement(By.cssSelector("#firstFluid > div > button")).isDisplayed() ) 
        {
            System.out.println("Create Profile Button is Displayed");
        } else {
            System.out.println("Create Profile Button is not Displayed");
        }
        
        if ( driver.findElement(By.cssSelector("#firstFluid > div > button")).isEnabled() ) 
        {
            System.out.println("Create Profile Button is Enabled");
        } else {
            System.out.println("Create Profile Button is not Enabled");
        }
        
        driver.findElement(By.cssSelector("#firstFluid > div:first-child > a > img")).click();
        
        System.out.println("Now on mentors/create page");
        
        if (driver.findElement(By.cssSelector("#website")).isDisplayed()) {
            System.out.println("Website form displayed.");
        } else {
            System.out.println("Website form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#facebook")).isDisplayed()) {
            System.out.println("Facebook form displayed.");
        } else {
            System.out.println("Facebook form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#twitter")).isDisplayed()) {
            System.out.println("Twitter form displayed.");
        } else {
            System.out.println("Twitter form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#otherSocialMedia")).isDisplayed()) {
            System.out.println("Other Social Media form displayed.");
        } else {
            System.out.println("Other Social Media form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#firstName")).isDisplayed()) {
            System.out.println("First Name form displayed.");
        } else {
            System.out.println("First Name form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#lastName")).isDisplayed()) {
            System.out.println("Last Name form displayed.");
        } else {
            System.out.println("Last Name form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#linkedInCurrentCompany")).isDisplayed()) {
            System.out.println("Current Company form displayed.");
        } else {
            System.out.println("Current Company form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#linkedInCurrentJobTitle")).isDisplayed()) {
            System.out.println("Current Job Title form displayed.");
        } else {
            System.out.println("Current Job Title form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#linkedInPictureURL")).isDisplayed()) {
            System.out.println("Picture Url form displayed.");
        } else {
            System.out.println("Picture Url form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#background")).isDisplayed()) {
            System.out.println("Background form displayed.");
        } else {
            System.out.println("Background form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#industry")).isDisplayed()) {
            System.out.println("Industry form displayed.");
        } else {
            System.out.println("Industry form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#areasOfExpertise")).isDisplayed()) {
            System.out.println("Expertise form displayed.");
        } else {
            System.out.println("Expertise form not displayed.");
        }
        
        driver.findElement(By.cssSelector("#firstFluid > div > div > button")).click();
        System.out.println("Profile Created and Added to Database Successfully");
        
        driver.get("http://localhost:8080/mentormarketplace/mentors/");
        driver.findElement(By.cssSelector("#indexButton3")).click();
        System.out.println("Logged out of create process successfully.");
        
        Thread.sleep(10000);
        driver.close();
        driver.quit();
        
        // Internet Explorer Test Now
        /*
        System.out.println("Internet Explorer Webdriver Test Begins");
        
        System.setProperty("webdriver.ie.driver", "C:/Users/212412051/Desktop/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("http://localhost:8080/mentormarketplace/");
        
        if( driver.findElement(By.cssSelector("#indexButton2")).isDisplayed()){
            System.out.println("Mentor Register Visible");
        }else{
            System.out.println("Mentor Register Not Visible");
        }
        
        driver.get("http://localhost:8080/mentormarketplace/mentors/");
        
        System.out.println("Now on mentors/ page");
        
        if ( (driver.findElement(By.cssSelector("#firstFluid > div:first-child > a > img")).isDisplayed())) {
            System.out.println("Edits Buttons Visible");
        }else{
            System.out.println("Edit Buttons Not Visible");
        }
        
        if ( (driver.findElement(By.cssSelector("#firstFluid > div:first-child > a > img")).isEnabled())) {
            System.out.println("Edits Buttons Enabled");
        }else{
            System.out.println("Edit Buttons Not Enabled");
        }
        
        if ( driver.findElement(By.cssSelector("#indexButton3")).isDisplayed() ) 
        {
            System.out.println("Log Out Button is Displayed");
        } else {
            System.out.println("Log Out Button is not Displayed");
        }
        
        if ( driver.findElement(By.cssSelector("#indexButton3")).isEnabled() ) 
        {
            System.out.println("Log Out Button is Enabled");
        } else {
            System.out.println("Log Out Button is not Enabled");
        }
        
        if ( driver.findElement(By.cssSelector("#firstFluid > div > button")).isDisplayed() ) 
        {
            System.out.println("Create Profile Button is Displayed");
        } else {
            System.out.println("Create Profile Button is not Displayed");
        }
        
        if ( driver.findElement(By.cssSelector("#firstFluid > div > button")).isEnabled() ) 
        {
            System.out.println("Create Profile Button is Enabled");
        } else {
            System.out.println("Create Profile Button is not Enabled");
        }
        
        driver.findElement(By.cssSelector("#firstFluid > div:first-child > a > img")).click();
        
        System.out.println("Now on mentors/create page");
        
        if (driver.findElement(By.cssSelector("#website")).isDisplayed()) {
            System.out.println("Website form displayed.");
        } else {
            System.out.println("Website form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#facebook")).isDisplayed()) {
            System.out.println("Facebook form displayed.");
        } else {
            System.out.println("Facebook form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#twitter")).isDisplayed()) {
            System.out.println("Twitter form displayed.");
        } else {
            System.out.println("Twitter form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#otherSocialMedia")).isDisplayed()) {
            System.out.println("Other Social Media form displayed.");
        } else {
            System.out.println("Other Social Media form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#firstName")).isDisplayed()) {
            System.out.println("First Name form displayed.");
        } else {
            System.out.println("First Name form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#lastName")).isDisplayed()) {
            System.out.println("Last Name form displayed.");
        } else {
            System.out.println("Last Name form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#linkedInCurrentCompany")).isDisplayed()) {
            System.out.println("Current Company form displayed.");
        } else {
            System.out.println("Current Company form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#linkedInCurrentJobTitle")).isDisplayed()) {
            System.out.println("Current Job Title form displayed.");
        } else {
            System.out.println("Current Job Title form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#linkedInPictureURL")).isDisplayed()) {
            System.out.println("Picture Url form displayed.");
        } else {
            System.out.println("Picture Url form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#background")).isDisplayed()) {
            System.out.println("Background form displayed.");
        } else {
            System.out.println("Background form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#industry")).isDisplayed()) {
            System.out.println("Industry form displayed.");
        } else {
            System.out.println("Industry form not displayed.");
        }
        
        if (driver.findElement(By.cssSelector("#areasOfExpertise")).isDisplayed()) {
            System.out.println("Expertise form displayed.");
        } else {
            System.out.println("Expertise form not displayed.");
        }
        
        driver.findElement(By.cssSelector("#firstFluid > div > div > button")).click();
        System.out.println("Profile Created and Added to Database Successfully");
        
        driver.get("http://localhost:8080/mentormarketplace/mentors/");
        driver.findElement(By.cssSelector("#indexButton")).click();
        System.out.println("Logged out of create process successfully.");
        
        Thread.sleep(10000);
        driver.close();
        driver.quit();
        */
        
    }
}