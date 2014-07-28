package AcceptanceTests;

import java.io.IOException;
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

    /**
     * Starts a new instance of Chromedriver and directs it to Mentor Market
     * Place
     */
    @BeforeClass
    public void setUp() {
        System.out.println("Setting up webdriver");

        //Path to the Chromedriver executable
        System.setProperty("webdriver.chrome.driver", "src/test/java/Webdrivers/chromedriver.exe");
        String baseUrl = "http://localhost:8080/mentormarketplace/";
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
    @Test(groups = {"Login Admin"})
    public void testLoginAdmin() throws InterruptedException {
        //Log in to Mentor Marketplace
        //
    }

    }
