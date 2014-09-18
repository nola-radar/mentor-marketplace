package AcceptanceTests;

import java.io.IOException;
import junit.framework.Assert;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
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
public class ProfilePage {

    private static WebDriver driver;
    WebElement element1;
    String baseUrl = "http://localhost:8080/mentormarketplace/";

    /**
     * Starts a new instance of Chromedriver and directs it to Mentor Market Place Note: The current driver file is set
     * to the windows version. Change the path below "src/test/java/Webdrivers/chromedriver.exe" to use a different
     * driver.
     */
    @BeforeClass
    public void setUp() {
        System.out.println("Setting up webdriver");
        //Set the webdriver to use and the path to the webdriver
        System.setProperty("webdriver.chrome.driver", "src/test/java/Webdrivers/chromedriver.exe");
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
    public void testEditProfileOnFounderFirstName() throws Exception {
        logInAcceptanceTestFounder();
        //Click Edit
        driver.findElement(By.id("profileEditButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Wait for the page to load
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstNameEdit")));
        //Verify the starting name of the user
        assertTrue(driver.findElement(By.id("firstNameEdit")).getAttribute("value").contains("Bob"));
        //Clear the name text, add a new name, save it, then verify the name change happened.
        driver.findElement(By.id("firstNameEdit")).clear();
        driver.findElement(By.id("firstNameEdit")).sendKeys("Jim");
        driver.findElement(By.id("editUpdateProfileButton")).click();
        assertTrue(driver.findElement(By.id("profileFullName")).getAttribute("value").contentEquals("Jim Slidell"));
        //Change the name back to it's original value and make sure the change worked
        driver.findElement(By.id("profileEditButton")).click();
        driver.findElement(By.id("firstNameEdit")).clear();
        driver.findElement(By.id("firstNameEdit")).sendKeys("Bob");
        driver.findElement(By.id("editUpdateProfileButton")).click();
        assertTrue(driver.findElement(By.id("profileFullName")).getAttribute("value").contentEquals("Bob Slidell"));
        logOutUser();
    }

    @Test
    public void testEditProfileOnMentorFirstName() throws Exception {
        logInAcceptanceTestMentor();
        //Click Edit
        driver.findElement(By.id("profileEditButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Wait for the page to load
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstNameEdit")));
        //Verify the starting name of the user
        assertTrue(driver.findElement(By.id("firstNameEdit")).getAttribute("value").contains("Gary"));
        //Clear the name text, add a new name, save it, then verify the name change happened.
        driver.findElement(By.id("firstNameEdit")).clear();
        driver.findElement(By.id("firstNameEdit")).sendKeys("Jim");
        driver.findElement(By.id("editUpdateProfileButton")).click();
        assertTrue(driver.findElement(By.id("profileFullName")).getAttribute("value").contentEquals("Jim Busey"));
        //Change the name back to it's original value and make sure the change worked
        driver.findElement(By.id("profileEditButton")).click();
        driver.findElement(By.id("firstNameEdit")).clear();
        driver.findElement(By.id("firstNameEdit")).sendKeys("Gary");
        driver.findElement(By.id("editUpdateProfileButton")).click();
        assertTrue(driver.findElement(By.id("profileFullName")).getAttribute("value").contentEquals("Gary Busey"));
        logOutUser();
    }

    public void logInAcceptanceTestFounder() throws Exception {
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
    }

    public void logInAcceptanceTestMentor() throws Exception {
        //Set up Linkedin Credentials for Admin
        String acceptanceTestUserName = "acceptancetestmentor@gmail.com";
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
    }

    public void logOutUser() throws Exception {
        System.out.println("Logging out the user");
        driver.findElement(By.id("navBarLogOutButton")).click();
        //Set up a wait to use while navigating between pages
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Wait for the page to load
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("indexRegistrationPage")));
    }

}
