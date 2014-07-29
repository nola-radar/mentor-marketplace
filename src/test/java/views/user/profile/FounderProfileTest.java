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
    
    @Test
    public void groupOneTest() {
    System.out.println("Founder Profile Test Beginning");
        
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "src/test/java/Webdrivers/chromedriver.exe");
    driver = new ChromeDriver();
    
    driver.get("http://localhost:8080/mentormarketplace/user/founder");
    
    driver.findElement(By.cssSelector("#session_key-oauth2SAuthorizeForm")).sendKeys("foundertestidea@gmail.com");
    driver.findElement(By.cssSelector("#session_password-oauth2SAuthorizeForm")).sendKeys("testthefounder1");
    driver.findElement(By.cssSelector("#body > div > form > div.actions > ul > li:nth-child(1) > input")).click();
    
    if( driver.findElement(By.cssSelector("#mentorNavButton")).isDisplayed()){
        System.out.println("Logout Visible");
    }else{
        System.out.println("Logout Not Visible");
    }
    
    if( driver.findElement(By.cssSelector("#mfLinkOne")).isDisplayed()){
        System.out.println("Edit Button One Visible");
    }else{
        System.out.println("Edit Button One Not Visible");
    }
    
    if( driver.findElement(By.cssSelector("#mfLinkOne")).isEnabled()){
        System.out.println("Edit Button One Enabled");
    }else{
        System.out.println("Edit Button One Not Enabled");
    }
    
    if( driver.findElement(By.cssSelector("#mfLinkTwo")).isDisplayed()){
        System.out.println("Edit Button Two Visible");
    }else{
        System.out.println("Edit Button Two Not Visible");
    }
    
    if( driver.findElement(By.cssSelector("#mfLinkTwo")).isEnabled()){
        System.out.println("Edit Button Two Enabled");
    }else{
        System.out.println("Edit Button Two Not Enabled");
    }
    
    if( driver.findElement(By.cssSelector("#mfContentBottom > a > img")).isDisplayed()){
        System.out.println("Edit Button Three Visible");
    }else{
        System.out.println("Edit Button Three Not Visible");
    }
    
    if( driver.findElement(By.cssSelector("#mfContentBottom > a > img")).isEnabled()){
        System.out.println("Edit Button Three Enabled");
    }else{
        System.out.println("Edit Button Three Not Enabled");
    }
    
    if (driver.findElement(By.cssSelector("#mfImage")).isDisplayed()) {
        System.out.println("Linkedin Image is Displayed");
    } else {
        System.out.println("LInkedin Image is not Displayed");
    }
    
    driver.findElement(By.cssSelector("#mfLinkOne")).click();
    System.out.println("Now on the edit page");
    
    driver.findElement(By.cssSelector("#otherSocialMedia")).sendKeys("testing other social media as example");
    
    if (driver.findElement(By.cssSelector("#firstName")).isDisplayed()) {
        System.out.println("First Name Form is Displayed");
    } else {
        System.out.println("First Name Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#lastName")).isDisplayed()) {
        System.out.println("Last Name Form is Displayed");
    } else {
        System.out.println("Last Name Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#website")).isDisplayed()) {
        System.out.println("Website Form is Displayed");
    } else {
        System.out.println("Website Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#facebook")).isDisplayed()) {
        System.out.println("Facebook Form is Displayed");
    } else {
        System.out.println("Facebook Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#twitter")).isDisplayed()) {
        System.out.println("Twitter Form is Displayed");
    } else {
        System.out.println("Twitter Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#otherSocialMedia")).isDisplayed()) {
        System.out.println("Other Social Media Form is Displayed");
    } else {
        System.out.println("Other Social Media Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#companyDetails")).isDisplayed()) {
        System.out.println("Company Details Form is Displayed");
    } else {
        System.out.println("Company Details Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#inspiration")).isDisplayed()) {
        System.out.println("Inspiration Form is Displayed");
    } else {
        System.out.println("Inspiration Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#logo")).isDisplayed()) {
        System.out.println("Logo Form is Displayed");
    } else {
        System.out.println("Logo Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#tagline")).isDisplayed()) {
        System.out.println("Tagline Form is Displayed");
    } else {
        System.out.println("Tagline Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#elevatorPitch")).isDisplayed()) {
        System.out.println("Elevataor Pitch Form is Displayed");
    } else {
        System.out.println("Elevataor Pitch is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#immediateNeeds")).isDisplayed()) {
        System.out.println("Immediate Needs Form is Displayed");
    } else {
        System.out.println("Immediate Needs Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#status")).isDisplayed()) {
        System.out.println("Status Form is Displayed");
    } else {
        System.out.println("Status Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#vision")).isDisplayed()) {
        System.out.println("Vision Form is Displayed");
    } else {
        System.out.println("Vision Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#newOrleans")).isDisplayed()) {
        System.out.println("New Orleans Form is Displayed");
    } else {
        System.out.println("New Orleans Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#programPlan")).isDisplayed()) {
        System.out.println("Program Form is Displayed");
    } else {
        System.out.println("Program Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#weeklyReports")).isDisplayed()) {
        System.out.println("Weekly Reports Form is Displayed");
    } else {
        System.out.println("Weekly Reports Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#industry")).isDisplayed()) {
        System.out.println("Industry Form is Displayed");
    } else {
        System.out.println("Industry Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#areasOfExpertise")).isDisplayed()) {
        System.out.println("Expertise Form is Displayed");
    } else {
        System.out.println("Expertise Form is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#editUpdateProfileButton")).isDisplayed()) {
        System.out.println("Update Button is Displayed");
    } else {
        System.out.println("Update Button is not Displayed");
    }
    
    if (driver.findElement(By.cssSelector("#editUpdateProfileButton")).isEnabled()) {
        System.out.println("Update Button is Enabled");
    } else {
        System.out.println("Update Button is not Enabled");
    }
    
    driver.findElement(By.cssSelector("#editUpdateProfileButton")).click();
    
    System.out.println("test complete");
        
    driver.close();
    driver.quit();
    }
}
