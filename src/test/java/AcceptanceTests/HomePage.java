package AcceptanceTests;

import java.io.IOException;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author jlbates
 */
public class HomePage {

    private static WebDriver driver;
    String baseUrl = "http://localhost:8080/mentormarketplace/";

    /**
     * Starts a new instance of Chromedriver and directs it to Mentor Market Place 
     * Note: The current driver file is set to the linux version.
     * Change the path to "src/test/java/Webdrivers/chromedriver.exe" to use the Windows driver.
     */
    @BeforeClass
    public void setUp() {
        System.out.println("Setting up webdriver");
        //Set the webdriver to use and the path to the webdriver
        System.setProperty("webdriver.chrome.driver", "src/test/java/Webdrivers/chromedriver");
        driver = new ChromeDriver();
        //Give our newly setup driver the base url for mentor marketplace.  This serves as a
        //launching point for all tests.
        driver.get(baseUrl);
    }

    /**
     * Closes the opened browser after testing is completed
     *
     * @throws IOException
     */
    @AfterClass
    public void closeBrowser() throws IOException {
        driver.quit();
    }
    
    @Test
    public void testlogInAcceptanceTestUser() throws Exception {
        //Set up Linkedin Credentials for Admin
        String acceptanceTestUserName = "acceptancetestuser@gmail.com";
        String acceptanceTestPassword = "qualityassurance";
        //Log into Mentor Marketplace as our acceptance test user
        System.out.println("Logging in as test user");
        driver.findElement(By.id("registrationButton")).click();
        driver.findElement(By.id("session_key-oauth2SAuthorizeForm")).sendKeys(acceptanceTestUserName);
        driver.findElement(By.id("session_password-oauth2SAuthorizeForm")).sendKeys(acceptanceTestPassword);
        driver.findElement(By.name("authorize")).click();
        //Set up a wait to use while navigating between pages
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Wait for the page to load
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("founderProfile")));
        //verify we're viewing the testing profile
        assertTrue(driver.findElement(By.id("founderProfile")).isDisplayed());
    }
    
    @Test
    public void testlogOutUser() throws Exception{
        System.out.println("Logging out the user");
        driver.findElement(By.id("navBarLogOutButton")).click();
                //Set up a wait to use while navigating between pages
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Wait for the page to load
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("indexRegistrationPage")));
        assertTrue(driver.findElement(By.id("indexRegistrationPage")).isDisplayed());
    }

}
