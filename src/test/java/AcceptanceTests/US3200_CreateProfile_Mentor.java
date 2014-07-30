package AcceptanceTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertTrue;
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
public class US3200_CreateProfile_Mentor {

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
        //Selenium will wait for elements up to 10 seconds. 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
     * Test for creating a profile as a mentor in Mentor Marketplace.
     *
     * @throws java.lang.InterruptedException
     */
    @Test(groups = {"Mentor Create Profile"})
    public void testCreateProfileMentor() throws InterruptedException {

        //linkedin account information for our developer account
        System.out.println("Setting up login");
        String username = "ivmmdeveloper@gmail.com";
        String password = "ideavillage";

        //click register button
        System.out.println("finding register button");
        driver.findElement(By.id("indexButton")).click();

        //enter linkedin information and login
        System.out.println("Entering Linkedin");
        driver.findElement(By.id("session_key-oauth2SAuthorizeForm")).sendKeys(username);
        driver.findElement(By.id("session_password-oauth2SAuthorizeForm")).sendKeys(password);
        driver.findElement(By.name("authorize")).click();

        //verify we're on create profile page
        System.out.println("Check profile page");
        String title = "Mentor Register";
        assertTrue(title.equals(driver.getTitle()));

        //select mentor radio button then click submit
        driver.findElement(By.cssSelector("#userTypeB > input[type=\"radio\"]:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#userTypeB > input[type=\"submit\"]:nth-child(3)")).click();

        //enter profile information
        driver.findElement(By.cssSelector("#firstName")).sendKeys("IdeaVillage");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Developer");
        driver.findElement(By.cssSelector("#website")).sendKeys("ideavillage.org");
        driver.findElement(By.cssSelector("#facebook")).sendKeys("facebook.com");
        driver.findElement(By.cssSelector("#twitter")).sendKeys("@example");
        driver.findElement(By.cssSelector("#otherSocialMedia")).sendKeys("test");
        driver.findElement(By.cssSelector("#linkedInCurrentCompany")).sendKeys("Idea Village");
        driver.findElement(By.cssSelector("#linkedInCurrentJobTitle")).sendKeys("Developer");
        driver.findElement(By.cssSelector("#linkedInPictureURL")).sendKeys("http://google.com");
        driver.findElement(By.cssSelector("#background")).sendKeys("I am developing a cool web application");
        driver.findElement(By.cssSelector("#areasOfExpertise")).sendKeys("Web Development");

        //click Create Profile button
        driver.findElement(By.cssSelector("#registrationForm > div.container-fluid > button")).click();

        //ensure we land on created page
        title = "JSP Page";
        assertEquals(title, driver.getTitle());
    }

}
