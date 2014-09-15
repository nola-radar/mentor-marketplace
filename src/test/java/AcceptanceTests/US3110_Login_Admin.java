package AcceptanceTests;

import java.io.IOException;
import static junit.framework.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author 212412062
 */
public class US3110_Login_Admin {

    WebDriver driver;
    String baseUrl = "http://localhost:8080/mentormarketplace/";

    /**
     * Starts a new instance of Chromedriver and directs it to Mentor Market
     * Place
     */
    @BeforeClass
    public void setUp() {
        System.out.println("Setting up webdriver");

        //Path to the Chromedriver executable
        System.setProperty("webdriver.chrome.driver", "src/test/java/Webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
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

    /**
     * Test for lgging in as an Administrator for Mentor Marketplace
     *
     * @throws java.lang.InterruptedException
     */
    @Test(groups = {"Login Admin Successful"})
    public void testLoginAdmin() throws InterruptedException {

        //Set up Linkedin Credentials for Admin
        String adminUserName = "ivmmdeveloper@gmail.com";
        String adminPassword = "ideavillage";

        //Log into Mentor Marketplace as admin
        System.out.println("Logging in as admin");
        driver.findElement(By.cssSelector("#registerButtonMiddle")).click();
        driver.findElement(By.id("session_key-oauth2SAuthorizeForm")).sendKeys(adminUserName);
        driver.findElement(By.id("session_password-oauth2SAuthorizeForm")).sendKeys(adminPassword);
        driver.findElement(By.name("authorize")).click();

        //load the admin page
        driver.get(baseUrl + "/admin");

        //verify we're on the admin page
        String adminDashTitle = "Admin Dashboard";
        assertEquals(adminDashTitle, driver.getTitle());
    }

}
