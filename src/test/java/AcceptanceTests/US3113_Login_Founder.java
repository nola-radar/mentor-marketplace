package AcceptanceTests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author 212412062
 */
public class US3113_Login_Founder {

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
     * Test for logging in as an Administrator for Mentor Marketplace
     *
     * @throws java.lang.InterruptedException
     */
    @Test(groups = {"Login Founder"})
    public void testLoginAdmin() throws InterruptedException {
        String title;
        //Check to see if we are on the index page        
        title = "Mentor Marketplace";

        assertTrue(title.equals(driver.getTitle()));

        driver.findElement(By.cssSelector("#registerButtonMiddle")).click();

        //Check to see if we are on the LinkedIn authorization page
        title = "Authorize | LinkedIn";
        assertTrue(title.equals(driver.getTitle()));

        //Put your LinkedIn information here for login
        String userName = "foundertestidea@gmail.com";
        String password = "testthefounder1";

        driver.findElement(By.id("session_key-oauth2SAuthorizeForm")).sendKeys(userName);
        driver.findElement(By.id("session_password-oauth2SAuthorizeForm")).sendKeys(password);
        driver.findElement(By.name("authorize")).click();

        //Check to see if we are on the Founder Profile
        title = "Founder Profile";
        System.err.println(driver.getTitle());
        assertTrue(title.equals(driver.getTitle()));
    }
}
